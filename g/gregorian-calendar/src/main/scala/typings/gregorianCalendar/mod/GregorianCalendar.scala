package typings.gregorianCalendar.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GregorianCalendar extends js.Object {
  /**
    * add the day of month of the given calendar field.
    */
  def addDayOfMonth(amount: Number): Unit = js.native
  /**
    * add the hour of day of the given calendar field.
    */
  def addHourOfDay(amount: Number): Unit = js.native
  /**
    * add the millisecond of the given calendar field.
    */
  def addMilliSecond(amount: Number): Unit = js.native
  /**
    * add the minute of the given calendar field.
    */
  def addMinute(amount: Number): Unit = js.native
  /**
    * add the month of the given calendar field.
    */
  def addMonth(amount: Number): Unit = js.native
  /**
    * add the second of the given calendar field.
    */
  def addSecond(amount: Number): Unit = js.native
  /**
    * add the year of the given calendar field.
    */
  def addYear(amount: Number): Unit = js.native
  /**
    * clear all field of current instance
    */
  def clear(): Unit = js.native
  /**
    * compare this object and other by day. return -1 0 or 1
    */
  def compareToDay(other: GregorianCalendar): Number = js.native
  def equals(other: GregorianCalendar): Boolean = js.native
  /**
    * Returns the day of month of the given calendar field.
    */
  def getDayOfMonth(): Number = js.native
  /**
    * Returns the day of week of the given calendar field. sunday is 0, monday is 1
    */
  def getDayOfWeek(): Number = js.native
  /**
    * Returns the day of week in month of the given calendar field.
    */
  def getDayOfWeekInMonth(): Number = js.native
  /**
    * Returns the day of year of the given calendar field.
    */
  def getDayOfYear(): Number = js.native
  /**
    * Returns the hour of day for the given calendar field.
    */
  def getHourOfDay(): Number = js.native
  /**
    * Returns the millisecond of the given calendar field.
    */
  def getMilliSeconds(): Number = js.native
  /**
    * Returns the minute of the given calendar field.
    */
  def getMinutes(): Number = js.native
  /**
    * Returns the month of the given calendar field.
    */
  def getMonth(): Number = js.native
  /**
    * Returns the second of the given calendar field.
    */
  def getSeconds(): Number = js.native
  /**
    * get absolute time for current instance
    */
  def getTime(): Number = js.native
  /**
    * current date instance's timezone offset (in minutes)
    */
  def getTimezoneOffset(): Number = js.native
  /**
    * Returns the week of month of the given calendar field.
    */
  def getWeekOfMonth(): Number = js.native
  /**
    * Returns the week of year of the given calendar field.
    */
  def getWeekOfYear(): Number = js.native
  /**
    * Returns the week number of year represented by this GregorianCalendar.
    */
  def getWeekYear(): Number = js.native
  /**
    * Returns the number of weeks in the week year
    */
  def getWeeksInWeekYear(): Number = js.native
  /**
    * Returns the year of the given calendar field.
    */
  def getYear(): Number = js.native
  /**
    * set the month of the given calendar field without influence month.
    * 2015-09-29 -> setMonth(2) -> 2015-03-01
    * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
    */
  def rollSetMonth(month: Number): Unit = js.native
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
  ): Unit = js.native
  /**
    * set the day of month of the given calendar field.
    */
  def setDayOfMonth(day: Number): Unit = js.native
  /**
    * set the hour of day for the given calendar field.
    */
  def setHourOfDay(hour: Number): Unit = js.native
  /**
    * set the millisecond of the given calendar field.
    */
  def setMilliSeconds(second: Number): Unit = js.native
  /**
    * set the minute of the given calendar field.
    */
  def setMinutes(minute: Number): Unit = js.native
  /**
    * set the month of the given calendar field. January is 0, you can use enum
    */
  def setMonth(month: Number): Unit = js.native
  /**
    * set the second of the given calendar field.
    */
  def setSeconds(second: Number): Unit = js.native
  /**
    * set absolute time for current instance
    */
  def setTime(time: Number): Unit = js.native
  /**
    * set current date instance's timezone offset (in minutes)
    */
  def setTimezoneOffset(timezoneOffset: Number): Unit = js.native
  /**
    * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
    * weekOfYear follows the WEEK_OF_YEAR numbering.
    * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
    *        weekYear: the week year
    *         weekOfYear: the week number based on weekYear
    *         dayOfWeek: the day of week value
    */
  def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit = js.native
  /**
    * set the year of the given calendar field.
    */
  def setYear(year: Number): Unit = js.native
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
  @scala.inline
  implicit class GregorianCalendarOps[Self <: GregorianCalendar] (val x: Self) extends AnyVal {
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
    def setAddDayOfMonth(value: Number => Unit): Self = this.set("addDayOfMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setAddHourOfDay(value: Number => Unit): Self = this.set("addHourOfDay", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMilliSecond(value: Number => Unit): Self = this.set("addMilliSecond", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMinute(value: Number => Unit): Self = this.set("addMinute", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMonth(value: Number => Unit): Self = this.set("addMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setAddSecond(value: Number => Unit): Self = this.set("addSecond", js.Any.fromFunction1(value))
    @scala.inline
    def setAddYear(value: Number => Unit): Self = this.set("addYear", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCompareToDay(value: GregorianCalendar => Number): Self = this.set("compareToDay", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: GregorianCalendar => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDayOfMonth(value: () => Number): Self = this.set("getDayOfMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDayOfWeek(value: () => Number): Self = this.set("getDayOfWeek", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDayOfWeekInMonth(value: () => Number): Self = this.set("getDayOfWeekInMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDayOfYear(value: () => Number): Self = this.set("getDayOfYear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHourOfDay(value: () => Number): Self = this.set("getHourOfDay", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMilliSeconds(value: () => Number): Self = this.set("getMilliSeconds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinutes(value: () => Number): Self = this.set("getMinutes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMonth(value: () => Number): Self = this.set("getMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSeconds(value: () => Number): Self = this.set("getSeconds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTime(value: () => Number): Self = this.set("getTime", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTimezoneOffset(value: () => Number): Self = this.set("getTimezoneOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeekOfMonth(value: () => Number): Self = this.set("getWeekOfMonth", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeekOfYear(value: () => Number): Self = this.set("getWeekOfYear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeekYear(value: () => Number): Self = this.set("getWeekYear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWeeksInWeekYear(value: () => Number): Self = this.set("getWeeksInWeekYear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYear(value: () => Number): Self = this.set("getYear", js.Any.fromFunction0(value))
    @scala.inline
    def setRollSetMonth(value: Number => Unit): Self = this.set("rollSetMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Number, Number, Number, Number, Number, Number, Number) => Unit): Self = this.set("set", js.Any.fromFunction7(value))
    @scala.inline
    def setSetDayOfMonth(value: Number => Unit): Self = this.set("setDayOfMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHourOfDay(value: Number => Unit): Self = this.set("setHourOfDay", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMilliSeconds(value: Number => Unit): Self = this.set("setMilliSeconds", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinutes(value: Number => Unit): Self = this.set("setMinutes", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMonth(value: Number => Unit): Self = this.set("setMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSeconds(value: Number => Unit): Self = this.set("setSeconds", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTime(value: Number => Unit): Self = this.set("setTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTimezoneOffset(value: Number => Unit): Self = this.set("setTimezoneOffset", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWeekDate(value: (Number, Number, Number) => Unit): Self = this.set("setWeekDate", js.Any.fromFunction3(value))
    @scala.inline
    def setSetYear(value: Number => Unit): Self = this.set("setYear", js.Any.fromFunction1(value))
  }
  
}

