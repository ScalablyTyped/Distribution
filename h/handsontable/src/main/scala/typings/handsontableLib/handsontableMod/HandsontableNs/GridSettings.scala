package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSettings extends Hooks {
  var activeHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var allowHtml: js.UndefOr[scala.Boolean] = js.undefined
  var allowInsertColumn: js.UndefOr[scala.Boolean] = js.undefined
  var allowInsertRow: js.UndefOr[scala.Boolean] = js.undefined
  var allowInvalid: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemoveColumn: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemoveRow: js.UndefOr[scala.Boolean] = js.undefined
  var autoColumnSize: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  var autoComplete: js.UndefOr[js.Array[_]] = js.undefined
  var autoRowSize: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  var autoWrapCol: js.UndefOr[scala.Boolean] = js.undefined
  var autoWrapRow: js.UndefOr[scala.Boolean] = js.undefined
  var bindRowsWithHeaders: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
   // pro
  var cell: js.UndefOr[js.Array[_]] = js.undefined
  var cells: js.UndefOr[
    js.Function3[
      /* row */ js.UndefOr[scala.Double], 
      /* col */ js.UndefOr[scala.Double], 
      /* prop */ js.UndefOr[js.Object], 
      GridSettings
    ]
  ] = js.undefined
  var checkedTemplate: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  var colHeaders: js.UndefOr[
    (js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | scala.Boolean | js.Array[_]
  ] = js.undefined
   // pro
  var colWidths: js.UndefOr[
    (js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | scala.Double | java.lang.String | js.Array[_]
  ] = js.undefined
  var collapsibleColumns: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
   // pro
  var columnHeaderHeight: js.UndefOr[scala.Double | js.Array[_]] = js.undefined
  var columnSorting: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Settings
  ] = js.undefined
  var columnSummary: js.UndefOr[js.Object] = js.undefined
  var columns: js.UndefOr[(js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | js.Array[_]] = js.undefined
  var commentedCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var comments: js.UndefOr[scala.Boolean | js.Array[CommentObject]] = js.undefined
  var contextMenu: js.UndefOr[
    scala.Boolean | js.Array[_] | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings
  ] = js.undefined
  var contextMenuCopyPaste: js.UndefOr[js.Object] = js.undefined
  var copyColsLimit: js.UndefOr[scala.Double] = js.undefined
  var copyPaste: js.UndefOr[scala.Boolean] = js.undefined
  var copyRowsLimit: js.UndefOr[scala.Double] = js.undefined
  var copyable: js.UndefOr[scala.Boolean] = js.undefined
  var correctFormat: js.UndefOr[scala.Boolean] = js.undefined
  var currentColClassName: js.UndefOr[java.lang.String] = js.undefined
  var currentHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var currentRowClassName: js.UndefOr[java.lang.String] = js.undefined
  var customBorders: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var data: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  var dataSchema: js.UndefOr[js.Object] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var defaultDate: js.UndefOr[java.lang.String] = js.undefined
  var disableVisualSelection: js.UndefOr[scala.Boolean | java.lang.String | js.Array[_]] = js.undefined
  var dragToScroll: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenu: js.UndefOr[scala.Boolean | js.Object | js.Array[_]] = js.undefined
   // pro
  var editor: js.UndefOr[java.lang.String | js.Function0[scala.Unit] | scala.Boolean] = js.undefined
  var enterBeginsEditing: js.UndefOr[scala.Boolean] = js.undefined
  var enterMoves: js.UndefOr[js.Object | js.Function0[scala.Unit]] = js.undefined
  var fillHandle: js.UndefOr[scala.Boolean | java.lang.String | js.Object] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filteringCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var filters: js.UndefOr[scala.Boolean] = js.undefined
   // pro
  var fixedColumnsLeft: js.UndefOr[scala.Double] = js.undefined
  var fixedRowsBottom: js.UndefOr[scala.Double] = js.undefined
   // pro
  var fixedRowsTop: js.UndefOr[scala.Double] = js.undefined
  var fragmentSelection: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var ganttChart: js.UndefOr[js.Object] = js.undefined
   // pro
  var headerTooltips: js.UndefOr[scala.Boolean | js.Object] = js.undefined
   // pro
  var height: js.UndefOr[scala.Double | js.Function0[scala.Unit]] = js.undefined
  var hiddenColumns: js.UndefOr[scala.Boolean | js.Object] = js.undefined
   // pro
  var hiddenRows: js.UndefOr[scala.Boolean | js.Object] = js.undefined
   // pro
  var invalidCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var isEmptyCol: js.UndefOr[js.Function1[/* col */ scala.Double, scala.Boolean]] = js.undefined
  var isEmptyRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Boolean]] = js.undefined
  var label: js.UndefOr[js.Object] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var manualColumnFreeze: js.UndefOr[scala.Boolean] = js.undefined
  var manualColumnMove: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var manualColumnResize: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var manualRowMove: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var manualRowResize: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var maxCols: js.UndefOr[scala.Double] = js.undefined
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var mergeCells: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  var minCols: js.UndefOr[scala.Double] = js.undefined
  var minRows: js.UndefOr[scala.Double] = js.undefined
  var minSpareCols: js.UndefOr[scala.Double] = js.undefined
  var minSpareRows: js.UndefOr[scala.Double] = js.undefined
  var multiColumnSorting: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.multiColumnSortingNs.Settings
  ] = js.undefined
  var nestedHeaders: js.UndefOr[js.Array[_]] = js.undefined
   // pro
  var noWordWrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var numericFormat: js.UndefOr[js.Object] = js.undefined
  var observeChanges: js.UndefOr[scala.Boolean] = js.undefined
  var observeDOMVisibility: js.UndefOr[scala.Boolean] = js.undefined
  var outsideClickDeselects: js.UndefOr[scala.Boolean | (js.Function1[/* target */ stdLib.HTMLElement, scala.Boolean])] = js.undefined
  var pasteMode: js.UndefOr[java.lang.String] = js.undefined
  var persistentState: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var placeholderCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var preventOverflow: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var readOnlyCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var renderAllRows: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[
    java.lang.String | handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base
  ] = js.undefined
  var rowHeaderWidth: js.UndefOr[scala.Double | js.Array[_]] = js.undefined
  var rowHeaders: js.UndefOr[scala.Boolean | js.Array[_] | js.Function0[scala.Unit]] = js.undefined
  var rowHeights: js.UndefOr[js.Array[_] | js.Function0[scala.Unit] | scala.Double | java.lang.String] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var selectOptions: js.UndefOr[js.Array[_]] = js.undefined
  var selectionMode: js.UndefOr[
    handsontableLib.handsontableLibStrings.single | handsontableLib.handsontableLibStrings.range | handsontableLib.handsontableLibStrings.multiple
  ] = js.undefined
  var skipColumnOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  var sortByRelevance: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[js.Array[_] | js.Function0[scala.Unit]] = js.undefined
  var startCols: js.UndefOr[scala.Double] = js.undefined
  var startRows: js.UndefOr[scala.Double] = js.undefined
  var stretchH: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var tabMoves: js.UndefOr[js.Object] = js.undefined
  var tableClassName: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trimDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var trimRows: js.UndefOr[scala.Boolean] = js.undefined
   // pro
  var trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uncheckedTemplate: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var undo: js.UndefOr[scala.Boolean] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
  var validator: js.UndefOr[
    js.Function2[
      /* value */ js.Any, 
      /* callback */ js.Function1[/* valid */ scala.Boolean, scala.Unit], 
      scala.Unit | stdLib.RegExp
    ]
  ] = js.undefined
  var viewportColumnRenderingOffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var viewportRowRenderingOffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var visibleRows: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double | js.Function0[scala.Unit]] = js.undefined
  var wordWrap: js.UndefOr[scala.Boolean] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply(
    Hooks: Hooks = null,
    activeHeaderClassName: java.lang.String = null,
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertColumn: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertRow: js.UndefOr[scala.Boolean] = js.undefined,
    allowInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemoveColumn: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemoveRow: js.UndefOr[scala.Boolean] = js.undefined,
    autoColumnSize: js.Object | scala.Boolean = null,
    autoComplete: js.Array[_] = null,
    autoRowSize: js.Object | scala.Boolean = null,
    autoWrapCol: js.UndefOr[scala.Boolean] = js.undefined,
    autoWrapRow: js.UndefOr[scala.Boolean] = js.undefined,
    bindRowsWithHeaders: scala.Boolean | java.lang.String = null,
    cell: js.Array[_] = null,
    cells: js.Function3[
      /* row */ js.UndefOr[scala.Double], 
      /* col */ js.UndefOr[scala.Double], 
      /* prop */ js.UndefOr[js.Object], 
      GridSettings
    ] = null,
    checkedTemplate: scala.Boolean | java.lang.String = null,
    className: java.lang.String | js.Array[_] = null,
    colHeaders: (js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | scala.Boolean | js.Array[_] = null,
    colWidths: (js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | scala.Double | java.lang.String | js.Array[_] = null,
    collapsibleColumns: scala.Boolean | js.Array[_] = null,
    columnHeaderHeight: scala.Double | js.Array[_] = null,
    columnSorting: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Settings = null,
    columnSummary: js.Object = null,
    columns: (js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]) | js.Array[_] = null,
    commentedCellClassName: java.lang.String = null,
    comments: scala.Boolean | js.Array[CommentObject] = null,
    contextMenu: scala.Boolean | js.Array[_] | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings = null,
    contextMenuCopyPaste: js.Object = null,
    copyColsLimit: scala.Int | scala.Double = null,
    copyPaste: js.UndefOr[scala.Boolean] = js.undefined,
    copyRowsLimit: scala.Int | scala.Double = null,
    copyable: js.UndefOr[scala.Boolean] = js.undefined,
    correctFormat: js.UndefOr[scala.Boolean] = js.undefined,
    currentColClassName: java.lang.String = null,
    currentHeaderClassName: java.lang.String = null,
    currentRowClassName: java.lang.String = null,
    customBorders: scala.Boolean | js.Array[_] = null,
    data: js.Any | js.Array[_] = null,
    dataSchema: js.Object = null,
    dateFormat: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDate: java.lang.String = null,
    disableVisualSelection: scala.Boolean | java.lang.String | js.Array[_] = null,
    dragToScroll: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenu: scala.Boolean | js.Object | js.Array[_] = null,
    editor: java.lang.String | js.Function0[scala.Unit] | scala.Boolean = null,
    enterBeginsEditing: js.UndefOr[scala.Boolean] = js.undefined,
    enterMoves: js.Object | js.Function0[scala.Unit] = null,
    fillHandle: scala.Boolean | java.lang.String | js.Object = null,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filteringCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.UndefOr[scala.Boolean] = js.undefined,
    fixedColumnsLeft: scala.Int | scala.Double = null,
    fixedRowsBottom: scala.Int | scala.Double = null,
    fixedRowsTop: scala.Int | scala.Double = null,
    fragmentSelection: scala.Boolean | java.lang.String = null,
    ganttChart: js.Object = null,
    headerTooltips: scala.Boolean | js.Object = null,
    height: scala.Double | js.Function0[scala.Unit] = null,
    hiddenColumns: scala.Boolean | js.Object = null,
    hiddenRows: scala.Boolean | js.Object = null,
    invalidCellClassName: java.lang.String = null,
    isEmptyCol: js.Function1[/* col */ scala.Double, scala.Boolean] = null,
    isEmptyRow: js.Function1[/* row */ scala.Double, scala.Boolean] = null,
    label: js.Object = null,
    language: java.lang.String = null,
    manualColumnFreeze: js.UndefOr[scala.Boolean] = js.undefined,
    manualColumnMove: scala.Boolean | js.Array[_] = null,
    manualColumnResize: scala.Boolean | js.Array[_] = null,
    manualRowMove: scala.Boolean | js.Array[_] = null,
    manualRowResize: scala.Boolean | js.Array[_] = null,
    maxCols: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    mergeCells: scala.Boolean | js.Array[_] = null,
    minCols: scala.Int | scala.Double = null,
    minRows: scala.Int | scala.Double = null,
    minSpareCols: scala.Int | scala.Double = null,
    minSpareRows: scala.Int | scala.Double = null,
    multiColumnSorting: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.multiColumnSortingNs.Settings = null,
    nestedHeaders: js.Array[_] = null,
    noWordWrapClassName: java.lang.String = null,
    numericFormat: js.Object = null,
    observeChanges: js.UndefOr[scala.Boolean] = js.undefined,
    observeDOMVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    outsideClickDeselects: scala.Boolean | (js.Function1[/* target */ stdLib.HTMLElement, scala.Boolean]) = null,
    pasteMode: java.lang.String = null,
    persistentState: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: js.Any = null,
    placeholderCellClassName: java.lang.String = null,
    preventOverflow: java.lang.String | scala.Boolean = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    readOnlyCellClassName: java.lang.String = null,
    renderAllRows: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: java.lang.String | handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = null,
    rowHeaderWidth: scala.Double | js.Array[_] = null,
    rowHeaders: scala.Boolean | js.Array[_] | js.Function0[scala.Unit] = null,
    rowHeights: js.Array[_] | js.Function0[scala.Unit] | scala.Double | java.lang.String = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    selectOptions: js.Array[_] = null,
    selectionMode: handsontableLib.handsontableLibStrings.single | handsontableLib.handsontableLibStrings.range | handsontableLib.handsontableLibStrings.multiple = null,
    skipColumnOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    sortByRelevance: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Array[_] | js.Function0[scala.Unit] = null,
    startCols: scala.Int | scala.Double = null,
    startRows: scala.Int | scala.Double = null,
    stretchH: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tabMoves: js.Object = null,
    tableClassName: java.lang.String | js.Array[_] = null,
    title: java.lang.String = null,
    trimDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    trimRows: js.UndefOr[scala.Boolean] = js.undefined,
    trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    uncheckedTemplate: scala.Boolean | java.lang.String = null,
    undo: js.UndefOr[scala.Boolean] = js.undefined,
    valid: js.UndefOr[scala.Boolean] = js.undefined,
    validator: js.Function2[
      /* value */ js.Any, 
      /* callback */ js.Function1[/* valid */ scala.Boolean, scala.Unit], 
      scala.Unit | stdLib.RegExp
    ] = null,
    viewportColumnRenderingOffset: scala.Double | java.lang.String = null,
    viewportRowRenderingOffset: scala.Double | java.lang.String = null,
    visibleRows: scala.Int | scala.Double = null,
    width: scala.Double | js.Function0[scala.Unit] = null,
    wordWrap: js.UndefOr[scala.Boolean] = js.undefined
  ): GridSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Hooks)
    if (activeHeaderClassName != null) __obj.updateDynamic("activeHeaderClassName")(activeHeaderClassName)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(allowInsertColumn)) __obj.updateDynamic("allowInsertColumn")(allowInsertColumn)
    if (!js.isUndefined(allowInsertRow)) __obj.updateDynamic("allowInsertRow")(allowInsertRow)
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid)
    if (!js.isUndefined(allowRemoveColumn)) __obj.updateDynamic("allowRemoveColumn")(allowRemoveColumn)
    if (!js.isUndefined(allowRemoveRow)) __obj.updateDynamic("allowRemoveRow")(allowRemoveRow)
    if (autoColumnSize != null) __obj.updateDynamic("autoColumnSize")(autoColumnSize.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (autoRowSize != null) __obj.updateDynamic("autoRowSize")(autoRowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWrapCol)) __obj.updateDynamic("autoWrapCol")(autoWrapCol)
    if (!js.isUndefined(autoWrapRow)) __obj.updateDynamic("autoWrapRow")(autoWrapRow)
    if (bindRowsWithHeaders != null) __obj.updateDynamic("bindRowsWithHeaders")(bindRowsWithHeaders.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (checkedTemplate != null) __obj.updateDynamic("checkedTemplate")(checkedTemplate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colHeaders != null) __obj.updateDynamic("colHeaders")(colHeaders.asInstanceOf[js.Any])
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths.asInstanceOf[js.Any])
    if (collapsibleColumns != null) __obj.updateDynamic("collapsibleColumns")(collapsibleColumns.asInstanceOf[js.Any])
    if (columnHeaderHeight != null) __obj.updateDynamic("columnHeaderHeight")(columnHeaderHeight.asInstanceOf[js.Any])
    if (columnSorting != null) __obj.updateDynamic("columnSorting")(columnSorting.asInstanceOf[js.Any])
    if (columnSummary != null) __obj.updateDynamic("columnSummary")(columnSummary)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (commentedCellClassName != null) __obj.updateDynamic("commentedCellClassName")(commentedCellClassName)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (contextMenuCopyPaste != null) __obj.updateDynamic("contextMenuCopyPaste")(contextMenuCopyPaste)
    if (copyColsLimit != null) __obj.updateDynamic("copyColsLimit")(copyColsLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(copyPaste)) __obj.updateDynamic("copyPaste")(copyPaste)
    if (copyRowsLimit != null) __obj.updateDynamic("copyRowsLimit")(copyRowsLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable)
    if (!js.isUndefined(correctFormat)) __obj.updateDynamic("correctFormat")(correctFormat)
    if (currentColClassName != null) __obj.updateDynamic("currentColClassName")(currentColClassName)
    if (currentHeaderClassName != null) __obj.updateDynamic("currentHeaderClassName")(currentHeaderClassName)
    if (currentRowClassName != null) __obj.updateDynamic("currentRowClassName")(currentRowClassName)
    if (customBorders != null) __obj.updateDynamic("customBorders")(customBorders.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSchema != null) __obj.updateDynamic("dataSchema")(dataSchema)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (disableVisualSelection != null) __obj.updateDynamic("disableVisualSelection")(disableVisualSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToScroll)) __obj.updateDynamic("dragToScroll")(dragToScroll)
    if (dropdownMenu != null) __obj.updateDynamic("dropdownMenu")(dropdownMenu.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (!js.isUndefined(enterBeginsEditing)) __obj.updateDynamic("enterBeginsEditing")(enterBeginsEditing)
    if (enterMoves != null) __obj.updateDynamic("enterMoves")(enterMoves.asInstanceOf[js.Any])
    if (fillHandle != null) __obj.updateDynamic("fillHandle")(fillHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(filteringCaseSensitive)) __obj.updateDynamic("filteringCaseSensitive")(filteringCaseSensitive)
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters)
    if (fixedColumnsLeft != null) __obj.updateDynamic("fixedColumnsLeft")(fixedColumnsLeft.asInstanceOf[js.Any])
    if (fixedRowsBottom != null) __obj.updateDynamic("fixedRowsBottom")(fixedRowsBottom.asInstanceOf[js.Any])
    if (fixedRowsTop != null) __obj.updateDynamic("fixedRowsTop")(fixedRowsTop.asInstanceOf[js.Any])
    if (fragmentSelection != null) __obj.updateDynamic("fragmentSelection")(fragmentSelection.asInstanceOf[js.Any])
    if (ganttChart != null) __obj.updateDynamic("ganttChart")(ganttChart)
    if (headerTooltips != null) __obj.updateDynamic("headerTooltips")(headerTooltips.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenColumns != null) __obj.updateDynamic("hiddenColumns")(hiddenColumns.asInstanceOf[js.Any])
    if (hiddenRows != null) __obj.updateDynamic("hiddenRows")(hiddenRows.asInstanceOf[js.Any])
    if (invalidCellClassName != null) __obj.updateDynamic("invalidCellClassName")(invalidCellClassName)
    if (isEmptyCol != null) __obj.updateDynamic("isEmptyCol")(isEmptyCol)
    if (isEmptyRow != null) __obj.updateDynamic("isEmptyRow")(isEmptyRow)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    if (!js.isUndefined(manualColumnFreeze)) __obj.updateDynamic("manualColumnFreeze")(manualColumnFreeze)
    if (manualColumnMove != null) __obj.updateDynamic("manualColumnMove")(manualColumnMove.asInstanceOf[js.Any])
    if (manualColumnResize != null) __obj.updateDynamic("manualColumnResize")(manualColumnResize.asInstanceOf[js.Any])
    if (manualRowMove != null) __obj.updateDynamic("manualRowMove")(manualRowMove.asInstanceOf[js.Any])
    if (manualRowResize != null) __obj.updateDynamic("manualRowResize")(manualRowResize.asInstanceOf[js.Any])
    if (maxCols != null) __obj.updateDynamic("maxCols")(maxCols.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (mergeCells != null) __obj.updateDynamic("mergeCells")(mergeCells.asInstanceOf[js.Any])
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (minSpareCols != null) __obj.updateDynamic("minSpareCols")(minSpareCols.asInstanceOf[js.Any])
    if (minSpareRows != null) __obj.updateDynamic("minSpareRows")(minSpareRows.asInstanceOf[js.Any])
    if (multiColumnSorting != null) __obj.updateDynamic("multiColumnSorting")(multiColumnSorting.asInstanceOf[js.Any])
    if (nestedHeaders != null) __obj.updateDynamic("nestedHeaders")(nestedHeaders)
    if (noWordWrapClassName != null) __obj.updateDynamic("noWordWrapClassName")(noWordWrapClassName)
    if (numericFormat != null) __obj.updateDynamic("numericFormat")(numericFormat)
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges)
    if (!js.isUndefined(observeDOMVisibility)) __obj.updateDynamic("observeDOMVisibility")(observeDOMVisibility)
    if (outsideClickDeselects != null) __obj.updateDynamic("outsideClickDeselects")(outsideClickDeselects.asInstanceOf[js.Any])
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode)
    if (!js.isUndefined(persistentState)) __obj.updateDynamic("persistentState")(persistentState)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placeholderCellClassName != null) __obj.updateDynamic("placeholderCellClassName")(placeholderCellClassName)
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (readOnlyCellClassName != null) __obj.updateDynamic("readOnlyCellClassName")(readOnlyCellClassName)
    if (!js.isUndefined(renderAllRows)) __obj.updateDynamic("renderAllRows")(renderAllRows)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (rowHeaderWidth != null) __obj.updateDynamic("rowHeaderWidth")(rowHeaderWidth.asInstanceOf[js.Any])
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders.asInstanceOf[js.Any])
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (selectOptions != null) __obj.updateDynamic("selectOptions")(selectOptions)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipColumnOnPaste)) __obj.updateDynamic("skipColumnOnPaste")(skipColumnOnPaste)
    if (!js.isUndefined(sortByRelevance)) __obj.updateDynamic("sortByRelevance")(sortByRelevance)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startCols != null) __obj.updateDynamic("startCols")(startCols.asInstanceOf[js.Any])
    if (startRows != null) __obj.updateDynamic("startRows")(startRows.asInstanceOf[js.Any])
    if (stretchH != null) __obj.updateDynamic("stretchH")(stretchH)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tabMoves != null) __obj.updateDynamic("tabMoves")(tabMoves)
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(trimDropdown)) __obj.updateDynamic("trimDropdown")(trimDropdown)
    if (!js.isUndefined(trimRows)) __obj.updateDynamic("trimRows")(trimRows)
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uncheckedTemplate != null) __obj.updateDynamic("uncheckedTemplate")(uncheckedTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(undo)) __obj.updateDynamic("undo")(undo)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    if (viewportColumnRenderingOffset != null) __obj.updateDynamic("viewportColumnRenderingOffset")(viewportColumnRenderingOffset.asInstanceOf[js.Any])
    if (viewportRowRenderingOffset != null) __obj.updateDynamic("viewportRowRenderingOffset")(viewportRowRenderingOffset.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[GridSettings]
  }
}

