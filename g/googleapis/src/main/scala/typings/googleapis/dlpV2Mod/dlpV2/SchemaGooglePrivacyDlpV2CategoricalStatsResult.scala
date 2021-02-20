package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the categorical stats computation.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsResult extends StObject {
  
  /**
    * Histogram of value frequencies in the column.
    */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.native
}
object SchemaGooglePrivacyDlpV2CategoricalStatsResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CategoricalStatsResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CategoricalStatsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueFrequencyHistogramBuckets(value: js.Array[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = StObject.set(x, "valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFrequencyHistogramBucketsUndefined: Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.undefined)
    
    @scala.inline
    def setValueFrequencyHistogramBucketsVarargs(value: SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = StObject.set(x, "valueFrequencyHistogramBuckets", js.Array(value :_*))
  }
}
