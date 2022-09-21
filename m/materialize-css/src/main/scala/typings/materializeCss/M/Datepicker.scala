package typings.materializeCss.M

import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<DatepickerOptions> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Openable * / any */ @js.native
trait Datepicker extends StObject {
  
  /**
    * CLEAR button instance (undocumented!).
    */
  var clearBtn: HTMLButtonElement = js.native
  
  /**
    * Close datepicker
    */
  def close(): Unit = js.native
  
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
    * If the picker is open.
    */
  var isOpen: Boolean = js.native
  
  /**
    * Open datepicker
    */
  def open(): Unit = js.native
  
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
