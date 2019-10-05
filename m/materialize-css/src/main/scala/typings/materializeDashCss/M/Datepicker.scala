package typings.materializeDashCss.M

import typings.materializeDashCss.MElements
import typings.std.Date
import typings.std.Element
import typings.std.HTMLButtonElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Datepicker")
@js.native
class Datepicker ()
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
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Change date view to a specific date on the datepicker
    * @param date Date to show on the datepicker.
    */
  def gotoDate(date: Date): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
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

/* static members */
@JSGlobal("M.Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[Datepicker] = js.native
  def init(els: MElements, options: Partial[DatepickerOptions]): js.Array[Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): Datepicker = js.native
  def init(els: Element, options: Partial[DatepickerOptions]): Datepicker = js.native
}

