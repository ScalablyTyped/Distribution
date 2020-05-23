package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridCellMergingMethods extends js.Object {
  def changeGlobalLanguage(): Unit
  def changeGlobalRegional(): Unit
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit
  /**
    * Removes all igGridCellMerging UI changes and destroys the widget
    */
  def destroy(): Unit
  /**
    * Returns the merge state of a column.
    *
    * @param column The column index or column key to get the state for.
    */
  def isMerged(column: js.Object): Boolean
  /**
    * Merges the specified column unless it is already merged.
    *
    * @param column The column index or column key to merge.
    * @param raiseEvents Specifies if the operation should raise merging-related events.
    */
  def mergeColumn(column: js.Object, raiseEvents: Boolean): String
  def mergeRow(id: js.Object, fireEvents: js.Object): Unit
  /**
    * Restores the column to its unmerged state. Does nothing if the column is not merged.
    *
    * @param column The column index or column key to unmerge.
    */
  def unmergeColumn(column: js.Object): String
  def unmergeRow(id: js.Object, index: js.Object): Unit
}

object IgGridCellMergingMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    isMerged: js.Object => Boolean,
    mergeColumn: (js.Object, Boolean) => String,
    mergeRow: (js.Object, js.Object) => Unit,
    unmergeColumn: js.Object => String,
    unmergeRow: (js.Object, js.Object) => Unit
  ): IgGridCellMergingMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), isMerged = js.Any.fromFunction1(isMerged), mergeColumn = js.Any.fromFunction2(mergeColumn), mergeRow = js.Any.fromFunction2(mergeRow), unmergeColumn = js.Any.fromFunction1(unmergeColumn), unmergeRow = js.Any.fromFunction2(unmergeRow))
    __obj.asInstanceOf[IgGridCellMergingMethods]
  }
}

