package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with exponentially growing width.
  */
@js.native
trait SchemaExponentialBuckets extends js.Object {
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be larger than 1.0.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * The number of finite buckets. With the underflow and overflow buckets,
    * the total number of buckets is `num_finite_buckets` + 2. See comments on
    * `bucket_options` for details.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * The i&#39;th exponential bucket covers the interval   [scale *
    * growth_factor^(i-1), scale * growth_factor^i) where i ranges from 1 to
    * num_finite_buckets inclusive. Must be &gt; 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object SchemaExponentialBuckets {
  @scala.inline
  def apply(
    growthFactor: js.UndefOr[Double] = js.undefined,
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): SchemaExponentialBuckets = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(growthFactor)) __obj.updateDynamic("growthFactor")(growthFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExponentialBuckets]
  }
}

