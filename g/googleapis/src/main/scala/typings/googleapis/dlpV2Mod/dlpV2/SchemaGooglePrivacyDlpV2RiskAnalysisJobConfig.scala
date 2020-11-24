package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RiskAnalysisJobConfigOps[Self <: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: SchemaGooglePrivacyDlpV2Action*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = this.set("privacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyMetric: Self = this.set("privacyMetric", js.undefined)
    
    @scala.inline
    def setSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = this.set("sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTable: Self = this.set("sourceTable", js.undefined)
  }
}
