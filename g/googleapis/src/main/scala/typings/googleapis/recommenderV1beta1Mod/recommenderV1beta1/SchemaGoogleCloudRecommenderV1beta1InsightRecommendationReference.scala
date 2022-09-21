package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference extends StObject {
  
  /**
    * Recommendation resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/recommendations/[RECOMMENDATION_ID]
    */
  var recommendation: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1InsightRecommendationReference](x: Self) {
    
    inline def setRecommendation(value: String): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationNull: Self = StObject.set(x, "recommendation", null)
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
  }
}
