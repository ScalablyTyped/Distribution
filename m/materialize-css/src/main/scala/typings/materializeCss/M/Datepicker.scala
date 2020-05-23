package typings.materializeCss.M

import typings.std.Date
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datepicker
  extends Component[DatepickerOptions]
     with Openable {
  /**
    * CLEAR button instance (undocumented!).
    */
  var clearBtn: HTMLButtonElement = js.native
  /**
    * The selected Date.
    */
  var date: Date = js.native
  /**
    * DONE button instance (undocumented!).
    */
  var doneBtn: HTMLButtonElement = js.native
  /**
    * Change date view to a specific date on the datepicker
    * @param date Date to show on the datepicker.
    */
  def gotoDate(date: Date): Unit = js.native
  /**
    * Set a date on the datepicker
    * @param date Date to set on the datepicker.
    * @param preventOnSelect Undocumented as of 5 March 2018
    */
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  def setDate(date: String, preventOnSelect: Boolean): Unit = js.native
  def setDate(date: Date): Unit = js.native
  def setDate(date: Date, preventOnSelect: Boolean): Unit = js.native
  def setInputValue(): Unit = js.native
}

