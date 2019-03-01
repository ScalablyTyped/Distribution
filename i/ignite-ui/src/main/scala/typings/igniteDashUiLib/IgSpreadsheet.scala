package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgSpreadsheet
  extends /**
	 * Option for igSpreadsheet
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Invoked when an action is executed on the Spreadsheet.
  	 */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.undefined
  /**
  	 * Invoked when an action is about to be executed by the Spreadsheet.
  	 */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.undefined
  /**
  	 * Returns or sets the A1 format address of the current active cell within the selected worksheet.
  	 *
  	 */
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Invoked when the activeCell of the Spreadsheet has changed.
  	 */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.undefined
  /**
  	 * Invoked when the activePane of the Spreadsheet has changed.
  	 */
  var activePaneChanged: js.UndefOr[ActivePaneChangedEvent] = js.undefined
  /**
  	 * Invoked when the activeTable of the Spreadsheet has changed.
  	 */
  var activeTableChanged: js.UndefOr[ActiveTableChangedEvent] = js.undefined
  /**
  	 * Returns or sets the Worksheet from the workbook whose content should be displayed within the control.
  	 *
  	 */
  var activeWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when the activeWorksheet of the Spreadsheet has changed.
  	 */
  var activeWorksheetChanged: js.UndefOr[ActiveWorksheetChangedEvent] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows adding worksheets.
  	 *
  	 */
  var allowAddWorksheet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the spreadsheet allows deleting worksheets.
  	 *
  	 */
  var allowDeleteWorksheet: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the grid lines are displayed in the selected worksheets.
  	 *
  	 */
  var areGridlinesVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the row and column headers are displayed for the selected worksheets.
  	 *
  	 */
  var areHeadersVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets an object with brushes for areas of the spreadsheet. The property name should be an item in the [SpreadsheetResourceId enumeration](ig.spreadsheet.SpreadsheetResourceId) and the property value a string representing a brush. These brushes override any css styling for the associated object.
  	 *
  	 */
  var brushes: js.UndefOr[IgSpreadsheetBrushes] = js.undefined
  /**
  	 * Invoked when the Spreadsheet has started in-place editing of the activeCell.
  	 */
  var editModeEntered: js.UndefOr[EditModeEnteredEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is about to start in-place editing of the activeCell.
  	 */
  var editModeEntering: js.UndefOr[EditModeEnteringEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet has ended the in-place editing of the activeCell.
  	 */
  var editModeExited: js.UndefOr[EditModeExitedEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is about to end the in-place editing of the activeCell.
  	 */
  var editModeExiting: js.UndefOr[EditModeExitingEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is exiting edit mode and the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * The EditModeValidationError is raised while exiting edit mode if the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
  	 * Since the rule needs to evaluate the value of the cell and potentially other cell's in the Worksheet, the value is first applied to the cell(s) and then is validated. By default if the event is not handled and the
  	 * showErrorMessageForInvalidValue is true, a message box will be displayed to the end user to determine what action to take. One can handle this event and specify the action that should
  	 * be taken using the action.Note: The validation rule will not be evaluated if edit mode is being cancelled such as when the user presses Escape to cancel edit.Note: The action will default to AcceptChange if the ShowErrorMessageForInvalidValue of the validationRule is false; otherwise it will default to ShowPrompt.Note: Like Microsoft Excel, only the validation rule of the active cell is considered even if the update is affecting other cells in the selection.
  	 */
  var editModeValidationError: js.UndefOr[EditModeValidationErrorEvent] = js.undefined
  /**
  	 * Invoked when the Spreadsheet is performing an operation on a protected Worksheet and there is a single range that may be unlocked to allow the operation to be performed.
  	 */
  var editRangePasswordNeeded: js.UndefOr[EditRangePasswordNeededEvent] = js.undefined
  /**
  	 * Returns or sets an enumeration indicating the direction of the cell adjacent to the activeCell that should be activated when the enter key is pressed.This property is only used if the isEnterKeyNavigationEnabled is set to true. Also, the reverse direction is
  	 * navigated when Shift + Enter are pressed.
  	 *
  	 *
  	 * Valid values:
  	 * "down" The cell below should be activated.
  	 * "right" The cell to the right should be activated
  	 * "up" The cell above should be activated.
  	 * "left" The cell to the left should be activated
  	 */
  var enterKeyNavigationDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Returns or sets the number of decimal places by which a whole number typed in during edit mode should be adjusted when isFixedDecimalEnabled is true
  	 *
  	 */
  var fixedDecimalPlaceCount: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The height of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set as a number
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Invoked when a hyperlink is being followed in the Spreadsheet.
  	 */
  var hyperlinkExecuting: js.UndefOr[HyperlinkExecutingEvent] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the adjacent cell indicated by the enterKeyNavigationDirection should be navigated to when the enter key is pressed.
  	 *
  	 */
  var isEnterKeyNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether a fixed decimal place is automatically added when a whole number is entered while in edit mode.
  	 *
  	 */
  var isFixedDecimalEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating if the formula bar is displayed within the Spreadsheet.
  	 *
  	 */
  var isFormulaBarVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the control is in "End mode".
  	 * End mode is a mode that affects certain keyboard navigation such as navigating with the arrow keys. For example when in
  	 * end mode and one presses the right arrow, the activeCell will be changed to be the first cell to the right of the current ActiveCell
  	 * that has a value (even if the value is ""). If there were no cells to the right with a value then it would activate the right most cell in that row. End
  	 * mode will end automatically such as when one presses an arrow key.
  	 *
  	 */
  var isInEndMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether the scroll lock key is toggled.
  	 * This property is used when certain keys are pressed while the control has focus. For example
  	 * if an arrow key is pressed while the scroll lock is enabled the cell area will be scrolled rather than changing
  	 * the active cell. Note: This property is not maintained/changed by the control. It is just queried when
  	 * performing actions that consider whether the scroll lock is enabled.
  	 *
  	 */
  var isScrollLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Returns or sets a boolean indicating whether undo is enabled for the control.
  	 *
  	 */
  var isUndoEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Returns or sets the width of the name box within the formula bar.
  	 *
  	 */
  var nameBoxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
  	 * Type="ig.excel.Worksheet[]" Returns or sets an array of the Worksheets whose tabs are selected.
  	 *
  	 */
  var selectedWorksheets: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when the selection for a ig.spreadsheet.SpreadsheetPane of the Spreadsheet is changed.
  	 */
  var selectionChanged: js.UndefOr[IgSpreadsheetSelectionChangedEvent] = js.undefined
  /**
  	 * Returns or sets a value indicating how the selection is updated when interacting with the cells via the mouse or keyboard.
  	 *
  	 *
  	 * Valid values:
  	 * "normal" The selection is replaced when dragging the mouse to select a cell or range of cells. Similarly when navigating via the keyboard a new selection is created. One may add a new range by holding the Ctrl key and using the mouse and one may alter the selection range containing the active cell by holding the Shift key down while clicking with the mouse or navigating with the keyboard such as with the arrow keys.
  	 * "extendSelection" The selection range in the cellRanges representing the active cell is updated as one uses the mouse to select a cell or navigating via the keyboard.
  	 * "addToSelection" New cell ranges are added to the cellRanges without needing to hold down the ctrl key when dragging via the mouse and a range is added with the first arrow key navigation after entering the mode. One can enter the mode by pressing Shift+F8.
  	 */
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Invoked when the user will be prompted with a message regarding an operation that is being performed.
  	 */
  var userPromptDisplaying: js.UndefOr[UserPromptDisplayingEvent] = js.undefined
  /**
  	 * Returns or sets the position of the screen tip used to display the input message for the data validation rule associated with the active cell.
  	 *
  	 * The provided object should have numeric properties called x and y.
  	 */
  var validationInputMessagePosition: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The width of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget width can be set in pixels (px) and percentage (%).
  	 * "number" The widget width can be set as a number
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Returns or sets the workbook whose information is displayed in the control.
  	 *
  	 */
  var workbook: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Invoked when a change has been made to the workbook that might require a save.
  	 * Note: This event is invoked asynchronously with regards to the change(s) that
  	 * have occurred. Also some changes alone are not considered to dirty the Workbook even though it
  	 * does change state on the Workbook or one of its subobjects. An example of that would be a zoom
  	 * type operation (e.g. changing the magnificationInNormalView).
  	 */
  var workbookDirtied: js.UndefOr[WorkbookDirtiedEvent] = js.undefined
  /**
  	 * Returns or sets the magnification of the selected worksheets.
  	 *
  	 */
  var zoomLevel: js.UndefOr[scala.Double] = js.undefined
}

object IgSpreadsheet {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igSpreadsheet
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actionExecuted: ActionExecutedEvent = null,
    actionExecuting: ActionExecutingEvent = null,
    activeCell: java.lang.String = null,
    activeCellChanged: ActiveCellChangedEvent = null,
    activePaneChanged: ActivePaneChangedEvent = null,
    activeTableChanged: ActiveTableChangedEvent = null,
    activeWorksheet: js.Any = null,
    activeWorksheetChanged: ActiveWorksheetChangedEvent = null,
    allowAddWorksheet: js.UndefOr[scala.Boolean] = js.undefined,
    allowDeleteWorksheet: js.UndefOr[scala.Boolean] = js.undefined,
    areGridlinesVisible: js.UndefOr[scala.Boolean] = js.undefined,
    areHeadersVisible: js.UndefOr[scala.Boolean] = js.undefined,
    brushes: IgSpreadsheetBrushes = null,
    editModeEntered: EditModeEnteredEvent = null,
    editModeEntering: EditModeEnteringEvent = null,
    editModeExited: EditModeExitedEvent = null,
    editModeExiting: EditModeExitingEvent = null,
    editModeValidationError: EditModeValidationErrorEvent = null,
    editRangePasswordNeeded: EditRangePasswordNeededEvent = null,
    enterKeyNavigationDirection: java.lang.String = null,
    fixedDecimalPlaceCount: scala.Int | scala.Double = null,
    height: java.lang.String | scala.Double = null,
    hyperlinkExecuting: HyperlinkExecutingEvent = null,
    isEnterKeyNavigationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isFixedDecimalEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    isFormulaBarVisible: js.UndefOr[scala.Boolean] = js.undefined,
    isInEndMode: js.UndefOr[scala.Boolean] = js.undefined,
    isScrollLocked: js.UndefOr[scala.Boolean] = js.undefined,
    isUndoEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    locale: js.Any = null,
    nameBoxWidth: scala.Int | scala.Double = null,
    regional: java.lang.String | js.Object = null,
    selectedWorksheets: js.Any = null,
    selectionChanged: IgSpreadsheetSelectionChangedEvent = null,
    selectionMode: java.lang.String = null,
    userPromptDisplaying: UserPromptDisplayingEvent = null,
    validationInputMessagePosition: js.Any = null,
    width: java.lang.String | scala.Double = null,
    workbook: js.Any = null,
    workbookDirtied: WorkbookDirtiedEvent = null,
    zoomLevel: scala.Int | scala.Double = null
  ): IgSpreadsheet = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionExecuted != null) __obj.updateDynamic("actionExecuted")(actionExecuted)
    if (actionExecuting != null) __obj.updateDynamic("actionExecuting")(actionExecuting)
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell)
    if (activeCellChanged != null) __obj.updateDynamic("activeCellChanged")(activeCellChanged)
    if (activePaneChanged != null) __obj.updateDynamic("activePaneChanged")(activePaneChanged)
    if (activeTableChanged != null) __obj.updateDynamic("activeTableChanged")(activeTableChanged)
    if (activeWorksheet != null) __obj.updateDynamic("activeWorksheet")(activeWorksheet)
    if (activeWorksheetChanged != null) __obj.updateDynamic("activeWorksheetChanged")(activeWorksheetChanged)
    if (!js.isUndefined(allowAddWorksheet)) __obj.updateDynamic("allowAddWorksheet")(allowAddWorksheet)
    if (!js.isUndefined(allowDeleteWorksheet)) __obj.updateDynamic("allowDeleteWorksheet")(allowDeleteWorksheet)
    if (!js.isUndefined(areGridlinesVisible)) __obj.updateDynamic("areGridlinesVisible")(areGridlinesVisible)
    if (!js.isUndefined(areHeadersVisible)) __obj.updateDynamic("areHeadersVisible")(areHeadersVisible)
    if (brushes != null) __obj.updateDynamic("brushes")(brushes)
    if (editModeEntered != null) __obj.updateDynamic("editModeEntered")(editModeEntered)
    if (editModeEntering != null) __obj.updateDynamic("editModeEntering")(editModeEntering)
    if (editModeExited != null) __obj.updateDynamic("editModeExited")(editModeExited)
    if (editModeExiting != null) __obj.updateDynamic("editModeExiting")(editModeExiting)
    if (editModeValidationError != null) __obj.updateDynamic("editModeValidationError")(editModeValidationError)
    if (editRangePasswordNeeded != null) __obj.updateDynamic("editRangePasswordNeeded")(editRangePasswordNeeded)
    if (enterKeyNavigationDirection != null) __obj.updateDynamic("enterKeyNavigationDirection")(enterKeyNavigationDirection)
    if (fixedDecimalPlaceCount != null) __obj.updateDynamic("fixedDecimalPlaceCount")(fixedDecimalPlaceCount.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hyperlinkExecuting != null) __obj.updateDynamic("hyperlinkExecuting")(hyperlinkExecuting)
    if (!js.isUndefined(isEnterKeyNavigationEnabled)) __obj.updateDynamic("isEnterKeyNavigationEnabled")(isEnterKeyNavigationEnabled)
    if (!js.isUndefined(isFixedDecimalEnabled)) __obj.updateDynamic("isFixedDecimalEnabled")(isFixedDecimalEnabled)
    if (!js.isUndefined(isFormulaBarVisible)) __obj.updateDynamic("isFormulaBarVisible")(isFormulaBarVisible)
    if (!js.isUndefined(isInEndMode)) __obj.updateDynamic("isInEndMode")(isInEndMode)
    if (!js.isUndefined(isScrollLocked)) __obj.updateDynamic("isScrollLocked")(isScrollLocked)
    if (!js.isUndefined(isUndoEnabled)) __obj.updateDynamic("isUndoEnabled")(isUndoEnabled)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (nameBoxWidth != null) __obj.updateDynamic("nameBoxWidth")(nameBoxWidth.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (selectedWorksheets != null) __obj.updateDynamic("selectedWorksheets")(selectedWorksheets)
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(selectionChanged)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (userPromptDisplaying != null) __obj.updateDynamic("userPromptDisplaying")(userPromptDisplaying)
    if (validationInputMessagePosition != null) __obj.updateDynamic("validationInputMessagePosition")(validationInputMessagePosition)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workbook != null) __obj.updateDynamic("workbook")(workbook)
    if (workbookDirtied != null) __obj.updateDynamic("workbookDirtied")(workbookDirtied)
    if (zoomLevel != null) __obj.updateDynamic("zoomLevel")(zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgSpreadsheet]
  }
}

