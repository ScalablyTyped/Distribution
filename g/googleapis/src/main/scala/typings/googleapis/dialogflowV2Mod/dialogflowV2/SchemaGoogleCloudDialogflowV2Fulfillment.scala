package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2Fulfillment extends StObject {
  
  /**
    * Optional. The human-readable name of the fulfillment, unique within the agent. This field is not used for Fulfillment in an Environment.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether fulfillment is enabled.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The field defines whether the fulfillment is enabled for certain features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2FulfillmentFeature]] = js.undefined
  
  /**
    * Configuration for a generic web service.
    */
  var genericWebService: js.UndefOr[SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService] = js.undefined
  
  /**
    * Required. The unique identifier of the fulfillment. Supported formats: - `projects//agent/fulfillment` - `projects//locations//agent/fulfillment` This field is not used for Fulfillment in an Environment.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2Fulfillment {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2Fulfillment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2Fulfillment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2Fulfillment](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFeatures(value: js.Array[SchemaGoogleCloudDialogflowV2FulfillmentFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: SchemaGoogleCloudDialogflowV2FulfillmentFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setGenericWebService(value: SchemaGoogleCloudDialogflowV2FulfillmentGenericWebService): Self = StObject.set(x, "genericWebService", value.asInstanceOf[js.Any])
    
    inline def setGenericWebServiceUndefined: Self = StObject.set(x, "genericWebService", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
