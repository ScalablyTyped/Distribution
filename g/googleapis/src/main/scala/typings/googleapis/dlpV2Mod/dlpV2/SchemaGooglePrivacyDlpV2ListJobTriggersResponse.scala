package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListJobTriggers.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListJobTriggersResponse extends js.Object {
  /**
    * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
    */
  var jobTriggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2JobTrigger]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListJobTriggers request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListJobTriggersResponse {
  @scala.inline
  def apply(jobTriggers: js.Array[SchemaGooglePrivacyDlpV2JobTrigger] = null, nextPageToken: String = null): SchemaGooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (jobTriggers != null) __obj.updateDynamic("jobTriggers")(jobTriggers.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  }
}

