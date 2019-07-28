package typings.gregorianDashCalendar.gregorianDashCalendarMod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gregorian-calendar", JSImport.Namespace)
@js.native
class ^ () extends GregorianCalendar {
  def this(locale: js.Object) = this()
  /**
    * add the day of month of the given calendar field.
    */
  /* CompleteClass */
  override def addDayOfMonth(amount: Number): Unit = js.native
  /**
    * add the hour of day of the given calendar field.
    */
  /* CompleteClass */
  override def addHourOfDay(amount: Number): Unit = js.native
  /**
    * add the millisecond of the given calendar field.
    */
  /* CompleteClass */
  override def addMilliSecond(amount: Number): Unit = js.native
  /**
    * add the minute of the given calendar field.
    */
  /* CompleteClass */
  override def addMinute(amount: Number): Unit = js.native
  /**
    * add the month of the given calendar field.
    */
  /* CompleteClass */
  override def addMonth(amount: Number): Unit = js.native
  /**
    * add the second of the given calendar field.
    */
  /* CompleteClass */
  override def addSecond(amount: Number): Unit = js.native
  /**
    * add the year of the given calendar field.
    */
  /* CompleteClass */
  override def addYear(amount: Number): Unit = js.native
  /**
    * clear all field of current instance
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * compare this object and other by day. return -1 0 or 1
    */
  /* CompleteClass */
  override def compareToDay(other: GregorianCalendar): Number = js.native
  /* CompleteClass */
  override def equals(other: GregorianCalendar): Boolean = js.native
  /**
    * Returns the day of month of the given calendar field.
    */
  /* CompleteClass */
  override def getDayOfMonth(): Number = js.native
  /**
    * Returns the day of week of the given calendar field. sunday is 0, monday is 1
    */
  /* CompleteClass */
  override def getDayOfWeek(): Number = js.native
  /**
    * Returns the day of week in month of the given calendar field.
    */
  /* CompleteClass */
  override def getDayOfWeekInMonth(): Number = js.native
  /**
    * Returns the day of year of the given calendar field.
    */
  /* CompleteClass */
  override def getDayOfYear(): Number = js.native
  /**
    * Returns the hour of day for the given calendar field.
    */
  /* CompleteClass */
  override def getHourOfDay(): Number = js.native
  /**
    * Returns the millisecond of the given calendar field.
    */
  /* CompleteClass */
  override def getMilliSeconds(): Number = js.native
  /**
    * Returns the minute of the given calendar field.
    */
  /* CompleteClass */
  override def getMinutes(): Number = js.native
  /**
    * Returns the month of the given calendar field.
    */
  /* CompleteClass */
  override def getMonth(): Number = js.native
  /**
    * Returns the second of the given calendar field.
    */
  /* CompleteClass */
  override def getSeconds(): Number = js.native
  /**
    * get absolute time for current instance
    */
  /* CompleteClass */
  override def getTime(): Number = js.native
  /**
    * current date instance's timezone offset (in minutes)
    */
  /* CompleteClass */
  override def getTimezoneOffset(): Number = js.native
  /**
    * Returns the week of month of the given calendar field.
    */
  /* CompleteClass */
  override def getWeekOfMonth(): Number = js.native
  /**
    * Returns the week of year of the given calendar field.
    */
  /* CompleteClass */
  override def getWeekOfYear(): Number = js.native
  /**
    * Returns the week number of year represented by this GregorianCalendar.
    */
  /* CompleteClass */
  override def getWeekYear(): Number = js.native
  /**
    * Returns the number of weeks in the week year
    */
  /* CompleteClass */
  override def getWeeksInWeekYear(): Number = js.native
  /**
    * Returns the year of the given calendar field.
    */
  /* CompleteClass */
  override def getYear(): Number = js.native
  /**
    * set the month of the given calendar field without influence month.
    * 2015-09-29 -> setMonth(2) -> 2015-03-01
    * 2015-09-29 -> rollSetMonth(2) -> 2015-02-28
    */
  /* CompleteClass */
  override def rollSetMonth(month: Number): Unit = js.native
  /**
    * same as call setYear, setMonth, setDayOfMonth ....
    */
  /* CompleteClass */
  override def set(
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
  /* CompleteClass */
  override def setDayOfMonth(day: Number): Unit = js.native
  /**
    * set the hour of day for the given calendar field.
    */
  /* CompleteClass */
  override def setHourOfDay(hour: Number): Unit = js.native
  /**
    * set the millisecond of the given calendar field.
    */
  /* CompleteClass */
  override def setMilliSeconds(second: Number): Unit = js.native
  /**
    * set the minute of the given calendar field.
    */
  /* CompleteClass */
  override def setMinutes(minute: Number): Unit = js.native
  /**
    * set the month of the given calendar field. January is 0, you can use enum
    */
  /* CompleteClass */
  override def setMonth(month: Number): Unit = js.native
  /**
    * set the second of the given calendar field.
    */
  /* CompleteClass */
  override def setSeconds(second: Number): Unit = js.native
  /**
    * set absolute time for current instance
    */
  /* CompleteClass */
  override def setTime(time: Number): Unit = js.native
  /**
    * set current date instance's timezone offset (in minutes)
    */
  /* CompleteClass */
  override def setTimezoneOffset(timezoneOffset: Number): Unit = js.native
  /**
    * Sets this GregorianCalendar to the date given by the date specifiers - weekYear, weekOfYear, and dayOfWeek.
    * weekOfYear follows the WEEK_OF_YEAR numbering.
    * The dayOfWeek value must be one of the DAY_OF_WEEK values: SUNDAY to SATURDAY.
    *        weekYear: the week year
    *         weekOfYear: the week number based on weekYear
    *         dayOfWeek: the day of week value
    */
  /* CompleteClass */
  override def setWeekDate(weekYear: Number, weekOfYear: Number, dayOfWeek: Number): Unit = js.native
  /**
    * set the year of the given calendar field.
    */
  /* CompleteClass */
  override def setYear(year: Number): Unit = js.native
}

