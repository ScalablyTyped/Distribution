package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRowProps extends js.Object {
  // <tr/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.native
  var displayBorder: js.UndefOr[Boolean] = js.native
  var hoverable: js.UndefOr[Boolean] = js.native
  var hovered: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[
    js.Function3[
      /* e */ MouseEvent[js.Object, NativeMouseEvent], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[
    js.Function3[
      /* e */ MouseEvent[js.Object, NativeMouseEvent], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[
    js.Function3[
      /* e */ MouseEvent[js.Object, NativeMouseEvent], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
  ] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, Unit]
  ] = js.native
  var rowNumber: js.UndefOr[Double] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var striped: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableRowProps {
  @scala.inline
  def apply(): TableRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowProps]
  }
  @scala.inline
  implicit class TableRowPropsOps[Self <: TableRowProps] (val x: Self) extends AnyVal {
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
    def setDisplayBorder(value: Boolean): Self = this.set("displayBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayBorder: Self = this.set("displayBorder", js.undefined)
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    @scala.inline
    def setHovered(value: Boolean): Self = this.set("hovered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHovered: Self = this.set("hovered", js.undefined)
    @scala.inline
    def setOnCellClick(
      value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
    ): Self = this.set("onCellClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCellClick: Self = this.set("onCellClick", js.undefined)
    @scala.inline
    def setOnCellHover(
      value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
    ): Self = this.set("onCellHover", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCellHover: Self = this.set("onCellHover", js.undefined)
    @scala.inline
    def setOnCellHoverExit(
      value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double, /* column */ Double) => Unit
    ): Self = this.set("onCellHoverExit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnCellHoverExit: Self = this.set("onCellHoverExit", js.undefined)
    @scala.inline
    def setOnRowClick(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = this.set("onRowClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    @scala.inline
    def setOnRowHover(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = this.set("onRowHover", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRowHover: Self = this.set("onRowHover", js.undefined)
    @scala.inline
    def setOnRowHoverExit(value: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* row */ Double) => Unit): Self = this.set("onRowHoverExit", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRowHoverExit: Self = this.set("onRowHoverExit", js.undefined)
    @scala.inline
    def setRowNumber(value: Double): Self = this.set("rowNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNumber: Self = this.set("rowNumber", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

