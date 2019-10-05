package typings.griddleDashReact.griddleDashReactMod.components

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsToggleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object SettingsToggleProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit = null,
    style: CSSProperties = null,
    text: js.Any = null
  ): SettingsToggleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SettingsToggleProps]
  }
}

