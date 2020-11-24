package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends js.Object {
  
  var day: Tense = js.native
  
  var flavour: js.UndefOr[Formats] = js.native
  
  var hour: Tense = js.native
  
  var minute: Tense = js.native
  
  var month: Tense = js.native
  
  var quarter: Tense = js.native
  
  var second: Tense = js.native
  
  var week: Tense = js.native
  
  var year: Tense = js.native
}
object Duration {
  
  @scala.inline
  def apply(
    day: Tense,
    hour: Tense,
    minute: Tense,
    month: Tense,
    quarter: Tense,
    second: Tense,
    week: Tense,
    year: Tense
  ): Duration = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Tense): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Tense): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Tense): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Tense): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarter(value: Tense): Self = this.set("quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Tense): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: Tense): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Tense): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlavour(value: Formats): Self = this.set("flavour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlavour: Self = this.set("flavour", js.undefined)
  }
}
