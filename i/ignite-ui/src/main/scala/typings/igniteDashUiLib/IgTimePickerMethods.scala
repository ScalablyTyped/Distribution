package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTimePickerMethods extends js.Object {
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.igdateeditor#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.igdateeditor#options:regional) option setter
  	 */
  def changeRegional(): scala.Unit = js.native
  /**
  	 * Returns a reference to the drop-down button UI element of the editor.
  	 */
  def dropDownButton(): java.lang.String = js.native
  /**
  	 * Gets reference to jquery object which is used as container of drop-down list.
  	 */
  def dropDownContainer(): java.lang.String = js.native
  /**
  	 * Returns the visibility state of the calendar.
  	 */
  def dropDownVisible(): scala.Boolean = js.native
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
  	 * Gets selected date as a date object. This method can be used when dataMode is set as either displayModeText or editModeText.
  	 * In such cases the value() method will not return date object and getSelectedDate() can be used to replace that functionality.
  	 */
  def getSelectedDate(): stdLib.Date = js.native
  /**
  	 * Gets the selected list item.
  	 */
  def getSelectedListItem(): java.lang.String = js.native
  /**
  	 * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
  	 */
  def isValid(): scala.Boolean = js.native
  def selectDate(): scala.Unit = js.native
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
  	 * Decreases the date or time period, depending on the current cursor position.
  	 *
  	 * @param delta The decrease delta.
  	 */
  def spinDown(): scala.Unit = js.native
  /**
  	 * Decreases the date or time period, depending on the current cursor position.
  	 *
  	 * @param delta The decrease delta.
  	 */
  def spinDown(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin down UI element of the editor.
  	 */
  def spinDownButton(): java.lang.String = js.native
  /**
  	 * Increases the date or time period, depending on the current cursor position.
  	 *
  	 * @param delta The increase delta.
  	 */
  def spinUp(): scala.Unit = js.native
  /**
  	 * Increases the date or time period, depending on the current cursor position.
  	 *
  	 * @param delta The increase delta.
  	 */
  def spinUp(delta: scala.Double): scala.Unit = js.native
  /**
  	 * Returns a reference to the spin up UI element of the editor.
  	 */
  def spinUpButton(): java.lang.String = js.native
  def value(newValue: js.Object): scala.Unit = js.native
}

