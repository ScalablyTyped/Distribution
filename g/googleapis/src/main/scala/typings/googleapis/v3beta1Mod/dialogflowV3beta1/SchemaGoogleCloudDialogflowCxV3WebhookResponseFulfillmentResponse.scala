package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse extends StObject {
  
  /**
    * Merge behavior for `messages`.
    */
  var mergeBehavior: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of rich message responses to present to the user.
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessage]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse](x: Self) {
    
    inline def setMergeBehavior(value: String): Self = StObject.set(x, "mergeBehavior", value.asInstanceOf[js.Any])
    
    inline def setMergeBehaviorNull: Self = StObject.set(x, "mergeBehavior", null)
    
    inline def setMergeBehaviorUndefined: Self = StObject.set(x, "mergeBehavior", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowCxV3ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
