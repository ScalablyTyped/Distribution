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
  def apply(
    debugInfo: SchemaResponseDebugInfo = null,
    errorInfo: SchemaErrorInfo = null,
    facetResults: js.Array[SchemaFacetResult] = null,
    hasMoreResults: js.UndefOr[Boolean] = js.undefined,
    queryInterpretation: SchemaQueryInterpretation = null,
    resultCountEstimate: String = null,
    resultCountExact: String = null,
    resultCounts: SchemaResultCounts = null,
    results: js.Array[SchemaSearchResult] = null,
    spellResults: js.Array[SchemaSpellResult] = null,
    structuredResults: js.Array[SchemaStructuredResult] = null
  ): SchemaSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (debugInfo != null) __obj.updateDynamic("debugInfo")(debugInfo.asInstanceOf[js.Any])
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo.asInstanceOf[js.Any])
    if (facetResults != null) __obj.updateDynamic("facetResults")(facetResults.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults.get.asInstanceOf[js.Any])
    if (queryInterpretation != null) __obj.updateDynamic("queryInterpretation")(queryInterpretation.asInstanceOf[js.Any])
    if (resultCountEstimate != null) __obj.updateDynamic("resultCountEstimate")(resultCountEstimate.asInstanceOf[js.Any])
    if (resultCountExact != null) __obj.updateDynamic("resultCountExact")(resultCountExact.asInstanceOf[js.Any])
    if (resultCounts != null) __obj.updateDynamic("resultCounts")(resultCounts.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (spellResults != null) __obj.updateDynamic("spellResults")(spellResults.asInstanceOf[js.Any])
    if (structuredResults != null) __obj.updateDynamic("structuredResults")(structuredResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchResponse]
  }
}

