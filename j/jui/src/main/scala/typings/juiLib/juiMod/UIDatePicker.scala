package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDatePicker extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Format): this.type = js.native
  /**
       * Selects a date corresponding to the time added to the currently selected date
       *
       * @param time Timestamp or Date
       */
  def addTime(time: scala.Double): scala.Unit = js.native
  /**
       * Selects a date corresponding to the time added to the currently selected date
       *
       * @param time Timestamp or Date
       */
  def addTime(time: stdLib.Date): scala.Unit = js.native
  /**
       * Gets the value of the date currently selected
       *
       * @return Date object
       */
  def getDate(): stdLib.Date = js.native
  /**
       * Gets a date string that fits the format entered
       *
       * @return format Formatted date string
       */
  def getFormat(format: java.lang.String): java.lang.String = js.native
  /**
       * Gets the timestamp value of the date currently selected
       *
       * @return Timestamp
       */
  def getTime(): scala.Double = js.native
  def next(e: js.Any): scala.Unit = js.native
  def next(e: js.Any, moveYear: scala.Boolean): scala.Unit = js.native
  /**
       * Outputs a calendar that fits the year/month entered
       *
       */
  def page(y: scala.Double, m: scala.Double): scala.Unit = js.native
  def prev(e: js.Any): scala.Unit = js.native
  def prev(e: js.Any, moveYear: scala.Boolean): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  /**
       * Selects today if there is no value, or selects a date applicable to a timestamp or year/month/date
       *
       * @param "year"/"month"/"date"/"timestamp"/"Date"
       */
  def select(args: js.Any*): scala.Unit = js.native
}

