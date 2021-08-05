package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAllResourcesResponse extends StObject {
  
  /**
    * If there are more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of
    * `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of Resources that match the search query. It contains the resource standard metadata information. */
  var results: js.UndefOr[js.Array[ResourceSearchResult]] = js.undefined
}
object SearchAllResourcesResponse {
  
  inline def apply(): SearchAllResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAllResourcesResponse]
  }
  
  extension [Self <: SearchAllResourcesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[ResourceSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: ResourceSearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
