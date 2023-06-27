package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerMessages extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var dateInput: js.UndefOr[DateInputMessages] = js.undefined
  
  var hour: js.UndefOr[String] = js.undefined
  
  var millisecond: js.UndefOr[String] = js.undefined
  
  var minute: js.UndefOr[String] = js.undefined
  
  var now: js.UndefOr[String] = js.undefined
  
  var second: js.UndefOr[String] = js.undefined
  
  var set: js.UndefOr[String] = js.undefined
}
object TimePickerMessages {
  
  inline def apply(): TimePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimePickerMessages] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setDateInput(value: DateInputMessages): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMillisecond(value: String): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
