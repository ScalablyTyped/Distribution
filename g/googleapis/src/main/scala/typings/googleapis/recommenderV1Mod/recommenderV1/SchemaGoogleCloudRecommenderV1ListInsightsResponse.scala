package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1ListInsightsResponse extends StObject {
  
  /**
    * The set of insights for the `parent` resource.
    */
  var insights: js.UndefOr[js.Array[SchemaGoogleCloudRecommenderV1Insight]] = js.undefined
  
  /**
    * A token that can be used to request the next page of results. This field is empty if there are no additional results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1ListInsightsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1ListInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1ListInsightsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1ListInsightsResponse](x: Self) {
    
    inline def setInsights(value: js.Array[SchemaGoogleCloudRecommenderV1Insight]): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    inline def setInsightsVarargs(value: SchemaGoogleCloudRecommenderV1Insight*): Self = StObject.set(x, "insights", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
