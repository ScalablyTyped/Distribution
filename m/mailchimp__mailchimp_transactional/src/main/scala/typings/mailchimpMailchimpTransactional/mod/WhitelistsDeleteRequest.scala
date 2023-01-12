package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistsDeleteRequest
  extends StObject
     with BaseRequest {
  
  /** the email address to remove from the allowlist */
  var email: String
}
object WhitelistsDeleteRequest {
  
  inline def apply(email: String): WhitelistsDeleteRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistsDeleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhitelistsDeleteRequest] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
