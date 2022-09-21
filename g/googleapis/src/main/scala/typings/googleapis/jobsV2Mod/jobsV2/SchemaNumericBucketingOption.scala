package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNumericBucketingOption extends StObject {
  
  /**
    * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10), [10, 15), [15, inf). At most 20 [buckets_bound is supported.
    */
  var bucketBounds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Optional. If set to true, the histogram result includes minimum/maximum value of the numeric field.
    */
  var requiresMinMax: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaNumericBucketingOption {
  
  inline def apply(): SchemaNumericBucketingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericBucketingOption]
  }
  
  extension [Self <: SchemaNumericBucketingOption](x: Self) {
    
    inline def setBucketBounds(value: js.Array[Double]): Self = StObject.set(x, "bucketBounds", value.asInstanceOf[js.Any])
    
    inline def setBucketBoundsNull: Self = StObject.set(x, "bucketBounds", null)
    
    inline def setBucketBoundsUndefined: Self = StObject.set(x, "bucketBounds", js.undefined)
    
    inline def setBucketBoundsVarargs(value: Double*): Self = StObject.set(x, "bucketBounds", js.Array(value*))
    
    inline def setRequiresMinMax(value: Boolean): Self = StObject.set(x, "requiresMinMax", value.asInstanceOf[js.Any])
    
    inline def setRequiresMinMaxNull: Self = StObject.set(x, "requiresMinMax", null)
    
    inline def setRequiresMinMaxUndefined: Self = StObject.set(x, "requiresMinMax", js.undefined)
  }
}
