package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridCellMergingMethods extends js.Object {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  
  /**
    * Removes all igGridCellMerging UI changes and destroys the widget
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the merge state of a column.
    *
    * @param column The column index or column key to get the state for.
    */
  def isMerged(column: js.Object): Boolean = js.native
  
  /**
    * Merges the specified column unless it is already merged.
    *
    * @param column The column index or column key to merge.
    * @param raiseEvents Specifies if the operation should raise merging-related events.
    */
  def mergeColumn(column: js.Object, raiseEvents: Boolean): String = js.native
  
  def mergeRow(id: js.Object, fireEvents: js.Object): Unit = js.native
  
  /**
    * Restores the column to its unmerged state. Does nothing if the column is not merged.
    *
    * @param column The column index or column key to unmerge.
    */
  def unmergeColumn(column: js.Object): String = js.native
  
  def unmergeRow(id: js.Object, index: js.Object): Unit = js.native
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
  
  @scala.inline
  implicit class IgGridCellMergingMethodsOps[Self <: IgGridCellMergingMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = this.set("changeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMerged(value: js.Object => Boolean): Self = this.set("isMerged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeColumn(value: (js.Object, Boolean) => String): Self = this.set("mergeColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMergeRow(value: (js.Object, js.Object) => Unit): Self = this.set("mergeRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmergeColumn(value: js.Object => String): Self = this.set("unmergeColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmergeRow(value: (js.Object, js.Object) => Unit): Self = this.set("unmergeRow", js.Any.fromFunction2(value))
  }
}
