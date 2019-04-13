package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  // <tr/> is element that get the 'other' properties
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displayBorder: js.UndefOr[scala.Boolean] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var hovered: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* row */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var rowNumber: js.UndefOr[scala.Double] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var striped: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object TableRowProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    displayBorder: js.UndefOr[scala.Boolean] = js.undefined,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    hovered: js.UndefOr[scala.Boolean] = js.undefined,
    onCellClick: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHover: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onCellHoverExit: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    onRowClick: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double) => scala.Unit = null,
    onRowHover: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double) => scala.Unit = null,
    onRowHoverExit: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* row */ scala.Double) => scala.Unit = null,
    rowNumber: scala.Int | scala.Double = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    striped: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(displayBorder)) __obj.updateDynamic("displayBorder")(displayBorder)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction3(onCellClick))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction3(onCellHover))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction3(onCellHoverExit))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction2(onRowHover))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction2(onRowHoverExit))
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableRowProps]
  }
}

