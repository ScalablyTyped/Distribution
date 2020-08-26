package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTextString extends js.Object {
  var tooltip: TextString = js.native
}

object TooltipTextString {
  @scala.inline
  def apply(tooltip: TextString): TooltipTextString = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTextString]
  }
  @scala.inline
  implicit class TooltipTextStringOps[Self <: TooltipTextString] (val x: Self) extends AnyVal {
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
    def setTooltip(value: TextString): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

