package typings.materialDashUi.__MaterialUI

import typings.materialDashUi.Anon_Text
import typings.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typings.materialDashUi.__MaterialUI.Popover.PopoverProps
import typings.materialDashUi.__MaterialUI.propTypes.origin
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteProps[DataItem] extends TextFieldProps {
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  var dataSource: js.Array[DataItem]
  var dataSourceConfig: js.UndefOr[Anon_Text] = js.undefined
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[
    js.Function3[/* searchText */ String, /* key */ String, /* item */ DataItem, Boolean]
  ] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxSearchResults: js.UndefOr[Double] = js.undefined
  var menuCloseDelay: js.UndefOr[Double] = js.undefined
  var menuProps: js.UndefOr[js.Any] = js.undefined
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ Double, Unit]] = js.undefined
  var onUpdateInput: js.UndefOr[js.Function2[/* searchText */ String, /* dataSource */ js.Array[DataItem], Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var openOnFocus: js.UndefOr[Boolean] = js.undefined
  var popoverProps: js.UndefOr[PopoverProps] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply[DataItem](
    dataSource: js.Array[DataItem],
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClass[PopoverAnimationProps, ComponentState] = null,
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dataSourceConfig: Anon_Text = null,
    defaultValue: String | Double = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: ReactNode = null,
    filter: (/* searchText */ String, /* key */ String, /* item */ DataItem) => Boolean = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelShrinkStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: ReactNode = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: ReactNode = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    max: Int | Double = null,
    maxSearchResults: Int | Double = null,
    maxlength: String = null,
    menuCloseDelay: Int | Double = null,
    menuProps: js.Any = null,
    menuStyle: CSSProperties = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onChange: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onKeyPress: KeyboardEvent[js.Object] => Unit = null,
    onKeyUp: KeyboardEvent[js.Object] => Unit = null,
    onNewRequest: (/* chosenRequest */ DataItem, /* index */ Double) => Unit = null,
    onUpdateInput: (/* searchText */ String, /* dataSource */ js.Array[DataItem]) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openOnFocus: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popoverProps: PopoverProps = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    searchText: String = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    title: String = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: String | Double = null
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
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

