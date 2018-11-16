package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgNumericEditorMethods extends js.Object {
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtexteditor#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtexteditor#options:language) or [locale](ui.igtexteditor#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.ignumericeditor#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.ignumericeditor#options:regional) option setter
  	 */
  def changeRegional(): scala.Unit = js.native
  /**
  	 * Returns a reference to the clear button UI element of the editor.
  	 */
  def clearButton(): java.lang.String = js.native
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
  	 * Finds index of list item by text that matches with the search parameters.
  	 *
  	 * @param number The text to search for.
  	 */
  def findListItemIndex(number: scala.Double): scala.Double = js.native
  /**
  	 * Gets current regional.
  	 */
  def getRegionalOption(): java.lang.String = js.native
  /**
  	 * Gets the selected list item.
  	 */
  def getSelectedListItem(): java.lang.String = js.native
  def getSelectedText(): scala.Unit = js.native
  def getSelectionEnd(): scala.Unit = js.native
  def getSelectionStart(): scala.Unit = js.native
  /**
  	 * Hides the drop down list.
  	 */
  def hideDropDown(): scala.Unit = js.native
  /**
  	 * Inserts the text at the location of the caret or over the current selection. If the editor is focused the method will insert the text over the current selection. If the editor is not focused the method will set the text as value of the editor.
  	 * Note: The method raises [textChanged](ui.igtexteditor#events:textChanged) event.
  	 *
  	 * @param string The string to be inserted.
  	 */
  def insert(string: java.lang.String): scala.Unit = js.native
  /**
  	 * Selects the text between start and end indices in the editor. If the parameters are equal, then the method sets location of caret. The method has effect only when the editor has focus.
  	 *
  	 * @param start Start of the selection.
  	 * @param end End of the selection.
  	 */
  def select(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  	 * This method is deprecated in favor of [spinDown](ui.%%WidgetNameLowered%%#options:spinDown).
  	 */
  def selectListIndexDown(): scala.Unit = js.native
  /**
  	 * This method is deprecated in favor of [spinUp](ui.%%WidgetNameLowered%%#options:spinUp).
  	 */
  def selectListIndexUp(): scala.Unit = js.native
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
  	 * Shows the drop down list.
  	 */
  def showDropDown(): scala.Unit = js.native
  /**
  	 * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Decrement value.
  	 */
  def spinDown(): scala.Unit = js.native
  /**
  	 * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Decrement value.
  	 */
  def spinDown(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin down UI element of the editor.
  	 */
  def spinDownButton(): java.lang.String = js.native
  /**
  	 * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Increments value.
  	 */
  def spinUp(): scala.Unit = js.native
  /**
  	 * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
  	 *
  	 * @param delta Increments value.
  	 */
  def spinUp(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin up UI element of the editor.
  	 */
  def spinUpButton(): java.lang.String = js.native
  /**
  	 * Gets/Sets editor value.
  	 *
  	 * @param newValue New editor value.
  	 */
  def value(): scala.Double = js.native
  /**
  	 * Gets/Sets editor value.
  	 *
  	 * @param newValue New editor value.
  	 */
  def value(newValue: scala.Double): scala.Double = js.native
}

