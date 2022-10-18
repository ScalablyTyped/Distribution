package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Islocked extends StObject {
  
  var account_id: String
  
  var email_address: String
  
  var is_locked: Boolean
  
  var role_code: String
}
object Islocked {
  
  inline def apply(account_id: String, email_address: String, is_locked: Boolean, role_code: String): Islocked = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], is_locked = is_locked.asInstanceOf[js.Any], role_code = role_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Islocked]
  }
  
  extension [Self <: Islocked](x: Self) {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setIs_locked(value: Boolean): Self = StObject.set(x, "is_locked", value.asInstanceOf[js.Any])
    
    inline def setRole_code(value: String): Self = StObject.set(x, "role_code", value.asInstanceOf[js.Any])
  }
}
