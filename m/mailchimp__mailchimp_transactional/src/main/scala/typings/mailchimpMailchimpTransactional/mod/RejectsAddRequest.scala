package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectsAddRequest
  extends StObject
     with BaseRequest {
  
  /** an optional comment describing the rejection */
  var comment: js.UndefOr[String] = js.undefined
  
  /** an email address to block */
  var email: String
  
  /** an optional unique identifier for the subaccount to limit the denylist entry */
  var subaccount: js.UndefOr[String] = js.undefined
}
object RejectsAddRequest {
  
  inline def apply(email: String): RejectsAddRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectsAddRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectsAddRequest] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setSubaccount(value: String): Self = StObject.set(x, "subaccount", value.asInstanceOf[js.Any])
    
    inline def setSubaccountUndefined: Self = StObject.set(x, "subaccount", js.undefined)
  }
}
