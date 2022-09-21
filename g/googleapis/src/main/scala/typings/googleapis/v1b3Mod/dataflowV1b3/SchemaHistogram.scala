package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogram extends StObject {
  
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing buckets with count = 0 are elided. Buckets can store the full range of values of an unsigned long, with ULLONG_MAX falling into the 59th bucket with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Starting index of first stored bucket. The non-inclusive upper-bound of the ith bucket is given by: pow(10,(i-first_bucket_offset)/3) * (1,2,5)[(i-first_bucket_offset)%3]
    */
  var firstBucketOffset: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHistogram {
  
  inline def apply(): SchemaHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogram]
  }
  
  extension [Self <: SchemaHistogram](x: Self) {
    
    inline def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    inline def setBucketCountsNull: Self = StObject.set(x, "bucketCounts", null)
    
    inline def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    inline def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value*))
    
    inline def setFirstBucketOffset(value: Double): Self = StObject.set(x, "firstBucketOffset", value.asInstanceOf[js.Any])
    
    inline def setFirstBucketOffsetNull: Self = StObject.set(x, "firstBucketOffset", null)
    
    inline def setFirstBucketOffsetUndefined: Self = StObject.set(x, "firstBucketOffset", js.undefined)
  }
}
