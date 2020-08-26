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
@js.native
trait GridSettings extends Events {
  var activeHeaderClassName: js.UndefOr[String] = js.native
  var allowEmpty: js.UndefOr[Boolean] = js.native
  var allowHtml: js.UndefOr[Boolean] = js.native
  var allowInsertColumn: js.UndefOr[Boolean] = js.native
  var allowInsertRow: js.UndefOr[Boolean] = js.native
  var allowInvalid: js.UndefOr[Boolean] = js.native
  var allowRemoveColumn: js.UndefOr[Boolean] = js.native
  var allowRemoveRow: js.UndefOr[Boolean] = js.native
  var autoColumnSize: js.UndefOr[Settings | Boolean] = js.native
  var autoRowSize: js.UndefOr[typings.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean] = js.native
  var autoWrapCol: js.UndefOr[Boolean] = js.native
  var autoWrapRow: js.UndefOr[Boolean] = js.native
  var bindRowsWithHeaders: js.UndefOr[Boolean | loose | strict] = js.native
  var cell: js.UndefOr[js.Array[CellSettings]] = js.native
  var cells: js.UndefOr[
    js.ThisFunction3[
      /* this */ CellProperties, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      CellMeta
    ]
  ] = js.native
  var checkedTemplate: js.UndefOr[Boolean | String | Double] = js.native
  var className: js.UndefOr[String | js.Array[String]] = js.native
  var colHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.native
  var colWidths: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.native
  var collapsibleColumns: js.UndefOr[
    Boolean | js.Array[typings.handsontable.mod.Handsontable.collapsibleColumns.Settings]
  ] = js.native
  var columnHeaderHeight: js.UndefOr[Double | js.Array[js.UndefOr[Double]]] = js.native
  var columnSorting: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.columnSorting.Settings] = js.native
  var columnSummary: js.UndefOr[
    js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]]
  ] = js.native
  var columns: js.UndefOr[js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])] = js.native
  var commentedCellClassName: js.UndefOr[String] = js.native
  var comments: js.UndefOr[
    Boolean | typings.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]
  ] = js.native
  var contextMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.native
  var copyPaste: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.copyPaste.Settings] = js.native
  var copyable: js.UndefOr[Boolean] = js.native
  var correctFormat: js.UndefOr[Boolean] = js.native
  var currentColClassName: js.UndefOr[String] = js.native
  var currentHeaderClassName: js.UndefOr[String] = js.native
  var currentRowClassName: js.UndefOr[String] = js.native
  var customBorders: js.UndefOr[Boolean | js.Array[typings.handsontable.mod.Handsontable.customBorders.Settings]] = js.native
  var data: js.UndefOr[js.Array[js.Array[CellValue] | RowObject]] = js.native
  var dataSchema: js.UndefOr[
    RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
  ] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var datePickerConfig: js.UndefOr[PikadayOptions] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var defaultDate: js.UndefOr[String] = js.native
  var disableVisualSelection: js.UndefOr[Boolean | current | area | header | (js.Array[current | area | header])] = js.native
  var dragToScroll: js.UndefOr[Boolean] = js.native
  var dropdownMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.native
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
  ] = js.native
  var enterBeginsEditing: js.UndefOr[Boolean] = js.native
  var enterMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.native
  var fillHandle: js.UndefOr[
    Boolean | vertical | horizontal | typings.handsontable.mod.Handsontable.autoFill.Settings
  ] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filteringCaseSensitive: js.UndefOr[Boolean] = js.native
  var filters: js.UndefOr[Boolean] = js.native
  var fixedColumnsLeft: js.UndefOr[Double] = js.native
  var fixedRowsBottom: js.UndefOr[Double] = js.native
  var fixedRowsTop: js.UndefOr[Double] = js.native
  var formulas: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.formulas.Settings] = js.native
  var fragmentSelection: js.UndefOr[Boolean | cell] = js.native
  var ganttChart: js.UndefOr[typings.handsontable.mod.Handsontable.ganttChart.Settings] = js.native
  var headerTooltips: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings] = js.native
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  var hiddenColumns: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings] = js.native
  var hiddenRows: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings] = js.native
  var invalidCellClassName: js.UndefOr[String] = js.native
  var isEmptyCol: js.UndefOr[js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean]] = js.native
  var isEmptyRow: js.UndefOr[js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean]] = js.native
  var label: js.UndefOr[LabelOptions] = js.native
  var language: js.UndefOr[String] = js.native
  var licenseKey: js.UndefOr[String | `non-commercial-and-evaluation`] = js.native
  var manualColumnFreeze: js.UndefOr[Boolean] = js.native
  var manualColumnMove: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualColumnResize: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualRowMove: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var manualRowResize: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var maxCols: js.UndefOr[Double] = js.native
  var maxRows: js.UndefOr[Double] = js.native
  var mergeCells: js.UndefOr[Boolean | js.Array[typings.handsontable.mod.Handsontable.mergeCells.Settings]] = js.native
  var minCols: js.UndefOr[Double] = js.native
  var minRows: js.UndefOr[Double] = js.native
  var minSpareCols: js.UndefOr[Double] = js.native
  var minSpareRows: js.UndefOr[Double] = js.native
  var multiColumnSorting: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.multiColumnSorting.Settings] = js.native
  var nestedHeaders: js.UndefOr[js.Array[js.Array[String | NestedHeader]]] = js.native
  var nestedRows: js.UndefOr[Boolean] = js.native
  var noWordWrapClassName: js.UndefOr[String] = js.native
  var numericFormat: js.UndefOr[NumericFormatOptions] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var observeDOMVisibility: js.UndefOr[Boolean] = js.native
  var outsideClickDeselects: js.UndefOr[Boolean | (js.Function1[/* target */ HTMLElement, Boolean])] = js.native
  var persistentState: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderCellClassName: js.UndefOr[String] = js.native
  var preventOverflow: js.UndefOr[Boolean | vertical | horizontal] = js.native
  var preventWheel: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var readOnlyCellClassName: js.UndefOr[String] = js.native
  var renderAllRows: js.UndefOr[Boolean] = js.native
  var renderer: js.UndefOr[RendererType | String | typings.handsontable.mod.Handsontable.renderers.Base] = js.native
  var rowHeaderWidth: js.UndefOr[Double | js.Array[Double]] = js.native
  var rowHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.native
  var rowHeights: js.UndefOr[
    Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
  ] = js.native
  var search: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.search.Settings] = js.native
  var selectOptions: js.UndefOr[js.Array[String]] = js.native
  var selectionMode: js.UndefOr[single | range | multiple] = js.native
  var skipColumnOnPaste: js.UndefOr[Boolean] = js.native
  var sortByRelevance: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[
    (js.Array[Double | String]) | (js.ThisFunction2[
      /* this */ CellProperties, 
      /* query */ String, 
      /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
      Unit
    ])
  ] = js.native
  var startCols: js.UndefOr[Double] = js.native
  var startRows: js.UndefOr[Double] = js.native
  var stretchH: js.UndefOr[none | all | last] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var tabMoves: js.UndefOr[CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])] = js.native
  var tableClassName: js.UndefOr[String | js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var trimDropdown: js.UndefOr[Boolean] = js.native
  var trimRows: js.UndefOr[Boolean | js.Array[Double]] = js.native
  var trimWhitespace: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[CellType | String] = js.native
  var uncheckedTemplate: js.UndefOr[Boolean | String | Double] = js.native
  var undo: js.UndefOr[Boolean] = js.native
  var validator: js.UndefOr[
    typings.handsontable.mod.Handsontable.validators.Base | RegExp | ValidatorType | String
  ] = js.native
  var viewportColumnRenderingOffset: js.UndefOr[Double | auto] = js.native
  var viewportRowRenderingOffset: js.UndefOr[Double | auto] = js.native
  var visibleRows: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object GridSettings {
  @scala.inline
  def apply(): GridSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridSettings]
  }
  @scala.inline
  implicit class GridSettingsOps[Self <: GridSettings] (val x: Self) extends AnyVal {
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
    def setActiveHeaderClassName(value: String): Self = this.set("activeHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveHeaderClassName: Self = this.set("activeHeaderClassName", js.undefined)
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHtml: Self = this.set("allowHtml", js.undefined)
    @scala.inline
    def setAllowInsertColumn(value: Boolean): Self = this.set("allowInsertColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInsertColumn: Self = this.set("allowInsertColumn", js.undefined)
    @scala.inline
    def setAllowInsertRow(value: Boolean): Self = this.set("allowInsertRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInsertRow: Self = this.set("allowInsertRow", js.undefined)
    @scala.inline
    def setAllowInvalid(value: Boolean): Self = this.set("allowInvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInvalid: Self = this.set("allowInvalid", js.undefined)
    @scala.inline
    def setAllowRemoveColumn(value: Boolean): Self = this.set("allowRemoveColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRemoveColumn: Self = this.set("allowRemoveColumn", js.undefined)
    @scala.inline
    def setAllowRemoveRow(value: Boolean): Self = this.set("allowRemoveRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRemoveRow: Self = this.set("allowRemoveRow", js.undefined)
    @scala.inline
    def setAutoColumnSize(value: Settings | Boolean): Self = this.set("autoColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoColumnSize: Self = this.set("autoColumnSize", js.undefined)
    @scala.inline
    def setAutoRowSize(value: typings.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean): Self = this.set("autoRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRowSize: Self = this.set("autoRowSize", js.undefined)
    @scala.inline
    def setAutoWrapCol(value: Boolean): Self = this.set("autoWrapCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWrapCol: Self = this.set("autoWrapCol", js.undefined)
    @scala.inline
    def setAutoWrapRow(value: Boolean): Self = this.set("autoWrapRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWrapRow: Self = this.set("autoWrapRow", js.undefined)
    @scala.inline
    def setBindRowsWithHeaders(value: Boolean | loose | strict): Self = this.set("bindRowsWithHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindRowsWithHeaders: Self = this.set("bindRowsWithHeaders", js.undefined)
    @scala.inline
    def setCellVarargs(value: CellSettings*): Self = this.set("cell", js.Array(value :_*))
    @scala.inline
    def setCell(value: js.Array[CellSettings]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setCells(
      value: js.ThisFunction3[
          /* this */ CellProperties, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          CellMeta
        ]
    ): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    @scala.inline
    def setCheckedTemplate(value: Boolean | String | Double): Self = this.set("checkedTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedTemplate: Self = this.set("checkedTemplate", js.undefined)
    @scala.inline
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColHeadersVarargs(value: String*): Self = this.set("colHeaders", js.Array(value :_*))
    @scala.inline
    def setColHeadersFunction1(value: /* index */ Double => String): Self = this.set("colHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setColHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = this.set("colHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColHeaders: Self = this.set("colHeaders", js.undefined)
    @scala.inline
    def setColWidthsVarargs(value: (Double | String)*): Self = this.set("colWidths", js.Array(value :_*))
    @scala.inline
    def setColWidthsFunction1(value: /* index */ Double => String | Double): Self = this.set("colWidths", js.Any.fromFunction1(value))
    @scala.inline
    def setColWidths(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = this.set("colWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColWidths: Self = this.set("colWidths", js.undefined)
    @scala.inline
    def setCollapsibleColumnsVarargs(value: typings.handsontable.mod.Handsontable.collapsibleColumns.Settings*): Self = this.set("collapsibleColumns", js.Array(value :_*))
    @scala.inline
    def setCollapsibleColumns(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.collapsibleColumns.Settings]): Self = this.set("collapsibleColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsibleColumns: Self = this.set("collapsibleColumns", js.undefined)
    @scala.inline
    def setColumnHeaderHeightVarargs(value: js.UndefOr[Double]*): Self = this.set("columnHeaderHeight", js.Array(value :_*))
    @scala.inline
    def setColumnHeaderHeight(value: Double | js.Array[js.UndefOr[Double]]): Self = this.set("columnHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHeaderHeight: Self = this.set("columnHeaderHeight", js.undefined)
    @scala.inline
    def setColumnSorting(value: Boolean | typings.handsontable.mod.Handsontable.columnSorting.Settings): Self = this.set("columnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSorting: Self = this.set("columnSorting", js.undefined)
    @scala.inline
    def setColumnSummaryVarargs(value: typings.handsontable.mod.Handsontable.columnSummary.Settings*): Self = this.set("columnSummary", js.Array(value :_*))
    @scala.inline
    def setColumnSummaryFunction0(value: () => js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]): Self = this.set("columnSummary", js.Any.fromFunction0(value))
    @scala.inline
    def setColumnSummary(
      value: js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]]
    ): Self = this.set("columnSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSummary: Self = this.set("columnSummary", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: ColumnSettings*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumnsFunction1(value: /* index */ Double => ColumnSettings): Self = this.set("columns", js.Any.fromFunction1(value))
    @scala.inline
    def setColumns(value: js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCommentedCellClassName(value: String): Self = this.set("commentedCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentedCellClassName: Self = this.set("commentedCellClassName", js.undefined)
    @scala.inline
    def setCommentsVarargs(value: CommentConfig*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: Boolean | typings.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setContextMenuVarargs(value: PredefinedMenuItemKey*): Self = this.set("contextMenu", js.Array(value :_*))
    @scala.inline
    def setContextMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setCopyPaste(value: Boolean | typings.handsontable.mod.Handsontable.copyPaste.Settings): Self = this.set("copyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyPaste: Self = this.set("copyPaste", js.undefined)
    @scala.inline
    def setCopyable(value: Boolean): Self = this.set("copyable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyable: Self = this.set("copyable", js.undefined)
    @scala.inline
    def setCorrectFormat(value: Boolean): Self = this.set("correctFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrectFormat: Self = this.set("correctFormat", js.undefined)
    @scala.inline
    def setCurrentColClassName(value: String): Self = this.set("currentColClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentColClassName: Self = this.set("currentColClassName", js.undefined)
    @scala.inline
    def setCurrentHeaderClassName(value: String): Self = this.set("currentHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentHeaderClassName: Self = this.set("currentHeaderClassName", js.undefined)
    @scala.inline
    def setCurrentRowClassName(value: String): Self = this.set("currentRowClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRowClassName: Self = this.set("currentRowClassName", js.undefined)
    @scala.inline
    def setCustomBordersVarargs(value: typings.handsontable.mod.Handsontable.customBorders.Settings*): Self = this.set("customBorders", js.Array(value :_*))
    @scala.inline
    def setCustomBorders(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.customBorders.Settings]): Self = this.set("customBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomBorders: Self = this.set("customBorders", js.undefined)
    @scala.inline
    def setDataVarargs(value: (js.Array[CellValue] | RowObject)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Array[CellValue] | RowObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataSchemaVarargs(value: CellValue*): Self = this.set("dataSchema", js.Array(value :_*))
    @scala.inline
    def setDataSchemaFunction1(value: /* row */ Double => RowObject | js.Array[CellValue]): Self = this.set("dataSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setDataSchema(
      value: RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
    ): Self = this.set("dataSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSchema: Self = this.set("dataSchema", js.undefined)
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDatePickerConfig(value: PikadayOptions): Self = this.set("datePickerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatePickerConfig: Self = this.set("datePickerConfig", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDefaultDate(value: String): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDisableVisualSelectionVarargs(value: (current | area | header)*): Self = this.set("disableVisualSelection", js.Array(value :_*))
    @scala.inline
    def setDisableVisualSelection(value: Boolean | current | area | header | (js.Array[current | area | header])): Self = this.set("disableVisualSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableVisualSelection: Self = this.set("disableVisualSelection", js.undefined)
    @scala.inline
    def setDragToScroll(value: Boolean): Self = this.set("dragToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragToScroll: Self = this.set("dragToScroll", js.undefined)
    @scala.inline
    def setDropdownMenuVarargs(value: PredefinedMenuItemKey*): Self = this.set("dropdownMenu", js.Array(value :_*))
    @scala.inline
    def setDropdownMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = this.set("dropdownMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMenu: Self = this.set("dropdownMenu", js.undefined)
    @scala.inline
    def setEditor(
      value: EditorType | (Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) | Boolean | String
    ): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEnterBeginsEditing(value: Boolean): Self = this.set("enterBeginsEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterBeginsEditing: Self = this.set("enterBeginsEditing", js.undefined)
    @scala.inline
    def setEnterMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = this.set("enterMoves", js.Any.fromFunction1(value))
    @scala.inline
    def setEnterMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = this.set("enterMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterMoves: Self = this.set("enterMoves", js.undefined)
    @scala.inline
    def setFillHandle(value: Boolean | vertical | horizontal | typings.handsontable.mod.Handsontable.autoFill.Settings): Self = this.set("fillHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillHandle: Self = this.set("fillHandle", js.undefined)
    @scala.inline
    def setFilter(value: Boolean): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilteringCaseSensitive(value: Boolean): Self = this.set("filteringCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteringCaseSensitive: Self = this.set("filteringCaseSensitive", js.undefined)
    @scala.inline
    def setFilters(value: Boolean): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setFixedColumnsLeft(value: Double): Self = this.set("fixedColumnsLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedColumnsLeft: Self = this.set("fixedColumnsLeft", js.undefined)
    @scala.inline
    def setFixedRowsBottom(value: Double): Self = this.set("fixedRowsBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRowsBottom: Self = this.set("fixedRowsBottom", js.undefined)
    @scala.inline
    def setFixedRowsTop(value: Double): Self = this.set("fixedRowsTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedRowsTop: Self = this.set("fixedRowsTop", js.undefined)
    @scala.inline
    def setFormulas(value: Boolean | typings.handsontable.mod.Handsontable.formulas.Settings): Self = this.set("formulas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulas: Self = this.set("formulas", js.undefined)
    @scala.inline
    def setFragmentSelection(value: Boolean | cell): Self = this.set("fragmentSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentSelection: Self = this.set("fragmentSelection", js.undefined)
    @scala.inline
    def setGanttChart(value: typings.handsontable.mod.Handsontable.ganttChart.Settings): Self = this.set("ganttChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGanttChart: Self = this.set("ganttChart", js.undefined)
    @scala.inline
    def setHeaderTooltips(value: Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings): Self = this.set("headerTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTooltips: Self = this.set("headerTooltips", js.undefined)
    @scala.inline
    def setHeightFunction0(value: () => Double | String): Self = this.set("height", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double | String | (js.Function0[Double | String])): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHiddenColumns(value: Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings): Self = this.set("hiddenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumns: Self = this.set("hiddenColumns", js.undefined)
    @scala.inline
    def setHiddenRows(value: Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings): Self = this.set("hiddenRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenRows: Self = this.set("hiddenRows", js.undefined)
    @scala.inline
    def setInvalidCellClassName(value: String): Self = this.set("invalidCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidCellClassName: Self = this.set("invalidCellClassName", js.undefined)
    @scala.inline
    def setIsEmptyCol(value: js.ThisFunction1[/* this */ Core, /* col */ Double, Boolean]): Self = this.set("isEmptyCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEmptyCol: Self = this.set("isEmptyCol", js.undefined)
    @scala.inline
    def setIsEmptyRow(value: js.ThisFunction1[/* this */ Core, /* row */ Double, Boolean]): Self = this.set("isEmptyRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEmptyRow: Self = this.set("isEmptyRow", js.undefined)
    @scala.inline
    def setLabel(value: LabelOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLicenseKey(value: String | `non-commercial-and-evaluation`): Self = this.set("licenseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseKey: Self = this.set("licenseKey", js.undefined)
    @scala.inline
    def setManualColumnFreeze(value: Boolean): Self = this.set("manualColumnFreeze", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualColumnFreeze: Self = this.set("manualColumnFreeze", js.undefined)
    @scala.inline
    def setManualColumnMoveVarargs(value: Double*): Self = this.set("manualColumnMove", js.Array(value :_*))
    @scala.inline
    def setManualColumnMove(value: Boolean | js.Array[Double]): Self = this.set("manualColumnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualColumnMove: Self = this.set("manualColumnMove", js.undefined)
    @scala.inline
    def setManualColumnResizeVarargs(value: Double*): Self = this.set("manualColumnResize", js.Array(value :_*))
    @scala.inline
    def setManualColumnResize(value: Boolean | js.Array[Double]): Self = this.set("manualColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualColumnResize: Self = this.set("manualColumnResize", js.undefined)
    @scala.inline
    def setManualRowMoveVarargs(value: Double*): Self = this.set("manualRowMove", js.Array(value :_*))
    @scala.inline
    def setManualRowMove(value: Boolean | js.Array[Double]): Self = this.set("manualRowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualRowMove: Self = this.set("manualRowMove", js.undefined)
    @scala.inline
    def setManualRowResizeVarargs(value: Double*): Self = this.set("manualRowResize", js.Array(value :_*))
    @scala.inline
    def setManualRowResize(value: Boolean | js.Array[Double]): Self = this.set("manualRowResize", value.asInstanceOf[js.Any])
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
    def setMergeCellsVarargs(value: typings.handsontable.mod.Handsontable.mergeCells.Settings*): Self = this.set("mergeCells", js.Array(value :_*))
    @scala.inline
    def setMergeCells(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.mergeCells.Settings]): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
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
    def setMultiColumnSorting(value: Boolean | typings.handsontable.mod.Handsontable.multiColumnSorting.Settings): Self = this.set("multiColumnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiColumnSorting: Self = this.set("multiColumnSorting", js.undefined)
    @scala.inline
    def setNestedHeadersVarargs(value: (js.Array[String | NestedHeader])*): Self = this.set("nestedHeaders", js.Array(value :_*))
    @scala.inline
    def setNestedHeaders(value: js.Array[js.Array[String | NestedHeader]]): Self = this.set("nestedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedHeaders: Self = this.set("nestedHeaders", js.undefined)
    @scala.inline
    def setNestedRows(value: Boolean): Self = this.set("nestedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedRows: Self = this.set("nestedRows", js.undefined)
    @scala.inline
    def setNoWordWrapClassName(value: String): Self = this.set("noWordWrapClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWordWrapClassName: Self = this.set("noWordWrapClassName", js.undefined)
    @scala.inline
    def setNumericFormat(value: NumericFormatOptions): Self = this.set("numericFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericFormat: Self = this.set("numericFormat", js.undefined)
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    @scala.inline
    def setObserveDOMVisibility(value: Boolean): Self = this.set("observeDOMVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveDOMVisibility: Self = this.set("observeDOMVisibility", js.undefined)
    @scala.inline
    def setOutsideClickDeselectsFunction1(value: /* target */ HTMLElement => Boolean): Self = this.set("outsideClickDeselects", js.Any.fromFunction1(value))
    @scala.inline
    def setOutsideClickDeselects(value: Boolean | (js.Function1[/* target */ HTMLElement, Boolean])): Self = this.set("outsideClickDeselects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutsideClickDeselects: Self = this.set("outsideClickDeselects", js.undefined)
    @scala.inline
    def setPersistentState(value: Boolean): Self = this.set("persistentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentState: Self = this.set("persistentState", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderCellClassName(value: String): Self = this.set("placeholderCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderCellClassName: Self = this.set("placeholderCellClassName", js.undefined)
    @scala.inline
    def setPreventOverflow(value: Boolean | vertical | horizontal): Self = this.set("preventOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventOverflow: Self = this.set("preventOverflow", js.undefined)
    @scala.inline
    def setPreventWheel(value: Boolean): Self = this.set("preventWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventWheel: Self = this.set("preventWheel", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setReadOnlyCellClassName(value: String): Self = this.set("readOnlyCellClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnlyCellClassName: Self = this.set("readOnlyCellClassName", js.undefined)
    @scala.inline
    def setRenderAllRows(value: Boolean): Self = this.set("renderAllRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderAllRows: Self = this.set("renderAllRows", js.undefined)
    @scala.inline
    def setRendererFunction7(
      value: (/* instance */ Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit
    ): Self = this.set("renderer", js.Any.fromFunction7(value))
    @scala.inline
    def setRenderer(value: RendererType | String | typings.handsontable.mod.Handsontable.renderers.Base): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRowHeaderWidthVarargs(value: Double*): Self = this.set("rowHeaderWidth", js.Array(value :_*))
    @scala.inline
    def setRowHeaderWidth(value: Double | js.Array[Double]): Self = this.set("rowHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeaderWidth: Self = this.set("rowHeaderWidth", js.undefined)
    @scala.inline
    def setRowHeadersVarargs(value: String*): Self = this.set("rowHeaders", js.Array(value :_*))
    @scala.inline
    def setRowHeadersFunction1(value: /* index */ Double => String): Self = this.set("rowHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def setRowHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = this.set("rowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeaders: Self = this.set("rowHeaders", js.undefined)
    @scala.inline
    def setRowHeightsVarargs(value: (Double | String)*): Self = this.set("rowHeights", js.Array(value :_*))
    @scala.inline
    def setRowHeightsFunction1(value: /* index */ Double => String | Double): Self = this.set("rowHeights", js.Any.fromFunction1(value))
    @scala.inline
    def setRowHeights(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = this.set("rowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeights: Self = this.set("rowHeights", js.undefined)
    @scala.inline
    def setSearch(value: Boolean | typings.handsontable.mod.Handsontable.search.Settings): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSelectOptionsVarargs(value: String*): Self = this.set("selectOptions", js.Array(value :_*))
    @scala.inline
    def setSelectOptions(value: js.Array[String]): Self = this.set("selectOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOptions: Self = this.set("selectOptions", js.undefined)
    @scala.inline
    def setSelectionMode(value: single | range | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSkipColumnOnPaste(value: Boolean): Self = this.set("skipColumnOnPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipColumnOnPaste: Self = this.set("skipColumnOnPaste", js.undefined)
    @scala.inline
    def setSortByRelevance(value: Boolean): Self = this.set("sortByRelevance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortByRelevance: Self = this.set("sortByRelevance", js.undefined)
    @scala.inline
    def setSourceVarargs(value: (Double | String)*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(
      value: (js.Array[Double | String]) | (js.ThisFunction2[
          /* this */ CellProperties, 
          /* query */ String, 
          /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
          Unit
        ])
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStartCols(value: Double): Self = this.set("startCols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCols: Self = this.set("startCols", js.undefined)
    @scala.inline
    def setStartRows(value: Double): Self = this.set("startRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartRows: Self = this.set("startRows", js.undefined)
    @scala.inline
    def setStretchH(value: none | all | last): Self = this.set("stretchH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchH: Self = this.set("stretchH", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setTabMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = this.set("tabMoves", js.Any.fromFunction1(value))
    @scala.inline
    def setTabMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = this.set("tabMoves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabMoves: Self = this.set("tabMoves", js.undefined)
    @scala.inline
    def setTableClassNameVarargs(value: String*): Self = this.set("tableClassName", js.Array(value :_*))
    @scala.inline
    def setTableClassName(value: String | js.Array[String]): Self = this.set("tableClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableClassName: Self = this.set("tableClassName", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrimDropdown(value: Boolean): Self = this.set("trimDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimDropdown: Self = this.set("trimDropdown", js.undefined)
    @scala.inline
    def setTrimRowsVarargs(value: Double*): Self = this.set("trimRows", js.Array(value :_*))
    @scala.inline
    def setTrimRows(value: Boolean | js.Array[Double]): Self = this.set("trimRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimRows: Self = this.set("trimRows", js.undefined)
    @scala.inline
    def setTrimWhitespace(value: Boolean): Self = this.set("trimWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimWhitespace: Self = this.set("trimWhitespace", js.undefined)
    @scala.inline
    def setType(value: CellType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUncheckedTemplate(value: Boolean | String | Double): Self = this.set("uncheckedTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUncheckedTemplate: Self = this.set("uncheckedTemplate", js.undefined)
    @scala.inline
    def setUndo(value: Boolean): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    @scala.inline
    def setValidator(value: typings.handsontable.mod.Handsontable.validators.Base | RegExp | ValidatorType | String): Self = this.set("validator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    @scala.inline
    def setViewportColumnRenderingOffset(value: Double | auto): Self = this.set("viewportColumnRenderingOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportColumnRenderingOffset: Self = this.set("viewportColumnRenderingOffset", js.undefined)
    @scala.inline
    def setViewportRowRenderingOffset(value: Double | auto): Self = this.set("viewportRowRenderingOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportRowRenderingOffset: Self = this.set("viewportRowRenderingOffset", js.undefined)
    @scala.inline
    def setVisibleRows(value: Double): Self = this.set("visibleRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleRows: Self = this.set("visibleRows", js.undefined)
    @scala.inline
    def setWidthFunction0(value: () => Double | String): Self = this.set("width", js.Any.fromFunction0(value))
    @scala.inline
    def setWidth(value: Double | String | (js.Function0[Double | String])): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

