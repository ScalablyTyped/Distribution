package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo extends StObject {
  
  /** Always present. The tag used to identify which fulfillment is being called. */
  var tag: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
