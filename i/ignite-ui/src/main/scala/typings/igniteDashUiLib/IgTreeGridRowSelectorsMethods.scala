package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the check state of a row by index to specified value
  	 *
  	 * @param index Row index
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckState(index: scala.Double, toCheck: scala.Boolean): scala.Unit
  /**
  	 * Change the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
  	 */
  def changeCheckStateById(rowId: js.Object, toCheck: scala.Boolean): scala.Unit
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit
  /**
  	 * Returns the check state of the row by id.
  	 *
  	 * @param rowId
  	 */
  def checkStateById(rowId: js.Object): java.lang.String
  /**
  	 * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def checkedRows(): js.Array[_]
  def destroy(): scala.Unit
  /**
  	 * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def partiallyCheckedRows(): js.Array[_]
  /**
  	 * Toggles the check state of a row by index
  	 *
  	 * @param index Row index
  	 */
  def toggleCheckState(index: scala.Double): scala.Unit
  /**
  	 * Toggles the check state of a row by row id
  	 *
  	 * @param rowId Row Id
  	 */
  def toggleCheckStateById(rowId: js.Object): scala.Unit
  /**
  	 * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
  	 */
  def uncheckedRows(): js.Array[_]
}

object IgTreeGridRowSelectorsMethods {
  @scala.inline
  def apply(
    changeCheckState: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    changeCheckStateById: js.Function2[js.Object, scala.Boolean, scala.Unit],
    changeLocale: js.Function0[scala.Unit],
    checkStateById: js.Function1[js.Object, java.lang.String],
    checkedRows: js.Function0[js.Array[_]],
    destroy: js.Function0[scala.Unit],
    partiallyCheckedRows: js.Function0[js.Array[_]],
    toggleCheckState: js.Function1[scala.Double, scala.Unit],
    toggleCheckStateById: js.Function1[js.Object, scala.Unit],
    uncheckedRows: js.Function0[js.Array[_]]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeCheckState = changeCheckState, changeCheckStateById = changeCheckStateById, changeLocale = changeLocale, checkStateById = checkStateById, checkedRows = checkedRows, destroy = destroy, partiallyCheckedRows = partiallyCheckedRows, toggleCheckState = toggleCheckState, toggleCheckStateById = toggleCheckStateById, uncheckedRows = uncheckedRows)
  
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
}

