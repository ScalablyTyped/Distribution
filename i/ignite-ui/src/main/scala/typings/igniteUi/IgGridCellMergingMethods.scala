package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridCellMergingMethods extends StObject {
  
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
  implicit class IgGridCellMergingMethodsMutableBuilder[Self <: IgGridCellMergingMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMerged(value: js.Object => Boolean): Self = StObject.set(x, "isMerged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeColumn(value: (js.Object, Boolean) => String): Self = StObject.set(x, "mergeColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMergeRow(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "mergeRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmergeColumn(value: js.Object => String): Self = StObject.set(x, "unmergeColumn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmergeRow(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "unmergeRow", js.Any.fromFunction2(value))
  }
}
