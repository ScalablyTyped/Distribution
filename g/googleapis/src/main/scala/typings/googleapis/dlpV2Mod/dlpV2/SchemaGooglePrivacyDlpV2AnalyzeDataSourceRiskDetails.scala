package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of a risk analysis operation request.
  */
@js.native
trait SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends StObject {
  
  var categoricalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsResult] = js.native
  
  var deltaPresenceEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.native
  
  var kAnonymityResult: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityResult] = js.native
  
  var kMapEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationResult] = js.native
  
  var lDiversityResult: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityResult] = js.native
  
  var numericalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsResult] = js.native
  
  /**
    * Privacy metric to compute.
    */
  var requestedPrivacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.native
  
  /**
    * Input dataset to compute metrics over.
    */
  var requestedSourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.native
}
object SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsMutableBuilder[Self <: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalStatsResult(value: SchemaGooglePrivacyDlpV2CategoricalStatsResult): Self = StObject.set(x, "categoricalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalStatsResultUndefined: Self = StObject.set(x, "categoricalStatsResult", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationResult(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = StObject.set(x, "deltaPresenceEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPresenceEstimationResultUndefined: Self = StObject.set(x, "deltaPresenceEstimationResult", js.undefined)
    
    @scala.inline
    def setKAnonymityResult(value: SchemaGooglePrivacyDlpV2KAnonymityResult): Self = StObject.set(x, "kAnonymityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKAnonymityResultUndefined: Self = StObject.set(x, "kAnonymityResult", js.undefined)
    
    @scala.inline
    def setKMapEstimationResult(value: SchemaGooglePrivacyDlpV2KMapEstimationResult): Self = StObject.set(x, "kMapEstimationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMapEstimationResultUndefined: Self = StObject.set(x, "kMapEstimationResult", js.undefined)
    
    @scala.inline
    def setLDiversityResult(value: SchemaGooglePrivacyDlpV2LDiversityResult): Self = StObject.set(x, "lDiversityResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLDiversityResultUndefined: Self = StObject.set(x, "lDiversityResult", js.undefined)
    
    @scala.inline
    def setNumericalStatsResult(value: SchemaGooglePrivacyDlpV2NumericalStatsResult): Self = StObject.set(x, "numericalStatsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericalStatsResultUndefined: Self = StObject.set(x, "numericalStatsResult", js.undefined)
    
    @scala.inline
    def setRequestedPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "requestedPrivacyMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedPrivacyMetricUndefined: Self = StObject.set(x, "requestedPrivacyMetric", js.undefined)
    
    @scala.inline
    def setRequestedSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "requestedSourceTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedSourceTableUndefined: Self = StObject.set(x, "requestedSourceTable", js.undefined)
  }
}
