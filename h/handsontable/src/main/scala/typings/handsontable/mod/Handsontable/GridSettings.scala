package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable6
import typings.handsontable.handsontableStrings.`non-commercial-and-evaluation`
import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.area
import typings.handsontable.handsontableStrings.auto
import typings.handsontable.handsontableStrings.cell
import typings.handsontable.handsontableStrings.current
import typings.handsontable.handsontableStrings.header
import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.loose
import typings.handsontable.handsontableStrings.multiple
import typings.handsontable.handsontableStrings.none
import typings.handsontable.handsontableStrings.range
import typings.handsontable.handsontableStrings.single
import typings.handsontable.handsontableStrings.strict
import typings.handsontable.handsontableStrings.vertical
import typings.handsontable.mod.Handsontable.Hooks.Events
import typings.handsontable.mod.Handsontable._editors.Base
import typings.handsontable.mod.Handsontable.autoColumnSize.Settings
import typings.handsontable.mod.Handsontable.comments.CommentConfig
import typings.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typings.handsontable.mod.Handsontable.nestedHeaders.NestedHeader
import typings.handsontable.mod.Handsontable.wot.CellCoords
import typings.handsontable.mod._Handsontable.Core
import typings.pikaday.mod.PikadayOptions
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import typings.std.KeyboardEvent
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base table settings that will cascade to columns and cells.
  */
