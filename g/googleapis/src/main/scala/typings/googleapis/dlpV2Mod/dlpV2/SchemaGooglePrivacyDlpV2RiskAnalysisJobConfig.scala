package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig extends StObject {
  
  /**
    * Actions to execute at the completion of the job. Are executed in the order provided.
    */
  var actions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Action]] = js.undefined
  
  /**
    * Privacy metric to compute.
    */
  var privacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.undefined
  
  /**
    * Input dataset to compute metrics over.
    */
  var sourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig](x: Self) {
    
    inline def setActions(value: js.Array[SchemaGooglePrivacyDlpV2Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaGooglePrivacyDlpV2Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "privacyMetric", value.asInstanceOf[js.Any])
    
    inline def setPrivacyMetricUndefined: Self = StObject.set(x, "privacyMetric", js.undefined)
    
    inline def setSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
    
    inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
  }
}
