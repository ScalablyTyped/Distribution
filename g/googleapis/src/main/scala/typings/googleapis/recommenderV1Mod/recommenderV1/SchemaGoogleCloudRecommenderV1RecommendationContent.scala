package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1RecommendationContent extends StObject {
  
  /**
    * Operations to one or more Google Cloud resources grouped in such a way that, all operations within one group are expected to be performed atomically and in an order.
    */
  var operationGroups: js.UndefOr[js.Array[SchemaGoogleCloudRecommenderV1OperationGroup]] = js.undefined
  
  /**
    * Condensed overview information about the recommendation.
    */
  var overview: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1RecommendationContent {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1RecommendationContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1RecommendationContent]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1RecommendationContent](x: Self) {
    
    inline def setOperationGroups(value: js.Array[SchemaGoogleCloudRecommenderV1OperationGroup]): Self = StObject.set(x, "operationGroups", value.asInstanceOf[js.Any])
    
    inline def setOperationGroupsUndefined: Self = StObject.set(x, "operationGroups", js.undefined)
    
    inline def setOperationGroupsVarargs(value: SchemaGoogleCloudRecommenderV1OperationGroup*): Self = StObject.set(x, "operationGroups", js.Array(value*))
    
    inline def setOverview(value: StringDictionary[Any]): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
  }
}
