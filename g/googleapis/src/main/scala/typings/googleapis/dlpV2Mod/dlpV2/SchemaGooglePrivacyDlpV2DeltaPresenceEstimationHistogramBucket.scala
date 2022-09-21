package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends StObject {
  
  /**
    * Number of records within these probability bounds.
    */
  var bucketSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of distinct quasi-identifier tuple values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]] = js.undefined
  
  /**
    * Always greater than or equal to min_probability.
    */
  var maxProbability: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Between 0 and 1.
    */
  var minProbability: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket](x: Self) {
    
    inline def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeNull: Self = StObject.set(x, "bucketSize", null)
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    inline def setBucketValueCountNull: Self = StObject.set(x, "bucketValueCount", null)
    
    inline def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    inline def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    inline def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    inline def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues*): Self = StObject.set(x, "bucketValues", js.Array(value*))
    
    inline def setMaxProbability(value: Double): Self = StObject.set(x, "maxProbability", value.asInstanceOf[js.Any])
    
    inline def setMaxProbabilityNull: Self = StObject.set(x, "maxProbability", null)
    
    inline def setMaxProbabilityUndefined: Self = StObject.set(x, "maxProbability", js.undefined)
    
    inline def setMinProbability(value: Double): Self = StObject.set(x, "minProbability", value.asInstanceOf[js.Any])
    
    inline def setMinProbabilityNull: Self = StObject.set(x, "minProbability", null)
    
    inline def setMinProbabilityUndefined: Self = StObject.set(x, "minProbability", js.undefined)
  }
}
