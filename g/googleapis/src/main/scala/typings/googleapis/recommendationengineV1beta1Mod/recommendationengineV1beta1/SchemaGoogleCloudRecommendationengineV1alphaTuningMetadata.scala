package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1alphaTuningMetadata extends StObject {
  
  /**
    * The resource name of the recommendation model that this tune applies to. Format: projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/eventStores/{event_store_id\}/recommendationModels/{recommendation_model_id\}
    */
  var recommendationModel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1alphaTuningMetadata {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1alphaTuningMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1alphaTuningMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1alphaTuningMetadata](x: Self) {
    
    inline def setRecommendationModel(value: String): Self = StObject.set(x, "recommendationModel", value.asInstanceOf[js.Any])
    
    inline def setRecommendationModelNull: Self = StObject.set(x, "recommendationModel", null)
    
    inline def setRecommendationModelUndefined: Self = StObject.set(x, "recommendationModel", js.undefined)
  }
}
