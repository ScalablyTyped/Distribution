package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[Double] = js.undefined
  var useLocalTimezone: js.UndefOr[Boolean] = js.undefined
}

object SchedulerCurrentTimeMarker {
  @scala.inline
  def apply(
    updateInterval: js.UndefOr[Double] = js.undefined,
    useLocalTimezone: js.UndefOr[Boolean] = js.undefined
  ): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateInterval)) __obj.updateDynamic("updateInterval")(updateInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalTimezone)) __obj.updateDynamic("useLocalTimezone")(useLocalTimezone.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
}

