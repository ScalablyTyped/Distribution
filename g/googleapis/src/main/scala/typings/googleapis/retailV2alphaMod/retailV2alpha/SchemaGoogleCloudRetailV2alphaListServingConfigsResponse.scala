package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaListServingConfigsResponse extends StObject {
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All the ServingConfigs for a given catalog.
    */
  var servingConfigs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaServingConfig]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaListServingConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaListServingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaListServingConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaListServingConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServingConfigs(value: js.Array[SchemaGoogleCloudRetailV2alphaServingConfig]): Self = StObject.set(x, "servingConfigs", value.asInstanceOf[js.Any])
    
    inline def setServingConfigsUndefined: Self = StObject.set(x, "servingConfigs", js.undefined)
    
    inline def setServingConfigsVarargs(value: SchemaGoogleCloudRetailV2alphaServingConfig*): Self = StObject.set(x, "servingConfigs", js.Array(value*))
  }
}
