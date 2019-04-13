package typings
package laterLib.laterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecurrenceBuilder extends ScheduleData {
  def after(value: java.lang.String): RecurrenceBuilder = js.native
  /**
    * After a time period.
    *
    * @param value - A number or string representing your value.
    */
  def after(value: scala.Double): RecurrenceBuilder = js.native
  /**
    * Add a new schedule value to schedules, composite schedule.
    */
  def and(): RecurrenceBuilder = js.native
  def before(value: java.lang.String): RecurrenceBuilder = js.native
  /**
    * Before a time period.
    *
    * @param value - A number or string representing your value.
    */
  def before(value: scala.Double): RecurrenceBuilder = js.native
  /**
    * Preceed a time period.
    *
    * @param start - A string representing your start value.
    * @param end - A string representing your end value.
    */
  def between(start: java.lang.String, end: java.lang.String): RecurrenceBuilder = js.native
  /**
    * Preceed a time period.
    *
    * @param start - A number representing your start value.
    * @param end - A number representing your end value.
    */
  def between(start: scala.Double, end: scala.Double): RecurrenceBuilder = js.native
  /**
    * Customise Recurrences.
    * Using a key as defined by the custom modifier in any extension to Later.IModifierStatic.
    */
  def customModifier(key: java.lang.String, values: scala.Double): RecurrenceBuilder = js.native
  /**
    * Custom Timeperiod Recurrences.
    * Using a key as defined by the custom period in any extension to Later.IStatic.
    */
  def customPeriod(key: java.lang.String): RecurrenceBuilder = js.native
  /** a time period */
  def dayOfMonth(): RecurrenceBuilder = js.native
  /** a time period */
  def dayOfWeek(): RecurrenceBuilder = js.native
  /** a time period */
  def dayOfWeekCount(): RecurrenceBuilder = js.native
  /** a time period */
  def dayOfYear(): RecurrenceBuilder = js.native
  /**
    * Preceed a time period.
    *
    * @param [value] - A number or string representing your value.
    */
  def every(): RecurrenceBuilder = js.native
  def every(value: java.lang.String): RecurrenceBuilder = js.native
  def every(value: scala.Double): RecurrenceBuilder = js.native
  /**
    * Add exceptions.
    */
  def except(): RecurrenceBuilder = js.native
  /**
    * Equivalent to .on(min)
    */
  def first(): RecurrenceBuilder = js.native
  /** a time period */
  def fullDate(): RecurrenceBuilder = js.native
  /** a time period */
  def hour(): RecurrenceBuilder = js.native
  /**
    * Equivalent to .on(max)
    */
  def last(): RecurrenceBuilder = js.native
  /** a time period */
  def minute(): RecurrenceBuilder = js.native
  /** a time period */
  def month(): RecurrenceBuilder = js.native
  def on(value: java.lang.String): RecurrenceBuilder = js.native
  /**
    * Specifies one or more specific vals of a time period information provider.
    * When used to specify a time, a string indicating the 24-hour time may be used.
    *
    * @param values - A list of values.
    */
  def on(values: scala.Double*): RecurrenceBuilder = js.native
  /**
    * Specifies one or more specific vals of a time period information provider.
    * When used to specify a time, a string indicating the 24-hour time may be used.
    *
    * @param value - A Date or string representing your value.
    */
  def on(value: stdLib.Date): RecurrenceBuilder = js.native
  /**
    * Equivalent to .on(2,3,4,5,6).dayOfWeek()
    */
  def onWeekday(): RecurrenceBuilder = js.native
  /**
    * Equivalent to .on(1,7).dayOfWeek()
    */
  def onWeekend(): RecurrenceBuilder = js.native
  /** a time period */
  def second(): RecurrenceBuilder = js.native
  def startingOn(value: java.lang.String): RecurrenceBuilder = js.native
  /**
    * After a time period.
    *
    * @param value - A number or string representing your value.
    */
  def startingOn(value: scala.Double): RecurrenceBuilder = js.native
  /** a time period */
  def time(): RecurrenceBuilder = js.native
  /** a time period */
  def weekOfMonth(): RecurrenceBuilder = js.native
  /** a time period */
  def weekOfYear(): RecurrenceBuilder = js.native
  /** a time period */
  def year(): RecurrenceBuilder = js.native
}

