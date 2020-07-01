package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. See CompensationInfo.  Decimal number.
  */
@js.native
trait SchemaExtendedCompensationInfoDecimal extends js.Object {
  /**
    * Micro (10^-6) units. The value must be between -999,999 and +999,999
    * inclusive. If `units` is positive, `micros` must be positive or zero. If
    * `units` is zero, `micros` can be positive, zero, or negative. If `units`
    * is negative, `micros` must be negative or zero. For example -1.75 is
    * represented as `units`=-1 and `micros`=-750,000.
    */
  var micros: js.UndefOr[Double] = js.native
  /**
    * Whole units.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaExtendedCompensationInfoDecimal {
  @scala.inline
  def apply(micros: js.UndefOr[Double] = js.undefined, units: String = null): SchemaExtendedCompensationInfoDecimal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(micros)) __obj.updateDynamic("micros")(micros.get.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtendedCompensationInfoDecimal]
  }
}

