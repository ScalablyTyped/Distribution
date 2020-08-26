package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayerTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapLayerTooltipAnimationClose] = js.native
  var open: js.UndefOr[MapLayerTooltipAnimationOpen] = js.native
}

object MapLayerTooltipAnimation {
  @scala.inline
  def apply(): MapLayerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerTooltipAnimation]
  }
  @scala.inline
  implicit class MapLayerTooltipAnimationOps[Self <: MapLayerTooltipAnimation] (val x: Self) extends AnyVal {
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
    def setClose(value: MapLayerTooltipAnimationClose): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setOpen(value: MapLayerTooltipAnimationOpen): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
  
}

