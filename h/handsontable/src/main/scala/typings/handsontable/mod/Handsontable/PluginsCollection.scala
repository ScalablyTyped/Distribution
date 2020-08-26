package typings.handsontable.mod.Handsontable

import typings.handsontable.mod.Handsontable.plugins.AutoColumnSize
import typings.handsontable.mod.Handsontable.plugins.AutoRowSize
import typings.handsontable.mod.Handsontable.plugins.Autofill
import typings.handsontable.mod.Handsontable.plugins.Base
import typings.handsontable.mod.Handsontable.plugins.BindRowsWithHeaders
import typings.handsontable.mod.Handsontable.plugins.CollapsibleColumns
import typings.handsontable.mod.Handsontable.plugins.ColumnSorting
import typings.handsontable.mod.Handsontable.plugins.ColumnSummary
import typings.handsontable.mod.Handsontable.plugins.Comments
import typings.handsontable.mod.Handsontable.plugins.ContextMenu
import typings.handsontable.mod.Handsontable.plugins.CopyPaste
import typings.handsontable.mod.Handsontable.plugins.DragToScroll
import typings.handsontable.mod.Handsontable.plugins.DropdownMenu
import typings.handsontable.mod.Handsontable.plugins.ExportFile
import typings.handsontable.mod.Handsontable.plugins.Filters
import typings.handsontable.mod.Handsontable.plugins.Formulas
import typings.handsontable.mod.Handsontable.plugins.GanttChart
import typings.handsontable.mod.Handsontable.plugins.HeaderTooltips
import typings.handsontable.mod.Handsontable.plugins.HiddenColumns
import typings.handsontable.mod.Handsontable.plugins.HiddenRows
import typings.handsontable.mod.Handsontable.plugins.ManualColumnFreeze
import typings.handsontable.mod.Handsontable.plugins.ManualColumnMove
import typings.handsontable.mod.Handsontable.plugins.ManualColumnResize
import typings.handsontable.mod.Handsontable.plugins.ManualRowMove
import typings.handsontable.mod.Handsontable.plugins.ManualRowResize
import typings.handsontable.mod.Handsontable.plugins.MergeCells
import typings.handsontable.mod.Handsontable.plugins.MultiColumnSorting
import typings.handsontable.mod.Handsontable.plugins.MultipleSelectionHandles
import typings.handsontable.mod.Handsontable.plugins.NestedHeaders
import typings.handsontable.mod.Handsontable.plugins.NestedRows
import typings.handsontable.mod.Handsontable.plugins.ObserveChanges
import typings.handsontable.mod.Handsontable.plugins.PersistenState
import typings.handsontable.mod.Handsontable.plugins.Search
import typings.handsontable.mod.Handsontable.plugins.TouchScroll
import typings.handsontable.mod.Handsontable.plugins.TrimRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Plugin collection, map for getPlugin method
@js.native
trait PluginsCollection extends js.Object {
  var autoColumnSize: AutoColumnSize = js.native
  var autoRowSize: AutoRowSize = js.native
  var autofill: Autofill = js.native
  var basePlugin: Base = js.native
  var bindRowsWithHeaders: BindRowsWithHeaders = js.native
  var collapsibleColumns: CollapsibleColumns = js.native
  var columnSorting: ColumnSorting = js.native
  var columnSummary: ColumnSummary = js.native
  var comments: Comments = js.native
  var contextMenu: ContextMenu = js.native
  var copyPaste: CopyPaste = js.native
  var dragToScroll: DragToScroll = js.native
  var dropdownMenu: DropdownMenu = js.native
  var exportFile: ExportFile = js.native
  var filters: Filters = js.native
  var formulas: Formulas = js.native
  var ganttChart: GanttChart = js.native
  var headerTooltips: HeaderTooltips = js.native
  var hiddenColumns: HiddenColumns = js.native
  var hiddenRows: HiddenRows = js.native
  var manualColumnFreeze: ManualColumnFreeze = js.native
  var manualColumnMove: ManualColumnMove = js.native
  var manualColumnResize: ManualColumnResize = js.native
  var manualRowMove: ManualRowMove = js.native
  var manualRowResize: ManualRowResize = js.native
  var mergeCells: MergeCells = js.native
  var multiColumnSorting: MultiColumnSorting = js.native
  var multipleSelectionHandles: MultipleSelectionHandles = js.native
  var nestedHeaders: NestedHeaders = js.native
  var nestedRows: NestedRows = js.native
  var observeChanges: ObserveChanges = js.native
  var persistentState: PersistenState = js.native
  var search: Search = js.native
  var touchScroll: TouchScroll = js.native
  var trimRows: TrimRows = js.native
}

