package typings.griddleDashReact.griddleDashReactMod.components

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var Cell: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
  var griddleKey: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    Cell: js.Any = null,
    className: String = null,
    columnIds: js.Array[Double] = null,
    griddleKey: String = null,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    if (Cell != null) __obj.updateDynamic("Cell")(Cell.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnIds != null) __obj.updateDynamic("columnIds")(columnIds.asInstanceOf[js.Any])
    if (griddleKey != null) __obj.updateDynamic("griddleKey")(griddleKey.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

