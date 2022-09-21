package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration extends StObject {
  
  /**
    * The API key.
    */
  var apiKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyNull: Self = StObject.set(x, "apiKey", null)
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
  }
}
