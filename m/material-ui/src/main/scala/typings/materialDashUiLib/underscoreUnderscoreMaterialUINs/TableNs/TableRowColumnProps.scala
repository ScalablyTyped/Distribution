package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowColumnProps extends js.Object {
  // <td/> is element that get the 'other' properties
  var className: js.UndefOr[java.lang.String] = js.undefined
  // useful attributes passed to <td/>
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHover: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHoverExit: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableRowColumnProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    columnNumber: scala.Int | scala.Double = null,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    onClick: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* column */ scala.Double) => scala.Unit = null,
    onHover: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* column */ scala.Double) => scala.Unit = null,
    onHoverExit: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* column */ scala.Double) => scala.Unit = null,
    rowSpan: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableRowColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (key != null) __obj.updateDynamic("key")(key)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2(onHoverExit))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableRowColumnProps]
  }
}

