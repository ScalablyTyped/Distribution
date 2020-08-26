package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipEvent extends LeafletEvent {
  var tooltip: Tooltip_ = js.native
}

object TooltipEvent {
  @scala.inline
  def apply(
    layer: js.Any,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    tooltip: Tooltip_,
    `type`: String
  ): TooltipEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipEvent]
  }
  @scala.inline
  implicit class TooltipEventOps[Self <: TooltipEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTooltip(value: Tooltip_): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

