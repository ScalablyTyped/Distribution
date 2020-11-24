package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Histogram of value counts for a distribution.  Buckets have an inclusive
  * lower bound and exclusive upper bound and use &quot;1,2,5 bucketing&quot;:
  * The first bucket range is from [0,1) and all subsequent bucket boundaries
  * are powers of ten multiplied by 1, 2, or 5. Thus, bucket boundaries are 0,
  * 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, ... Negative values are not
  * supported.
  */
@js.native
trait SchemaHistogram extends js.Object {
  
  /**
    * Counts of values in each bucket. For efficiency, prefix and trailing
    * buckets with count = 0 are elided. Buckets can store the full range of
    * values of an unsigned long, with ULLONG_MAX falling into the 59th bucket
    * with range [1e19, 2e19).
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Starting index of first stored bucket. The non-inclusive upper-bound of
    * the ith bucket is given by:   pow(10,(i-first_bucket_offset)/3) *
    * (1,2,5)[(i-first_bucket_offset)%3]
    */
  var firstBucketOffset: js.UndefOr[Double] = js.native
}
object SchemaHistogram {
  
  @scala.inline
  def apply(): SchemaHistogram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogram]
  }
  
  @scala.inline
  implicit class SchemaHistogramOps[Self <: SchemaHistogram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketCountsVarargs(value: String*): Self = this.set("bucketCounts", js.Array(value :_*))
    
    @scala.inline
    def setBucketCounts(value: js.Array[String]): Self = this.set("bucketCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCounts: Self = this.set("bucketCounts", js.undefined)
    
    @scala.inline
    def setFirstBucketOffset(value: Double): Self = this.set("firstBucketOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBucketOffset: Self = this.set("firstBucketOffset", js.undefined)
  }
}
