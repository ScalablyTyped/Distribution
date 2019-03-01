package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
  var useLocalTimezone: js.UndefOr[scala.Boolean] = js.undefined
}

object SchedulerCurrentTimeMarker {
  @scala.inline
  def apply(
    updateInterval: scala.Int | scala.Double = null,
    useLocalTimezone: js.UndefOr[scala.Boolean] = js.undefined
  ): SchedulerCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalTimezone)) __obj.updateDynamic("useLocalTimezone")(useLocalTimezone)
    __obj.asInstanceOf[SchedulerCurrentTimeMarker]
  }
}

