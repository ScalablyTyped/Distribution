package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with constant width.
  */
@js.native
trait SchemaLinearBuckets extends js.Object {
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th linear bucket covers the interval   [offset + (i-1) * width,
    * offset + i * width) where i ranges from 1 to num_finite_buckets,
    * inclusive. Must be strictly positive.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaLinearBuckets {
  @scala.inline
  def apply(): SchemaLinearBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinearBuckets]
  }
  @scala.inline
  implicit class SchemaLinearBucketsOps[Self <: SchemaLinearBuckets] (val x: Self) extends AnyVal {
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
    def setNumFiniteBuckets(value: Double): Self = this.set("numFiniteBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumFiniteBuckets: Self = this.set("numFiniteBuckets", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

