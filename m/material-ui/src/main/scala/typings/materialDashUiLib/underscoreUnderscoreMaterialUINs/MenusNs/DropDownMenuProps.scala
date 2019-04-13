package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownMenuProps extends js.Object {
  // <div/> is the element that gets the 'other' properties
  var anchorOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var iconButton: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var menuItemStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var menuStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], 
      /* index */ scala.Double, 
      /* menuItemValue */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], scala.Unit]
  ] = js.undefined
  var openImmediately: js.UndefOr[scala.Boolean] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function2[/* value */ js.Any, /* menuItem */ js.Any, scala.Unit]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var underlineStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropDownMenuProps {
  @scala.inline
  def apply(
    anchorOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animation: reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconButton: reactLib.reactMod.ReactNode = null,
    iconStyle: reactLib.reactMod.CSSProperties = null,
    labelStyle: reactLib.reactMod.CSSProperties = null,
    listStyle: reactLib.reactMod.CSSProperties = null,
    maxHeight: scala.Int | scala.Double = null,
    menuItemStyle: reactLib.reactMod.CSSProperties = null,
    menuStyle: reactLib.reactMod.CSSProperties = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event], /* index */ scala.Double, /* menuItemValue */ js.Any) => scala.Unit = null,
    onClose: /* e */ reactLib.reactMod.SyntheticEvent[js.Object, reactLib.Event] => scala.Unit = null,
    openImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    selectedMenuItemStyle: reactLib.reactMod.CSSProperties = null,
    selectionRenderer: (/* value */ js.Any, /* menuItem */ js.Any) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    targetOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    underlineStyle: reactLib.reactMod.CSSProperties = null,
    value: js.Any = null
  ): DropDownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconButton != null) __obj.updateDynamic("iconButton")(iconButton.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction2(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DropDownMenuProps]
  }
}

