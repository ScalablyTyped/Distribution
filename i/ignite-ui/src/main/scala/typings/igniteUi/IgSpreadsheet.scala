package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSpreadsheet
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
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
  var activeCell: js.UndefOr[String] = js.undefined
  
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
  var allowAddWorksheet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether the spreadsheet allows deleting worksheets.
    *
    */
  var allowDeleteWorksheet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating if the grid lines are displayed in the selected worksheets.
    *
    */
  var areGridlinesVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating if the row and column headers are displayed for the selected worksheets.
    *
    */
  var areHeadersVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets an object with brushes for areas of the spreadsheet. The property name should be an item in the [SpreadsheetResourceId enumeration](ig.spreadsheet.SpreadsheetResourceId) and the property value a string representing a brush. These brushes override any css styling for the associated object.
    *
    */
  var brushes: js.UndefOr[IgSpreadsheetBrushes] = js.undefined
  
  /**
    * Invoked when a contextmenu is being opened for the Spreadsheet.
    */
  var contextMenuOpening: js.UndefOr[ContextMenuOpeningEvent] = js.undefined
  
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
    * Returns or sets an enumeration indicating the direction of the cell adjacent to the activeCell that should be activated when the enter key is pressed.
    * This property is only used if the isEnterKeyNavigationEnabled is set to true. Also, the reverse direction is
    * navigated when Shift + Enter are pressed.
    * down  The cell below should be activated.
    * right  The cell to the right should be activated
    * up  The cell above should be activated.
    * left  The cell to the left should be activated
    *
    */
  var enterKeyNavigationDirection: js.UndefOr[String] = js.undefined
  
  /**
    * Returns or sets the number of decimal places by which a whole number typed in during edit mode should be adjusted when isFixedDecimalEnabled is true
    *
    */
  var fixedDecimalPlaceCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the spreadsheet. It can be set as a number in pixels, string (px) or percentage (%).
    *
    *
    * Valid values:
    * "string" The widget height can be set in pixels (px) and percentage (%).
    * "number" The widget height can be set as a number
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Invoked when a hyperlink is being followed in the Spreadsheet.
    */
  var hyperlinkExecuting: js.UndefOr[HyperlinkExecutingEvent] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether the adjacent cell indicated by the enterKeyNavigationDirection should be navigated to when the enter key is pressed.
    *
    */
  var isEnterKeyNavigationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether a fixed decimal place is automatically added when a whole number is entered while in edit mode.
    *
    */
  var isFixedDecimalEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating if the formula bar is displayed within the Spreadsheet.
    *
    */
  var isFormulaBarVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether the control is in "End mode".
    * End mode is a mode that affects certain keyboard navigation such as navigating with the arrow keys. For example when in
    * end mode and one presses the right arrow, the activeCell will be changed to be the first cell to the right of the current ActiveCell
    * that has a value (even if the value is ""). If there were no cells to the right with a value then it would activate the right most cell in that row. End
    * mode will end automatically such as when one presses an arrow key.
    *
    */
  var isInEndMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether the scroll lock key is toggled.
    * This property is used when certain keys are pressed while the control has focus. For example
    * if an arrow key is pressed while the scroll lock is enabled the cell area will be scrolled rather than changing
    * the active cell. Note: This property is not maintained/changed by the control. It is just queried when
    * performing actions that consider whether the scroll lock is enabled.
    *
    */
  var isScrollLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns or sets a boolean indicating whether undo is enabled for the control.
    *
    */
  var isUndoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Returns or sets the width of the name box within the formula bar.
    *
    */
  var nameBoxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
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
    * normal  The selection is replaced when dragging the mouse to select a cell or range of cells. Similarly when navigating via the keyboard a new selection is created. One may add a new range by holding the Ctrl key and using the mouse and one may alter the selection range containing the active cell by holding the Shift key down while clicking with the mouse or navigating with the keyboard such as with the arrow keys.
    * extendSelection  The selection range in the cellRanges representing the active cell is updated as one uses the mouse to select a cell or navigating via the keyboard.
    * addToSelection  New cell ranges are added to the cellRanges without needing to hold down the ctrl key when dragging via the mouse and a range is added with the first arrow key navigation after entering the mode. One can enter the mode by pressing Shift+F8.
    *
    */
  var selectionMode: js.UndefOr[String] = js.undefined
  
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
  var width: js.UndefOr[String | Double] = js.undefined
  
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
  var zoomLevel: js.UndefOr[Double] = js.undefined
}
object IgSpreadsheet {
  
