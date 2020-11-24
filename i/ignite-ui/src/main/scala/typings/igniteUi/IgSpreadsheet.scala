package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSpreadsheet
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Invoked when an action is executed on the Spreadsheet.
    */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.native
  
  /**
    * Invoked when an action is about to be executed by the Spreadsheet.
    */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.native
  
  /**
    * Returns or sets the A1 format address of the current active cell within the selected worksheet.
    *
    */
  var activeCell: js.UndefOr[String] = js.native
  
  /**
    * Invoked when the activeCell of the Spreadsheet has changed.
    */
  var activeCellChanged: js.UndefOr[ActiveCellChangedEvent] = js.native
  
  /**
    * Invoked when the activePane of the Spreadsheet has changed.
    */
  var activePaneChanged: js.UndefOr[ActivePaneChangedEvent] = js.native
  
  /**
    * Invoked when the activeTable of the Spreadsheet has changed.
    */
  var activeTableChanged: js.UndefOr[ActiveTableChangedEvent] = js.native
  
  /**
    * Returns or sets the Worksheet from the workbook whose content should be displayed within the control.
    *
    */
  var activeWorksheet: js.UndefOr[js.Any] = js.native
  
  /**
    * Invoked when the activeWorksheet of the Spreadsheet has changed.
    */
  var activeWorksheetChanged: js.UndefOr[ActiveWorksheetChangedEvent] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the spreadsheet allows adding worksheets.
    *
    */
  var allowAddWorksheet: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the spreadsheet allows deleting worksheets.
    *
    */
  var allowDeleteWorksheet: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating if the grid lines are displayed in the selected worksheets.
    *
    */
  var areGridlinesVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating if the row and column headers are displayed for the selected worksheets.
    *
    */
  var areHeadersVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets an object with brushes for areas of the spreadsheet. The property name should be an item in the [SpreadsheetResourceId enumeration](ig.spreadsheet.SpreadsheetResourceId) and the property value a string representing a brush. These brushes override any css styling for the associated object.
    *
    */
  var brushes: js.UndefOr[IgSpreadsheetBrushes] = js.native
  
  /**
    * Invoked when a contextmenu is being opened for the Spreadsheet.
    */
  var contextMenuOpening: js.UndefOr[ContextMenuOpeningEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet has started in-place editing of the activeCell.
    */
  var editModeEntered: js.UndefOr[EditModeEnteredEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet is about to start in-place editing of the activeCell.
    */
  var editModeEntering: js.UndefOr[EditModeEnteringEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet has ended the in-place editing of the activeCell.
    */
  var editModeExited: js.UndefOr[EditModeExitedEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet is about to end the in-place editing of the activeCell.
    */
  var editModeExiting: js.UndefOr[EditModeExitingEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet is exiting edit mode and the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
    * The EditModeValidationError is raised while exiting edit mode if the new value for the activeCell is not valid based on the criteria of that cell's ig.excel.DataValidationRule.
    * Since the rule needs to evaluate the value of the cell and potentially other cell's in the Worksheet, the value is first applied to the cell(s) and then is validated. By default if the event is not handled and the
    * showErrorMessageForInvalidValue is true, a message box will be displayed to the end user to determine what action to take. One can handle this event and specify the action that should
    * be taken using the action.Note: The validation rule will not be evaluated if edit mode is being cancelled such as when the user presses Escape to cancel edit.Note: The action will default to AcceptChange if the ShowErrorMessageForInvalidValue of the validationRule is false; otherwise it will default to ShowPrompt.Note: Like Microsoft Excel, only the validation rule of the active cell is considered even if the update is affecting other cells in the selection.
    */
  var editModeValidationError: js.UndefOr[EditModeValidationErrorEvent] = js.native
  
  /**
    * Invoked when the Spreadsheet is performing an operation on a protected Worksheet and there is a single range that may be unlocked to allow the operation to be performed.
    */
  var editRangePasswordNeeded: js.UndefOr[EditRangePasswordNeededEvent] = js.native
  
  /**
    * Returns or sets an enumeration indicating the direction of the cell adjacent to the activeCell that should be activated when the enter key is pressed.
    * This property is only used if the isEnterKeyNavigationEnabled is set to true. Also, the reverse direction is
    * navigated when Shift + Enter are pressed.
    * down  The cell below should be activated.
    * right  The cell to the right should be activated
    * up  The cell above should be activated.
    * left  The cell to the left should be activated
    *
    */
  var enterKeyNavigationDirection: js.UndefOr[String] = js.native
  
  /**
    * Returns or sets the number of decimal places by which a whole number typed in during edit mode should be adjusted when isFixedDecimalEnabled is true
    *
    */
  var fixedDecimalPlaceCount: js.UndefOr[Double] = js.native
  
  /**
    * The height of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Invoked when a hyperlink is being followed in the Spreadsheet.
    */
  var hyperlinkExecuting: js.UndefOr[HyperlinkExecutingEvent] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the adjacent cell indicated by the enterKeyNavigationDirection should be navigated to when the enter key is pressed.
    *
    */
  var isEnterKeyNavigationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether a fixed decimal place is automatically added when a whole number is entered while in edit mode.
    *
    */
  var isFixedDecimalEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating if the formula bar is displayed within the Spreadsheet.
    *
    */
  var isFormulaBarVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the control is in "End mode".
    * End mode is a mode that affects certain keyboard navigation such as navigating with the arrow keys. For example when in
    * end mode and one presses the right arrow, the activeCell will be changed to be the first cell to the right of the current ActiveCell
    * that has a value (even if the value is ""). If there were no cells to the right with a value then it would activate the right most cell in that row. End
    * mode will end automatically such as when one presses an arrow key.
    *
    */
  var isInEndMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether the scroll lock key is toggled.
    * This property is used when certain keys are pressed while the control has focus. For example
    * if an arrow key is pressed while the scroll lock is enabled the cell area will be scrolled rather than changing
    * the active cell. Note: This property is not maintained/changed by the control. It is just queried when
    * performing actions that consider whether the scroll lock is enabled.
    *
    */
  var isScrollLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Returns or sets a boolean indicating whether undo is enabled for the control.
    *
    */
  var isUndoEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns or sets the width of the name box within the formula bar.
    *
    */
  var nameBoxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Type="ig.excel.Worksheet[]" Returns or sets an array of the Worksheets whose tabs are selected.
    *
    */
  var selectedWorksheets: js.UndefOr[js.Any] = js.native
  
  /**
    * Invoked when the selection for a ig.spreadsheet.SpreadsheetPane of the Spreadsheet is changed.
    */
  var selectionChanged: js.UndefOr[IgSpreadsheetSelectionChangedEvent] = js.native
  
  /**
    * Returns or sets a value indicating how the selection is updated when interacting with the cells via the mouse or keyboard.
    * normal  The selection is replaced when dragging the mouse to select a cell or range of cells. Similarly when navigating via the keyboard a new selection is created. One may add a new range by holding the Ctrl key and using the mouse and one may alter the selection range containing the active cell by holding the Shift key down while clicking with the mouse or navigating with the keyboard such as with the arrow keys.
    * extendSelection  The selection range in the cellRanges representing the active cell is updated as one uses the mouse to select a cell or navigating via the keyboard.
    * addToSelection  New cell ranges are added to the cellRanges without needing to hold down the ctrl key when dragging via the mouse and a range is added with the first arrow key navigation after entering the mode. One can enter the mode by pressing Shift+F8.
    *
    */
  var selectionMode: js.UndefOr[String] = js.native
  
  /**
    * Invoked when the user will be prompted with a message regarding an operation that is being performed.
    */
  var userPromptDisplaying: js.UndefOr[UserPromptDisplayingEvent] = js.native
  
  /**
    * Returns or sets the position of the screen tip used to display the input message for the data validation rule associated with the active cell.
    *
    * The provided object should have numeric properties called x and y.
    */
  var validationInputMessagePosition: js.UndefOr[js.Any] = js.native
  
  /**
    * The width of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
    *
    *
    * Valid values:
    * "string" The widget width can be set in pixels (px) and percentage (%).
    * "number" The widget width can be set as a number
    */
  var width: js.UndefOr[String | Double] = js.native
  
  /**
    * Returns or sets the workbook whose information is displayed in the control.
    *
    */
  var workbook: js.UndefOr[js.Any] = js.native
  
  /**
    * Invoked when a change has been made to the workbook that might require a save.
    * Note: This event is invoked asynchronously with regards to the change(s) that
    * have occurred. Also some changes alone are not considered to dirty the Workbook even though it
    * does change state on the Workbook or one of its subobjects. An example of that would be a zoom
    * type operation (e.g. changing the magnificationInNormalView).
    */
  var workbookDirtied: js.UndefOr[WorkbookDirtiedEvent] = js.native
  
  /**
    * Returns or sets the magnification of the selected worksheets.
    *
    */
  var zoomLevel: js.UndefOr[Double] = js.native
}
object IgSpreadsheet {
  
  @scala.inline
  def apply(): IgSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSpreadsheet]
  }
  
  @scala.inline
  implicit class IgSpreadsheetOps[Self <: IgSpreadsheet] (val x: Self) extends AnyVal {
    
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
    def setActionExecuted(value: (/* event */ Event, /* ui */ ActionExecutedEventUIParam) => Unit): Self = this.set("actionExecuted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActionExecuted: Self = this.set("actionExecuted", js.undefined)
    
    @scala.inline
    def setActionExecuting(value: (/* event */ Event, /* ui */ ActionExecutingEventUIParam) => Unit): Self = this.set("actionExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActionExecuting: Self = this.set("actionExecuting", js.undefined)
    
    @scala.inline
    def setActiveCell(value: String): Self = this.set("activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCell: Self = this.set("activeCell", js.undefined)
    
    @scala.inline
    def setActiveCellChanged(value: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = this.set("activeCellChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActiveCellChanged: Self = this.set("activeCellChanged", js.undefined)
    
    @scala.inline
    def setActivePaneChanged(value: (/* event */ Event, /* ui */ ActivePaneChangedEventUIParam) => Unit): Self = this.set("activePaneChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivePaneChanged: Self = this.set("activePaneChanged", js.undefined)
    
    @scala.inline
    def setActiveTableChanged(value: (/* event */ Event, /* ui */ ActiveTableChangedEventUIParam) => Unit): Self = this.set("activeTableChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActiveTableChanged: Self = this.set("activeTableChanged", js.undefined)
    
    @scala.inline
    def setActiveWorksheet(value: js.Any): Self = this.set("activeWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveWorksheet: Self = this.set("activeWorksheet", js.undefined)
    
    @scala.inline
    def setActiveWorksheetChanged(value: (/* event */ Event, /* ui */ ActiveWorksheetChangedEventUIParam) => Unit): Self = this.set("activeWorksheetChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActiveWorksheetChanged: Self = this.set("activeWorksheetChanged", js.undefined)
    
    @scala.inline
    def setAllowAddWorksheet(value: Boolean): Self = this.set("allowAddWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAddWorksheet: Self = this.set("allowAddWorksheet", js.undefined)
    
    @scala.inline
    def setAllowDeleteWorksheet(value: Boolean): Self = this.set("allowDeleteWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDeleteWorksheet: Self = this.set("allowDeleteWorksheet", js.undefined)
    
    @scala.inline
    def setAreGridlinesVisible(value: Boolean): Self = this.set("areGridlinesVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreGridlinesVisible: Self = this.set("areGridlinesVisible", js.undefined)
    
    @scala.inline
    def setAreHeadersVisible(value: Boolean): Self = this.set("areHeadersVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreHeadersVisible: Self = this.set("areHeadersVisible", js.undefined)
    
    @scala.inline
    def setBrushes(value: IgSpreadsheetBrushes): Self = this.set("brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    
    @scala.inline
    def setContextMenuOpening(value: (/* event */ Event, /* ui */ ContextMenuOpeningEventUIParam) => Unit): Self = this.set("contextMenuOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteContextMenuOpening: Self = this.set("contextMenuOpening", js.undefined)
    
    @scala.inline
    def setEditModeEntered(value: (/* event */ Event, /* ui */ EditModeEnteredEventUIParam) => Unit): Self = this.set("editModeEntered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditModeEntered: Self = this.set("editModeEntered", js.undefined)
    
    @scala.inline
    def setEditModeEntering(value: (/* event */ Event, /* ui */ EditModeEnteringEventUIParam) => Unit): Self = this.set("editModeEntering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditModeEntering: Self = this.set("editModeEntering", js.undefined)
    
    @scala.inline
    def setEditModeExited(value: (/* event */ Event, /* ui */ EditModeExitedEventUIParam) => Unit): Self = this.set("editModeExited", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditModeExited: Self = this.set("editModeExited", js.undefined)
    
    @scala.inline
    def setEditModeExiting(value: (/* event */ Event, /* ui */ EditModeExitingEventUIParam) => Unit): Self = this.set("editModeExiting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditModeExiting: Self = this.set("editModeExiting", js.undefined)
    
    @scala.inline
    def setEditModeValidationError(value: (/* event */ Event, /* ui */ EditModeValidationErrorEventUIParam) => Unit): Self = this.set("editModeValidationError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditModeValidationError: Self = this.set("editModeValidationError", js.undefined)
    
    @scala.inline
    def setEditRangePasswordNeeded(value: (/* event */ Event, /* ui */ EditRangePasswordNeededEventUIParam) => Unit): Self = this.set("editRangePasswordNeeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditRangePasswordNeeded: Self = this.set("editRangePasswordNeeded", js.undefined)
    
    @scala.inline
    def setEnterKeyNavigationDirection(value: String): Self = this.set("enterKeyNavigationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterKeyNavigationDirection: Self = this.set("enterKeyNavigationDirection", js.undefined)
    
    @scala.inline
    def setFixedDecimalPlaceCount(value: Double): Self = this.set("fixedDecimalPlaceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedDecimalPlaceCount: Self = this.set("fixedDecimalPlaceCount", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHyperlinkExecuting(value: (/* event */ Event, /* ui */ HyperlinkExecutingEventUIParam) => Unit): Self = this.set("hyperlinkExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHyperlinkExecuting: Self = this.set("hyperlinkExecuting", js.undefined)
    
    @scala.inline
    def setIsEnterKeyNavigationEnabled(value: Boolean): Self = this.set("isEnterKeyNavigationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnterKeyNavigationEnabled: Self = this.set("isEnterKeyNavigationEnabled", js.undefined)
    
    @scala.inline
    def setIsFixedDecimalEnabled(value: Boolean): Self = this.set("isFixedDecimalEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFixedDecimalEnabled: Self = this.set("isFixedDecimalEnabled", js.undefined)
    
    @scala.inline
    def setIsFormulaBarVisible(value: Boolean): Self = this.set("isFormulaBarVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFormulaBarVisible: Self = this.set("isFormulaBarVisible", js.undefined)
    
    @scala.inline
    def setIsInEndMode(value: Boolean): Self = this.set("isInEndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInEndMode: Self = this.set("isInEndMode", js.undefined)
    
    @scala.inline
    def setIsScrollLocked(value: Boolean): Self = this.set("isScrollLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScrollLocked: Self = this.set("isScrollLocked", js.undefined)
    
    @scala.inline
    def setIsUndoEnabled(value: Boolean): Self = this.set("isUndoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUndoEnabled: Self = this.set("isUndoEnabled", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setNameBoxWidth(value: Double): Self = this.set("nameBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameBoxWidth: Self = this.set("nameBoxWidth", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setSelectedWorksheets(value: js.Any): Self = this.set("selectedWorksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedWorksheets: Self = this.set("selectedWorksheets", js.undefined)
    
    @scala.inline
    def setSelectionChanged(value: (/* event */ Event, /* ui */ IgSpreadsheetSelectionChangedEventUIParam) => Unit): Self = this.set("selectionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectionChanged: Self = this.set("selectionChanged", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setUserPromptDisplaying(value: (/* event */ Event, /* ui */ UserPromptDisplayingEventUIParam) => Unit): Self = this.set("userPromptDisplaying", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUserPromptDisplaying: Self = this.set("userPromptDisplaying", js.undefined)
    
    @scala.inline
    def setValidationInputMessagePosition(value: js.Any): Self = this.set("validationInputMessagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationInputMessagePosition: Self = this.set("validationInputMessagePosition", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWorkbook(value: js.Any): Self = this.set("workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkbook: Self = this.set("workbook", js.undefined)
    
    @scala.inline
    def setWorkbookDirtied(value: (/* event */ Event, /* ui */ WorkbookDirtiedEventUIParam) => Unit): Self = this.set("workbookDirtied", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWorkbookDirtied: Self = this.set("workbookDirtied", js.undefined)
    
    @scala.inline
    def setZoomLevel(value: Double): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
}
