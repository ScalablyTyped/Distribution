package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResponse extends StObject {
  
  /** Debugging information about the response. */
  var debugInfo: js.UndefOr[ResponseDebugInfo] = js.undefined
  
  /** Error information about the response. */
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
  
  /** Repeated facet results. */
  var facetResults: js.UndefOr[js.Array[FacetResult]] = js.undefined
  
  /** Whether there are more search results matching the query. */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /** Query interpretation result for user query. Empty if query interpretation is disabled. */
  var queryInterpretation: js.UndefOr[QueryInterpretation] = js.undefined
  
  /** The estimated result count for this query. */
  var resultCountEstimate: js.UndefOr[String] = js.undefined
  
  /** The exact result count for this query. */
  var resultCountExact: js.UndefOr[String] = js.undefined
  
  /** Expanded result count information. */
  var resultCounts: js.UndefOr[ResultCounts] = js.undefined
  
  /** Results from a search query. */
  var results: js.UndefOr[js.Array[SearchResult]] = js.undefined
  
  /** Suggested spelling for the query. */
  var spellResults: js.UndefOr[js.Array[SpellResult]] = js.undefined
  
  /** Structured results for the user query. These results are not counted against the page_size. */
  var structuredResults: js.UndefOr[js.Array[StructuredResult]] = js.undefined
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseMutableBuilder[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugInfo(value: ResponseDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    @scala.inline
    def setFacetResults(value: js.Array[FacetResult]): Self = StObject.set(x, "facetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetResultsUndefined: Self = StObject.set(x, "facetResults", js.undefined)
    
    @scala.inline
    def setFacetResultsVarargs(value: FacetResult*): Self = StObject.set(x, "facetResults", js.Array(value :_*))
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    @scala.inline
    def setQueryInterpretation(value: QueryInterpretation): Self = StObject.set(x, "queryInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInterpretationUndefined: Self = StObject.set(x, "queryInterpretation", js.undefined)
    
    @scala.inline
    def setResultCountEstimate(value: String): Self = StObject.set(x, "resultCountEstimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountEstimateUndefined: Self = StObject.set(x, "resultCountEstimate", js.undefined)
    
    @scala.inline
    def setResultCountExact(value: String): Self = StObject.set(x, "resultCountExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountExactUndefined: Self = StObject.set(x, "resultCountExact", js.undefined)
    
    @scala.inline
    def setResultCounts(value: ResultCounts): Self = StObject.set(x, "resultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountsUndefined: Self = StObject.set(x, "resultCounts", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSpellResults(value: js.Array[SpellResult]): Self = StObject.set(x, "spellResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellResultsUndefined: Self = StObject.set(x, "spellResults", js.undefined)
    
    @scala.inline
    def setSpellResultsVarargs(value: SpellResult*): Self = StObject.set(x, "spellResults", js.Array(value :_*))
    
    @scala.inline
    def setStructuredResults(value: js.Array[StructuredResult]): Self = StObject.set(x, "structuredResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredResultsUndefined: Self = StObject.set(x, "structuredResults", js.undefined)
    
    @scala.inline
    def setStructuredResultsVarargs(value: StructuredResult*): Self = StObject.set(x, "structuredResults", js.Array(value :_*))
  }
}
