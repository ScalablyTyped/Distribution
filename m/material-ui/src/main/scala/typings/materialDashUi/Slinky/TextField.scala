package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.textFieldMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TextFieldProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FormEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, name, onKeyDown, style, placeholder, autoFocus, onKeyUp, id, autoComplete, className, onFocus, disabled, onKeyPress, title, type, required, defaultValue, rows, value */
object TextField
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.textFieldMod.default].asInstanceOf[String | js.Object]
  def apply(
    errorStyle: CSSProperties = null,
    errorText: TagMod[Any] = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelFocusStyle: CSSProperties = null,
    floatingLabelShrinkStyle: CSSProperties = null,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: TagMod[Any] = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: TagMod[Any] = null,
    inputStyle: CSSProperties = null,
    max: Int | Double = null,
    maxlength: String = null,
    min: Int | Double = null,
    minlength: String = null,
    multiLine: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit = null,
    rowsMax: Int | Double = null,
    step: Int | Double = null,
    textareaStyle: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineShow: js.UndefOr[Boolean] = js.undefined,
    underlineStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle)
    if (errorText != null) __obj.updateDynamic("errorText")(errorText)
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed)
    if (floatingLabelFocusStyle != null) __obj.updateDynamic("floatingLabelFocusStyle")(floatingLabelFocusStyle)
    if (floatingLabelShrinkStyle != null) __obj.updateDynamic("floatingLabelShrinkStyle")(floatingLabelShrinkStyle)
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle)
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle)
    if (hintText != null) __obj.updateDynamic("hintText")(hintText)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minlength != null) __obj.updateDynamic("minlength")(minlength)
    if (!js.isUndefined(multiLine)) __obj.updateDynamic("multiLine")(multiLine)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (textareaStyle != null) __obj.updateDynamic("textareaStyle")(textareaStyle)
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle)
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle)
    if (!js.isUndefined(underlineShow)) __obj.updateDynamic("underlineShow")(underlineShow)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextFieldProps
}

