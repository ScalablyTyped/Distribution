package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse extends StObject {
  
  /** Merge behavior for `messages`. */
  var mergeBehavior: js.UndefOr[String] = js.native
  
  /** The list of rich message responses to present to the user. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.native
}
object GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponseMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeBehavior(value: String): Self = StObject.set(x, "mergeBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeBehaviorUndefined: Self = StObject.set(x, "mergeBehavior", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
