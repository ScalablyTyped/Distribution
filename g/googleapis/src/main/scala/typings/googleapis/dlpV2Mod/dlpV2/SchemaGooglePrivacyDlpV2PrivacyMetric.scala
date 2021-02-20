package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Privacy metric to compute for reidentification risk analysis.
  */
@js.native
trait SchemaGooglePrivacyDlpV2PrivacyMetric extends StObject {
  
  var categoricalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsConfig] = js.native
  
  var deltaPresenceEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig] = js.native
  
  var kAnonymityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityConfig] = js.native
  
  var kMapEstimationConfig: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationConfig] = js.native
  
  var lDiversityConfig: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityConfig] = js.native
  
  var numericalStatsConfig: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsConfig] = js.native
}
object SchemaGooglePrivacyDlpV2PrivacyMetric {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2PrivacyMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PrivacyMetric]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2PrivacyMetricMutableBuilder[Self <: SchemaGooglePrivacyDlpV2PrivacyMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalStatsConfig(value: SchemaGooglePrivacyDlpV2CategoricalStatsConfig): Self = StObject.set(x, "categoricalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalStatsConfigUndefined: Self = StObject.set(x, "categoricalStatsConfig", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationConfig(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationConfig): Self = StObject.set(x, "deltaPresenceEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPresenceEstimationConfigUndefined: Self = StObject.set(x, "deltaPresenceEstimationConfig", js.undefined)
    
    @scala.inline
    def setKAnonymityConfig(value: SchemaGooglePrivacyDlpV2KAnonymityConfig): Self = StObject.set(x, "kAnonymityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKAnonymityConfigUndefined: Self = StObject.set(x, "kAnonymityConfig", js.undefined)
    
    @scala.inline
    def setKMapEstimationConfig(value: SchemaGooglePrivacyDlpV2KMapEstimationConfig): Self = StObject.set(x, "kMapEstimationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMapEstimationConfigUndefined: Self = StObject.set(x, "kMapEstimationConfig", js.undefined)
    
    @scala.inline
    def setLDiversityConfig(value: SchemaGooglePrivacyDlpV2LDiversityConfig): Self = StObject.set(x, "lDiversityConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDiversityConfigUndefined: Self = StObject.set(x, "lDiversityConfig", js.undefined)
    
    @scala.inline
    def setNumericalStatsConfig(value: SchemaGooglePrivacyDlpV2NumericalStatsConfig): Self = StObject.set(x, "numericalStatsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalStatsConfigUndefined: Self = StObject.set(x, "numericalStatsConfig", js.undefined)
  }
}
