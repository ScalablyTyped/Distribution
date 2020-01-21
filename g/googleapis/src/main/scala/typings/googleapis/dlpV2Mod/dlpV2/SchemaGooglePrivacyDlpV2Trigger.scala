package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What event needs to occur for a new job to be started.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Trigger extends js.Object {
  /**
    * Create a job on a repeating basis based on the elapse of time.
    */
  var schedule: js.UndefOr[SchemaGooglePrivacyDlpV2Schedule] = js.native
}

object SchemaGooglePrivacyDlpV2Trigger {
  @scala.inline
  def apply(schedule: SchemaGooglePrivacyDlpV2Schedule = null): SchemaGooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Trigger]
  }
}

