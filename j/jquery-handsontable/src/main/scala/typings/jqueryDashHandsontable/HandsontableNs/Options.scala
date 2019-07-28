package typings.jqueryDashHandsontable.HandsontableNs

import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Callback fired after reset cell's meta.
    */
  var afterCellMetaReset: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after one or more cells is changed. Its main use case is to save the input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *   - source is one of the strings: "alter", "empty", "edit", "populateFromArray", "loadData", "autofill", "paste".
    * Note: for performance reasons, the changes array is null for "loadData" source.
    */
  var afterChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.undefined
  /**
    * Callback is fired after changing column placement.
    */
  var afterColumnMove: js.UndefOr[js.Function2[/* oldIndex */ Double, /* newIndex */ Double, Unit]] = js.undefined
  /**
    * Callback is fired after changing column size.
    */
  var afterColumnResize: js.UndefOr[js.Function2[/* col */ Double, /* size */ Double, Unit]] = js.undefined
  /**
    * Callback fired after sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var afterColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.undefined
  /**
    * Callback fired if copyRowsLimit or copyColumnsLimit was reached.
    */
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRowsCount */ Double, 
      /* selectedColsCount */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColsLimit */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback is fired when a new column is created. Parameters:
    *   - index represents the index of first newly created column in the data source array.
    *   - amount number of newly created columns in the data source array.
    */
  var afterCreateCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Callback is fired when a new row is created. Parameters:
    *   - index represents the index of first newly created row in the data source array.
    *   - amount number of newly created rows in the data source array.
    */
  var afterCreateRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Event called when current cell is deselected.
    */
  var afterDeselect: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after destroing Handsontable instance.
    */
  var afterDestroy: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after getting cell settings.
    */
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.undefined
  /**
    * Callback fired after getting info about column header.
    */
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
  /**
    * Callback fired after calculating column width.
    */
  var afterGetColWidth: js.UndefOr[js.Function2[/* col */ Double, /* response */ js.Object, Unit]] = js.undefined
  /**
    * Callback fired after Handsontable instance is initiated.
    */
  var afterInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after new data is loaded (by loadData method) into the data source array.
    */
  var afterLoadData: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired after.
    */
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  /**
    * Callback fired after clicking on a cell or row/column header.
    * In case the row/column header was clicked, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseDown called with coords {row: 0, col: -1}.
    */
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ CellPosition, 
      /* TD */ HTMLTableDataCellElement, 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback fired after hovering a cell or row/column header with the mouse cursor.
    * In case the row/column header was hovered, the index is negative. For example clicking on the row header of cell (0, 0) results with afterOnCellMouseOver called with coords {row: 0, col: -1}.
    */
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[
      /* event */ MouseEvent, 
      /* coords */ CellPosition, 
      /* TD */ HTMLTableDataCellElement, 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback is fired when one or more columns are removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of removed columns.
    */
  var afterRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Callback is fired when one or more rows are removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of removed rows.
    */
  var afterRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Callback fired after Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableDataCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String, 
      /* value */ String, 
      /* cellProperties */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var afterScrollHorizontally: js.UndefOr[js.Function] = js.undefined
  var afterScrollVertically: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired while one or more cells are being selected (on mouse move). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.undefined
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.undefined
  /**
    * Callback fired while one or more cells are being selected (on mouse up). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.undefined
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.undefined
  var afterSetCellMeta: js.UndefOr[js.Function] = js.undefined
  var afterUpdateSettings: js.UndefOr[js.Function] = js.undefined
  /**
    * A plugin hook executed after validator function, only if validator function is defined. Validation result is the first parameter. This can be used to determinate if validation passed successfully or not. You can cancel current change by returning false.
    */
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ Boolean, 
      /* value */ js.Any, 
      /* row */ Double, 
      /* prop */ String, 
      /* source */ String, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Setting to true enables the autoColumnSize plugin, which makes sure each column gets enough space to show its content.
    */
  var autoColumnSize: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
    * Autocomplete definitions.
    * @see demo/autocomplete.html for examples and definitions.
    */
  var autoComplete: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * If true, pressing ENTER or down arrow in the last row will move to first row in next column.
    */
  var autoWrapCol: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, pressing TAB or right arrow in the last column will move to first column in next row.
    */
  var autoWrapRow: js.UndefOr[Boolean] = js.undefined
  /**
    * Parameters:
    *   - start is an object containing information about first filled cell: { row : 2, col : 0 }.
    *   - end is an object containing information about last filled cell: { row : 4, col : 1 }.
    *   - data is an 2D array containing information about fill pattern: [ ["1", "Ted"], ["1", "John"] ].
    */
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellPosition, 
      /* end */ CellPosition, 
      /* data */ js.Array[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback fired before one or more cells is changed. Its main purpose is to alter changes silently before input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *     - To disregard a single change, set changes[i] to null or remove it from array using changes.splice(i, 1).
    *     - To alter a single change, overwrite the desired value to changes[i][3].
    *     - To cancel all edit, return false from the callback or set array length to 0 (changes.length = 0).
    *   - source is the name of a source of changes.
    */
  var beforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[js.Array[_]], /* source */ String, Unit]] = js.undefined
  var beforeChangeRender: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired before sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var beforeColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.undefined
  /**
    * Callback fired before getting cell settings.
    */
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.undefined
  /**
    * Callback fired before Handsontable instance is initiated.
    * Note: this can be set only by global PluginHooks instance.
    */
  var beforeInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired before Walkontable instance is initiated.
    */
  var beforeInitWalkontable: js.UndefOr[js.Function] = js.undefined
  /**
    * Callback fired before keydown event is handled. It can be used to overwrite default key bindings. Caution - in your beforeKeyDown handler you need to call event.stopImmediatePropagation() to prevent default key behavior.
    */
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  /**
    * Callback is fired when one or more columns are about to be removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of columns to be removed.
    */
  var beforeRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Callback is fired when one or more rows are about to be removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of rows to be removed.
    */
  var beforeRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.undefined
  /**
    * Callback fired before Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var beforeRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
  /**
    * Callback fired before setting single value from the data source array.
    */
  var beforeSet: js.UndefOr[js.Function1[/* v */ js.Object, Unit]] = js.undefined
  /**
    * Callback fired before setting range is ended. Parameters:
    *   - coords is WalkontableCellCoords array
    */
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ js.Array[_], Unit]] = js.undefined
  /**
    * A plugin hook executed before validator function, only if validator function is defined. This can be used to manipulate value of changed cell before it is applied to the validator function. NOTICE: this will not affect values of changes. This will change value ONLY for validation!
    */
  var beforeValidate: js.UndefOr[
    js.Function4[/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String, Unit]
  ] = js.undefined
  /**
    * Defines the cell properties for given row, col, prop coordinates.
    * See Cells section below for more detailed explanation.
    */
  var cells: js.UndefOr[js.Function3[/* row */ Double, /* col */ Double, /* prop */ String, Unit]] = js.undefined
  /**
    * Setting true or false will enable or disable the default column headers (A, B, C). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the column is passed as a parameter.
    */
  var colHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines column widths in pixels. Accepts number, string (that will be converted to number), array of numbers (if you want to define column width separately for each column) or a function (if you want to set column width dynamically on each render).
    */
  var colWidths: js.UndefOr[js.Any] = js.undefined
  /**
    * Turn on Column sorting.
    */
  var columnSorting: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the cell properties and data binding for certain columns. Notice: Using this option sets a fixed number of columns (options startCols, minCols, maxCols will be ignored).
    * @see https://github.com/handsontable/jquery-handsontable/wiki/Options below for more detailed explanation.
    * @see http://handsontable.com/demo/datasources.html for examples
    */
  var columns: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Defines if the right-click context menu should be enabled. Context menu allows to create new row or column at any place in the grid.
    * Possible values: true (to enable basic options), false (to disable completely) or array of any available strings: ["row_above", "row_below", "col_left", "col_right", "remove_row", "remove_col", "undo", "redo", "sep1", "sep2", "sep3"].
    * @see http://handsontable.com/demo/contextmenu.html for examples.
    */
  var contextMenu: js.UndefOr[js.Any] = js.undefined
  /**
    * Maximum number of columns than can be copied to clipboard using CTRL+C.
    */
  var copyColsLimit: js.UndefOr[Double] = js.undefined
  /**
    * Setting to true enables the copyPaste plugin, which enables the copying and pasting to the clipboard.
    */
  var copyPaste: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of rows than can be copied to clipboard using CTRL+C.
    */
  var copyRowsLimit: js.UndefOr[Double] = js.undefined
  /**
    * Class name for all visible columns in current selection.
    */
  var currentColClassName: js.UndefOr[String] = js.undefined
  /**
    * Class name for all visible rows in current selection.
    */
  var currentRowClassName: js.UndefOr[String] = js.undefined
  /**
    * Initial data source that will be bound to the data grid by reference (editing data grid alters the data source. See Understanding binding as reference.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines the structure of a new row when data source is an object.
    * @see http://handsontable.com/demo/datasources.html for examples.
    */
  var dataSchema: js.UndefOr[js.Any] = js.undefined
  /**
    * Setting to true enables the debug mode, currently used to test the correctness of the row and column header fixed positioning on a layer above the master table.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, ENTER begins editing mode (like Google Docs). If false, ENTER moves to next row (like Excel) and adds new row if necessary. TAB adds new column if necessary.
    */
  var enterBeginsEditing: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines cursor move after ENTER is pressed (SHIFT+ENTER uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a ENTER key has been pressed. This event object can be used to check whether user pressed ENTER or SHIFT + ENTER.
    */
  var enterMoves: js.UndefOr[js.Any] = js.undefined
  /**
    * Enables the fill handle (drag-down and copy-down) functionality, which shows the small rectangle in bottom right corner of the selected area, that let's you expand values to the adjacent cells.
    * Possible values: true (to enable in all directions), "vertical" or "horizontal" (to enable in one direction), false (to disable completely). Setting to true enables the fillHandle plugin, which,
    */
  var fillHandle: js.UndefOr[js.Any] = js.undefined
  /**
    * Allows to specify the number of columns fixed (aka freezed) on the left side of the table.
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
  /**
    * Allows to specify the number of rows fixed (aka freezed) on the top of the table.
    */
  var fixedRowsTop: js.UndefOr[Double] = js.undefined
  /**
    * Setting to true enables selecting just a fragment of the text within a single cell or between adjacent cells.
    */
  var fragmentSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the grid. Can be a number or a function that returns a number.
    */
  var height: js.UndefOr[js.Any] = js.undefined
  /**
    * CSS class name for cells that did not pass validation.
    */
  var invalidCellClassName: js.UndefOr[String] = js.undefined
  /**
    * Lets you overwrite the default isEmptyCol method.
    */
  var isEmptyCol: js.UndefOr[js.Function1[/* col */ Double, Boolean]] = js.undefined
  /**
    * Lets you overwrite the default isEmptyRow method.
    */
  var isEmptyRow: js.UndefOr[js.Function1[/* row */ Double, Boolean]] = js.undefined
  /**
    * Turn on Manual column move, if set to a boolean or define initial column order, if set to an array of column indexes.
    */
  var manualColumnMove: js.UndefOr[js.Any] = js.undefined
  /**
    * Turn on Manual column resize, if set to a boolean or define initial column resized widths, if set to an array of numbers.
    */
  var manualColumnResize: js.UndefOr[js.Any] = js.undefined
  /**
    * Turns on Manual row move, if set to a boolean or define initial row order, if set to an array of row indexes.
    */
  var manualRowMove: js.UndefOr[Boolean] = js.undefined
  /**
    * Setting to true enables the manualRowResize plugin, which allows to resize the row height with your mouse.
    */
  var manualRowResize: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of columns.
    */
  var maxCols: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of rows.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  /**
    * Setting to true or array enables the mergeCells plugin, which enables the merging of the cells. (see demo). You can provide the merged cells on the pageload if you feed the mergeCells option with an array.
    */
  var mergeCells: js.UndefOr[js.Any] = js.undefined
  /**
    * Minimum number of columns. At least that many of columns will be created during initialization.
    */
  var minCols: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of rows. At least that many of rows will be created during initialization.
    */
  var minRows: js.UndefOr[Double] = js.undefined
  /**
    * When set to 1 (or more), Handsontable will add a new column at the end of grid if there are no more empty columns.
    */
  var minSpareCols: js.UndefOr[Double] = js.undefined
  /**
    * When set to 1 (or more), Handsontable will add a new row at the end of grid if there are no more empty rows.
    */
  var minSpareRows: js.UndefOr[Double] = js.undefined
  /**
    * Callback fired after column modify.
    */
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  /**
    * Callback fired after modify column's width.
    */
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.undefined
  /**
    * Callback fired after row modify.
    */
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  /**
    * Callback fired after modify hight of row.
    */
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
  /**
    * If true, selection of multiple cells using keyboard or mouse is allowed.
    */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS class name cells configured with wordWrap: false.
    */
  var noWordWrapClassName: js.UndefOr[String] = js.undefined
  /**
    * Setting to true enables the observeChanges plugin, which automatically renders the table when a change in the data source is observed.
    */
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to true, the table is rerendered when it is detected that it was made visible in DOM.
    */
  var observeDOMVisibility: js.UndefOr[Boolean] = js.undefined
  /**
    * Deprecated! Now event is called beforeChange.
    */
  var onBeforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.undefined
  /**
    * Deprecated! Now event is called afterChange.
    */
  var onChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.undefined
  /**
    * Deprecated! Now event is called afterCopyLimit.
    */
  var onCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRowsCount */ Double, 
      /* selectedColsCount */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColsLimit */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * Deprecated! Now event is called afterSelection.
    */
  var onSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.undefined
  /**
    * Deprecated! Now event is called afterSelectionByProp.
    */
  var onSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.undefined
  /**
    * Deprecated! Now event is called afterSelectionEnd.
    */
  var onSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.undefined
  /**
    * Deprecated! Now event is called afterSelectionEndByProp.
    */
  var onSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.undefined
  /**
    * If true, mouse click outside the grid will deselect the current selection.
    */
  var outsideClickDeselects: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines paste (CTRL+V) behavior. Default value "overwrite" will paste clipboard value over current selection.
    * When set to "shift_down", clipboard data will be pasted in place of current selection, while all selected cells are moved down.
    * When set to "shift_right", clipboard data will be pasted in place of current selection, while all selected cells are moved right.
    */
  var pasteMode: js.UndefOr[String] = js.undefined
  /**
    * Turn on saving the state of column sorting, columns positions and columns sizes in local storage. For more information see How to save data localy.
    */
  var persistentState: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to an non-empty string, displayed as the cell content for empty cells.
    */
  var placeholder: js.UndefOr[js.Any] = js.undefined
  /**
    * CSS class name for cells that have a placeholder in use.
    */
  var placeholderCellClassName: js.UndefOr[String] = js.undefined
  /**
    * CSS class name for read-only cells.
    */
  var readOnlyCellClassName: js.UndefOr[String] = js.undefined
  /**
    * Setting true or false will enable or disable the default row headers (1, 2, 3). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the rowis passed as a parameter.
    */
  var rowHeaders: js.UndefOr[js.Any] = js.undefined
  /**
    * Setting to true enables the search plugin (see demo).
    */
  var search: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startCols: js.UndefOr[Double] = js.undefined
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startRows: js.UndefOr[Double] = js.undefined
  /**
    * Column stretching mode. Possible values: "none", "last", "all".
    */
  var stretchH: js.UndefOr[String] = js.undefined
  /**
    * Defines cursor move after TAB is pressed (SHIFT+TAB uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a TAB key has been pressed. This event object can be used to check whether user pressed TAB or SHIFT + TAB.
    */
  var tabMoves: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, undo/redo functionality is enabled.
    */
  var undo: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of the grid. Can be a number or a function that returns a number.
    */
  var width: js.UndefOr[js.Any] = js.undefined
  /**
    * Setting to true word wrapping of the cell text content that does not fit in the fixed column width.
    */
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterCellMetaReset: js.Function = null,
    afterChange: (/* changes */ js.Array[_], /* source */ String) => Unit = null,
    afterColumnMove: (/* oldIndex */ Double, /* newIndex */ Double) => Unit = null,
    afterColumnResize: (/* col */ Double, /* size */ Double) => Unit = null,
    afterColumnSort: (/* column */ Double, /* order */ Boolean) => Unit = null,
    afterCopyLimit: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit = null,
    afterCreateCol: (/* index */ Double, /* amount */ Double) => Unit = null,
    afterCreateRow: (/* index */ Double, /* amount */ Double) => Unit = null,
    afterDeselect: js.Function = null,
    afterDestroy: js.Function = null,
    afterGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit = null,
    afterGetColHeader: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit = null,
    afterGetColWidth: (/* col */ Double, /* response */ js.Object) => Unit = null,
    afterInit: js.Function = null,
    afterLoadData: js.Function = null,
    afterOnCellCornerMouseDown: /* event */ MouseEvent => Unit = null,
    afterOnCellMouseDown: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit = null,
    afterOnCellMouseOver: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit = null,
    afterRemoveCol: (/* index */ Double, /* amount */ Double) => Unit = null,
    afterRemoveRow: (/* index */ Double, /* amount */ Double) => Unit = null,
    afterRender: /* isForced */ Boolean => Unit = null,
    afterRenderer: (/* TD */ HTMLTableDataCellElement, /* row */ Double, /* col */ Double, /* prop */ String, /* value */ String, /* cellProperties */ js.Object) => Unit = null,
    afterScrollHorizontally: js.Function = null,
    afterScrollVertically: js.Function = null,
    afterSelection: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit = null,
    afterSelectionByProp: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit = null,
    afterSelectionEnd: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit = null,
    afterSelectionEndByProp: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit = null,
    afterSetCellMeta: js.Function = null,
    afterUpdateSettings: js.Function = null,
    afterValidate: (/* isValid */ Boolean, /* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Boolean = null,
    autoColumnSize: Boolean | js.Object = null,
    autoComplete: js.Array[_] = null,
    autoWrapCol: js.UndefOr[Boolean] = js.undefined,
    autoWrapRow: js.UndefOr[Boolean] = js.undefined,
    beforeAutofill: (/* start */ CellPosition, /* end */ CellPosition, /* data */ js.Array[js.Array[String]]) => Unit = null,
    beforeChange: (/* changes */ js.Array[js.Array[_]], /* source */ String) => Unit = null,
    beforeChangeRender: js.Function = null,
    beforeColumnSort: (/* column */ Double, /* order */ Boolean) => Unit = null,
    beforeGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit = null,
    beforeInit: js.Function = null,
    beforeInitWalkontable: js.Function = null,
    beforeKeyDown: /* event */ KeyboardEvent => Unit = null,
    beforeRemoveCol: (/* index */ Double, /* amount */ Double) => Unit = null,
    beforeRemoveRow: (/* index */ Double, /* amount */ Double) => Unit = null,
    beforeRender: /* isForced */ Boolean => Unit = null,
    beforeSet: /* v */ js.Object => Unit = null,
    beforeSetRangeEnd: /* coords */ js.Array[_] => Unit = null,
    beforeValidate: (/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Unit = null,
    cells: (/* row */ Double, /* col */ Double, /* prop */ String) => Unit = null,
    colHeaders: js.Any = null,
    colWidths: js.Any = null,
    columnSorting: js.UndefOr[Boolean] = js.undefined,
    columns: js.Array[_] = null,
    contextMenu: js.Any = null,
    copyColsLimit: Int | Double = null,
    copyPaste: js.UndefOr[Boolean] = js.undefined,
    copyRowsLimit: Int | Double = null,
    currentColClassName: String = null,
    currentRowClassName: String = null,
    data: js.Any = null,
    dataSchema: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    enterBeginsEditing: js.UndefOr[Boolean] = js.undefined,
    enterMoves: js.Any = null,
    fillHandle: js.Any = null,
    fixedColumnsLeft: Int | Double = null,
    fixedRowsTop: Int | Double = null,
    fragmentSelection: js.UndefOr[Boolean] = js.undefined,
    height: js.Any = null,
    invalidCellClassName: String = null,
    isEmptyCol: /* col */ Double => Boolean = null,
    isEmptyRow: /* row */ Double => Boolean = null,
    manualColumnMove: js.Any = null,
    manualColumnResize: js.Any = null,
    manualRowMove: js.UndefOr[Boolean] = js.undefined,
    manualRowResize: js.UndefOr[Boolean] = js.undefined,
    maxCols: Int | Double = null,
    maxRows: Int | Double = null,
    mergeCells: js.Any = null,
    minCols: Int | Double = null,
    minRows: Int | Double = null,
    minSpareCols: Int | Double = null,
    minSpareRows: Int | Double = null,
    modifyCol: /* col */ Double => Unit = null,
    modifyColWidth: (/* width */ Double, /* col */ Double) => Unit = null,
    modifyRow: /* row */ Double => Unit = null,
    modifyRowHeight: (/* height */ Double, /* row */ Double) => Unit = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    noWordWrapClassName: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    observeDOMVisibility: js.UndefOr[Boolean] = js.undefined,
    onBeforeChange: (/* changes */ js.Array[_], /* source */ String) => Unit = null,
    onChange: (/* changes */ js.Array[_], /* source */ String) => Unit = null,
    onCopyLimit: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit = null,
    onSelection: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit = null,
    onSelectionByProp: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit = null,
    onSelectionEnd: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit = null,
    onSelectionEndByProp: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit = null,
    outsideClickDeselects: js.UndefOr[Boolean] = js.undefined,
    pasteMode: String = null,
    persistentState: js.UndefOr[Boolean] = js.undefined,
    placeholder: js.Any = null,
    placeholderCellClassName: String = null,
    readOnlyCellClassName: String = null,
    rowHeaders: js.Any = null,
    search: js.UndefOr[Boolean] = js.undefined,
    startCols: Int | Double = null,
    startRows: Int | Double = null,
    stretchH: String = null,
    tabMoves: js.Any = null,
    undo: js.UndefOr[Boolean] = js.undefined,
    width: js.Any = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterCellMetaReset != null) __obj.updateDynamic("afterCellMetaReset")(afterCellMetaReset)
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction2(afterChange))
    if (afterColumnMove != null) __obj.updateDynamic("afterColumnMove")(js.Any.fromFunction2(afterColumnMove))
    if (afterColumnResize != null) __obj.updateDynamic("afterColumnResize")(js.Any.fromFunction2(afterColumnResize))
    if (afterColumnSort != null) __obj.updateDynamic("afterColumnSort")(js.Any.fromFunction2(afterColumnSort))
    if (afterCopyLimit != null) __obj.updateDynamic("afterCopyLimit")(js.Any.fromFunction4(afterCopyLimit))
    if (afterCreateCol != null) __obj.updateDynamic("afterCreateCol")(js.Any.fromFunction2(afterCreateCol))
    if (afterCreateRow != null) __obj.updateDynamic("afterCreateRow")(js.Any.fromFunction2(afterCreateRow))
    if (afterDeselect != null) __obj.updateDynamic("afterDeselect")(afterDeselect)
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(afterDestroy)
    if (afterGetCellMeta != null) __obj.updateDynamic("afterGetCellMeta")(js.Any.fromFunction3(afterGetCellMeta))
    if (afterGetColHeader != null) __obj.updateDynamic("afterGetColHeader")(js.Any.fromFunction2(afterGetColHeader))
    if (afterGetColWidth != null) __obj.updateDynamic("afterGetColWidth")(js.Any.fromFunction2(afterGetColWidth))
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(afterLoadData)
    if (afterOnCellCornerMouseDown != null) __obj.updateDynamic("afterOnCellCornerMouseDown")(js.Any.fromFunction1(afterOnCellCornerMouseDown))
    if (afterOnCellMouseDown != null) __obj.updateDynamic("afterOnCellMouseDown")(js.Any.fromFunction3(afterOnCellMouseDown))
    if (afterOnCellMouseOver != null) __obj.updateDynamic("afterOnCellMouseOver")(js.Any.fromFunction3(afterOnCellMouseOver))
    if (afterRemoveCol != null) __obj.updateDynamic("afterRemoveCol")(js.Any.fromFunction2(afterRemoveCol))
    if (afterRemoveRow != null) __obj.updateDynamic("afterRemoveRow")(js.Any.fromFunction2(afterRemoveRow))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction1(afterRender))
    if (afterRenderer != null) __obj.updateDynamic("afterRenderer")(js.Any.fromFunction6(afterRenderer))
    if (afterScrollHorizontally != null) __obj.updateDynamic("afterScrollHorizontally")(afterScrollHorizontally)
    if (afterScrollVertically != null) __obj.updateDynamic("afterScrollVertically")(afterScrollVertically)
    if (afterSelection != null) __obj.updateDynamic("afterSelection")(js.Any.fromFunction4(afterSelection))
    if (afterSelectionByProp != null) __obj.updateDynamic("afterSelectionByProp")(js.Any.fromFunction4(afterSelectionByProp))
    if (afterSelectionEnd != null) __obj.updateDynamic("afterSelectionEnd")(js.Any.fromFunction4(afterSelectionEnd))
    if (afterSelectionEndByProp != null) __obj.updateDynamic("afterSelectionEndByProp")(js.Any.fromFunction4(afterSelectionEndByProp))
    if (afterSetCellMeta != null) __obj.updateDynamic("afterSetCellMeta")(afterSetCellMeta)
    if (afterUpdateSettings != null) __obj.updateDynamic("afterUpdateSettings")(afterUpdateSettings)
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(js.Any.fromFunction5(afterValidate))
    if (autoColumnSize != null) __obj.updateDynamic("autoColumnSize")(autoColumnSize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoWrapCol)) __obj.updateDynamic("autoWrapCol")(autoWrapCol)
    if (!js.isUndefined(autoWrapRow)) __obj.updateDynamic("autoWrapRow")(autoWrapRow)
    if (beforeAutofill != null) __obj.updateDynamic("beforeAutofill")(js.Any.fromFunction3(beforeAutofill))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (beforeChangeRender != null) __obj.updateDynamic("beforeChangeRender")(beforeChangeRender)
    if (beforeColumnSort != null) __obj.updateDynamic("beforeColumnSort")(js.Any.fromFunction2(beforeColumnSort))
    if (beforeGetCellMeta != null) __obj.updateDynamic("beforeGetCellMeta")(js.Any.fromFunction3(beforeGetCellMeta))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (beforeInitWalkontable != null) __obj.updateDynamic("beforeInitWalkontable")(beforeInitWalkontable)
    if (beforeKeyDown != null) __obj.updateDynamic("beforeKeyDown")(js.Any.fromFunction1(beforeKeyDown))
    if (beforeRemoveCol != null) __obj.updateDynamic("beforeRemoveCol")(js.Any.fromFunction2(beforeRemoveCol))
    if (beforeRemoveRow != null) __obj.updateDynamic("beforeRemoveRow")(js.Any.fromFunction2(beforeRemoveRow))
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(js.Any.fromFunction1(beforeRender))
    if (beforeSet != null) __obj.updateDynamic("beforeSet")(js.Any.fromFunction1(beforeSet))
    if (beforeSetRangeEnd != null) __obj.updateDynamic("beforeSetRangeEnd")(js.Any.fromFunction1(beforeSetRangeEnd))
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(js.Any.fromFunction4(beforeValidate))
    if (cells != null) __obj.updateDynamic("cells")(js.Any.fromFunction3(cells))
    if (colHeaders != null) __obj.updateDynamic("colHeaders")(colHeaders)
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths)
    if (!js.isUndefined(columnSorting)) __obj.updateDynamic("columnSorting")(columnSorting)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (copyColsLimit != null) __obj.updateDynamic("copyColsLimit")(copyColsLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(copyPaste)) __obj.updateDynamic("copyPaste")(copyPaste)
    if (copyRowsLimit != null) __obj.updateDynamic("copyRowsLimit")(copyRowsLimit.asInstanceOf[js.Any])
    if (currentColClassName != null) __obj.updateDynamic("currentColClassName")(currentColClassName)
    if (currentRowClassName != null) __obj.updateDynamic("currentRowClassName")(currentRowClassName)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataSchema != null) __obj.updateDynamic("dataSchema")(dataSchema)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(enterBeginsEditing)) __obj.updateDynamic("enterBeginsEditing")(enterBeginsEditing)
    if (enterMoves != null) __obj.updateDynamic("enterMoves")(enterMoves)
    if (fillHandle != null) __obj.updateDynamic("fillHandle")(fillHandle)
    if (fixedColumnsLeft != null) __obj.updateDynamic("fixedColumnsLeft")(fixedColumnsLeft.asInstanceOf[js.Any])
    if (fixedRowsTop != null) __obj.updateDynamic("fixedRowsTop")(fixedRowsTop.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentSelection)) __obj.updateDynamic("fragmentSelection")(fragmentSelection)
    if (height != null) __obj.updateDynamic("height")(height)
    if (invalidCellClassName != null) __obj.updateDynamic("invalidCellClassName")(invalidCellClassName)
    if (isEmptyCol != null) __obj.updateDynamic("isEmptyCol")(js.Any.fromFunction1(isEmptyCol))
    if (isEmptyRow != null) __obj.updateDynamic("isEmptyRow")(js.Any.fromFunction1(isEmptyRow))
    if (manualColumnMove != null) __obj.updateDynamic("manualColumnMove")(manualColumnMove)
    if (manualColumnResize != null) __obj.updateDynamic("manualColumnResize")(manualColumnResize)
    if (!js.isUndefined(manualRowMove)) __obj.updateDynamic("manualRowMove")(manualRowMove)
    if (!js.isUndefined(manualRowResize)) __obj.updateDynamic("manualRowResize")(manualRowResize)
    if (maxCols != null) __obj.updateDynamic("maxCols")(maxCols.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells)
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (minSpareCols != null) __obj.updateDynamic("minSpareCols")(minSpareCols.asInstanceOf[js.Any])
    if (minSpareRows != null) __obj.updateDynamic("minSpareRows")(minSpareRows.asInstanceOf[js.Any])
    if (modifyCol != null) __obj.updateDynamic("modifyCol")(js.Any.fromFunction1(modifyCol))
    if (modifyColWidth != null) __obj.updateDynamic("modifyColWidth")(js.Any.fromFunction2(modifyColWidth))
    if (modifyRow != null) __obj.updateDynamic("modifyRow")(js.Any.fromFunction1(modifyRow))
    if (modifyRowHeight != null) __obj.updateDynamic("modifyRowHeight")(js.Any.fromFunction2(modifyRowHeight))
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (noWordWrapClassName != null) __obj.updateDynamic("noWordWrapClassName")(noWordWrapClassName)
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges)
    if (!js.isUndefined(observeDOMVisibility)) __obj.updateDynamic("observeDOMVisibility")(observeDOMVisibility)
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction2(onBeforeChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCopyLimit != null) __obj.updateDynamic("onCopyLimit")(js.Any.fromFunction4(onCopyLimit))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction4(onSelection))
    if (onSelectionByProp != null) __obj.updateDynamic("onSelectionByProp")(js.Any.fromFunction4(onSelectionByProp))
    if (onSelectionEnd != null) __obj.updateDynamic("onSelectionEnd")(js.Any.fromFunction4(onSelectionEnd))
    if (onSelectionEndByProp != null) __obj.updateDynamic("onSelectionEndByProp")(js.Any.fromFunction4(onSelectionEndByProp))
    if (!js.isUndefined(outsideClickDeselects)) __obj.updateDynamic("outsideClickDeselects")(outsideClickDeselects)
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode)
    if (!js.isUndefined(persistentState)) __obj.updateDynamic("persistentState")(persistentState)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderCellClassName != null) __obj.updateDynamic("placeholderCellClassName")(placeholderCellClassName)
    if (readOnlyCellClassName != null) __obj.updateDynamic("readOnlyCellClassName")(readOnlyCellClassName)
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (startCols != null) __obj.updateDynamic("startCols")(startCols.asInstanceOf[js.Any])
    if (startRows != null) __obj.updateDynamic("startRows")(startRows.asInstanceOf[js.Any])
    if (stretchH != null) __obj.updateDynamic("stretchH")(stretchH)
    if (tabMoves != null) __obj.updateDynamic("tabMoves")(tabMoves)
    if (!js.isUndefined(undo)) __obj.updateDynamic("undo")(undo)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[Options]
  }
}

