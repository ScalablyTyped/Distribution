package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateDlpJobRequest. Used to initiate long running jobs
  * such as calculating risk metrics or inspecting Google Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CreateDlpJobRequest extends js.Object {
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * The job id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var jobId: js.UndefOr[String] = js.native
  var riskJob: js.UndefOr[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] = js.native
}

object SchemaGooglePrivacyDlpV2CreateDlpJobRequest {
  @scala.inline
  def apply(
    inspectJob: SchemaGooglePrivacyDlpV2InspectJobConfig = null,
    jobId: String = null,
    riskJob: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig = null
  ): SchemaGooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectJob != null) __obj.updateDynamic("inspectJob")(inspectJob.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (riskJob != null) __obj.updateDynamic("riskJob")(riskJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDlpJobRequest]
  }
}

