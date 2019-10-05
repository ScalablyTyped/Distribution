package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[Double] = js.undefined
}

object GanttCurrentTimeMarker {
  @scala.inline
  def apply(updateInterval: Int | Double = null): GanttCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttCurrentTimeMarker]
  }
}

