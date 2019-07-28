package typings.materialDashUi.underscoreUnderscoreMaterialUINs.DatePickerNs

import typings.materialDashUi.Anon_Locales
import typings.materialDashUi.materialDashUiStrings.`inline`
import typings.materialDashUi.materialDashUiStrings.dialog
import typings.materialDashUi.materialDashUiStrings.landscape
import typings.materialDashUi.materialDashUiStrings.portrait
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.utils
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEventHandler
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  // <TextField/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Anon_Locales] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[ReactNode] = js.undefined
  // From <TextField />
  var className: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var defaultDate: js.UndefOr[Date] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var dialogContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorStyle: js.UndefOr[CSSProperties] = js.undefined
  var errorText: js.UndefOr[ReactNode] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[ReactNode] = js.undefined
  var formatDate: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hideCalendarDate: js.UndefOr[Boolean] = js.undefined
  var hintStyle: js.UndefOr[CSSProperties] = js.undefined
  var hintText: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var okLabel: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* date */ Date, Unit]] = js.undefined
  var onClick: js.UndefOr[TouchEventHandler[js.Object]] = js.undefined
   // e is always null
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsMax: js.UndefOr[Double] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[Boolean] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.utils] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    DateTimeFormat: Anon_Locales = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: ReactNode = null,
    className: String = null,
    container: dialog | `inline` = null,
    defaultDate: Date = null,
    defaultValue: String = null,
    dialogContainerStyle: CSSProperties = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: ReactNode = null,
    firstDayOfWeek: Int | Double = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: ReactNode = null,
    formatDate: /* date */ Date => String = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hideCalendarDate: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: ReactNode = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    locale: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    mode: portrait | landscape = null,
    name: String = null,
    okLabel: ReactNode = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onChange: (/* e */ js.Any, /* date */ Date) => Unit = null,
    onClick: TouchEventHandler[js.Object] = null,
    onDismiss: () => Unit = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onKeyDown: KeyboardEventHandler[js.Object] = null,
    onShow: () => Unit = null,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    shouldDisableDate: /* day */ Date => Boolean = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    utils: utils = null,
    value: Date = null
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

