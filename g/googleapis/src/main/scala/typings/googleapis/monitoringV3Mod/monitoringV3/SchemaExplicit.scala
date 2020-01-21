package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a set of buckets with arbitrary widths.There are size(bounds) + 1
  * (= N) buckets. Bucket i has the following boundaries:Upper bound (0 &lt;= i
  * &lt; N-1): boundsi  Lower bound (1 &lt;= i &lt; N); boundsi - 1The bounds
  * field must contain at least one element. If bounds has only one element,
  * then there are no finite buckets, and that single element is the common
  * boundary of the overflow and underflow buckets.
  */
@js.native
trait SchemaExplicit extends js.Object {
  /**
    * The values must be monotonically increasing.
    */
  var bounds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaExplicit {
  @scala.inline
  def apply(bounds: js.Array[Double] = null): SchemaExplicit = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExplicit]
  }
}

