package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceTooltip extends js.Object {
  var animation: js.UndefOr[Boolean | SurfaceTooltipAnimation] = js.native
  var appendTo: js.UndefOr[String | JQuery] = js.native
}

object SurfaceTooltip {
  @scala.inline
  def apply(): SurfaceTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceTooltip]
  }
  @scala.inline
  implicit class SurfaceTooltipOps[Self <: SurfaceTooltip] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | SurfaceTooltipAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAppendTo(value: String | JQuery): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
  }
  
}

