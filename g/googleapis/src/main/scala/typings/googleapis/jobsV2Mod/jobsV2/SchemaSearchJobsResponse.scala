package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Response for SearchJob method.
  */
trait SchemaSearchJobsResponse extends StObject {
  
  /**
    * The commute filter the service applied to the specified query. This
    * information is only available when query has a valid CommutePreference.
    */
  var appliedCommuteFilter: js.UndefOr[SchemaCommutePreference] = js.undefined
  
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var appliedJobLocationFilters: js.UndefOr[js.Array[SchemaJobLocation]] = js.undefined
  
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results,
    * seenenable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[String] = js.undefined
  
  /**
    * The histogram results that match specified
    * SearchJobsRequest.HistogramFacets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.undefined
  
  /**
    * Corresponds to SearchJobsRequest.job_view.
    */
  var jobView: js.UndefOr[String] = js.undefined
  
  /**
    * The Job entities that match the specified SearchJobsRequest.
    */
  var matchingJobs: js.UndefOr[js.Array[SchemaMatchingJob]] = js.undefined
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
  
  /**
    * The token that specifies the starting position of the next page of
    * results. This field is empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0 means all the jobs
    * in the jobs list are from the original (without broadening) query. If
    * this field is non-zero, subsequent requests with offset after this result
    * set should contain all broadened results.
    */
  var numJobsFromBroadenedQuery: js.UndefOr[Double] = js.undefined
  
  /**
    * The spell checking result, and correction.
    */
  var spellResult: js.UndefOr[SchemaSpellingCorrection] = js.undefined
  
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true` or if the response is the last page
    * of results. Otherwise, the value will be `-1`.
    */
  var totalSize: js.UndefOr[String] = js.undefined
}
object SchemaSearchJobsResponse {
  
  @scala.inline
  def apply(): SchemaSearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchJobsResponseMutableBuilder[Self <: SchemaSearchJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedCommuteFilter(value: SchemaCommutePreference): Self = StObject.set(x, "appliedCommuteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedCommuteFilterUndefined: Self = StObject.set(x, "appliedCommuteFilter", js.undefined)
    
    @scala.inline
    def setAppliedJobLocationFilters(value: js.Array[SchemaJobLocation]): Self = StObject.set(x, "appliedJobLocationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedJobLocationFiltersUndefined: Self = StObject.set(x, "appliedJobLocationFilters", js.undefined)
    
    @scala.inline
    def setAppliedJobLocationFiltersVarargs(value: SchemaJobLocation*): Self = StObject.set(x, "appliedJobLocationFilters", js.Array(value :_*))
    
    @scala.inline
    def setEstimatedTotalSize(value: String): Self = StObject.set(x, "estimatedTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTotalSizeUndefined: Self = StObject.set(x, "estimatedTotalSize", js.undefined)
    
    @scala.inline
    def setHistogramResults(value: SchemaHistogramResults): Self = StObject.set(x, "histogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramResultsUndefined: Self = StObject.set(x, "histogramResults", js.undefined)
    
    @scala.inline
    def setJobView(value: String): Self = StObject.set(x, "jobView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobViewUndefined: Self = StObject.set(x, "jobView", js.undefined)
    
    @scala.inline
    def setMatchingJobs(value: js.Array[SchemaMatchingJob]): Self = StObject.set(x, "matchingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingJobsUndefined: Self = StObject.set(x, "matchingJobs", js.undefined)
    
    @scala.inline
    def setMatchingJobsVarargs(value: SchemaMatchingJob*): Self = StObject.set(x, "matchingJobs", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNumJobsFromBroadenedQuery(value: Double): Self = StObject.set(x, "numJobsFromBroadenedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumJobsFromBroadenedQueryUndefined: Self = StObject.set(x, "numJobsFromBroadenedQuery", js.undefined)
    
    @scala.inline
    def setSpellResult(value: SchemaSpellingCorrection): Self = StObject.set(x, "spellResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellResultUndefined: Self = StObject.set(x, "spellResult", js.undefined)
    
    @scala.inline
    def setTotalSize(value: String): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
