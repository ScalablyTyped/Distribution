package typings.kendoUi.kendo.ui

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateInputSteps extends StObject {
  
  var day: js.UndefOr[Number] = js.undefined
  
  var hour: js.UndefOr[Number] = js.undefined
  
  var millisecond: js.UndefOr[Number] = js.undefined
  
  var minute: js.UndefOr[Number] = js.undefined
  
  var month: js.UndefOr[Number] = js.undefined
  
  var second: js.UndefOr[Number] = js.undefined
  
  var year: js.UndefOr[Number] = js.undefined
}
object DateInputSteps {
  
  inline def apply(): DateInputSteps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateInputSteps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateInputSteps] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Number): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: Number): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMillisecond(value: Number): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    inline def setMinute(value: Number): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: Number): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSecond(value: Number): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setYear(value: Number): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
