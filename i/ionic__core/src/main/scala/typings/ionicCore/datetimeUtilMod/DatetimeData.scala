package typings.ionicCore.datetimeUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimeData extends js.Object {
  
  var ampm: js.UndefOr[String] = js.native
  
  var day: js.UndefOr[Double] = js.native
  
  var hour: js.UndefOr[Double] = js.native
  
  var millisecond: js.UndefOr[Double] = js.native
  
  var minute: js.UndefOr[Double] = js.native
  
  var month: js.UndefOr[Double] = js.native
  
  var second: js.UndefOr[Double] = js.native
  
  var tzOffset: js.UndefOr[Double] = js.native
  
  var year: js.UndefOr[Double] = js.native
}
object DatetimeData {
  
  @scala.inline
  def apply(): DatetimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimeData]
  }
  
  @scala.inline
  implicit class DatetimeDataOps[Self <: DatetimeData] (val x: Self) extends AnyVal {
    
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
    def setAmpm(value: String): Self = this.set("ampm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpm: Self = this.set("ampm", js.undefined)
    
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
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    
    @scala.inline
    def setTzOffset(value: Double): Self = this.set("tzOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTzOffset: Self = this.set("tzOffset", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
