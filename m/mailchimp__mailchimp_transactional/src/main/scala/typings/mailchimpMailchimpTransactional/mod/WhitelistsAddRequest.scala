package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhitelistsAddRequest
  extends StObject
     with BaseRequest {
  
  /** an optional description of why the email was added to the allowlist */
  var comment: js.UndefOr[String] = js.undefined
  
  /** an email address to add to the allowlist */
  var email: String
}
object WhitelistsAddRequest {
  
  inline def apply(email: String): WhitelistsAddRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitelistsAddRequest]
  }
  
  extension [Self <: WhitelistsAddRequest](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
