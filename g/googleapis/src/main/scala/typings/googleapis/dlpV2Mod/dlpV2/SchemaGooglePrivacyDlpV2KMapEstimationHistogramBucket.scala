package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A KMapEstimationHistogramBucket message with the following values:
  * min_anonymity: 3   max_anonymity: 5   frequency: 42 means that there are 42
  * records whose quasi-identifier values correspond to 3, 4 or 5 people in the
  * overlying population. An important particular case is when min_anonymity =
  * max_anonymity = 1: the frequency field then corresponds to the number of
  * uniquely identifiable records.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket extends StObject {
  
  /**
    * Number of records within these anonymity bounds.
    */
  var bucketSize: js.UndefOr[String] = js.native
  
  /**
    * Total number of distinct quasi-identifier tuple values in this bucket.
    */
  var bucketValueCount: js.UndefOr[String] = js.native
  
  /**
    * Sample of quasi-identifier tuple values in this bucket. The total number
    * of classes returned per bucket is capped at 20.
    */
  var bucketValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]] = js.native
  
  /**
    * Always greater than or equal to min_anonymity.
    */
  var maxAnonymity: js.UndefOr[String] = js.native
  
  /**
    * Always positive.
    */
  var minAnonymity: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucketMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KMapEstimationHistogramBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: String): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setBucketValueCount(value: String): Self = StObject.set(x, "bucketValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValueCountUndefined: Self = StObject.set(x, "bucketValueCount", js.undefined)
    
    @scala.inline
    def setBucketValues(value: js.Array[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]): Self = StObject.set(x, "bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketValuesUndefined: Self = StObject.set(x, "bucketValues", js.undefined)
    
    @scala.inline
    def setBucketValuesVarargs(value: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues*): Self = StObject.set(x, "bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setMaxAnonymity(value: String): Self = StObject.set(x, "maxAnonymity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAnonymityUndefined: Self = StObject.set(x, "maxAnonymity", js.undefined)
    
    @scala.inline
    def setMinAnonymity(value: String): Self = StObject.set(x, "minAnonymity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAnonymityUndefined: Self = StObject.set(x, "minAnonymity", js.undefined)
  }
}
