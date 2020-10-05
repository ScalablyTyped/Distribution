package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowColumnProps extends js.Object {
  // <td/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.native
  // useful attributes passed to <td/>
  var colSpan: js.UndefOr[Double] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onHover: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onHoverExit: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableRowColumnProps {
  @scala.inline
  def apply(): TableRowColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowColumnProps]
  }
  @scala.inline
  implicit class TableRowColumnPropsOps[Self <: TableRowColumnProps] (val x: Self) extends AnyVal {
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
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOnClick(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = this.set("onHover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnHoverExit(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit): Self = this.set("onHoverExit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHoverExit: Self = this.set("onHoverExit", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

