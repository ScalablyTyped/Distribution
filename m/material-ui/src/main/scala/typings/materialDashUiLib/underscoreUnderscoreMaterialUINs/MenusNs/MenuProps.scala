package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  // <List/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var desktop: js.UndefOr[scala.Boolean] = js.undefined
  var disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var initiallyKeyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], 
      /* itemValue */ js.Any | js.Array[_], 
      scala.Unit
    ]
  ] = js.undefined
  var onEscKeyDown: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object]] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], 
      /* item */ MenuItem, 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object]] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  var valueLink: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[_ | js.Array[_]]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    desktop: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    initiallyKeyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    maxHeight: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], /* itemValue */ js.Any | js.Array[_]) => scala.Unit = null,
    onEscKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onItemClick: (/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], /* item */ MenuItem) => scala.Unit = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    selectedMenuItemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Any | js.Array[_] = null,
    valueLink: materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[_ | js.Array[_]] = null,
    width: java.lang.String | scala.Double = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown)
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

