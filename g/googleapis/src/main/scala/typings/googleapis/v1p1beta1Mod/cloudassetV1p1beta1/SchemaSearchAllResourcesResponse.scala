package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchAllResourcesResponse extends StObject {
  
  /**
    * If there are more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of resource that match the search query.
    */
  var results: js.UndefOr[js.Array[SchemaStandardResourceMetadata]] = js.undefined
}
object SchemaSearchAllResourcesResponse {
  
  inline def apply(): SchemaSearchAllResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAllResourcesResponse]
  }
  
  extension [Self <: SchemaSearchAllResourcesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[SchemaStandardResourceMetadata]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaStandardResourceMetadata*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
