package typings
package handsontableLib.handsontableMod.underscoreHandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Core extends js.Object {
  var isDestroyed: scala.Boolean = js.native
  def addHook[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): scala.Unit = js.native
  def addHook[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): scala.Unit = js.native
  def addHookOnce[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): scala.Unit = js.native
  def addHookOnce[K /* <: java.lang.String */](
    key: K,
    callback: js.Array[
      /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
    ]
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(action: handsontableLib.handsontableLibStrings.insert_col): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]]
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(action: handsontableLib.handsontableLibStrings.insert_col, index: scala.Double): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertcol(
    action: handsontableLib.handsontableLibStrings.insert_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(action: handsontableLib.handsontableLibStrings.insert_row): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]]
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(action: handsontableLib.handsontableLibStrings.insert_row, index: scala.Double): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_insertrow(
    action: handsontableLib.handsontableLibStrings.insert_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(action: handsontableLib.handsontableLibStrings.remove_col): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]]
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(action: handsontableLib.handsontableLibStrings.remove_col, index: scala.Double): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removecol(
    action: handsontableLib.handsontableLibStrings.remove_col,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(action: handsontableLib.handsontableLibStrings.remove_row): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]]
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: js.Array[js.Tuple2[scala.Double, scala.Double]],
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(action: handsontableLib.handsontableLibStrings.remove_row, index: scala.Double): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: scala.Double,
    amount: scala.Double
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String
  ): scala.Unit = js.native
  @JSName("alter")
  def alter_removerow(
    action: handsontableLib.handsontableLibStrings.remove_row,
    index: scala.Double,
    amount: scala.Double,
    source: java.lang.String,
    keepEmptyRows: scala.Boolean
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def colOffset(): scala.Double = js.native
  def colToProp(col: scala.Double): java.lang.String | scala.Double = js.native
  def countCols(): scala.Double = js.native
  def countEmptyCols(): scala.Double = js.native
  def countEmptyCols(ending: scala.Boolean): scala.Double = js.native
  def countEmptyRows(): scala.Double = js.native
  def countEmptyRows(ending: scala.Boolean): scala.Double = js.native
  def countRenderedCols(): scala.Double = js.native
  def countRenderedRows(): scala.Double = js.native
  def countRows(): scala.Double = js.native
  def countSourceCols(): scala.Double = js.native
  def countSourceRows(): scala.Double = js.native
  def countVisibleCols(): scala.Double = js.native
  def countVisibleRows(): scala.Double = js.native
  def deselectCell(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroyEditor(): scala.Unit = js.native
  def destroyEditor(revertOriginal: scala.Boolean): scala.Unit = js.native
  def destroyEditor(revertOriginal: scala.Boolean, prepareEditorIfNeeded: scala.Boolean): scala.Unit = js.native
  def emptySelectedCells(): scala.Unit = js.native
  def getActiveEditor[T /* <: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base */](): js.UndefOr[T] = js.native
  def getCell(row: scala.Double, col: scala.Double): stdLib.HTMLTableCellElement | scala.Null = js.native
  def getCell(row: scala.Double, col: scala.Double, topmost: scala.Boolean): stdLib.HTMLTableCellElement | scala.Null = js.native
  def getCellEditor[T /* <: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base */](cellMeta: handsontableLib.handsontableMod.HandsontableNs.CellMeta): T = js.native
  def getCellEditor[T /* <: handsontableLib.handsontableMod.HandsontableNs.underscoreEditorsNs.Base */](row: scala.Double, col: scala.Double): T = js.native
  def getCellMeta(row: scala.Double, col: scala.Double): handsontableLib.handsontableMod.HandsontableNs.CellProperties = js.native
  def getCellMetaAtRow(row: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellProperties] = js.native
  def getCellRenderer(cellMeta: handsontableLib.handsontableMod.HandsontableNs.CellMeta): handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = js.native
  def getCellRenderer(row: scala.Double, col: scala.Double): handsontableLib.handsontableMod.HandsontableNs.renderersNs.Base = js.native
  def getCellValidator(cellMeta: handsontableLib.handsontableMod.HandsontableNs.CellMeta): js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base | stdLib.RegExp] = js.native
  def getCellValidator(row: scala.Double, col: scala.Double): js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.validatorsNs.Base | stdLib.RegExp] = js.native
  def getColHeader(): js.Array[scala.Double | java.lang.String] = js.native
  def getColHeader(col: scala.Double): scala.Double | java.lang.String = js.native
  def getColWidth(col: scala.Double): scala.Double = js.native
  def getCoords(): handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords = js.native
  def getCoords(elem: stdLib.Element): handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords = js.native
  def getCopyableData(row: scala.Double, column: scala.Double): java.lang.String = js.native
  def getCopyableText(startRow: scala.Double, startCol: scala.Double, endRow: scala.Double, endCol: scala.Double): java.lang.String = js.native
  def getData(): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getData(row: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getData(row: scala.Double, column: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getData(row: scala.Double, column: scala.Double, row2: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getData(row: scala.Double, column: scala.Double, row2: scala.Double, column2: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getDataAtCell(row: scala.Double, column: scala.Double): handsontableLib.handsontableMod.HandsontableNs.CellValue = js.native
  def getDataAtCol(column: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getDataAtProp(prop: java.lang.String): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getDataAtProp(prop: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getDataAtRow(row: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getDataAtRowProp(row: scala.Double, prop: java.lang.String): handsontableLib.handsontableMod.HandsontableNs.CellValue = js.native
  def getDataType(rowFrom: scala.Double, columnFrom: scala.Double, rowTo: scala.Double, columnTo: scala.Double): handsontableLib.handsontableMod.HandsontableNs.CellType | handsontableLib.handsontableLibStrings.mixed = js.native
  def getInstance(): handsontableLib.handsontableMod.Handsontable = js.native
  @JSName("getPlugin")
  def getPlugin_autoColumnSize(pluginName: handsontableLib.handsontableLibStrings.autoColumnSize): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.AutoColumnSize = js.native
  @JSName("getPlugin")
  def getPlugin_autoRowSize(pluginName: handsontableLib.handsontableLibStrings.autoRowSize): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.AutoRowSize = js.native
  @JSName("getPlugin")
  def getPlugin_autofill(pluginName: handsontableLib.handsontableLibStrings.autofill): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Autofill = js.native
  @JSName("getPlugin")
  def getPlugin_bindRowsWithHeaders(pluginName: handsontableLib.handsontableLibStrings.bindRowsWithHeaders): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.BindRowsWithHeaders = js.native
  @JSName("getPlugin")
  def getPlugin_collapsibleColumns(pluginName: handsontableLib.handsontableLibStrings.collapsibleColumns): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CollapsibleColumns = js.native
  @JSName("getPlugin")
  def getPlugin_columnSorting(pluginName: handsontableLib.handsontableLibStrings.columnSorting): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSorting = js.native
  @JSName("getPlugin")
  def getPlugin_columnSummary(pluginName: handsontableLib.handsontableLibStrings.columnSummary): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ColumnSummary = js.native
  @JSName("getPlugin")
  def getPlugin_comments(pluginName: handsontableLib.handsontableLibStrings.comments): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Comments = js.native
  @JSName("getPlugin")
  def getPlugin_contextMenu(pluginName: handsontableLib.handsontableLibStrings.contextMenu): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu = js.native
  @JSName("getPlugin")
  def getPlugin_copyPaste(pluginName: handsontableLib.handsontableLibStrings.copyPaste): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.CopyPaste = js.native
  @JSName("getPlugin")
  def getPlugin_dragToScroll(pluginName: handsontableLib.handsontableLibStrings.dragToScroll): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DragToScroll = js.native
  @JSName("getPlugin")
  def getPlugin_dropdownMenu(pluginName: handsontableLib.handsontableLibStrings.dropdownMenu): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu = js.native
  @JSName("getPlugin")
  def getPlugin_exportFile(pluginName: handsontableLib.handsontableLibStrings.exportFile): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ExportFile = js.native
  @JSName("getPlugin")
  def getPlugin_filters(pluginName: handsontableLib.handsontableLibStrings.filters): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Filters = js.native
  @JSName("getPlugin")
  def getPlugin_formulas(pluginName: handsontableLib.handsontableLibStrings.formulas): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Formulas = js.native
  @JSName("getPlugin")
  def getPlugin_ganttChart(pluginName: handsontableLib.handsontableLibStrings.ganttChart): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.GanttChart = js.native
  @JSName("getPlugin")
  def getPlugin_headerTooltips(pluginName: handsontableLib.handsontableLibStrings.headerTooltips): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.HeaderTooltips = js.native
  @JSName("getPlugin")
  def getPlugin_hiddenColumns(pluginName: handsontableLib.handsontableLibStrings.hiddenColumns): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.HiddenColumns = js.native
  @JSName("getPlugin")
  def getPlugin_hiddenRows(pluginName: handsontableLib.handsontableLibStrings.hiddenRows): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.HiddenRows = js.native
  @JSName("getPlugin")
  def getPlugin_manualColumnFreeze(pluginName: handsontableLib.handsontableLibStrings.manualColumnFreeze): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ManualColumnFreeze = js.native
  @JSName("getPlugin")
  def getPlugin_manualColumnMove(pluginName: handsontableLib.handsontableLibStrings.manualColumnMove): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ManualColumnMove = js.native
  @JSName("getPlugin")
  def getPlugin_manualColumnResize(pluginName: handsontableLib.handsontableLibStrings.manualColumnResize): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ManualColumnResize = js.native
  @JSName("getPlugin")
  def getPlugin_manualRowMove(pluginName: handsontableLib.handsontableLibStrings.manualRowMove): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ManualRowMove = js.native
  @JSName("getPlugin")
  def getPlugin_manualRowResize(pluginName: handsontableLib.handsontableLibStrings.manualRowResize): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ManualRowResize = js.native
  @JSName("getPlugin")
  def getPlugin_mergeCells(pluginName: handsontableLib.handsontableLibStrings.mergeCells): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCells = js.native
  @JSName("getPlugin")
  def getPlugin_multiColumnSorting(pluginName: handsontableLib.handsontableLibStrings.multiColumnSorting): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MultiColumnSorting = js.native
  @JSName("getPlugin")
  def getPlugin_multipleSelectionHandles(pluginName: handsontableLib.handsontableLibStrings.multipleSelectionHandles): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MultipleSelectionHandles = js.native
  @JSName("getPlugin")
  def getPlugin_nestedHeaders(pluginName: handsontableLib.handsontableLibStrings.nestedHeaders): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.NestedHeaders = js.native
  @JSName("getPlugin")
  def getPlugin_nestedRows(pluginName: handsontableLib.handsontableLibStrings.nestedRows): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.NestedRows = js.native
  @JSName("getPlugin")
  def getPlugin_observeChanges(pluginName: handsontableLib.handsontableLibStrings.observeChanges): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ObserveChanges = js.native
  @JSName("getPlugin")
  def getPlugin_persistentState(pluginName: handsontableLib.handsontableLibStrings.persistentState): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.PersistenState = js.native
  @JSName("getPlugin")
  def getPlugin_search(pluginName: handsontableLib.handsontableLibStrings.search): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Search = js.native
  @JSName("getPlugin")
  def getPlugin_touchScroll(pluginName: handsontableLib.handsontableLibStrings.touchScroll): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.TouchScroll = js.native
  @JSName("getPlugin")
  def getPlugin_trimRows(pluginName: handsontableLib.handsontableLibStrings.trimRows): handsontableLib.handsontableMod.HandsontableNs.pluginsNs.TrimRows = js.native
  def getRowHeader(): js.Array[java.lang.String | scala.Double] = js.native
  def getRowHeader(row: scala.Double): java.lang.String | scala.Double = js.native
  def getRowHeight(row: scala.Double): scala.Double = js.native
  def getSchema(): handsontableLib.handsontableMod.HandsontableNs.RowObject = js.native
  def getSelected(): js.UndefOr[js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]]] = js.native
  def getSelectedLast(): js.UndefOr[js.Array[scala.Double]] = js.native
  def getSelectedRange(): js.UndefOr[js.Array[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange]] = js.native
  def getSelectedRangeLast(): js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange] = js.native
  def getSettings(): handsontableLib.handsontableMod.HandsontableNs.GridSettings = js.native
  def getSourceData(): js.Array[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
  ] = js.native
  def getSourceData(row: scala.Double): js.Array[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
  ] = js.native
  def getSourceData(row: scala.Double, column: scala.Double): js.Array[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
  ] = js.native
  def getSourceData(row: scala.Double, column: scala.Double, row2: scala.Double): js.Array[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
  ] = js.native
  def getSourceData(row: scala.Double, column: scala.Double, row2: scala.Double, column2: scala.Double): js.Array[
    js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
  ] = js.native
  def getSourceDataArray(): js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]] = js.native
  def getSourceDataArray(row: scala.Double): js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]] = js.native
  def getSourceDataArray(row: scala.Double, column: scala.Double): js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]] = js.native
  def getSourceDataArray(row: scala.Double, column: scala.Double, row2: scala.Double): js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]] = js.native
  def getSourceDataArray(row: scala.Double, column: scala.Double, row2: scala.Double, ccolumn2: scala.Double): js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]] = js.native
  def getSourceDataAtCell(row: scala.Double, column: scala.Double): handsontableLib.handsontableMod.HandsontableNs.CellValue = js.native
  def getSourceDataAtCol(column: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] = js.native
  def getSourceDataAtRow(row: scala.Double): js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject = js.native
  def getTranslatedPhrase(dictionaryKey: java.lang.String, extraArguments: js.Any): java.lang.String | scala.Null = js.native
  def getValue(): handsontableLib.handsontableMod.HandsontableNs.CellValue = js.native
  def hasColHeaders(): scala.Boolean = js.native
  def hasHook(key: java.lang.String): scala.Boolean = js.native
  def hasRowHeaders(): scala.Boolean = js.native
  def isColumnModificationAllowed(): scala.Boolean = js.native
  def isEmptyCol(col: scala.Double): scala.Boolean = js.native
  def isEmptyRow(row: scala.Double): scala.Boolean = js.native
  def isListening(): scala.Boolean = js.native
  def listen(): scala.Unit = js.native
  def loadData(
    data: js.Array[
      js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue] | handsontableLib.handsontableMod.HandsontableNs.RowObject
    ]
  ): scala.Unit = js.native
  def populateFromArray(
    row: scala.Double,
    col: scala.Double,
    input: js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]],
    endRow: js.UndefOr[scala.Double],
    endCol: js.UndefOr[scala.Double],
    source: js.UndefOr[java.lang.String],
    method: js.UndefOr[
      handsontableLib.handsontableLibStrings.overwrite | handsontableLib.handsontableLibStrings.shift_down | handsontableLib.handsontableLibStrings.shift_right
    ],
    direction: js.UndefOr[
      handsontableLib.handsontableLibStrings.down | handsontableLib.handsontableLibStrings.left | handsontableLib.handsontableLibStrings.right | handsontableLib.handsontableLibStrings.up
    ],
    deltas: js.UndefOr[js.Array[_]]
  ): scala.Unit = js.native
  def propToCol(prop: java.lang.String): scala.Double = js.native
  def propToCol(prop: scala.Double): scala.Double = js.native
  def refreshDimensions(): scala.Unit = js.native
  def removeCellMeta(row: scala.Double, col: scala.Double, key: java.lang.String): scala.Unit = js.native
  @JSName("removeCellMeta")
  def removeCellMeta_comment(row: scala.Double, col: scala.Double, key: handsontableLib.handsontableLibStrings.comment): scala.Unit = js.native
  @JSName("removeCellMeta")
  def removeCellMeta_hidden(row: scala.Double, col: scala.Double, key: handsontableLib.handsontableLibStrings.hidden): scala.Unit = js.native
  @JSName("removeCellMeta")
  def removeCellMeta_isSearchResult(row: scala.Double, col: scala.Double, key: handsontableLib.handsontableLibStrings.isSearchResult): scala.Unit = js.native
  @JSName("removeCellMeta")
  def removeCellMeta_skipRowOnPaste(row: scala.Double, col: scala.Double, key: handsontableLib.handsontableLibStrings.skipRowOnPaste): scala.Unit = js.native
  @JSName("removeCellMeta")
  def removeCellMeta_valid(row: scala.Double, col: scala.Double, key: handsontableLib.handsontableLibStrings.valid): scala.Unit = js.native
  def removeHook[K /* <: java.lang.String */](
    key: K,
    callback: /* import warning: ImportType.apply Failed type conversion: handsontable.handsontable.Handsontable.Hooks.Events[K] */ js.Any
  ): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def rowOffset(): scala.Double = js.native
  def runHooks(
    key: java.lang.String,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
  // Requires TS 3.0:
  // runHooks<K extends keyof Handsontable.Events>(key: K, ...params: Parameters<Handsontable.Events[K]>): ReturnType<Handsontable.Events[K]>;
  def scrollViewportTo(): scala.Boolean = js.native
  def scrollViewportTo(row: scala.Double): scala.Boolean = js.native
  def scrollViewportTo(row: scala.Double, column: scala.Double): scala.Boolean = js.native
  def scrollViewportTo(row: scala.Double, column: scala.Double, snapToBottom: scala.Boolean): scala.Boolean = js.native
  def scrollViewportTo(row: scala.Double, column: scala.Double, snapToBottom: scala.Boolean, snapToRight: scala.Boolean): scala.Boolean = js.native
  def selectAll(): scala.Unit = js.native
  def selectCell(row: scala.Double, col: scala.Double): scala.Boolean = js.native
  def selectCell(row: scala.Double, col: scala.Double, endRow: scala.Double): scala.Boolean = js.native
  def selectCell(row: scala.Double, col: scala.Double, endRow: scala.Double, endCol: scala.Double): scala.Boolean = js.native
  def selectCell(
    row: scala.Double,
    col: scala.Double,
    endRow: scala.Double,
    endCol: scala.Double,
    scrollToCell: scala.Boolean
  ): scala.Boolean = js.native
  def selectCell(
    row: scala.Double,
    col: scala.Double,
    endRow: scala.Double,
    endCol: scala.Double,
    scrollToCell: scala.Boolean,
    changeListener: scala.Boolean
  ): scala.Boolean = js.native
  def selectCellByProp(row: scala.Double, prop: java.lang.String): scala.Boolean = js.native
  def selectCellByProp(row: scala.Double, prop: java.lang.String, endRow: scala.Double): scala.Boolean = js.native
  def selectCellByProp(row: scala.Double, prop: java.lang.String, endRow: scala.Double, endProp: java.lang.String): scala.Boolean = js.native
  def selectCellByProp(
    row: scala.Double,
    prop: java.lang.String,
    endRow: scala.Double,
    endProp: java.lang.String,
    scrollToCell: scala.Boolean
  ): scala.Boolean = js.native
  def selectCells(
    coords: js.Array[
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange | (js.Tuple4[
        scala.Double, 
        scala.Double | java.lang.String, 
        scala.Double, 
        scala.Double | java.lang.String
      ])
    ]
  ): scala.Boolean = js.native
  def selectCells(
    coords: js.Array[
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange | (js.Tuple4[
        scala.Double, 
        scala.Double | java.lang.String, 
        scala.Double, 
        scala.Double | java.lang.String
      ])
    ],
    scrollToCell: scala.Boolean
  ): scala.Boolean = js.native
  def selectCells(
    coords: js.Array[
      handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange | (js.Tuple4[
        scala.Double, 
        scala.Double | java.lang.String, 
        scala.Double, 
        scala.Double | java.lang.String
      ])
    ],
    scrollToCell: scala.Boolean,
    changeListener: scala.Boolean
  ): scala.Boolean = js.native
  def selectColumns(startColumn: java.lang.String): scala.Boolean = js.native
  def selectColumns(startColumn: java.lang.String, endColumn: java.lang.String): scala.Boolean = js.native
  def selectColumns(startColumn: java.lang.String, endColumn: scala.Double): scala.Boolean = js.native
  def selectColumns(startColumn: scala.Double): scala.Boolean = js.native
  def selectColumns(startColumn: scala.Double, endColumn: java.lang.String): scala.Boolean = js.native
  def selectColumns(startColumn: scala.Double, endColumn: scala.Double): scala.Boolean = js.native
  def selectRows(startRow: scala.Double): scala.Boolean = js.native
  def selectRows(startRow: scala.Double, endRow: scala.Double): scala.Boolean = js.native
  def setCellMeta(row: scala.Double, col: scala.Double, key: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def setCellMetaObject[T /* <: handsontableLib.handsontableMod.HandsontableNs.CellMeta */](row: scala.Double, col: scala.Double, prop: T): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_comment(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.comment,
    `val`: handsontableLib.handsontableMod.HandsontableNs.commentsNs.CommentObject
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_data(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.data,
    `val`: handsontableLib.handsontableMod.HandsontableNs.ColumnDataGetterSetterFunction
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_data(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.data,
    `val`: java.lang.String
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_data(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.data,
    `val`: scala.Double
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_hidden(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.hidden,
    `val`: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_isSearchResult(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.isSearchResult,
    `val`: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_skipRowOnPaste(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.skipRowOnPaste,
    `val`: scala.Boolean
  ): scala.Unit = js.native
  @JSName("setCellMeta")
  def setCellMeta_valid(
    row: scala.Double,
    col: scala.Double,
    key: handsontableLib.handsontableLibStrings.valid,
    `val`: scala.Boolean
  ): scala.Unit = js.native
  def setDataAtCell(
    changes: js.Array[
      js.Tuple3[
        scala.Double, 
        java.lang.String | scala.Double, 
        handsontableLib.handsontableMod.HandsontableNs.CellValue
      ]
    ]
  ): scala.Unit = js.native
  def setDataAtCell(
    changes: js.Array[
      js.Tuple3[
        scala.Double, 
        java.lang.String | scala.Double, 
        handsontableLib.handsontableMod.HandsontableNs.CellValue
      ]
    ],
    source: java.lang.String
  ): scala.Unit = js.native
  def setDataAtCell(
    row: scala.Double,
    col: java.lang.String,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue
  ): scala.Unit = js.native
  def setDataAtCell(
    row: scala.Double,
    col: java.lang.String,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    source: java.lang.String
  ): scala.Unit = js.native
  def setDataAtCell(
    row: scala.Double,
    col: scala.Double,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue
  ): scala.Unit = js.native
  def setDataAtCell(
    row: scala.Double,
    col: scala.Double,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    source: java.lang.String
  ): scala.Unit = js.native
  def setDataAtRowProp(
    changes: js.Array[
      js.Tuple3[
        scala.Double, 
        java.lang.String | scala.Double, 
        handsontableLib.handsontableMod.HandsontableNs.CellValue
      ]
    ]
  ): scala.Unit = js.native
  def setDataAtRowProp(
    changes: js.Array[
      js.Tuple3[
        scala.Double, 
        java.lang.String | scala.Double, 
        handsontableLib.handsontableMod.HandsontableNs.CellValue
      ]
    ],
    source: java.lang.String
  ): scala.Unit = js.native
  def setDataAtRowProp(
    row: scala.Double,
    prop: java.lang.String,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue
  ): scala.Unit = js.native
  def setDataAtRowProp(
    row: scala.Double,
    prop: java.lang.String,
    value: handsontableLib.handsontableMod.HandsontableNs.CellValue,
    source: java.lang.String
  ): scala.Unit = js.native
  def spliceCol(
    col: scala.Double,
    index: scala.Double,
    amount: scala.Double,
    elements: handsontableLib.handsontableMod.HandsontableNs.CellValue*
  ): scala.Unit = js.native
  def spliceRow(
    row: scala.Double,
    index: scala.Double,
    amount: scala.Double,
    elements: handsontableLib.handsontableMod.HandsontableNs.CellValue*
  ): scala.Unit = js.native
  def toHTML(): java.lang.String = js.native
  def toPhysicalColumn(column: scala.Double): scala.Double = js.native
  def toPhysicalRow(row: scala.Double): scala.Double = js.native
  def toTableElement(): stdLib.HTMLTableElement = js.native
  def toVisualColumn(column: scala.Double): scala.Double = js.native
  def toVisualRow(row: scala.Double): scala.Double = js.native
  def unlisten(): scala.Unit = js.native
  def updateSettings(settings: handsontableLib.handsontableMod.HandsontableNs.GridSettings): scala.Unit = js.native
  def updateSettings(settings: handsontableLib.handsontableMod.HandsontableNs.GridSettings, init: scala.Boolean): scala.Unit = js.native
  def validateCells(): scala.Unit = js.native
  def validateCells(callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def validateColumns(columns: js.Array[scala.Double]): scala.Unit = js.native
  def validateColumns(columns: js.Array[scala.Double], callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def validateRows(rows: js.Array[scala.Double]): scala.Unit = js.native
  def validateRows(rows: js.Array[scala.Double], callback: js.Function1[/* valid */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

