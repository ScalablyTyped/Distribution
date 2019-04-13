package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconMenuProps extends js.Object {
  // <Menu/> is the element that get the 'other' properties
  var anchorOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ]
  ] = js.undefined
  // Other properties from <Menu/>
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clickCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var desktop: js.UndefOr[scala.Boolean] = js.undefined
  var disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var iconButtonElement: reactLib.reactMod.ReactElement[materialDashUiLib.underscoreUnderscoreMaterialUINs.IconButton]
  var iconStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var initiallyKeyboardFocused: js.UndefOr[scala.Boolean] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var menuStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], 
      /* itemValue */ js.Any | js.Array[_], 
      scala.Unit
    ]
  ] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], scala.Unit]
  ] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], 
      /* item */ MenuItem, 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseDown: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onMouseUp: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
  var onRequestChange: js.UndefOr[
    js.Function2[/* opening */ scala.Boolean, /* reason */ java.lang.String, scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any | js.Array[_]] = js.undefined
}

object IconMenuProps {
  @scala.inline
  def apply(
    iconButtonElement: reactLib.reactMod.ReactElement[materialDashUiLib.underscoreUnderscoreMaterialUINs.IconButton],
    anchorOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animation: reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ] = null,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clickCloseDelay: scala.Int | scala.Double = null,
    desktop: js.UndefOr[scala.Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactLib.reactMod.CSSProperties = null,
    initiallyKeyboardFocused: js.UndefOr[scala.Boolean] = js.undefined,
    listStyle: reactLib.reactMod.CSSProperties = null,
    maxHeight: scala.Int | scala.Double = null,
    menuStyle: reactLib.reactMod.CSSProperties = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], /* itemValue */ js.Any | js.Array[_]) => scala.Unit = null,
    onClick: /* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event] => scala.Unit = null,
    onItemClick: (/* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], /* item */ MenuItem) => scala.Unit = null,
    onKeyboardFocus: (/* e */ reactLib.reactMod.FocusEvent[js.Object], /* isKeyboardFocused */ scala.Boolean) => scala.Unit = null,
    onMouseDown: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseUp: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onRequestChange: (/* opening */ scala.Boolean, /* reason */ java.lang.String) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    targetOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.Any | js.Array[_] = null
  ): IconMenuProps = {
    val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement)
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clickCloseDelay != null) __obj.updateDynamic("clickCloseDelay")(clickCloseDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconMenuProps]
  }
}

