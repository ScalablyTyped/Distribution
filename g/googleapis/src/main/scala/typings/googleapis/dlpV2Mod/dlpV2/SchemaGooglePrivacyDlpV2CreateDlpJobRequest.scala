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
  def apply(): SchemaGooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDlpJobRequest]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CreateDlpJobRequestOps[Self <: SchemaGooglePrivacyDlpV2CreateDlpJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = this.set("inspectJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectJob: Self = this.set("inspectJob", js.undefined)
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setRiskJob(value: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig): Self = this.set("riskJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskJob: Self = this.set("riskJob", js.undefined)
  }
  
}

