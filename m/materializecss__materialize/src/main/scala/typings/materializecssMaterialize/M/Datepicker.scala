package typings.materializecssMaterialize.M

import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Datepicker
  extends StObject
     with Component[DatepickerOptions]
     with Openable {
  
  /**
    * CLEAR button instance (undocumented!).
    */
  var clearBtn: HTMLButtonElement = js.native
  
  /**
    * The selected Date.
    */
  var date: js.Date = js.native
  
  /**
    * DONE button instance (undocumented!).
    */
  var doneBtn: HTMLButtonElement = js.native
  
  /**
    * Change date view to a specific date on the datepicker
    * @param date Date to show on the datepicker.
    */
  def gotoDate(date: js.Date): Unit = js.native
  
  /**
    * Set a date on the datepicker
    * @param date Date to set on the datepicker.
    * @param preventOnSelect Undocumented as of 5 March 2018
    */
  def setDate(): Unit = js.native
  def setDate(date: String): Unit = js.native
  def setDate(date: String, preventOnSelect: Boolean): Unit = js.native
  def setDate(date: js.Date): Unit = js.native
  def setDate(date: js.Date, preventOnSelect: Boolean): Unit = js.native
  def setDate(date: Unit, preventOnSelect: Boolean): Unit = js.native
  
  def setInputValue(): Unit = js.native
}
