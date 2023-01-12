package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Apisignaturerequestsleft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAccount extends StObject {
  
  var account_id: String
  
  var email_address: String
  
  var is_locked: Boolean
  
  var is_paid_hf: Boolean
  
  var is_paid_hs: Boolean
  
  var quotas: Apisignaturerequestsleft
}
object BaseAccount {
  
  inline def apply(
    account_id: String,
    email_address: String,
    is_locked: Boolean,
    is_paid_hf: Boolean,
    is_paid_hs: Boolean,
    quotas: Apisignaturerequestsleft
  ): BaseAccount = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], is_locked = is_locked.asInstanceOf[js.Any], is_paid_hf = is_paid_hf.asInstanceOf[js.Any], is_paid_hs = is_paid_hs.asInstanceOf[js.Any], quotas = quotas.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseAccount] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setIs_locked(value: Boolean): Self = StObject.set(x, "is_locked", value.asInstanceOf[js.Any])
    
    inline def setIs_paid_hf(value: Boolean): Self = StObject.set(x, "is_paid_hf", value.asInstanceOf[js.Any])
    
    inline def setIs_paid_hs(value: Boolean): Self = StObject.set(x, "is_paid_hs", value.asInstanceOf[js.Any])
    
    inline def setQuotas(value: Apisignaturerequestsleft): Self = StObject.set(x, "quotas", value.asInstanceOf[js.Any])
  }
}
