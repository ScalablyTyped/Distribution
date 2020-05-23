package typings.materialUi.MaterialUI.Menus

import typings.materialUi.MaterialUI.ReactLink
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  // <List/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var desktop: js.UndefOr[Boolean] = js.undefined
  var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
  var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_], Unit]
  ] = js.undefined
  var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function2[/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem, Unit]
  ] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  var valueLink: js.UndefOr[ReactLink[_ | js.Array[_]]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ SyntheticEvent[js.Object, Event], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onEscKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[js.Object, Event], /* item */ MenuItem) => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    selectedMenuItemStyle: CSSProperties = null,
    style: CSSProperties = null,
    value: js.Any | js.Array[_] = null,
    valueLink: ReactLink[_ | js.Array[_]] = null,
    width: String | Double = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused.get.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(js.Any.fromFunction1(onEscKeyDown))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

