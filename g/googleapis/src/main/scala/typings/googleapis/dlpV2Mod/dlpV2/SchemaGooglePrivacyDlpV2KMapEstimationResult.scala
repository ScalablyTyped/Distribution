package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the reidentifiability analysis. Note that these results are an
  * estimation, not exact values.
  */
trait SchemaGooglePrivacyDlpV2KMapEstimationResult extends StObject {
  
  /**
    * The intervals [min_anonymity, max_anonymity] do not overlap. If a value
    * doesn&#39;t correspond to any such interval, the associated frequency is
    * zero. For example, the following records:   {min_anonymity: 1,
    * max_anonymity: 1, frequency: 17}   {min_anonymity: 2, max_anonymity: 3,
    * frequency: 42}   {min_anonymity: 5, max_anonymity: 10, frequency: 99}
    * mean that there are no record with an estimated anonymity of 4, 5, or
    * larger than 10.
    */
  var kMapEstimationHistogram: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2KMapEstimationResult {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KMapEstimationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationResult]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KMapEstimationResult](x: Self) {
    
    inline def setKMapEstimationHistogram(value: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]): Self = StObject.set(x, "kMapEstimationHistogram", value.asInstanceOf[js.Any])
    
    inline def setKMapEstimationHistogramUndefined: Self = StObject.set(x, "kMapEstimationHistogram", js.undefined)
    
    inline def setKMapEstimationHistogramVarargs(value: SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket*): Self = StObject.set(x, "kMapEstimationHistogram", js.Array(value :_*))
  }
}
