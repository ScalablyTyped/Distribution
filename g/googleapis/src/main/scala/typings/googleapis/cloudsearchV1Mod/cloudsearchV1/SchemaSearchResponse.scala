package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API response.
  */
@js.native
trait SchemaSearchResponse extends js.Object {
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
  implicit class SchemaSearchResponseOps[Self <: SchemaSearchResponse] (val x: Self) extends AnyVal {
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
    def setDebugInfo(value: SchemaResponseDebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
    @scala.inline
    def setErrorInfo(value: SchemaErrorInfo): Self = this.set("errorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorInfo: Self = this.set("errorInfo", js.undefined)
    @scala.inline
    def setFacetResultsVarargs(value: SchemaFacetResult*): Self = this.set("facetResults", js.Array(value :_*))
    @scala.inline
    def setFacetResults(value: js.Array[SchemaFacetResult]): Self = this.set("facetResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetResults: Self = this.set("facetResults", js.undefined)
    @scala.inline
    def setHasMoreResults(value: Boolean): Self = this.set("hasMoreResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMoreResults: Self = this.set("hasMoreResults", js.undefined)
    @scala.inline
    def setQueryInterpretation(value: SchemaQueryInterpretation): Self = this.set("queryInterpretation", value.asInstanceOf[js.Any])
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
    def setResultCounts(value: SchemaResultCounts): Self = this.set("resultCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultCounts: Self = this.set("resultCounts", js.undefined)
    @scala.inline
    def setResultsVarargs(value: SchemaSearchResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SchemaSearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSpellResultsVarargs(value: SchemaSpellResult*): Self = this.set("spellResults", js.Array(value :_*))
    @scala.inline
    def setSpellResults(value: js.Array[SchemaSpellResult]): Self = this.set("spellResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellResults: Self = this.set("spellResults", js.undefined)
    @scala.inline
    def setStructuredResultsVarargs(value: SchemaStructuredResult*): Self = this.set("structuredResults", js.Array(value :_*))
    @scala.inline
    def setStructuredResults(value: js.Array[SchemaStructuredResult]): Self = this.set("structuredResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructuredResults: Self = this.set("structuredResults", js.undefined)
  }
  
}

