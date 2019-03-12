package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectFieldProps extends js.Object {
  // <DropDownMenu/> is the element that get the 'other' properties
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  // useful attributes passed to <DropDownMenu/>
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropDownMenuProps: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs.DropDownMenuProps] = js.undefined
  var errorStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var floatingLabelFixed: js.UndefOr[scala.Boolean] = js.undefined
  var floatingLabelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var hintStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var hintText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var menuItemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var menuStyle: js.UndefOr[js.Any] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], 
      /* index */ scala.Double, 
      /* menuItemValue */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var openImmediately: js.UndefOr[scala.Boolean] = js.undefined
  var selectFieldRoot: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function1[/* value */ js.Any, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underlineDisabledStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underlineStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SelectFieldProps {
  @scala.inline
  def apply(
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropDownMenuProps: materialDashUiLib.underscoreUnderscoreMaterialUINs.MenusNs.DropDownMenuProps = null,
    errorStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    errorText: reactLib.reactMod.ReactNs.ReactNode = null,
    floatingLabelFixed: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    floatingLabelText: reactLib.reactMod.ReactNs.ReactNode = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    hintStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    hintText: reactLib.reactMod.ReactNs.ReactNode = null,
    iconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    id: java.lang.String = null,
    labelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    listStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    maxHeight: scala.Int | scala.Double = null,
    menuItemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    menuStyle: js.Any = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onChange: (/* e */ reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event], /* index */ scala.Double, /* menuItemValue */ js.Any) => scala.Unit = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    openImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    selectFieldRoot: reactLib.reactMod.ReactNs.CSSProperties = null,
    selectedMenuItemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    selectionRenderer: /* value */ js.Any => reactLib.reactMod.ReactNs.ReactNode = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    underlineDisabledStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    underlineFocusStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    underlineStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: js.Any = null
  ): SelectFieldProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropDownMenuProps != null) __obj.updateDynamic("dropDownMenuProps")(dropDownMenuProps)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately)
    if (selectFieldRoot != null) __obj.updateDynamic("selectFieldRoot")(selectFieldRoot)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SelectFieldProps]
  }
}

