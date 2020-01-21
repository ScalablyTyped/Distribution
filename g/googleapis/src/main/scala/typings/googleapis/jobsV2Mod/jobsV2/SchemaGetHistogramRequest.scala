package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use SearchJobsRequest.histogram_facets instead to make a single
  * call with both search and histogram.  Input only.  A request for the
  * `GetHistogram` method.
  */
@js.native
trait SchemaGetHistogramRequest extends js.Object {
  /**
    * Optional.  Controls whether to broaden the search to avoid too few
    * results for a given query in instances where a search has sparse results.
    * Results from a broadened query is a superset of the results from the
    * original query.  Defaults to false.
    */
  var allowBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the histogram.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Meta information, such as `user_id`, collected from the job searcher or
    * other entity conducting a job search, is used to improve the
    * service&#39;s search quality. Users determine identifier values, which
    * must be unique and consist.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Required.  A list of facets that specify the histogram data to be
    * calculated against and returned.  Histogram response times can be slow,
    * and counts can be approximations. This call may be temporarily or
    * permanently removed prior to the production release of Cloud Talent
    * Solution.
    */
  var searchTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGetHistogramRequest {
  @scala.inline
  def apply(
    allowBroadening: js.UndefOr[Boolean] = js.undefined,
    filters: SchemaJobFilters = null,
    query: SchemaJobQuery = null,
    requestMetadata: SchemaRequestMetadata = null,
    searchTypes: js.Array[String] = null
  ): SchemaGetHistogramRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowBroadening)) __obj.updateDynamic("allowBroadening")(allowBroadening.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    if (searchTypes != null) __obj.updateDynamic("searchTypes")(searchTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetHistogramRequest]
  }
}

