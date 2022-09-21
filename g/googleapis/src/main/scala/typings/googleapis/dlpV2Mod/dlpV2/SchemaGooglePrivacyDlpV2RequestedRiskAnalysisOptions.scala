package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RequestedRiskAnalysisOptions extends StObject {
  
  /**
    * The job config for the risk job.
    */
  var jobConfig: js.UndefOr[SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2RequestedRiskAnalysisOptions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RequestedRiskAnalysisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RequestedRiskAnalysisOptions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RequestedRiskAnalysisOptions](x: Self) {
    
    inline def setJobConfig(value: SchemaGooglePrivacyDlpV2RiskAnalysisJobConfig): Self = StObject.set(x, "jobConfig", value.asInstanceOf[js.Any])
    
    inline def setJobConfigUndefined: Self = StObject.set(x, "jobConfig", js.undefined)
  }
}
