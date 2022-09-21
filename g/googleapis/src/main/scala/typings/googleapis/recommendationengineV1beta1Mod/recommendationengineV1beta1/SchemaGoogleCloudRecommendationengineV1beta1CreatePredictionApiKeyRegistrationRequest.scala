package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest extends StObject {
  
  /**
    * Required. The prediction API key registration.
    */
  var predictionApiKeyRegistration: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest](x: Self) {
    
    inline def setPredictionApiKeyRegistration(value: SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration): Self = StObject.set(x, "predictionApiKeyRegistration", value.asInstanceOf[js.Any])
    
    inline def setPredictionApiKeyRegistrationUndefined: Self = StObject.set(x, "predictionApiKeyRegistration", js.undefined)
  }
}
