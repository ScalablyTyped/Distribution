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

