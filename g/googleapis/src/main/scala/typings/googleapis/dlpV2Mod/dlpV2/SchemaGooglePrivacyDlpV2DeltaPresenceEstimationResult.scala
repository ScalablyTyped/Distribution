package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of the δ-presence computation. Note that these results are an
  * estimation, not exact values.
  */
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult extends StObject {
  
  /**
    * The intervals [min_probability, max_probability) do not overlap. If a
    * value doesn&#39;t correspond to any such interval, the associated
    * frequency is zero. For example, the following records: {min_probability:
    * 0, max_probability: 0.1, frequency: 17}   {min_probability: 0.2,
    * max_probability: 0.3, frequency: 42}   {min_probability: 0.3,
    * max_probability: 0.4, frequency: 99} mean that there are no record with
    * an estimated probability in [0.1, 0.2) nor larger or equal to 0.4.
    */
  var deltaPresenceEstimationHistogram: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResultMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaPresenceEstimationHistogram(value: js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]): Self = StObject.set(x, "deltaPresenceEstimationHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaPresenceEstimationHistogramUndefined: Self = StObject.set(x, "deltaPresenceEstimationHistogram", js.undefined)
    
    @scala.inline
    def setDeltaPresenceEstimationHistogramVarargs(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket*): Self = StObject.set(x, "deltaPresenceEstimationHistogram", js.Array(value :_*))
  }
}
