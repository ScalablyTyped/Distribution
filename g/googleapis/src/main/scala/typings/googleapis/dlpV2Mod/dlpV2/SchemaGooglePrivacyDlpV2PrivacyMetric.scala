package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Privacy metric to compute for reidentification risk analysis.
  */
trait SchemaGooglePrivacyDlpV2PrivacyMetric extends StObject {
  
  var categoricalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsConfig] = js.undefined
  
  var deltaPresenceEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.undefined
  
  var kAnonymityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityConfig] = js.undefined
  
  var kMapEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationConfig] = js.undefined
  
  var lDiversityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityConfig] = js.undefined
  
  var numericalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsConfig] = js.undefined
}
object SchemaGooglePrivacyDlpV2PrivacyMetric {
  
  inline def apply(): SchemaGooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrivacyMetric]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2PrivacyMetric](x: Self) {
    
    inline def setCategoricalStatsConfig(value: SchemaGooglePrivacyDlpV2CategoricalStatsConfig): Self = StObject.set(x, "categoricalStatsConfig", value.asInstanceOf[js.Any])
    
    inline def setCategoricalStatsConfigUndefined: Self = StObject.set(x, "categoricalStatsConfig", js.undefined)
    
    inline def setDeltaPresenceEstimationConfig(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = StObject.set(x, "deltaPresenceEstimationConfig", value.asInstanceOf[js.Any])
    
    inline def setDeltaPresenceEstimationConfigUndefined: Self = StObject.set(x, "deltaPresenceEstimationConfig", js.undefined)
    
    inline def setKAnonymityConfig(value: SchemaGooglePrivacyDlpV2KAnonymityConfig): Self = StObject.set(x, "kAnonymityConfig", value.asInstanceOf[js.Any])
    
    inline def setKAnonymityConfigUndefined: Self = StObject.set(x, "kAnonymityConfig", js.undefined)
    
    inline def setKMapEstimationConfig(value: SchemaGooglePrivacyDlpV2KMapEstimationConfig): Self = StObject.set(x, "kMapEstimationConfig", value.asInstanceOf[js.Any])
    
    inline def setKMapEstimationConfigUndefined: Self = StObject.set(x, "kMapEstimationConfig", js.undefined)
    
    inline def setLDiversityConfig(value: SchemaGooglePrivacyDlpV2LDiversityConfig): Self = StObject.set(x, "lDiversityConfig", value.asInstanceOf[js.Any])
    
    inline def setLDiversityConfigUndefined: Self = StObject.set(x, "lDiversityConfig", js.undefined)
    
    inline def setNumericalStatsConfig(value: SchemaGooglePrivacyDlpV2NumericalStatsConfig): Self = StObject.set(x, "numericalStatsConfig", value.asInstanceOf[js.Any])
    
    inline def setNumericalStatsConfigUndefined: Self = StObject.set(x, "numericalStatsConfig", js.undefined)
  }
}
