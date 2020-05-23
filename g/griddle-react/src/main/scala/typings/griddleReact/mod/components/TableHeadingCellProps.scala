package typings.griddleReact.mod.components

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadingCellProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columnId: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[js.Any] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object TableHeadingCellProps {
  @scala.inline
  def apply(
    className: String = null,
    columnId: js.UndefOr[Double] = js.undefined,
    icon: js.Any = null,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null,
    title: String = null
  ): TableHeadingCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(columnId)) __obj.updateDynamic("columnId")(columnId.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingCellProps]
  }
}

