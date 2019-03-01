package typings
package jqueryDashCountdownLib.jQueryCountdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetEvent extends js.Object {
  /**
    * Days left until next week
    */
  var days: scala.Double
  /**
    * Days left until next month
    */
  var daysToMonth: scala.Double
  /**
    * Days left until next week
    */
  var daysToWeek: scala.Double
  /**
    * Hours left until next day
    */
  var hours: scala.Double
  /**
    * Minutes left for the next hour
    */
  var minutes: scala.Double
  /**
    * Months left until final date
    */
  var months: scala.Double
  /**
    * Seconds left for the next minute
    */
  var seconds: scala.Double
  /**
    * Total amount of days left until final date
    */
  var totalDays: scala.Double
  /**
    * Total amount of hours left until final date
    */
  var totalHours: scala.Double
  /**
    * Total amount of minutes left until final date
    */
  var totalMinutes: scala.Double
  /**
    * Total amount of seconds left until final date
    */
  var totalSeconds: scala.Double
  /**
    * Weeks left until the final date
    */
  var weeks: scala.Double
  /**
    * Weeks left until the next month
    */
  var weeksToMonth: scala.Double
  /**
    * Years left until final date
    */
  var years: scala.Double
}

object OffsetEvent {
  @scala.inline
  def apply(
    days: scala.Double,
    daysToMonth: scala.Double,
    daysToWeek: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    months: scala.Double,
    seconds: scala.Double,
    totalDays: scala.Double,
    totalHours: scala.Double,
    totalMinutes: scala.Double,
    totalSeconds: scala.Double,
    weeks: scala.Double,
    weeksToMonth: scala.Double,
    years: scala.Double
  ): OffsetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("daysToMonth")(daysToMonth)
    __obj.updateDynamic("daysToWeek")(daysToWeek)
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("seconds")(seconds)
    __obj.updateDynamic("totalDays")(totalDays)
    __obj.updateDynamic("totalHours")(totalHours)
    __obj.updateDynamic("totalMinutes")(totalMinutes)
    __obj.updateDynamic("totalSeconds")(totalSeconds)
    __obj.updateDynamic("weeks")(weeks)
    __obj.updateDynamic("weeksToMonth")(weeksToMonth)
    __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[OffsetEvent]
  }
}

