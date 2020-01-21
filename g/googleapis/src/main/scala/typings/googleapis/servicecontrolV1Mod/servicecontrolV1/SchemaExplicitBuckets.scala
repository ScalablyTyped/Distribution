package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describing buckets with arbitrary user-provided width.
  */
@js.native
trait SchemaExplicitBuckets extends js.Object {
  /**
    * &#39;bound&#39; is a list of strictly increasing boundaries between
    * buckets. Note that a list of length N-1 defines N buckets because of
    * fenceposting. See comments on `bucket_options` for details.  The i&#39;th
    * finite bucket covers the interval   [bound[i-1], bound[i]) where i ranges
    * from 1 to bound_size() - 1. Note that there are no finite buckets at all
    * if &#39;bound&#39; only contains a single element; in that special case
    * the single bound defines the boundary between the underflow and overflow
    * buckets.  bucket number                   lower bound    upper bound  i
    * == 0 (underflow)              -inf           bound[i]  0 &lt; i &lt;
    * bound_size()            bound[i-1]     bound[i]  i == bound_size()
    * (overflow)    bound[i-1]     +inf
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaExplicitBuckets {
  @scala.inline
  def apply(bounds: js.Array[Double] = null): SchemaExplicitBuckets = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExplicitBuckets]
  }
}

