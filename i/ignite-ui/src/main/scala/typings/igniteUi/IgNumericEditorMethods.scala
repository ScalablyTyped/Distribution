package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgNumericEditorMethods extends StObject {
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtexteditor#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtexteditor#options:language) or [locale](ui.igtexteditor#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.ignumericeditor#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.ignumericeditor#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  /**
    * Returns a reference to the clear button UI element of the editor.
    */
  def clearButton(): String = js.native
  
  /**
    * Gets the visible text in the editor.
    */
  def displayValue(): String = js.native
  
  /**
    * Returns a reference to the drop-down button UI element of the editor.
    */
  def dropDownButton(): String = js.native
  
  /**
    * Gets reference to jquery object which is used as container of drop-down list.
    */
  def dropDownContainer(): String = js.native
  
  /**
    * Returns if the drop-down list is visible.
    */
  def dropDownVisible(): Boolean = js.native
  
  /**
    * Finds index of list item by text that matches with the search parameters.
    *
    * @param number The text to search for.
    */
  def findListItemIndex(number: Double): Double = js.native
  
  /**
    * Gets current regional.
    */
  def getRegionalOption(): String = js.native
  
  /**
    * Gets the selected list item.
    */
  def getSelectedListItem(): String = js.native
  
  def getSelectedText(): Unit = js.native
  
  def getSelectionEnd(): Unit = js.native
  
  def getSelectionStart(): Unit = js.native
  
  /**
    * Hides the drop down list.
    */
  def hideDropDown(): Unit = js.native
  
  /**
    * Inserts the text at the location of the caret or over the current selection. If the editor is focused the method will insert the text over the current selection. If the editor is not focused the method will set the text as value of the editor.
    * Note: The method raises [textChanged](ui.igtexteditor#events:textChanged) event.
    *
    * @param string The string to be inserted.
    */
  def insert(string: String): Unit = js.native
  
  /**
    * Selects the text between start and end indices in the editor. If the parameters are equal, then the method sets location of caret. The method has effect only when the editor has focus.
    *
    * @param start Start of the selection.
    * @param end End of the selection.
    */
  def select(start: Double, end: Double): Unit = js.native
  
  /**
    * This method is deprecated in favor of [spinDown](ui.%%WidgetNameLowered%%#options:spinDown).
    */
  def selectListIndexDown(): Unit = js.native
  
  /**
    * This method is deprecated in favor of [spinUp](ui.%%WidgetNameLowered%%#options:spinUp).
    */
  def selectListIndexUp(): Unit = js.native
  
  /**
    * Gets the index of the selected list item. Sets selected item by index.
    *
    * @param index The index of the item that needs to be selected.
    */
  def selectedListIndex(): Double = js.native
  def selectedListIndex(index: Double): Double = js.native
  
  /**
    * Shows the drop down list.
    */
  def showDropDown(): Unit = js.native
  
  /**
    * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
    *
    * @param delta Decrement value.
    */
  def spinDown(): Unit = js.native
  def spinDown(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin down UI element of the editor.
    */
  def spinDownButton(): String = js.native
  
  /**
    * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
    *
    * @param delta Increments value.
    */
  def spinUp(): Unit = js.native
  def spinUp(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin up UI element of the editor.
    */
  def spinUpButton(): String = js.native
  
  /**
    * Gets/Sets editor value.
    *
    * @param newValue New editor value.
    */
  def value(): Double = js.native
  def value(newValue: Double): Double = js.native
}
