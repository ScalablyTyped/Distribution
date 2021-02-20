package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Custom numeric bucketing result.
  */
@js.native
trait SchemaNumericBucketingResult extends StObject {
  
  /**
    * Count within each bucket. Its size is the length of
    * NumericBucketingOption.bucket_bounds plus 1.
    */
  var counts: js.UndefOr[js.Array[SchemaBucketizedCount]] = js.native
  
  /**
    * Stores the maximum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var maxValue: js.UndefOr[Double] = js.native
  
  /**
    * Stores the minimum value of the numeric field. Will be populated only if
    * [NumericBucketingOption.requires_min_max] is set to true.
    */
  var minValue: js.UndefOr[Double] = js.native
}
object SchemaNumericBucketingResult {
  
  @scala.inline
  def apply(): SchemaNumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericBucketingResult]
  }
  
  @scala.inline
  implicit class SchemaNumericBucketingResultMutableBuilder[Self <: SchemaNumericBucketingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounts(value: js.Array[SchemaBucketizedCount]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: SchemaBucketizedCount*): Self = StObject.set(x, "counts", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
