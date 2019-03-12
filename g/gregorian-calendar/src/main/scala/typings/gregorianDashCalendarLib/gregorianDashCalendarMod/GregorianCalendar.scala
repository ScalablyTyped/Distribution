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

object GregorianCalendar {
  @scala.inline
  def apply(
    addDayOfMonth: stdLib.Number => scala.Unit,
    addHourOfDay: stdLib.Number => scala.Unit,
    addMilliSecond: stdLib.Number => scala.Unit,
    addMinute: stdLib.Number => scala.Unit,
    addMonth: stdLib.Number => scala.Unit,
    addSecond: stdLib.Number => scala.Unit,
    addYear: stdLib.Number => scala.Unit,
    clear: () => scala.Unit,
    clone: () => GregorianCalendar,
    compareToDay: GregorianCalendar => stdLib.Number,
    equals: GregorianCalendar => scala.Boolean,
    getDayOfMonth: () => stdLib.Number,
    getDayOfWeek: () => stdLib.Number,
    getDayOfWeekInMonth: () => stdLib.Number,
    getDayOfYear: () => stdLib.Number,
    getHourOfDay: () => stdLib.Number,
    getMilliSeconds: () => stdLib.Number,
    getMinutes: () => stdLib.Number,
    getMonth: () => stdLib.Number,
    getSeconds: () => stdLib.Number,
    getTime: () => stdLib.Number,
    getTimezoneOffset: () => stdLib.Number,
    getWeekOfMonth: () => stdLib.Number,
    getWeekOfYear: () => stdLib.Number,
    getWeekYear: () => stdLib.Number,
    getWeeksInWeekYear: () => stdLib.Number,
    getYear: () => stdLib.Number,
    rollSetMonth: stdLib.Number => scala.Unit,
    set: (stdLib.Number, stdLib.Number, stdLib.Number, stdLib.Number, stdLib.Number, stdLib.Number, stdLib.Number) => scala.Unit,
    setDayOfMonth: stdLib.Number => scala.Unit,
    setHourOfDay: stdLib.Number => scala.Unit,
    setMilliSeconds: stdLib.Number => scala.Unit,
    setMinutes: stdLib.Number => scala.Unit,
    setMonth: stdLib.Number => scala.Unit,
    setSeconds: stdLib.Number => scala.Unit,
    setTime: stdLib.Number => scala.Unit,
    setTimezoneOffset: stdLib.Number => scala.Unit,
    setWeekDate: (stdLib.Number, stdLib.Number, stdLib.Number) => scala.Unit,
    setYear: stdLib.Number => scala.Unit
  ): GregorianCalendar = {
    val __obj = js.Dynamic.literal(addDayOfMonth = js.Any.fromFunction1(addDayOfMonth), addHourOfDay = js.Any.fromFunction1(addHourOfDay), addMilliSecond = js.Any.fromFunction1(addMilliSecond), addMinute = js.Any.fromFunction1(addMinute), addMonth = js.Any.fromFunction1(addMonth), addSecond = js.Any.fromFunction1(addSecond), addYear = js.Any.fromFunction1(addYear), clear = js.Any.fromFunction0(clear), clone = js.Any.fromFunction0(clone), compareToDay = js.Any.fromFunction1(compareToDay), equals = js.Any.fromFunction1(equals), getDayOfMonth = js.Any.fromFunction0(getDayOfMonth), getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getDayOfWeekInMonth = js.Any.fromFunction0(getDayOfWeekInMonth), getDayOfYear = js.Any.fromFunction0(getDayOfYear), getHourOfDay = js.Any.fromFunction0(getHourOfDay), getMilliSeconds = js.Any.fromFunction0(getMilliSeconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getTimezoneOffset = js.Any.fromFunction0(getTimezoneOffset), getWeekOfMonth = js.Any.fromFunction0(getWeekOfMonth), getWeekOfYear = js.Any.fromFunction0(getWeekOfYear), getWeekYear = js.Any.fromFunction0(getWeekYear), getWeeksInWeekYear = js.Any.fromFunction0(getWeeksInWeekYear), getYear = js.Any.fromFunction0(getYear), rollSetMonth = js.Any.fromFunction1(rollSetMonth), set = js.Any.fromFunction7(set), setDayOfMonth = js.Any.fromFunction1(setDayOfMonth), setHourOfDay = js.Any.fromFunction1(setHourOfDay), setMilliSeconds = js.Any.fromFunction1(setMilliSeconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setTimezoneOffset = js.Any.fromFunction1(setTimezoneOffset), setWeekDate = js.Any.fromFunction3(setWeekDate), setYear = js.Any.fromFunction1(setYear))
  
    __obj.asInstanceOf[GregorianCalendar]
  }
}

