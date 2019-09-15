package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.Anon_Locales
import typings.materialDashUi.datePickerMod.default
import typings.materialDashUi.materialDashUiStrings.`inline`
import typings.materialDashUi.materialDashUiStrings.dialog
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DatePickerNs.DatePickerProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.utils
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.TouchEvent
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, onKeyDown, style, id, className, onFocus, mode, disabled, type, rows */
object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.datePickerMod.default].asInstanceOf[String | js.Object]
  def apply(
    DateTimeFormat: Anon_Locales = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    container: dialog | `inline` = null,
    defaultDate: Date = null,
    defaultValue: String = null,
    dialogContainerStyle: CSSProperties = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    firstDayOfWeek: Int | Double = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    formatDate: /* date */ Date => String = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hideCalendarDate: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    inputStyle: CSSProperties = null,
    locale: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    okLabel: TagMod[Any] = null,
    onChange: (/* e */ js.Any, /* date */ Date) => Unit = null,
    onClick: TouchEvent[js.Object] => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    openToYearSelection: js.UndefOr[Boolean] = js.undefined,
    rowsMax: Int | Double = null,
    shouldDisableDate: /* day */ Date => Boolean = null,
    textFieldStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    utils: utils = null,
    value: Date = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (dialogContainerStyle != null) __obj.updateDynamic("dialogContainerStyle")(dialogContainerStyle)
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText)
    if (formatDate != null) __obj.updateDynamic("formatDate")(js.Any.fromFunction1(formatDate))
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (!js.isUndefined(hideCalendarDate)) __obj.updateDynamic("hideCalendarDate")(hideCalendarDate)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(openToYearSelection)) __obj.updateDynamic("openToYearSelection")(openToYearSelection)
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1(shouldDisableDate))
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (utils != null) __obj.updateDynamic("utils")(utils)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DatePickerProps
}

