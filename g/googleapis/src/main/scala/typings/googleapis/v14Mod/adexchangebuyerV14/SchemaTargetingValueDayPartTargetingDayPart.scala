package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueDayPartTargetingDayPart extends js.Object {
  var dayOfWeek: js.UndefOr[String] = js.native
  var endHour: js.UndefOr[Double] = js.native
  var endMinute: js.UndefOr[Double] = js.native
  var startHour: js.UndefOr[Double] = js.native
  var startMinute: js.UndefOr[Double] = js.native
}

object SchemaTargetingValueDayPartTargetingDayPart {
  @scala.inline
  def apply(
    dayOfWeek: String = null,
    endHour: js.UndefOr[Double] = js.undefined,
    endMinute: js.UndefOr[Double] = js.undefined,
    startHour: js.UndefOr[Double] = js.undefined,
    startMinute: js.UndefOr[Double] = js.undefined
  ): SchemaTargetingValueDayPartTargetingDayPart = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(endHour)) __obj.updateDynamic("endHour")(endHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endMinute)) __obj.updateDynamic("endMinute")(endMinute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startHour)) __obj.updateDynamic("startHour")(startHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startMinute)) __obj.updateDynamic("startMinute")(startMinute.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueDayPartTargetingDayPart]
  }
}

