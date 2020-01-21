package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Period
  */
@js.native
trait SchemaPricingSchedulePricingPeriod extends js.Object {
  /**
    * Pricing period end date. This date must be later than, or the same day
    * as, the pricing period start date, but not later than the placement end
    * date. The period end date can be the same date as the period start date.
    * If, for example, you set 6/25/2015 as both the start and end dates, the
    * effective pricing period date is just that day only, 6/25/2015. The
    * hours, minutes, and seconds of the end date should not be set, as doing
    * so will result in an error.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Comments for this pricing period.
    */
  var pricingComment: js.UndefOr[String] = js.native
  /**
    * Rate or cost of this pricing period in nanos (i.e., multipled by
    * 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive.
    */
  var rateOrCostNanos: js.UndefOr[String] = js.native
  /**
    * Pricing period start date. This date must be later than, or the same day
    * as, the placement start date. The hours, minutes, and seconds of the
    * start date should not be set, as doing so will result in an error.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Units of this pricing period. Acceptable values are 0 to 10000000000,
    * inclusive.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaPricingSchedulePricingPeriod {
  @scala.inline
  def apply(
    endDate: String = null,
    pricingComment: String = null,
    rateOrCostNanos: String = null,
    startDate: String = null,
    units: String = null
  ): SchemaPricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (pricingComment != null) __obj.updateDynamic("pricingComment")(pricingComment.asInstanceOf[js.Any])
    if (rateOrCostNanos != null) __obj.updateDynamic("rateOrCostNanos")(rateOrCostNanos.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPricingSchedulePricingPeriod]
  }
}

