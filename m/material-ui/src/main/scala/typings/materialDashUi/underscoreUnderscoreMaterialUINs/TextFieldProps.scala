package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.FormEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends js.Object {
  var autoComplete: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String | Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var errorStyle: js.UndefOr[CSSProperties] = js.undefined
  var errorText: js.UndefOr[ReactNode] = js.undefined
  var floatingLabelFixed: js.UndefOr[Boolean] = js.undefined
  var floatingLabelFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelShrinkStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.undefined
  var floatingLabelText: js.UndefOr[ReactNode] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var hintStyle: js.UndefOr[CSSProperties] = js.undefined
  var hintText: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxlength: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minlength: js.UndefOr[String] = js.undefined
  var multiLine: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* newValue */ String, Unit]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyPress: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var rowsMax: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textareaStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.undefined
  var underlineShow: js.UndefOr[Boolean] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[String | Double] = js.undefined
}

object TextFieldProps {
  @scala.inline
  def apply(
    autoComplete: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: String | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorStyle: CSSProperties = null,
    errorText: ReactNode = null,
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
    max: Int | Double = null,
    maxlength: String = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: FocusEventHandler[js.Object] = null,
    onChange: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit = null,
    onFocus: FocusEventHandler[js.Object] = null,
    onKeyDown: KeyboardEventHandler[js.Object] = null,
    onKeyPress: KeyboardEventHandler[js.Object] = null,
    onKeyUp: KeyboardEventHandler[js.Object] = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    rows: Int | Double = null,
    rowsMax: Int | Double = null,
    step: Int | Double = null,
    style: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    title: String = null,
    `type`: String = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: String | Double = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.asInstanceOf[js.Any])
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
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength)
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

