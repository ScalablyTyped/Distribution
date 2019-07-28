package typings.igniteDashUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridMethods extends js.Object {
  /**
  	 * Returns the currently active (focused) cell that has the format { element: , row: , index: , rowIndex: , columnKey: }, if any.
  	 */
  def activeCell(): js.Object = js.native
  /**
  	 * Returns the currently active (focused) row that has the format { element: , index: }, if any.
  	 */
  def activeRow(): js.Object = js.native
  /**
  	 * Returns all data fixed rows recursively, not only the immediate ones(in ColumnFixing scenario - only when there is at least one fixed column)
  	 */
  def allFixedRows(): js.Array[_] = js.native
  /**
  	 * Returns all data rows recursively, not only the immediate ones(when there is at least one fixed column returns rows only in the UNFIXED table)
  	 */
  def allRows(): js.Array[_] = js.native
  /**
  	 * Returns a list of all transaction objects that are either pending, or have been committed in the data source.
  	 * That is a wrapper for this.dataSource.allTransactions().
  	 */
  def allTransactions(): js.Array[_] = js.native
  /**
  	 * Auto resize columns that have property width set to "*" so content to be auto-fitted(not shrinked/cutted). Auto-resizing is applied ONLY for visible columns
  	 */
  def autoSizeColumns(): Unit = js.native
  /**
  	 * Calculates the width of the column so its content to be auto-fitted to the width of the data in it(the content should NOT be shrinked/cutted)
  	 *
  	 * @param columnIndex Visible column index
  	 */
  def calculateAutoFitColumnWidth(columnIndex: Double): Double = js.native
  /**
  	 * Returns the cell TD element at the specified location
  	 *
  	 * @param x The column index.
  	 * @param y The row index.
  	 * @param isFixed Optional parameter - if true get cell TD at the specified location from the fixed table
  	 */
  def cellAt(x: Double, y: Double, isFixed: Boolean): Element = js.native
  /**
  	 * Returns the cell TD element by row id and column key
  	 *
  	 * @param rowId The id of the row.
  	 * @param columnKey The column key.
  	 */
  def cellById(rowId: js.Object, columnKey: String): Element = js.native
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit = js.native
  /**
  	 * Changes the the regional settings of widget element to the language specified in [options.regional](ui.iggrid#options:regional)
  	 * Note that this method is for rare scenarios, use [regional](ui.iggrid#options:regional) option setter
  	 */
  def changeRegional(): Unit = js.native
  /**
  	 * Gets all children's elements of the current grid, recursively
  	 */
  def children(): js.Array[_] = js.native
  /**
  	 * Gets all children of the current grid, recursively
  	 */
  def childrenWidgets(): js.Array[_] = js.native
  /**
  	 * Returns a column object by the specified column key
  	 *
  	 * @param key The column key.
  	 */
  def columnByKey(key: String): js.Object = js.native
  /**
  	 * Returns a column object by the specified header text. If there are multiple matches, returns the first one.
  	 *
  	 * @param text The column header text.
  	 */
  def columnByText(text: String): js.Object = js.native
  /**
  	 * Commits all pending transactions to the client data source. Note that there won't be anything to commit on the UI, since it is updated instantly. In order to rollback the actual UI, a call to dataBind() is required.
  	 *
  	 * @param rowId If specified, will commit only that transaction corresponding to the specified record key.
  	 */
  def commit(): Unit = js.native
  def commit(rowId: js.Object): Unit = js.native
  /**
  	 * Returns the DIV that is the topmost container of the grid widget
  	 */
  def container(): Element = js.native
  /**
  	 * Causes the grid to data bind to the data source (local or remote) , and re-render all of the data as well
  	 *
  	 * @param internal
  	 */
  def dataBind(internal: js.Object): Unit = js.native
  /**
  	 * If the data source points to a local JSON array of data, and it is necessary to reset it at runtime, it must be done through this API member instead of the options (options.dataSource)
  	 *
  	 * @param dataSource New data source object.
  	 */
  def dataSourceObject(dataSource: js.Object): Unit = js.native
  /**
  	 * Destroy is part of the jQuery UI widget API and does the following:
  	 * 1. Remove custom CSS classes that were added.
  	 * 2. Unwrap any wrapping elements such as scrolling divs and other containers.
  	 * 3. Unbind all events that were bound.
  	 *
  	 * @param notToCallDestroy
  	 */
  def destroy(notToCallDestroy: js.Object): Unit = js.native
  /**
  	 * Returns a record by a specified key (requires that primaryKey is set in the settings).
  	 * That is a wrapper for this.dataSource.findRecordByKey(key).
  	 *
  	 * @param key Primary key of the record
  	 */
  def findRecordByKey(key: js.Object): js.Object = js.native
  /**
  	 * Returns the DIV that is the topmost container of the fixed body grid - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedBodyContainer(): Element = js.native
  /**
  	 * Returns the DIV that is the topmost container of the fixed grid - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedContainer(): Element = js.native
  /**
  	 * Returns container(jQuery representation) containing fixed footer - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedFooterContainer(): js.Object = js.native
  /**
  	 * Returns the table that contains the footer cells - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedFootersTable(): Element = js.native
  /**
  	 * Returns container(jQuery representation) containing fixed header - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedHeaderContainer(): js.Object = js.native
  /**
  	 * Returns the table that contains the FIXED header cells - contains fixed columns(in ColumnFixing scenario)
  	 */
  def fixedHeadersTable(): Element = js.native
  /**
  	 * Returns the fixed row (TR element) at the specified index. jQuery selectors aren't used for performance reasons(in ColumnFixing scenario - only when there is at least one fixed column)
  	 *
  	 * @param i The row index.
  	 */
  def fixedRowAt(i: Double): Element = js.native
  /**
  	 * Returns a list of all fixed TR elements holding data in the grid(in ColumnFixing scenario - only when there is at least one fixed column)
  	 */
  def fixedRows(): js.Array[_] = js.native
  /**
  	 * Returns the fixed table - contains fixed columns(in ColumnFixing scenario). If there aren't fixed columns returns the grid table
  	 */
  def fixedTable(): js.Object = js.native
  /**
  	 * Returns the current fixing direction. NOTE - use only if ColumnFixing feature is enabled
  	 * @return left|right
  	 */
  def fixingDirection(): String = js.native
  /**
  	 * Returns the table that contains the footer cells
  	 */
  def footersTable(): Element = js.native
  /**
  	 * Returns the cell text. If colKey is a number, the index of the column is used (instead of a column name)- does not apply when using a Multi-Row Layout grid.
  	 * This is the actual text (or HTML string) for the contents of the cell.
  	 *
  	 * @param rowId Row index or row data key (primary key)
  	 * @param colKey Column key.
  	 */
  def getCellText(rowId: js.Object, colKey: String): String = js.native
  /**
  	 * Retrieves a cell value using the row index and the column key. If a primaryKey is defined, rowId is assumed to be the row Key (not index).
  	 * If primary key is not defined, then rowId is converted to a number and is used as a row index.
  	 *
  	 * @param rowId Row index or row key (primary key).
  	 * @param colKey The column key.
  	 */
  def getCellValue(rowId: js.Object, colKey: String): js.Object = js.native
  /**
  	 * Returns column object and visible index for the table cell(TD) which is passed as argument
  	 *
  	 * @param $td cell(TD) - either DOM TD element or jQuery object
  	 */
  def getColumnByTD($td: js.Object): js.Object = js.native
  /**
  	 * Returns a standalone object (copy) that represents the committed transactions, but detached from the data source.
  	 * That is a wrapper for this.dataSource.getDetachedRecord(t).
  	 *
  	 * @param t A transaction object.
  	 */
  def getDetachedRecord(t: js.Object): js.Object = js.native
  /**
  	 * Returns an object that contains information on the passed Dom element
  	 *
  	 * rowId - the id of the record associated with the element - if primaryKey is not set this will be null.
  	 * rowIndex - the index (in the DOM) of the row associated with the element.
  	 * recordIndex - index of the data record associated with this element in the current dataView.
  	 * columnObject  - the column object associated with this element ( if the element is tr this will be null)
  	 *
  	 * @param elem The Dom element or jQuery object which can be a TD or TR element from the grid.
  	 */
  def getElementInfo(elem: Element): js.Object = js.native
  /**
  	 * Returns an unbound column with the specified key. If not found returns null
  	 *
  	 * @param key a column key
  	 */
  def getUnboundColumnByKey(key: String): js.Object = js.native
  /**
  	 * Gets unbound values for the specified column key. If key is not specified returns all unboundvalues
  	 *
  	 * @param key column key
  	 */
  def getUnboundValues(key: String): js.Object = js.native
  /**
  	 * Get visible index by specified column key. If column is not found or is hidden then returns -1.
  	 * Note: Method does not count column groups (Multi-Column Headers).
  	 *
  	 * @param columnKey columnKey
  	 * @param includeDataSkip Optional parameter - if set to true include non data columns(like expander column, row selectors column, etc.) in calculations
  	 */
  def getVisibleIndexByKey(columnKey: String, includeDataSkip: Boolean): Double = js.native
  /**
  	 * Returns true if grid has at least one fixed columns(even if a non-data column - like row-selectors column)
  	 */
  def hasFixedColumns(): Boolean = js.native
  /**
  	 * Returns whether grid has non-data fixed columns(e.g. row selectors column)
  	 */
  def hasFixedDataSkippedColumns(): Boolean = js.native
  /**
  	 * Returns whether there is vertical scrollbar. Because of perfrormance issues in older Internet Explorer especially 8,9 - there is no need to check if height is not set - there is no scrollbar OR if row virtualization is enabled - it is supposed there is vertical scrollbar
  	 */
  def hasVerticalScrollbar(): js.Object = js.native
  /**
  	 * Returns the table that contains the header cells
  	 */
  def headersTable(): Element = js.native
  /**
  	 * Hides a visible column. If the column is hidden the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a column index else if a string is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when the column is hidden(optional)
  	 */
  def hideColumn(column: js.Object, callback: js.Function): Unit = js.native
  /**
  	 * Returns the ID of the TABLE element where data records are rendered
  	 */
  def id(): String = js.native
  /**
  	 * Gets all immediate children's elements of the current grid
  	 */
  def immediateChildren(): js.Array[_] = js.native
  /**
  	 * Gets all immediate children of the current grid
  	 */
  def immediateChildrenWidgets(): js.Array[_] = js.native
  /**
  	 * Returns whether the column with identifier colKey is fixed
  	 *
  	 * @param colKey An identifier of the column which should be checked. It can be a key or visible index.
  	 */
  def isFixedColumn(colKey: js.Object): Boolean = js.native
  /**
  	 * Returns whether the header identified by colKey is multicolumn header(has children)
  	 *
  	 * @param colKey value of the column key
  	 */
  def isGroupHeader(colKey: String): js.Object = js.native
  /**
  	 * Moves a visible column at a specified place, in front or behind a target column or at a target index
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier of the column to be moved. It can be a key, a Multi-Column Header identificator, or an index in a number format. The latter is not supported when the grid contains multi-column headers.
  	 * @param target An identifier of a column where the moved column should move to or an index at which the moved column should be moved to. In the case of a column identifier the column will be moved after it by default.
  	 * @param after Specifies whether the column moved should be moved after or before the target column. This parameter is disregarded if there is no target column specified but a target index is used.
  	 * @param inDom Specifies whether the column moving will be enacted through DOM manipulation or through rerendering of the grid.
  	 * @param callback Specifies a custom function to be called when the column is moved.
  	 */
  def moveColumn(column: js.Object, target: js.Object): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean, inDom: Boolean): Unit = js.native
  def moveColumn(column: js.Object, target: js.Object, after: Boolean, inDom: Boolean, callback: js.Function): Unit = js.native
  /**
  	 * Returns a list of all transaction objects that are pending to be committed or rolled back to the data source.
  	 * That is a wrapper for this.dataSource.pendingTransactions().
  	 */
  def pendingTransactions(): js.Array[_] = js.native
  /**
  	 * When called the method re-renders the whole grid(also rebinds to the data source) and renders the cols object
  	 *
  	 * @param cols an array of column objects
  	 */
  def renderMultiColumnHeader(cols: js.Array[_]): Unit = js.native
  /**
  	 * Adds a new row (TR) to the grid, by taking a data row object. Assumes the record will have the primary key.
  	 *
  	 * @param rec Identifier/key of row. If missing, then number of rows in grid is used.
  	 */
  def renderNewRow(): Unit = js.native
  def renderNewRow(rec: String): Unit = js.native
  /**
  	 * Called to detect whether grid container is resized. When autoAdjustHeight is true and height of the grid is changed then the height of grid is re-set.
  	 */
  def resizeContainer(): Unit = js.native
  /**
  	 * Clears the transaction log (delegates to igDataSource). Note that this does not update the UI. In case the UI must be updated, set the second parameter "updateUI" to true, which will trigger a call to dataBind() to re-render the contents.
  	 *
  	 * @param rowId If specified, will only rollback the transactions with that row id.
  	 * @param updateUI Whether to update the UI or not.
  	 */
  def rollback(): js.Array[_] = js.native
  def rollback(rowId: js.Object): js.Array[_] = js.native
  def rollback(rowId: js.Object, updateUI: Boolean): js.Array[_] = js.native
  /**
  	 * Returns the row (TR element) at the specified index. jQuery selectors aren't used for performance reasons
  	 *
  	 * @param i The row index.
  	 */
  def rowAt(i: Double): Element = js.native
  /**
  	 * Returns the row TR element by row id
  	 *
  	 * @param rowId The id of the row.
  	 * @param isFixed Specify search in the fixed container.
  	 */
  def rowById(rowId: js.Object): Element = js.native
  def rowById(rowId: js.Object, isFixed: Boolean): Element = js.native
  /**
  	 * Returns a list of all TR elements holding data in the grid(when there is at least one fixed column returns rows only in the UNFIXED table)
  	 */
  def rows(): js.Array[_] = js.native
  /**
  	 * Invokes an AJAX request to the updateUrl option (if specified) and passes the serialized transaction log (a serialized JSON string) as part of the POST request.
  	 *
  	 * @param success Specifies a custom function to be called when AJAX request to the updateUrl option succeeds(optional)
  	 * @param error Specifies a custom function to be called when AJAX request to the updateUrl option fails(optional)
  	 */
  def saveChanges(success: js.Function, error: js.Function): Unit = js.native
  /**
  	 * Returns the DIV that is used as a scroll container for the grid contents
  	 */
  def scrollContainer(): Element = js.native
  /**
  	 * Returns the currently selected cell that has the format { element: , row: , index: , rowIndex: , columnKey: }, if any.
  	 * If multiple selection is enabled the function will return null.
  	 */
  def selectedCell(): js.Object = js.native
  /**
  	 * Returns an array of selected cells in arbitrary order where every objects has the format { element: , row: , index: , rowIndex: , columnKey: } .
  	 * If multiple selection is disabled the function will return null.
  	 */
  def selectedCells(): js.Array[_] = js.native
  /**
  	 * Returns the currently selected row that has the format { element: , index: }, if any.
  	 * If multiple selection is enabled the function will return null.
  	 */
  def selectedRow(): js.Object = js.native
  /**
  	 * Returns an array of selected rows in arbitrary order where every object has the format { element: , index: } .
  	 * If multiple selection is disabled the function will return null.
  	 */
  def selectedRows(): js.Array[_] = js.native
  /**
  	 * Sets a new template for a column after initialization and renders the grid if not explicitly disabled. This method will replace any existing explicitly set row template and will build one anew from the column ones.
  	 *
  	 * @param col An identifier of the column to set template for (index or key)
  	 * @param tmpl The column template to set
  	 * @param render Should the grid rerender after template is set
  	 */
  def setColumnTemplate(col: js.Object, tmpl: String): Unit = js.native
  def setColumnTemplate(col: js.Object, tmpl: String, render: Boolean): Unit = js.native
  /**
  	 * Sets unbound value for the unbound cell by the specified column key and row primary key.
  	 *
  	 * @param col key of the unbound column
  	 * @param rowId primary key value of the row
  	 * @param val value to be set on unbound cell
  	 * @param notToRender if false will re-render the row
  	 */
  def setUnboundValueByPK(col: String, rowId: String, `val`: js.Object, notToRender: js.Object): Unit = js.native
  /**
  	 * Sets unbound values for the unbound column with the specified key. If removeOldValues is true then values(if any) for the unbound columns are re-set with the new values
  	 *
  	 * @param key key of the unbound column
  	 * @param values array of values to be set on unbound values
  	 * @param removeOldValues if true removes current unbound values(if any) for the specified column and apply the new ones specified in parameter values. Otherwise merge current values with the specified in parameter values
  	 */
  def setUnboundValues(key: String, values: js.Array[_], removeOldValues: js.Object): Unit = js.native
  /**
  	 * Shows a hidden column. If the column is not hidden the method does nothing.
  	 * Note: This method is asynchronous which means that it returns immediately and any subsequent code will execute in parallel. This may lead to runtime errors. To avoid them put the subsequent code in the callback parameter provided by the method.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a column index. If a string is provided it will be used as a column key.
  	 * @param callback Specifies a custom function to be called when the column is shown(optional)
  	 */
  def showColumn(column: js.Object, callback: js.Function): Unit = js.native
  /**
  	 * Returns the total number of records in the underlying backend. If paging or filtering is enabled, this may differ from the number of records in the client-side data source.
  	 * In order for this to work, the response JSON/XML must include a property that specifies the total number of records, which name is specified by options.responseTotalRecCountKey.
  	 * This functionality is completely delegated to the data source control.
  	 */
  def totalRecordsCount(): Double = js.native
  /**
  	 * Returns the accumulated transaction log as a string. The purpose of this is to be passed to URLs or used conveniently.
  	 * That is a wrapper for this.dataSource.transactionsAsString().
  	 */
  def transactionsAsString(): String = js.native
  /**
  	 * Scroll to the specified row or specified position(in pixels)
  	 *
  	 * @param scrollerPosition An identifier of the vertical scroll position. When it is string then it is interpreted as pixels otherwise it is the row number
  	 */
  def virtualScrollTo(scrollerPosition: js.Object): Unit = js.native
  /**
  	 * Returns the element holding the data records
  	 */
  def widget(): Unit = js.native
}

