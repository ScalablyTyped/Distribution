package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1RecommendationInsightReference extends StObject {
  
  /**
    * Insight resource name, e.g. projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/insights/[INSIGHT_ID]
    */
  var insight: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1RecommendationInsightReference {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1RecommendationInsightReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1RecommendationInsightReference]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1RecommendationInsightReference](x: Self) {
    
    inline def setInsight(value: String): Self = StObject.set(x, "insight", value.asInstanceOf[js.Any])
    
    inline def setInsightNull: Self = StObject.set(x, "insight", null)
    
    inline def setInsightUndefined: Self = StObject.set(x, "insight", js.undefined)
  }
}
