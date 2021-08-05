package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search API response.
  */
trait SchemaSearchResponse extends StObject {
  
  /**
    * Debugging information about the response.
    */
  var debugInfo: js.UndefOr[SchemaResponseDebugInfo] = js.undefined
  
  /**
    * Error information about the response.
    */
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.undefined
  
  /**
    * Repeated facet results.
    */
  var facetResults: js.UndefOr[js.Array[SchemaFacetResult]] = js.undefined
  
  /**
    * Whether there are more search results matching the query.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Query interpretation result for user query. Empty if query interpretation
    * is disabled.
    */
  var queryInterpretation: js.UndefOr[SchemaQueryInterpretation] = js.undefined
  
  /**
    * The estimated result count for this query.
    */
  var resultCountEstimate: js.UndefOr[String] = js.undefined
  
  /**
    * The exact result count for this query.
    */
  var resultCountExact: js.UndefOr[String] = js.undefined
  
  /**
    * Expanded result count information.
    */
  var resultCounts: js.UndefOr[SchemaResultCounts] = js.undefined
  
  /**
    * Results from a search query.
    */
  var results: js.UndefOr[js.Array[SchemaSearchResult]] = js.undefined
  
  /**
    * Suggested spelling for the query.
    */
  var spellResults: js.UndefOr[js.Array[SchemaSpellResult]] = js.undefined
  
  /**
    * Structured results for the user query. These results are not counted
    * against the page_size.
    */
  var structuredResults: js.UndefOr[js.Array[SchemaStructuredResult]] = js.undefined
}
object SchemaSearchResponse {
  
  inline def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  
  extension [Self <: SchemaSearchResponse](x: Self) {
    
    inline def setDebugInfo(value: SchemaResponseDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setErrorInfo(value: SchemaErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    inline def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    inline def setFacetResults(value: js.Array[SchemaFacetResult]): Self = StObject.set(x, "facetResults", value.asInstanceOf[js.Any])
    
    inline def setFacetResultsUndefined: Self = StObject.set(x, "facetResults", js.undefined)
    
    inline def setFacetResultsVarargs(value: SchemaFacetResult*): Self = StObject.set(x, "facetResults", js.Array(value :_*))
    
    inline def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    inline def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    inline def setQueryInterpretation(value: SchemaQueryInterpretation): Self = StObject.set(x, "queryInterpretation", value.asInstanceOf[js.Any])
    
    inline def setQueryInterpretationUndefined: Self = StObject.set(x, "queryInterpretation", js.undefined)
    
    inline def setResultCountEstimate(value: String): Self = StObject.set(x, "resultCountEstimate", value.asInstanceOf[js.Any])
    
    inline def setResultCountEstimateUndefined: Self = StObject.set(x, "resultCountEstimate", js.undefined)
    
    inline def setResultCountExact(value: String): Self = StObject.set(x, "resultCountExact", value.asInstanceOf[js.Any])
    
    inline def setResultCountExactUndefined: Self = StObject.set(x, "resultCountExact", js.undefined)
    
    inline def setResultCounts(value: SchemaResultCounts): Self = StObject.set(x, "resultCounts", value.asInstanceOf[js.Any])
    
    inline def setResultCountsUndefined: Self = StObject.set(x, "resultCounts", js.undefined)
    
    inline def setResults(value: js.Array[SchemaSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaSearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    inline def setSpellResults(value: js.Array[SchemaSpellResult]): Self = StObject.set(x, "spellResults", value.asInstanceOf[js.Any])
    
    inline def setSpellResultsUndefined: Self = StObject.set(x, "spellResults", js.undefined)
    
    inline def setSpellResultsVarargs(value: SchemaSpellResult*): Self = StObject.set(x, "spellResults", js.Array(value :_*))
    
    inline def setStructuredResults(value: js.Array[SchemaStructuredResult]): Self = StObject.set(x, "structuredResults", value.asInstanceOf[js.Any])
    
    inline def setStructuredResultsUndefined: Self = StObject.set(x, "structuredResults", js.undefined)
    
    inline def setStructuredResultsVarargs(value: SchemaStructuredResult*): Self = StObject.set(x, "structuredResults", js.Array(value :_*))
  }
}
