package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Apisignaturerequestsleft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account
  extends StObject
     with BaseAccount {
  
  var callback_url: String
  
  var role_code: String
}
object Account {
  
  inline def apply(
    account_id: String,
    callback_url: String,
    email_address: String,
    is_locked: Boolean,
    is_paid_hf: Boolean,
    is_paid_hs: Boolean,
    quotas: Apisignaturerequestsleft,
    role_code: String
  ): Account = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], callback_url = callback_url.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], is_locked = is_locked.asInstanceOf[js.Any], is_paid_hf = is_paid_hf.asInstanceOf[js.Any], is_paid_hs = is_paid_hs.asInstanceOf[js.Any], quotas = quotas.asInstanceOf[js.Any], role_code = role_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setCallback_url(value: String): Self = StObject.set(x, "callback_url", value.asInstanceOf[js.Any])
    
    inline def setRole_code(value: String): Self = StObject.set(x, "role_code", value.asInstanceOf[js.Any])
  }
}
