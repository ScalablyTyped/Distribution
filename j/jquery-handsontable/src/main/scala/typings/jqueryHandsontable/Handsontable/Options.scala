package typings.jqueryHandsontable.Handsontable

import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Callback fired after reset cell's meta.
    */
  var afterCellMetaReset: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after one or more cells is changed. Its main use case is to save the input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *   - source is one of the strings: "alter", "empty", "edit", "populateFromArray", "loadData", "autofill", "paste".
    * Note: for performance reasons, the changes array is null for "loadData" source.
    */
  var afterChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
  /**
    * Callback is fired after changing column placement.
    */
  var afterColumnMove: js.UndefOr[js.Function2[/* oldIndex */ Double, /* newIndex */ Double, Unit]] = js.native
  /**
    * Callback is fired after changing column size.
    */
  var afterColumnResize: js.UndefOr[js.Function2[/* col */ Double, /* size */ Double, Unit]] = js.native
  /**
    * Callback fired after sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var afterColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.native
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
  ] = js.native
  /**
    * Callback is fired when a new column is created. Parameters:
    *   - index represents the index of first newly created column in the data source array.
    *   - amount number of newly created columns in the data source array.
    */
  var afterCreateCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when a new row is created. Parameters:
    *   - index represents the index of first newly created row in the data source array.
    *   - amount number of newly created rows in the data source array.
    */
  var afterCreateRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Event called when current cell is deselected.
    */
  var afterDeselect: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after destroing Handsontable instance.
    */
  var afterDestroy: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after getting cell settings.
    */
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.native
  /**
    * Callback fired after getting info about column header.
    */
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  /**
    * Callback fired after calculating column width.
    */
  var afterGetColWidth: js.UndefOr[js.Function2[/* col */ Double, /* response */ js.Object, Unit]] = js.native
  /**
    * Callback fired after Handsontable instance is initiated.
    */
  var afterInit: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after new data is loaded (by loadData method) into the data source array.
    */
  var afterLoadData: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired after.
    */
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Callback is fired when one or more columns are removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of removed columns.
    */
  var afterRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when one or more rows are removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of removed rows.
    */
  var afterRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback fired after Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
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
  ] = js.native
  var afterScrollHorizontally: js.UndefOr[js.Function] = js.native
  var afterScrollVertically: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired while one or more cells are being selected (on mouse move). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.native
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.native
  /**
    * Callback fired while one or more cells are being selected (on mouse up). Parameters:
    *   - r selection start row
    *   - c selection start column
    *   - r2 selection end row
    *   - c2 selection end column
    */
  var afterSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double, Unit]
  ] = js.native
  /**
    * The same as above, but data source object property name is used instead of the column number.
    */
  var afterSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String, Unit]
  ] = js.native
  var afterSetCellMeta: js.UndefOr[js.Function] = js.native
  var afterUpdateSettings: js.UndefOr[js.Function] = js.native
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
  ] = js.native
  /**
    * Setting to true enables the autoColumnSize plugin, which makes sure each column gets enough space to show its content.
    */
  var autoColumnSize: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * Autocomplete definitions.
    * @see demo/autocomplete.html for examples and definitions.
    */
  var autoComplete: js.UndefOr[js.Array[_]] = js.native
  /**
    * If true, pressing ENTER or down arrow in the last row will move to first row in next column.
    */
  var autoWrapCol: js.UndefOr[Boolean] = js.native
  /**
    * If true, pressing TAB or right arrow in the last column will move to first column in next row.
    */
  var autoWrapRow: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  /**
    * Callback fired before one or more cells is changed. Its main purpose is to alter changes silently before input. Parameters:
    *   - changes is a 2D array containing information about each of the edited cells [ [row, prop, oldVal, newVal], ... ].
    *     - To disregard a single change, set changes[i] to null or remove it from array using changes.splice(i, 1).
    *     - To alter a single change, overwrite the desired value to changes[i][3].
    *     - To cancel all edit, return false from the callback or set array length to 0 (changes.length = 0).
    *   - source is the name of a source of changes.
    */
  var beforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[js.Array[_]], /* source */ String, Unit]] = js.native
  var beforeChangeRender: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before sorting the table. The column argument is a relative (displayed) index of a column that is about to be sorted. To get the absolute column index, just add the current column offset. You can get the offset by using colOffset() method.
    */
  var beforeColumnSort: js.UndefOr[js.Function2[/* column */ Double, /* order */ Boolean, Unit]] = js.native
  /**
    * Callback fired before getting cell settings.
    */
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ js.Object, Unit]
  ] = js.native
  /**
    * Callback fired before Handsontable instance is initiated.
    * Note: this can be set only by global PluginHooks instance.
    */
  var beforeInit: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before Walkontable instance is initiated.
    */
  var beforeInitWalkontable: js.UndefOr[js.Function] = js.native
  /**
    * Callback fired before keydown event is handled. It can be used to overwrite default key bindings. Caution - in your beforeKeyDown handler you need to call event.stopImmediatePropagation() to prevent default key behavior.
    */
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  /**
    * Callback is fired when one or more columns are about to be removed. Parameters:
    *   - index is an index of starter column.
    *   - amount is an anount of columns to be removed.
    */
  var beforeRemoveCol: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback is fired when one or more rows are about to be removed. Parameters:
    *   - index is an index of starter row.
    *   - amount is an anount of rows to be removed.
    */
  var beforeRemoveRow: js.UndefOr[js.Function2[/* index */ Double, /* amount */ Double, Unit]] = js.native
  /**
    * Callback fired before Handsontable table is rendered. Parameters:
    *   - isForced is true if rendering was triggered by a change of settings or data; or false if rendering was triggered by scrolling or moving selection.
    */
  var beforeRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
  /**
    * Callback fired before setting single value from the data source array.
    */
  var beforeSet: js.UndefOr[js.Function1[/* v */ js.Object, Unit]] = js.native
  /**
    * Callback fired before setting range is ended. Parameters:
    *   - coords is WalkontableCellCoords array
    */
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ js.Array[_], Unit]] = js.native
  /**
    * A plugin hook executed before validator function, only if validator function is defined. This can be used to manipulate value of changed cell before it is applied to the validator function. NOTICE: this will not affect values of changes. This will change value ONLY for validation!
    */
  var beforeValidate: js.UndefOr[
    js.Function4[/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String, Unit]
  ] = js.native
  /**
    * Defines the cell properties for given row, col, prop coordinates.
    * See Cells section below for more detailed explanation.
    */
  var cells: js.UndefOr[js.Function3[/* row */ Double, /* col */ Double, /* prop */ String, Unit]] = js.native
  /**
    * Setting true or false will enable or disable the default column headers (A, B, C). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the column is passed as a parameter.
    */
  var colHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Defines column widths in pixels. Accepts number, string (that will be converted to number), array of numbers (if you want to define column width separately for each column) or a function (if you want to set column width dynamically on each render).
    */
  var colWidths: js.UndefOr[js.Any] = js.native
  /**
    * Turn on Column sorting.
    */
  var columnSorting: js.UndefOr[Boolean] = js.native
  /**
    * Defines the cell properties and data binding for certain columns. Notice: Using this option sets a fixed number of columns (options startCols, minCols, maxCols will be ignored).
    * @see https://github.com/handsontable/jquery-handsontable/wiki/Options below for more detailed explanation.
    * @see http://handsontable.com/demo/datasources.html for examples
    */
  var columns: js.UndefOr[js.Array[_]] = js.native
  /**
    * Defines if the right-click context menu should be enabled. Context menu allows to create new row or column at any place in the grid.
    * Possible values: true (to enable basic options), false (to disable completely) or array of any available strings: ["row_above", "row_below", "col_left", "col_right", "remove_row", "remove_col", "undo", "redo", "sep1", "sep2", "sep3"].
    * @see http://handsontable.com/demo/contextmenu.html for examples.
    */
  var contextMenu: js.UndefOr[js.Any] = js.native
  /**
    * Maximum number of columns than can be copied to clipboard using CTRL+C.
    */
  var copyColsLimit: js.UndefOr[Double] = js.native
  /**
    * Setting to true enables the copyPaste plugin, which enables the copying and pasting to the clipboard.
    */
  var copyPaste: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of rows than can be copied to clipboard using CTRL+C.
    */
  var copyRowsLimit: js.UndefOr[Double] = js.native
  /**
    * Class name for all visible columns in current selection.
    */
  var currentColClassName: js.UndefOr[String] = js.native
  /**
    * Class name for all visible rows in current selection.
    */
  var currentRowClassName: js.UndefOr[String] = js.native
  /**
    * Initial data source that will be bound to the data grid by reference (editing data grid alters the data source. See Understanding binding as reference.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Defines the structure of a new row when data source is an object.
    * @see http://handsontable.com/demo/datasources.html for examples.
    */
  var dataSchema: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true enables the debug mode, currently used to test the correctness of the row and column header fixed positioning on a layer above the master table.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * If true, ENTER begins editing mode (like Google Docs). If false, ENTER moves to next row (like Excel) and adds new row if necessary. TAB adds new column if necessary.
    */
  var enterBeginsEditing: js.UndefOr[Boolean] = js.native
  /**
    * Defines cursor move after ENTER is pressed (SHIFT+ENTER uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a ENTER key has been pressed. This event object can be used to check whether user pressed ENTER or SHIFT + ENTER.
    */
  var enterMoves: js.UndefOr[js.Any] = js.native
  /**
    * Enables the fill handle (drag-down and copy-down) functionality, which shows the small rectangle in bottom right corner of the selected area, that let's you expand values to the adjacent cells.
    * Possible values: true (to enable in all directions), "vertical" or "horizontal" (to enable in one direction), false (to disable completely). Setting to true enables the fillHandle plugin, which,
    */
  var fillHandle: js.UndefOr[js.Any] = js.native
  /**
    * Allows to specify the number of columns fixed (aka freezed) on the left side of the table.
    */
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  /**
    * Allows to specify the number of rows fixed (aka freezed) on the top of the table.
    */
  var fixedRowsTop: js.UndefOr[Double] = js.native
  /**
    * Setting to true enables selecting just a fragment of the text within a single cell or between adjacent cells.
    */
  var fragmentSelection: js.UndefOr[Boolean] = js.native
  /**
    * Height of the grid. Can be a number or a function that returns a number.
    */
  var height: js.UndefOr[js.Any] = js.native
  /**
    * CSS class name for cells that did not pass validation.
    */
  var invalidCellClassName: js.UndefOr[String] = js.native
  /**
    * Lets you overwrite the default isEmptyCol method.
    */
  var isEmptyCol: js.UndefOr[js.Function1[/* col */ Double, Boolean]] = js.native
  /**
    * Lets you overwrite the default isEmptyRow method.
    */
  var isEmptyRow: js.UndefOr[js.Function1[/* row */ Double, Boolean]] = js.native
  /**
    * Turn on Manual column move, if set to a boolean or define initial column order, if set to an array of column indexes.
    */
  var manualColumnMove: js.UndefOr[js.Any] = js.native
  /**
    * Turn on Manual column resize, if set to a boolean or define initial column resized widths, if set to an array of numbers.
    */
  var manualColumnResize: js.UndefOr[js.Any] = js.native
  /**
    * Turns on Manual row move, if set to a boolean or define initial row order, if set to an array of row indexes.
    */
  var manualRowMove: js.UndefOr[Boolean] = js.native
  /**
    * Setting to true enables the manualRowResize plugin, which allows to resize the row height with your mouse.
    */
  var manualRowResize: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of columns.
    */
  var maxCols: js.UndefOr[Double] = js.native
  /**
    * Maximum number of rows.
    */
  var maxRows: js.UndefOr[Double] = js.native
  /**
    * Setting to true or array enables the mergeCells plugin, which enables the merging of the cells. (see demo). You can provide the merged cells on the pageload if you feed the mergeCells option with an array.
    */
  var mergeCells: js.UndefOr[js.Any] = js.native
  /**
    * Minimum number of columns. At least that many of columns will be created during initialization.
    */
  var minCols: js.UndefOr[Double] = js.native
  /**
    * Minimum number of rows. At least that many of rows will be created during initialization.
    */
  var minRows: js.UndefOr[Double] = js.native
  /**
    * When set to 1 (or more), Handsontable will add a new column at the end of grid if there are no more empty columns.
    */
  var minSpareCols: js.UndefOr[Double] = js.native
  /**
    * When set to 1 (or more), Handsontable will add a new row at the end of grid if there are no more empty rows.
    */
  var minSpareRows: js.UndefOr[Double] = js.native
  /**
    * Callback fired after column modify.
    */
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  /**
    * Callback fired after modify column's width.
    */
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.native
  /**
    * Callback fired after row modify.
    */
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  /**
    * Callback fired after modify hight of row.
    */
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.native
  /**
    * If true, selection of multiple cells using keyboard or mouse is allowed.
    */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /**
    * CSS class name cells configured with wordWrap: false.
    */
  var noWordWrapClassName: js.UndefOr[String] = js.native
  /**
    * Setting to true enables the observeChanges plugin, which automatically renders the table when a change in the data source is observed.
    */
  var observeChanges: js.UndefOr[Boolean] = js.native
  /**
    * When set to true, the table is rerendered when it is detected that it was made visible in DOM.
    */
  var observeDOMVisibility: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated! Now event is called beforeChange.
    */
  var onBeforeChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
  /**
    * Deprecated! Now event is called afterChange.
    */
  var onChange: js.UndefOr[js.Function2[/* changes */ js.Array[_], /* source */ String, Unit]] = js.native
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
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelection.
    */
  var onSelection: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionByProp.
    */
  var onSelectionByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionEnd.
    */
  var onSelectionEnd: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * Deprecated! Now event is called afterSelectionEndByProp.
    */
  var onSelectionEndByProp: js.UndefOr[
    js.Function4[/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double, Unit]
  ] = js.native
  /**
    * If true, mouse click outside the grid will deselect the current selection.
    */
  var outsideClickDeselects: js.UndefOr[Boolean] = js.native
  /**
    * Defines paste (CTRL+V) behavior. Default value "overwrite" will paste clipboard value over current selection.
    * When set to "shift_down", clipboard data will be pasted in place of current selection, while all selected cells are moved down.
    * When set to "shift_right", clipboard data will be pasted in place of current selection, while all selected cells are moved right.
    */
  var pasteMode: js.UndefOr[String] = js.native
  /**
    * Turn on saving the state of column sorting, columns positions and columns sizes in local storage. For more information see How to save data localy.
    */
  var persistentState: js.UndefOr[Boolean] = js.native
  /**
    * When set to an non-empty string, displayed as the cell content for empty cells.
    */
  var placeholder: js.UndefOr[js.Any] = js.native
  /**
    * CSS class name for cells that have a placeholder in use.
    */
  var placeholderCellClassName: js.UndefOr[String] = js.native
  /**
    * CSS class name for read-only cells.
    */
  var readOnlyCellClassName: js.UndefOr[String] = js.native
  /**
    * Setting true or false will enable or disable the default row headers (1, 2, 3). You can also define an array ['One', 'Two', 'Three', ...] or a function to define the headers. If a function is set the index of the rowis passed as a parameter.
    */
  var rowHeaders: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true enables the search plugin (see demo).
    */
  var search: js.UndefOr[Boolean] = js.native
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startCols: js.UndefOr[Double] = js.native
  /**
    * Initial number of rows. Notice: This option only has effect in Handsontable constructor and only if data option is not provided.
    */
  var startRows: js.UndefOr[Double] = js.native
  /**
    * Column stretching mode. Possible values: "none", "last", "all".
    */
  var stretchH: js.UndefOr[String] = js.native
  /**
    * Defines cursor move after TAB is pressed (SHIFT+TAB uses negative vector). Can be an object or a function that returns an object. The event argument passed to the function is a jQuery.Event object received after a TAB key has been pressed. This event object can be used to check whether user pressed TAB or SHIFT + TAB.
    */
  var tabMoves: js.UndefOr[js.Any] = js.native
  /**
    * If true, undo/redo functionality is enabled.
    */
  var undo: js.UndefOr[Boolean] = js.native
  /**
    * Width of the grid. Can be a number or a function that returns a number.
    */
  var width: js.UndefOr[js.Any] = js.native
  /**
    * Setting to true word wrapping of the cell text content that does not fit in the fixed column width.
    */
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAfterCellMetaReset(value: js.Function): Self = this.set("afterCellMetaReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCellMetaReset: Self = this.set("afterCellMetaReset", js.undefined)
    @scala.inline
    def setAfterChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = this.set("afterChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAfterColumnMove(value: (/* oldIndex */ Double, /* newIndex */ Double) => Unit): Self = this.set("afterColumnMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterColumnMove: Self = this.set("afterColumnMove", js.undefined)
    @scala.inline
    def setAfterColumnResize(value: (/* col */ Double, /* size */ Double) => Unit): Self = this.set("afterColumnResize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterColumnResize: Self = this.set("afterColumnResize", js.undefined)
    @scala.inline
    def setAfterColumnSort(value: (/* column */ Double, /* order */ Boolean) => Unit): Self = this.set("afterColumnSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterColumnSort: Self = this.set("afterColumnSort", js.undefined)
    @scala.inline
    def setAfterCopyLimit(
      value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit
    ): Self = this.set("afterCopyLimit", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterCopyLimit: Self = this.set("afterCopyLimit", js.undefined)
    @scala.inline
    def setAfterCreateCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("afterCreateCol", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterCreateCol: Self = this.set("afterCreateCol", js.undefined)
    @scala.inline
    def setAfterCreateRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("afterCreateRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterCreateRow: Self = this.set("afterCreateRow", js.undefined)
    @scala.inline
    def setAfterDeselect(value: js.Function): Self = this.set("afterDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDeselect: Self = this.set("afterDeselect", js.undefined)
    @scala.inline
    def setAfterDestroy(value: js.Function): Self = this.set("afterDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    @scala.inline
    def setAfterGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit): Self = this.set("afterGetCellMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterGetCellMeta: Self = this.set("afterGetCellMeta", js.undefined)
    @scala.inline
    def setAfterGetColHeader(value: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = this.set("afterGetColHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterGetColHeader: Self = this.set("afterGetColHeader", js.undefined)
    @scala.inline
    def setAfterGetColWidth(value: (/* col */ Double, /* response */ js.Object) => Unit): Self = this.set("afterGetColWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterGetColWidth: Self = this.set("afterGetColWidth", js.undefined)
    @scala.inline
    def setAfterInit(value: js.Function): Self = this.set("afterInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setAfterLoadData(value: js.Function): Self = this.set("afterLoadData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterLoadData: Self = this.set("afterLoadData", js.undefined)
    @scala.inline
    def setAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Unit): Self = this.set("afterOnCellCornerMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterOnCellCornerMouseDown: Self = this.set("afterOnCellCornerMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseDown(
      value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit
    ): Self = this.set("afterOnCellMouseDown", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseDown: Self = this.set("afterOnCellMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseOver(
      value: (/* event */ MouseEvent, /* coords */ CellPosition, /* TD */ HTMLTableDataCellElement) => Unit
    ): Self = this.set("afterOnCellMouseOver", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseOver: Self = this.set("afterOnCellMouseOver", js.undefined)
    @scala.inline
    def setAfterRemoveCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("afterRemoveCol", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterRemoveCol: Self = this.set("afterRemoveCol", js.undefined)
    @scala.inline
    def setAfterRemoveRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("afterRemoveRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterRemoveRow: Self = this.set("afterRemoveRow", js.undefined)
    @scala.inline
    def setAfterRender(value: /* isForced */ Boolean => Unit): Self = this.set("afterRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    @scala.inline
    def setAfterRenderer(
      value: (/* TD */ HTMLTableDataCellElement, /* row */ Double, /* col */ Double, /* prop */ String, /* value */ String, /* cellProperties */ js.Object) => Unit
    ): Self = this.set("afterRenderer", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAfterRenderer: Self = this.set("afterRenderer", js.undefined)
    @scala.inline
    def setAfterScrollHorizontally(value: js.Function): Self = this.set("afterScrollHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterScrollHorizontally: Self = this.set("afterScrollHorizontally", js.undefined)
    @scala.inline
    def setAfterScrollVertically(value: js.Function): Self = this.set("afterScrollVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterScrollVertically: Self = this.set("afterScrollVertically", js.undefined)
    @scala.inline
    def setAfterSelection(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit): Self = this.set("afterSelection", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSelection: Self = this.set("afterSelection", js.undefined)
    @scala.inline
    def setAfterSelectionByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit): Self = this.set("afterSelectionByProp", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSelectionByProp: Self = this.set("afterSelectionByProp", js.undefined)
    @scala.inline
    def setAfterSelectionEnd(value: (/* r */ Double, /* c */ Double, /* r2 */ Double, /* c2 */ Double) => Unit): Self = this.set("afterSelectionEnd", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSelectionEnd: Self = this.set("afterSelectionEnd", js.undefined)
    @scala.inline
    def setAfterSelectionEndByProp(value: (/* r */ Double, /* p */ String, /* r2 */ Double, /* p2 */ String) => Unit): Self = this.set("afterSelectionEndByProp", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSelectionEndByProp: Self = this.set("afterSelectionEndByProp", js.undefined)
    @scala.inline
    def setAfterSetCellMeta(value: js.Function): Self = this.set("afterSetCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSetCellMeta: Self = this.set("afterSetCellMeta", js.undefined)
    @scala.inline
    def setAfterUpdateSettings(value: js.Function): Self = this.set("afterUpdateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUpdateSettings: Self = this.set("afterUpdateSettings", js.undefined)
    @scala.inline
    def setAfterValidate(
      value: (/* isValid */ Boolean, /* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Boolean
    ): Self = this.set("afterValidate", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterValidate: Self = this.set("afterValidate", js.undefined)
    @scala.inline
    def setAutoColumnSize(value: Boolean | js.Object): Self = this.set("autoColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoColumnSize: Self = this.set("autoColumnSize", js.undefined)
    @scala.inline
    def setAutoCompleteVarargs(value: js.Any*): Self = this.set("autoComplete", js.Array(value :_*))
    @scala.inline
    def setAutoComplete(value: js.Array[_]): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoWrapCol(value: Boolean): Self = this.set("autoWrapCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWrapCol: Self = this.set("autoWrapCol", js.undefined)
    @scala.inline
    def setAutoWrapRow(value: Boolean): Self = this.set("autoWrapRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWrapRow: Self = this.set("autoWrapRow", js.undefined)
    @scala.inline
    def setBeforeAutofill(
      value: (/* start */ CellPosition, /* end */ CellPosition, /* data */ js.Array[js.Array[String]]) => Unit
    ): Self = this.set("beforeAutofill", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeAutofill: Self = this.set("beforeAutofill", js.undefined)
    @scala.inline
    def setBeforeChange(value: (/* changes */ js.Array[js.Array[_]], /* source */ String) => Unit): Self = this.set("beforeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setBeforeChangeRender(value: js.Function): Self = this.set("beforeChangeRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChangeRender: Self = this.set("beforeChangeRender", js.undefined)
    @scala.inline
    def setBeforeColumnSort(value: (/* column */ Double, /* order */ Boolean) => Unit): Self = this.set("beforeColumnSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeColumnSort: Self = this.set("beforeColumnSort", js.undefined)
    @scala.inline
    def setBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ js.Object) => Unit): Self = this.set("beforeGetCellMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeGetCellMeta: Self = this.set("beforeGetCellMeta", js.undefined)
    @scala.inline
    def setBeforeInit(value: js.Function): Self = this.set("beforeInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    @scala.inline
    def setBeforeInitWalkontable(value: js.Function): Self = this.set("beforeInitWalkontable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeInitWalkontable: Self = this.set("beforeInitWalkontable", js.undefined)
    @scala.inline
    def setBeforeKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("beforeKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeKeyDown: Self = this.set("beforeKeyDown", js.undefined)
    @scala.inline
    def setBeforeRemoveCol(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("beforeRemoveCol", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeRemoveCol: Self = this.set("beforeRemoveCol", js.undefined)
    @scala.inline
    def setBeforeRemoveRow(value: (/* index */ Double, /* amount */ Double) => Unit): Self = this.set("beforeRemoveRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeRemoveRow: Self = this.set("beforeRemoveRow", js.undefined)
    @scala.inline
    def setBeforeRender(value: /* isForced */ Boolean => Unit): Self = this.set("beforeRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeRender: Self = this.set("beforeRender", js.undefined)
    @scala.inline
    def setBeforeSet(value: /* v */ js.Object => Unit): Self = this.set("beforeSet", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSet: Self = this.set("beforeSet", js.undefined)
    @scala.inline
    def setBeforeSetRangeEnd(value: /* coords */ js.Array[_] => Unit): Self = this.set("beforeSetRangeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSetRangeEnd: Self = this.set("beforeSetRangeEnd", js.undefined)
    @scala.inline
    def setBeforeValidate(value: (/* value */ js.Any, /* row */ Double, /* prop */ String, /* source */ String) => Unit): Self = this.set("beforeValidate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
    @scala.inline
    def setCells(value: (/* row */ Double, /* col */ Double, /* prop */ String) => Unit): Self = this.set("cells", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setColHeaders(value: js.Any): Self = this.set("colHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColHeaders: Self = this.set("colHeaders", js.undefined)
    @scala.inline
    def setColWidths(value: js.Any): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColWidths: Self = this.set("colWidths", js.undefined)
    @scala.inline
    def setColumnSorting(value: Boolean): Self = this.set("columnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSorting: Self = this.set("columnSorting", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[_]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setContextMenu(value: js.Any): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCopyColsLimit(value: Double): Self = this.set("copyColsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyColsLimit: Self = this.set("copyColsLimit", js.undefined)
    @scala.inline
    def setCopyPaste(value: Boolean): Self = this.set("copyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyPaste: Self = this.set("copyPaste", js.undefined)
    @scala.inline
    def setCopyRowsLimit(value: Double): Self = this.set("copyRowsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyRowsLimit: Self = this.set("copyRowsLimit", js.undefined)
    @scala.inline
    def setCurrentColClassName(value: String): Self = this.set("currentColClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentColClassName: Self = this.set("currentColClassName", js.undefined)
    @scala.inline
    def setCurrentRowClassName(value: String): Self = this.set("currentRowClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRowClassName: Self = this.set("currentRowClassName", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataSchema(value: js.Any): Self = this.set("dataSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSchema: Self = this.set("dataSchema", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEnterBeginsEditing(value: Boolean): Self = this.set("enterBeginsEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterBeginsEditing: Self = this.set("enterBeginsEditing", js.undefined)
    @scala.inline
    def setEnterMoves(value: js.Any): Self = this.set("enterMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterMoves: Self = this.set("enterMoves", js.undefined)
    @scala.inline
    def setFillHandle(value: js.Any): Self = this.set("fillHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillHandle: Self = this.set("fillHandle", js.undefined)
    @scala.inline
    def setFixedColumnsLeft(value: Double): Self = this.set("fixedColumnsLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedColumnsLeft: Self = this.set("fixedColumnsLeft", js.undefined)
    @scala.inline
    def setFixedRowsTop(value: Double): Self = this.set("fixedRowsTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRowsTop: Self = this.set("fixedRowsTop", js.undefined)
    @scala.inline
    def setFragmentSelection(value: Boolean): Self = this.set("fragmentSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentSelection: Self = this.set("fragmentSelection", js.undefined)
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setInvalidCellClassName(value: String): Self = this.set("invalidCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidCellClassName: Self = this.set("invalidCellClassName", js.undefined)
    @scala.inline
    def setIsEmptyCol(value: /* col */ Double => Boolean): Self = this.set("isEmptyCol", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEmptyCol: Self = this.set("isEmptyCol", js.undefined)
    @scala.inline
    def setIsEmptyRow(value: /* row */ Double => Boolean): Self = this.set("isEmptyRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEmptyRow: Self = this.set("isEmptyRow", js.undefined)
    @scala.inline
    def setManualColumnMove(value: js.Any): Self = this.set("manualColumnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualColumnMove: Self = this.set("manualColumnMove", js.undefined)
    @scala.inline
    def setManualColumnResize(value: js.Any): Self = this.set("manualColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualColumnResize: Self = this.set("manualColumnResize", js.undefined)
    @scala.inline
    def setManualRowMove(value: Boolean): Self = this.set("manualRowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualRowMove: Self = this.set("manualRowMove", js.undefined)
    @scala.inline
    def setManualRowResize(value: Boolean): Self = this.set("manualRowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualRowResize: Self = this.set("manualRowResize", js.undefined)
    @scala.inline
    def setMaxCols(value: Double): Self = this.set("maxCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCols: Self = this.set("maxCols", js.undefined)
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    @scala.inline
    def setMergeCells(value: js.Any): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeCells: Self = this.set("mergeCells", js.undefined)
    @scala.inline
    def setMinCols(value: Double): Self = this.set("minCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCols: Self = this.set("minCols", js.undefined)
    @scala.inline
    def setMinRows(value: Double): Self = this.set("minRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
    @scala.inline
    def setMinSpareCols(value: Double): Self = this.set("minSpareCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSpareCols: Self = this.set("minSpareCols", js.undefined)
    @scala.inline
    def setMinSpareRows(value: Double): Self = this.set("minSpareRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSpareRows: Self = this.set("minSpareRows", js.undefined)
    @scala.inline
    def setModifyCol(value: /* col */ Double => Unit): Self = this.set("modifyCol", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyCol: Self = this.set("modifyCol", js.undefined)
    @scala.inline
    def setModifyColWidth(value: (/* width */ Double, /* col */ Double) => Unit): Self = this.set("modifyColWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModifyColWidth: Self = this.set("modifyColWidth", js.undefined)
    @scala.inline
    def setModifyRow(value: /* row */ Double => Unit): Self = this.set("modifyRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRow: Self = this.set("modifyRow", js.undefined)
    @scala.inline
    def setModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Unit): Self = this.set("modifyRowHeight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModifyRowHeight: Self = this.set("modifyRowHeight", js.undefined)
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelect: Self = this.set("multiSelect", js.undefined)
    @scala.inline
    def setNoWordWrapClassName(value: String): Self = this.set("noWordWrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWordWrapClassName: Self = this.set("noWordWrapClassName", js.undefined)
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    @scala.inline
    def setObserveDOMVisibility(value: Boolean): Self = this.set("observeDOMVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveDOMVisibility: Self = this.set("observeDOMVisibility", js.undefined)
    @scala.inline
    def setOnBeforeChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    @scala.inline
    def setOnChange(value: (/* changes */ js.Array[_], /* source */ String) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnCopyLimit(
      value: (/* selectedRowsCount */ Double, /* selectedColsCount */ Double, /* copyRowsLimit */ Double, /* copyColsLimit */ Double) => Unit
    ): Self = this.set("onCopyLimit", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnCopyLimit: Self = this.set("onCopyLimit", js.undefined)
    @scala.inline
    def setOnSelection(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = this.set("onSelection", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    @scala.inline
    def setOnSelectionByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = this.set("onSelectionByProp", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelectionByProp: Self = this.set("onSelectionByProp", js.undefined)
    @scala.inline
    def setOnSelectionEnd(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = this.set("onSelectionEnd", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelectionEnd: Self = this.set("onSelectionEnd", js.undefined)
    @scala.inline
    def setOnSelectionEndByProp(value: (/* r */ Double, /* p */ Double, /* r2 */ Double, /* p2 */ Double) => Unit): Self = this.set("onSelectionEndByProp", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSelectionEndByProp: Self = this.set("onSelectionEndByProp", js.undefined)
    @scala.inline
    def setOutsideClickDeselects(value: Boolean): Self = this.set("outsideClickDeselects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutsideClickDeselects: Self = this.set("outsideClickDeselects", js.undefined)
    @scala.inline
    def setPasteMode(value: String): Self = this.set("pasteMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteMode: Self = this.set("pasteMode", js.undefined)
    @scala.inline
    def setPersistentState(value: Boolean): Self = this.set("persistentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentState: Self = this.set("persistentState", js.undefined)
    @scala.inline
    def setPlaceholder(value: js.Any): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderCellClassName(value: String): Self = this.set("placeholderCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderCellClassName: Self = this.set("placeholderCellClassName", js.undefined)
    @scala.inline
    def setReadOnlyCellClassName(value: String): Self = this.set("readOnlyCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnlyCellClassName: Self = this.set("readOnlyCellClassName", js.undefined)
    @scala.inline
    def setRowHeaders(value: js.Any): Self = this.set("rowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeaders: Self = this.set("rowHeaders", js.undefined)
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setStartCols(value: Double): Self = this.set("startCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCols: Self = this.set("startCols", js.undefined)
    @scala.inline
    def setStartRows(value: Double): Self = this.set("startRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRows: Self = this.set("startRows", js.undefined)
    @scala.inline
    def setStretchH(value: String): Self = this.set("stretchH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchH: Self = this.set("stretchH", js.undefined)
    @scala.inline
    def setTabMoves(value: js.Any): Self = this.set("tabMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabMoves: Self = this.set("tabMoves", js.undefined)
    @scala.inline
    def setUndo(value: Boolean): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

