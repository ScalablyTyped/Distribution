package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3WebhookResponse extends js.Object {
  
  /** The fulfillment response to send to the user. This field can be omitted by the webhook if it does not intend to send any response to the user. */
  var fulfillmentResponse: js.UndefOr[GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse] = js.native
  
  /** Information about page status. This field can be omitted by the webhook if it does not intend to modify page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3PageInfo] = js.native
  
  /** Value to append directly to QueryResult.webhook_payloads. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookResponse with TopLevel[js.Any]
  ] = js.native
  
  /** Information about session status. This field can be omitted by the webhook if it does not intend to modify session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3SessionInfo] = js.native
  
  /** The target flow to transition to. Format: `projects//locations//agents//flows/`. */
  var targetFlow: js.UndefOr[String] = js.native
  
  /** The target page to transition to. Format: `projects//locations//agents//flows//pages/`. */
  var targetPage: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3WebhookResponse {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookResponseOps[Self <: GoogleCloudDialogflowCxV3WebhookResponse] (val x: Self) extends AnyVal {
    
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
    def setFulfillmentResponse(value: GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse): Self = this.set("fulfillmentResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentResponse: Self = this.set("fulfillmentResponse", js.undefined)
    
    @scala.inline
    def setPageInfo(value: GoogleCloudDialogflowCxV3PageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookResponse with TopLevel[js.Any]
    ): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setSessionInfo(value: GoogleCloudDialogflowCxV3SessionInfo): Self = this.set("sessionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionInfo: Self = this.set("sessionInfo", js.undefined)
    
    @scala.inline
    def setTargetFlow(value: String): Self = this.set("targetFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetFlow: Self = this.set("targetFlow", js.undefined)
    
    @scala.inline
    def setTargetPage(value: String): Self = this.set("targetPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPage: Self = this.set("targetPage", js.undefined)
  }
}
