package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaSearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchJobsRequestOps[Self <: SchemaSearchJobsRequest] (val x: Self) extends AnyVal {
    
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
    def setDisableRelevanceThresholding(value: Boolean): Self = this.set("disableRelevanceThresholding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRelevanceThresholding: Self = this.set("disableRelevanceThresholding", js.undefined)
    
    @scala.inline
    def setEnableBroadening(value: Boolean): Self = this.set("enableBroadening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableBroadening: Self = this.set("enableBroadening", js.undefined)
    
    @scala.inline
    def setEnablePreciseResultSize(value: Boolean): Self = this.set("enablePreciseResultSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePreciseResultSize: Self = this.set("enablePreciseResultSize", js.undefined)
    
    @scala.inline
    def setFilters(value: SchemaJobFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setHistogramFacets(value: SchemaHistogramFacets): Self = this.set("histogramFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramFacets: Self = this.set("histogramFacets", js.undefined)
    
    @scala.inline
    def setJobView(value: String): Self = this.set("jobView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobView: Self = this.set("jobView", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaJobQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRequestMetadata(value: SchemaRequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
  }
}
