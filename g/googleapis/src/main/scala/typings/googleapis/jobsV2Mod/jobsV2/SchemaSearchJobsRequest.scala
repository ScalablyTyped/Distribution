package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request body of the `SearchJobs` call.
  */
@js.native
trait SchemaSearchJobsRequest extends js.Object {
  /**
    * Optional.  Controls whether to disable relevance thresholding. Relevance
    * thresholding removes jobs that have low relevance in search results, for
    * example, removing &quot;Assistant to the CEO&quot; positions from the
    * search results of a search for &quot;CEO&quot;.  Disabling relevance
    * thresholding improves the accuracy of subsequent search requests.
    * Defaults to false.
    */
  var disableRelevanceThresholding: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Controls whether to broaden the search when it produces sparse
    * results. Broadened queries append results to the end of the matching
    * results list.  Defaults to false.
    */
  var enableBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Controls if the search job request requires the return of a
    * precise count of the first 300 results. Setting this to `true` ensures
    * consistency in the number of results per page. Best practice is to set
    * this value to true if a client allows users to jump directly to a
    * non-sequential search results page.  Enabling this flag may adversely
    * impact performance.  Defaults to false.
    */
  var enablePreciseResultSize: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Use query instead.  Optional.  Restrictions on the scope of
    * the search request, such as filtering by location.
    */
  var filters: js.UndefOr[SchemaJobFilters] = js.native
  /**
    * Optional.  Restrictions on what fields to perform histogram on, such as
    * `COMPANY_SIZE` etc.
    */
  var histogramFacets: js.UndefOr[SchemaHistogramFacets] = js.native
  /**
    * Optional.  The number of job attributes returned for jobs in the search
    * response. Defaults to JobView.SMALL if no value is specified.
    */
  var jobView: js.UndefOr[String] = js.native
  /**
    * Required.  Mode of a search.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * Optional.  An integer that specifies the current offset (that is,
    * starting result location, amongst the jobs deemed by the API as relevant)
    * in search results. This field is only considered if page_token is unset.
    * For example, 0 means to  return results starting from the first matching
    * job, and 10 means to return from the 11th job. This can be used for
    * pagination, (for example, pageSize = 10 and offset = 10 means to return
    * from the second page).
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Deprecated. Use sort_by instead.  Optional.  The criteria determining how
    * search results are sorted. Defaults to SortBy.RELEVANCE_DESC if no value
    * is specified.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * Optional.  A limit on the number of jobs returned in the search results.
    * Increasing this value above the default value of 10 can increase search
    * response time. The value can be between 1 and 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The token specifying the current offset within search results.
    * See SearchJobsResponse.next_page_token for an explanation of how to
    * obtain the next set of query results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var query: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Required.  The meta information collected about the job searcher, used to
    * improve the search quality of the service. The identifiers, (such as
    * `user_id`) are provided by users, and must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Optional.  The criteria determining how search results are sorted.
    * Defaults to SortBy.RELEVANCE_DESC if no value is specified.
    */
  var sortBy: js.UndefOr[String] = js.native
}

object SchemaSearchJobsRequest {
  @scala.inline
  def apply(
    disableRelevanceThresholding: js.UndefOr[Boolean] = js.undefined,
    enableBroadening: js.UndefOr[Boolean] = js.undefined,
    enablePreciseResultSize: js.UndefOr[Boolean] = js.undefined,
    filters: SchemaJobFilters = null,
    histogramFacets: SchemaHistogramFacets = null,
    jobView: String = null,
    mode: String = null,
    offset: Int | Double = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    query: SchemaJobQuery = null,
    requestMetadata: SchemaRequestMetadata = null,
    sortBy: String = null
  ): SchemaSearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableRelevanceThresholding)) __obj.updateDynamic("disableRelevanceThresholding")(disableRelevanceThresholding.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBroadening)) __obj.updateDynamic("enableBroadening")(enableBroadening.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePreciseResultSize)) __obj.updateDynamic("enablePreciseResultSize")(enablePreciseResultSize.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (histogramFacets != null) __obj.updateDynamic("histogramFacets")(histogramFacets.asInstanceOf[js.Any])
    if (jobView != null) __obj.updateDynamic("jobView")(jobView.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchJobsRequest]
  }
}

