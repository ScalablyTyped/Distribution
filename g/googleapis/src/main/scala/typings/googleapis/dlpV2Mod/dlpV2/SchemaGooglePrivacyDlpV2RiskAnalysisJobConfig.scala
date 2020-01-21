package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a risk analysis job. See
  * https://cloud.google.com/dlp/docs/concepts-risk-analysis to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.native
  /**
    * Privacy metric to compute.
    */
  var privacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.native
  /**
    * Input dataset to compute metrics over.
    */
  var sourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}

object SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig {
  @scala.inline
  def apply(
    actions: js.Array[SchemaGooglePrivacyDlpV2Action] = null,
    privacyMetric: SchemaGooglePrivacyDlpV2PrivacyMetric = null,
    sourceTable: SchemaGooglePrivacyDlpV2BigQueryTable = null
  ): SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (privacyMetric != null) __obj.updateDynamic("privacyMetric")(privacyMetric.asInstanceOf[js.Any])
    if (sourceTable != null) __obj.updateDynamic("sourceTable")(sourceTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
}

