package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceTooltipAnimation extends js.Object {
  var close: js.UndefOr[SurfaceTooltipAnimationClose] = js.native
  var open: js.UndefOr[SurfaceTooltipAnimationOpen] = js.native
}

object SurfaceTooltipAnimation {
  @scala.inline
  def apply(): SurfaceTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceTooltipAnimation]
  }
  @scala.inline
  implicit class SurfaceTooltipAnimationOps[Self <: SurfaceTooltipAnimation] (val x: Self) extends AnyVal {
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
    def setClose(value: SurfaceTooltipAnimationClose): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setOpen(value: SurfaceTooltipAnimationOpen): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

