package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipCont extends js.Object {
  var tooltip: Cont = js.native
}

object TooltipCont {
  @scala.inline
  def apply(tooltip: Cont): TooltipCont = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipCont]
  }
  @scala.inline
  implicit class TooltipContOps[Self <: TooltipCont] (val x: Self) extends AnyVal {
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
    def setTooltip(value: Cont): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

