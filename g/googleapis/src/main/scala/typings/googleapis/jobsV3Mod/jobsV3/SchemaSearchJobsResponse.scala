package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    broadenedQueryJobsCount: js.UndefOr[Double] = js.undefined,
    estimatedTotalSize: js.UndefOr[Double] = js.undefined,
    histogramResults: SchemaHistogramResults = null,
    locationFilters: js.Array[SchemaLocation] = null,
    matchingJobs: js.Array[SchemaMatchingJob] = null,
    metadata: SchemaResponseMetadata = null,
    nextPageToken: String = null,
    spellCorrection: SchemaSpellingCorrection = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaSearchJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(broadenedQueryJobsCount)) __obj.updateDynamic("broadenedQueryJobsCount")(broadenedQueryJobsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(estimatedTotalSize)) __obj.updateDynamic("estimatedTotalSize")(estimatedTotalSize.get.asInstanceOf[js.Any])
    if (histogramResults != null) __obj.updateDynamic("histogramResults")(histogramResults.asInstanceOf[js.Any])
    if (locationFilters != null) __obj.updateDynamic("locationFilters")(locationFilters.asInstanceOf[js.Any])
    if (matchingJobs != null) __obj.updateDynamic("matchingJobs")(matchingJobs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (spellCorrection != null) __obj.updateDynamic("spellCorrection")(spellCorrection.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchJobsResponse]
  }
}

