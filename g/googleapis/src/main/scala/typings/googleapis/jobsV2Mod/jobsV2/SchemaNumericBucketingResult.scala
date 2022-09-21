package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNumericBucketingResult extends StObject {
  
  /**
    * Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus 1.
    */
  var counts: js.UndefOr[js.Array[SchemaBucketizedCount]] = js.undefined
  
  /**
    * Stores the maximum value of the numeric field. Will be populated only if [NumericBucketingOption.requires_min_max] is set to true.
    */
  var maxValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Stores the minimum value of the numeric field. Will be populated only if [NumericBucketingOption.requires_min_max] is set to true.
    */
  var minValue: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNumericBucketingResult {
  
  inline def apply(): SchemaNumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNumericBucketingResult]
  }
  
  extension [Self <: SchemaNumericBucketingResult](x: Self) {
    
    inline def setCounts(value: js.Array[SchemaBucketizedCount]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCountsVarargs(value: SchemaBucketizedCount*): Self = StObject.set(x, "counts", js.Array(value*))
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueNull: Self = StObject.set(x, "maxValue", null)
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueNull: Self = StObject.set(x, "minValue", null)
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
