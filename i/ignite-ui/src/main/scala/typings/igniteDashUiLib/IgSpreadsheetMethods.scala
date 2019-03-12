package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSpreadsheetMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Executes the action associated with the specified id.
  	 *
  	 * @param action An [enumeration](ig.spreadsheet.SpreadsheetAction) or string that identifies the action to execute.
  	 */
  def executeAction(action: js.Object): scala.Boolean
  /**
  	 * Exports visual data from the spreadsheet to aid in unit testing
  	 */
  def exportVisualData(): scala.Unit
  /**
  	 * Forces any pending deferred work to render on the spreadsheet before continuing
  	 */
  def flush(): scala.Unit
  /**
  	 * Returns an object that represents the pane with the focus.
  	 */
  def getActivePane(): js.Object
  /**
  	 * Returns an object that represents the current selection of the active pane.
  	 */
  def getActiveSelection(): js.Object
  /**
  	 * Returns an object used to get the formatting of the activeCell and where modifications are applied to the entire active selection.
  	 *         Any changes made to this object will affect all the objects in the selection. So for example, the
  	 *         Font.Name may return "Arial" because the active cell has that as its resolved font name even though the other
  	 *         cells are using a different font but if you set the Font.Name of this object to "Arial" then all the objects
  	 *         affected by the selection will have their Font.Name updated to that value.
  	 */
  def getActiveSelectionCellRangeFormat(): js.Object
  /**
  	 * Returns an object that represents the pane with the focus.
  	 */
  def getActiveTable(): js.Object
  /**
  	 * Returns an enumeration used to indicate the current edit mode state.
  	 */
  def getCellEditMode(): js.Object
  /**
  	 * Returns a boolean indicating if the control is currently editing the value of the activeCell.
  	 */
  def getIsInEditMode(): scala.Boolean
  /**
  	 * Returns a boolean indicating if the user is currently editing the name of the active worksheet.
  	 */
  def getIsRenamingWorksheet(): scala.Boolean
  /**
  	 * Returns an array of the panes for the activeWorksheet.
  	 *
  	 *     returnType="ig.spreadsheet.SpreadsheetPane[]"
  	 */
  def getPanes(): scala.Unit
  /**
  	 * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
  	 * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
  	 */
  def showFilterDialogForTable(worksheetTableColumn: js.Object, spreadsheetFilterDialogOption: js.Object): scala.Unit
  /**
  	 * Shows the filter dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
  	 * @param spreadsheetFilterDialogOption Optional enumeration that specifies the initial display of the filter dialog.
  	 */
  def showFilterDialogForWorksheet(relativeColumnIndex: scala.Double, spreadsheetFilterDialogOption: js.Object): scala.Unit
  /**
  	 * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.Worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param worksheetTableColumn A [region](ig.excel.WorksheetTableColumn) whose filter is to be viewed or changed.
  	 */
  def showTopOrBottomDialogForTable(worksheetTableColumn: js.Object): scala.Unit
  /**
  	 * Shows the top or bottom dialog for the specified relative column of the [filterSettings](ig.excel.worksheet#methods:filterSettings) of the [activeWorksheet](ui.igspreadsheet#options:activeWorksheet).
  	 *
  	 * @param relativeColumnIndex A zero based column index relative to the [region](ig.excel.worksheetFilterSettings#methods:region) of the active worksheet.
  	 */
  def showTopOrBottomDialogForWorksheet(relativeColumnIndex: scala.Double): scala.Unit
  /**
  	 * Notify the spreadsheet that style information used for rendering the spreadsheet may have been updated.
  	 */
  def styleUpdated(): scala.Unit
}

object IgSpreadsheetMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => scala.Unit,
    changeGlobalRegional: () => scala.Unit,
    changeLocale: js.Object => scala.Unit,
    destroy: () => scala.Unit,
    executeAction: js.Object => scala.Boolean,
    exportVisualData: () => scala.Unit,
    flush: () => scala.Unit,
    getActivePane: () => js.Object,
    getActiveSelection: () => js.Object,
    getActiveSelectionCellRangeFormat: () => js.Object,
    getActiveTable: () => js.Object,
    getCellEditMode: () => js.Object,
    getIsInEditMode: () => scala.Boolean,
    getIsRenamingWorksheet: () => scala.Boolean,
    getPanes: () => scala.Unit,
    showFilterDialogForTable: (js.Object, js.Object) => scala.Unit,
    showFilterDialogForWorksheet: (scala.Double, js.Object) => scala.Unit,
    showTopOrBottomDialogForTable: js.Object => scala.Unit,
    showTopOrBottomDialogForWorksheet: scala.Double => scala.Unit,
    styleUpdated: () => scala.Unit
  ): IgSpreadsheetMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), executeAction = js.Any.fromFunction1(executeAction), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getActivePane = js.Any.fromFunction0(getActivePane), getActiveSelection = js.Any.fromFunction0(getActiveSelection), getActiveSelectionCellRangeFormat = js.Any.fromFunction0(getActiveSelectionCellRangeFormat), getActiveTable = js.Any.fromFunction0(getActiveTable), getCellEditMode = js.Any.fromFunction0(getCellEditMode), getIsInEditMode = js.Any.fromFunction0(getIsInEditMode), getIsRenamingWorksheet = js.Any.fromFunction0(getIsRenamingWorksheet), getPanes = js.Any.fromFunction0(getPanes), showFilterDialogForTable = js.Any.fromFunction2(showFilterDialogForTable), showFilterDialogForWorksheet = js.Any.fromFunction2(showFilterDialogForWorksheet), showTopOrBottomDialogForTable = js.Any.fromFunction1(showTopOrBottomDialogForTable), showTopOrBottomDialogForWorksheet = js.Any.fromFunction1(showTopOrBottomDialogForWorksheet), styleUpdated = js.Any.fromFunction0(styleUpdated))
  
    __obj.asInstanceOf[IgSpreadsheetMethods]
  }
}

