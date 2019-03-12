package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderColumnProps extends js.Object {
  // <th/> is element that get the 'other' properties
  var className: js.UndefOr[java.lang.String] = js.undefined
  // useful attributes passed to <th/>
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* column */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  var tooltipStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableHeaderColumnProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    columnNumber: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    onClick: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* column */ scala.Double) => scala.Unit = null,
    rowSpan: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tooltip: java.lang.String = null,
    tooltipStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
}

