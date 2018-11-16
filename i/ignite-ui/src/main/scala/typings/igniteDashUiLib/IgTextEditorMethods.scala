package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTextEditorMethods extends js.Object {
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtexteditor#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtexteditor#options:language) or [locale](ui.igtexteditor#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Returns a reference to the clear button UI element of the editor.
  	 */
  def clearButton(): java.lang.String = js.native
  /**
  	 * Destroys the widget
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Gets the visible text in the editor.
  	 */
  def displayValue(): java.lang.String = js.native
  /**
  	 * Returns a reference to the drop-down button UI element of the editor.
  	 */
  def dropDownButton(): java.lang.String = js.native
  /**
  	 * Gets reference to jquery object which is used as container of drop-down list.
  	 */
  def dropDownContainer(): java.lang.String = js.native
  /**
  	 * Returns if the drop-down list is visible.
  	 */
  def dropDownVisible(): scala.Boolean = js.native
  /**
  	 * Gets a reference to the jQuery element that wraps the editor.
  	 */
  def editorContainer(): java.lang.String = js.native
  /**
  	 * Gets the input element of the editor.
  	 */
  def field(): java.lang.String = js.native
  /**
  	 * Finds index of list item by text that matches with the search parameters.
  	 *
  	 * @param text The text to search for in the drop down list.
  	 * @param matchType The rule that is applied for searching the text.
  	 */
  def findListItemIndex(text: java.lang.String): scala.Double = js.native
  /**
  	 * Finds index of list item by text that matches with the search parameters.
  	 *
  	 * @param text The text to search for in the drop down list.
  	 * @param matchType The rule that is applied for searching the text.
  	 */
  def findListItemIndex(text: java.lang.String, matchType: js.Object): scala.Double = js.native
  /**
  	 * Gets the selected list item.
  	 */
  def getSelectedListItem(): java.lang.String = js.native
  /**
  	 * Gets the selected text from the editor in edit mode. This can be done inside key event handlers, like keydown or keyup. This method can be used only when the editor is focused. If you invoke this method in display mode, when the editor input is blurred, the returned value will be an empty string.
  	 */
  def getSelectedText(): java.lang.String = js.native
  /**
  	 * Gets the end index of the selected text in the editor.
  	 */
  def getSelectionEnd(): scala.Double = js.native
  /**
  	 * Gets the start index of the selected text in the editor.
  	 */
  def getSelectionStart(): scala.Double = js.native
  /**
  	 * Gets whether the editor has focus.
  	 */
  def hasFocus(): scala.Boolean = js.native
  /**
  	 * Hides the editor.
  	 */
  def hide(): scala.Unit = js.native
  /**
  	 * Hides the drop down list.
  	 */
  def hideDropDown(): scala.Unit = js.native
  /**
  	 * Gets/Sets name attribute applied to the editor element.
  	 *
  	 * @param newValue The new input name.
  	 */
  def inputName(): java.lang.String = js.native
  /**
  	 * Gets/Sets name attribute applied to the editor element.
  	 *
  	 * @param newValue The new input name.
  	 */
  def inputName(newValue: java.lang.String): java.lang.String = js.native
  /**
  	 * Inserts the text at the location of the caret or over the current selection. If the editor is focused the method will insert the text over the current selection. If the editor is not focused the method will set the text as value of the editor.
  	 * Note: The method raises [textChanged](ui.igtexteditor#events:textChanged) event.
  	 *
  	 * @param string The string to be inserted.
  	 */
  def insert(string: java.lang.String): scala.Unit = js.native
  /**
  	 * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
  	 */
  def isValid(): scala.Boolean = js.native
  /**
  	 * Selects the text between start and end indices in the editor. If the parameters are equal, then the method sets location of caret. The method has effect only when the editor has focus.
  	 *
  	 * @param start Start of the selection.
  	 * @param end End of the selection.
  	 */
  def select(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  	 * Gets the index of the selected list item. Sets selected item by index.
  	 *
  	 * @param index The index of the item that needs to be selected.
  	 */
  def selectedListIndex(): scala.Double = js.native
  /**
  	 * Gets the index of the selected list item. Sets selected item by index.
  	 *
  	 * @param index The index of the item that needs to be selected.
  	 */
  def selectedListIndex(index: scala.Double): scala.Double = js.native
  /**
  	 * Sets focus to the editor after the specified delay.
  	 *
  	 * @param delay The delay before focusing the editor.
  	 */
  def setFocus(): scala.Unit = js.native
  /**
  	 * Sets focus to the editor after the specified delay.
  	 *
  	 * @param delay The delay before focusing the editor.
  	 */
  def setFocus(delay: scala.Double): scala.Unit = js.native
  /**
  	 * Shows the editor.
  	 */
  def show(): scala.Unit = js.native
  /**
  	 * Shows the drop down list.
  	 */
  def showDropDown(): scala.Unit = js.native
  /**
  	 * Selects the next item from the drop-down list.
  	 */
  def spinDown(): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin down UI element of the editor.
  	 */
  def spinDownButton(): java.lang.String = js.native
  /**
  	 * Selects the previous item from the drop-down list.
  	 */
  def spinUp(): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin up UI element of the editor.
  	 */
  def spinUpButton(): java.lang.String = js.native
  /**
  	 * Triggers validation for the editor. If validatorOptions are set will also call validate on the [igValidator](ui.igvalidator).
  	 */
  def validate(): scala.Boolean = js.native
  /**
  	 * Gets a reference to [igValidator](ui.igvalidator) used by the editor.
  	 */
  def validator(): js.Object = js.native
  def value(newValue: js.Object): scala.Unit = js.native
}

