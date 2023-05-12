package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDurationPickerOptions extends StObject {
  
  var change: js.UndefOr[js.Function1[/* e */ TimeDurationPickerChangeEvent, Unit]] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ TimeDurationPickerCloseEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[js.Array[TimeDurationPickerColumn]] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[TimeDurationPickerMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ TimeDurationPickerOpenEvent, Unit]] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var shortcuts: js.UndefOr[js.Array[TimeDurationPickerShortcut]] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object TimeDurationPickerOptions {
  
  inline def apply(): TimeDurationPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDurationPickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeDurationPickerOptions] (val x: Self) extends AnyVal {
    
    inline def setChange(value: /* e */ TimeDurationPickerChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClose(value: /* e */ TimeDurationPickerCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setColumns(value: js.Array[TimeDurationPickerColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: TimeDurationPickerColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setMessages(value: TimeDurationPickerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpen(value: /* e */ TimeDurationPickerOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShortcuts(value: js.Array[TimeDurationPickerShortcut]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    
    inline def setShortcutsUndefined: Self = StObject.set(x, "shortcuts", js.undefined)
    
    inline def setShortcutsVarargs(value: TimeDurationPickerShortcut*): Self = StObject.set(x, "shortcuts", js.Array(value*))
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
