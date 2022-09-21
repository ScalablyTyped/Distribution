package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PredictResponse extends StObject {
  
  /**
    * True if the dryRun property was set in the request.
    */
  var dryRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * IDs of items in the request that were missing from the catalog.
    */
  var itemsMissingInCatalog: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Additional domain specific prediction response metadata.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * If empty, the list is complete. If nonempty, the token to pass to the next request's PredictRequest.page_token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique recommendation token. This should be included in the user event logs resulting from this recommendation, which enables accurate attribution of recommendation model performance.
    */
  var recommendationToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of recommended items. The order represents the ranking (from the most relevant item to the least).
    */
  var results: js.UndefOr[
    js.Array[SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]
  ] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PredictResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PredictResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PredictResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PredictResponse](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunNull: Self = StObject.set(x, "dryRun", null)
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setItemsMissingInCatalog(value: js.Array[String]): Self = StObject.set(x, "itemsMissingInCatalog", value.asInstanceOf[js.Any])
    
    inline def setItemsMissingInCatalogNull: Self = StObject.set(x, "itemsMissingInCatalog", null)
    
    inline def setItemsMissingInCatalogUndefined: Self = StObject.set(x, "itemsMissingInCatalog", js.undefined)
    
    inline def setItemsMissingInCatalogVarargs(value: String*): Self = StObject.set(x, "itemsMissingInCatalog", js.Array(value*))
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRecommendationToken(value: String): Self = StObject.set(x, "recommendationToken", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTokenNull: Self = StObject.set(x, "recommendationToken", null)
    
    inline def setRecommendationTokenUndefined: Self = StObject.set(x, "recommendationToken", js.undefined)
    
    inline def setResults(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
