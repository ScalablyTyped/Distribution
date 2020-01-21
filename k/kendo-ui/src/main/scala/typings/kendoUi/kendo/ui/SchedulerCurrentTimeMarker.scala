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
  def apply(updateInterval: Int | Double = null, useLocalTimezone: js.UndefOr[Boolean] = js.undefined): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalTimezone)) __obj.updateDynamic("useLocalTimezone")(useLocalTimezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
}

