package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[Double] = js.undefined
}

object GanttCurrentTimeMarker {
  @scala.inline
  def apply(updateInterval: js.UndefOr[Double] = js.undefined): GanttCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(updateInterval)) __obj.updateDynamic("updateInterval")(updateInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttCurrentTimeMarker]
  }
}