trait GridSettings extends Events {
  var activeHeaderClassName: js.UndefOr[String] = js.undefined
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var allowInsertColumn: js.UndefOr[Boolean] = js.undefined
  var allowInsertRow: js.UndefOr[Boolean] = js.undefined
  var allowInvalid: js.UndefOr[Boolean] = js.undefined
  var allowRemoveColumn: js.UndefOr[Boolean] = js.undefined
  var allowRemoveRow: js.UndefOr[Boolean] = js.undefined
  var autoColumnSize: js.UndefOr[Settings | Boolean] = js.undefined
  var autoRowSize: js.UndefOr[typings.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean] = js.undefined
  var autoWrapCol: js.UndefOr[Boolean] = js.undefined
  var autoWrapRow: js.UndefOr[Boolean] = js.undefined
  var bindRowsWithHeaders: js.UndefOr[Boolean | loose | strict] = js.undefined
  var cell: js.UndefOr[js.Array[CellSettings]] = js.undefined
  var cells: js.UndefOr[
    js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      CellMeta
    ]
  ] = js.undefined
  var checkedTemplate: js.UndefOr[Boolean | String | Double] = js.undefined
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  var colHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.undefined
  var colWidths: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.undefined
  var collapsibleColumns: js.UndefOr[
    Boolean | js.Array[typings.handsontable.mod.Handsontable.collapsibleColumns.Settings]
  ] = js.undefined
  var columnHeaderHeight: js.UndefOr[Double | js.Array[js.UndefOr[Double]]] = js.undefined
  var columnSorting: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.columnSorting.Settings] = js.undefined
  var columnSummary: js.UndefOr[
    js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]]
  ] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])] = js.undefined
  var commentedCellClassName: js.UndefOr[String] = js.undefined
  var comments: js.UndefOr[
    Boolean | typings.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]
  ] = js.undefined
  var contextMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.undefined
  var copyPaste: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.copyPaste.Settings] = js.undefined
  var copyable: js.UndefOr[Boolean] = js.undefined
  var correctFormat: js.UndefOr[Boolean] = js.undefined
  var currentColClassName: js.UndefOr[String] = js.undefined
  var currentHeaderClassName: js.UndefOr[String] = js.undefined
  var currentRowClassName: js.UndefOr[String] = js.undefined
  var customBorders: js.UndefOr[Boolean | js.Array[typings.handsontable.mod.Handsontable.customBorders.Settings]] = js.undefined
  var data: js.UndefOr[js.Array[js.Array[CellValue] | RowObject]] = js.undefined
  var dataSchema: js.UndefOr[
    RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
  ] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var datePickerConfig: js.UndefOr[PikadayOptions] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var defaultDate: js.UndefOr[String] = js.undefined
  var disableVisualSelection: js.UndefOr[Boolean | current | area | header | (js.Array[current | area | header])] = js.undefined
  var dragToScroll: js.UndefOr[Boolean] = js.undefined
  var dropdownMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.undefined
  var editor: js.UndefOr[
    EditorType | (Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) | Boolean | String
  ] = js.undefined
  var enterBeginsEditing: js.UndefOr[Boolean] = js.undefined
  var enterMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.undefined
  var fillHandle: js.UndefOr[
    Boolean | vertical | horizontal | typings.handsontable.mod.Handsontable.autoFill.Settings
  ] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filteringCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[Boolean] = js.undefined
  var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
  var fixedRowsBottom: js.UndefOr[Double] = js.undefined
  var fixedRowsTop: js.UndefOr[Double] = js.undefined
  var formulas: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.formulas.Settings] = js.undefined
  var fragmentSelection: js.UndefOr[Boolean | cell] = js.undefined
  var ganttChart: js.UndefOr[typings.handsontable.mod.Handsontable.ganttChart.Settings] = js.undefined
  var headerTooltips: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings] = js.undefined
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  var hiddenColumns: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings] = js.undefined
  var hiddenRows: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings] = js.undefined
  var invalidCellClassName: js.UndefOr[String] = js.undefined
  var isEmptyCol: js.UndefOr[js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean]] = js.undefined
  var isEmptyRow: js.UndefOr[js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean]] = js.undefined
  var label: js.UndefOr[LabelOptions] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var licenseKey: js.UndefOr[String | `non-commercial-and-evaluation`] = js.undefined
  var manualColumnFreeze: js.UndefOr[Boolean] = js.undefined
  var manualColumnMove: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var manualColumnResize: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var manualRowMove: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var manualRowResize: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var maxCols: js.UndefOr[Double] = js.undefined
  var maxRows: js.UndefOr[Double] = js.undefined
  var mergeCells: js.UndefOr[Boolean | js.Array[typings.handsontable.mod.Handsontable.mergeCells.Settings]] = js.undefined
  var minCols: js.UndefOr[Double] = js.undefined
  var minRows: js.UndefOr[Double] = js.undefined
  var minSpareCols: js.UndefOr[Double] = js.undefined
  var minSpareRows: js.UndefOr[Double] = js.undefined
  var multiColumnSorting: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.multiColumnSorting.Settings] = js.undefined
  var nestedHeaders: js.UndefOr[js.Array[js.Array[String | NestedHeader]]] = js.undefined
  var nestedRows: js.UndefOr[Boolean] = js.undefined
  var noWordWrapClassName: js.UndefOr[String] = js.undefined
  var numericFormat: js.UndefOr[NumericFormatOptions] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var observeDOMVisibility: js.UndefOr[Boolean] = js.undefined
  var outsideClickDeselects: js.UndefOr[Boolean | (js.Function1[/* target */ HTMLElement, Boolean])] = js.undefined
  var persistentState: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderCellClassName: js.UndefOr[String] = js.undefined
  var preventOverflow: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
  var preventWheel: js.UndefOr[Boolean] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var readOnlyCellClassName: js.UndefOr[String] = js.undefined
  var renderAllRows: js.UndefOr[Boolean] = js.undefined
  var renderer: js.UndefOr[RendererType | String | typings.handsontable.mod.Handsontable.renderers.Base] = js.undefined
  var rowHeaderWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var rowHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.undefined
  var rowHeights: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.undefined
  var search: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.search.Settings] = js.undefined
  var selectOptions: js.UndefOr[js.Array[String]] = js.undefined
  var selectionMode: js.UndefOr[single | range | multiple] = js.undefined
  var skipColumnOnPaste: js.UndefOr[Boolean] = js.undefined
  var sortByRelevance: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[
    (js.Array[Double | String]) | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ String, 
      /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
      Unit
    ])
  ] = js.undefined
  var startCols: js.UndefOr[Double] = js.undefined
  var startRows: js.UndefOr[Double] = js.undefined
  var stretchH: js.UndefOr[none | all | last] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var tabMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.undefined
  var tableClassName: js.UndefOr[String | js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trimDropdown: js.UndefOr[Boolean] = js.undefined
  var trimRows: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  var trimWhitespace: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[CellType | String] = js.undefined
  var uncheckedTemplate: js.UndefOr[Boolean | String | Double] = js.undefined
  var undo: js.UndefOr[Boolean] = js.undefined
  var validator: js.UndefOr[
    typings.handsontable.mod.Handsontable.validators.Base | RegExp | ValidatorType | String
  ] = js.undefined
  var viewportColumnRenderingOffset: js.UndefOr[Double | auto] = js.undefined
  var viewportRowRenderingOffset: js.UndefOr[Double | auto] = js.undefined
  var visibleRows: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object GridSettings {
  @scala.inline
  def apply(
    Events: Events = null,
    activeHeaderClassName: String = null,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    allowInsertColumn: js.UndefOr[Boolean] = js.undefined,
    allowInsertRow: js.UndefOr[Boolean] = js.undefined,
    allowInvalid: js.UndefOr[Boolean] = js.undefined,
    allowRemoveColumn: js.UndefOr[Boolean] = js.undefined,
    allowRemoveRow: js.UndefOr[Boolean] = js.undefined,
    autoColumnSize: Settings | Boolean = null,
    autoRowSize: typings.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean = null,
    autoWrapCol: js.UndefOr[Boolean] = js.undefined,
    autoWrapRow: js.UndefOr[Boolean] = js.undefined,
    bindRowsWithHeaders: Boolean | loose | strict = null,
    cell: js.Array[CellSettings] = null,
    cells: js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      CellMeta
    ] = null,
    checkedTemplate: Boolean | String | Double = null,
    className: String | js.Array[String] = null,
    colHeaders: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String]) = null,
    colWidths: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double]) = null,
    collapsibleColumns: Boolean | js.Array[typings.handsontable.mod.Handsontable.collapsibleColumns.Settings] = null,
    columnHeaderHeight: Double | js.Array[js.UndefOr[Double]] = null,
    columnSorting: Boolean | typings.handsontable.mod.Handsontable.columnSorting.Settings = null,
    columnSummary: js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]] = null,
    columns: js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings]) = null,
    commentedCellClassName: String = null,
    comments: Boolean | typings.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig] = null,
    contextMenu: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings = null,
    copyPaste: Boolean | typings.handsontable.mod.Handsontable.copyPaste.Settings = null,
    copyable: js.UndefOr[Boolean] = js.undefined,
    correctFormat: js.UndefOr[Boolean] = js.undefined,
    currentColClassName: String = null,
    currentHeaderClassName: String = null,
    currentRowClassName: String = null,
    customBorders: Boolean | js.Array[typings.handsontable.mod.Handsontable.customBorders.Settings] = null,
    data: js.Array[js.Array[CellValue] | RowObject] = null,
    dataSchema: RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]]) = null,
    dateFormat: String = null,
    datePickerConfig: PikadayOptions = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultDate: String = null,
    disableVisualSelection: Boolean | current | area | header | (js.Array[current | area | header]) = null,
    dragToScroll: js.UndefOr[Boolean] = js.undefined,
    dropdownMenu: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings = null,
    editor: EditorType | (Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) | Boolean | String = null,
    enterBeginsEditing: js.UndefOr[Boolean] = js.undefined,
    enterMoves: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords]) = null,
    fillHandle: Boolean | vertical | horizontal | typings.handsontable.mod.Handsontable.autoFill.Settings = null,
    filter: js.UndefOr[Boolean] = js.undefined,
    filteringCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    filters: js.UndefOr[Boolean] = js.undefined,
    fixedColumnsLeft: Int | Double = null,
    fixedRowsBottom: Int | Double = null,
    fixedRowsTop: Int | Double = null,
    formulas: Boolean | typings.handsontable.mod.Handsontable.formulas.Settings = null,
    fragmentSelection: Boolean | cell = null,
    ganttChart: typings.handsontable.mod.Handsontable.ganttChart.Settings = null,
    headerTooltips: Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hiddenColumns: Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings = null,
    hiddenRows: Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings = null,
    invalidCellClassName: String = null,
    isEmptyCol: js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean] = null,
    isEmptyRow: js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean] = null,
    label: LabelOptions = null,
    language: String = null,
    licenseKey: String | `non-commercial-and-evaluation` = null,
    manualColumnFreeze: js.UndefOr[Boolean] = js.undefined,
    manualColumnMove: Boolean | js.Array[Double] = null,
    manualColumnResize: Boolean | js.Array[Double] = null,
    manualRowMove: Boolean | js.Array[Double] = null,
    manualRowResize: Boolean | js.Array[Double] = null,
    maxCols: Int | Double = null,
    maxRows: Int | Double = null,
    mergeCells: Boolean | js.Array[typings.handsontable.mod.Handsontable.mergeCells.Settings] = null,
    minCols: Int | Double = null,
    minRows: Int | Double = null,
    minSpareCols: Int | Double = null,
    minSpareRows: Int | Double = null,
    multiColumnSorting: Boolean | typings.handsontable.mod.Handsontable.multiColumnSorting.Settings = null,
    nestedHeaders: js.Array[js.Array[String | NestedHeader]] = null,
    nestedRows: js.UndefOr[Boolean] = js.undefined,
    noWordWrapClassName: String = null,
    numericFormat: NumericFormatOptions = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    observeDOMVisibility: js.UndefOr[Boolean] = js.undefined,
    outsideClickDeselects: Boolean | (js.Function1[/* target */ HTMLElement, Boolean]) = null,
    persistentState: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    placeholderCellClassName: String = null,
    preventOverflow: Boolean | vertical | horizontal = null,
    preventWheel: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    readOnlyCellClassName: String = null,
    renderAllRows: js.UndefOr[Boolean] = js.undefined,
    renderer: RendererType | String | typings.handsontable.mod.Handsontable.renderers.Base = null,
    rowHeaderWidth: Double | js.Array[Double] = null,
    rowHeaders: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String]) = null,
    rowHeights: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double]) = null,
    search: Boolean | typings.handsontable.mod.Handsontable.search.Settings = null,
    selectOptions: js.Array[String] = null,
    selectionMode: single | range | multiple = null,
    skipColumnOnPaste: js.UndefOr[Boolean] = js.undefined,
    sortByRelevance: js.UndefOr[Boolean] = js.undefined,
    source: (js.Array[Double | String]) | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ String, 
      /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
      Unit
    ]) = null,
    startCols: Int | Double = null,
    startRows: Int | Double = null,
    stretchH: none | all | last = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    tabMoves: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords]) = null,
    tableClassName: String | js.Array[String] = null,
    title: String = null,
    trimDropdown: js.UndefOr[Boolean] = js.undefined,
    trimRows: Boolean | js.Array[Double] = null,
    trimWhitespace: js.UndefOr[Boolean] = js.undefined,
    `type`: CellType | String = null,
    uncheckedTemplate: Boolean | String | Double = null,
    undo: js.UndefOr[Boolean] = js.undefined,
    validator: typings.handsontable.mod.Handsontable.validators.Base | RegExp | ValidatorType | String = null,
    viewportColumnRenderingOffset: Double | auto = null,
    viewportRowRenderingOffset: Double | auto = null,
    visibleRows: Int | Double = null,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): GridSettings = {
    val __obj = js.Dynamic.literal()
    if (Events != null) js.Dynamic.global.Object.assign(__obj, Events)
    if (activeHeaderClassName != null) __obj.updateDynamic("activeHeaderClassName")(activeHeaderClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertColumn)) __obj.updateDynamic("allowInsertColumn")(allowInsertColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertRow)) __obj.updateDynamic("allowInsertRow")(allowInsertRow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInvalid)) __obj.updateDynamic("allowInvalid")(allowInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRemoveColumn)) __obj.updateDynamic("allowRemoveColumn")(allowRemoveColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRemoveRow)) __obj.updateDynamic("allowRemoveRow")(allowRemoveRow.asInstanceOf[js.Any])
    if (autoColumnSize != null) __obj.updateDynamic("autoColumnSize")(autoColumnSize.asInstanceOf[js.Any])
    if (autoRowSize != null) __obj.updateDynamic("autoRowSize")(autoRowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWrapCol)) __obj.updateDynamic("autoWrapCol")(autoWrapCol.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWrapRow)) __obj.updateDynamic("autoWrapRow")(autoWrapRow.asInstanceOf[js.Any])
    if (bindRowsWithHeaders != null) __obj.updateDynamic("bindRowsWithHeaders")(bindRowsWithHeaders.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (checkedTemplate != null) __obj.updateDynamic("checkedTemplate")(checkedTemplate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colHeaders != null) __obj.updateDynamic("colHeaders")(colHeaders.asInstanceOf[js.Any])
    if (colWidths != null) __obj.updateDynamic("colWidths")(colWidths.asInstanceOf[js.Any])
    if (collapsibleColumns != null) __obj.updateDynamic("collapsibleColumns")(collapsibleColumns.asInstanceOf[js.Any])
    if (columnHeaderHeight != null) __obj.updateDynamic("columnHeaderHeight")(columnHeaderHeight.asInstanceOf[js.Any])
    if (columnSorting != null) __obj.updateDynamic("columnSorting")(columnSorting.asInstanceOf[js.Any])
    if (columnSummary != null) __obj.updateDynamic("columnSummary")(columnSummary.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (commentedCellClassName != null) __obj.updateDynamic("commentedCellClassName")(commentedCellClassName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (copyPaste != null) __obj.updateDynamic("copyPaste")(copyPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(copyable)) __obj.updateDynamic("copyable")(copyable.asInstanceOf[js.Any])
    if (!js.isUndefined(correctFormat)) __obj.updateDynamic("correctFormat")(correctFormat.asInstanceOf[js.Any])
    if (currentColClassName != null) __obj.updateDynamic("currentColClassName")(currentColClassName.asInstanceOf[js.Any])
    if (currentHeaderClassName != null) __obj.updateDynamic("currentHeaderClassName")(currentHeaderClassName.asInstanceOf[js.Any])
    if (currentRowClassName != null) __obj.updateDynamic("currentRowClassName")(currentRowClassName.asInstanceOf[js.Any])
    if (customBorders != null) __obj.updateDynamic("customBorders")(customBorders.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataSchema != null) __obj.updateDynamic("dataSchema")(dataSchema.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (datePickerConfig != null) __obj.updateDynamic("datePickerConfig")(datePickerConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (disableVisualSelection != null) __obj.updateDynamic("disableVisualSelection")(disableVisualSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(dragToScroll)) __obj.updateDynamic("dragToScroll")(dragToScroll.asInstanceOf[js.Any])
    if (dropdownMenu != null) __obj.updateDynamic("dropdownMenu")(dropdownMenu.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (!js.isUndefined(enterBeginsEditing)) __obj.updateDynamic("enterBeginsEditing")(enterBeginsEditing.asInstanceOf[js.Any])
    if (enterMoves != null) __obj.updateDynamic("enterMoves")(enterMoves.asInstanceOf[js.Any])
    if (fillHandle != null) __obj.updateDynamic("fillHandle")(fillHandle.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(filteringCaseSensitive)) __obj.updateDynamic("filteringCaseSensitive")(filteringCaseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(filters)) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fixedColumnsLeft != null) __obj.updateDynamic("fixedColumnsLeft")(fixedColumnsLeft.asInstanceOf[js.Any])
    if (fixedRowsBottom != null) __obj.updateDynamic("fixedRowsBottom")(fixedRowsBottom.asInstanceOf[js.Any])
    if (fixedRowsTop != null) __obj.updateDynamic("fixedRowsTop")(fixedRowsTop.asInstanceOf[js.Any])
    if (formulas != null) __obj.updateDynamic("formulas")(formulas.asInstanceOf[js.Any])
    if (fragmentSelection != null) __obj.updateDynamic("fragmentSelection")(fragmentSelection.asInstanceOf[js.Any])
    if (ganttChart != null) __obj.updateDynamic("ganttChart")(ganttChart.asInstanceOf[js.Any])
    if (headerTooltips != null) __obj.updateDynamic("headerTooltips")(headerTooltips.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hiddenColumns != null) __obj.updateDynamic("hiddenColumns")(hiddenColumns.asInstanceOf[js.Any])
    if (hiddenRows != null) __obj.updateDynamic("hiddenRows")(hiddenRows.asInstanceOf[js.Any])
    if (invalidCellClassName != null) __obj.updateDynamic("invalidCellClassName")(invalidCellClassName.asInstanceOf[js.Any])
    if (isEmptyCol != null) __obj.updateDynamic("isEmptyCol")(isEmptyCol.asInstanceOf[js.Any])
    if (isEmptyRow != null) __obj.updateDynamic("isEmptyRow")(isEmptyRow.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
    if (!js.isUndefined(manualColumnFreeze)) __obj.updateDynamic("manualColumnFreeze")(manualColumnFreeze.asInstanceOf[js.Any])
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
    if (nestedHeaders != null) __obj.updateDynamic("nestedHeaders")(nestedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(nestedRows)) __obj.updateDynamic("nestedRows")(nestedRows.asInstanceOf[js.Any])
    if (noWordWrapClassName != null) __obj.updateDynamic("noWordWrapClassName")(noWordWrapClassName.asInstanceOf[js.Any])
    if (numericFormat != null) __obj.updateDynamic("numericFormat")(numericFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(observeDOMVisibility)) __obj.updateDynamic("observeDOMVisibility")(observeDOMVisibility.asInstanceOf[js.Any])
    if (outsideClickDeselects != null) __obj.updateDynamic("outsideClickDeselects")(outsideClickDeselects.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentState)) __obj.updateDynamic("persistentState")(persistentState.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderCellClassName != null) __obj.updateDynamic("placeholderCellClassName")(placeholderCellClassName.asInstanceOf[js.Any])
    if (preventOverflow != null) __obj.updateDynamic("preventOverflow")(preventOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(preventWheel)) __obj.updateDynamic("preventWheel")(preventWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (readOnlyCellClassName != null) __obj.updateDynamic("readOnlyCellClassName")(readOnlyCellClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAllRows)) __obj.updateDynamic("renderAllRows")(renderAllRows.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (rowHeaderWidth != null) __obj.updateDynamic("rowHeaderWidth")(rowHeaderWidth.asInstanceOf[js.Any])
    if (rowHeaders != null) __obj.updateDynamic("rowHeaders")(rowHeaders.asInstanceOf[js.Any])
    if (rowHeights != null) __obj.updateDynamic("rowHeights")(rowHeights.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (selectOptions != null) __obj.updateDynamic("selectOptions")(selectOptions.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipColumnOnPaste)) __obj.updateDynamic("skipColumnOnPaste")(skipColumnOnPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByRelevance)) __obj.updateDynamic("sortByRelevance")(sortByRelevance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startCols != null) __obj.updateDynamic("startCols")(startCols.asInstanceOf[js.Any])
    if (startRows != null) __obj.updateDynamic("startRows")(startRows.asInstanceOf[js.Any])
    if (stretchH != null) __obj.updateDynamic("stretchH")(stretchH.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tabMoves != null) __obj.updateDynamic("tabMoves")(tabMoves.asInstanceOf[js.Any])
    if (tableClassName != null) __obj.updateDynamic("tableClassName")(tableClassName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(trimDropdown)) __obj.updateDynamic("trimDropdown")(trimDropdown.asInstanceOf[js.Any])
    if (trimRows != null) __obj.updateDynamic("trimRows")(trimRows.asInstanceOf[js.Any])
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uncheckedTemplate != null) __obj.updateDynamic("uncheckedTemplate")(uncheckedTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(undo)) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    if (viewportColumnRenderingOffset != null) __obj.updateDynamic("viewportColumnRenderingOffset")(viewportColumnRenderingOffset.asInstanceOf[js.Any])
    if (viewportRowRenderingOffset != null) __obj.updateDynamic("viewportRowRenderingOffset")(viewportRowRenderingOffset.asInstanceOf[js.Any])
    if (visibleRows != null) __obj.updateDynamic("visibleRows")(visibleRows.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSettings]
  }
}

