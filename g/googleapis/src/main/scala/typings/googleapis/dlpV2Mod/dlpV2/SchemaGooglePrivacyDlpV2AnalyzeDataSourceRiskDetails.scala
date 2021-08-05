package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of a risk analysis operation request.
  */
trait SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails extends StObject {
  
  var categoricalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2CategoricalStatsResult] = js.undefined
  
  var deltaPresenceEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult] = js.undefined
  
  var kAnonymityResult: js.UndefOr[SchemaGooglePrivacyDlpV2KAnonymityResult] = js.undefined
  
  var kMapEstimationResult: js.UndefOr[SchemaGooglePrivacyDlpV2KMapEstimationResult] = js.undefined
  
  var lDiversityResult: js.UndefOr[SchemaGooglePrivacyDlpV2LDiversityResult] = js.undefined
  
  var numericalStatsResult: js.UndefOr[SchemaGooglePrivacyDlpV2NumericalStatsResult] = js.undefined
  
  /**
    * Privacy metric to compute.
    */
  var requestedPrivacyMetric: js.UndefOr[SchemaGooglePrivacyDlpV2PrivacyMetric] = js.undefined
  
  /**
    * Input dataset to compute metrics over.
    */
  var requestedSourceTable: js.UndefOr[SchemaGooglePrivacyDlpV2BigQueryTable] = js.undefined
}
object SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails {
  
  inline def apply(): SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails](x: Self) {
    
    inline def setCategoricalStatsResult(value: SchemaGooglePrivacyDlpV2CategoricalStatsResult): Self = StObject.set(x, "categoricalStatsResult", value.asInstanceOf[js.Any])
    
    inline def setCategoricalStatsResultUndefined: Self = StObject.set(x, "categoricalStatsResult", js.undefined)
    
    inline def setDeltaPresenceEstimationResult(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult): Self = StObject.set(x, "deltaPresenceEstimationResult", value.asInstanceOf[js.Any])
    
    inline def setDeltaPresenceEstimationResultUndefined: Self = StObject.set(x, "deltaPresenceEstimationResult", js.undefined)
    
    inline def setKAnonymityResult(value: SchemaGooglePrivacyDlpV2KAnonymityResult): Self = StObject.set(x, "kAnonymityResult", value.asInstanceOf[js.Any])
    
    inline def setKAnonymityResultUndefined: Self = StObject.set(x, "kAnonymityResult", js.undefined)
    
    inline def setKMapEstimationResult(value: SchemaGooglePrivacyDlpV2KMapEstimationResult): Self = StObject.set(x, "kMapEstimationResult", value.asInstanceOf[js.Any])
    
    inline def setKMapEstimationResultUndefined: Self = StObject.set(x, "kMapEstimationResult", js.undefined)
    
    inline def setLDiversityResult(value: SchemaGooglePrivacyDlpV2LDiversityResult): Self = StObject.set(x, "lDiversityResult", value.asInstanceOf[js.Any])
    
    inline def setLDiversityResultUndefined: Self = StObject.set(x, "lDiversityResult", js.undefined)
    
    inline def setNumericalStatsResult(value: SchemaGooglePrivacyDlpV2NumericalStatsResult): Self = StObject.set(x, "numericalStatsResult", value.asInstanceOf[js.Any])
    
    inline def setNumericalStatsResultUndefined: Self = StObject.set(x, "numericalStatsResult", js.undefined)
    
    inline def setRequestedPrivacyMetric(value: SchemaGooglePrivacyDlpV2PrivacyMetric): Self = StObject.set(x, "requestedPrivacyMetric", value.asInstanceOf[js.Any])
    
    inline def setRequestedPrivacyMetricUndefined: Self = StObject.set(x, "requestedPrivacyMetric", js.undefined)
    
    inline def setRequestedSourceTable(value: SchemaGooglePrivacyDlpV2BigQueryTable): Self = StObject.set(x, "requestedSourceTable", value.asInstanceOf[js.Any])
    
    inline def setRequestedSourceTableUndefined: Self = StObject.set(x, "requestedSourceTable", js.undefined)
  }
}
