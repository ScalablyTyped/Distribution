package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base table settings that will cascade to columns and cells.
  */
trait GridSettings
  extends handsontableLib.handsontableMod.HandsontableNs.HooksNs.Events {
  var activeHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var allowHtml: js.UndefOr[scala.Boolean] = js.undefined
  var allowInsertColumn: js.UndefOr[scala.Boolean] = js.undefined
  var allowInsertRow: js.UndefOr[scala.Boolean] = js.undefined
  var allowInvalid: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemoveColumn: js.UndefOr[scala.Boolean] = js.undefined
  var allowRemoveRow: js.UndefOr[scala.Boolean] = js.undefined
  var autoColumnSize: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.autoColumnSizeNs.Settings | scala.Boolean
  ] = js.undefined
  var autoRowSize: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.autoRowSizeNs.Settings | scala.Boolean
  ] = js.undefined
  var autoWrapCol: js.UndefOr[scala.Boolean] = js.undefined
  var autoWrapRow: js.UndefOr[scala.Boolean] = js.undefined
  var bindRowsWithHeaders: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableLibStrings.loose | handsontableLib.handsontableLibStrings.strict
  ] = js.undefined
  var cell: js.UndefOr[js.Array[CellSettings]] = js.undefined
  var cells: js.UndefOr[
    js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      CellMeta
    ]
  ] = js.undefined
  var checkedTemplate: js.UndefOr[scala.Boolean | java.lang.String | scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var colHeaders: js.UndefOr[
    scala.Boolean | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String])
  ] = js.undefined
  var colWidths: js.UndefOr[
    scala.Double | js.Array[scala.Double] | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String | scala.Double])
  ] = js.undefined
  var collapsibleColumns: js.UndefOr[
    scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.collapsibleColumnsNs.Settings]
  ] = js.undefined
  var columnHeaderHeight: js.UndefOr[scala.Double | js.Array[js.UndefOr[scala.Double]]] = js.undefined
  var columnSorting: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Settings
  ] = js.undefined
  var columnSummary: js.UndefOr[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs.Settings] | (js.Function0[
      js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs.Settings]
    ])
  ] = js.undefined
  var columns: js.UndefOr[
    js.Array[ColumnSettings] | (js.Function1[/* index */ scala.Double, ColumnSettings])
  ] = js.undefined
  var commentedCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var comments: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.commentsNs.Settings | js.Array[handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentConfig]
  ] = js.undefined
  var contextMenu: js.UndefOr[
    scala.Boolean | (js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey
    ]) | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings
  ] = js.undefined
  var copyPaste: js.UndefOr[scala.Boolean] = js.undefined
  var copyable: js.UndefOr[scala.Boolean] = js.undefined
  var correctFormat: js.UndefOr[scala.Boolean] = js.undefined
  var currentColClassName: js.UndefOr[java.lang.String] = js.undefined
  var currentHeaderClassName: js.UndefOr[java.lang.String] = js.undefined
  var currentRowClassName: js.UndefOr[java.lang.String] = js.undefined
  var customBorders: js.UndefOr[
    scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.customBordersNs.Settings]
  ] = js.undefined
  var data: js.UndefOr[js.Array[js.Array[CellValue]] | js.Array[RowObject]] = js.undefined
  var dataSchema: js.UndefOr[
    RowObject | js.Array[CellValue] | (js.Function1[/* row */ scala.Double, RowObject | js.Array[CellValue]])
  ] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var datePickerConfig: js.UndefOr[pikadayLib.pikadayMod.PikadayOptions] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var defaultDate: js.UndefOr[java.lang.String] = js.undefined
  var disableVisualSelection: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.header | (js.Array[
      handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.header
    ])
  ] = js.undefined
  var dragToScroll: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenu: js.UndefOr[
    scala.Boolean | (js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey
    ]) | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings
  ] = js.undefined
  var editor: js.UndefOr[
    EditorType | (org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ]) | scala.Boolean | java.lang.String
  ] = js.undefined
  var enterBeginsEditing: js.UndefOr[scala.Boolean] = js.undefined
  var enterMoves: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords | (js.Function1[
      /* event */ stdLib.KeyboardEvent, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
    ])
  ] = js.undefined
  var fillHandle: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableLibStrings.vertical | handsontableLib.handsontableLibStrings.horizontal | handsontableLib.handsontableMod.HandsontableNs.autoFillNs.Settings
  ] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filteringCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var filters: js.UndefOr[scala.Boolean] = js.undefined
  var fixedColumnsLeft: js.UndefOr[scala.Double] = js.undefined
  var fixedRowsBottom: js.UndefOr[scala.Double] = js.undefined
  var fixedRowsTop: js.UndefOr[scala.Double] = js.undefined
  var formulas: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.formulasNs.Settings
  ] = js.undefined
  var fragmentSelection: js.UndefOr[scala.Boolean | handsontableLib.handsontableLibStrings.cell] = js.undefined
  var ganttChart: js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ganttChartNs.Settings] = js.undefined
  var headerTooltips: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.headerTooltipsNs.Settings
  ] = js.undefined
  var height: js.UndefOr[
    scala.Double | java.lang.String | (js.Function0[scala.Double | java.lang.String])
  ] = js.undefined
  var hiddenColumns: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.hiddenColumnsNs.Settings
  ] = js.undefined
  var hiddenRows: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.hiddenRowsNs.Settings
  ] = js.undefined
  var invalidCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var isEmptyCol: js.UndefOr[
    js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* col */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var isEmptyRow: js.UndefOr[
    js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var label: js.UndefOr[LabelOptions] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var licenseKey: js.UndefOr[
    java.lang.String | handsontableLib.handsontableLibStrings.`non-commercial-and-evaluation`
  ] = js.undefined
  var manualColumnFreeze: js.UndefOr[scala.Boolean] = js.undefined
  var manualColumnMove: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var manualColumnResize: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var manualRowMove: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var manualRowResize: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var maxCols: js.UndefOr[scala.Double] = js.undefined
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  var mergeCells: js.UndefOr[
    scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.mergeCellsNs.Settings]
  ] = js.undefined
  var minCols: js.UndefOr[scala.Double] = js.undefined
  var minRows: js.UndefOr[scala.Double] = js.undefined
  var minSpareCols: js.UndefOr[scala.Double] = js.undefined
  var minSpareRows: js.UndefOr[scala.Double] = js.undefined
  var multiColumnSorting: js.UndefOr[
    scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.multiColumnSortingNs.Settings
  ] = js.undefined
  var nestedHeaders: js.UndefOr[
    js.Array[
      js.Array[
        java.lang.String | handsontableLib.handsontableMod.HandsontableNs.nestedHeadersNs.NestedHeader
      ]
    ]
  ] = js.undefined
  var nestedRows: js.UndefOr[scala.Boolean] = js.undefined
  var noWordWrapClassName: js.UndefOr[java.lang.String] = js.undefined
  var numericFormat: js.UndefOr[NumericFormatOptions] = js.undefined
  var observeChanges: js.UndefOr[scala.Boolean] = js.undefined
  var observeDOMVisibility: js.UndefOr[scala.Boolean] = js.undefined
  var outsideClickDeselects: js.UndefOr[scala.Boolean | (js.Function1[/* target */ stdLib.HTMLElement, scala.Boolean])] = js.undefined
  var persistentState: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placeholderCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var preventOverflow: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var readOnlyCellClassName: js.UndefOr[java.lang.String] = js.undefined
  var renderAllRows: js.UndefOr[scala.Boolean] = js.undefined
  var renderer: js.UndefOr[
    RendererType | java.lang.String | handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base
  ] = js.undefined
  var rowHeaderWidth: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var rowHeaders: js.UndefOr[
    scala.Boolean | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String])
  ] = js.undefined
  var rowHeights: js.UndefOr[
    scala.Double | js.Array[scala.Double] | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String | scala.Double])
  ] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var selectOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var selectionMode: js.UndefOr[
    handsontableLib.handsontableLibStrings.single | handsontableLib.handsontableLibStrings.range | handsontableLib.handsontableLibStrings.multiple
  ] = js.undefined
  var skipColumnOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  var sortByRelevance: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[
    js.Array[java.lang.String] | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ java.lang.String, 
      /* callback */ js.Function1[/* items */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ])
  ] = js.undefined
  var startCols: js.UndefOr[scala.Double] = js.undefined
  var startRows: js.UndefOr[scala.Double] = js.undefined
  var stretchH: js.UndefOr[
    handsontableLib.handsontableLibStrings.none | handsontableLib.handsontableLibStrings.all | handsontableLib.handsontableLibStrings.last
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var tabMoves: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords | (js.Function1[
      /* event */ stdLib.KeyboardEvent, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
    ])
  ] = js.undefined
  var tableClassName: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trimDropdown: js.UndefOr[scala.Boolean] = js.undefined
  var trimRows: js.UndefOr[scala.Boolean | js.Array[scala.Double]] = js.undefined
  var trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[CellType | java.lang.String] = js.undefined
  var uncheckedTemplate: js.UndefOr[scala.Boolean | java.lang.String | scala.Double] = js.undefined
  var undo: js.UndefOr[scala.Boolean] = js.undefined
  var validator: js.UndefOr[
    handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base | stdLib.RegExp | ValidatorType | java.lang.String
  ] = js.undefined
  var viewportColumnRenderingOffset: js.UndefOr[scala.Double | handsontableLib.handsontableLibStrings.auto] = js.undefined
  var viewportRowRenderingOffset: js.UndefOr[scala.Double | handsontableLib.handsontableLibStrings.auto] = js.undefined
  var visibleRows: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[
    scala.Double | java.lang.String | (js.Function0[scala.Double | java.lang.String])
  ] = js.undefined
  var wordWrap: js.UndefOr[scala.Boolean] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply(
    Events: handsontableLib.handsontableMod.HandsontableNs.HooksNs.Events = null,
    activeHeaderClassName: java.lang.String = null,
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertColumn: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsertRow: js.UndefOr[scala.Boolean] = js.undefined,
    allowInvalid: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemoveColumn: js.UndefOr[scala.Boolean] = js.undefined,
    allowRemoveRow: js.UndefOr[scala.Boolean] = js.undefined,
    autoColumnSize: handsontableLib.handsontableMod.HandsontableNs.autoColumnSizeNs.Settings | scala.Boolean = null,
    autoRowSize: handsontableLib.handsontableMod.HandsontableNs.autoRowSizeNs.Settings | scala.Boolean = null,
    autoWrapCol: js.UndefOr[scala.Boolean] = js.undefined,
    autoWrapRow: js.UndefOr[scala.Boolean] = js.undefined,
    bindRowsWithHeaders: scala.Boolean | handsontableLib.handsontableLibStrings.loose | handsontableLib.handsontableLibStrings.strict = null,
    cell: js.Array[CellSettings] = null,
    cells: js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      CellMeta
    ] = null,
    checkedTemplate: scala.Boolean | java.lang.String | scala.Double = null,
    className: java.lang.String | js.Array[java.lang.String] = null,
    colHeaders: scala.Boolean | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String]) = null,
    colWidths: scala.Double | js.Array[scala.Double] | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String | scala.Double]) = null,
    collapsibleColumns: scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.collapsibleColumnsNs.Settings] = null,
    columnHeaderHeight: scala.Double | js.Array[js.UndefOr[scala.Double]] = null,
    columnSorting: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Settings = null,
    columnSummary: js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs.Settings] | (js.Function0[
      js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSummaryNs.Settings]
    ]) = null,
    columns: js.Array[ColumnSettings] | (js.Function1[/* index */ scala.Double, ColumnSettings]) = null,
    commentedCellClassName: java.lang.String = null,
    comments: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.commentsNs.Settings | js.Array[handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentConfig] = null,
    contextMenu: scala.Boolean | (js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey
    ]) | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings = null,
    copyPaste: js.UndefOr[scala.Boolean] = js.undefined,
    copyable: js.UndefOr[scala.Boolean] = js.undefined,
    correctFormat: js.UndefOr[scala.Boolean] = js.undefined,
    currentColClassName: java.lang.String = null,
    currentHeaderClassName: java.lang.String = null,
    currentRowClassName: java.lang.String = null,
    customBorders: scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.customBordersNs.Settings] = null,
    data: js.Array[js.Array[CellValue]] | js.Array[RowObject] = null,
    dataSchema: RowObject | js.Array[CellValue] | (js.Function1[/* row */ scala.Double, RowObject | js.Array[CellValue]]) = null,
    dateFormat: java.lang.String = null,
    datePickerConfig: pikadayLib.pikadayMod.PikadayOptions = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    defaultDate: java.lang.String = null,
    disableVisualSelection: scala.Boolean | handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.header | (js.Array[
      handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.header
    ]) = null,
    dragToScroll: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownMenu: scala.Boolean | (js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey
    ]) | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.Settings = null,
    editor: EditorType | (org.scalablytyped.runtime.Instantiable6[
      /* hotInstance */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base
    ]) | scala.Boolean | java.lang.String = null,
    enterBeginsEditing: js.UndefOr[scala.Boolean] = js.undefined,
    enterMoves: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords | (js.Function1[
      /* event */ stdLib.KeyboardEvent, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
    ]) = null,
    fillHandle: scala.Boolean | handsontableLib.handsontableLibStrings.vertical | handsontableLib.handsontableLibStrings.horizontal | handsontableLib.handsontableMod.HandsontableNs.autoFillNs.Settings = null,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filteringCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    filters: js.UndefOr[scala.Boolean] = js.undefined,
    fixedColumnsLeft: scala.Int | scala.Double = null,
    fixedRowsBottom: scala.Int | scala.Double = null,
    fixedRowsTop: scala.Int | scala.Double = null,
    formulas: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.formulasNs.Settings = null,
    fragmentSelection: scala.Boolean | handsontableLib.handsontableLibStrings.cell = null,
    ganttChart: handsontableLib.handsontableMod.HandsontableNs.ganttChartNs.Settings = null,
    headerTooltips: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.headerTooltipsNs.Settings = null,
    height: scala.Double | java.lang.String | (js.Function0[scala.Double | java.lang.String]) = null,
    hiddenColumns: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.hiddenColumnsNs.Settings = null,
    hiddenRows: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.hiddenRowsNs.Settings = null,
    invalidCellClassName: java.lang.String = null,
    isEmptyCol: js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* col */ scala.Double, 
      scala.Boolean
    ] = null,
    isEmptyRow: js.ThisFunction1[
      /* this */ handsontableLib.handsontableMod.underscoreHandsontableNs.Core, 
      /* row */ scala.Double, 
      scala.Boolean
    ] = null,
    label: LabelOptions = null,
    language: java.lang.String = null,
    licenseKey: java.lang.String | handsontableLib.handsontableLibStrings.`non-commercial-and-evaluation` = null,
    manualColumnFreeze: js.UndefOr[scala.Boolean] = js.undefined,
    manualColumnMove: scala.Boolean | js.Array[scala.Double] = null,
    manualColumnResize: scala.Boolean | js.Array[scala.Double] = null,
    manualRowMove: scala.Boolean | js.Array[scala.Double] = null,
    manualRowResize: scala.Boolean | js.Array[scala.Double] = null,
    maxCols: scala.Int | scala.Double = null,
    maxRows: scala.Int | scala.Double = null,
    mergeCells: scala.Boolean | js.Array[handsontableLib.handsontableMod.HandsontableNs.mergeCellsNs.Settings] = null,
    minCols: scala.Int | scala.Double = null,
    minRows: scala.Int | scala.Double = null,
    minSpareCols: scala.Int | scala.Double = null,
    minSpareRows: scala.Int | scala.Double = null,
    multiColumnSorting: scala.Boolean | handsontableLib.handsontableMod.HandsontableNs.multiColumnSortingNs.Settings = null,
    nestedHeaders: js.Array[
      js.Array[
        java.lang.String | handsontableLib.handsontableMod.HandsontableNs.nestedHeadersNs.NestedHeader
      ]
    ] = null,
    nestedRows: js.UndefOr[scala.Boolean] = js.undefined,
    noWordWrapClassName: java.lang.String = null,
    numericFormat: NumericFormatOptions = null,
    observeChanges: js.UndefOr[scala.Boolean] = js.undefined,
    observeDOMVisibility: js.UndefOr[scala.Boolean] = js.undefined,
    outsideClickDeselects: scala.Boolean | (js.Function1[/* target */ stdLib.HTMLElement, scala.Boolean]) = null,
    persistentState: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    placeholderCellClassName: java.lang.String = null,
    preventOverflow: java.lang.String | scala.Boolean = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    readOnlyCellClassName: java.lang.String = null,
    renderAllRows: js.UndefOr[scala.Boolean] = js.undefined,
    renderer: RendererType | java.lang.String | handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = null,
    rowHeaderWidth: scala.Double | js.Array[scala.Double] = null,
    rowHeaders: scala.Boolean | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String]) = null,
    rowHeights: scala.Double | js.Array[scala.Double] | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* index */ scala.Double, java.lang.String | scala.Double]) = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    selectOptions: js.Array[java.lang.String] = null,
    selectionMode: handsontableLib.handsontableLibStrings.single | handsontableLib.handsontableLibStrings.range | handsontableLib.handsontableLibStrings.multiple = null,
    skipColumnOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    sortByRelevance: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Array[java.lang.String] | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ java.lang.String, 
      /* callback */ js.Function1[/* items */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]) = null,
    startCols: scala.Int | scala.Double = null,
    startRows: scala.Int | scala.Double = null,
    stretchH: handsontableLib.handsontableLibStrings.none | handsontableLib.handsontableLibStrings.all | handsontableLib.handsontableLibStrings.last = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    tabMoves: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords | (js.Function1[
      /* event */ stdLib.KeyboardEvent, 
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords
    ]) = null,
    tableClassName: java.lang.String | js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    trimDropdown: js.UndefOr[scala.Boolean] = js.undefined,
    trimRows: scala.Boolean | js.Array[scala.Double] = null,
    trimWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: CellType | java.lang.String = null,
    uncheckedTemplate: scala.Boolean | java.lang.String | scala.Double = null,
    undo: js.UndefOr[scala.Boolean] = js.undefined,
    validator: handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base | stdLib.RegExp | ValidatorType | java.lang.String = null,
    viewportColumnRenderingOffset: scala.Double | handsontableLib.handsontableLibStrings.auto = null,
    viewportRowRenderingOffset: scala.Double | handsontableLib.handsontableLibStrings.auto = null,
    visibleRows: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String | (js.Function0[scala.Double | java.lang.String]) = null,
    wordWrap: js.UndefOr[scala.Boolean] = js.undefined
  ): GridSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Events)
    if (activeHeaderClassName != null) __obj.updateDynamic("activeHeaderClassName")(activeHeaderClassName)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(allowInsertColumn)) __obj.updateDynamic("allowInsertColumn")(allowInsertColumn)
    if (!js.isUndefined(allowInsertRow)) __obj.updateDynamic("allowInsertRow")(allowInsertRow)
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid)
    if (!js.isUndefined(allowRemoveColumn)) __obj.updateDynamic("allowRemoveColumn")(allowRemoveColumn)
    if (!js.isUndefined(allowRemoveRow)) __obj.updateDynamic("allowRemoveRow")(allowRemoveRow)
    if (autoColumnSize != null) __obj.updateDynamic("autoColumnSize")(autoColumnSize.asInstanceOf[js.Any])
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
    if (columnSummary != null) __obj.updateDynamic("columnSummary")(columnSummary.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (commentedCellClassName != null) __obj.updateDynamic("commentedCellClassName")(commentedCellClassName)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(copyPaste)) __obj.updateDynamic("copyPaste")(copyPaste)
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable)
    if (!js.isUndefined(correctFormat)) __obj.updateDynamic("correctFormat")(correctFormat)
    if (currentColClassName != null) __obj.updateDynamic("currentColClassName")(currentColClassName)
    if (currentHeaderClassName != null) __obj.updateDynamic("currentHeaderClassName")(currentHeaderClassName)
    if (currentRowClassName != null) __obj.updateDynamic("currentRowClassName")(currentRowClassName)
    if (customBorders != null) __obj.updateDynamic("customBorders")(customBorders.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSchema != null) __obj.updateDynamic("dataSchema")(dataSchema.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (datePickerConfig != null) __obj.updateDynamic("datePickerConfig")(datePickerConfig)
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
    if (formulas != null) __obj.updateDynamic("formulas")(formulas.asInstanceOf[js.Any])
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
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
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
    if (!js.isUndefined(nestedRows)) __obj.updateDynamic("nestedRows")(nestedRows)
    if (noWordWrapClassName != null) __obj.updateDynamic("noWordWrapClassName")(noWordWrapClassName)
    if (numericFormat != null) __obj.updateDynamic("numericFormat")(numericFormat)
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges)
    if (!js.isUndefined(observeDOMVisibility)) __obj.updateDynamic("observeDOMVisibility")(observeDOMVisibility)
    if (outsideClickDeselects != null) __obj.updateDynamic("outsideClickDeselects")(outsideClickDeselects.asInstanceOf[js.Any])
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
    if (stretchH != null) __obj.updateDynamic("stretchH")(stretchH.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (tabMoves != null) __obj.updateDynamic("tabMoves")(tabMoves.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(trimDropdown)) __obj.updateDynamic("trimDropdown")(trimDropdown)
    if (trimRows != null) __obj.updateDynamic("trimRows")(trimRows.asInstanceOf[js.Any])
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uncheckedTemplate != null) __obj.updateDynamic("uncheckedTemplate")(uncheckedTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(undo)) __obj.updateDynamic("undo")(undo)
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (viewportColumnRenderingOffset != null) __obj.updateDynamic("viewportColumnRenderingOffset")(viewportColumnRenderingOffset.asInstanceOf[js.Any])
    if (viewportRowRenderingOffset != null) __obj.updateDynamic("viewportRowRenderingOffset")(viewportRowRenderingOffset.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[GridSettings]
  }
}

