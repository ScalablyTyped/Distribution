package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnMovingMethods extends js.Object {
  def changeGlobalLanguage(): Unit = js.native
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridcolumnmoving#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridcolumnmoving#options:language) or [locale](ui.iggridcolumnmoving#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Restoring overwritten functions
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Moves a visible column at a specified place, in front or behind a target column or at a target index
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier of the column to be moved. It can be a key, a Multi-Column Header identificator, or an index in a number format. The latter is not supported when the grid contains multi-column headers.
  	 * @param target An identifier of a column where the moved column should move to or an index at which the moved column should be moved to. In the case of a column identifier the column will be moved after it by default.
  	 * @param after Specifies whether the column moved should be moved after or before the target column.
  	 * @param inDom Specifies whether the column moving will be enacted through DOM manipulation or through rerendering of the grid.
  	 * @param callback Specifies a custom function to be called when the column is moved.
  	 */
  def moveColumn(column: js.Object, target: js.Object): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean, inDom: Boolean): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean, inDom: Boolean, callback: js.Function): Unit = js.native
}

