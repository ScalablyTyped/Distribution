package typings
package materializeDashCssLib.MNs

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
  var clearBtn: stdLib.HTMLButtonElement = js.native
  /**
    * The selected Date.
    */
  var date: stdLib.Date = js.native
  /**
    * DONE button instance (undocumented!).
    */
  var doneBtn: stdLib.HTMLButtonElement = js.native
  /* CompleteClass */
  override var isOpen: scala.Boolean = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    * Change date view to a specific date on the datepicker
    * @param date Date to show on the datepicker.
    */
  def gotoDate(date: stdLib.Date): scala.Unit = js.native
  /* CompleteClass */
  override def open(): scala.Unit = js.native
  /**
    * Set a date on the datepicker
    * @param date Date to set on the datepicker.
    * @param preventOnSelect Undocumented as of 5 March 2018
    */
  def setDate(): scala.Unit = js.native
  def setDate(date: java.lang.String): scala.Unit = js.native
  def setDate(date: java.lang.String, preventOnSelect: scala.Boolean): scala.Unit = js.native
  def setDate(date: stdLib.Date): scala.Unit = js.native
  def setDate(date: stdLib.Date, preventOnSelect: scala.Boolean): scala.Unit = js.native
  def setInputValue(): scala.Unit = js.native
}

/* static members */
@JSGlobal("M.Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: stdLib.Element): materializeDashCssLib.MNs.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: materializeDashCssLib.MElements): js.Array[materializeDashCssLib.MNs.Datepicker] = js.native
  def init(
    els: materializeDashCssLib.MElements,
    options: stdLib.Partial[materializeDashCssLib.MNs.DatepickerOptions]
  ): js.Array[materializeDashCssLib.MNs.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: stdLib.Element): materializeDashCssLib.MNs.Datepicker = js.native
  def init(els: stdLib.Element, options: stdLib.Partial[materializeDashCssLib.MNs.DatepickerOptions]): materializeDashCssLib.MNs.Datepicker = js.native
}

