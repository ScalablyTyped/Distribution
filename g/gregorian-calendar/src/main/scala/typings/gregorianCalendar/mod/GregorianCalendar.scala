package typings.gregorianCalendar.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GregorianCalendar extends js.Object {
  /**
    * add the day of month of the given calendar field.
    */
  def addDayOfMonth(amount: Number): Unit
  /**
    * add the hour of day of the given calendar field.
    */
  def addHourOfDay(amount: Number): Unit
  /**
    * add the millisecond of the given calendar field.
    */
  def addMilliSecond(amount: Number): Unit
  /**
    * add the minute of the given calendar field.
    */
  def addMinute(amount: Number): Unit
  /**
    * add the month of the given calendar field.
    */
  def addMonth(amount: Number): Unit
  /**
    * add the second of the given calendar field.
    */
  def addSecond(amount: Number): Unit
  /**
    * add the year of the given calendar field.
    */
  def addYear(amount: Number): Unit
  /**
    * clear all field of current instance
    */
  def clear(): Unit
  /**
    * compare this object and other by day. return -1 0 or 1
    */
  def compareToDay(other: GregorianCalendar): Number
  def equals(other: GregorianCalendar): Boolean
  /**
    * Returns the day of month of the given calendar field.
    */
  def getDayOfMonth(): Number
  /**
    * Returns the day of week of the given calendar field. sunday is 0, monday is 1
    */
  def getDayOfWeek(): Number
  /**
    * Returns the day of week in month of the given calendar field.
    */
  def getDayOfWeekInMonth(): Number
  /**
    * Returns the day of year of the given calendar field.
    */
  def getDayOfYear(): Number
  /**
    * Returns the hour of day for the given calendar field.
    */
  def getHourOfDay(): Number
  /**
    * Returns the millisecond of the given calendar field.
    */
  def getMilliSeconds(): Number
  /**
    * Returns the minute of the given calendar field.
    */
  def getMinutes(): Number
  /**
    * Returns the month of the given calendar field.
    */
  def getMonth(): Number
  /**
    * Returns the second of the given calendar field.
    */
  def getSeconds(): Number
  /**
    * get absolute time for current instance
    */
  def getTime(): Number
  /**
    * current date instance's timezone offset (in minutes)
    */
  def getTimezoneOffset(): Number
  /**
    * Returns the week of month of the given calendar field.
    */
  def getWeekOfMonth(): Number
  /**
    * Returns the week of year of the given calendar field.
    */
  def getWeekOfYear(): Number
  /**
    * Returns the week number of year represented by this GregorianCalendar.
    */
  def getWeekYear(): Number
  /**
    * Returns the number of weeks in the week year
    */
  def getWeeksInWeekYear(): Number
  /**
    * Returns the year of the given calendar field.
    */
  def getYear(): Number
  /**
    * set the month of the given calendar field without influence month.
    * 2015-09-29 -> setMonth(2) -> 2015-03-01
    * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
    */
  def rollSetMonth(month: Number): Unit
  /**
    * same as call setYear, setMonth, setDayOfMonth ....
    */
  def set(
    year: Number,
    month: Number,
    dayOfMonth: Number,
    hourOfDay: Number,
    minutes: Number,
    seconds: Number,
    milliseconds: Number
  ): Unit
  /**
    * set the day of month of the given calendar field.
    */
  def setDayOfMonth(day: Number): Unit
  /**
    * set the hour of day for the given calendar field.
    */
  def setHourOfDay(hour: Number): Unit
  /**
    * set the millisecond of the given calendar field.
    */
  def setMilliSeconds(second: Number): Unit
  /**
    * set the minute of the given calendar field.
    */
  def setMinutes(minute: Number): Unit
  /**
    * set the month of the given calendar field. January is 0, you can use enum
    */
  def setMonth(month: Number): Unit
  /**
    * set the second of the given calendar field.
    */
  def setSeconds(second: Number): Unit
  /**
    * set absolute time for current instance
    */
  def setTime(time: Number): Unit
  /**
    * set current date instance's timezone offset (in minutes)
    */
  def setTimezoneOffset(timezoneOffset: Number): Unit
  /**
    * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
    * weekOfYear follows the WEEK_OF_YEAR numbering.
    * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
    *        weekYear: the week year
    *         weekOfYear: the week number based on weekYear
    *         dayOfWeek: the day of week value
    */
  def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit
  /**
    * set the year of the given calendar field.
    */
  def setYear(year: Number): Unit
}

