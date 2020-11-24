package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait SchemaSearchJobsResponse extends js.Object {
  
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
  var broadenedQueryJobsCount: js.UndefOr[Double] = js.native
  
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results, see
    * enable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[Double] = js.native
  
  /**
    * The histogram results that match with specified
    * SearchJobsRequest.histogram_queries.
    */
  var histogramQueryResults: js.UndefOr[js.Array[SchemaHistogramQueryResult]] = js.native
  
  /**
    * The histogram results that match specified
    * SearchJobsRequest.histogram_facets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.native
  
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocation]] = js.native
  
  /**
    * The Job entities that match the specified SearchJobsRequest.
    */
  var matchingJobs: js.UndefOr[js.Array[SchemaMatchingJob]] = js.native
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  
  /**
    * The token that specifies the starting position of the next page of
    * results. This field is empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The spell checking result, and correction.
    */
  var spellCorrection: js.UndefOr[SchemaSpellingCorrection] = js.native
  
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true`, or if the response is the last page
    * of results. Otherwise, the value is `-1`.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaSearchJobsResponse {
  
  @scala.inline
  def apply(): SchemaSearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchJobsResponseOps[Self <: SchemaSearchJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setBroadenedQueryJobsCount(value: Double): Self = this.set("broadenedQueryJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBroadenedQueryJobsCount: Self = this.set("broadenedQueryJobsCount", js.undefined)
    
    @scala.inline
    def setEstimatedTotalSize(value: Double): Self = this.set("estimatedTotalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedTotalSize: Self = this.set("estimatedTotalSize", js.undefined)
    
    @scala.inline
    def setHistogramQueryResultsVarargs(value: SchemaHistogramQueryResult*): Self = this.set("histogramQueryResults", js.Array(value :_*))
    
    @scala.inline
    def setHistogramQueryResults(value: js.Array[SchemaHistogramQueryResult]): Self = this.set("histogramQueryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramQueryResults: Self = this.set("histogramQueryResults", js.undefined)
    
    @scala.inline
    def setHistogramResults(value: SchemaHistogramResults): Self = this.set("histogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramResults: Self = this.set("histogramResults", js.undefined)
    
    @scala.inline
    def setLocationFiltersVarargs(value: SchemaLocation*): Self = this.set("locationFilters", js.Array(value :_*))
    
    @scala.inline
    def setLocationFilters(value: js.Array[SchemaLocation]): Self = this.set("locationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationFilters: Self = this.set("locationFilters", js.undefined)
    
    @scala.inline
    def setMatchingJobsVarargs(value: SchemaMatchingJob*): Self = this.set("matchingJobs", js.Array(value :_*))
    
    @scala.inline
    def setMatchingJobs(value: js.Array[SchemaMatchingJob]): Self = this.set("matchingJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingJobs: Self = this.set("matchingJobs", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSpellCorrection(value: SchemaSpellingCorrection): Self = this.set("spellCorrection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellCorrection: Self = this.set("spellCorrection", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
