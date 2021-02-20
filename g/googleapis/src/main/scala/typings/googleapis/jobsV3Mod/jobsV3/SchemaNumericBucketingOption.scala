package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Use this field to specify bucketing option for the histogram
  * search response.
  */
@js.native
trait SchemaNumericBucketingOption extends StObject {
  
  /**
    * Required.  Two adjacent values form a histogram bucket. Values should be
    * in ascending order. For example, if [5, 10, 15] are provided, four
    * buckets are created: (-inf, 5), 5, 10), [10, 15), [15, inf). At most 20
    * [buckets_bound is supported.
    */
  var bucketBounds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Optional.  If set to true, the histogram result includes minimum/maximum
    * value of the numeric field.
    */
  var requiresMinMax: js.UndefOr[Boolean] = js.native
}
object SchemaNumericBucketingOption {
  
  @scala.inline
  def apply(): SchemaNumericBucketingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericBucketingOption]
  }
  
  @scala.inline
  implicit class SchemaNumericBucketingOptionMutableBuilder[Self <: SchemaNumericBucketingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketBounds(value: js.Array[Double]): Self = StObject.set(x, "bucketBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketBoundsUndefined: Self = StObject.set(x, "bucketBounds", js.undefined)
    
    @scala.inline
    def setBucketBoundsVarargs(value: Double*): Self = StObject.set(x, "bucketBounds", js.Array(value :_*))
    
    @scala.inline
    def setRequiresMinMax(value: Boolean): Self = StObject.set(x, "requiresMinMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresMinMaxUndefined: Self = StObject.set(x, "requiresMinMax", js.undefined)
  }
}
