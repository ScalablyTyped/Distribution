package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The search API response.
  */
@js.native
trait SchemaSearchResponse extends StObject {
  
  /**
    * Debugging information about the response.
    */
  var debugInfo: js.UndefOr[SchemaResponseDebugInfo] = js.native
  
  /**
    * Error information about the response.
    */
  var errorInfo: js.UndefOr[SchemaErrorInfo] = js.native
  
  /**
    * Repeated facet results.
    */
  var facetResults: js.UndefOr[js.Array[SchemaFacetResult]] = js.native
  
  /**
    * Whether there are more search results matching the query.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.native
  
  /**
    * Query interpretation result for user query. Empty if query interpretation
    * is disabled.
    */
  var queryInterpretation: js.UndefOr[SchemaQueryInterpretation] = js.native
  
  /**
    * The estimated result count for this query.
    */
  var resultCountEstimate: js.UndefOr[String] = js.native
  
  /**
    * The exact result count for this query.
    */
  var resultCountExact: js.UndefOr[String] = js.native
  
  /**
    * Expanded result count information.
    */
  var resultCounts: js.UndefOr[SchemaResultCounts] = js.native
  
  /**
    * Results from a search query.
    */
  var results: js.UndefOr[js.Array[SchemaSearchResult]] = js.native
  
  /**
    * Suggested spelling for the query.
    */
  var spellResults: js.UndefOr[js.Array[SchemaSpellResult]] = js.native
  
  /**
    * Structured results for the user query. These results are not counted
    * against the page_size.
    */
  var structuredResults: js.UndefOr[js.Array[SchemaStructuredResult]] = js.native
}
object SchemaSearchResponse {
  
  @scala.inline
  def apply(): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchResponseMutableBuilder[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugInfo(value: SchemaResponseDebugInfo): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: SchemaErrorInfo): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "errorInfo", js.undefined)
    
    @scala.inline
    def setFacetResults(value: js.Array[SchemaFacetResult]): Self = StObject.set(x, "facetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetResultsUndefined: Self = StObject.set(x, "facetResults", js.undefined)
    
    @scala.inline
    def setFacetResultsVarargs(value: SchemaFacetResult*): Self = StObject.set(x, "facetResults", js.Array(value :_*))
    
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = StObject.set(x, "hasMoreResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMoreResultsUndefined: Self = StObject.set(x, "hasMoreResults", js.undefined)
    
    @scala.inline
    def setQueryInterpretation(value: SchemaQueryInterpretation): Self = StObject.set(x, "queryInterpretation", value.asInstanceOf[js.Any])
    
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
    def setResultCounts(value: SchemaResultCounts): Self = StObject.set(x, "resultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCountsUndefined: Self = StObject.set(x, "resultCounts", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaSearchResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaSearchResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setSpellResults(value: js.Array[SchemaSpellResult]): Self = StObject.set(x, "spellResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellResultsUndefined: Self = StObject.set(x, "spellResults", js.undefined)
    
    @scala.inline
    def setSpellResultsVarargs(value: SchemaSpellResult*): Self = StObject.set(x, "spellResults", js.Array(value :_*))
    
    @scala.inline
    def setStructuredResults(value: js.Array[SchemaStructuredResult]): Self = StObject.set(x, "structuredResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredResultsUndefined: Self = StObject.set(x, "structuredResults", js.undefined)
    
    @scala.inline
    def setStructuredResultsVarargs(value: SchemaStructuredResult*): Self = StObject.set(x, "structuredResults", js.Array(value :_*))
  }
}
