package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2FulfillmentFeature extends StObject {
  
  /** The type of the feature that enabled for fulfillment. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2FulfillmentFeature {
  
  inline def apply(): GoogleCloudDialogflowV2FulfillmentFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2FulfillmentFeature]
  }
  
  extension [Self <: GoogleCloudDialogflowV2FulfillmentFeature](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
