package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2RequestedOptions extends js.Object {
  var jobConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * If run with an InspectTemplate, a snapshot of its state at the time of
    * this run.
    */
  var snapshotInspectTemplate: js.UndefOr[SchemaGooglePrivacyDlpV2InspectTemplate] = js.native
}

object SchemaGooglePrivacyDlpV2RequestedOptions {
  @scala.inline
  def apply(
    jobConfig: SchemaGooglePrivacyDlpV2InspectJobConfig = null,
    snapshotInspectTemplate: SchemaGooglePrivacyDlpV2InspectTemplate = null
  ): SchemaGooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    if (jobConfig != null) __obj.updateDynamic("jobConfig")(jobConfig.asInstanceOf[js.Any])
    if (snapshotInspectTemplate != null) __obj.updateDynamic("snapshotInspectTemplate")(snapshotInspectTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RequestedOptions]
  }
}

