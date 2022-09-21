package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse extends StObject {
  
  /**
    * A token that can be used to request the next page of results. This field is empty if there are no additional results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of recommendations for the `parent` resource.
    */
  var recommendations: js.UndefOr[js.Array[SchemaGoogleCloudRecommenderV1beta1Recommendation]] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1ListRecommendationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRecommendations(value: js.Array[SchemaGoogleCloudRecommenderV1beta1Recommendation]): Self = StObject.set(x, "recommendations", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsUndefined: Self = StObject.set(x, "recommendations", js.undefined)
    
    inline def setRecommendationsVarargs(value: SchemaGoogleCloudRecommenderV1beta1Recommendation*): Self = StObject.set(x, "recommendations", js.Array(value*))
  }
}
