package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket extends StObject {
  
  /**
    * Number of records within these anonymity bounds.
    */
  var bucketSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of distinct quasi-identifier tuple values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]] = js.undefined
  
  /**
    * Always greater than or equal to min_anonymity.
    */
  var maxAnonymity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Always positive.
    */
  var minAnonymity: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket {
  
  inline def apply(): SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket](x: Self) {
    
    inline def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeNull: Self = StObject.set(x, "bucketSize", null)
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    inline def setBucketValueCountNull: Self = StObject.set(x, "bucketValueCount", null)
    
    inline def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    inline def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    inline def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    inline def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues*): Self = StObject.set(x, "bucketValues", js.Array(value*))
    
    inline def setMaxAnonymity(value: String): Self = StObject.set(x, "maxAnonymity", value.asInstanceOf[js.Any])
    
    inline def setMaxAnonymityNull: Self = StObject.set(x, "maxAnonymity", null)
    
    inline def setMaxAnonymityUndefined: Self = StObject.set(x, "maxAnonymity", js.undefined)
    
    inline def setMinAnonymity(value: String): Self = StObject.set(x, "minAnonymity", value.asInstanceOf[js.Any])
    
    inline def setMinAnonymityNull: Self = StObject.set(x, "minAnonymity", null)
    
    inline def setMinAnonymityUndefined: Self = StObject.set(x, "minAnonymity", js.undefined)
  }
}
