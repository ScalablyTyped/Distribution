package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse extends StObject {
  
  /** Merge behavior for `messages`. */
  var mergeBehavior: js.UndefOr[String] = js.undefined
  
  /** The list of rich message responses to present to the user. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessage]] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse] (val x: Self) extends AnyVal {
    
    inline def setMergeBehavior(value: String): Self = StObject.set(x, "mergeBehavior", value.asInstanceOf[js.Any])
    
    inline def setMergeBehaviorUndefined: Self = StObject.set(x, "mergeBehavior", js.undefined)
    
    inline def setMessages(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GoogleCloudDialogflowCxV3ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
