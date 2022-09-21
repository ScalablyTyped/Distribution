package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3WebhookResponse extends StObject {
  
  /**
    * The fulfillment response to send to the user. This field can be omitted by the webhook if it does not intend to send any response to the user.
    */
  var fulfillmentResponse: js.UndefOr[SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse] = js.undefined
  
  /**
    * Information about page status. This field can be omitted by the webhook if it does not intend to modify page status.
    */
  var pageInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3PageInfo] = js.undefined
  
  /**
    * Value to append directly to QueryResult.webhook_payloads.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Information about session status. This field can be omitted by the webhook if it does not intend to modify session status.
    */
  var sessionInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3SessionInfo] = js.undefined
  
  /**
    * The target flow to transition to. Format: `projects//locations//agents//flows/`.
    */
  var targetFlow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
    */
  var targetPage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3WebhookResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3WebhookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3WebhookResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3WebhookResponse](x: Self) {
    
    inline def setFulfillmentResponse(value: SchemaGoogleCloudDialogflowCxV3WebhookResponseFulfillmentResponse): Self = StObject.set(x, "fulfillmentResponse", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentResponseUndefined: Self = StObject.set(x, "fulfillmentResponse", js.undefined)
    
    inline def setPageInfo(value: SchemaGoogleCloudDialogflowCxV3PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSessionInfo(value: SchemaGoogleCloudDialogflowCxV3SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setTargetFlow(value: String): Self = StObject.set(x, "targetFlow", value.asInstanceOf[js.Any])
    
    inline def setTargetFlowNull: Self = StObject.set(x, "targetFlow", null)
    
    inline def setTargetFlowUndefined: Self = StObject.set(x, "targetFlow", js.undefined)
    
    inline def setTargetPage(value: String): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    inline def setTargetPageNull: Self = StObject.set(x, "targetPage", null)
    
    inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
  }
}
