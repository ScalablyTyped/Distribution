package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCustommetricsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Resource name for this CustomMetric resource. Format: properties/{property\}/customMetrics/{customMetric\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaCustomMetric] = js.undefined
  
  /**
    * Required. The list of fields to be updated. Omitted fields will not be updated. To replace the entire entity, use one path with the string "*" to match all fields.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourcePropertiesCustommetricsPatch {
  
  inline def apply(): ParamsResourcePropertiesCustommetricsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCustommetricsPatch]
  }
  
  extension [Self <: ParamsResourcePropertiesCustommetricsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaCustomMetric): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
