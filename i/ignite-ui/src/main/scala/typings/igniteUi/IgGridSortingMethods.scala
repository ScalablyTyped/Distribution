package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridSortingMethods extends StObject {
  
  def changeGlobalLanguage(): Unit = js.native
  
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridsorting#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridsorting#options:language) or [locale](ui.iggridsorting#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Removes current sorting(for all sorted columns) and updates the UI.
    */
  def clearSorting(): Unit = js.native
  
  /**
    * Closes the multiple sorting dialog.
    */
  def closeMultipleSortingDialog(): Unit = js.native
  
  /**
    * Destroys the sorting feature. Unbinds events, removes added sorting elements, etc.
    */
  def destroy(): Unit = js.native
  
  /**
    * Opens the multiple sorting dialog.
    */
  def openMultipleSortingDialog(): Unit = js.native
  
  /**
    * Remove clear button for multiple sorting dialog
    */
  def removeDialogClearButton(): Unit = js.native
  
  /**
    * Renders content of multiple sorting dialog - sorted and unsorted columns.
    *
    * @param isToCallEvents
    */
  def renderMultipleSortingDialogContent(isToCallEvents: js.Object): Unit = js.native
  
  /**
    * Sorts the data in a grid column  and updates the UI.
    *
    * @param index Column key (string) or index (number) - for multi-row grid only column key can be used. Specifies the column which we want to sort. If the mode is multiple, previous sorting states are not cleared.
    * @param direction Specifies sorting direction (ascending or descending)
    * @param header
    */
  def sortColumn(index: js.Object, direction: js.Object, header: js.Object): Unit = js.native
  
  /**
    * Sorts the data in grid columns and updates the UI. It accepts optional argument - array of sorting expressions. If passed then sorts the data and sets sorting expressions of the data source. If not passed uses current sorting expressions of the data source.
    *
    * @param exprs array of sorting expressions. If not set then the method uses expressions defined in sorting settings of the data source.
    */
  def sortMultiple(): Unit = js.native
  def sortMultiple(exprs: js.Array[Any]): Unit = js.native
  
  /**
    * Removes sorting for the grid column with the specified columnKey/columnIndex and updates the UI.
    *
    * @param index Column key (string) or index (number) - for multi-row grid only column key can be used. Specifies the column for which we want to remove sorting. If the mode is multiple, previous sorting states are not cleared.
    * @param header - if specified client events should be fired
    */
  def unsortColumn(index: js.Object, header: js.Object): Unit = js.native
}
