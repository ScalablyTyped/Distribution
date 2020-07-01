package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  The Request body of the `SearchJobs` call.
  */
@js.native
trait SchemaSearchJobsRequest extends js.Object {
  /**
    * Optional.  Controls whether to disable exact keyword match on
    * Job.job_title, Job.description, Job.company_display_name, Job.locations,
    * Job.qualifications. When disable keyword match is turned off, a keyword
    * match returns jobs that do not match given category filters when there
    * are matching keywords. For example, the query &quot;program
    * manager,&quot; a result is returned even if the job posting has the title
    * &quot;software developer,&quot; which does not fall into &quot;program
    * manager&quot; ontology, but does have &quot;program manager&quot;
    * appearing in its description.  For queries like &quot;cloud&quot; that
    * does not contain title or location specific ontology, jobs with
    * &quot;cloud&quot; keyword matches are returned regardless of this
    * flag&#39;s value.  Please use Company.keyword_searchable_custom_fields or
    * Company.keyword_searchable_custom_attributes if company specific globally
    * matched custom field/attribute string values is needed. Enabling keyword
    * match improves recall of subsequent search requests.  Defaults to false.
    */
  var disableKeywordMatch: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Controls whether highly similar jobs are returned next to each
    * other in the search results. Jobs are identified as highly similar based
    * on their titles, job categories, and locations. Highly similar results
    * are clustered so that only one representative job of the cluster is
    * displayed to the job seeker higher up in the results, with the other jobs
    * being displayed lower down in the results.  Defaults to
    * DiversificationLevel.SIMPLE if no value is specified.
    */
  var diversificationLevel: js.UndefOr[String] = js.native
  /**
    * Optional.  Controls whether to broaden the search when it produces sparse
    * results. Broadened queries append results to the end of the matching
    * results list.  Defaults to false.
    */
  var enableBroadening: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Histogram requests for jobs matching JobQuery.
    */
  var histogramFacets: js.UndefOr[SchemaHistogramFacets] = js.native
  /**
    * Optional.  Query used to search against jobs, such as keyword, location
    * filters, etc.
    */
  var jobQuery: js.UndefOr[SchemaJobQuery] = js.native
  /**
    * Optional.  The desired job attributes returned for jobs in the search
    * response. Defaults to JobView.SMALL if no value is specified.
    */
  var jobView: js.UndefOr[String] = js.native
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
    * Optional.  The criteria determining how search results are sorted.
    * Default is &quot;relevance desc&quot;.  Supported options are:  *
    * &quot;relevance desc&quot;: By relevance descending, as determined by the
    * API algorithms. Relevance thresholding of query results is only available
    * with this ordering. * &quot;posting`_`publish`_`time desc&quot;: By
    * Job.posting_publish_time descending. * &quot;posting`_`update`_`time
    * desc&quot;: By Job.posting_update_time descending. * &quot;title&quot;:
    * By Job.title ascending. * &quot;title desc&quot;: By Job.title
    * descending. * &quot;annualized`_`base`_`compensation&quot;: By job&#39;s
    * CompensationInfo.annualized_base_compensation_range ascending. Jobs whose
    * annualized base compensation is unspecified are put at the end of search
    * results. * &quot;annualized`_`base`_`compensation desc&quot;: By
    * job&#39;s CompensationInfo.annualized_base_compensation_range descending.
    * Jobs whose annualized base compensation is unspecified are put at the end
    * of search results. * &quot;annualized`_`total`_`compensation&quot;: By
    * job&#39;s CompensationInfo.annualized_total_compensation_range ascending.
    * Jobs whose annualized base compensation is unspecified are put at the end
    * of search results. * &quot;annualized`_`total`_`compensation desc&quot;:
    * By job&#39;s CompensationInfo.annualized_total_compensation_range
    * descending. Jobs whose annualized base compensation is unspecified are
    * put at the end of search results.
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
    * Required.  The meta information collected about the job searcher, used to
    * improve the search quality of the service.. The identifiers, (such as
    * `user_id`) are provided by users, and must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.native
  /**
    * Optional.  Controls if the search job request requires the return of a
    * precise count of the first 300 results. Setting this to `true` ensures
    * consistency in the number of results per page. Best practice is to set
    * this value to true if a client allows users to jump directly to a
    * non-sequential search results page.  Enabling this flag may adversely
    * impact performance.  Defaults to false.
    */
  var requirePreciseResultSize: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  Mode of a search.  Defaults to SearchMode.JOB_SEARCH.
    */
  var searchMode: js.UndefOr[String] = js.native
}

object SchemaSearchJobsRequest {
  @scala.inline
  def apply(
    disableKeywordMatch: js.UndefOr[Boolean] = js.undefined,
    diversificationLevel: String = null,
    enableBroadening: js.UndefOr[Boolean] = js.undefined,
    histogramFacets: SchemaHistogramFacets = null,
    jobQuery: SchemaJobQuery = null,
    jobView: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    orderBy: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    requestMetadata: SchemaRequestMetadata = null,
    requirePreciseResultSize: js.UndefOr[Boolean] = js.undefined,
    searchMode: String = null
  ): SchemaSearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableKeywordMatch)) __obj.updateDynamic("disableKeywordMatch")(disableKeywordMatch.get.asInstanceOf[js.Any])
    if (diversificationLevel != null) __obj.updateDynamic("diversificationLevel")(diversificationLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBroadening)) __obj.updateDynamic("enableBroadening")(enableBroadening.get.asInstanceOf[js.Any])
    if (histogramFacets != null) __obj.updateDynamic("histogramFacets")(histogramFacets.asInstanceOf[js.Any])
    if (jobQuery != null) __obj.updateDynamic("jobQuery")(jobQuery.asInstanceOf[js.Any])
    if (jobView != null) __obj.updateDynamic("jobView")(jobView.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (requestMetadata != null) __obj.updateDynamic("requestMetadata")(requestMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePreciseResultSize)) __obj.updateDynamic("requirePreciseResultSize")(requirePreciseResultSize.get.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchJobsRequest]
  }
}

