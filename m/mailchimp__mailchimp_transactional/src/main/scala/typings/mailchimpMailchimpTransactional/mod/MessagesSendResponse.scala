package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of objects for each recipient containing the key "email" with the email address,
  * and details of the message status for that recipient
  */
/* Rewritten from type alias, can be one of: 
  - typings.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse
  - typings.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse
*/
trait MessagesSendResponse extends StObject
object MessagesSendResponse {
  
  inline def MessagesSendRejectResponse(_id: String, email: String, reject_reason: RejectReason): typings.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reject_reason = reject_reason.asInstanceOf[js.Any], status = "rejected")
    __obj.asInstanceOf[typings.mailchimpMailchimpTransactional.mod.MessagesSendRejectResponse]
  }
  
  inline def MessagesSendSuccessResponse(_id: String, email: String, status: Exclude[SendingStatus, rejected]): typings.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mailchimpMailchimpTransactional.mod.MessagesSendSuccessResponse]
  }
}
