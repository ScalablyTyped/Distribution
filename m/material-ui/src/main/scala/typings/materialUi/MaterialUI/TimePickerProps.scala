package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.`24hr`
import typings.materialUi.materialUiStrings.ampm
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerProps extends StObject {
  
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
  
  inline def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  
  extension [Self <: TimePickerProps](x: Self) {
    
    inline def setAutoOk(value: Boolean): Self = StObject.set(x, "autoOk", value.asInstanceOf[js.Any])
    
    inline def setAutoOkUndefined: Self = StObject.set(x, "autoOk", js.undefined)
    
    inline def setCancelLabel(value: ReactNode): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultTime(value: Date): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    inline def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDialogBodyStyle(value: CSSProperties): Self = StObject.set(x, "dialogBodyStyle", value.asInstanceOf[js.Any])
    
    inline def setDialogBodyStyleUndefined: Self = StObject.set(x, "dialogBodyStyle", js.undefined)
    
    inline def setDialogStyle(value: CSSProperties): Self = StObject.set(x, "dialogStyle", value.asInstanceOf[js.Any])
    
    inline def setDialogStyleUndefined: Self = StObject.set(x, "dialogStyle", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorStyle(value: CSSProperties): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    inline def setErrorText(value: ReactNode): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setErrorTextUndefined: Self = StObject.set(x, "errorText", js.undefined)
    
    inline def setFloatingLabelFixed(value: Boolean): Self = StObject.set(x, "floatingLabelFixed", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelFixedUndefined: Self = StObject.set(x, "floatingLabelFixed", js.undefined)
    
    inline def setFloatingLabelFocusStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelFocusStyleUndefined: Self = StObject.set(x, "floatingLabelFocusStyle", js.undefined)
    
    inline def setFloatingLabelStyle(value: CSSProperties): Self = StObject.set(x, "floatingLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelStyleUndefined: Self = StObject.set(x, "floatingLabelStyle", js.undefined)
    
    inline def setFloatingLabelText(value: ReactNode): Self = StObject.set(x, "floatingLabelText", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelTextUndefined: Self = StObject.set(x, "floatingLabelText", js.undefined)
    
    inline def setFormat(value: ampm | `24hr`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHintStyle(value: CSSProperties): Self = StObject.set(x, "hintStyle", value.asInstanceOf[js.Any])
    
    inline def setHintStyleUndefined: Self = StObject.set(x, "hintStyle", js.undefined)
    
    inline def setHintText(value: ReactNode): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputStyle(value: CSSProperties): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setMinutesStep(value: Double): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
    
    inline def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
    
    inline def setMultiLine(value: Boolean): Self = StObject.set(x, "multiLine", value.asInstanceOf[js.Any])
    
    inline def setMultiLineUndefined: Self = StObject.set(x, "multiLine", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOkLabel(value: ReactNode): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
    
    inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (/* e */ js.Any, /* time */ Date) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDismiss(value: () => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction0(value))
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
    
    inline def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsMax(value: Double): Self = StObject.set(x, "rowsMax", value.asInstanceOf[js.Any])
    
    inline def setRowsMaxUndefined: Self = StObject.set(x, "rowsMax", js.undefined)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextFieldStyle(value: CSSProperties): Self = StObject.set(x, "textFieldStyle", value.asInstanceOf[js.Any])
    
    inline def setTextFieldStyleUndefined: Self = StObject.set(x, "textFieldStyle", js.undefined)
    
    inline def setTextareaStyle(value: CSSProperties): Self = StObject.set(x, "textareaStyle", value.asInstanceOf[js.Any])
    
    inline def setTextareaStyleUndefined: Self = StObject.set(x, "textareaStyle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderlineDisabledStyle(value: CSSProperties): Self = StObject.set(x, "underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineDisabledStyleUndefined: Self = StObject.set(x, "underlineDisabledStyle", js.undefined)
    
    inline def setUnderlineFocusStyle(value: CSSProperties): Self = StObject.set(x, "underlineFocusStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineFocusStyleUndefined: Self = StObject.set(x, "underlineFocusStyle", js.undefined)
    
    inline def setUnderlineShow(value: Boolean): Self = StObject.set(x, "underlineShow", value.asInstanceOf[js.Any])
    
    inline def setUnderlineShowUndefined: Self = StObject.set(x, "underlineShow", js.undefined)
    
    inline def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    
    inline def setValue(value: Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
