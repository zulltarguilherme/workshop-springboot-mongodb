package com.guilherme.workshopmongo.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.workshopmongo.domain.User;
import com.guilherme.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResourse {
	
	@Autowired
	private UserService service;
	
	
	@RequestMapping(method=RequestMethod.GET) //or @GetMapping
	public ResponseEntity<List<User>>findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}