package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  // <TextField/> is element that get the 'other' properties
  var autoOk: js.UndefOr[scala.Boolean] = js.undefined
  var cancelLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  // From <TextField />
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultTime: js.UndefOr[stdLib.Date] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var dialogBodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dialogStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var errorStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var errorText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var floatingLabelFixed: js.UndefOr[scala.Boolean] = js.undefined
  var floatingLabelFocusStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var floatingLabelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var format: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.ampm | materialDashUiLib.materialDashUiLibStrings.`24hr`
  ] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var hintStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var hintText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var minutesStep: js.UndefOr[scala.Double] = js.undefined
  var multiLine: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var okLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* time */ stdLib.Date, scala.Unit]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[js.Object]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pedantic: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
  var rowsMax: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var textareaStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[scala.Boolean] = js.undefined
  var underlineStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    autoOk: js.UndefOr[scala.Boolean] = js.undefined,
    cancelLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultTime: stdLib.Date = null,
    defaultValue: java.lang.String | scala.Double = null,
    dialogBodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dialogStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    errorText: reactLib.reactMod.ReactNs.ReactNode = null,
    floatingLabelFixed: js.UndefOr[scala.Boolean] = js.undefined,
    floatingLabelFocusStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    floatingLabelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    floatingLabelText: reactLib.reactMod.ReactNs.ReactNode = null,
    format: materialDashUiLib.materialDashUiLibStrings.ampm | materialDashUiLib.materialDashUiLibStrings.`24hr` = null,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    hintStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    hintText: reactLib.reactMod.ReactNs.ReactNode = null,
    id: java.lang.String = null,
    inputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    minutesStep: scala.Int | scala.Double = null,
    multiLine: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    okLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onChange: js.Function2[/* e */ js.Any, /* time */ stdLib.Date, scala.Unit] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[js.Object] = null,
    onDismiss: js.Function0[scala.Unit] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[js.Object] = null,
    onKeyDown: reactLib.reactMod.ReactNs.KeyboardEventHandler[js.Object] = null,
    onShow: js.Function0[scala.Unit] = null,
    pedantic: js.UndefOr[scala.Boolean] = js.undefined,
    rows: scala.Int | scala.Double = null,
    rowsMax: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    textFieldStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    textareaStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: java.lang.String = null,
    underlineDisabledStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    underlineFocusStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    underlineShow: js.UndefOr[scala.Boolean] = js.undefined,
    underlineStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: stdLib.Date = null
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
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

