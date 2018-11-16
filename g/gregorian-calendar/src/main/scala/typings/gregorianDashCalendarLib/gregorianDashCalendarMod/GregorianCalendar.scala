package typings
package gregorianDashCalendarLib.gregorianDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GregorianCalendar extends js.Object {
  /**
           * add the day of month of the given calendar field.
           */
  def addDayOfMonth(amount: stdLib.Number): scala.Unit
  /**
           * add the hour of day of the given calendar field.
           */
  def addHourOfDay(amount: stdLib.Number): scala.Unit
  /**
           * add the millisecond of the given calendar field.
           */
  def addMilliSecond(amount: stdLib.Number): scala.Unit
  /**
           * add the minute of the given calendar field.
           */
  def addMinute(amount: stdLib.Number): scala.Unit
  /**
           * add the month of the given calendar field.
           */
  def addMonth(amount: stdLib.Number): scala.Unit
  /**
           * add the second of the given calendar field.
           */
  def addSecond(amount: stdLib.Number): scala.Unit
  /**
           * add the year of the given calendar field.
           */
  def addYear(amount: stdLib.Number): scala.Unit
  /**
           * clear all field of current instance
           */
  def clear(): scala.Unit
  /**
           * compare this object and other by day. return -1 0 or 1
           */
  def compareToDay(other: GregorianCalendar): stdLib.Number
  def equals(other: GregorianCalendar): scala.Boolean
  /**
           * Returns the day of month of the given calendar field.
           */
  def getDayOfMonth(): stdLib.Number
  /**
           * Returns the day of week of the given calendar field. sunday is 0, monday is 1
           */
  def getDayOfWeek(): stdLib.Number
  /**
           * Returns the day of week in month of the given calendar field.
           */
  def getDayOfWeekInMonth(): stdLib.Number
  /**
           * Returns the day of year of the given calendar field.
           */
  def getDayOfYear(): stdLib.Number
  /**
           * Returns the hour of day for the given calendar field.
           */
  def getHourOfDay(): stdLib.Number
  /**
           * Returns the millisecond of the given calendar field.
           */
  def getMilliSeconds(): stdLib.Number
  /**
           * Returns the minute of the given calendar field.
           */
  def getMinutes(): stdLib.Number
  /**
           * Returns the month of the given calendar field.
           */
  def getMonth(): stdLib.Number
  /**
           * Returns the second of the given calendar field.
           */
  def getSeconds(): stdLib.Number
  /**
           * get absolute time for current instance
           */
  def getTime(): stdLib.Number
  /**
           * current date instance's timezone offset (in minutes)
           */
  def getTimezoneOffset(): stdLib.Number
  /**
           * Returns the week of month of the given calendar field.
           */
  def getWeekOfMonth(): stdLib.Number
  /**
           * Returns the week of year of the given calendar field.
           */
  def getWeekOfYear(): stdLib.Number
  /**
           * Returns the week number of year represented by this GregorianCalendar.
           */
  def getWeekYear(): stdLib.Number
  /**
           * Returns the number of weeks in the week year
           */
  def getWeeksInWeekYear(): stdLib.Number
  /**
           * Returns the year of the given calendar field.
           */
  def getYear(): stdLib.Number
  /**
           * set the month of the given calendar field without influence month.
           * 2015-09-29 -> setMonth(2) -> 2015-03-01
           * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
           */
  def rollSetMonth(month: stdLib.Number): scala.Unit
  /**
           * same as call setYear, setMonth, setDayOfMonth ....
           */
  def set(
    year: stdLib.Number,
    month: stdLib.Number,
    dayOfMonth: stdLib.Number,
    hourOfDay: stdLib.Number,
    minutes: stdLib.Number,
    seconds: stdLib.Number,
    milliseconds: stdLib.Number
  ): scala.Unit
  /**
           * set the day of month of the given calendar field.
           */
  def setDayOfMonth(day: stdLib.Number): scala.Unit
  /**
           * set the hour of day for the given calendar field.
           */
  def setHourOfDay(hour: stdLib.Number): scala.Unit
  /**
           * set the millisecond of the given calendar field.
           */
  def setMilliSeconds(second: stdLib.Number): scala.Unit
  /**
           * set the minute of the given calendar field.
           */
  def setMinutes(minute: stdLib.Number): scala.Unit
  /**
           * set the month of the given calendar field. January is 0, you can use enum
           */
  def setMonth(month: stdLib.Number): scala.Unit
  /**
           * set the second of the given calendar field.
           */
  def setSeconds(second: stdLib.Number): scala.Unit
  /**
           * set absolute time for current instance
           */
  def setTime(time: stdLib.Number): scala.Unit
  /**
           * set current date instance's timezone offset (in minutes)
           */
  def setTimezoneOffset(timezoneOffset: stdLib.Number): scala.Unit
  /**
           * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
           * weekOfYear follows the WEEK_OF_YEAR numbering.
           * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
           *        weekYear: the week year
           *         weekOfYear: the week number based on weekYear
           *         dayOfWeek: the day of week value
           */
  def setWeekDate(weekYear: stdLib.Number, weekOfYear: stdLib.Number, dayOfWeek: stdLib.Number): scala.Unit
  /**
           * set the year of the given calendar field.
           */
  def setYear(year: stdLib.Number): scala.Unit
}

