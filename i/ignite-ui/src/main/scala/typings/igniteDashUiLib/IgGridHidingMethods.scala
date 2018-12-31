package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridHidingMethods extends js.Object {
  def changeGlobalLanguage(): scala.Unit = js.native
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridhiding#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridhiding#options:language) or [locale](ui.iggridhiding#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Destroys the hiding widget
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Hides a visible column. If the column is hidden the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when the column is hidden(optional)
  	 */
  def hideColumn(column: js.Object): scala.Unit = js.native
  def hideColumn(column: js.Object, callback: js.Function): scala.Unit = js.native
  /**
  	 * Hides the Column Chooser dialog. If it is not visible the method does nothing.
  	 */
  def hideColumnChooser(): scala.Unit = js.native
  /**
  	 * Hides visible columns specified by the array. If the column is hidden the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param columns An array of identifiers for the columns. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when all columns are hidden(optional)
  	 */
  def hideMultiColumns(columns: js.Array[_]): scala.Unit = js.native
  def hideMultiColumns(columns: js.Array[_], callback: js.Function): scala.Unit = js.native
  /**
  	 * Gets whether the reset button in the column chooser dialog is to be rendered or not.
  	 */
  def isToRenderButtonReset(): scala.Unit = js.native
  /**
  	 * Remove Reset button in column chooser modal dialog
  	 */
  def removeColumnChooserResetButton(): scala.Unit = js.native
  /**
  	 * Renders the Reset button in the Column Chooser dialog.
  	 */
  def renderColumnChooserResetButton(): scala.Unit = js.native
  /**
  	 * Reset hidden/shown column to initial state of dialog(when it is opened)
  	 */
  def resetHidingColumnChooser(): scala.Unit = js.native
  /**
  	 * Shows a hidden column. If the column is not hidden the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when the column(s) is shown(optional)
  	 */
  def showColumn(column: js.Object): scala.Unit = js.native
  def showColumn(column: js.Object, callback: js.Function): scala.Unit = js.native
  /**
  	 * Shows the Column Chooser dialog. If it is visible the method does nothing.
  	 */
  def showColumnChooser(): scala.Unit = js.native
  /**
  	 * Show visible columns specified by the array. If the column is shown the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param columns An array of identifiers for the columns. If a number is provided it will be used as a column index else if a strings is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when all columns are shown(optional)
  	 */
  def showMultiColumns(columns: js.Array[_]): scala.Unit = js.native
  def showMultiColumns(columns: js.Array[_], callback: js.Function): scala.Unit = js.native
}

