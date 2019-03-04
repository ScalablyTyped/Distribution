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
    val __obj = js.Dynamic.literal(target = target, tooltip = tooltip)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TooltipEvent]
  }
}

