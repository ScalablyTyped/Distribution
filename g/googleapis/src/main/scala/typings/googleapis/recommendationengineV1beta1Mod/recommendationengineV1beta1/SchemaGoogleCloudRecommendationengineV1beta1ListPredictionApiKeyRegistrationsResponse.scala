package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse extends StObject {
  
  /**
    * If empty, the list is complete. If nonempty, pass the token to the next request's `ListPredictionApiKeysRegistrationsRequest.pageToken`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of registered API keys.
    */
  var predictionApiKeyRegistrations: js.UndefOr[
    js.Array[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  ] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPredictionApiKeyRegistrations(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]): Self = StObject.set(x, "predictionApiKeyRegistrations", value.asInstanceOf[js.Any])
    
    inline def setPredictionApiKeyRegistrationsUndefined: Self = StObject.set(x, "predictionApiKeyRegistrations", js.undefined)
    
    inline def setPredictionApiKeyRegistrationsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration*): Self = StObject.set(x, "predictionApiKeyRegistrations", js.Array(value*))
  }
}
