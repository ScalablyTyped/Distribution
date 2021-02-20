package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFieldProps extends StObject {
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[String | Double] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  
  var errorText: js.UndefOr[ReactNode] = js.native
  
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  
  var floatingLabelFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelShrinkStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelText: js.UndefOr[ReactNode] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  
  var hintText: js.UndefOr[ReactNode] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxlength: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minlength: js.UndefOr[String] = js.native
  
  var multiLine: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* newValue */ String, Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onKeyPress: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var rowsMax: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var textareaStyle: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineShow: js.UndefOr[Boolean] = js.native
  
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object TextFieldProps {
  
  @scala.inline
  def apply(): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFieldProps]
  }
  
  @scala.inline
  implicit class TextFieldPropsMutableBuilder[Self <: TextFieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    @scala.inline
    def setErrorText(value: ReactNode): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    @scala.inline
    def setFloatingLabelFixed(value: Boolean): Self = StObject.set(x, "floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFixedUndefined: Self = StObject.set(x, "floatingLabelFixed", js.undefined)
    
    @scala.inline
    def setFloatingLabelFocusStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelFocusStyleUndefined: Self = StObject.set(x, "floatingLabelFocusStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelShrinkStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelShrinkStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelShrinkStyleUndefined: Self = StObject.set(x, "floatingLabelShrinkStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelStyleUndefined: Self = StObject.set(x, "floatingLabelStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelText(value: ReactNode): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelTextUndefined: Self = StObject.set(x, "floatingLabelText", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    @scala.inline
    def setHintText(value: ReactNode): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    @scala.inline
    def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLineUndefined: Self = StObject.set(x, "multiLine", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* e */ FormEvent[js.Object], /* newValue */ String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsMax(value: Double): Self = StObject.set(x, "rowsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsMaxUndefined: Self = StObject.set(x, "rowsMax", js.undefined)
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTextareaStyle(value: CSSProperties): Self = StObject.set(x, "textareaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextareaStyleUndefined: Self = StObject.set(x, "textareaStyle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = StObject.set(x, "underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineDisabledStyleUndefined: Self = StObject.set(x, "underlineDisabledStyle", js.undefined)
    
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = StObject.set(x, "underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineFocusStyleUndefined: Self = StObject.set(x, "underlineFocusStyle", js.undefined)
    
    @scala.inline
    def setUnderlineShow(value: Boolean): Self = StObject.set(x, "underlineShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineShowUndefined: Self = StObject.set(x, "underlineShow", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
