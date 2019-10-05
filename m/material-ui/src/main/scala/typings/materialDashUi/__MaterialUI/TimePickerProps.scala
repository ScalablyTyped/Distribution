package typings.materialDashUi.__MaterialUI

import typings.materialDashUi.materialDashUiStrings.`24hr`
import typings.materialDashUi.materialDashUiStrings.ampm
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  // <TextField/> is element that get the 'other' properties
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[ReactNode] = js.undefined
  // From <TextField />
  var className: js.UndefOr[String] = js.undefined
  var defaultTime: js.UndefOr[Date] = js.undefined
  var defaultValue: js.UndefOr[String | Double] = js.undefined
  var dialogBodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var dialogStyle: js.UndefOr[CSSProperties] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorStyle: js.UndefOr[CSSProperties] = js.undefined
  var errorText: js.UndefOr[ReactNode] = js.undefined
  var floatingLabelFixed: js.UndefOr[Boolean] = js.undefined
  var floatingLabelFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[ReactNode] = js.undefined
  var format: js.UndefOr[ampm | `24hr`] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hintStyle: js.UndefOr[CSSProperties] = js.undefined
  var hintText: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var minutesStep: js.UndefOr[Double] = js.undefined
  var multiLine: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var okLabel: js.UndefOr[ReactNode] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* time */ Date, Unit]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var pedantic: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsMax: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[CSSProperties] = js.undefined
  var textareaStyle: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[Boolean] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: ReactNode = null,
    className: String = null,
    defaultTime: Date = null,
    defaultValue: String | Double = null,
    dialogBodyStyle: CSSProperties = null,
    dialogStyle: CSSProperties = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: ReactNode = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: ReactNode = null,
    format: ampm | `24hr` = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: ReactNode = null,
    id: String = null,
    inputStyle: CSSProperties = null,
    minutesStep: Int | Double = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    okLabel: ReactNode = null,
    onBlur: FocusEvent[js.Object] => Unit = null,
    onChange: (/* e */ js.Any, /* time */ Date) => Unit = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onDismiss: () => Unit = null,
    onFocus: FocusEvent[js.Object] => Unit = null,
    onKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onShow: () => Unit = null,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    style: CSSProperties = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: Date = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dialogBodyStyle != null) __obj.updateDynamic("dialogBodyStyle")(dialogBodyStyle)
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (minutesStep != null) __obj.updateDynamic("minutesStep")(minutesStep.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine)
    if (name != null) __obj.updateDynamic("name")(name)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerProps]
  }
}

