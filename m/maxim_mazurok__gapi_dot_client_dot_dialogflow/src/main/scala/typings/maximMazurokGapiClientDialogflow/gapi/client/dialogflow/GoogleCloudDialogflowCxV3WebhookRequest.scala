package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3WebhookRequest extends js.Object {
  
  /** Always present. The unique identifier of the DetectIntentResponse that will be returned to the API caller. */
  var detectIntentResponseId: js.UndefOr[String] = js.native
  
  /** Always present. Information about the fulfillment that triggered this webhook call. */
  var fulfillmentInfo: js.UndefOr[GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo] = js.native
  
  /** Information about the last matched intent. */
  var intentInfo: js.UndefOr[GoogleCloudDialogflowCxV3WebhookRequestIntentInfo] = js.native
  
  /** The list of rich message responses to present to the user. Webhook can choose to append or replace this list in WebhookResponse.fulfillment_response; */
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessage]] = js.native
  
  /** Information about page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3PageInfo] = js.native
  
  /** Custom data set in QueryParameters.payload. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Information about session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3SessionInfo] = js.native
}
object GoogleCloudDialogflowCxV3WebhookRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookRequestOps[Self <: GoogleCloudDialogflowCxV3WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectIntentResponseId(value: String): Self = this.set("detectIntentResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectIntentResponseId: Self = this.set("detectIntentResponseId", js.undefined)
    
    @scala.inline
    def setFulfillmentInfo(value: GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo): Self = this.set("fulfillmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentInfo: Self = this.set("fulfillmentInfo", js.undefined)
    
    @scala.inline
    def setIntentInfo(value: GoogleCloudDialogflowCxV3WebhookRequestIntentInfo): Self = this.set("intentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentInfo: Self = this.set("intentInfo", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GoogleCloudDialogflowCxV3ResponseMessage*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setPageInfo(value: GoogleCloudDialogflowCxV3PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequest with TopLevel[js.Any]
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setSessionInfo(value: GoogleCloudDialogflowCxV3SessionInfo): Self = this.set("sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionInfo: Self = this.set("sessionInfo", js.undefined)
  }
}
