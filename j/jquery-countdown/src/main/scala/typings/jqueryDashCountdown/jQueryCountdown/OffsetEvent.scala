package typings.jqueryDashCountdown.jQueryCountdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetEvent extends js.Object {
  /**
    * Days left until next week
    */
  var days: Double
  /**
    * Days left until next month
    */
  var daysToMonth: Double
  /**
    * Days left until next week
    */
  var daysToWeek: Double
  /**
    * Hours left until next day
    */
  var hours: Double
  /**
    * Minutes left for the next hour
    */
  var minutes: Double
  /**
    * Months left until final date
    */
  var months: Double
  /**
    * Seconds left for the next minute
    */
  var seconds: Double
  /**
    * Total amount of days left until final date
    */
  var totalDays: Double
  /**
    * Total amount of hours left until final date
    */
  var totalHours: Double
  /**
    * Total amount of minutes left until final date
    */
  var totalMinutes: Double
  /**
    * Total amount of seconds left until final date
    */
  var totalSeconds: Double
  /**
    * Weeks left until the final date
    */
  var weeks: Double
  /**
    * Weeks left until the next month
    */
  var weeksToMonth: Double
  /**
    * Years left until final date
    */
  var years: Double
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
}

