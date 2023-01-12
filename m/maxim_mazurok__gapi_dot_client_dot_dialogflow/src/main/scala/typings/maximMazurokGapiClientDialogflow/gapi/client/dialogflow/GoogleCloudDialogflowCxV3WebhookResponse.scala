package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookResponse extends StObject {
  
  /** The fulfillment response to send to the user. This field can be omitted by the webhook if it does not intend to send any response to the user. */
  var fulfillmentResponse: js.UndefOr[GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse] = js.undefined
  
  /** Information about page status. This field can be omitted by the webhook if it does not intend to modify page status. */
  var pageInfo: js.UndefOr[GoogleCloudDialogflowCxV3PageInfo] = js.undefined
  
  /** Value to append directly to QueryResult.webhook_payloads. */
  var payload: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Information about session status. This field can be omitted by the webhook if it does not intend to modify session status. */
  var sessionInfo: js.UndefOr[GoogleCloudDialogflowCxV3SessionInfo] = js.undefined
  
  /** The target flow to transition to. Format: `projects//locations//agents//flows/`. */
  var targetFlow: js.UndefOr[String] = js.undefined
  
  /** The target page to transition to. Format: `projects//locations//agents//flows//pages/`. */
  var targetPage: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3WebhookResponse] (val x: Self) extends AnyVal {
    
    inline def setFulfillmentResponse(value: GoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse): Self = StObject.set(x, "fulfillmentResponse", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentResponseUndefined: Self = StObject.set(x, "fulfillmentResponse", js.undefined)
    
    inline def setPageInfo(value: GoogleCloudDialogflowCxV3PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPayload(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSessionInfo(value: GoogleCloudDialogflowCxV3SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setTargetFlow(value: String): Self = StObject.set(x, "targetFlow", value.asInstanceOf[js.Any])
    
    inline def setTargetFlowUndefined: Self = StObject.set(x, "targetFlow", js.undefined)
    
    inline def setTargetPage(value: String): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
  }
}
