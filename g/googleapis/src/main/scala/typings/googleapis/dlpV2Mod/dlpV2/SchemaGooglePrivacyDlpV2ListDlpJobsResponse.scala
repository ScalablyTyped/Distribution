package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for listing DLP jobs.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListDlpJobsResponse extends js.Object {
  /**
    * A list of DlpJobs that matches the specified filter in the request.
    */
  var jobs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DlpJob]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ListDlpJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[SchemaGooglePrivacyDlpV2DlpJob] = null, nextPageToken: String = null): SchemaGooglePrivacyDlpV2ListDlpJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  }
}

