package typings.atHigButton.atHigButtonMod

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /** Prevents user interaction with the button */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A @hig/icon element */
  var icon: js.UndefOr[Element] = js.undefined
  /** Sets the link of a button */
  var link: js.UndefOr[String] = js.undefined
  /** Triggers blur when focus is moved away from icon */
  var onBlur: js.UndefOr[Callback] = js.undefined
  /** Triggers when you click the button */
  var onClick: js.UndefOr[Callback] = js.undefined
  /** Triggers when focus is moved to button */
  var onFocus: js.UndefOr[Callback] = js.undefined
  /** Triggers when you hover over the button */
  var onHover: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is pressed over the button */
  var onMouseDown: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is over the button */
  var onMouseEnter: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is no longer over the button */
  var onMouseLeave: js.UndefOr[Callback] = js.undefined
  /** Triggers when the user's mouse is no longer pressed over the button */
  var onMouseUp: js.UndefOr[Callback] = js.undefined
  /** Adds custom/overriding styles */
  var stylesheet: js.UndefOr[js.Any] = js.undefined
  /** Specifies where to display the linked URL */
  var target: js.UndefOr[AvailableTargets] = js.undefined
  /** Sets the title of a button */
  var title: String
  /** Specifies type of button */
  var `type`: js.UndefOr[AvailableTypes] = js.undefined
  /** Specifies width of button */
  var width: js.UndefOr[AvailableWidths] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    title: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Element = null,
    link: String = null,
    onBlur: () => Unit = null,
    onClick: () => Unit = null,
    onFocus: () => Unit = null,
    onHover: () => Unit = null,
    onMouseDown: () => Unit = null,
    onMouseEnter: () => Unit = null,
    onMouseLeave: () => Unit = null,
    onMouseUp: () => Unit = null,
    stylesheet: js.Any = null,
    target: AvailableTargets = null,
    `type`: AvailableTypes = null,
    width: AvailableWidths = null
  ): Props = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (link != null) __obj.updateDynamic("link")(link)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction0(onHover))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction0(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction0(onMouseUp))
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Props]
  }
}

