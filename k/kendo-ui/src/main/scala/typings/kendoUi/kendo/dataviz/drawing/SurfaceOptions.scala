package typings.kendoUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, Unit]] = js.native
  var height: js.UndefOr[String] = js.native
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, Unit]] = js.native
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[SurfaceTooltip] = js.native
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, Unit]] = js.native
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, Unit]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[String] = js.native
}

object SurfaceOptions {
  @scala.inline
  def apply(): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurfaceOptions]
  }
  @scala.inline
  implicit class SurfaceOptionsOps[Self <: SurfaceOptions] (val x: Self) extends AnyVal {
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
    def setClick(value: /* e */ SurfaceClickEvent => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMouseenter(value: /* e */ SurfaceMouseenterEvent => Unit): Self = this.set("mouseenter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseenter: Self = this.set("mouseenter", js.undefined)
    @scala.inline
    def setMouseleave(value: /* e */ SurfaceMouseleaveEvent => Unit): Self = this.set("mouseleave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseleave: Self = this.set("mouseleave", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTooltip(value: SurfaceTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipClose(value: /* e */ SurfaceTooltipCloseEvent => Unit): Self = this.set("tooltipClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipClose: Self = this.set("tooltipClose", js.undefined)
    @scala.inline
    def setTooltipOpen(value: /* e */ SurfaceTooltipOpenEvent => Unit): Self = this.set("tooltipOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTooltipOpen: Self = this.set("tooltipOpen", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

