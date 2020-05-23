package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderColumnProps extends js.Object {
  // <th/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.undefined
  // useful attributes passed to <th/>
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tooltipStyle: js.UndefOr[CSSProperties] = js.undefined
}

object TableHeaderColumnProps {
  @scala.inline
  def apply(
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    columnNumber: js.UndefOr[Double] = js.undefined,
    key: String = null,
    onClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    tooltip: String = null,
    tooltipStyle: CSSProperties = null
  ): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
}

