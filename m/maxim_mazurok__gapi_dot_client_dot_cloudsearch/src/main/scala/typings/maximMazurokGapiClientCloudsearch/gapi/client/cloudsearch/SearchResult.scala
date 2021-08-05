package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  /**
    * If source is clustered, provide list of clustered results. There will only be one level of clustered results. If current source is not enabled for clustering, this field will be
    * empty.
    */
  var clusteredResults: js.UndefOr[js.Array[SearchResult]] = js.undefined
  
  /** Debugging information about this search result. */
  var debugInfo: js.UndefOr[ResultDebugInfo] = js.undefined
  
  /** Metadata of the search result. */
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  /** The concatenation of all snippets (summaries) available for this result. */
  var snippet: js.UndefOr[Snippet] = js.undefined
  
  /** Title of the search result. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The URL of the search result. The URL contains a Google redirect to the actual item. This URL is signed and shouldn't be changed. */
  var url: js.UndefOr[String] = js.undefined
}
object SearchResult {
  
  inline def apply(): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResult]
  }
  
  extension [Self <: SearchResult](x: Self) {
    
    inline def setClusteredResults(value: js.Array[SearchResult]): Self = StObject.set(x, "clusteredResults", value.asInstanceOf[js.Any])
    
    inline def setClusteredResultsUndefined: Self = StObject.set(x, "clusteredResults", js.undefined)
    
    inline def setClusteredResultsVarargs(value: SearchResult*): Self = StObject.set(x, "clusteredResults", js.Array(value :_*))
    
    inline def setDebugInfo(value: ResultDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSnippet(value: Snippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
