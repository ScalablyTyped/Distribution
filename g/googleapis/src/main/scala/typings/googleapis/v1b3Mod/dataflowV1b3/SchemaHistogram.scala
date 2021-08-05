package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Histogram of value counts for a distribution.  Buckets have an inclusive
  * lower bound and exclusive upper bound and use &quot;1,2,5 bucketing&quot;:
  * The first bucket range is from [0,1) and all subsequent bucket boundaries
  * are powers of ten multiplied by 1, 2, or 5. Thus, bucket boundaries are 0,
  * 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, ... Negative values are not
  * supported.
  */
trait SchemaHistogram extends StObject {
  
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing
    * buckets with count = 0 are elided. Buckets can store the full range of
    * values of an unsigned long, with ULLONG_MAX falling into the 59th bucket
    * with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Starting index of first stored bucket. The non-inclusive upper-bound of
    * the ith bucket is given by:   pow(10,(i-first_bucket_offset)/3) *
    * (1,2,5)[(i-first_bucket_offset)%3]
    */
  var firstBucketOffset: js.UndefOr[Double] = js.undefined
}
object SchemaHistogram {
  
  inline def apply(): SchemaHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogram]
  }
  
  extension [Self <: SchemaHistogram](x: Self) {
    
    inline def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    inline def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    inline def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value :_*))
    
    inline def setFirstBucketOffset(value: Double): Self = StObject.set(x, "firstBucketOffset", value.asInstanceOf[js.Any])
    
    inline def setFirstBucketOffsetUndefined: Self = StObject.set(x, "firstBucketOffset", js.undefined)
  }
}
