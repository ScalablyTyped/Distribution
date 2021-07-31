package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1WebhookRequest extends StObject {
  
  /** Always present. The unique identifier of the DetectIntentResponse that will be returned to the API caller. */
  var detectIntentResponseId: js.UndefOr[String] = js.undefined
  
  /** Always present. Information about the fulfillment that triggered this webhook call. */
  var fulfillmentInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo] = js.undefined
  
  /** Information about the last matched intent. */
  var intentInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo] = js.undefined
  
  /** The list of rich message responses to present to the user. Webhook can choose to append or replace this list in WebhookResponse.fulfillment_response; */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.undefined
  
  /** Information about page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1PageInfo] = js.undefined
  
  /** Custom data set in QueryParameters.payload. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1WebhookRequest & TopLevel[js.Any]
  ] = js.undefined
  
  /** Information about session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3beta1SessionInfo] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1WebhookRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookRequestMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectIntentResponseId(value: String): Self = StObject.set(x, "detectIntentResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectIntentResponseIdUndefined: Self = StObject.set(x, "detectIntentResponseId", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setIntentInfo(value: GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo): Self = StObject.set(x, "intentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentInfoUndefined: Self = StObject.set(x, "intentInfo", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setPageInfo(value: GoogleCloudDialogflowCxV3beta1PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3beta1WebhookRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setSessionInfo(value: GoogleCloudDialogflowCxV3beta1SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