object GregorianCalendar {
  @scala.inline
  def apply(
    addDayOfMonth: Number => Unit,
    addHourOfDay: Number => Unit,
    addMilliSecond: Number => Unit,
    addMinute: Number => Unit,
    addMonth: Number => Unit,
    addSecond: Number => Unit,
    addYear: Number => Unit,
    clear: () => Unit,
    compareToDay: GregorianCalendar => Number,
    equals: GregorianCalendar => Boolean,
    getDayOfMonth: () => Number,
    getDayOfWeek: () => Number,
    getDayOfWeekInMonth: () => Number,
    getDayOfYear: () => Number,
    getHourOfDay: () => Number,
    getMilliSeconds: () => Number,
    getMinutes: () => Number,
    getMonth: () => Number,
    getSeconds: () => Number,
    getTime: () => Number,
    getTimezoneOffset: () => Number,
    getWeekOfMonth: () => Number,
    getWeekOfYear: () => Number,
    getWeekYear: () => Number,
    getWeeksInWeekYear: () => Number,
    getYear: () => Number,
    rollSetMonth: Number => Unit,
    set: (Number, Number, Number, Number, Number, Number, Number) => Unit,
    setDayOfMonth: Number => Unit,
    setHourOfDay: Number => Unit,
    setMilliSeconds: Number => Unit,
    setMinutes: Number => Unit,
    setMonth: Number => Unit,
    setSeconds: Number => Unit,
    setTime: Number => Unit,
    setTimezoneOffset: Number => Unit,
    setWeekDate: (Number, Number, Number) => Unit,
    setYear: Number => Unit
  ): GregorianCalendar = {
    val __obj = js.Dynamic.literal(addDayOfMonth = js.Any.fromFunction1(addDayOfMonth), addHourOfDay = js.Any.fromFunction1(addHourOfDay), addMilliSecond = js.Any.fromFunction1(addMilliSecond), addMinute = js.Any.fromFunction1(addMinute), addMonth = js.Any.fromFunction1(addMonth), addSecond = js.Any.fromFunction1(addSecond), addYear = js.Any.fromFunction1(addYear), clear = js.Any.fromFunction0(clear), compareToDay = js.Any.fromFunction1(compareToDay), equals = js.Any.fromFunction1(equals), getDayOfMonth = js.Any.fromFunction0(getDayOfMonth), getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getDayOfWeekInMonth = js.Any.fromFunction0(getDayOfWeekInMonth), getDayOfYear = js.Any.fromFunction0(getDayOfYear), getHourOfDay = js.Any.fromFunction0(getHourOfDay), getMilliSeconds = js.Any.fromFunction0(getMilliSeconds), getMinutes = js.Any.fromFunction0(getMinutes), getMonth = js.Any.fromFunction0(getMonth), getSeconds = js.Any.fromFunction0(getSeconds), getTime = js.Any.fromFunction0(getTime), getTimezoneOffset = js.Any.fromFunction0(getTimezoneOffset), getWeekOfMonth = js.Any.fromFunction0(getWeekOfMonth), getWeekOfYear = js.Any.fromFunction0(getWeekOfYear), getWeekYear = js.Any.fromFunction0(getWeekYear), getWeeksInWeekYear = js.Any.fromFunction0(getWeeksInWeekYear), getYear = js.Any.fromFunction0(getYear), rollSetMonth = js.Any.fromFunction1(rollSetMonth), set = js.Any.fromFunction7(set), setDayOfMonth = js.Any.fromFunction1(setDayOfMonth), setHourOfDay = js.Any.fromFunction1(setHourOfDay), setMilliSeconds = js.Any.fromFunction1(setMilliSeconds), setMinutes = js.Any.fromFunction1(setMinutes), setMonth = js.Any.fromFunction1(setMonth), setSeconds = js.Any.fromFunction1(setSeconds), setTime = js.Any.fromFunction1(setTime), setTimezoneOffset = js.Any.fromFunction1(setTimezoneOffset), setWeekDate = js.Any.fromFunction3(setWeekDate), setYear = js.Any.fromFunction1(setYear))
    __obj.asInstanceOf[GregorianCalendar]
  }
}

