package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookRequest extends StObject {
  
  /** Always present. The unique identifier of the DetectIntentResponse that will be returned to the API caller. */
  var detectIntentResponseId: js.UndefOr[String] = js.undefined
  
  /** Always present. Information about the fulfillment that triggered this webhook call. */
  var fulfillmentInfo: js.UndefOr[GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo] = js.undefined
  
  /** Information about the last matched intent. */
  var intentInfo: js.UndefOr[GoogleCloudDialogflowCxV3WebhookRequestIntentInfo] = js.undefined
  
  /** The list of rich message responses to present to the user. Webhook can choose to append or replace this list in WebhookResponse.fulfillment_response; */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessage]] = js.undefined
  
  /** Information about page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3PageInfo] = js.undefined
  
  /** Custom data set in QueryParameters.payload. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequest & TopLevel[js.Any]
  ] = js.undefined
  
  /** Information about session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3SessionInfo] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3WebhookRequest](x: Self) {
    
    inline def setDetectIntentResponseId(value: String): Self = StObject.set(x, "detectIntentResponseId", value.asInstanceOf[js.Any])
    
    inline def setDetectIntentResponseIdUndefined: Self = StObject.set(x, "detectIntentResponseId", js.undefined)
    
    inline def setFulfillmentInfo(value: GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    inline def setIntentInfo(value: GoogleCloudDialogflowCxV3WebhookRequestIntentInfo): Self = StObject.set(x, "intentInfo", value.asInstanceOf[js.Any])
    
    inline def setIntentInfoUndefined: Self = StObject.set(x, "intentInfo", js.undefined)
    
    inline def setMessages(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GoogleCloudDialogflowCxV3ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setPageInfo(value: GoogleCloudDialogflowCxV3PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSessionInfo(value: GoogleCloudDialogflowCxV3SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
