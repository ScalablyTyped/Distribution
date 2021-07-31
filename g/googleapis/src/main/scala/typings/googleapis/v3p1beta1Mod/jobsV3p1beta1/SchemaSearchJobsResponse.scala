package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Response for SearchJob method.
  */
trait SchemaSearchJobsResponse extends StObject {
  
  /**
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0, or if the field
    * isn&#39;t set, all the jobs in the jobs list are from the original
    * (without broadening) query. If this field is non-zero, subsequent
    * requests with offset after this result set should contain all broadened
    * results.
    */
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.undefined
  
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results, see
    * enable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The histogram results that match with specified
    * SearchJobsRequest.histogram_queries.
    */
  var histogramQueryResults: js.UndefOr[js.Array[SchemaHistogramQueryResult]] = js.undefined
  
  /**
    * The histogram results that match specified
    * SearchJobsRequest.histogram_facets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.undefined
  
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
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
    * The spell checking result, and correction.
    */
  var spellCorrection: js.UndefOr[SchemaSpellingCorrection] = js.undefined
  
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true`, or if the response is the last page
    * of results. Otherwise, the value is `-1`.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
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
    def setBroadenedQueryJobsCount(value: Double): Self = StObject.set(x, "broadenedQueryJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadenedQueryJobsCountUndefined: Self = StObject.set(x, "broadenedQueryJobsCount", js.undefined)
    
    @scala.inline
    def setEstimatedTotalSize(value: Double): Self = StObject.set(x, "estimatedTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedTotalSizeUndefined: Self = StObject.set(x, "estimatedTotalSize", js.undefined)
    
    @scala.inline
    def setHistogramQueryResults(value: js.Array[SchemaHistogramQueryResult]): Self = StObject.set(x, "histogramQueryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramQueryResultsUndefined: Self = StObject.set(x, "histogramQueryResults", js.undefined)
    
    @scala.inline
    def setHistogramQueryResultsVarargs(value: SchemaHistogramQueryResult*): Self = StObject.set(x, "histogramQueryResults", js.Array(value :_*))
    
    @scala.inline
    def setHistogramResults(value: SchemaHistogramResults): Self = StObject.set(x, "histogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramResultsUndefined: Self = StObject.set(x, "histogramResults", js.undefined)
    
    @scala.inline
    def setLocationFilters(value: js.Array[SchemaLocation]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    @scala.inline
    def setLocationFiltersVarargs(value: SchemaLocation*): Self = StObject.set(x, "locationFilters", js.Array(value :_*))
    
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
    def setSpellCorrection(value: SchemaSpellingCorrection): Self = StObject.set(x, "spellCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellCorrectionUndefined: Self = StObject.set(x, "spellCorrection", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
