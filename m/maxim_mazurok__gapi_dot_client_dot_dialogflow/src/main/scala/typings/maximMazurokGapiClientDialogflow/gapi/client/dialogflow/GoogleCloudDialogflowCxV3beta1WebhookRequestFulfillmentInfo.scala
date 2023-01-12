package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo extends StObject {
  
  /**
    * Always present. The value of the Fulfillment.tag field will be populated in this field by Dialogflow when the associated webhook is called. The tag is typically used by the webhook
    * service to identify which fulfillment is being called, but it could be used for other purposes.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo] (val x: Self) extends AnyVal {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
