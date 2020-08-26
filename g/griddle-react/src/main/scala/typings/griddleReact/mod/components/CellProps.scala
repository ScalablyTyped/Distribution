package typings.griddleReact.mod.components

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var columnId: js.UndefOr[String] = js.native
  var griddleKey: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object CellProps {
  @scala.inline
  def apply(): CellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellProps]
  }
  @scala.inline
  implicit class CellPropsOps[Self <: CellProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColumnId(value: String): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnId: Self = this.set("columnId", js.undefined)
    @scala.inline
    def setGriddleKey(value: Double): Self = this.set("griddleKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGriddleKey: Self = this.set("griddleKey", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

