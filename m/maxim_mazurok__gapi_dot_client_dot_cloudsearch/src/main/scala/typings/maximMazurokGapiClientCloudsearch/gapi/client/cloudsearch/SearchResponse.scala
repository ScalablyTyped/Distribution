package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse extends js.Object {
  
  /** Debugging information about the response. */
  var debugInfo: js.UndefOr[ResponseDebugInfo] = js.native
  
  /** Error information about the response. */
  var errorInfo: js.UndefOr[ErrorInfo] = js.native
  
  /** Repeated facet results. */
  var facetResults: js.UndefOr[js.Array[FacetResult]] = js.native
  
  /** Whether there are more search results matching the query. */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /** Query interpretation result for user query. Empty if query interpretation is disabled. */
  var queryInterpretation: js.UndefOr[QueryInterpretation] = js.native
  
  /** The estimated result count for this query. */
  var resultCountEstimate: js.UndefOr[String] = js.native
  
  /** The exact result count for this query. */
  var resultCountExact: js.UndefOr[String] = js.native
  
  /** Expanded result count information. */
  var resultCounts: js.UndefOr[ResultCounts] = js.native
  
  /** Results from a search query. */
  var results: js.UndefOr[js.Array[SearchResult]] = js.native
  
  /** Suggested spelling for the query. */
  var spellResults: js.UndefOr[js.Array[SpellResult]] = js.native
  
  /** Structured results for the user query. These results are not counted against the page_size. */
  var structuredResults: js.UndefOr[js.Array[StructuredResult]] = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
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
    def setDebugInfo(value: ResponseDebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorInfo: Self = this.set("errorInfo", js.undefined)
    
    @scala.inline
    def setFacetResultsVarargs(value: FacetResult*): Self = this.set("facetResults", js.Array(value :_*))
    
    @scala.inline
    def setFacetResults(value: js.Array[FacetResult]): Self = this.set("facetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetResults: Self = this.set("facetResults", js.undefined)
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = this.set("hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMoreResults: Self = this.set("hasMoreResults", js.undefined)
    
    @scala.inline
    def setQueryInterpretation(value: QueryInterpretation): Self = this.set("queryInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryInterpretation: Self = this.set("queryInterpretation", js.undefined)
    
    @scala.inline
    def setResultCountEstimate(value: String): Self = this.set("resultCountEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCountEstimate: Self = this.set("resultCountEstimate", js.undefined)
    
    @scala.inline
    def setResultCountExact(value: String): Self = this.set("resultCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCountExact: Self = this.set("resultCountExact", js.undefined)
    
    @scala.inline
    def setResultCounts(value: ResultCounts): Self = this.set("resultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultCounts: Self = this.set("resultCounts", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setSpellResultsVarargs(value: SpellResult*): Self = this.set("spellResults", js.Array(value :_*))
    
    @scala.inline
    def setSpellResults(value: js.Array[SpellResult]): Self = this.set("spellResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellResults: Self = this.set("spellResults", js.undefined)
    
    @scala.inline
    def setStructuredResultsVarargs(value: StructuredResult*): Self = this.set("structuredResults", js.Array(value :_*))
    
    @scala.inline
    def setStructuredResults(value: js.Array[StructuredResult]): Self = this.set("structuredResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructuredResults: Self = this.set("structuredResults", js.undefined)
  }
}
