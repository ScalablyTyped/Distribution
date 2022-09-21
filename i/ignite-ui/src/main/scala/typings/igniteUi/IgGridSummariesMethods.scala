package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSummariesMethods extends StObject {
  
  /**
    * Calculate summaries
    */
  def calculateSummaries(): Unit
  
  /**
    * Summary calculate the whole data for the specified column key, columnMethods and dataType (used when datasource is remote and dataType is date or time)
    *
    * @param ck ColumnKey
    * @param columnMethods Array of column methods objects
    * @param data Object which represents result
    * represents dataType for the current column
    * @param dataType
    */
  def calculateSummaryColumn(ck: String, columnMethods: js.Array[Any], data: js.Object, dataType: js.Object): Unit
  
  def changeGlobalLanguage(): Unit
  
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridsummaries#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridsummaries#options:language) or [locale](ui.iggridsummaries#options:locale) option setter
    */
  def changeLocale(): Unit
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridsummaries#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.iggridsummaries#options:regional) option setter
    */
  def changeRegional(): Unit
  
  /**
    * Remove all summaries dropdown buttons.
    */
  def clearAllFooterIcons(): Unit
  
  def destroy(): Unit
  
  /**
    * Returns whether summaries rows are hidden
    */
  def isSummariesRowsHidden(): Unit
  
  /**
    * Select/Unselect specified checkbox
    *
    * @param $checkbox Specifies the jQuery object for checkbox
    * @param isToSelect Specify whether to select or not checkbox
    */
  def selectCheckBox($checkbox: js.Object, isToSelect: Boolean): Unit
  
  /**
    * Show/Hide dialog
    *
    * @param $dialog jQuery object representation of dropdown div element
    */
  def showHideDialog($dialog: js.Object): Unit
  
  /**
    * Return a JQUERY object which holds all summaries for column with the specified column key
    *
    * @param columnKey
    */
  def summariesFor(columnKey: js.Object): Unit
  
  /**
    * Return a JQUERY object which holds all summaries for all columns
    */
  def summaryCollection(): Unit
  
  /**
    * Toggles the checkstate of a checkbox if checkboxMode is not set to off, otherwise does nothing.
    *
    * @param $checkbox Specifies the jQuery object of the checkbox.
    */
  def toggleCheckstate($checkbox: js.Object): Unit
  
  /**
    * Toggle drop down
    *
    * @param columnKey toggle drop down for the column with the specified key
    * @param event event object. Its data should contain current columnKey, isAnimating, buttonId
    */
  def toggleDropDown(columnKey: String, event: js.Object): Unit
  
  /**
    * Toggle summaries rows
    *
    * @param isToShow Specifies whether to show or not summaries
    * @param isInternalCall Optional parameter.Specifies whether this function is called internally by the widget.
    */
  def toggleSummariesRows(isToShow: Boolean, isInternalCall: Boolean): Unit
}
object IgGridSummariesMethods {
  
  inline def apply(
    calculateSummaries: () => Unit,
    calculateSummaryColumn: (String, js.Array[Any], js.Object, js.Object) => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    changeRegional: () => Unit,
    clearAllFooterIcons: () => Unit,
    destroy: () => Unit,
    isSummariesRowsHidden: () => Unit,
    selectCheckBox: (js.Object, Boolean) => Unit,
    showHideDialog: js.Object => Unit,
    summariesFor: js.Object => Unit,
    summaryCollection: () => Unit,
    toggleCheckstate: js.Object => Unit,
    toggleDropDown: (String, js.Object) => Unit,
    toggleSummariesRows: (Boolean, Boolean) => Unit
  ): IgGridSummariesMethods = {
    val __obj = js.Dynamic.literal(calculateSummaries = js.Any.fromFunction0(calculateSummaries), calculateSummaryColumn = js.Any.fromFunction4(calculateSummaryColumn), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), changeRegional = js.Any.fromFunction0(changeRegional), clearAllFooterIcons = js.Any.fromFunction0(clearAllFooterIcons), destroy = js.Any.fromFunction0(destroy), isSummariesRowsHidden = js.Any.fromFunction0(isSummariesRowsHidden), selectCheckBox = js.Any.fromFunction2(selectCheckBox), showHideDialog = js.Any.fromFunction1(showHideDialog), summariesFor = js.Any.fromFunction1(summariesFor), summaryCollection = js.Any.fromFunction0(summaryCollection), toggleCheckstate = js.Any.fromFunction1(toggleCheckstate), toggleDropDown = js.Any.fromFunction2(toggleDropDown), toggleSummariesRows = js.Any.fromFunction2(toggleSummariesRows))
    __obj.asInstanceOf[IgGridSummariesMethods]
  }
  
  extension [Self <: IgGridSummariesMethods](x: Self) {
    
    inline def setCalculateSummaries(value: () => Unit): Self = StObject.set(x, "calculateSummaries", js.Any.fromFunction0(value))
    
    inline def setCalculateSummaryColumn(value: (String, js.Array[Any], js.Object, js.Object) => Unit): Self = StObject.set(x, "calculateSummaryColumn", js.Any.fromFunction4(value))
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    inline def setChangeRegional(value: () => Unit): Self = StObject.set(x, "changeRegional", js.Any.fromFunction0(value))
    
    inline def setClearAllFooterIcons(value: () => Unit): Self = StObject.set(x, "clearAllFooterIcons", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setIsSummariesRowsHidden(value: () => Unit): Self = StObject.set(x, "isSummariesRowsHidden", js.Any.fromFunction0(value))
    
    inline def setSelectCheckBox(value: (js.Object, Boolean) => Unit): Self = StObject.set(x, "selectCheckBox", js.Any.fromFunction2(value))
    
    inline def setShowHideDialog(value: js.Object => Unit): Self = StObject.set(x, "showHideDialog", js.Any.fromFunction1(value))
    
    inline def setSummariesFor(value: js.Object => Unit): Self = StObject.set(x, "summariesFor", js.Any.fromFunction1(value))
    
    inline def setSummaryCollection(value: () => Unit): Self = StObject.set(x, "summaryCollection", js.Any.fromFunction0(value))
    
    inline def setToggleCheckstate(value: js.Object => Unit): Self = StObject.set(x, "toggleCheckstate", js.Any.fromFunction1(value))
    
    inline def setToggleDropDown(value: (String, js.Object) => Unit): Self = StObject.set(x, "toggleDropDown", js.Any.fromFunction2(value))
    
    inline def setToggleSummariesRows(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "toggleSummariesRows", js.Any.fromFunction2(value))
  }
}
