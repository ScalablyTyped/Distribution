package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateObjectUnits extends StObject {
  
  var day: js.UndefOr[Double] = js.native
  
  var hour: js.UndefOr[Double] = js.native
  
  var millisecond: js.UndefOr[Double] = js.native
  
  var minute: js.UndefOr[Double] = js.native
  
  var month: js.UndefOr[Double] = js.native
  
  var ordinal: js.UndefOr[Double] = js.native
  
  var second: js.UndefOr[Double] = js.native
  
  var weekNumber: js.UndefOr[Double] = js.native
  
  var weekYear: js.UndefOr[Double] = js.native
  
  var weekday: js.UndefOr[Double] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object DateObjectUnits {
  
  @scala.inline
  def apply(): DateObjectUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateObjectUnits]
  }
  
  @scala.inline
  implicit class DateObjectUnitsMutableBuilder[Self <: DateObjectUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    @scala.inline
    def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Double): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
    
    @scala.inline
    def setWeekYear(value: Double): Self = StObject.set(x, "weekYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekYearUndefined: Self = StObject.set(x, "weekYear", js.undefined)
    
    @scala.inline
    def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
