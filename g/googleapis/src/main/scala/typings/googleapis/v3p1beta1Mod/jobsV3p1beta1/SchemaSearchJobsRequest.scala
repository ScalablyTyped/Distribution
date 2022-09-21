package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchJobsRequest extends StObject {
  
  /**
    * Optional. Controls over how job documents get ranked on top of existing relevance score (determined by API algorithm).
    */
  var customRankingInfo: js.UndefOr[SchemaCustomRankingInfo] = js.undefined
  
  /**
    * Optional. Controls whether to disable exact keyword match on Job.job_title, Job.description, Job.company_display_name, Job.locations, Job.qualifications. When disable keyword match is turned off, a keyword match returns jobs that do not match given category filters when there are matching keywords. For example, the query "program manager," a result is returned even if the job posting has the title "software developer," which does not fall into "program manager" ontology, but does have "program manager" appearing in its description. For queries like "cloud" that does not contain title or location specific ontology, jobs with "cloud" keyword matches are returned regardless of this flag's value. Please use Company.keyword_searchable_custom_fields or Company.keyword_searchable_custom_attributes if company specific globally matched custom field/attribute string values is needed. Enabling keyword match improves recall of subsequent search requests. Defaults to false.
    */
  var disableKeywordMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Controls whether highly similar jobs are returned next to each other in the search results. Jobs are identified as highly similar based on their titles, job categories, and locations. Highly similar results are clustered so that only one representative job of the cluster is displayed to the job seeker higher up in the results, with the other jobs being displayed lower down in the results. Defaults to DiversificationLevel.SIMPLE if no value is specified.
    */
  var diversificationLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Controls whether to broaden the search when it produces sparse results. Broadened queries append results to the end of the matching results list. Defaults to false.
    */
  var enableBroadening: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Histogram requests for jobs matching JobQuery.
    */
  var histogramFacets: js.UndefOr[SchemaHistogramFacets] = js.undefined
  
  /**
    * Optional. Expression based histogram requests for jobs matching JobQuery.
    */
  var histogramQueries: js.UndefOr[js.Array[SchemaHistogramQuery]] = js.undefined
  
  /**
    * Optional. Query used to search against jobs, such as keyword, location filters, etc.
    */
  var jobQuery: js.UndefOr[SchemaJobQuery] = js.undefined
  
  /**
    * Optional. The desired job attributes returned for jobs in the search response. Defaults to JobView.SMALL if no value is specified.
    */
  var jobView: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An integer that specifies the current offset (that is, starting result location, amongst the jobs deemed by the API as relevant) in search results. This field is only considered if page_token is unset. The maximum allowed value is 5000. Otherwise an error is thrown. For example, 0 means to return results starting from the first matching job, and 10 means to return from the 11th job. This can be used for pagination, (for example, pageSize = 10 and offset = 10 means to return from the second page).
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The criteria determining how search results are sorted. Default is "relevance desc". Supported options are: * `"relevance desc"`: By relevance descending, as determined by the API algorithms. Relevance thresholding of query results is only available with this ordering. * `"posting_publish_time desc"`: By Job.posting_publish_time descending. * `"posting_update_time desc"`: By Job.posting_update_time descending. * `"title"`: By Job.title ascending. * `"title desc"`: By Job.title descending. * `"annualized_base_compensation"`: By job's CompensationInfo.annualized_base_compensation_range ascending. Jobs whose annualized base compensation is unspecified are put at the end of search results. * `"annualized_base_compensation desc"`: By job's CompensationInfo.annualized_base_compensation_range descending. Jobs whose annualized base compensation is unspecified are put at the end of search results. * `"annualized_total_compensation"`: By job's CompensationInfo.annualized_total_compensation_range ascending. Jobs whose annualized base compensation is unspecified are put at the end of search results. * `"annualized_total_compensation desc"`: By job's CompensationInfo.annualized_total_compensation_range descending. Jobs whose annualized base compensation is unspecified are put at the end of search results. * `"custom_ranking desc"`: By the relevance score adjusted to the SearchJobsRequest.custom_ranking_info.ranking_expression with weight factor assigned by SearchJobsRequest.custom_ranking_info.importance_level in descending order. * Location sorting: Use the special syntax to order jobs by distance: "`distance_from('Hawaii')`": Order by distance from Hawaii. "`distance_from(19.89, 155.5)`": Order by distance from a coordinate. "`distance_from('Hawaii'), distance_from('Puerto Rico')`": Order by multiple locations. See details below. "`distance_from('Hawaii'), distance_from(19.89, 155.5)`": Order by multiple locations. See details below. The string can have a maximum of 256 characters. When multiple distance centers are provided, a job that is close to any of the distance centers would have a high rank. When a job has multiple locations, the job location closest to one of the distance centers will be used. Jobs that don't have locations will be ranked at the bottom. Distance is calculated with a precision of 11.3 meters (37.4 feet). Diversification strategy is still applied unless explicitly disabled in diversification_level.
    */
  var orderBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A limit on the number of jobs returned in the search results. Increasing this value above the default value of 10 can increase search response time. The value can be between 1 and 100.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The token specifying the current offset within search results. See SearchJobsResponse.next_page_token for an explanation of how to obtain the next set of query results.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The meta information collected about the job searcher, used to improve the search quality of the service. The identifiers (such as `user_id`) are provided by users, and must be unique and consistent.
    */
  var requestMetadata: js.UndefOr[SchemaRequestMetadata] = js.undefined
  
  /**
    * This field is deprecated.
    */
  var requirePreciseResultSize: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. Mode of a search. Defaults to SearchMode.JOB_SEARCH.
    */
  var searchMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchJobsRequest {
  
  inline def apply(): SchemaSearchJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsRequest]
  }
  
  extension [Self <: SchemaSearchJobsRequest](x: Self) {
    
    inline def setCustomRankingInfo(value: SchemaCustomRankingInfo): Self = StObject.set(x, "customRankingInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomRankingInfoUndefined: Self = StObject.set(x, "customRankingInfo", js.undefined)
    
    inline def setDisableKeywordMatch(value: Boolean): Self = StObject.set(x, "disableKeywordMatch", value.asInstanceOf[js.Any])
    
    inline def setDisableKeywordMatchNull: Self = StObject.set(x, "disableKeywordMatch", null)
    
    inline def setDisableKeywordMatchUndefined: Self = StObject.set(x, "disableKeywordMatch", js.undefined)
    
    inline def setDiversificationLevel(value: String): Self = StObject.set(x, "diversificationLevel", value.asInstanceOf[js.Any])
    
    inline def setDiversificationLevelNull: Self = StObject.set(x, "diversificationLevel", null)
    
    inline def setDiversificationLevelUndefined: Self = StObject.set(x, "diversificationLevel", js.undefined)
    
    inline def setEnableBroadening(value: Boolean): Self = StObject.set(x, "enableBroadening", value.asInstanceOf[js.Any])
    
    inline def setEnableBroadeningNull: Self = StObject.set(x, "enableBroadening", null)
    
    inline def setEnableBroadeningUndefined: Self = StObject.set(x, "enableBroadening", js.undefined)
    
    inline def setHistogramFacets(value: SchemaHistogramFacets): Self = StObject.set(x, "histogramFacets", value.asInstanceOf[js.Any])
    
    inline def setHistogramFacetsUndefined: Self = StObject.set(x, "histogramFacets", js.undefined)
    
    inline def setHistogramQueries(value: js.Array[SchemaHistogramQuery]): Self = StObject.set(x, "histogramQueries", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueriesUndefined: Self = StObject.set(x, "histogramQueries", js.undefined)
    
    inline def setHistogramQueriesVarargs(value: SchemaHistogramQuery*): Self = StObject.set(x, "histogramQueries", js.Array(value*))
    
    inline def setJobQuery(value: SchemaJobQuery): Self = StObject.set(x, "jobQuery", value.asInstanceOf[js.Any])
    
    inline def setJobQueryUndefined: Self = StObject.set(x, "jobQuery", js.undefined)
    
    inline def setJobView(value: String): Self = StObject.set(x, "jobView", value.asInstanceOf[js.Any])
    
    inline def setJobViewNull: Self = StObject.set(x, "jobView", null)
    
    inline def setJobViewUndefined: Self = StObject.set(x, "jobView", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRequestMetadata(value: SchemaRequestMetadata): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
    
    inline def setRequirePreciseResultSize(value: Boolean): Self = StObject.set(x, "requirePreciseResultSize", value.asInstanceOf[js.Any])
    
    inline def setRequirePreciseResultSizeNull: Self = StObject.set(x, "requirePreciseResultSize", null)
    
    inline def setRequirePreciseResultSizeUndefined: Self = StObject.set(x, "requirePreciseResultSize", js.undefined)
    
    inline def setSearchMode(value: String): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeNull: Self = StObject.set(x, "searchMode", null)
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
  }
}
