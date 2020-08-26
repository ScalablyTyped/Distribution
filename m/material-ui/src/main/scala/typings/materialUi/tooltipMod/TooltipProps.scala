package typings.materialUi.tooltipMod

import typings.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typings.materialUi.MaterialUI.propTypes.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends Props[Tooltip] {
  var className: js.UndefOr[String] = js.native
  var horizontalPosition: js.UndefOr[tooltipHorizontal] = js.native
  var label: js.Any = js.native
  var show: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var touch: js.UndefOr[Boolean] = js.native
  var verticalPosition: js.UndefOr[vertical] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(label: js.Any): TooltipProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
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
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHorizontalPosition(value: tooltipHorizontal): Self = this.set("horizontalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalPosition: Self = this.set("horizontalPosition", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    @scala.inline
    def setVerticalPosition(value: vertical): Self = this.set("verticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalPosition: Self = this.set("verticalPosition", js.undefined)
  }
  
}

