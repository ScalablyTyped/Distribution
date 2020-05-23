package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowColumnProps extends js.Object {
  // <td/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.undefined
  // useful attributes passed to <td/>
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHover: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHoverExit: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double, Unit]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableRowColumnProps {
  @scala.inline
  def apply(
    className: String = null,
    colSpan: js.UndefOr[Double] = js.undefined,
    columnNumber: js.UndefOr[Double] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    onClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    onHover: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    onHoverExit: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): TableRowColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colSpan)) __obj.updateDynamic("colSpan")(colSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2(onHoverExit))
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowColumnProps]
  }
}

