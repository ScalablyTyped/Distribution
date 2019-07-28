package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts", "Time")
@js.native
class Time protected () extends js.Object {
  /**
    * The Time class. Time settings are applied in general for each page using
    * `Highcharts.setOptions`, or individually for each Chart item through the
    * time options set.
    *
    * The Time object is available from Highcharts.Chart#time, which refers to
    * `Highcharts.time` if no individual time settings are applied.
    *
    * @param options
    *        Time options as defined in chart.options.time.
    */
  def this(options: TimeOptions) = this()
  /**
    * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
    * into a human readable date string. The format is a subset of the formats
    * for PHP's strftime function. Additional formats can be given in the
    * Highcharts.dateFormats hook.
    *
    * @param format
    *        The desired format where various time representations are prefixed
    *        with %.
    *
    * @param timestamp
    *        The JavaScript timestamp.
    *
    * @param capitalize
    *        Upper case first letter in the return.
    *
    * @return The formatted date.
    */
  def dateFormat(format: String, timestamp: Double): String = js.native
  def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
  /**
    * Formats a JavaScript date timestamp (milliseconds since Jan 1st 1970)
    * into a human readable date string. The format is a subset of the formats
    * for PHP's strftime function. Additional formats can be given in the
    * Highcharts.dateFormats hook.
    *
    * @param timestamp
    *        The JavaScript timestamp.
    *
    * @param capitalize
    *        Upper case first letter in the return.
    *
    * @return The formatted date.
    */
  def dateFormat(timestamp: Double): String = js.native
  def dateFormat(timestamp: Double, capitalize: Boolean): String = js.native
  /**
    * Return an array with time positions distributed on round time values
    * right and right after min and max. Used in datetime axes as well as for
    * grouping data on a datetime axis.
    *
    * @param normalizedInterval
    *        The interval in axis values (ms) and the count
    *
    * @param min
    *        The minimum in axis values
    *
    * @param max
    *        The maximum in axis values
    */
  def getTimeTicks(normalizedInterval: NormalizedIntervalObject): TimeTicksObject = js.native
  def getTimeTicks(normalizedInterval: NormalizedIntervalObject, min: Double): TimeTicksObject = js.native
  def getTimeTicks(normalizedInterval: NormalizedIntervalObject, min: Double, max: Double): TimeTicksObject = js.native
  def getTimeTicks(normalizedInterval: NormalizedIntervalObject, min: Double, max: Double, startOfWeek: Double): TimeTicksObject = js.native
  /**
    * Get the time zone offset based on the current timezone information as set
    * in the global options.
    *
    * @param timestamp
    *        The JavaScript timestamp to inspect.
    *
    * @return The timezone offset in minutes compared to UTC.
    */
  def getTimezoneOffset(timestamp: Double): Double = js.native
  /**
    * Make a time and returns milliseconds. Interprets the inputs as UTC time,
    * local time or a specific timezone time depending on the current time
    * settings.
    *
    * @param year
    *        The year
    *
    * @param month
    *        The month. Zero-based, so January is 0.
    *
    * @param date
    *        The day of the month
    *
    * @param hours
    *        The hour of the day, 0-23.
    *
    * @param minutes
    *        The minutes
    *
    * @param seconds
    *        The seconds
    *
    * @return The time in milliseconds since January 1st 1970.
    */
  def makeTime(year: Double, month: Double): Double = js.native
  def makeTime(year: Double, month: Double, date: Double): Double = js.native
  def makeTime(year: Double, month: Double, date: Double, hours: Double): Double = js.native
  def makeTime(year: Double, month: Double, date: Double, hours: Double, minutes: Double): Double = js.native
  def makeTime(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double): Double = js.native
}

