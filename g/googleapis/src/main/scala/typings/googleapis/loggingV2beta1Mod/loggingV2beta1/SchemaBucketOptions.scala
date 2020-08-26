package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BucketOptions describes the bucket boundaries used to create a histogram
  * for the distribution. The buckets can be in a linear sequence, an
  * exponential sequence, or each bucket can be specified explicitly.
  * BucketOptions does not include the number of values in each bucket.A bucket
  * has an inclusive lower bound and exclusive upper bound for the values that
  * are counted for that bucket. The upper bound of a bucket must be strictly
  * greater than the lower bound. The sequence of N buckets for a distribution
  * consists of an underflow bucket (number 0), zero or more finite buckets
  * (number 1 through N - 2) and an overflow bucket (number N - 1). The buckets
  * are contiguous: the lower bound of bucket i (i &gt; 0) is the same as the
  * upper bound of bucket i - 1. The buckets span the whole range of finite
  * values: lower bound of the underflow bucket is -infinity and the upper
  * bound of the overflow bucket is +infinity. The finite buckets are so-called
  * because both bounds are finite.
  */
@js.native
trait SchemaBucketOptions extends js.Object {
  /**
    * The explicit buckets.
    */
  var explicitBuckets: js.UndefOr[SchemaExplicit] = js.native
  /**
    * The exponential buckets.
    */
  var exponentialBuckets: js.UndefOr[SchemaExponential] = js.native
  /**
    * The linear bucket.
    */
  var linearBuckets: js.UndefOr[SchemaLinear] = js.native
}

object SchemaBucketOptions {
  @scala.inline
  def apply(): SchemaBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketOptions]
  }
  @scala.inline
  implicit class SchemaBucketOptionsOps[Self <: SchemaBucketOptions] (val x: Self) extends AnyVal {
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
    def setExplicitBuckets(value: SchemaExplicit): Self = this.set("explicitBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitBuckets: Self = this.set("explicitBuckets", js.undefined)
    @scala.inline
    def setExponentialBuckets(value: SchemaExponential): Self = this.set("exponentialBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentialBuckets: Self = this.set("exponentialBuckets", js.undefined)
    @scala.inline
    def setLinearBuckets(value: SchemaLinear): Self = this.set("linearBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinearBuckets: Self = this.set("linearBuckets", js.undefined)
  }
  
}

