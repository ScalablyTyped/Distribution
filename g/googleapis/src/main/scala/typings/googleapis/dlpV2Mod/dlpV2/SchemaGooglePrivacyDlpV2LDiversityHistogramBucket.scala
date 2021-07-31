package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2LDiversityHistogramBucket extends StObject {
  
  /**
    * Total number of equivalence classes in this bucket.
    */
  var bucketSize: js.UndefOr[String] = js.undefined
  
  /**
    * Total number of distinct equivalence classes in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.undefined
  
  /**
    * Sample of equivalence classes in this bucket. The total number of classes
    * returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]] = js.undefined
  
  /**
    * Lower bound on the sensitive value frequencies of the equivalence classes
    * in this bucket.
    */
  var sensitiveValueFrequencyLowerBound: js.UndefOr[String] = js.undefined
  
  /**
    * Upper bound on the sensitive value frequencies of the equivalence classes
    * in this bucket.
    */
  var sensitiveValueFrequencyUpperBound: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2LDiversityHistogramBucket {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityHistogramBucket]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityHistogramBucketMutableBuilder[Self <: SchemaGooglePrivacyDlpV2LDiversityHistogramBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    @scala.inline
    def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    @scala.inline
    def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass*): Self = StObject.set(x, "bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setSensitiveValueFrequencyLowerBound(value: String): Self = StObject.set(x, "sensitiveValueFrequencyLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveValueFrequencyLowerBoundUndefined: Self = StObject.set(x, "sensitiveValueFrequencyLowerBound", js.undefined)
    
    @scala.inline
    def setSensitiveValueFrequencyUpperBound(value: String): Self = StObject.set(x, "sensitiveValueFrequencyUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitiveValueFrequencyUpperBoundUndefined: Self = StObject.set(x, "sensitiveValueFrequencyUpperBound", js.undefined)
  }
}
