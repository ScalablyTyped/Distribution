package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a linear sequence of buckets that all have the same width (except
  * overflow and underflow). Each bucket represents a constant absolute
  * uncertainty on the specific value in the bucket.There are
  * num_finite_buckets + 2 (= N) buckets. Bucket i has the following
  * boundaries:Upper bound (0 &lt;= i &lt; N-1): offset + (width * i).  Lower
  * bound (1 &lt;= i &lt; N): offset + (width * (i - 1)).
  */
@js.native
trait SchemaLinear extends js.Object {
  /**
    * Must be greater than 0.
    */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  /**
    * Lower bound of the first bucket.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Must be greater than 0.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaLinear {
  @scala.inline
  def apply(
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): SchemaLinear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLinear]
  }
}

