package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountidEmailaddress extends StObject {
  
  var account_id: String
  
  var email_address: String
}
object AccountidEmailaddress {
  
  inline def apply(account_id: String, email_address: String): AccountidEmailaddress = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountidEmailaddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountidEmailaddress] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
  }
}
