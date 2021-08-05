package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket extends StObject {
  
  /**
    * Total number of values in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of distinct values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.undefined
  
  /**
    * Sample of value frequencies in this bucket. The total number of values
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]] = js.undefined
  
  /**
    * Lower bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyLowerBound: js.UndefOr[String] = js.undefined
  
  /**
    * Upper bound on the value frequency of the values in this bucket.
    */
  var valueFrequencyUpperBound: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket {
  
  inline def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2CategoricalStatsHistogramBucket](x: Self) {
    
    inline def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    inline def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    inline def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    inline def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    inline def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2ValueFrequency*): Self = StObject.set(x, "bucketValues", js.Array(value :_*))
    
    inline def setValueFrequencyLowerBound(value: String): Self = StObject.set(x, "valueFrequencyLowerBound", value.asInstanceOf[js.Any])
    
    inline def setValueFrequencyLowerBoundUndefined: Self = StObject.set(x, "valueFrequencyLowerBound", js.undefined)
    
    inline def setValueFrequencyUpperBound(value: String): Self = StObject.set(x, "valueFrequencyUpperBound", value.asInstanceOf[js.Any])
    
    inline def setValueFrequencyUpperBoundUndefined: Self = StObject.set(x, "valueFrequencyUpperBound", js.undefined)
  }
}
