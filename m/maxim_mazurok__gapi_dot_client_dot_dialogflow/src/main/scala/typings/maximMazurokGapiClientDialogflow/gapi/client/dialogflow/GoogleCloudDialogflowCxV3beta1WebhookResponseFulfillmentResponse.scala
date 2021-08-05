package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse extends StObject {
  
  /** Merge behavior for `messages`. */
  var mergeBehavior: js.UndefOr[String] = js.undefined
  
  /** The list of rich message responses to present to the user. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1WebhookResponseFulfillmentResponse](x: Self) {
    
    inline def setMergeBehavior(value: String): Self = StObject.set(x, "mergeBehavior", value.asInstanceOf[js.Any])
    
    inline def setMergeBehaviorUndefined: Self = StObject.set(x, "mergeBehavior", js.undefined)
    
    inline def setMessages(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
