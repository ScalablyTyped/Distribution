package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A relative date range, specified by an offset and a duration. The supported
  * range of dates begins 30 days before today and ends today, i.e., the limits
  * for these values are: offset_days &gt;= 0 duration_days &gt;= 1 offset_days
  * + duration_days &lt;= 30
  */
@js.native
trait SchemaRelativeDateRange extends js.Object {
  /**
    * The number of days in the requested date range, e.g., for a range
    * spanning today: 1. For a range spanning the last 7 days: 7.
    */
  var durationDays: js.UndefOr[Double] = js.native
  /**
    * The end date of the filter set, specified as the number of days before
    * today, e.g., for a range where the last date is today: 0.
    */
  var offsetDays: js.UndefOr[Double] = js.native
}

object SchemaRelativeDateRange {
  @scala.inline
  def apply(durationDays: Int | Double = null, offsetDays: Int | Double = null): SchemaRelativeDateRange = {
    val __obj = js.Dynamic.literal()
    if (durationDays != null) __obj.updateDynamic("durationDays")(durationDays.asInstanceOf[js.Any])
    if (offsetDays != null) __obj.updateDynamic("offsetDays")(offsetDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRelativeDateRange]
  }
}