object PluginsCollection {
  @scala.inline
  def apply(
    autoColumnSize: AutoColumnSize,
    autoRowSize: AutoRowSize,
    autofill: Autofill,
    basePlugin: Base,
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
    val __obj = js.Dynamic.literal(autoColumnSize = autoColumnSize.asInstanceOf[js.Any], autoRowSize = autoRowSize.asInstanceOf[js.Any], autofill = autofill.asInstanceOf[js.Any], basePlugin = basePlugin.asInstanceOf[js.Any], bindRowsWithHeaders = bindRowsWithHeaders.asInstanceOf[js.Any], collapsibleColumns = collapsibleColumns.asInstanceOf[js.Any], columnSorting = columnSorting.asInstanceOf[js.Any], columnSummary = columnSummary.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], copyPaste = copyPaste.asInstanceOf[js.Any], dragToScroll = dragToScroll.asInstanceOf[js.Any], dropdownMenu = dropdownMenu.asInstanceOf[js.Any], exportFile = exportFile.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], formulas = formulas.asInstanceOf[js.Any], ganttChart = ganttChart.asInstanceOf[js.Any], headerTooltips = headerTooltips.asInstanceOf[js.Any], hiddenColumns = hiddenColumns.asInstanceOf[js.Any], hiddenRows = hiddenRows.asInstanceOf[js.Any], manualColumnFreeze = manualColumnFreeze.asInstanceOf[js.Any], manualColumnMove = manualColumnMove.asInstanceOf[js.Any], manualColumnResize = manualColumnResize.asInstanceOf[js.Any], manualRowMove = manualRowMove.asInstanceOf[js.Any], manualRowResize = manualRowResize.asInstanceOf[js.Any], mergeCells = mergeCells.asInstanceOf[js.Any], multiColumnSorting = multiColumnSorting.asInstanceOf[js.Any], multipleSelectionHandles = multipleSelectionHandles.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], nestedRows = nestedRows.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], persistentState = persistentState.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], touchScroll = touchScroll.asInstanceOf[js.Any], trimRows = trimRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsCollection]
  }
  @scala.inline
  implicit class PluginsCollectionOps[Self <: PluginsCollection] (val x: Self) extends AnyVal {
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
    def setAutoColumnSize(value: AutoColumnSize): Self = this.set("autoColumnSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoRowSize(value: AutoRowSize): Self = this.set("autoRowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutofill(value: Autofill): Self = this.set("autofill", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePlugin(value: Base): Self = this.set("basePlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindRowsWithHeaders(value: BindRowsWithHeaders): Self = this.set("bindRowsWithHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsibleColumns(value: CollapsibleColumns): Self = this.set("collapsibleColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnSorting(value: ColumnSorting): Self = this.set("columnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnSummary(value: ColumnSummary): Self = this.set("columnSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def setComments(value: Comments): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextMenu(value: ContextMenu): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyPaste(value: CopyPaste): Self = this.set("copyPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragToScroll(value: DragToScroll): Self = this.set("dragToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownMenu(value: DropdownMenu): Self = this.set("dropdownMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportFile(value: ExportFile): Self = this.set("exportFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: Filters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormulas(value: Formulas): Self = this.set("formulas", value.asInstanceOf[js.Any])
    @scala.inline
    def setGanttChart(value: GanttChart): Self = this.set("ganttChart", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTooltips(value: HeaderTooltips): Self = this.set("headerTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenColumns(value: HiddenColumns): Self = this.set("hiddenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiddenRows(value: HiddenRows): Self = this.set("hiddenRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualColumnFreeze(value: ManualColumnFreeze): Self = this.set("manualColumnFreeze", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualColumnMove(value: ManualColumnMove): Self = this.set("manualColumnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualColumnResize(value: ManualColumnResize): Self = this.set("manualColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualRowMove(value: ManualRowMove): Self = this.set("manualRowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualRowResize(value: ManualRowResize): Self = this.set("manualRowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeCells(value: MergeCells): Self = this.set("mergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiColumnSorting(value: MultiColumnSorting): Self = this.set("multiColumnSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleSelectionHandles(value: MultipleSelectionHandles): Self = this.set("multipleSelectionHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def setNestedHeaders(value: NestedHeaders): Self = this.set("nestedHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setNestedRows(value: NestedRows): Self = this.set("nestedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserveChanges(value: ObserveChanges): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistentState(value: PersistenState): Self = this.set("persistentState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: Search): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchScroll(value: TouchScroll): Self = this.set("touchScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrimRows(value: TrimRows): Self = this.set("trimRows", value.asInstanceOf[js.Any])
  }
  
}

