package typings.handsontable.handsontableMod.Handsontable

import typings.handsontable.handsontableMod.Handsontable.plugins.AutoColumnSize
import typings.handsontable.handsontableMod.Handsontable.plugins.AutoRowSize
import typings.handsontable.handsontableMod.Handsontable.plugins.Autofill
import typings.handsontable.handsontableMod.Handsontable.plugins.BasePlugin
import typings.handsontable.handsontableMod.Handsontable.plugins.BindRowsWithHeaders
import typings.handsontable.handsontableMod.Handsontable.plugins.CollapsibleColumns
import typings.handsontable.handsontableMod.Handsontable.plugins.ColumnSorting
import typings.handsontable.handsontableMod.Handsontable.plugins.ColumnSummary
import typings.handsontable.handsontableMod.Handsontable.plugins.Comments
import typings.handsontable.handsontableMod.Handsontable.plugins.ContextMenu
import typings.handsontable.handsontableMod.Handsontable.plugins.CopyPaste
import typings.handsontable.handsontableMod.Handsontable.plugins.DragToScroll
import typings.handsontable.handsontableMod.Handsontable.plugins.DropdownMenu
import typings.handsontable.handsontableMod.Handsontable.plugins.ExportFile
import typings.handsontable.handsontableMod.Handsontable.plugins.Filters
import typings.handsontable.handsontableMod.Handsontable.plugins.Formulas
import typings.handsontable.handsontableMod.Handsontable.plugins.GanttChart
import typings.handsontable.handsontableMod.Handsontable.plugins.HeaderTooltips
import typings.handsontable.handsontableMod.Handsontable.plugins.HiddenColumns
import typings.handsontable.handsontableMod.Handsontable.plugins.HiddenRows
import typings.handsontable.handsontableMod.Handsontable.plugins.ManualColumnFreeze
import typings.handsontable.handsontableMod.Handsontable.plugins.ManualColumnMove
import typings.handsontable.handsontableMod.Handsontable.plugins.ManualColumnResize
import typings.handsontable.handsontableMod.Handsontable.plugins.ManualRowMove
import typings.handsontable.handsontableMod.Handsontable.plugins.ManualRowResize
import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCells
import typings.handsontable.handsontableMod.Handsontable.plugins.MultiColumnSorting
import typings.handsontable.handsontableMod.Handsontable.plugins.MultipleSelectionHandles
import typings.handsontable.handsontableMod.Handsontable.plugins.NestedHeaders
import typings.handsontable.handsontableMod.Handsontable.plugins.NestedRows
import typings.handsontable.handsontableMod.Handsontable.plugins.ObserveChanges
import typings.handsontable.handsontableMod.Handsontable.plugins.PersistenState
import typings.handsontable.handsontableMod.Handsontable.plugins.Search
import typings.handsontable.handsontableMod.Handsontable.plugins.TouchScroll
import typings.handsontable.handsontableMod.Handsontable.plugins.TrimRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Plugin collection, map for getPlugin method
trait PluginsCollection extends js.Object {
  var autoColumnSize: AutoColumnSize
  var autoRowSize: AutoRowSize
  var autofill: Autofill
  var basePlugin: BasePlugin
  var bindRowsWithHeaders: BindRowsWithHeaders
  var collapsibleColumns: CollapsibleColumns
  var columnSorting: ColumnSorting
  var columnSummary: ColumnSummary
  var comments: Comments
  var contextMenu: ContextMenu
  var copyPaste: CopyPaste
  var dragToScroll: DragToScroll
  var dropdownMenu: DropdownMenu
  var exportFile: ExportFile
  var filters: Filters
  var formulas: Formulas
  var ganttChart: GanttChart
  var headerTooltips: HeaderTooltips
  var hiddenColumns: HiddenColumns
  var hiddenRows: HiddenRows
  var manualColumnFreeze: ManualColumnFreeze
  var manualColumnMove: ManualColumnMove
  var manualColumnResize: ManualColumnResize
  var manualRowMove: ManualRowMove
  var manualRowResize: ManualRowResize
  var mergeCells: MergeCells
  var multiColumnSorting: MultiColumnSorting
  var multipleSelectionHandles: MultipleSelectionHandles
  var nestedHeaders: NestedHeaders
  var nestedRows: NestedRows
  var observeChanges: ObserveChanges
  var persistentState: PersistenState
  var search: Search
  var touchScroll: TouchScroll
  var trimRows: TrimRows
}

object PluginsCollection {
  @scala.inline
  def apply(
    autoColumnSize: AutoColumnSize,
    autoRowSize: AutoRowSize,
    autofill: Autofill,
    basePlugin: BasePlugin,
    bindRowsWithHeaders: BindRowsWithHeaders,
    collapsibleColumns: CollapsibleColumns,
    columnSorting: ColumnSorting,
    columnSummary: ColumnSummary,
    comments: Comments,
    contextMenu: ContextMenu,
    copyPaste: CopyPaste,
    dragToScroll: DragToScroll,
    dropdownMenu: DropdownMenu,
    exportFile: ExportFile,
    filters: Filters,
    formulas: Formulas,
    ganttChart: GanttChart,
    headerTooltips: HeaderTooltips,
    hiddenColumns: HiddenColumns,
    hiddenRows: HiddenRows,
    manualColumnFreeze: ManualColumnFreeze,
    manualColumnMove: ManualColumnMove,
    manualColumnResize: ManualColumnResize,
    manualRowMove: ManualRowMove,
    manualRowResize: ManualRowResize,
    mergeCells: MergeCells,
    multiColumnSorting: MultiColumnSorting,
    multipleSelectionHandles: MultipleSelectionHandles,
    nestedHeaders: NestedHeaders,
    nestedRows: NestedRows,
    observeChanges: ObserveChanges,
    persistentState: PersistenState,
    search: Search,
    touchScroll: TouchScroll,
    trimRows: TrimRows
  ): PluginsCollection = {
    val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize, autoRowSize = autoRowSize, autofill = autofill, basePlugin = basePlugin, bindRowsWithHeaders = bindRowsWithHeaders, collapsibleColumns = collapsibleColumns, columnSorting = columnSorting, columnSummary = columnSummary, comments = comments, contextMenu = contextMenu, copyPaste = copyPaste, dragToScroll = dragToScroll, dropdownMenu = dropdownMenu, exportFile = exportFile, filters = filters, formulas = formulas, ganttChart = ganttChart, headerTooltips = headerTooltips, hiddenColumns = hiddenColumns, hiddenRows = hiddenRows, manualColumnFreeze = manualColumnFreeze, manualColumnMove = manualColumnMove, manualColumnResize = manualColumnResize, manualRowMove = manualRowMove, manualRowResize = manualRowResize, mergeCells = mergeCells, multiColumnSorting = multiColumnSorting, multipleSelectionHandles = multipleSelectionHandles, nestedHeaders = nestedHeaders, nestedRows = nestedRows, observeChanges = observeChanges, persistentState = persistentState, search = search, touchScroll = touchScroll, trimRows = trimRows)
  
    __obj.asInstanceOf[PluginsCollection]
  }
}

