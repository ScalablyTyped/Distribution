package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo extends StObject {
  
  /**
    * Always present. The value of the Fulfillment.tag field will be populated in this field by Dialogflow when the associated webhook is called. The tag is typically used by the webhook service to identify which fulfillment is being called, but it could be used for other purposes.
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
