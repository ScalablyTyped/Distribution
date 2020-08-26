package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  Response for SearchJob method.
  */
@js.native
trait SchemaSearchJobsResponse extends js.Object {
  /**
    * The commute filter the service applied to the specified query. This
    * information is only available when query has a valid CommutePreference.
    */
  var appliedCommuteFilter: js.UndefOr[SchemaCommutePreference] = js.native
  /**
    * The location filters that the service applied to the specified query. If
    * any filters are lat-lng based, the JobLocation.location_type is
    * JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
    */
  var appliedJobLocationFilters: js.UndefOr[js.Array[SchemaJobLocation]] = js.native
  /**
    * An estimation of the number of jobs that match the specified query.  This
    * number is not guaranteed to be accurate. For accurate results,
    * seenenable_precise_result_size.
    */
  var estimatedTotalSize: js.UndefOr[String] = js.native
  /**
    * The histogram results that match specified
    * SearchJobsRequest.HistogramFacets.
    */
  var histogramResults: js.UndefOr[SchemaHistogramResults] = js.native
  /**
    * Corresponds to SearchJobsRequest.job_view.
    */
  var jobView: js.UndefOr[String] = js.native
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
    * If query broadening is enabled, we may append additional results from the
    * broadened query. This number indicates how many of the jobs returned in
    * the jobs field are from the broadened query. These results are always at
    * the end of the jobs list. In particular, a value of 0 means all the jobs
    * in the jobs list are from the original (without broadening) query. If
    * this field is non-zero, subsequent requests with offset after this result
    * set should contain all broadened results.
    */
  var numJobsFromBroadenedQuery: js.UndefOr[Double] = js.native
  /**
    * The spell checking result, and correction.
    */
  var spellResult: js.UndefOr[SchemaSpellingCorrection] = js.native
  /**
    * The precise result count, which is available only if the client set
    * enable_precise_result_size to `true` or if the response is the last page
    * of results. Otherwise, the value will be `-1`.
    */
  var totalSize: js.UndefOr[String] = js.native
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
    def setAppliedCommuteFilter(value: SchemaCommutePreference): Self = this.set("appliedCommuteFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedCommuteFilter: Self = this.set("appliedCommuteFilter", js.undefined)
    @scala.inline
    def setAppliedJobLocationFiltersVarargs(value: SchemaJobLocation*): Self = this.set("appliedJobLocationFilters", js.Array(value :_*))
    @scala.inline
    def setAppliedJobLocationFilters(value: js.Array[SchemaJobLocation]): Self = this.set("appliedJobLocationFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedJobLocationFilters: Self = this.set("appliedJobLocationFilters", js.undefined)
    @scala.inline
    def setEstimatedTotalSize(value: String): Self = this.set("estimatedTotalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEstimatedTotalSize: Self = this.set("estimatedTotalSize", js.undefined)
    @scala.inline
    def setHistogramResults(value: SchemaHistogramResults): Self = this.set("histogramResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistogramResults: Self = this.set("histogramResults", js.undefined)
    @scala.inline
    def setJobView(value: String): Self = this.set("jobView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobView: Self = this.set("jobView", js.undefined)
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
    def setNumJobsFromBroadenedQuery(value: Double): Self = this.set("numJobsFromBroadenedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumJobsFromBroadenedQuery: Self = this.set("numJobsFromBroadenedQuery", js.undefined)
    @scala.inline
    def setSpellResult(value: SchemaSpellingCorrection): Self = this.set("spellResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellResult: Self = this.set("spellResult", js.undefined)
    @scala.inline
    def setTotalSize(value: String): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
  
}

