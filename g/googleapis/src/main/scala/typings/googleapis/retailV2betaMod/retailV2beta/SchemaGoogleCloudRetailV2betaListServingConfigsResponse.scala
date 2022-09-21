package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaListServingConfigsResponse extends StObject {
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All the ServingConfigs for a given catalog.
    */
  var servingConfigs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaServingConfig]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaListServingConfigsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaListServingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaListServingConfigsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaListServingConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServingConfigs(value: js.Array[SchemaGoogleCloudRetailV2betaServingConfig]): Self = StObject.set(x, "servingConfigs", value.asInstanceOf[js.Any])
    
    inline def setServingConfigsUndefined: Self = StObject.set(x, "servingConfigs", js.undefined)
    
    inline def setServingConfigsVarargs(value: SchemaGoogleCloudRetailV2betaServingConfig*): Self = StObject.set(x, "servingConfigs", js.Array(value*))
  }
}
