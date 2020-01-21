package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Schedule for triggeredJobs.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Schedule extends js.Object {
  /**
    * With this option a job is started a regular periodic basis. For example:
    * every day (86400 seconds).  A scheduled start time will be skipped if the
    * previous execution has not ended when its scheduled time occurs.  This
    * value must be set to a time duration greater than or equal to 1 day and
    * can be no longer than 60 days.
    */
  var recurrencePeriodDuration: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2Schedule {
  @scala.inline
  def apply(recurrencePeriodDuration: String = null): SchemaGooglePrivacyDlpV2Schedule = {
    val __obj = js.Dynamic.literal()
    if (recurrencePeriodDuration != null) __obj.updateDynamic("recurrencePeriodDuration")(recurrencePeriodDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Schedule]
  }
}

