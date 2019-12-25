package com.aeroport.project;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {

	@RequestMapping("/dashboard")
	public String getDashboard() {
		
		return "dashboard";
	}
	
	@RequestMapping("/clients")
	public String getClients() {
		
		return "clients";
	}
	
	@RequestMapping("/reservations")
	public String getReservations() {
		
		return "reservation";
	}
	
	@RequestMapping("/transports")
	public String getTransports() {
		
		return "transports";
	}
	
	@RequestMapping("/chauffeurs")
	public String getChauffeurs() {
		
		return "chauffeurs";
	}
}
