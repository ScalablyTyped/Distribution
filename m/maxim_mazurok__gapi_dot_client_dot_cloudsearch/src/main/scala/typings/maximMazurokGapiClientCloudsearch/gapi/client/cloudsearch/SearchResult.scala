package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  /**
    * If source is clustered, provide list of clustered results. There will only be one level of clustered results. If current source is not enabled for clustering, this field will be
    * empty.
    */
  var clusteredResults: js.UndefOr[js.Array[SearchResult]] = js.native
  
  /** Debugging information about this search result. */
  var debugInfo: js.UndefOr[ResultDebugInfo] = js.native
  
  /** Metadata of the search result. */
  var metadata: js.UndefOr[Metadata] = js.native
  
  /** The concatenation of all snippets (summaries) available for this result. */
  var snippet: js.UndefOr[Snippet] = js.native
  
  /** Title of the search result. */
  var title: js.UndefOr[String] = js.native
  
  /** The URL of the search result. The URL contains a Google redirect to the actual item. This URL is signed and shouldn't be changed. */
  var url: js.UndefOr[String] = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    
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
    def setClusteredResultsVarargs(value: SearchResult*): Self = this.set("clusteredResults", js.Array(value :_*))
    
    @scala.inline
    def setClusteredResults(value: js.Array[SearchResult]): Self = this.set("clusteredResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusteredResults: Self = this.set("clusteredResults", js.undefined)
    
    @scala.inline
    def setDebugInfo(value: ResultDebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSnippet(value: Snippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
