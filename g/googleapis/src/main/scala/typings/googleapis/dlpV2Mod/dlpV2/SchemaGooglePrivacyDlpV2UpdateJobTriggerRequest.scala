package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateJobTrigger.
  */
@js.native
trait SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest extends js.Object {
  /**
    * New JobTrigger value.
    */
  var jobTrigger: js.UndefOr[SchemaGooglePrivacyDlpV2JobTrigger] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest {
  @scala.inline
  def apply(jobTrigger: SchemaGooglePrivacyDlpV2JobTrigger = null, updateMask: String = null): SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    if (jobTrigger != null) __obj.updateDynamic("jobTrigger")(jobTrigger.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
}

