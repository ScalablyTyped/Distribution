package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  new_owner_email_address :string | undefined} & hellosign-sdk.hellosign-sdk.AccountIdOrEmailRequestOptions */
trait newowneremailaddressstrin extends StObject {
  
  var account_id: String
  
  var email_address: String
  
  var new_owner_email_address: js.UndefOr[String] = js.undefined
}
object newowneremailaddressstrin {
  
  inline def apply(account_id: String, email_address: String): newowneremailaddressstrin = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any])
    __obj.asInstanceOf[newowneremailaddressstrin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: newowneremailaddressstrin] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setNew_owner_email_address(value: String): Self = StObject.set(x, "new_owner_email_address", value.asInstanceOf[js.Any])
    
    inline def setNew_owner_email_addressUndefined: Self = StObject.set(x, "new_owner_email_address", js.undefined)
  }
}
