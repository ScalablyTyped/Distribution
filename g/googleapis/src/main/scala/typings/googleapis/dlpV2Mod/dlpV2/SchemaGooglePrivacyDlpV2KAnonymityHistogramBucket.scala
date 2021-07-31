package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket extends StObject {
  
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
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]] = js.undefined
  
  /**
    * Lower bound on the size of the equivalence classes in this bucket.
    */
  var equivalenceClassSizeLowerBound: js.UndefOr[String] = js.undefined
  
  /**
    * Upper bound on the size of the equivalence classes in this bucket.
    */
  var equivalenceClassSizeUpperBound: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityHistogramBucketMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KAnonymityHistogramBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    @scala.inline
    def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    @scala.inline
    def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass*): Self = StObject.set(x, "bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setEquivalenceClassSizeLowerBound(value: String): Self = StObject.set(x, "equivalenceClassSizeLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassSizeLowerBoundUndefined: Self = StObject.set(x, "equivalenceClassSizeLowerBound", js.undefined)
    
    @scala.inline
    def setEquivalenceClassSizeUpperBound(value: String): Self = StObject.set(x, "equivalenceClassSizeUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassSizeUpperBoundUndefined: Self = StObject.set(x, "equivalenceClassSizeUpperBound", js.undefined)
  }
}
