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
  def apply(
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaLinearBuckets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLinearBuckets]
  }
}

