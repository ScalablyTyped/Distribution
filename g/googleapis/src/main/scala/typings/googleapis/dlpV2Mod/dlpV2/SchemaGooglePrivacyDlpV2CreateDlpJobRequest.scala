package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CreateDlpJobRequest extends StObject {
  
  /**
    * An inspection job scans a storage repository for InfoTypes.
    */
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.undefined
  
  /**
    * The job id can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
    */
  var jobId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A risk analysis job calculates re-identification risk metrics for a BigQuery table.
    */
  var riskJob: js.UndefOr[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2CreateDlpJobRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CreateDlpJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CreateDlpJobRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CreateDlpJobRequest](x: Self) {
    
    inline def setInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = StObject.set(x, "inspectJob", value.asInstanceOf[js.Any])
    
    inline def setInspectJobUndefined: Self = StObject.set(x, "inspectJob", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdNull: Self = StObject.set(x, "jobId", null)
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setRiskJob(value: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig): Self = StObject.set(x, "riskJob", value.asInstanceOf[js.Any])
    
    inline def setRiskJobUndefined: Self = StObject.set(x, "riskJob", js.undefined)
  }
}
