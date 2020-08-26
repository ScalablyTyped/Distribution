package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChipProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  var deleteIconStyle: js.UndefOr[CSSProperties] = js.native
  var labelColor: js.UndefOr[String] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var onClick: js.UndefOr[MouseEventHandler[Chip]] = js.native
  var onRequestDelete: js.UndefOr[TouchEventHandler[Chip]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ChipProps {
  @scala.inline
  def apply(): ChipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChipProps]
  }
  @scala.inline
  implicit class ChipPropsOps[Self <: ChipProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerElement(value: ReactNode | String): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    @scala.inline
    def setDeleteIconStyle(value: CSSProperties): Self = this.set("deleteIconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconStyle: Self = this.set("deleteIconStyle", js.undefined)
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[Chip, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnRequestDelete(value: TouchEvent[Chip] => Unit): Self = this.set("onRequestDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRequestDelete: Self = this.set("onRequestDelete", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

