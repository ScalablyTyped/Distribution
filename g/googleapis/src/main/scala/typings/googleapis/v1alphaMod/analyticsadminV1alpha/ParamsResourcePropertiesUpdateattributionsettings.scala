package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesUpdateattributionsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Resource name of this attribution settings resource. Format: properties/{property_id\}/attributionSettings Example: "properties/1000/attributionSettings"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaAttributionSettings] = js.undefined
  
  /**
    * Required. The list of fields to be updated. Field names must be in snake case (e.g., "field_to_update"). Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesUpdateattributionsettings {
  
  inline def apply(): ParamsResourcePropertiesUpdateattributionsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesUpdateattributionsettings]
  }
  
  extension [Self <: ParamsResourcePropertiesUpdateattributionsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaAttributionSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
