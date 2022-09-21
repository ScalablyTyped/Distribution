package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1Fulfillment extends StObject {
  
  /** Conditional cases for this fulfillment. */
  var conditionalCases: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases]] = js.undefined
  
  /** The list of rich message responses to present to the user. */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.undefined
  
  /**
    * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning:
    * 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3
    * partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
    */
  var returnPartialResponses: js.UndefOr[Boolean] = js.undefined
  
  /** Set parameter values before executing the webhook. */
  var setParameterActions: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction]] = js.undefined
  
  /**
    * The value of this field will be populated in the WebhookRequest `fulfillmentInfo.tag` field by Dialogflow when the associated webhook is called. The tag is typically used by the
    * webhook service to identify which fulfillment is being called, but it could be used for other purposes. This field is required if `webhook` is specified.
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /** The webhook to call. Format: `projects//locations//agents//webhooks/`. */
  var webhook: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1Fulfillment {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1Fulfillment]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1Fulfillment](x: Self) {
    
    inline def setConditionalCases(value: js.Array[GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases]): Self = StObject.set(x, "conditionalCases", value.asInstanceOf[js.Any])
    
    inline def setConditionalCasesUndefined: Self = StObject.set(x, "conditionalCases", js.undefined)
    
    inline def setConditionalCasesVarargs(value: GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCases*): Self = StObject.set(x, "conditionalCases", js.Array(value*))
    
    inline def setMessages(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setReturnPartialResponses(value: Boolean): Self = StObject.set(x, "returnPartialResponses", value.asInstanceOf[js.Any])
    
    inline def setReturnPartialResponsesUndefined: Self = StObject.set(x, "returnPartialResponses", js.undefined)
    
    inline def setSetParameterActions(value: js.Array[GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction]): Self = StObject.set(x, "setParameterActions", value.asInstanceOf[js.Any])
    
    inline def setSetParameterActionsUndefined: Self = StObject.set(x, "setParameterActions", js.undefined)
    
    inline def setSetParameterActionsVarargs(value: GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterAction*): Self = StObject.set(x, "setParameterActions", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
