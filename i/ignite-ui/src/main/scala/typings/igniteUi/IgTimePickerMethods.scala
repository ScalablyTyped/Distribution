package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTimePickerMethods extends StObject {
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.igdateeditor#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.igdateeditor#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  /**
    * Returns a reference to the drop-down button UI element of the editor.
    */
  def dropDownButton(): String = js.native
  
  /**
    * Gets reference to jquery object which is used as container of drop-down list.
    */
  def dropDownContainer(): String = js.native
  
  /**
    * Returns the visibility state of the calendar.
    */
  def dropDownVisible(): Boolean = js.native
  
  /**
    * Finds index of list item by text that matches with the search parameters.
    *
    * @param text The text to search for in the drop down list.
    * @param matchType The rule that is applied for searching the text.
    */
  def findListItemIndex(text: String): Double = js.native
  def findListItemIndex(text: String, matchType: js.Object): Double = js.native
  
  /**
    * Gets selected date as a date object. This method can be used when dataMode is set as either displayModeText or editModeText.
    * In such cases the value() method will not return date object and getSelectedDate() can be used to replace that functionality.
    */
  def getSelectedDate(): js.Date = js.native
  
  /**
    * Gets the selected list item.
    */
  def getSelectedListItem(): String = js.native
  
  /**
    * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
    */
  def isValid(): Boolean = js.native
  
  def selectDate(): Unit = js.native
  
  /**
    * Gets the index of the selected list item. Sets selected item by index.
    *
    * @param index The index of the item that needs to be selected.
    */
  def selectedListIndex(): Double = js.native
  def selectedListIndex(index: Double): Double = js.native
  
  /**
    * Decreases the date or time period, depending on the current cursor position.
    *
    * @param delta The decrease delta.
    */
  def spinDown(): Unit = js.native
  def spinDown(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin down UI element of the editor.
    */
  def spinDownButton(): String = js.native
  
  /**
    * Increases the date or time period, depending on the current cursor position.
    *
    * @param delta The increase delta.
    */
  def spinUp(): Unit = js.native
  def spinUp(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin up UI element of the editor.
    */
  def spinUpButton(): String = js.native
  
  def value(newValue: js.Object): Unit = js.native
}
