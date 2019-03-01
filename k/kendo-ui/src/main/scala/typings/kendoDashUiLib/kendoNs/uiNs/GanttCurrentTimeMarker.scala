package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttCurrentTimeMarker extends js.Object {
  var updateInterval: js.UndefOr[scala.Double] = js.undefined
}

object GanttCurrentTimeMarker {
  @scala.inline
  def apply(updateInterval: scala.Int | scala.Double = null): GanttCurrentTimeMarker = {
    val __obj = js.Dynamic.literal()
    if (updateInterval != null) __obj.updateDynamic("updateInterval")(updateInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttCurrentTimeMarker]
  }
}

