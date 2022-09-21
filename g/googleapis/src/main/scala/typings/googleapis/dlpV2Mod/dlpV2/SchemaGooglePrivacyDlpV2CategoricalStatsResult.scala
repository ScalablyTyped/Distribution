package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CategoricalStatsResult extends StObject {
  
  /**
    * Histogram of value frequencies in the column.
    */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2CategoricalStatsResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CategoricalStatsResult](x: Self) {
    
    inline def setValueFrequencyHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = StObject.set(x, "valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    inline def setValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.undefined)
    
    inline def setValueFrequencyHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.Array(value*))
  }
}
