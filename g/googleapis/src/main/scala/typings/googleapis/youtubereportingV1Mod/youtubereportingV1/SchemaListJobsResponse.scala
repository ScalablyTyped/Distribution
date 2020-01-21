package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListJobs.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListJobsRequest.page_token field in the subsequent call to `ListJobs`
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[SchemaJob] = null, nextPageToken: String = null): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
}

