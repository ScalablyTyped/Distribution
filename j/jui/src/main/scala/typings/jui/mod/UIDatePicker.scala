package typings.jui.mod

import typings.jui.AnonDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDatePicker extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AnonDate): this.type = js.native
  /**
    * Selects a date corresponding to the time added to the currently selected date
    *
    * @param time Timestamp or Date
    */
  def addTime(time: Double): Unit = js.native
  def addTime(time: Date): Unit = js.native
  /**
    * Gets the value of the date currently selected
    *
    * @return Date object
    */
  def getDate(): Date = js.native
  /**
    * Gets a date string that fits the format entered
    *
    * @return format Formatted date string
    */
  def getFormat(format: String): String = js.native
  /**
    * Gets the timestamp value of the date currently selected
    *
    * @return Timestamp
    */
  def getTime(): Double = js.native
  def next(e: js.Any): Unit = js.native
  def next(e: js.Any, moveYear: Boolean): Unit = js.native
  /**
    * Outputs a calendar that fits the year/month entered
    *
    */
  def page(y: Double, m: Double): Unit = js.native
  def prev(e: js.Any): Unit = js.native
  def prev(e: js.Any, moveYear: Boolean): Unit = js.native
  def reload(): Unit = js.native
  /**
    * Selects today if there is no value, or selects a date applicable to a timestamp or year/month/date
    *
    * @param "year"/"month"/"date"/"timestamp"/"Date"
    */
  def select(args: js.Any*): Unit = js.native
}

