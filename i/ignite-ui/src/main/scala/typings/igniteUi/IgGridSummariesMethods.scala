package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesMethods extends js.Object {
  /**
    * Calculate summaries
    */
  def calculateSummaries(): Unit = js.native
  /**
    * Summary calculate the whole data for the specified column key, columnMethods and dataType (used when datasource is remote and dataType is date or time)
    *
    * @param ck ColumnKey
    * @param columnMethods Array of column methods objects
    * @param data Object which represents result
    * represents dataType for the current column
    * @param dataType
    */
  def calculateSummaryColumn(ck: String, columnMethods: js.Array[_], data: js.Object, dataType: js.Object): Unit = js.native
  def changeGlobalLanguage(): Unit = js.native
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridsummaries#options:language)
    * Note that this method is for rare scenarios, see [language](ui.iggridsummaries#options:language) or [locale](ui.iggridsummaries#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggridsummaries#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.iggridsummaries#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  /**
    * Remove all summaries dropdown buttons.
    */
  def clearAllFooterIcons(): Unit = js.native
  def destroy(): Unit = js.native
  /**
    * Returns whether summaries rows are hidden
    */
  def isSummariesRowsHidden(): Unit = js.native
  /**
    * Select/Unselect specified checkbox
    *
    * @param $checkbox Specifies the jQuery object for checkbox
    * @param isToSelect Specify whether to select or not checkbox
    */
  def selectCheckBox($checkbox: js.Object, isToSelect: Boolean): Unit = js.native
  /**
    * Show/Hide dialog
    *
    * @param $dialog jQuery object representation of dropdown div element
    */
  def showHideDialog($dialog: js.Object): Unit = js.native
  /**
    * Return a JQUERY object which holds all summaries for column with the specified column key
    *
    * @param columnKey
    */
  def summariesFor(columnKey: js.Object): Unit = js.native
  /**
    * Return a JQUERY object which holds all summaries for all columns
    */
  def summaryCollection(): Unit = js.native
  /**
    * Toggles the checkstate of a checkbox if checkboxMode is not set to off, otherwise does nothing.
    *
    * @param $checkbox Specifies the jQuery object of the checkbox.
    */
  def toggleCheckstate($checkbox: js.Object): Unit = js.native
  /**
    * Toggle drop down
    *
    * @param columnKey toggle drop down for the column with the specified key
    * @param event event object. Its data should contain current columnKey, isAnimating, buttonId
    */
  def toggleDropDown(columnKey: String, event: js.Object): Unit = js.native
  /**
    * Toggle summaries rows
    *
    * @param isToShow Specifies whether to show or not summaries
    * @param isInternalCall Optional parameter.Specifies whether this function is called internally by the widget.
    */
  def toggleSummariesRows(isToShow: Boolean, isInternalCall: Boolean): Unit = js.native
}

object IgGridSummariesMethods {
  @scala.inline
  def apply(
    calculateSummaries: () => Unit,
    calculateSummaryColumn: (String, js.Array[_], js.Object, js.Object) => Unit,
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
  @scala.inline
  implicit class IgGridSummariesMethodsOps[Self <: IgGridSummariesMethods] (val x: Self) extends AnyVal {
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
    def setCalculateSummaries(value: () => Unit): Self = this.set("calculateSummaries", js.Any.fromFunction0(value))
    @scala.inline
    def setCalculateSummaryColumn(value: (String, js.Array[_], js.Object, js.Object) => Unit): Self = this.set("calculateSummaryColumn", js.Any.fromFunction4(value))
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeRegional(value: () => Unit): Self = this.set("changeRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setClearAllFooterIcons(value: () => Unit): Self = this.set("clearAllFooterIcons", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSummariesRowsHidden(value: () => Unit): Self = this.set("isSummariesRowsHidden", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectCheckBox(value: (js.Object, Boolean) => Unit): Self = this.set("selectCheckBox", js.Any.fromFunction2(value))
    @scala.inline
    def setShowHideDialog(value: js.Object => Unit): Self = this.set("showHideDialog", js.Any.fromFunction1(value))
    @scala.inline
    def setSummariesFor(value: js.Object => Unit): Self = this.set("summariesFor", js.Any.fromFunction1(value))
    @scala.inline
    def setSummaryCollection(value: () => Unit): Self = this.set("summaryCollection", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleCheckstate(value: js.Object => Unit): Self = this.set("toggleCheckstate", js.Any.fromFunction1(value))
    @scala.inline
    def setToggleDropDown(value: (String, js.Object) => Unit): Self = this.set("toggleDropDown", js.Any.fromFunction2(value))
    @scala.inline
    def setToggleSummariesRows(value: (Boolean, Boolean) => Unit): Self = this.set("toggleSummariesRows", js.Any.fromFunction2(value))
  }
  
}

