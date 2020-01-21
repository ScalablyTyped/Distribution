package typings.lightpick.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lightpick extends js.Object {
  /**
    * The calendar containing HTML element.
    */
  val el: HTMLElement = js.native
  /**
    * Tells whether the picker is currently visible or not.
    * Visibility can be changed with show() / hide() methods.
    */
  val isShowing: Boolean = js.native
  /**
    * Hide the picker and remove all event listeners.
    */
  def destroy(): Unit = js.native
  /**
    * Return current date as moment object.
    */
  def getDate(): OutputDate = js.native
  /**
    * Return current end of date range as moment object.
    */
  def getEndDate(): OutputDate = js.native
  /**
    * Return current start of date range as moment object.
    */
  def getStartDate(): OutputDate = js.native
  def gotoDate(): Unit = js.native
  def gotoDate(date: InputDate): Unit = js.native
  def gotoMonth(month: Double): Unit = js.native
  def gotoToday(): Unit = js.native
  def gotoYear(year: Double): Unit = js.native
  /**
    * Hide the picker.
    */
  def hide(): Unit = js.native
  def nextMonth(): Unit = js.native
  def prevMonth(): Unit = js.native
  /**
    * Update picker options.
    */
  def reloadOptions(options: Options): Unit = js.native
  def reset(): Unit = js.native
  /**
    * Set date when singleDate is true.
    */
  def setDate(): Unit = js.native
  def setDate(date: InputDate): Unit = js.native
  def setDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
  /**
    * Set date range.
    */
  def setDateRange(): Unit = js.native
  def setDateRange(start: InputDate): Unit = js.native
  def setDateRange(start: InputDate, end: InputDate): Unit = js.native
  def setDateRange(start: InputDate, end: InputDate, preventOnSelect: Boolean): Unit = js.native
  def setDisableDates(dates: js.Array[DisabledDate]): Unit = js.native
  def setEndDate(): Unit = js.native
  def setEndDate(date: InputDate): Unit = js.native
  def setEndDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
  def setStartDate(): Unit = js.native
  def setStartDate(date: InputDate): Unit = js.native
  def setStartDate(date: InputDate, preventOnSelect: Boolean): Unit = js.native
  /**
    * Make the picker visible.
    */
  def show(): Unit = js.native
  /**
    * Returns the date in a string format.
    */
  def toString(format: FormatSpecification): String = js.native
}

