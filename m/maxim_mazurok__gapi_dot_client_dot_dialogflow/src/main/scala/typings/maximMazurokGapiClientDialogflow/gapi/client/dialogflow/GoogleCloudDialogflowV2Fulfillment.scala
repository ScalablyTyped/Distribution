package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2Fulfillment extends StObject {
  
  /** Optional. The human-readable name of the fulfillment, unique within the agent. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. Whether fulfillment is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The field defines whether the fulfillment is enabled for certain features. */
  var features: js.UndefOr[js.Array[GoogleCloudDialogflowV2FulfillmentFeature]] = js.undefined
  
  /** Configuration for a generic web service. */
  var genericWebService: js.UndefOr[GoogleCloudDialogflowV2FulfillmentGenericWebService] = js.undefined
  
  /** Required. The unique identifier of the fulfillment. Format: `projects//agent/fulfillment`. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2Fulfillment {
  
  inline def apply(): GoogleCloudDialogflowV2Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Fulfillment]
  }
  
  extension [Self <: GoogleCloudDialogflowV2Fulfillment](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFeatures(value: js.Array[GoogleCloudDialogflowV2FulfillmentFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: GoogleCloudDialogflowV2FulfillmentFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setGenericWebService(value: GoogleCloudDialogflowV2FulfillmentGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
