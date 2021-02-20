package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAllResourcesResponse extends StObject {
  
  /**
    * If there are more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of
    * `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of Resources that match the search query. It contains the resource standard metadata information. */
  var results: js.UndefOr[js.Array[ResourceSearchResult]] = js.native
}
object SearchAllResourcesResponse {
  
  @scala.inline
  def apply(): SearchAllResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAllResourcesResponse]
  }
  
  @scala.inline
  implicit class SearchAllResourcesResponseMutableBuilder[Self <: SearchAllResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[ResourceSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ResourceSearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
