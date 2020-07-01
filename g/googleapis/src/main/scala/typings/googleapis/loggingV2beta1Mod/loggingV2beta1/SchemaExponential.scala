package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies an exponential sequence of buckets that have a width that is
  * proportional to the value of the lower bound. Each bucket represents a
  * constant relative uncertainty on a specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): scale * (growth_factor ^ i).
  * Lower bound (1 &lt;= i &lt; N): scale * (growth_factor ^ (i - 1)).
  */
@js.native
trait SchemaExponential extends js.Object {
  /**
    * Must be greater than 1.
    */
  var growthFactor: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var scale: js.UndefOr[Double] = js.native
}

object SchemaExponential {
  @scala.inline
  def apply(
    growthFactor: js.UndefOr[Double] = js.undefined,
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): SchemaExponential = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(growthFactor)) __obj.updateDynamic("growthFactor")(growthFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExponential]
  }
}

