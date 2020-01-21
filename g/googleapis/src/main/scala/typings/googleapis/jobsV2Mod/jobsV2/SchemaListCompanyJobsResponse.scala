package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use ListJobsResponse instead.  Output only.  The List jobs
  * response object.
  */
@js.native
trait SchemaListCompanyJobsResponse extends js.Object {
  /**
    * The Jobs for a given company.  The maximum number of items returned is
    * based on the limit field provided in the request.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of open jobs. The result will be empty if
    * ListCompanyJobsRequest.include_jobs_count is not enabled or if no open
    * jobs are available.
    */
  var totalSize: js.UndefOr[String] = js.native
}

object SchemaListCompanyJobsResponse {
  @scala.inline
  def apply(
    jobs: js.Array[SchemaJob] = null,
    metadata: SchemaResponseMetadata = null,
    nextPageToken: String = null,
    totalSize: String = null
  ): SchemaListCompanyJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCompanyJobsResponse]
  }
}

