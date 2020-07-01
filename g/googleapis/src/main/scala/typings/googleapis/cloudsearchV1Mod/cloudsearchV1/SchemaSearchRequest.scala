package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The search API request.
  */
@js.native
trait SchemaSearchRequest extends js.Object {
  /**
    * The sources to use for querying. If not specified, all data sources from
    * the current search application are used.
    */
  var dataSourceRestrictions: js.UndefOr[js.Array[SchemaDataSourceRestriction]] = js.native
  var facetOptions: js.UndefOr[js.Array[SchemaFacetOptions]] = js.native
  /**
    * Maximum number of search results to return in one page. Valid values are
    * between 1 and 100, inclusive. Default value is 10.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The raw query string. See supported search operators in the [Cloud search
    * Cheat
    * Sheet](https://gsuite.google.com/learning-center/products/cloudsearch/cheat-sheet/)
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Options to interpret the user query.
    */
  var queryInterpretationOptions: js.UndefOr[SchemaQueryInterpretationOptions] = js.native
  /**
    * Request options, such as the search application and user timezone.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.native
  /**
    * The options for sorting the search results
    */
  var sortOptions: js.UndefOr[SchemaSortOptions] = js.native
  /**
    * Starting index of the results.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaSearchRequest {
  @scala.inline
  def apply(
    dataSourceRestrictions: js.Array[SchemaDataSourceRestriction] = null,
    facetOptions: js.Array[SchemaFacetOptions] = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    query: String = null,
    queryInterpretationOptions: SchemaQueryInterpretationOptions = null,
    requestOptions: SchemaRequestOptions = null,
    sortOptions: SchemaSortOptions = null,
    start: js.UndefOr[Double] = js.undefined
  ): SchemaSearchRequest = {
    val __obj = js.Dynamic.literal()
    if (dataSourceRestrictions != null) __obj.updateDynamic("dataSourceRestrictions")(dataSourceRestrictions.asInstanceOf[js.Any])
    if (facetOptions != null) __obj.updateDynamic("facetOptions")(facetOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryInterpretationOptions != null) __obj.updateDynamic("queryInterpretationOptions")(queryInterpretationOptions.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (sortOptions != null) __obj.updateDynamic("sortOptions")(sortOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchRequest]
  }
}

