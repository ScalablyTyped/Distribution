package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.timePickerMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TimePickerProps
import typings.react.reactMod.CSSProperties
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: format, onBlur, name, onClick, onKeyDown, style, id, className, onFocus, disabled, type, defaultValue, rows */
object TimePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.timePickerMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: TagMod[Any] = null,
    defaultTime: Date = null,
    dialogBodyStyle: CSSProperties = null,
    dialogStyle: CSSProperties = null,
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    inputStyle: CSSProperties = null,
    minutesStep: Int | Double = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    okLabel: TagMod[Any] = null,
    onChange: (/* e */ js.Any, /* time */ Date) => Unit = null,
    onDismiss: () => Unit = null,
    onShow: () => Unit = null,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    rowsMax: Int | Double = null,
    textFieldStyle: CSSProperties = null,
    textareaStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null,
    value: Date = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime)
    if (dialogBodyStyle != null) __obj.updateDynamic("dialogBodyStyle")(dialogBodyStyle)
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle)
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText)
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (minutesStep != null) __obj.updateDynamic("minutesStep")(minutesStep.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic)
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (textFieldStyle != null) __obj.updateDynamic("textFieldStyle")(textFieldStyle)
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TimePickerProps
}

