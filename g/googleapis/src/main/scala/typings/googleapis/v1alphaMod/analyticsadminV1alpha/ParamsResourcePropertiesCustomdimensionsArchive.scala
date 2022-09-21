package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCustomdimensionsArchive
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the CustomDimension to archive. Example format: properties/1234/customDimensions/5678
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaArchiveCustomDimensionRequest] = js.undefined
}
object ParamsResourcePropertiesCustomdimensionsArchive {
  
  inline def apply(): ParamsResourcePropertiesCustomdimensionsArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCustomdimensionsArchive]
  }
  
  extension [Self <: ParamsResourcePropertiesCustomdimensionsArchive](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaArchiveCustomDimensionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
