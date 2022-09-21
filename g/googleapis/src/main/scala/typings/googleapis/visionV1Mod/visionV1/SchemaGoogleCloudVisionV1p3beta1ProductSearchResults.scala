package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p3beta1ProductSearchResults extends StObject {
  
  /**
    * Timestamp of the index which provided these results. Products added to the product set and products removed from the product set after this time are not reflected in the current results.
    */
  var indexTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of results grouped by products detected in the query image. Each entry corresponds to one bounding polygon in the query image, and contains the matching products specific to that region. There may be duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]] = js.undefined
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult]] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1ProductSearchResults {
  
  inline def apply(): SchemaGoogleCloudVisionV1p3beta1ProductSearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ProductSearchResults]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p3beta1ProductSearchResults](x: Self) {
    
    inline def setIndexTime(value: String): Self = StObject.set(x, "indexTime", value.asInstanceOf[js.Any])
    
    inline def setIndexTimeNull: Self = StObject.set(x, "indexTime", null)
    
    inline def setIndexTimeUndefined: Self = StObject.set(x, "indexTime", js.undefined)
    
    inline def setProductGroupedResults(value: js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]): Self = StObject.set(x, "productGroupedResults", value.asInstanceOf[js.Any])
    
    inline def setProductGroupedResultsUndefined: Self = StObject.set(x, "productGroupedResults", js.undefined)
    
    inline def setProductGroupedResultsVarargs(value: SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult*): Self = StObject.set(x, "productGroupedResults", js.Array(value*))
    
    inline def setResults(value: js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
