package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates numeric value that can be either absolute or relative.
  */
@js.native
trait SchemaFixedOrPercent extends js.Object {
  /**
    * [Output Only] Absolute value of VM instances calculated based on the
    * specific mode.    - If the value is fixed, then the caculated value is
    * equal to the fixed value.  - If the value is a percent, then the
    * calculated value is percent/100 * targetSize. For example, the calculated
    * value of a 80% of a managed instance group with 150 instances would be
    * (80/100 * 150) = 120 VM instances. If there is a remainder, the number is
    * rounded up.
    */
  var calculated: js.UndefOr[Double] = js.native
  /**
    * Specifies a fixed number of VM instances. This must be a positive
    * integer.
    */
  var fixed: js.UndefOr[Double] = js.native
  /**
    * Specifies a percentage of instances between 0 to 100%, inclusive. For
    * example, specify 80 for 80%.
    */
  var percent: js.UndefOr[Double] = js.native
}

object SchemaFixedOrPercent {
  @scala.inline
  def apply(calculated: Int | Double = null, fixed: Int | Double = null, percent: Int | Double = null): SchemaFixedOrPercent = {
    val __obj = js.Dynamic.literal()
    if (calculated != null) __obj.updateDynamic("calculated")(calculated.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFixedOrPercent]
  }
}

