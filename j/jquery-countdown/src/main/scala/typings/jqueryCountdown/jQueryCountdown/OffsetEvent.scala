package typings.jqueryCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetEvent extends js.Object {
  
  /**
    * Days left until next week
    */
  var days: Double = js.native
  
  /**
    * Days left until next month
    */
  var daysToMonth: Double = js.native
  
  /**
    * Days left until next week
    */
  var daysToWeek: Double = js.native
  
  /**
    * Hours left until next day
    */
  var hours: Double = js.native
  
  /**
    * Minutes left for the next hour
    */
  var minutes: Double = js.native
  
  /**
    * Months left until final date
    */
  var months: Double = js.native
  
  /**
    * Seconds left for the next minute
    */
  var seconds: Double = js.native
  
  /**
    * Total amount of days left until final date
    */
  var totalDays: Double = js.native
  
  /**
    * Total amount of hours left until final date
    */
  var totalHours: Double = js.native
  
  /**
    * Total amount of minutes left until final date
    */
  var totalMinutes: Double = js.native
  
  /**
    * Total amount of seconds left until final date
    */
  var totalSeconds: Double = js.native
  
  /**
    * Weeks left until the final date
    */
  var weeks: Double = js.native
  
  /**
    * Weeks left until the next month
    */
  var weeksToMonth: Double = js.native
  
  /**
    * Years left until final date
    */
  var years: Double = js.native
}
object OffsetEvent {
  
  @scala.inline
  def apply(
    days: Double,
    daysToMonth: Double,
    daysToWeek: Double,
    hours: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    totalDays: Double,
    totalHours: Double,
    totalMinutes: Double,
    totalSeconds: Double,
    weeks: Double,
    weeksToMonth: Double,
    years: Double
  ): OffsetEvent = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysToMonth = daysToMonth.asInstanceOf[js.Any], daysToWeek = daysToWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], totalDays = totalDays.asInstanceOf[js.Any], totalHours = totalHours.asInstanceOf[js.Any], totalMinutes = totalMinutes.asInstanceOf[js.Any], totalSeconds = totalSeconds.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], weeksToMonth = weeksToMonth.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetEvent]
  }
  
  @scala.inline
  implicit class OffsetEventOps[Self <: OffsetEvent] (val x: Self) extends AnyVal {
    
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToMonth(value: Double): Self = this.set("daysToMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysToWeek(value: Double): Self = this.set("daysToWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDays(value: Double): Self = this.set("totalDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHours(value: Double): Self = this.set("totalHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMinutes(value: Double): Self = this.set("totalMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSeconds(value: Double): Self = this.set("totalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeks(value: Double): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksToMonth(value: Double): Self = this.set("weeksToMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
  }
}
