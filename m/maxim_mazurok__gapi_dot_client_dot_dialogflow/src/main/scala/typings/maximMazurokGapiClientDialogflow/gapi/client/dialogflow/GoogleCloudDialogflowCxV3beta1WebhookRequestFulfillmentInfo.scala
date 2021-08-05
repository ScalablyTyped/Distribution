package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo extends StObject {
  
  /** Always present. The tag used to identify which fulfillment is being called. */
  var tag: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
