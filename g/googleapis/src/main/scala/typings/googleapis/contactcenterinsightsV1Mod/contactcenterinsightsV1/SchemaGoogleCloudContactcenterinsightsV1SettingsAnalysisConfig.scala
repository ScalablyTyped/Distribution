package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig extends StObject {
  
  /**
    * Percentage of conversations created using Dialogflow runtime integration to analyze automatically, between [0, 100].
    */
  var runtimeIntegrationAnalysisPercentage: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1SettingsAnalysisConfig](x: Self) {
    
    inline def setRuntimeIntegrationAnalysisPercentage(value: Double): Self = StObject.set(x, "runtimeIntegrationAnalysisPercentage", value.asInstanceOf[js.Any])
    
    inline def setRuntimeIntegrationAnalysisPercentageNull: Self = StObject.set(x, "runtimeIntegrationAnalysisPercentage", null)
    
    inline def setRuntimeIntegrationAnalysisPercentageUndefined: Self = StObject.set(x, "runtimeIntegrationAnalysisPercentage", js.undefined)
  }
}
