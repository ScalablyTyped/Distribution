package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Histogram extends StObject {
  
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing buckets with count = 0 are elided. Buckets can store the full range of values of an unsigned long, with
    * ULLONG_MAX falling into the 59th bucket with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  
  /** Starting index of first stored bucket. The non-inclusive upper-bound of the ith bucket is given by: pow(10,(i-first_bucket_offset)/3) * (1,2,5)[(i-first_bucket_offset)%3] */
  var firstBucketOffset: js.UndefOr[Double] = js.native
}
object Histogram {
  
  @scala.inline
  def apply(): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Histogram]
  }
  
  @scala.inline
  implicit class HistogramMutableBuilder[Self <: Histogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketCounts(value: js.Array[String]): Self = StObject.set(x, "bucketCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketCountsUndefined: Self = StObject.set(x, "bucketCounts", js.undefined)
    
    @scala.inline
    def setBucketCountsVarargs(value: String*): Self = StObject.set(x, "bucketCounts", js.Array(value :_*))
    
    @scala.inline
    def setFirstBucketOffset(value: Double): Self = StObject.set(x, "firstBucketOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBucketOffsetUndefined: Self = StObject.set(x, "firstBucketOffset", js.undefined)
  }
}
