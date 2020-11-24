package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateObjectUnits extends js.Object {
  
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
  implicit class DateObjectUnitsOps[Self <: DateObjectUnits] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setOrdinal(value: Double): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Double): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
    
    @scala.inline
    def setWeekYear(value: Double): Self = this.set("weekYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekYear: Self = this.set("weekYear", js.undefined)
    
    @scala.inline
    def setWeekday(value: Double): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
