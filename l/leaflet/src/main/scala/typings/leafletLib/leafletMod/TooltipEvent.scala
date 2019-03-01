package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipEvent extends LeafletEvent {
  var tooltip: Tooltip
}

object TooltipEvent {
  @scala.inline
  def apply(target: js.Any, tooltip: Tooltip, `type`: java.lang.String): TooltipEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[TooltipEvent]
  }
}

