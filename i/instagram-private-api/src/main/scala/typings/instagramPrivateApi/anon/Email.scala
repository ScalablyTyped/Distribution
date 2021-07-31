package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.Any
  
  var first_name: js.Any
  
  var password: js.Any
  
  var username: js.Any
}
object Email {
  
  @scala.inline
  def apply(email: js.Any, first_name: js.Any, password: js.Any, username: js.Any): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: js.Any): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_name(value: js.Any): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: js.Any): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: js.Any): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
