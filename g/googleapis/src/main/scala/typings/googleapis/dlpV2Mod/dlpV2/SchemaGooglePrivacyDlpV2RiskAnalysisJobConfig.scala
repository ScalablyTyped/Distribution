package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a risk analysis job. See
  * https://cloud.google.com/dlp/docs/concepts-risk-analysis to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2RiskAnalysisJobConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: SchemaGooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "privacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivacyMetricUndefined: Self = StObject.set(x, "privacyMetric", js.undefined)
    
    @scala.inline
    def setSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
  }
}
