package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteProps[DataItem] extends TextFieldProps {
  var anchorOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ]
  ] = js.undefined
  var dataSource: js.Array[DataItem]
  var dataSourceConfig: js.UndefOr[materialDashUiLib.Anon_Text] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    js.Function3[
      /* searchText */ java.lang.String, 
      /* key */ java.lang.String, 
      /* item */ DataItem, 
      scala.Boolean
    ]
  ] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var maxSearchResults: js.UndefOr[scala.Double] = js.undefined
  var menuCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var menuProps: js.UndefOr[js.Any] = js.undefined
  var menuStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ scala.Double, scala.Unit]] = js.undefined
  var onUpdateInput: js.UndefOr[
    js.Function2[/* searchText */ java.lang.String, /* dataSource */ js.Array[DataItem], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var openOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var popoverProps: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverProps] = js.undefined
  var searchText: js.UndefOr[java.lang.String] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply[DataItem](
    dataSource: js.Array[DataItem],
    anchorOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animation: reactLib.reactMod.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ComponentState
    ] = null,
    autoComplete: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dataSourceConfig: materialDashUiLib.Anon_Text = null,
    defaultValue: java.lang.String | scala.Double = null,
    disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorStyle: reactLib.reactMod.CSSProperties = null,
    errorText: reactLib.reactMod.ReactNode = null,
    filter: (/* searchText */ java.lang.String, /* key */ java.lang.String, /* item */ DataItem) => scala.Boolean = null,
    floatingLabelFixed: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelFocusStyle: reactLib.reactMod.CSSProperties = null,
    floatingLabelShrinkStyle: reactLib.reactMod.CSSProperties = null,
    floatingLabelStyle: reactLib.reactMod.CSSProperties = null,
    floatingLabelText: reactLib.reactMod.ReactNode = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    hintStyle: reactLib.reactMod.CSSProperties = null,
    hintText: reactLib.reactMod.ReactNode = null,
    id: java.lang.String = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    listStyle: reactLib.reactMod.CSSProperties = null,
    max: scala.Int | scala.Double = null,
    maxSearchResults: scala.Int | scala.Double = null,
    maxlength: java.lang.String = null,
    menuCloseDelay: scala.Int | scala.Double = null,
    menuProps: js.Any = null,
    menuStyle: reactLib.reactMod.CSSProperties = null,
    min: scala.Int | scala.Double = null,
    minlength: java.lang.String = null,
    multiLine: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onBlur: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onChange: (/* e */ reactLib.reactMod.FormEvent[js.Object], /* newValue */ java.lang.String) => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onNewRequest: (/* chosenRequest */ DataItem, /* index */ scala.Double) => scala.Unit = null,
    onUpdateInput: (/* searchText */ java.lang.String, /* dataSource */ js.Array[DataItem]) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popoverProps: materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverProps = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    rowsMax: scala.Int | scala.Double = null,
    searchText: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    targetOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    textFieldStyle: reactLib.reactMod.CSSProperties = null,
    textareaStyle: reactLib.reactMod.CSSProperties = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    underlineDisabledStyle: reactLib.reactMod.CSSProperties = null,
    underlineFocusStyle: reactLib.reactMod.CSSProperties = null,
    underlineShow: js.UndefOr[scala.Boolean] = js.undefined,
    underlineStyle: reactLib.reactMod.CSSProperties = null,
    value: java.lang.String | scala.Double = null
  ): AutoCompleteProps[DataItem] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource)
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataSourceConfig != null) __obj.updateDynamic("dataSourceConfig")(dataSourceConfig)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle)
    if (floatingLabelShrinkStyle != null) __obj.updateDynamic("floatingLabelShrinkStyle")(floatingLabelShrinkStyle)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxSearchResults != null) __obj.updateDynamic("maxSearchResults")(maxSearchResults.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength)
    if (menuCloseDelay != null) __obj.updateDynamic("menuCloseDelay")(menuCloseDelay.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength)
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onNewRequest != null) __obj.updateDynamic("onNewRequest")(js.Any.fromFunction2(onNewRequest))
    if (onUpdateInput != null) __obj.updateDynamic("onUpdateInput")(js.Any.fromFunction2(onUpdateInput))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openOnFocus)) __obj.updateDynamic("openOnFocus")(openOnFocus)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteProps[DataItem]]
  }
}

