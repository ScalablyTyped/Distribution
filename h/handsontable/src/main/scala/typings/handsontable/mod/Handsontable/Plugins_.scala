package typings.handsontable.mod.Handsontable

import typings.handsontable.anon.Instantiable
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
import typings.handsontable.mod.Handsontable.plugins.Search
import typings.handsontable.mod.Handsontable.plugins.TouchScroll
import typings.handsontable.mod.Handsontable.plugins.TrimRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins_ extends js.Object {
  var AutoColumnSize: typings.handsontable.mod.Handsontable.plugins.AutoColumnSize
  var AutoRowSize: typings.handsontable.mod.Handsontable.plugins.AutoRowSize
  var Autofill: typings.handsontable.mod.Handsontable.plugins.Autofill
  var BasePlugin: Base
  var BindRowsWithHeaders: typings.handsontable.mod.Handsontable.plugins.BindRowsWithHeaders
  var CollapsibleColumns: typings.handsontable.mod.Handsontable.plugins.CollapsibleColumns
  var ColumnSorting: typings.handsontable.mod.Handsontable.plugins.ColumnSorting
  var ColumnSummary: typings.handsontable.mod.Handsontable.plugins.ColumnSummary
  var Comments: typings.handsontable.mod.Handsontable.plugins.Comments
  var ContextMenu: typings.handsontable.mod.Handsontable.plugins.ContextMenu
  var CopyPaste: typings.handsontable.mod.Handsontable.plugins.CopyPaste
  var DragToScroll: typings.handsontable.mod.Handsontable.plugins.DragToScroll
  var DropdownMenu: typings.handsontable.mod.Handsontable.plugins.DropdownMenu
  var ExportFile: typings.handsontable.mod.Handsontable.plugins.ExportFile
  var Filters: typings.handsontable.mod.Handsontable.plugins.Filters
  var Formulas: typings.handsontable.mod.Handsontable.plugins.Formulas
  var GanttChart: typings.handsontable.mod.Handsontable.plugins.GanttChart
  var HeaderTooltips: typings.handsontable.mod.Handsontable.plugins.HeaderTooltips
  var HiddenColumns: typings.handsontable.mod.Handsontable.plugins.HiddenColumns
  var HiddenRows: typings.handsontable.mod.Handsontable.plugins.HiddenRows
  var ManualColumnFreeze: typings.handsontable.mod.Handsontable.plugins.ManualColumnFreeze
  var ManualColumnMove: typings.handsontable.mod.Handsontable.plugins.ManualColumnMove
  var ManualColumnResize: typings.handsontable.mod.Handsontable.plugins.ManualColumnResize
  var ManualRowMove: typings.handsontable.mod.Handsontable.plugins.ManualRowMove
  var ManualRowResize: typings.handsontable.mod.Handsontable.plugins.ManualRowResize
  var MergeCells: typings.handsontable.mod.Handsontable.plugins.MergeCells
  var MultiColumnSorting: typings.handsontable.mod.Handsontable.plugins.MultiColumnSorting
  var MultipleSelectionHandles: typings.handsontable.mod.Handsontable.plugins.MultipleSelectionHandles
  var NestedHeaders: typings.handsontable.mod.Handsontable.plugins.NestedHeaders
  var NestedRows: typings.handsontable.mod.Handsontable.plugins.NestedRows
  var ObserveChanges: typings.handsontable.mod.Handsontable.plugins.ObserveChanges
  var Search: typings.handsontable.mod.Handsontable.plugins.Search
  var TouchScroll: typings.handsontable.mod.Handsontable.plugins.TouchScroll
  var TrimRows: typings.handsontable.mod.Handsontable.plugins.TrimRows
  def registerPlugin(pluginName: String, pluginClass: Instantiable): Unit
}

