package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAllResourcesResponse extends js.Object {
  
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
  implicit class SearchAllResourcesResponseOps[Self <: SearchAllResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: ResourceSearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[ResourceSearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
