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
  
  inline def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  extension [Self <: SearchResponse](x: Self) {
    
    inline def setDebugInfo(value: ResponseDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setFacetResults(value: js.Array[FacetResult]): Self = StObject.set(x, "facetResults", value.asInstanceOf[js.Any])
    
    inline def setFacetResultsUndefined: Self = StObject.set(x, "facetResults", js.undefined)
    
    inline def setFacetResultsVarargs(value: FacetResult*): Self = StObject.set(x, "facetResults", js.Array(value :_*))
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    inline def setQueryInterpretation(value: QueryInterpretation): Self = StObject.set(x, "queryInterpretation", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationUndefined: Self = StObject.set(x, "queryInterpretation", js.undefined)
    
    inline def setResultCountEstimate(value: String): Self = StObject.set(x, "resultCountEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultCountEstimateUndefined: Self = StObject.set(x, "resultCountEstimate", js.undefined)
    
    inline def setResultCountExact(value: String): Self = StObject.set(x, "resultCountExact", value.asInstanceOf[js.Any])
    
    inline def setResultCountExactUndefined: Self = StObject.set(x, "resultCountExact", js.undefined)
    
    inline def setResultCounts(value: ResultCounts): Self = StObject.set(x, "resultCounts", value.asInstanceOf[js.Any])
    
    inline def setResultCountsUndefined: Self = StObject.set(x, "resultCounts", js.undefined)
    
    inline def setResults(value: js.Array[SearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    inline def setSpellResults(value: js.Array[SpellResult]): Self = StObject.set(x, "spellResults", value.asInstanceOf[js.Any])
    
    inline def setSpellResultsUndefined: Self = StObject.set(x, "spellResults", js.undefined)
    
    inline def setSpellResultsVarargs(value: SpellResult*): Self = StObject.set(x, "spellResults", js.Array(value :_*))
    
    inline def setStructuredResults(value: js.Array[StructuredResult]): Self = StObject.set(x, "structuredResults", value.asInstanceOf[js.Any])
    
    inline def setStructuredResultsUndefined: Self = StObject.set(x, "structuredResults", js.undefined)
    
    inline def setStructuredResultsVarargs(value: StructuredResult*): Self = StObject.set(x, "structuredResults", js.Array(value :_*))
  }
}
