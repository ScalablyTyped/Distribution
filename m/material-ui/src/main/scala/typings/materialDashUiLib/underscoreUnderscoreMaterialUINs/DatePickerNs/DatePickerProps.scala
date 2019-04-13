package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[materialDashUiLib.Anon_Locales] = js.undefined
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  // From <TextField />
  var className: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.dialog | materialDashUiLib.materialDashUiLibStrings.`inline`
  ] = js.undefined
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var dialogContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var disableYearSelection: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  var floatingLabelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var formatDate: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var hideCalendarDate: js.UndefOr[scala.Boolean] = js.undefined
  var hintStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var hintText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var mode: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.portrait | materialDashUiLib.materialDashUiLibStrings.landscape
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var okLabel: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.TouchEventHandler[js.Object]] = js.undefined
   // e is always null
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsMax: js.UndefOr[scala.Double] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ stdLib.Date, scala.Boolean]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[scala.Boolean] = js.undefined
  var underlineStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var utils: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.utils] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    DateTimeFormat: materialDashUiLib.Anon_Locales = null,
    autoOk: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    container: materialDashUiLib.materialDashUiLibStrings.dialog | materialDashUiLib.materialDashUiLibStrings.`inline` = null,
    defaultDate: stdLib.Date = null,
    defaultValue: java.lang.String = null,
    dialogContainerStyle: reactLib.reactMod.CSSProperties = null,
    disableYearSelection: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorStyle: reactLib.reactMod.CSSProperties = null,
    errorText: reactLib.reactMod.ReactNode = null,
    firstDayOfWeek: scala.Int | scala.Double = null,
    floatingLabelStyle: reactLib.reactMod.CSSProperties = null,
    floatingLabelText: reactLib.reactMod.ReactNode = null,
    formatDate: /* date */ stdLib.Date => java.lang.String = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    hideCalendarDate: js.UndefOr[scala.Boolean] = js.undefined,
    hintStyle: reactLib.reactMod.CSSProperties = null,
    hintText: reactLib.reactMod.ReactNode = null,
    id: java.lang.String = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    locale: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    mode: materialDashUiLib.materialDashUiLibStrings.portrait | materialDashUiLib.materialDashUiLibStrings.landscape = null,
    name: java.lang.String = null,
    okLabel: reactLib.reactMod.ReactNode = null,
    onBlur: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onChange: (/* e */ js.Any, /* date */ stdLib.Date) => scala.Unit = null,
    onClick: reactLib.reactMod.TouchEventHandler[js.Object] = null,
    onDismiss: () => scala.Unit = null,
    onFocus: reactLib.reactMod.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[js.Object] = null,
    onShow: () => scala.Unit = null,
    rows: scala.Int | scala.Double = null,
    rowsMax: scala.Int | scala.Double = null,
    shouldDisableDate: /* day */ stdLib.Date => scala.Boolean = null,
    style: reactLib.reactMod.CSSProperties = null,
    textFieldStyle: reactLib.reactMod.CSSProperties = null,
    `type`: java.lang.String = null,
    underlineDisabledStyle: reactLib.reactMod.CSSProperties = null,
    underlineFocusStyle: reactLib.reactMod.CSSProperties = null,
    underlineShow: js.UndefOr[scala.Boolean] = js.undefined,
    underlineStyle: reactLib.reactMod.CSSProperties = null,
    utils: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.utils = null,
    value: stdLib.Date = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (dialogContainerStyle != null) __obj.updateDynamic("dialogContainerStyle")(dialogContainerStyle)
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction1(formatDate))
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (!js.isUndefined(hideCalendarDate)) __obj.updateDynamic("hideCalendarDate")(hideCalendarDate)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (style != null) __obj.updateDynamic("style")(style)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (utils != null) __obj.updateDynamic("utils")(utils)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatePickerProps]
  }
}

