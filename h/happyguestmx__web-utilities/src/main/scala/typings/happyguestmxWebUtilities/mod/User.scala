package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var company_uuid: String
  
  var email: String
  
  var employee_number: String
  
  var enabled: String
  
  var hotel_uuids: String
  
  var last_name: String
  
  var locale: String
  
  var name: String
  
  var notifications: String
  
  var picture: String
  
  var role_key: String
  
  var status: String
  
  var updated_at: String
  
  var uuid: String
}
object User {
  
  inline def apply(
    company_uuid: String,
    email: String,
    employee_number: String,
    enabled: String,
    hotel_uuids: String,
    last_name: String,
    locale: String,
    name: String,
    notifications: String,
    picture: String,
    role_key: String,
    status: String,
    updated_at: String,
    uuid: String
  ): User = {
    val __obj = js.Dynamic.literal(company_uuid = company_uuid.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], employee_number = employee_number.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hotel_uuids = hotel_uuids.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], role_key = role_key.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setCompany_uuid(value: String): Self = StObject.set(x, "company_uuid", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmployee_number(value: String): Self = StObject.set(x, "employee_number", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHotel_uuids(value: String): Self = StObject.set(x, "hotel_uuids", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: String): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setRole_key(value: String): Self = StObject.set(x, "role_key", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
