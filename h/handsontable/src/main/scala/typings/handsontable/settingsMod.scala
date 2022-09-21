package typings.handsontable

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.handsontable.autoColumnSizeAutoColumnSizeMod.Settings
import typings.handsontable.cellTypesMod.CellType
import typings.handsontable.collapsibleColumnsCollapsibleColumnsMod.DetailedSettings
import typings.handsontable.commentsCommentsMod.CommentObject
import typings.handsontable.commonMod.CellValue
import typings.handsontable.commonMod.ColumnDataGetterSetterFunction
import typings.handsontable.commonMod.LabelOptions
import typings.handsontable.commonMod.NumericFormatOptions
import typings.handsontable.commonMod.RowObject
import typings.handsontable.commonMod.SelectOptionsObject
import typings.handsontable.commonMod.SimpleCellCoords
import typings.handsontable.contextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.coreMod.default
import typings.handsontable.editorsMod.BaseEditor
import typings.handsontable.editorsMod.EditorType
import typings.handsontable.handsontableStrings.`non-commercial-and-evaluation`
import typings.handsontable.handsontableStrings.all
import typings.handsontable.handsontableStrings.area
import typings.handsontable.handsontableStrings.auto
import typings.handsontable.handsontableStrings.cell
import typings.handsontable.handsontableStrings.current
import typings.handsontable.handsontableStrings.header
import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.inherit
import typings.handsontable.handsontableStrings.last
import typings.handsontable.handsontableStrings.loose
import typings.handsontable.handsontableStrings.ltr
import typings.handsontable.handsontableStrings.multiple
import typings.handsontable.handsontableStrings.none
import typings.handsontable.handsontableStrings.range
import typings.handsontable.handsontableStrings.rtl
import typings.handsontable.handsontableStrings.single
import typings.handsontable.handsontableStrings.strict
import typings.handsontable.handsontableStrings.vertical
import typings.handsontable.pluginHooksMod.Events
import typings.handsontable.renderersBaseMod.BaseRenderer
import typings.handsontable.renderersMod.RendererType
import typings.handsontable.validatorsBaseMod.BaseValidator_
import typings.handsontable.validatorsMod.ValidatorType
import typings.pikaday.mod.PikadayOptions
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import typings.std.KeyboardEvent
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  trait CellMeta
    extends StObject
       with ColumnSettings {
    
    var comment: js.UndefOr[CommentObject] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isSearchResult: js.UndefOr[Boolean] = js.undefined
    
    var skipRowOnPaste: js.UndefOr[Boolean] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object CellMeta {
    
    inline def apply(): CellMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellMeta]
    }
    
    extension [Self <: CellMeta](x: Self) {
      
      inline def setComment(value: CommentObject): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsSearchResult(value: Boolean): Self = StObject.set(x, "isSearchResult", value.asInstanceOf[js.Any])
      
      inline def setIsSearchResultUndefined: Self = StObject.set(x, "isSearchResult", js.undefined)
      
      inline def setSkipRowOnPaste(value: Boolean): Self = StObject.set(x, "skipRowOnPaste", value.asInstanceOf[js.Any])
      
      inline def setSkipRowOnPasteUndefined: Self = StObject.set(x, "skipRowOnPaste", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  trait CellProperties
    extends StObject
       with CellMeta {
    
    var col: Double
    
    var instance: default
    
    var prop: String | Double
    
    var row: Double
    
    var visualCol: Double
    
    var visualRow: Double
  }
  object CellProperties {
    
    inline def apply(
      col: Double,
      instance: default,
      prop: String | Double,
      row: Double,
      visualCol: Double,
      visualRow: Double
    ): CellProperties = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellProperties]
    }
    
    extension [Self <: CellProperties](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String | Double): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setVisualCol(value: Double): Self = StObject.set(x, "visualCol", value.asInstanceOf[js.Any])
      
      inline def setVisualRow(value: Double): Self = StObject.set(x, "visualRow", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellSettings
    extends StObject
       with CellMeta {
    
    var col: Double
    
    var row: Double
  }
  object CellSettings {
    
    inline def apply(col: Double, row: Double): CellSettings = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellSettings]
    }
    
    extension [Self <: CellSettings](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof handsontable.handsontable/settings.GridSettings ]: P} & {[ P in 'data' ]: never} & {[x: string] : never, [x: number] : never}[keyof handsontable.handsontable/settings.GridSettings] ]: handsontable.handsontable/settings.GridSettings[P]} */ trait ColumnSettings
    extends StObject
       with /**
    * Column and cell meta data is extensible, developers can add any properties they want.
    */
  /* key */ StringDictionary[Any] {
    
    var data: js.UndefOr[String | Double | ColumnDataGetterSetterFunction] = js.undefined
  }
  object ColumnSettings {
    
    inline def apply(): ColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnSettings]
    }
    
    extension [Self <: ColumnSettings](x: Self) {
      
      inline def setData(value: String | Double | ColumnDataGetterSetterFunction): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait GridSettings
    extends StObject
       with Events {
    
    var activeHeaderClassName: js.UndefOr[String] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var allowHtml: js.UndefOr[Boolean] = js.undefined
    
    var allowInsertColumn: js.UndefOr[Boolean] = js.undefined
    
    var allowInsertRow: js.UndefOr[Boolean] = js.undefined
    
    var allowInvalid: js.UndefOr[Boolean] = js.undefined
    
    var allowRemoveColumn: js.UndefOr[Boolean] = js.undefined
    
    var allowRemoveRow: js.UndefOr[Boolean] = js.undefined
    
    var autoColumnSize: js.UndefOr[Settings] = js.undefined
    
    var autoRowSize: js.UndefOr[typings.handsontable.autoRowSizeAutoRowSizeMod.Settings] = js.undefined
    
    var autoWrapCol: js.UndefOr[Boolean] = js.undefined
    
    var autoWrapRow: js.UndefOr[Boolean] = js.undefined
    
    var bindRowsWithHeaders: js.UndefOr[Boolean | loose | strict] = js.undefined
    
    var cell: js.UndefOr[js.Array[CellSettings]] = js.undefined
    
    var cells: js.UndefOr[
        js.ThisFunction3[
          /* this */ CellProperties, 
          /* row */ Double, 
          /* column */ Double, 
          /* prop */ String | Double, 
          CellMeta
        ]
      ] = js.undefined
    
    var checkedTemplate: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var colHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.undefined
    
    var colWidths: js.UndefOr[
        Double | String | (js.Array[js.UndefOr[Double | String | Unit]]) | (js.Function1[/* index */ Double, js.UndefOr[String | Double]])
      ] = js.undefined
    
    var collapsibleColumns: js.UndefOr[typings.handsontable.collapsibleColumnsCollapsibleColumnsMod.Settings] = js.undefined
    
    var columnHeaderHeight: js.UndefOr[Double | js.Array[js.UndefOr[Double]]] = js.undefined
    
    var columnSorting: js.UndefOr[typings.handsontable.columnSortingColumnSortingMod.Settings] = js.undefined
    
    var columnSummary: js.UndefOr[typings.handsontable.columnSummaryColumnSummaryMod.Settings] = js.undefined
    
    var columns: js.UndefOr[js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])] = js.undefined
    
    var commentedCellClassName: js.UndefOr[String] = js.undefined
    
    var comments: js.UndefOr[typings.handsontable.commentsCommentsMod.Settings] = js.undefined
    
    var contextMenu: js.UndefOr[typings.handsontable.contextMenuContextMenuMod.Settings] = js.undefined
    
    var copyPaste: js.UndefOr[typings.handsontable.copyPasteCopyPasteMod.Settings] = js.undefined
    
    var copyable: js.UndefOr[Boolean] = js.undefined
    
    var correctFormat: js.UndefOr[Boolean] = js.undefined
    
    var currentColClassName: js.UndefOr[String] = js.undefined
    
    var currentHeaderClassName: js.UndefOr[String] = js.undefined
    
    var currentRowClassName: js.UndefOr[String] = js.undefined
    
    var customBorders: js.UndefOr[typings.handsontable.customBordersCustomBordersMod.Settings] = js.undefined
    
    var data: js.UndefOr[js.Array[js.Array[CellValue] | RowObject]] = js.undefined
    
    var dataSchema: js.UndefOr[
        RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
      ] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var datePickerConfig: js.UndefOr[PikadayOptions] = js.undefined
    
    var defaultDate: js.UndefOr[String] = js.undefined
    
    var disableVisualSelection: js.UndefOr[Boolean | current | area | header | (js.Array[current | area | header])] = js.undefined
    
    var dragToScroll: js.UndefOr[Boolean] = js.undefined
    
    var dropdownMenu: js.UndefOr[typings.handsontable.dropdownMenuDropdownMenuMod.Settings] = js.undefined
    
    var editor: js.UndefOr[
        EditorType | (Instantiable1[/* instance */ default, BaseEditor]) | Boolean | String
      ] = js.undefined
    
    var enterBeginsEditing: js.UndefOr[Boolean] = js.undefined
    
    var enterMoves: js.UndefOr[
        typings.handsontable.coordsMod.default | SimpleCellCoords | (js.Function1[
          /* event */ KeyboardEvent, 
          typings.handsontable.coordsMod.default | SimpleCellCoords
        ])
      ] = js.undefined
    
    var fillHandle: js.UndefOr[typings.handsontable.autofillAutofillMod.Settings] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var filteringCaseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[Boolean] = js.undefined
    
    var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
    
    var fixedColumnsStart: js.UndefOr[Double] = js.undefined
    
    var fixedRowsBottom: js.UndefOr[Double] = js.undefined
    
    var fixedRowsTop: js.UndefOr[Double] = js.undefined
    
    var formulas: js.UndefOr[typings.handsontable.formulasFormulasMod.Settings] = js.undefined
    
    var fragmentSelection: js.UndefOr[Boolean | cell] = js.undefined
    
    var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
    
    var hiddenColumns: js.UndefOr[typings.handsontable.hiddenColumnsHiddenColumnsMod.Settings] = js.undefined
    
    var hiddenRows: js.UndefOr[typings.handsontable.hiddenRowsHiddenRowsMod.Settings] = js.undefined
    
    var invalidCellClassName: js.UndefOr[String] = js.undefined
    
    var isEmptyCol: js.UndefOr[js.ThisFunction1[/* this */ default, /* col */ Double, Boolean]] = js.undefined
    
    var isEmptyRow: js.UndefOr[js.ThisFunction1[/* this */ default, /* row */ Double, Boolean]] = js.undefined
    
    var label: js.UndefOr[LabelOptions] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var layoutDirection: js.UndefOr[ltr | rtl | inherit] = js.undefined
    
    var licenseKey: js.UndefOr[String | `non-commercial-and-evaluation`] = js.undefined
    
    var manualColumnFreeze: js.UndefOr[Boolean] = js.undefined
    
    var manualColumnMove: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
    
    var manualColumnResize: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
    
    var manualRowMove: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
    
    var manualRowResize: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
    
    var maxCols: js.UndefOr[Double] = js.undefined
    
    var maxRows: js.UndefOr[Double] = js.undefined
    
    var mergeCells: js.UndefOr[typings.handsontable.mergeCellsMergeCellsMod.Settings] = js.undefined
    
    var minCols: js.UndefOr[Double] = js.undefined
    
    var minRows: js.UndefOr[Double] = js.undefined
    
    var minSpareCols: js.UndefOr[Double] = js.undefined
    
    var minSpareRows: js.UndefOr[Double] = js.undefined
    
    var multiColumnSorting: js.UndefOr[typings.handsontable.columnSortingColumnSortingMod.Settings] = js.undefined
    
    var nestedHeaders: js.UndefOr[typings.handsontable.nestedHeadersNestedHeadersMod.Settings] = js.undefined
    
    var nestedRows: js.UndefOr[Boolean] = js.undefined
    
    var noWordWrapClassName: js.UndefOr[String] = js.undefined
    
    var numericFormat: js.UndefOr[NumericFormatOptions] = js.undefined
    
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
    
    var renderer: js.UndefOr[RendererType | String | BaseRenderer] = js.undefined
    
    var rowHeaderWidth: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var rowHeaders: js.UndefOr[Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])] = js.undefined
    
    var rowHeights: js.UndefOr[
        Double | String | (js.Array[js.UndefOr[Double | String | Unit]]) | (js.Function1[/* index */ Double, js.UndefOr[String | Double]])
      ] = js.undefined
    
    var search: js.UndefOr[typings.handsontable.searchSearchMod.Settings] = js.undefined
    
    var selectOptions: js.UndefOr[
        js.Array[String] | SelectOptionsObject | (js.Function3[
          /* visualRow */ Double, 
          /* visualColumn */ Double, 
          /* prop */ String | Double, 
          js.Array[String] | SelectOptionsObject
        ])
      ] = js.undefined
    
    var selectionMode: js.UndefOr[single | range | multiple] = js.undefined
    
    var skipColumnOnPaste: js.UndefOr[Boolean] = js.undefined
    
    var skipRowOnPaste: js.UndefOr[Boolean] = js.undefined
    
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
    
    var tabMoves: js.UndefOr[
        typings.handsontable.coordsMod.default | SimpleCellCoords | (js.Function1[
          /* event */ KeyboardEvent, 
          typings.handsontable.coordsMod.default | SimpleCellCoords
        ])
      ] = js.undefined
    
    var tableClassName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var trimDropdown: js.UndefOr[Boolean] = js.undefined
    
    var trimRows: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
    
    var trimWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[CellType | String] = js.undefined
    
    var uncheckedTemplate: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var undo: js.UndefOr[Boolean] = js.undefined
    
    var validator: js.UndefOr[BaseValidator_ | js.RegExp | ValidatorType | String] = js.undefined
    
    var viewportColumnRenderingOffset: js.UndefOr[Double | auto] = js.undefined
    
    var viewportRowRenderingOffset: js.UndefOr[Double | auto] = js.undefined
    
    var visibleRows: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
  }
  object GridSettings {
    
    inline def apply(): GridSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridSettings]
    }
    
    extension [Self <: GridSettings](x: Self) {
      
      inline def setActiveHeaderClassName(value: String): Self = StObject.set(x, "activeHeaderClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderClassNameUndefined: Self = StObject.set(x, "activeHeaderClassName", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
      
      inline def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
      
      inline def setAllowInsertColumn(value: Boolean): Self = StObject.set(x, "allowInsertColumn", value.asInstanceOf[js.Any])
      
      inline def setAllowInsertColumnUndefined: Self = StObject.set(x, "allowInsertColumn", js.undefined)
      
      inline def setAllowInsertRow(value: Boolean): Self = StObject.set(x, "allowInsertRow", value.asInstanceOf[js.Any])
      
      inline def setAllowInsertRowUndefined: Self = StObject.set(x, "allowInsertRow", js.undefined)
      
      inline def setAllowInvalid(value: Boolean): Self = StObject.set(x, "allowInvalid", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidUndefined: Self = StObject.set(x, "allowInvalid", js.undefined)
      
      inline def setAllowRemoveColumn(value: Boolean): Self = StObject.set(x, "allowRemoveColumn", value.asInstanceOf[js.Any])
      
      inline def setAllowRemoveColumnUndefined: Self = StObject.set(x, "allowRemoveColumn", js.undefined)
      
      inline def setAllowRemoveRow(value: Boolean): Self = StObject.set(x, "allowRemoveRow", value.asInstanceOf[js.Any])
      
      inline def setAllowRemoveRowUndefined: Self = StObject.set(x, "allowRemoveRow", js.undefined)
      
      inline def setAutoColumnSize(value: Settings): Self = StObject.set(x, "autoColumnSize", value.asInstanceOf[js.Any])
      
      inline def setAutoColumnSizeUndefined: Self = StObject.set(x, "autoColumnSize", js.undefined)
      
      inline def setAutoRowSize(value: typings.handsontable.autoRowSizeAutoRowSizeMod.Settings): Self = StObject.set(x, "autoRowSize", value.asInstanceOf[js.Any])
      
      inline def setAutoRowSizeUndefined: Self = StObject.set(x, "autoRowSize", js.undefined)
      
      inline def setAutoWrapCol(value: Boolean): Self = StObject.set(x, "autoWrapCol", value.asInstanceOf[js.Any])
      
      inline def setAutoWrapColUndefined: Self = StObject.set(x, "autoWrapCol", js.undefined)
      
      inline def setAutoWrapRow(value: Boolean): Self = StObject.set(x, "autoWrapRow", value.asInstanceOf[js.Any])
      
      inline def setAutoWrapRowUndefined: Self = StObject.set(x, "autoWrapRow", js.undefined)
      
      inline def setBindRowsWithHeaders(value: Boolean | loose | strict): Self = StObject.set(x, "bindRowsWithHeaders", value.asInstanceOf[js.Any])
      
      inline def setBindRowsWithHeadersUndefined: Self = StObject.set(x, "bindRowsWithHeaders", js.undefined)
      
      inline def setCell(value: js.Array[CellSettings]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellVarargs(value: CellSettings*): Self = StObject.set(x, "cell", js.Array(value*))
      
      inline def setCells(
        value: js.ThisFunction3[
              /* this */ CellProperties, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              CellMeta
            ]
      ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCheckedTemplate(value: Boolean | String | Double): Self = StObject.set(x, "checkedTemplate", value.asInstanceOf[js.Any])
      
      inline def setCheckedTemplateUndefined: Self = StObject.set(x, "checkedTemplate", js.undefined)
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setColHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = StObject.set(x, "colHeaders", value.asInstanceOf[js.Any])
      
      inline def setColHeadersFunction1(value: /* index */ Double => String): Self = StObject.set(x, "colHeaders", js.Any.fromFunction1(value))
      
      inline def setColHeadersUndefined: Self = StObject.set(x, "colHeaders", js.undefined)
      
      inline def setColHeadersVarargs(value: String*): Self = StObject.set(x, "colHeaders", js.Array(value*))
      
      inline def setColWidths(
        value: Double | String | (js.Array[js.UndefOr[Double | String | Unit]]) | (js.Function1[/* index */ Double, js.UndefOr[String | Double]])
      ): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsFunction1(value: /* index */ Double => js.UndefOr[String | Double]): Self = StObject.set(x, "colWidths", js.Any.fromFunction1(value))
      
      inline def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      inline def setColWidthsVarargs(value: (js.UndefOr[Double | String | Unit])*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setCollapsibleColumns(value: typings.handsontable.collapsibleColumnsCollapsibleColumnsMod.Settings): Self = StObject.set(x, "collapsibleColumns", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleColumnsUndefined: Self = StObject.set(x, "collapsibleColumns", js.undefined)
      
      inline def setCollapsibleColumnsVarargs(value: DetailedSettings*): Self = StObject.set(x, "collapsibleColumns", js.Array(value*))
      
      inline def setColumnHeaderHeight(value: Double | js.Array[js.UndefOr[Double]]): Self = StObject.set(x, "columnHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderHeightUndefined: Self = StObject.set(x, "columnHeaderHeight", js.undefined)
      
      inline def setColumnHeaderHeightVarargs(value: js.UndefOr[Double]*): Self = StObject.set(x, "columnHeaderHeight", js.Array(value*))
      
      inline def setColumnSorting(value: typings.handsontable.columnSortingColumnSortingMod.Settings): Self = StObject.set(x, "columnSorting", value.asInstanceOf[js.Any])
      
      inline def setColumnSortingUndefined: Self = StObject.set(x, "columnSorting", js.undefined)
      
      inline def setColumnSummary(value: typings.handsontable.columnSummaryColumnSummaryMod.Settings): Self = StObject.set(x, "columnSummary", value.asInstanceOf[js.Any])
      
      inline def setColumnSummaryFunction0(value: () => js.Array[typings.handsontable.columnSummaryColumnSummaryMod.DetailedSettings]): Self = StObject.set(x, "columnSummary", js.Any.fromFunction0(value))
      
      inline def setColumnSummaryUndefined: Self = StObject.set(x, "columnSummary", js.undefined)
      
      inline def setColumnSummaryVarargs(value: typings.handsontable.columnSummaryColumnSummaryMod.DetailedSettings*): Self = StObject.set(x, "columnSummary", js.Array(value*))
      
      inline def setColumns(value: js.Array[ColumnSettings] | (js.Function1[/* index */ Double, ColumnSettings])): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsFunction1(value: /* index */ Double => ColumnSettings): Self = StObject.set(x, "columns", js.Any.fromFunction1(value))
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: ColumnSettings*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCommentedCellClassName(value: String): Self = StObject.set(x, "commentedCellClassName", value.asInstanceOf[js.Any])
      
      inline def setCommentedCellClassNameUndefined: Self = StObject.set(x, "commentedCellClassName", js.undefined)
      
      inline def setComments(value: typings.handsontable.commentsCommentsMod.Settings): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setContextMenu(value: typings.handsontable.contextMenuContextMenuMod.Settings): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setContextMenuVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "contextMenu", js.Array(value*))
      
      inline def setCopyPaste(value: typings.handsontable.copyPasteCopyPasteMod.Settings): Self = StObject.set(x, "copyPaste", value.asInstanceOf[js.Any])
      
      inline def setCopyPasteUndefined: Self = StObject.set(x, "copyPaste", js.undefined)
      
      inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      inline def setCorrectFormat(value: Boolean): Self = StObject.set(x, "correctFormat", value.asInstanceOf[js.Any])
      
      inline def setCorrectFormatUndefined: Self = StObject.set(x, "correctFormat", js.undefined)
      
      inline def setCurrentColClassName(value: String): Self = StObject.set(x, "currentColClassName", value.asInstanceOf[js.Any])
      
      inline def setCurrentColClassNameUndefined: Self = StObject.set(x, "currentColClassName", js.undefined)
      
      inline def setCurrentHeaderClassName(value: String): Self = StObject.set(x, "currentHeaderClassName", value.asInstanceOf[js.Any])
      
      inline def setCurrentHeaderClassNameUndefined: Self = StObject.set(x, "currentHeaderClassName", js.undefined)
      
      inline def setCurrentRowClassName(value: String): Self = StObject.set(x, "currentRowClassName", value.asInstanceOf[js.Any])
      
      inline def setCurrentRowClassNameUndefined: Self = StObject.set(x, "currentRowClassName", js.undefined)
      
      inline def setCustomBorders(value: typings.handsontable.customBordersCustomBordersMod.Settings): Self = StObject.set(x, "customBorders", value.asInstanceOf[js.Any])
      
      inline def setCustomBordersUndefined: Self = StObject.set(x, "customBorders", js.undefined)
      
      inline def setCustomBordersVarargs(value: typings.handsontable.customBordersCustomBordersMod.DetailedSettings*): Self = StObject.set(x, "customBorders", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[CellValue] | RowObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataSchema(
        value: RowObject | js.Array[CellValue] | (js.Function1[/* row */ Double, RowObject | js.Array[CellValue]])
      ): Self = StObject.set(x, "dataSchema", value.asInstanceOf[js.Any])
      
      inline def setDataSchemaFunction1(value: /* row */ Double => RowObject | js.Array[CellValue]): Self = StObject.set(x, "dataSchema", js.Any.fromFunction1(value))
      
      inline def setDataSchemaUndefined: Self = StObject.set(x, "dataSchema", js.undefined)
      
      inline def setDataSchemaVarargs(value: CellValue*): Self = StObject.set(x, "dataSchema", js.Array(value*))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: (js.Array[CellValue] | RowObject)*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDatePickerConfig(value: PikadayOptions): Self = StObject.set(x, "datePickerConfig", value.asInstanceOf[js.Any])
      
      inline def setDatePickerConfigUndefined: Self = StObject.set(x, "datePickerConfig", js.undefined)
      
      inline def setDefaultDate(value: String): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
      
      inline def setDisableVisualSelection(value: Boolean | current | area | header | (js.Array[current | area | header])): Self = StObject.set(x, "disableVisualSelection", value.asInstanceOf[js.Any])
      
      inline def setDisableVisualSelectionUndefined: Self = StObject.set(x, "disableVisualSelection", js.undefined)
      
      inline def setDisableVisualSelectionVarargs(value: (current | area | header)*): Self = StObject.set(x, "disableVisualSelection", js.Array(value*))
      
      inline def setDragToScroll(value: Boolean): Self = StObject.set(x, "dragToScroll", value.asInstanceOf[js.Any])
      
      inline def setDragToScrollUndefined: Self = StObject.set(x, "dragToScroll", js.undefined)
      
      inline def setDropdownMenu(value: typings.handsontable.dropdownMenuDropdownMenuMod.Settings): Self = StObject.set(x, "dropdownMenu", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenuUndefined: Self = StObject.set(x, "dropdownMenu", js.undefined)
      
      inline def setDropdownMenuVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "dropdownMenu", js.Array(value*))
      
      inline def setEditor(value: EditorType | (Instantiable1[/* instance */ default, BaseEditor]) | Boolean | String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setEnterBeginsEditing(value: Boolean): Self = StObject.set(x, "enterBeginsEditing", value.asInstanceOf[js.Any])
      
      inline def setEnterBeginsEditingUndefined: Self = StObject.set(x, "enterBeginsEditing", js.undefined)
      
      inline def setEnterMoves(
        value: typings.handsontable.coordsMod.default | SimpleCellCoords | (js.Function1[
              /* event */ KeyboardEvent, 
              typings.handsontable.coordsMod.default | SimpleCellCoords
            ])
      ): Self = StObject.set(x, "enterMoves", value.asInstanceOf[js.Any])
      
      inline def setEnterMovesFunction1(value: /* event */ KeyboardEvent => typings.handsontable.coordsMod.default | SimpleCellCoords): Self = StObject.set(x, "enterMoves", js.Any.fromFunction1(value))
      
      inline def setEnterMovesUndefined: Self = StObject.set(x, "enterMoves", js.undefined)
      
      inline def setFillHandle(value: typings.handsontable.autofillAutofillMod.Settings): Self = StObject.set(x, "fillHandle", value.asInstanceOf[js.Any])
      
      inline def setFillHandleUndefined: Self = StObject.set(x, "fillHandle", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilteringCaseSensitive(value: Boolean): Self = StObject.set(x, "filteringCaseSensitive", value.asInstanceOf[js.Any])
      
      inline def setFilteringCaseSensitiveUndefined: Self = StObject.set(x, "filteringCaseSensitive", js.undefined)
      
      inline def setFilters(value: Boolean): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFixedColumnsLeft(value: Double): Self = StObject.set(x, "fixedColumnsLeft", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsLeftUndefined: Self = StObject.set(x, "fixedColumnsLeft", js.undefined)
      
      inline def setFixedColumnsStart(value: Double): Self = StObject.set(x, "fixedColumnsStart", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsStartUndefined: Self = StObject.set(x, "fixedColumnsStart", js.undefined)
      
      inline def setFixedRowsBottom(value: Double): Self = StObject.set(x, "fixedRowsBottom", value.asInstanceOf[js.Any])
      
      inline def setFixedRowsBottomUndefined: Self = StObject.set(x, "fixedRowsBottom", js.undefined)
      
      inline def setFixedRowsTop(value: Double): Self = StObject.set(x, "fixedRowsTop", value.asInstanceOf[js.Any])
      
      inline def setFixedRowsTopUndefined: Self = StObject.set(x, "fixedRowsTop", js.undefined)
      
      inline def setFormulas(value: typings.handsontable.formulasFormulasMod.Settings): Self = StObject.set(x, "formulas", value.asInstanceOf[js.Any])
      
      inline def setFormulasUndefined: Self = StObject.set(x, "formulas", js.undefined)
      
      inline def setFragmentSelection(value: Boolean | cell): Self = StObject.set(x, "fragmentSelection", value.asInstanceOf[js.Any])
      
      inline def setFragmentSelectionUndefined: Self = StObject.set(x, "fragmentSelection", js.undefined)
      
      inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHiddenColumns(value: typings.handsontable.hiddenColumnsHiddenColumnsMod.Settings): Self = StObject.set(x, "hiddenColumns", value.asInstanceOf[js.Any])
      
      inline def setHiddenColumnsUndefined: Self = StObject.set(x, "hiddenColumns", js.undefined)
      
      inline def setHiddenRows(value: typings.handsontable.hiddenRowsHiddenRowsMod.Settings): Self = StObject.set(x, "hiddenRows", value.asInstanceOf[js.Any])
      
      inline def setHiddenRowsUndefined: Self = StObject.set(x, "hiddenRows", js.undefined)
      
      inline def setInvalidCellClassName(value: String): Self = StObject.set(x, "invalidCellClassName", value.asInstanceOf[js.Any])
      
      inline def setInvalidCellClassNameUndefined: Self = StObject.set(x, "invalidCellClassName", js.undefined)
      
      inline def setIsEmptyCol(value: js.ThisFunction1[/* this */ default, /* col */ Double, Boolean]): Self = StObject.set(x, "isEmptyCol", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyColUndefined: Self = StObject.set(x, "isEmptyCol", js.undefined)
      
      inline def setIsEmptyRow(value: js.ThisFunction1[/* this */ default, /* row */ Double, Boolean]): Self = StObject.set(x, "isEmptyRow", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyRowUndefined: Self = StObject.set(x, "isEmptyRow", js.undefined)
      
      inline def setLabel(value: LabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLayoutDirection(value: ltr | rtl | inherit): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setLicenseKey(value: String | `non-commercial-and-evaluation`): Self = StObject.set(x, "licenseKey", value.asInstanceOf[js.Any])
      
      inline def setLicenseKeyUndefined: Self = StObject.set(x, "licenseKey", js.undefined)
      
      inline def setManualColumnFreeze(value: Boolean): Self = StObject.set(x, "manualColumnFreeze", value.asInstanceOf[js.Any])
      
      inline def setManualColumnFreezeUndefined: Self = StObject.set(x, "manualColumnFreeze", js.undefined)
      
      inline def setManualColumnMove(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualColumnMove", value.asInstanceOf[js.Any])
      
      inline def setManualColumnMoveUndefined: Self = StObject.set(x, "manualColumnMove", js.undefined)
      
      inline def setManualColumnMoveVarargs(value: Double*): Self = StObject.set(x, "manualColumnMove", js.Array(value*))
      
      inline def setManualColumnResize(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualColumnResize", value.asInstanceOf[js.Any])
      
      inline def setManualColumnResizeUndefined: Self = StObject.set(x, "manualColumnResize", js.undefined)
      
      inline def setManualColumnResizeVarargs(value: Double*): Self = StObject.set(x, "manualColumnResize", js.Array(value*))
      
      inline def setManualRowMove(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualRowMove", value.asInstanceOf[js.Any])
      
      inline def setManualRowMoveUndefined: Self = StObject.set(x, "manualRowMove", js.undefined)
      
      inline def setManualRowMoveVarargs(value: Double*): Self = StObject.set(x, "manualRowMove", js.Array(value*))
      
      inline def setManualRowResize(value: Boolean | js.Array[Double]): Self = StObject.set(x, "manualRowResize", value.asInstanceOf[js.Any])
      
      inline def setManualRowResizeUndefined: Self = StObject.set(x, "manualRowResize", js.undefined)
      
      inline def setManualRowResizeVarargs(value: Double*): Self = StObject.set(x, "manualRowResize", js.Array(value*))
      
      inline def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
      
      inline def setMaxColsUndefined: Self = StObject.set(x, "maxCols", js.undefined)
      
      inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
      
      inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
      
      inline def setMergeCells(value: typings.handsontable.mergeCellsMergeCellsMod.Settings): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
      
      inline def setMergeCellsVarargs(value: typings.handsontable.mergeCellsMergeCellsMod.DetailedSettings*): Self = StObject.set(x, "mergeCells", js.Array(value*))
      
      inline def setMinCols(value: Double): Self = StObject.set(x, "minCols", value.asInstanceOf[js.Any])
      
      inline def setMinColsUndefined: Self = StObject.set(x, "minCols", js.undefined)
      
      inline def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
      
      inline def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
      
      inline def setMinSpareCols(value: Double): Self = StObject.set(x, "minSpareCols", value.asInstanceOf[js.Any])
      
      inline def setMinSpareColsUndefined: Self = StObject.set(x, "minSpareCols", js.undefined)
      
      inline def setMinSpareRows(value: Double): Self = StObject.set(x, "minSpareRows", value.asInstanceOf[js.Any])
      
      inline def setMinSpareRowsUndefined: Self = StObject.set(x, "minSpareRows", js.undefined)
      
      inline def setMultiColumnSorting(value: typings.handsontable.columnSortingColumnSortingMod.Settings): Self = StObject.set(x, "multiColumnSorting", value.asInstanceOf[js.Any])
      
      inline def setMultiColumnSortingUndefined: Self = StObject.set(x, "multiColumnSorting", js.undefined)
      
      inline def setNestedHeaders(value: typings.handsontable.nestedHeadersNestedHeadersMod.Settings): Self = StObject.set(x, "nestedHeaders", value.asInstanceOf[js.Any])
      
      inline def setNestedHeadersUndefined: Self = StObject.set(x, "nestedHeaders", js.undefined)
      
      inline def setNestedHeadersVarargs(value: (js.Array[String | typings.handsontable.nestedHeadersNestedHeadersMod.DetailedSettings])*): Self = StObject.set(x, "nestedHeaders", js.Array(value*))
      
      inline def setNestedRows(value: Boolean): Self = StObject.set(x, "nestedRows", value.asInstanceOf[js.Any])
      
      inline def setNestedRowsUndefined: Self = StObject.set(x, "nestedRows", js.undefined)
      
      inline def setNoWordWrapClassName(value: String): Self = StObject.set(x, "noWordWrapClassName", value.asInstanceOf[js.Any])
      
      inline def setNoWordWrapClassNameUndefined: Self = StObject.set(x, "noWordWrapClassName", js.undefined)
      
      inline def setNumericFormat(value: NumericFormatOptions): Self = StObject.set(x, "numericFormat", value.asInstanceOf[js.Any])
      
      inline def setNumericFormatUndefined: Self = StObject.set(x, "numericFormat", js.undefined)
      
      inline def setObserveDOMVisibility(value: Boolean): Self = StObject.set(x, "observeDOMVisibility", value.asInstanceOf[js.Any])
      
      inline def setObserveDOMVisibilityUndefined: Self = StObject.set(x, "observeDOMVisibility", js.undefined)
      
      inline def setOutsideClickDeselects(value: Boolean | (js.Function1[/* target */ HTMLElement, Boolean])): Self = StObject.set(x, "outsideClickDeselects", value.asInstanceOf[js.Any])
      
      inline def setOutsideClickDeselectsFunction1(value: /* target */ HTMLElement => Boolean): Self = StObject.set(x, "outsideClickDeselects", js.Any.fromFunction1(value))
      
      inline def setOutsideClickDeselectsUndefined: Self = StObject.set(x, "outsideClickDeselects", js.undefined)
      
      inline def setPersistentState(value: Boolean): Self = StObject.set(x, "persistentState", value.asInstanceOf[js.Any])
      
      inline def setPersistentStateUndefined: Self = StObject.set(x, "persistentState", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCellClassName(value: String): Self = StObject.set(x, "placeholderCellClassName", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCellClassNameUndefined: Self = StObject.set(x, "placeholderCellClassName", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPreventOverflow(value: Boolean | vertical | horizontal): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
      
      inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
      
      inline def setPreventWheel(value: Boolean): Self = StObject.set(x, "preventWheel", value.asInstanceOf[js.Any])
      
      inline def setPreventWheelUndefined: Self = StObject.set(x, "preventWheel", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyCellClassName(value: String): Self = StObject.set(x, "readOnlyCellClassName", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyCellClassNameUndefined: Self = StObject.set(x, "readOnlyCellClassName", js.undefined)
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderAllRows(value: Boolean): Self = StObject.set(x, "renderAllRows", value.asInstanceOf[js.Any])
      
      inline def setRenderAllRowsUndefined: Self = StObject.set(x, "renderAllRows", js.undefined)
      
      inline def setRenderer(value: RendererType | String | BaseRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererFunction7(
        value: (/* instance */ default, /* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ Any, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction7(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setRowHeaderWidth(value: Double | js.Array[Double]): Self = StObject.set(x, "rowHeaderWidth", value.asInstanceOf[js.Any])
      
      inline def setRowHeaderWidthUndefined: Self = StObject.set(x, "rowHeaderWidth", js.undefined)
      
      inline def setRowHeaderWidthVarargs(value: Double*): Self = StObject.set(x, "rowHeaderWidth", js.Array(value*))
      
      inline def setRowHeaders(value: Boolean | js.Array[String] | (js.Function1[/* index */ Double, String])): Self = StObject.set(x, "rowHeaders", value.asInstanceOf[js.Any])
      
      inline def setRowHeadersFunction1(value: /* index */ Double => String): Self = StObject.set(x, "rowHeaders", js.Any.fromFunction1(value))
      
      inline def setRowHeadersUndefined: Self = StObject.set(x, "rowHeaders", js.undefined)
      
      inline def setRowHeadersVarargs(value: String*): Self = StObject.set(x, "rowHeaders", js.Array(value*))
      
      inline def setRowHeights(
        value: Double | String | (js.Array[js.UndefOr[Double | String | Unit]]) | (js.Function1[/* index */ Double, js.UndefOr[String | Double]])
      ): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsFunction1(value: /* index */ Double => js.UndefOr[String | Double]): Self = StObject.set(x, "rowHeights", js.Any.fromFunction1(value))
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (js.UndefOr[Double | String | Unit])*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setSearch(value: typings.handsontable.searchSearchMod.Settings): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectOptions(
        value: js.Array[String] | SelectOptionsObject | (js.Function3[
              /* visualRow */ Double, 
              /* visualColumn */ Double, 
              /* prop */ String | Double, 
              js.Array[String] | SelectOptionsObject
            ])
      ): Self = StObject.set(x, "selectOptions", value.asInstanceOf[js.Any])
      
      inline def setSelectOptionsFunction3(
        value: (/* visualRow */ Double, /* visualColumn */ Double, /* prop */ String | Double) => js.Array[String] | SelectOptionsObject
      ): Self = StObject.set(x, "selectOptions", js.Any.fromFunction3(value))
      
      inline def setSelectOptionsUndefined: Self = StObject.set(x, "selectOptions", js.undefined)
      
      inline def setSelectOptionsVarargs(value: String*): Self = StObject.set(x, "selectOptions", js.Array(value*))
      
      inline def setSelectionMode(value: single | range | multiple): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSkipColumnOnPaste(value: Boolean): Self = StObject.set(x, "skipColumnOnPaste", value.asInstanceOf[js.Any])
      
      inline def setSkipColumnOnPasteUndefined: Self = StObject.set(x, "skipColumnOnPaste", js.undefined)
      
      inline def setSkipRowOnPaste(value: Boolean): Self = StObject.set(x, "skipRowOnPaste", value.asInstanceOf[js.Any])
      
      inline def setSkipRowOnPasteUndefined: Self = StObject.set(x, "skipRowOnPaste", js.undefined)
      
      inline def setSortByRelevance(value: Boolean): Self = StObject.set(x, "sortByRelevance", value.asInstanceOf[js.Any])
      
      inline def setSortByRelevanceUndefined: Self = StObject.set(x, "sortByRelevance", js.undefined)
      
      inline def setSource(
        value: (js.Array[Double | String]) | (js.ThisFunction2[
              /* this */ CellProperties, 
              /* query */ String, 
              /* callback */ js.Function1[/* items */ js.Array[String], Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: (Double | String)*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setStartCols(value: Double): Self = StObject.set(x, "startCols", value.asInstanceOf[js.Any])
      
      inline def setStartColsUndefined: Self = StObject.set(x, "startCols", js.undefined)
      
      inline def setStartRows(value: Double): Self = StObject.set(x, "startRows", value.asInstanceOf[js.Any])
      
      inline def setStartRowsUndefined: Self = StObject.set(x, "startRows", js.undefined)
      
      inline def setStretchH(value: none | all | last): Self = StObject.set(x, "stretchH", value.asInstanceOf[js.Any])
      
      inline def setStretchHUndefined: Self = StObject.set(x, "stretchH", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTabMoves(
        value: typings.handsontable.coordsMod.default | SimpleCellCoords | (js.Function1[
              /* event */ KeyboardEvent, 
              typings.handsontable.coordsMod.default | SimpleCellCoords
            ])
      ): Self = StObject.set(x, "tabMoves", value.asInstanceOf[js.Any])
      
      inline def setTabMovesFunction1(value: /* event */ KeyboardEvent => typings.handsontable.coordsMod.default | SimpleCellCoords): Self = StObject.set(x, "tabMoves", js.Any.fromFunction1(value))
      
      inline def setTabMovesUndefined: Self = StObject.set(x, "tabMoves", js.undefined)
      
      inline def setTableClassName(value: String | js.Array[String]): Self = StObject.set(x, "tableClassName", value.asInstanceOf[js.Any])
      
      inline def setTableClassNameUndefined: Self = StObject.set(x, "tableClassName", js.undefined)
      
      inline def setTableClassNameVarargs(value: String*): Self = StObject.set(x, "tableClassName", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrimDropdown(value: Boolean): Self = StObject.set(x, "trimDropdown", value.asInstanceOf[js.Any])
      
      inline def setTrimDropdownUndefined: Self = StObject.set(x, "trimDropdown", js.undefined)
      
      inline def setTrimRows(value: Boolean | js.Array[Double]): Self = StObject.set(x, "trimRows", value.asInstanceOf[js.Any])
      
      inline def setTrimRowsUndefined: Self = StObject.set(x, "trimRows", js.undefined)
      
      inline def setTrimRowsVarargs(value: Double*): Self = StObject.set(x, "trimRows", js.Array(value*))
      
      inline def setTrimWhitespace(value: Boolean): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimWhitespaceUndefined: Self = StObject.set(x, "trimWhitespace", js.undefined)
      
      inline def setType(value: CellType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUncheckedTemplate(value: Boolean | String | Double): Self = StObject.set(x, "uncheckedTemplate", value.asInstanceOf[js.Any])
      
      inline def setUncheckedTemplateUndefined: Self = StObject.set(x, "uncheckedTemplate", js.undefined)
      
      inline def setUndo(value: Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
      
      inline def setValidator(value: BaseValidator_ | js.RegExp | ValidatorType | String): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setViewportColumnRenderingOffset(value: Double | auto): Self = StObject.set(x, "viewportColumnRenderingOffset", value.asInstanceOf[js.Any])
      
      inline def setViewportColumnRenderingOffsetUndefined: Self = StObject.set(x, "viewportColumnRenderingOffset", js.undefined)
      
      inline def setViewportRowRenderingOffset(value: Double | auto): Self = StObject.set(x, "viewportRowRenderingOffset", value.asInstanceOf[js.Any])
      
      inline def setViewportRowRenderingOffsetUndefined: Self = StObject.set(x, "viewportRowRenderingOffset", js.undefined)
      
      inline def setVisibleRows(value: Double): Self = StObject.set(x, "visibleRows", value.asInstanceOf[js.Any])
      
      inline def setVisibleRowsUndefined: Self = StObject.set(x, "visibleRows", js.undefined)
      
      inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
