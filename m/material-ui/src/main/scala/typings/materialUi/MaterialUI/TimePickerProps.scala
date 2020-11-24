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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerProps extends js.Object {
  
  // <TextField/> is element that get the 'other' properties
  var autoOk: js.UndefOr[Boolean] = js.native
  
  var cancelLabel: js.UndefOr[ReactNode] = js.native
  
  // From <TextField />
  var className: js.UndefOr[String] = js.native
  
  var defaultTime: js.UndefOr[Date] = js.native
  
  var defaultValue: js.UndefOr[String | Double] = js.native
  
  var dialogBodyStyle: js.UndefOr[CSSProperties] = js.native
  
  var dialogStyle: js.UndefOr[CSSProperties] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var errorStyle: js.UndefOr[CSSProperties] = js.native
  
  var errorText: js.UndefOr[ReactNode] = js.native
  
  var floatingLabelFixed: js.UndefOr[Boolean] = js.native
  
  var floatingLabelFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelStyle: js.UndefOr[CSSProperties] = js.native
  
  var floatingLabelText: js.UndefOr[ReactNode] = js.native
  
  var format: js.UndefOr[ampm | `24hr`] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var hintStyle: js.UndefOr[CSSProperties] = js.native
  
  var hintText: js.UndefOr[ReactNode] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[CSSProperties] = js.native
  
  var minutesStep: js.UndefOr[Double] = js.native
  
  var multiLine: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var okLabel: js.UndefOr[ReactNode] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onChange: js.UndefOr[js.Function2[/* e */ js.Any, /* time */ Date, Unit]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  
  var pedantic: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var rowsMax: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var textFieldStyle: js.UndefOr[CSSProperties] = js.native
  
  var textareaStyle: js.UndefOr[CSSProperties] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var underlineDisabledStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineFocusStyle: js.UndefOr[CSSProperties] = js.native
  
  var underlineShow: js.UndefOr[Boolean] = js.native
  
  var underlineStyle: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[Date] = js.native
}
object TimePickerProps {
  
  @scala.inline
  def apply(): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerProps]
  }
  
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoOk(value: Boolean): Self = this.set("autoOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOk: Self = this.set("autoOk", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: ReactNode): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: Date): Self = this.set("defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTime: Self = this.set("defaultTime", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String | Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDialogBodyStyle(value: CSSProperties): Self = this.set("dialogBodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogBodyStyle: Self = this.set("dialogBodyStyle", js.undefined)
    
    @scala.inline
    def setDialogStyle(value: CSSProperties): Self = this.set("dialogStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogStyle: Self = this.set("dialogStyle", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setErrorStyle(value: CSSProperties): Self = this.set("errorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStyle: Self = this.set("errorStyle", js.undefined)
    
    @scala.inline
    def setErrorText(value: ReactNode): Self = this.set("errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorText: Self = this.set("errorText", js.undefined)
    
    @scala.inline
    def setFloatingLabelFixed(value: Boolean): Self = this.set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelFixed: Self = this.set("floatingLabelFixed", js.undefined)
    
    @scala.inline
    def setFloatingLabelFocusStyle(value: CSSProperties): Self = this.set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelFocusStyle: Self = this.set("floatingLabelFocusStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelStyle(value: CSSProperties): Self = this.set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelStyle: Self = this.set("floatingLabelStyle", js.undefined)
    
    @scala.inline
    def setFloatingLabelText(value: ReactNode): Self = this.set("floatingLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelText: Self = this.set("floatingLabelText", js.undefined)
    
    @scala.inline
    def setFormat(value: ampm | `24hr`): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setHintStyle(value: CSSProperties): Self = this.set("hintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintStyle: Self = this.set("hintStyle", js.undefined)
    
    @scala.inline
    def setHintText(value: ReactNode): Self = this.set("hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintText: Self = this.set("hintText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInputStyle(value: CSSProperties): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setMinutesStep(value: Double): Self = this.set("minutesStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutesStep: Self = this.set("minutesStep", js.undefined)
    
    @scala.inline
    def setMultiLine(value: Boolean): Self = this.set("multiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLine: Self = this.set("multiLine", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOkLabel(value: ReactNode): Self = this.set("okLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOkLabel: Self = this.set("okLabel", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* e */ js.Any, /* time */ Date) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRowsMax(value: Double): Self = this.set("rowsMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsMax: Self = this.set("rowsMax", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextFieldStyle(value: CSSProperties): Self = this.set("textFieldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextFieldStyle: Self = this.set("textFieldStyle", js.undefined)
    
    @scala.inline
    def setTextareaStyle(value: CSSProperties): Self = this.set("textareaStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextareaStyle: Self = this.set("textareaStyle", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnderlineDisabledStyle(value: CSSProperties): Self = this.set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineDisabledStyle: Self = this.set("underlineDisabledStyle", js.undefined)
    
    @scala.inline
    def setUnderlineFocusStyle(value: CSSProperties): Self = this.set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineFocusStyle: Self = this.set("underlineFocusStyle", js.undefined)
    
    @scala.inline
    def setUnderlineShow(value: Boolean): Self = this.set("underlineShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineShow: Self = this.set("underlineShow", js.undefined)
    
    @scala.inline
    def setUnderlineStyle(value: CSSProperties): Self = this.set("underlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlineStyle: Self = this.set("underlineStyle", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
