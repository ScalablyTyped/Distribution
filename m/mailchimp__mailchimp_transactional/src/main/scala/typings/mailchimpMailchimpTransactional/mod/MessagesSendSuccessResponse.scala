package typings.mailchimpMailchimpTransactional.mod

import typings.mailchimpMailchimpTransactional.mailchimpMailchimpTransactionalStrings.rejected
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagesSendSuccessResponse
  extends StObject
     with MessagesSendResponseBase
     with MessagesSendResponse {
  
  /** The sending status of the recipient. */
  @JSName("status")
  var status_MessagesSendSuccessResponse: Exclude[SendingStatus, rejected]
}
object MessagesSendSuccessResponse {
  
  inline def apply(_id: String, email: String, status: Exclude[SendingStatus, rejected]): MessagesSendSuccessResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesSendSuccessResponse]
  }
  
  extension [Self <: MessagesSendSuccessResponse](x: Self) {
    
    inline def setStatus(value: Exclude[SendingStatus, rejected]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