  @scala.inline
  def apply(): IgSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSpreadsheet]
  }
  
  @scala.inline
  implicit class IgSpreadsheetMutableBuilder[Self <: IgSpreadsheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecuted(value: (/* event */ Event, /* ui */ ActionExecutedEventUIParam) => Unit): Self = StObject.set(x, "actionExecuted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActionExecutedUndefined: Self = StObject.set(x, "actionExecuted", js.undefined)
    
    @scala.inline
    def setActionExecuting(value: (/* event */ Event, /* ui */ ActionExecutingEventUIParam) => Unit): Self = StObject.set(x, "actionExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActionExecutingUndefined: Self = StObject.set(x, "actionExecuting", js.undefined)
    
    @scala.inline
    def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveCellChanged(value: (/* event */ Event, /* ui */ ActiveCellChangedEventUIParam) => Unit): Self = StObject.set(x, "activeCellChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActiveCellChangedUndefined: Self = StObject.set(x, "activeCellChanged", js.undefined)
    
    @scala.inline
    def setActiveCellUndefined: Self = StObject.set(x, "activeCell", js.undefined)
    
    @scala.inline
    def setActivePaneChanged(value: (/* event */ Event, /* ui */ ActivePaneChangedEventUIParam) => Unit): Self = StObject.set(x, "activePaneChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivePaneChangedUndefined: Self = StObject.set(x, "activePaneChanged", js.undefined)
    
    @scala.inline
    def setActiveTableChanged(value: (/* event */ Event, /* ui */ ActiveTableChangedEventUIParam) => Unit): Self = StObject.set(x, "activeTableChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActiveTableChangedUndefined: Self = StObject.set(x, "activeTableChanged", js.undefined)
    
    @scala.inline
    def setActiveWorksheet(value: js.Any): Self = StObject.set(x, "activeWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveWorksheetChanged(value: (/* event */ Event, /* ui */ ActiveWorksheetChangedEventUIParam) => Unit): Self = StObject.set(x, "activeWorksheetChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActiveWorksheetChangedUndefined: Self = StObject.set(x, "activeWorksheetChanged", js.undefined)
    
    @scala.inline
    def setActiveWorksheetUndefined: Self = StObject.set(x, "activeWorksheet", js.undefined)
    
    @scala.inline
    def setAllowAddWorksheet(value: Boolean): Self = StObject.set(x, "allowAddWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAddWorksheetUndefined: Self = StObject.set(x, "allowAddWorksheet", js.undefined)
    
    @scala.inline
    def setAllowDeleteWorksheet(value: Boolean): Self = StObject.set(x, "allowDeleteWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeleteWorksheetUndefined: Self = StObject.set(x, "allowDeleteWorksheet", js.undefined)
    
    @scala.inline
    def setAreGridlinesVisible(value: Boolean): Self = StObject.set(x, "areGridlinesVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreGridlinesVisibleUndefined: Self = StObject.set(x, "areGridlinesVisible", js.undefined)
    
    @scala.inline
    def setAreHeadersVisible(value: Boolean): Self = StObject.set(x, "areHeadersVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreHeadersVisibleUndefined: Self = StObject.set(x, "areHeadersVisible", js.undefined)
    
    @scala.inline
    def setBrushes(value: IgSpreadsheetBrushes): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    @scala.inline
    def setContextMenuOpening(value: (/* event */ Event, /* ui */ ContextMenuOpeningEventUIParam) => Unit): Self = StObject.set(x, "contextMenuOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContextMenuOpeningUndefined: Self = StObject.set(x, "contextMenuOpening", js.undefined)
    
    @scala.inline
    def setEditModeEntered(value: (/* event */ Event, /* ui */ EditModeEnteredEventUIParam) => Unit): Self = StObject.set(x, "editModeEntered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditModeEnteredUndefined: Self = StObject.set(x, "editModeEntered", js.undefined)
    
    @scala.inline
    def setEditModeEntering(value: (/* event */ Event, /* ui */ EditModeEnteringEventUIParam) => Unit): Self = StObject.set(x, "editModeEntering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditModeEnteringUndefined: Self = StObject.set(x, "editModeEntering", js.undefined)
    
    @scala.inline
    def setEditModeExited(value: (/* event */ Event, /* ui */ EditModeExitedEventUIParam) => Unit): Self = StObject.set(x, "editModeExited", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditModeExitedUndefined: Self = StObject.set(x, "editModeExited", js.undefined)
    
    @scala.inline
    def setEditModeExiting(value: (/* event */ Event, /* ui */ EditModeExitingEventUIParam) => Unit): Self = StObject.set(x, "editModeExiting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditModeExitingUndefined: Self = StObject.set(x, "editModeExiting", js.undefined)
    
    @scala.inline
    def setEditModeValidationError(value: (/* event */ Event, /* ui */ EditModeValidationErrorEventUIParam) => Unit): Self = StObject.set(x, "editModeValidationError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditModeValidationErrorUndefined: Self = StObject.set(x, "editModeValidationError", js.undefined)
    
    @scala.inline
    def setEditRangePasswordNeeded(value: (/* event */ Event, /* ui */ EditRangePasswordNeededEventUIParam) => Unit): Self = StObject.set(x, "editRangePasswordNeeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditRangePasswordNeededUndefined: Self = StObject.set(x, "editRangePasswordNeeded", js.undefined)
    
    @scala.inline
    def setEnterKeyNavigationDirection(value: String): Self = StObject.set(x, "enterKeyNavigationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyNavigationDirectionUndefined: Self = StObject.set(x, "enterKeyNavigationDirection", js.undefined)
    
    @scala.inline
    def setFixedDecimalPlaceCount(value: Double): Self = StObject.set(x, "fixedDecimalPlaceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedDecimalPlaceCountUndefined: Self = StObject.set(x, "fixedDecimalPlaceCount", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHyperlinkExecuting(value: (/* event */ Event, /* ui */ HyperlinkExecutingEventUIParam) => Unit): Self = StObject.set(x, "hyperlinkExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHyperlinkExecutingUndefined: Self = StObject.set(x, "hyperlinkExecuting", js.undefined)
    
    @scala.inline
    def setIsEnterKeyNavigationEnabled(value: Boolean): Self = StObject.set(x, "isEnterKeyNavigationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnterKeyNavigationEnabledUndefined: Self = StObject.set(x, "isEnterKeyNavigationEnabled", js.undefined)
    
    @scala.inline
    def setIsFixedDecimalEnabled(value: Boolean): Self = StObject.set(x, "isFixedDecimalEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedDecimalEnabledUndefined: Self = StObject.set(x, "isFixedDecimalEnabled", js.undefined)
    
    @scala.inline
    def setIsFormulaBarVisible(value: Boolean): Self = StObject.set(x, "isFormulaBarVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFormulaBarVisibleUndefined: Self = StObject.set(x, "isFormulaBarVisible", js.undefined)
    
    @scala.inline
    def setIsInEndMode(value: Boolean): Self = StObject.set(x, "isInEndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInEndModeUndefined: Self = StObject.set(x, "isInEndMode", js.undefined)
    
    @scala.inline
    def setIsScrollLocked(value: Boolean): Self = StObject.set(x, "isScrollLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollLockedUndefined: Self = StObject.set(x, "isScrollLocked", js.undefined)
    
    @scala.inline
    def setIsUndoEnabled(value: Boolean): Self = StObject.set(x, "isUndoEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndoEnabledUndefined: Self = StObject.set(x, "isUndoEnabled", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNameBoxWidth(value: Double): Self = StObject.set(x, "nameBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameBoxWidthUndefined: Self = StObject.set(x, "nameBoxWidth", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setSelectedWorksheets(value: js.Any): Self = StObject.set(x, "selectedWorksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedWorksheetsUndefined: Self = StObject.set(x, "selectedWorksheets", js.undefined)
    
    @scala.inline
    def setSelectionChanged(value: (/* event */ Event, /* ui */ IgSpreadsheetSelectionChangedEventUIParam) => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setUserPromptDisplaying(value: (/* event */ Event, /* ui */ UserPromptDisplayingEventUIParam) => Unit): Self = StObject.set(x, "userPromptDisplaying", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUserPromptDisplayingUndefined: Self = StObject.set(x, "userPromptDisplaying", js.undefined)
    
    @scala.inline
    def setValidationInputMessagePosition(value: js.Any): Self = StObject.set(x, "validationInputMessagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationInputMessagePositionUndefined: Self = StObject.set(x, "validationInputMessagePosition", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWorkbook(value: js.Any): Self = StObject.set(x, "workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbookDirtied(value: (/* event */ Event, /* ui */ WorkbookDirtiedEventUIParam) => Unit): Self = StObject.set(x, "workbookDirtied", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWorkbookDirtiedUndefined: Self = StObject.set(x, "workbookDirtied", js.undefined)
    
    @scala.inline
    def setWorkbookUndefined: Self = StObject.set(x, "workbook", js.undefined)
    
    @scala.inline
    def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
