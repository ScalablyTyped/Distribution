package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisDateTimeLabelFormatsOptions extends StObject {
  
  var day: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var hour: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var millisecond: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var minute: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var month: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var second: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var week: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
  
  var year: js.UndefOr[String | AxisDateTimeLabelFormatsOptionsObject] = js.undefined
}
object AxisDateTimeLabelFormatsOptions {
  
  inline def apply(): AxisDateTimeLabelFormatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisDateTimeLabelFormatsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisDateTimeLabelFormatsOptions] (val x: Self) extends AnyVal {
    
    inline def setDay(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMillisecond(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    inline def setMinute(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSecond(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setWeek(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setYear(value: String | AxisDateTimeLabelFormatsOptionsObject): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
