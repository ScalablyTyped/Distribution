package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Histogram extends StObject {
  
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing buckets with count = 0 are elided. Buckets can store the full range of values of an unsigned long, with
    * ULLONG_MAX falling into the 59th bucket with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Starting index of first stored bucket. The non-inclusive upper-bound of the ith bucket is given by: pow(10,(i-first_bucket_offset)/3) * (1,2,5)[(i-first_bucket_offset)%3] */
  var firstBucketOffset: js.UndefOr[Double] = js.undefined
}
object Histogram {
  
  inline def apply(): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Histogram]
  }
  
  extension [Self <: Histogram](x: Self) {
    
    inline def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    inline def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    inline def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value :_*))
    
    inline def setFirstBucketOffset(value: Double): Self = StObject.set(x, "firstBucketOffset", value.asInstanceOf[js.Any])
    
    inline def setFirstBucketOffsetUndefined: Self = StObject.set(x, "firstBucketOffset", js.undefined)
  }
}
