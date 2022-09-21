package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Echoes the destination for the complete errors in the request if set.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ImportCatalogItemsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
  }
}