object Plugins_ {
  @scala.inline
  def apply(
    AutoColumnSize: AutoColumnSize,
    AutoRowSize: AutoRowSize,
    Autofill: Autofill,
    BasePlugin: Base,
    BindRowsWithHeaders: BindRowsWithHeaders,
    CollapsibleColumns: CollapsibleColumns,
    ColumnSorting: ColumnSorting,
    ColumnSummary: ColumnSummary,
    Comments: Comments,
    ContextMenu: ContextMenu,
    CopyPaste: CopyPaste,
    DragToScroll: DragToScroll,
    DropdownMenu: DropdownMenu,
    ExportFile: ExportFile,
    Filters: Filters,
    Formulas: Formulas,
    GanttChart: GanttChart,
    HeaderTooltips: HeaderTooltips,
    HiddenColumns: HiddenColumns,
    HiddenRows: HiddenRows,
    ManualColumnFreeze: ManualColumnFreeze,
    ManualColumnMove: ManualColumnMove,
    ManualColumnResize: ManualColumnResize,
    ManualRowMove: ManualRowMove,
    ManualRowResize: ManualRowResize,
    MergeCells: MergeCells,
    MultiColumnSorting: MultiColumnSorting,
    MultipleSelectionHandles: MultipleSelectionHandles,
    NestedHeaders: NestedHeaders,
    NestedRows: NestedRows,
    ObserveChanges: ObserveChanges,
    Search: Search,
    TouchScroll: TouchScroll,
    TrimRows: TrimRows,
    registerPlugin: (String, Instantiable) => Unit
  ): Plugins_ = {
    val __obj = js.Dynamic.literal(AutoColumnSize = AutoColumnSize.asInstanceOf[js.Any], AutoRowSize = AutoRowSize.asInstanceOf[js.Any], Autofill = Autofill.asInstanceOf[js.Any], BasePlugin = BasePlugin.asInstanceOf[js.Any], BindRowsWithHeaders = BindRowsWithHeaders.asInstanceOf[js.Any], CollapsibleColumns = CollapsibleColumns.asInstanceOf[js.Any], ColumnSorting = ColumnSorting.asInstanceOf[js.Any], ColumnSummary = ColumnSummary.asInstanceOf[js.Any], Comments = Comments.asInstanceOf[js.Any], ContextMenu = ContextMenu.asInstanceOf[js.Any], CopyPaste = CopyPaste.asInstanceOf[js.Any], DragToScroll = DragToScroll.asInstanceOf[js.Any], DropdownMenu = DropdownMenu.asInstanceOf[js.Any], ExportFile = ExportFile.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Formulas = Formulas.asInstanceOf[js.Any], GanttChart = GanttChart.asInstanceOf[js.Any], HeaderTooltips = HeaderTooltips.asInstanceOf[js.Any], HiddenColumns = HiddenColumns.asInstanceOf[js.Any], HiddenRows = HiddenRows.asInstanceOf[js.Any], ManualColumnFreeze = ManualColumnFreeze.asInstanceOf[js.Any], ManualColumnMove = ManualColumnMove.asInstanceOf[js.Any], ManualColumnResize = ManualColumnResize.asInstanceOf[js.Any], ManualRowMove = ManualRowMove.asInstanceOf[js.Any], ManualRowResize = ManualRowResize.asInstanceOf[js.Any], MergeCells = MergeCells.asInstanceOf[js.Any], MultiColumnSorting = MultiColumnSorting.asInstanceOf[js.Any], MultipleSelectionHandles = MultipleSelectionHandles.asInstanceOf[js.Any], NestedHeaders = NestedHeaders.asInstanceOf[js.Any], NestedRows = NestedRows.asInstanceOf[js.Any], ObserveChanges = ObserveChanges.asInstanceOf[js.Any], Search = Search.asInstanceOf[js.Any], TouchScroll = TouchScroll.asInstanceOf[js.Any], TrimRows = TrimRows.asInstanceOf[js.Any], registerPlugin = js.Any.fromFunction2(registerPlugin))
    __obj.asInstanceOf[Plugins_]
  }
}

