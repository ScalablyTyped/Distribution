package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendRejectResponse
  extends StObject
     with MessagesSendResponseBase
     with MessagesSendResponse {
  
  /** The reason for the rejection if the recipient status is "rejected". */
  @JSName("reject_reason")
  var reject_reason_MessagesSendRejectResponse: RejectReason
  
  /** The sending status of the recipient. */
  @JSName("status")
  var status_MessagesSendRejectResponse: rejected
}
object MessagesSendRejectResponse {
  
  inline def apply(_id: String, email: String, reject_reason: RejectReason): MessagesSendRejectResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reject_reason = reject_reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[MessagesSendRejectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagesSendRejectResponse] (val x: Self) extends AnyVal {
    
    inline def setReject_reason(value: RejectReason): Self = StObject.set(x, "reject_reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
