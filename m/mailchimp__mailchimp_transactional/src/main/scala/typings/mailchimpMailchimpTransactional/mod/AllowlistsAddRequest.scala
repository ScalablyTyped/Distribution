package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowlistsAddRequest
  extends StObject
     with BaseRequest {
  
  /** an optional description of why the email was added to the allowlist */
  var comment: js.UndefOr[String] = js.undefined
  
  /** an email address to add to the allowlist */
  var email: String
}
object AllowlistsAddRequest {
  
  inline def apply(email: String): AllowlistsAddRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowlistsAddRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowlistsAddRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
