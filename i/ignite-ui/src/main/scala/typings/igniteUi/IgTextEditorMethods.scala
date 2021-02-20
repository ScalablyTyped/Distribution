package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTextEditorMethods extends StObject {
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtexteditor#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtexteditor#options:language) or [locale](ui.igtexteditor#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Returns a reference to the clear button UI element of the editor.
    */
  def clearButton(): String = js.native
  
  /**
    * Destroys the widget
    */
  def destroy(): Unit = js.native
  
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
    * Gets a reference to the jQuery element that wraps the editor.
    */
  def editorContainer(): String = js.native
  
  /**
    * Gets the input element of the editor.
    */
  def field(): String = js.native
  
  /**
    * Finds index of list item by text that matches with the search parameters.
    *
    * @param text The text to search for in the drop down list.
    * @param matchType The rule that is applied for searching the text.
    */
  def findListItemIndex(text: String): Double = js.native
  def findListItemIndex(text: String, matchType: js.Object): Double = js.native
  
  /**
    * Gets the selected list item.
    */
  def getSelectedListItem(): String = js.native
  
  /**
    * Gets the selected text from the editor in edit mode. This can be done inside key event handlers, like keydown or keyup. This method can be used only when the editor is focused. If you invoke this method in display mode, when the editor input is blurred, the returned value will be an empty string.
    */
  def getSelectedText(): String = js.native
  
  /**
    * Gets the end index of the selected text in the editor.
    */
  def getSelectionEnd(): Double = js.native
  
  /**
    * Gets the start index of the selected text in the editor.
    */
  def getSelectionStart(): Double = js.native
  
  /**
    * Gets whether the editor has focus.
    */
  def hasFocus(): Boolean = js.native
  
  /**
    * Hides the editor.
    */
  def hide(): Unit = js.native
  
  /**
    * Hides the drop down list.
    */
  def hideDropDown(): Unit = js.native
  
  /**
    * Gets/Sets name attribute applied to the editor element.
    *
    * @param newValue The new input name.
    */
  def inputName(): String = js.native
  def inputName(newValue: String): String = js.native
  
  /**
    * Inserts the text at the location of the caret or over the current selection. If the editor is focused the method will insert the text over the current selection. If the editor is not focused the method will set the text as value of the editor.
    * Note: The method raises [textChanged](ui.igtexteditor#events:textChanged) event.
    *
    * @param string The string to be inserted.
    */
  def insert(string: String): Unit = js.native
  
  /**
    * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
    */
  def isValid(): Boolean = js.native
  
  /**
    * Selects the text between start and end indices in the editor. If the parameters are equal, then the method sets location of caret. The method has effect only when the editor has focus.
    *
    * @param start Start of the selection.
    * @param end End of the selection.
    */
  def select(start: Double, end: Double): Unit = js.native
  
  /**
    * Gets the index of the selected list item. Sets selected item by index.
    *
    * @param index The index of the item that needs to be selected.
    */
  def selectedListIndex(): Double = js.native
  def selectedListIndex(index: Double): Double = js.native
  
  /**
    * Sets focus to the editor after the specified delay.
    *
    * @param delay The delay before focusing the editor.
    */
  def setFocus(): Unit = js.native
  def setFocus(delay: Double): Unit = js.native
  
  /**
    * Shows the editor.
    */
  def show(): Unit = js.native
  
  /**
    * Shows the drop down list.
    */
  def showDropDown(): Unit = js.native
  
  /**
    * Selects the next item from the drop-down list.
    */
  def spinDown(): Unit = js.native
  
  /**
    * Returns a reference to the spin down UI element of the editor.
    */
  def spinDownButton(): String = js.native
  
  /**
    * Selects the previous item from the drop-down list.
    */
  def spinUp(): Unit = js.native
  
  /**
    * Returns a reference to the spin up UI element of the editor.
    */
  def spinUpButton(): String = js.native
  
  /**
    * Triggers validation for the editor. If validatorOptions are set will also call validate on the [igValidator](ui.igvalidator).
    */
  def validate(): Boolean = js.native
  
  /**
    * Gets a reference to [igValidator](ui.igvalidator) used by the editor.
    */
  def validator(): js.Object = js.native
  
  def value(newValue: js.Object): Unit = js.native
}
