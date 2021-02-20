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
import typings.pikaday.mod.PikadayOptions
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import typings.std.KeyboardEvent
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  var defaultDate: js.UndefOr[String] = js.native
  
  var disableVisualSelection: js.UndefOr[Boolean | current | area | header | (js.Array[current | area | header])] = js.native
  
  var dragToScroll: js.UndefOr[Boolean] = js.native
  
  var dropdownMenu: js.UndefOr[
    Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
  ] = js.native
  
  var editor: js.UndefOr[
    EditorType | (Instantiable6[
      /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
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
  
  var headerTooltips: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings] = js.native
  
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.native
  
  var hiddenColumns: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings] = js.native
  
  var hiddenRows: js.UndefOr[Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings] = js.native
  
  var invalidCellClassName: js.UndefOr[String] = js.native
  
  var isEmptyCol: js.UndefOr[
    js.ThisFunction1[/* this */ typings.handsontable.mod._Handsontable.Core, /* col */ Double, Boolean]
  ] = js.native
  
  var isEmptyRow: js.UndefOr[
    js.ThisFunction1[/* this */ typings.handsontable.mod._Handsontable.Core, /* row */ Double, Boolean]
  ] = js.native
  
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
  implicit class GridSettingsMutableBuilder[Self <: GridSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveHeaderClassName(value: String): Self = StObject.set(x, "activeHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHeaderClassNameUndefined: Self = StObject.set(x, "activeHeaderClassName", js.undefined)
    
    @scala.inline
    def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    @scala.inline
    def setAllowInsertColumn(value: Boolean): Self = StObject.set(x, "allowInsertColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertColumnUndefined: Self = StObject.set(x, "allowInsertColumn", js.undefined)
    
    @scala.inline
    def setAllowInsertRow(value: Boolean): Self = StObject.set(x, "allowInsertRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertRowUndefined: Self = StObject.set(x, "allowInsertRow", js.undefined)
    
    @scala.inline
    def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
    
    @scala.inline
    def setAllowRemoveColumn(value: Boolean): Self = StObject.set(x, "allowRemoveColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemoveColumnUndefined: Self = StObject.set(x, "allowRemoveColumn", js.undefined)
    
    @scala.inline
    def setAllowRemoveRow(value: Boolean): Self = StObject.set(x, "allowRemoveRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemoveRowUndefined: Self = StObject.set(x, "allowRemoveRow", js.undefined)
    
    @scala.inline
    def setAutoColumnSize(value: Settings | Boolean): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoColumnSizeUndefined: Self = StObject.set(x, "autoColumnSize", js.undefined)
    
    @scala.inline
    def setAutoRowSize(value: typings.handsontable.mod.Handsontable.autoRowSize.Settings | Boolean): Self = StObject.set(x, "autoRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRowSizeUndefined: Self = StObject.set(x, "autoRowSize", js.undefined)
    
    @scala.inline
    def setAutoWrapCol(value: Boolean): Self = StObject.set(x, "autoWrapCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWrapColUndefined: Self = StObject.set(x, "autoWrapCol", js.undefined)
    
    @scala.inline
    def setAutoWrapRow(value: Boolean): Self = StObject.set(x, "autoWrapRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWrapRowUndefined: Self = StObject.set(x, "autoWrapRow", js.undefined)
    
    @scala.inline
    def setBindRowsWithHeaders(value: Boolean | loose | strict): Self = StObject.set(x, "bindRowsWithHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindRowsWithHeadersUndefined: Self = StObject.set(x, "bindRowsWithHeaders", js.undefined)
    
    @scala.inline
    def setCell(value: js.Array[CellSettings]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setCellVarargs(value: CellSettings*): Self = StObject.set(x, "cell", js.Array(value :_*))
    
    @scala.inline
    def setCells(
      value: js.ThisFunction3[
          /* this */ CellProperties, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          CellMeta
        ]
    ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    @scala.inline
    def setCheckedTemplate(value: Boolean | String | Double): Self = StObject.set(x, "checkedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedTemplateUndefined: Self = StObject.set(x, "checkedTemplate", js.undefined)
    
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
    
    @scala.inline
    def setColHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = StObject.set(x, "colHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColHeadersFunction1(value: /* index */ Double => String): Self = StObject.set(x, "colHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColHeadersUndefined: Self = StObject.set(x, "colHeaders", js.undefined)
    
    @scala.inline
    def setColHeadersVarargs(value: String*): Self = StObject.set(x, "colHeaders", js.Array(value :_*))
    
    @scala.inline
    def setColWidths(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColWidthsFunction1(value: /* index */ Double => String | Double): Self = StObject.set(x, "colWidths", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
    
    @scala.inline
    def setColWidthsVarargs(value: (Double | String)*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
    
    @scala.inline
    def setCollapsibleColumns(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.collapsibleColumns.Settings]): Self = StObject.set(x, "collapsibleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleColumnsUndefined: Self = StObject.set(x, "collapsibleColumns", js.undefined)
    
    @scala.inline
    def setCollapsibleColumnsVarargs(value: typings.handsontable.mod.Handsontable.collapsibleColumns.Settings*): Self = StObject.set(x, "collapsibleColumns", js.Array(value :_*))
    
    @scala.inline
    def setColumnHeaderHeight(value: Double | js.Array[js.UndefOr[Double]]): Self = StObject.set(x, "columnHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeaderHeightUndefined: Self = StObject.set(x, "columnHeaderHeight", js.undefined)
    
    @scala.inline
    def setColumnHeaderHeightVarargs(value: js.UndefOr[Double]*): Self = StObject.set(x, "columnHeaderHeight", js.Array(value :_*))
    
    @scala.inline
    def setColumnSorting(value: Boolean | typings.handsontable.mod.Handsontable.columnSorting.Settings): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
    
    @scala.inline
    def setColumnSummary(
      value: js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings] | js.Function0[js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]]
    ): Self = StObject.set(x, "columnSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSummaryFunction0(value: () => js.Array[typings.handsontable.mod.Handsontable.columnSummary.Settings]): Self = StObject.set(x, "columnSummary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setColumnSummaryUndefined: Self = StObject.set(x, "columnSummary", js.undefined)
    
    @scala.inline
    def setColumnSummaryVarargs(value: typings.handsontable.mod.Handsontable.columnSummary.Settings*): Self = StObject.set(x, "columnSummary", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsFunction1(value: /* index */ Double => ColumnSettings): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnSettings*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCommentedCellClassName(value: String): Self = StObject.set(x, "commentedCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentedCellClassNameUndefined: Self = StObject.set(x, "commentedCellClassName", js.undefined)
    
    @scala.inline
    def setComments(value: Boolean | typings.handsontable.mod.Handsontable.comments.Settings | js.Array[CommentConfig]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentConfig*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setContextMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    @scala.inline
    def setContextMenuVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "contextMenu", js.Array(value :_*))
    
    @scala.inline
    def setCopyPaste(value: Boolean | typings.handsontable.mod.Handsontable.copyPaste.Settings): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
    
    @scala.inline
    def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    @scala.inline
    def setCorrectFormat(value: Boolean): Self = StObject.set(x, "correctFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectFormatUndefined: Self = StObject.set(x, "correctFormat", js.undefined)
    
    @scala.inline
    def setCurrentColClassName(value: String): Self = StObject.set(x, "currentColClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentColClassNameUndefined: Self = StObject.set(x, "currentColClassName", js.undefined)
    
    @scala.inline
    def setCurrentHeaderClassName(value: String): Self = StObject.set(x, "currentHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentHeaderClassNameUndefined: Self = StObject.set(x, "currentHeaderClassName", js.undefined)
    
    @scala.inline
    def setCurrentRowClassName(value: String): Self = StObject.set(x, "currentRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRowClassNameUndefined: Self = StObject.set(x, "currentRowClassName", js.undefined)
    
    @scala.inline
    def setCustomBorders(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.customBorders.Settings]): Self = StObject.set(x, "customBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBordersUndefined: Self = StObject.set(x, "customBorders", js.undefined)
    
    @scala.inline
    def setCustomBordersVarargs(value: typings.handsontable.mod.Handsontable.customBorders.Settings*): Self = StObject.set(x, "customBorders", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Array[CellValue] | RowObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSchema(
      value: RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
    ): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSchemaFunction1(value: /* row */ Double => RowObject | js.Array[CellValue]): Self = StObject.set(x, "dataSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
    
    @scala.inline
    def setDataSchemaVarargs(value: CellValue*): Self = StObject.set(x, "dataSchema", js.Array(value :_*))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (js.Array[CellValue] | RowObject)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setDatePickerConfig(value: PikadayOptions): Self = StObject.set(x, "datePickerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePickerConfigUndefined: Self = StObject.set(x, "datePickerConfig", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: String): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    @scala.inline
    def setDisableVisualSelection(value: Boolean | current | area | header | (js.Array[current | area | header])): Self = StObject.set(x, "disableVisualSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableVisualSelectionUndefined: Self = StObject.set(x, "disableVisualSelection", js.undefined)
    
    @scala.inline
    def setDisableVisualSelectionVarargs(value: (current | area | header)*): Self = StObject.set(x, "disableVisualSelection", js.Array(value :_*))
    
    @scala.inline
    def setDragToScroll(value: Boolean): Self = StObject.set(x, "dragToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragToScrollUndefined: Self = StObject.set(x, "dragToScroll", js.undefined)
    
    @scala.inline
    def setDropdownMenu(
      value: Boolean | js.Array[PredefinedMenuItemKey] | typings.handsontable.mod.Handsontable.contextMenu.Settings
    ): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownMenuUndefined: Self = StObject.set(x, "dropdownMenu", js.undefined)
    
    @scala.inline
    def setDropdownMenuVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "dropdownMenu", js.Array(value :_*))
    
    @scala.inline
    def setEditor(
      value: EditorType | (Instantiable6[
          /* hotInstance */ typings.handsontable.mod._Handsontable.Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) | Boolean | String
    ): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setEnterBeginsEditing(value: Boolean): Self = StObject.set(x, "enterBeginsEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterBeginsEditingUndefined: Self = StObject.set(x, "enterBeginsEditing", js.undefined)
    
    @scala.inline
    def setEnterMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = StObject.set(x, "enterMoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = StObject.set(x, "enterMoves", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnterMovesUndefined: Self = StObject.set(x, "enterMoves", js.undefined)
    
    @scala.inline
    def setFillHandle(value: Boolean | vertical | horizontal | typings.handsontable.mod.Handsontable.autoFill.Settings): Self = StObject.set(x, "fillHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillHandleUndefined: Self = StObject.set(x, "fillHandle", js.undefined)
    
    @scala.inline
    def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilteringCaseSensitive(value: Boolean): Self = StObject.set(x, "filteringCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteringCaseSensitiveUndefined: Self = StObject.set(x, "filteringCaseSensitive", js.undefined)
    
    @scala.inline
    def setFilters(value: Boolean): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFixedColumnsLeft(value: Double): Self = StObject.set(x, "fixedColumnsLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedColumnsLeftUndefined: Self = StObject.set(x, "fixedColumnsLeft", js.undefined)
    
    @scala.inline
    def setFixedRowsBottom(value: Double): Self = StObject.set(x, "fixedRowsBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRowsBottomUndefined: Self = StObject.set(x, "fixedRowsBottom", js.undefined)
    
    @scala.inline
    def setFixedRowsTop(value: Double): Self = StObject.set(x, "fixedRowsTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedRowsTopUndefined: Self = StObject.set(x, "fixedRowsTop", js.undefined)
    
    @scala.inline
    def setFormulas(value: Boolean | typings.handsontable.mod.Handsontable.formulas.Settings): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
    
    @scala.inline
    def setFragmentSelection(value: Boolean | cell): Self = StObject.set(x, "fragmentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentSelectionUndefined: Self = StObject.set(x, "fragmentSelection", js.undefined)
    
    @scala.inline
    def setHeaderTooltips(value: Boolean | typings.handsontable.mod.Handsontable.headerTooltips.Settings): Self = StObject.set(x, "headerTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTooltipsUndefined: Self = StObject.set(x, "headerTooltips", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHiddenColumns(value: Boolean | typings.handsontable.mod.Handsontable.hiddenColumns.Settings): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenColumnsUndefined: Self = StObject.set(x, "hiddenColumns", js.undefined)
    
    @scala.inline
    def setHiddenRows(value: Boolean | typings.handsontable.mod.Handsontable.hiddenRows.Settings): Self = StObject.set(x, "hiddenRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenRowsUndefined: Self = StObject.set(x, "hiddenRows", js.undefined)
    
    @scala.inline
    def setInvalidCellClassName(value: String): Self = StObject.set(x, "invalidCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidCellClassNameUndefined: Self = StObject.set(x, "invalidCellClassName", js.undefined)
    
    @scala.inline
    def setIsEmptyCol(
      value: js.ThisFunction1[/* this */ typings.handsontable.mod._Handsontable.Core, /* col */ Double, Boolean]
    ): Self = StObject.set(x, "isEmptyCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmptyColUndefined: Self = StObject.set(x, "isEmptyCol", js.undefined)
    
    @scala.inline
    def setIsEmptyRow(
      value: js.ThisFunction1[/* this */ typings.handsontable.mod._Handsontable.Core, /* row */ Double, Boolean]
    ): Self = StObject.set(x, "isEmptyRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEmptyRowUndefined: Self = StObject.set(x, "isEmptyRow", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLicenseKey(value: String | `non-commercial-and-evaluation`): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
    
    @scala.inline
    def setManualColumnFreeze(value: Boolean): Self = StObject.set(x, "manualColumnFreeze", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualColumnFreezeUndefined: Self = StObject.set(x, "manualColumnFreeze", js.undefined)
    
    @scala.inline
    def setManualColumnMove(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualColumnMoveUndefined: Self = StObject.set(x, "manualColumnMove", js.undefined)
    
    @scala.inline
    def setManualColumnMoveVarargs(value: Double*): Self = StObject.set(x, "manualColumnMove", js.Array(value :_*))
    
    @scala.inline
    def setManualColumnResize(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualColumnResizeUndefined: Self = StObject.set(x, "manualColumnResize", js.undefined)
    
    @scala.inline
    def setManualColumnResizeVarargs(value: Double*): Self = StObject.set(x, "manualColumnResize", js.Array(value :_*))
    
    @scala.inline
    def setManualRowMove(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRowMoveUndefined: Self = StObject.set(x, "manualRowMove", js.undefined)
    
    @scala.inline
    def setManualRowMoveVarargs(value: Double*): Self = StObject.set(x, "manualRowMove", js.Array(value :_*))
    
    @scala.inline
    def setManualRowResize(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRowResizeUndefined: Self = StObject.set(x, "manualRowResize", js.undefined)
    
    @scala.inline
    def setManualRowResizeVarargs(value: Double*): Self = StObject.set(x, "manualRowResize", js.Array(value :_*))
    
    @scala.inline
    def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColsUndefined: Self = StObject.set(x, "maxCols", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    @scala.inline
    def setMergeCells(value: Boolean | js.Array[typings.handsontable.mod.Handsontable.mergeCells.Settings]): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
    
    @scala.inline
    def setMergeCellsVarargs(value: typings.handsontable.mod.Handsontable.mergeCells.Settings*): Self = StObject.set(x, "mergeCells", js.Array(value :_*))
    
    @scala.inline
    def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
    
    @scala.inline
    def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
    
    @scala.inline
    def setMinSpareCols(value: Double): Self = StObject.set(x, "minSpareCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSpareColsUndefined: Self = StObject.set(x, "minSpareCols", js.undefined)
    
    @scala.inline
    def setMinSpareRows(value: Double): Self = StObject.set(x, "minSpareRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSpareRowsUndefined: Self = StObject.set(x, "minSpareRows", js.undefined)
    
    @scala.inline
    def setMultiColumnSorting(value: Boolean | typings.handsontable.mod.Handsontable.multiColumnSorting.Settings): Self = StObject.set(x, "multiColumnSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiColumnSortingUndefined: Self = StObject.set(x, "multiColumnSorting", js.undefined)
    
    @scala.inline
    def setNestedHeaders(value: js.Array[js.Array[String | NestedHeader]]): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedHeadersUndefined: Self = StObject.set(x, "nestedHeaders", js.undefined)
    
    @scala.inline
    def setNestedHeadersVarargs(value: (js.Array[String | NestedHeader])*): Self = StObject.set(x, "nestedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setNestedRows(value: Boolean): Self = StObject.set(x, "nestedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedRowsUndefined: Self = StObject.set(x, "nestedRows", js.undefined)
    
    @scala.inline
    def setNoWordWrapClassName(value: String): Self = StObject.set(x, "noWordWrapClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWordWrapClassNameUndefined: Self = StObject.set(x, "noWordWrapClassName", js.undefined)
    
    @scala.inline
    def setNumericFormat(value: NumericFormatOptions): Self = StObject.set(x, "numericFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericFormatUndefined: Self = StObject.set(x, "numericFormat", js.undefined)
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
    
    @scala.inline
    def setObserveDOMVisibility(value: Boolean): Self = StObject.set(x, "observeDOMVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveDOMVisibilityUndefined: Self = StObject.set(x, "observeDOMVisibility", js.undefined)
    
    @scala.inline
    def setOutsideClickDeselects(value: Boolean | (js.Function1[/* target */ HTMLElement, Boolean])): Self = StObject.set(x, "outsideClickDeselects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideClickDeselectsFunction1(value: /* target */ HTMLElement => Boolean): Self = StObject.set(x, "outsideClickDeselects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutsideClickDeselectsUndefined: Self = StObject.set(x, "outsideClickDeselects", js.undefined)
    
    @scala.inline
    def setPersistentState(value: Boolean): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderCellClassName(value: String): Self = StObject.set(x, "placeholderCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderCellClassNameUndefined: Self = StObject.set(x, "placeholderCellClassName", js.undefined)
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPreventOverflow(value: Boolean | vertical | horizontal): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
    
    @scala.inline
    def setPreventWheel(value: Boolean): Self = StObject.set(x, "preventWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventWheelUndefined: Self = StObject.set(x, "preventWheel", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyCellClassName(value: String): Self = StObject.set(x, "readOnlyCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyCellClassNameUndefined: Self = StObject.set(x, "readOnlyCellClassName", js.undefined)
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRenderAllRows(value: Boolean): Self = StObject.set(x, "renderAllRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAllRowsUndefined: Self = StObject.set(x, "renderAllRows", js.undefined)
    
    @scala.inline
    def setRenderer(value: RendererType | String | typings.handsontable.mod.Handsontable.renderers.Base): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererFunction7(
      value: (/* instance */ typings.handsontable.mod._Handsontable.Core, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => HTMLTableCellElement | Unit
    ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setRowHeaderWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "rowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderWidthUndefined: Self = StObject.set(x, "rowHeaderWidth", js.undefined)
    
    @scala.inline
    def setRowHeaderWidthVarargs(value: Double*): Self = StObject.set(x, "rowHeaderWidth", js.Array(value :_*))
    
    @scala.inline
    def setRowHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = StObject.set(x, "rowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeadersFunction1(value: /* index */ Double => String): Self = StObject.set(x, "rowHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeadersUndefined: Self = StObject.set(x, "rowHeaders", js.undefined)
    
    @scala.inline
    def setRowHeadersVarargs(value: String*): Self = StObject.set(x, "rowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRowHeights(
      value: Double | (js.Array[Double | String]) | String | (js.Function1[/* index */ Double, String | Double])
    ): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightsFunction1(value: /* index */ Double => String | Double): Self = StObject.set(x, "rowHeights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
    
    @scala.inline
    def setRowHeightsVarargs(value: (Double | String)*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: Boolean | typings.handsontable.mod.Handsontable.search.Settings): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelectOptions(value: js.Array[String]): Self = StObject.set(x, "selectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOptionsUndefined: Self = StObject.set(x, "selectOptions", js.undefined)
    
    @scala.inline
    def setSelectOptionsVarargs(value: String*): Self = StObject.set(x, "selectOptions", js.Array(value :_*))
    
    @scala.inline
    def setSelectionMode(value: single | range | multiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSkipColumnOnPaste(value: Boolean): Self = StObject.set(x, "skipColumnOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipColumnOnPasteUndefined: Self = StObject.set(x, "skipColumnOnPaste", js.undefined)
    
    @scala.inline
    def setSortByRelevance(value: Boolean): Self = StObject.set(x, "sortByRelevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByRelevanceUndefined: Self = StObject.set(x, "sortByRelevance", js.undefined)
    
    @scala.inline
    def setSource(
      value: (js.Array[Double | String]) | (js.ThisFunction2[
          /* this */ CellProperties, 
          /* query */ String, 
          /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
          Unit
        ])
    ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: (Double | String)*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setStartCols(value: Double): Self = StObject.set(x, "startCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColsUndefined: Self = StObject.set(x, "startCols", js.undefined)
    
    @scala.inline
    def setStartRows(value: Double): Self = StObject.set(x, "startRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRowsUndefined: Self = StObject.set(x, "startRows", js.undefined)
    
    @scala.inline
    def setStretchH(value: none | all | last): Self = StObject.set(x, "stretchH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchHUndefined: Self = StObject.set(x, "stretchH", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setTabMoves(value: CellCoords | (js.Function1[/* event */ KeyboardEvent, CellCoords])): Self = StObject.set(x, "tabMoves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabMovesFunction1(value: /* event */ KeyboardEvent => CellCoords): Self = StObject.set(x, "tabMoves", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabMovesUndefined: Self = StObject.set(x, "tabMoves", js.undefined)
    
    @scala.inline
    def setTableClassName(value: String | js.Array[String]): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
    
    @scala.inline
    def setTableClassNameVarargs(value: String*): Self = StObject.set(x, "tableClassName", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrimDropdown(value: Boolean): Self = StObject.set(x, "trimDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimDropdownUndefined: Self = StObject.set(x, "trimDropdown", js.undefined)
    
    @scala.inline
    def setTrimRows(value: Boolean | js.Array[Double]): Self = StObject.set(x, "trimRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimRowsUndefined: Self = StObject.set(x, "trimRows", js.undefined)
    
    @scala.inline
    def setTrimRowsVarargs(value: Double*): Self = StObject.set(x, "trimRows", js.Array(value :_*))
    
    @scala.inline
    def setTrimWhitespace(value: Boolean): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
    
    @scala.inline
    def setType(value: CellType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUncheckedTemplate(value: Boolean | String | Double): Self = StObject.set(x, "uncheckedTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedTemplateUndefined: Self = StObject.set(x, "uncheckedTemplate", js.undefined)
    
    @scala.inline
    def setUndo(value: Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    
    @scala.inline
    def setValidator(value: typings.handsontable.mod.Handsontable.validators.Base | RegExp | ValidatorType | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    
    @scala.inline
    def setViewportColumnRenderingOffset(value: Double | auto): Self = StObject.set(x, "viewportColumnRenderingOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportColumnRenderingOffsetUndefined: Self = StObject.set(x, "viewportColumnRenderingOffset", js.undefined)
    
    @scala.inline
    def setViewportRowRenderingOffset(value: Double | auto): Self = StObject.set(x, "viewportRowRenderingOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportRowRenderingOffsetUndefined: Self = StObject.set(x, "viewportRowRenderingOffset", js.undefined)
    
    @scala.inline
    def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowsUndefined: Self = StObject.set(x, "visibleRows", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
