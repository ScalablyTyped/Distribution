package typings.handsontable

import typings.handsontable.handsontableMod.Handsontable.CellType
import typings.handsontable.handsontableMod.Handsontable.ChangeSource
import typings.handsontable.handsontableMod.Handsontable.EditorType
import typings.handsontable.handsontableMod.Handsontable.RendererType
import typings.handsontable.handsontableMod.Handsontable.ValidatorType
import typings.handsontable.handsontableMod.Handsontable._editors.EditorState
import typings.handsontable.handsontableMod.Handsontable.columnSorting.SortOrderType
import typings.handsontable.handsontableMod.Handsontable.contextMenu.PredefinedMenuItemKey
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ConditionName
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.OperationType
import typings.handsontable.handsontableMod.Handsontable.plugins.PasteModeType
import typings.handsontable.handsontableMod.Handsontable.wot.OverlayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object handsontableStrings {
  @js.native
  sealed trait `---------` extends PredefinedMenuItemKey
  
  @js.native
  sealed trait AutofillDOTfill extends ChangeSource
  
  @js.native
  sealed trait Bucket extends js.Object
  
  @js.native
  sealed trait ColumnSummaryDOTreset extends ChangeSource
  
  @js.native
  sealed trait ColumnSummaryDOTset extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTclearColumns extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTcolumnLeft extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTcolumnRight extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTremoveColumn extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTremoveRow extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTrowAbove extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDOTrowBelow extends ChangeSource
  
  @js.native
  sealed trait CopyPasteDOTpaste extends ChangeSource
  
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait GantChartDOTloadData extends ChangeSource
  
  @js.native
  sealed trait ObserveChangesDOTchange extends ChangeSource
  
  @js.native
  sealed trait STATE_EDITING extends EditorState
  
  @js.native
  sealed trait STATE_FINISHED extends EditorState
  
  @js.native
  sealed trait STATE_VIRGIN extends EditorState
  
  @js.native
  sealed trait STATE_WAITING extends EditorState
  
  @js.native
  sealed trait UndoRedoDOTredo extends ChangeSource
  
  @js.native
  sealed trait UndoRedoDOTundo extends ChangeSource
  
  @js.native
  sealed trait add_child extends PredefinedMenuItemKey
  
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait alignment extends PredefinedMenuItemKey
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait area extends js.Object
  
  @js.native
  sealed trait asc extends SortOrderType
  
  @js.native
  sealed trait auto extends ChangeSource
  
  @js.native
  sealed trait autoColumnSize extends js.Object
  
  @js.native
  sealed trait autoRowSize extends js.Object
  
  @js.native
  sealed trait autocomplete
    extends CellType
       with EditorType
       with RendererType
       with ValidatorType
  
  @js.native
  sealed trait autofill extends js.Object
  
  @js.native
  sealed trait average extends js.Object
  
  @js.native
  sealed trait before extends js.Object
  
  @js.native
  sealed trait begins_with extends ConditionName
  
  @js.native
  sealed trait between extends ConditionName
  
  @js.native
  sealed trait bindRowsWithHeaders extends js.Object
  
  @js.native
  sealed trait borders extends PredefinedMenuItemKey
  
  @js.native
  sealed trait bottom extends OverlayType
  
  @js.native
  sealed trait `bottom-left-corner` extends js.Object
  
  @js.native
  sealed trait bottom_left_corner extends OverlayType
  
  @js.native
  sealed trait by_value extends ConditionName
  
  @js.native
  sealed trait cell extends js.Object
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait checkbox
    extends CellType
       with EditorType
       with RendererType
  
  @js.native
  sealed trait clear_column extends PredefinedMenuItemKey
  
  @js.native
  sealed trait col_left extends PredefinedMenuItemKey
  
  @js.native
  sealed trait col_right extends PredefinedMenuItemKey
  
  @js.native
  sealed trait collapsibleColumns extends js.Object
  
  @js.native
  sealed trait columnSorting extends js.Object
  
  @js.native
  sealed trait columnSummary extends js.Object
  
  @js.native
  sealed trait comment extends js.Object
  
  @js.native
  sealed trait comments extends js.Object
  
  @js.native
  sealed trait commentsAddEdit extends PredefinedMenuItemKey
  
  @js.native
  sealed trait commentsReadOnly extends PredefinedMenuItemKey
  
  @js.native
  sealed trait commentsRemove extends PredefinedMenuItemKey
  
  @js.native
  sealed trait conjunction extends OperationType
  
  @js.native
  sealed trait contains extends ConditionName
  
  @js.native
  sealed trait contextMenu extends js.Object
  
  @js.native
  sealed trait copy extends PredefinedMenuItemKey
  
  @js.native
  sealed trait copyPaste extends js.Object
  
  @js.native
  sealed trait count extends js.Object
  
  @js.native
  sealed trait current extends js.Object
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait cut extends PredefinedMenuItemKey
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait date
    extends CellType
       with EditorType
       with ValidatorType
  
  @js.native
  sealed trait dateValidate extends ChangeSource
  
  @js.native
  sealed trait debug extends OverlayType
  
  @js.native
  sealed trait desc extends SortOrderType
  
  @js.native
  sealed trait detach_from_parent extends PredefinedMenuItemKey
  
  @js.native
  sealed trait disjunction extends OperationType
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait dragToScroll extends js.Object
  
  @js.native
  sealed trait dropdown
    extends CellType
       with EditorType
  
  @js.native
  sealed trait dropdownMenu extends js.Object
  
  @js.native
  sealed trait edit extends ChangeSource
  
  @js.native
  sealed trait empty extends ConditionName
  
  @js.native
  sealed trait ends_with extends ConditionName
  
  @js.native
  sealed trait eq extends ConditionName
  
  @js.native
  sealed trait exportFile extends js.Object
  
  @js.native
  sealed trait filter extends js.Object
  
  @js.native
  sealed trait filter_action_bar extends PredefinedMenuItemKey
  
  @js.native
  sealed trait filter_by_condition extends PredefinedMenuItemKey
  
  @js.native
  sealed trait filter_by_condition2 extends PredefinedMenuItemKey
  
  @js.native
  sealed trait filter_by_value extends PredefinedMenuItemKey
  
  @js.native
  sealed trait filter_operators extends PredefinedMenuItemKey
  
  @js.native
  sealed trait filters extends js.Object
  
  @js.native
  sealed trait formulas extends js.Object
  
  @js.native
  sealed trait freeze_column extends PredefinedMenuItemKey
  
  @js.native
  sealed trait ganttChart extends js.Object
  
  @js.native
  sealed trait get extends js.Object
  
  @js.native
  sealed trait gt extends ConditionName
  
  @js.native
  sealed trait gte extends ConditionName
  
  @js.native
  sealed trait handsontable
    extends CellType
       with EditorType
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait headerTooltips extends js.Object
  
  @js.native
  sealed trait hidden extends js.Object
  
  @js.native
  sealed trait hiddenColumns extends js.Object
  
  @js.native
  sealed trait hiddenRows extends js.Object
  
  @js.native
  sealed trait hidden_columns_hide extends PredefinedMenuItemKey
  
  @js.native
  sealed trait hidden_columns_show extends PredefinedMenuItemKey
  
  @js.native
  sealed trait hidden_rows_hide extends PredefinedMenuItemKey
  
  @js.native
  sealed trait hidden_rows_show extends PredefinedMenuItemKey
  
  @js.native
  sealed trait highlight extends js.Object
  
  @js.native
  sealed trait horizontal extends js.Object
  
  @js.native
  sealed trait htBottom extends js.Object
  
  @js.native
  sealed trait htCenter extends js.Object
  
  @js.native
  sealed trait htJustify extends js.Object
  
  @js.native
  sealed trait htLeft extends js.Object
  
  @js.native
  sealed trait htMiddle extends js.Object
  
  @js.native
  sealed trait htRight extends js.Object
  
  @js.native
  sealed trait htTop extends js.Object
  
  @js.native
  sealed trait html extends RendererType
  
  @js.native
  sealed trait insert_col extends js.Object
  
  @js.native
  sealed trait insert_row extends js.Object
  
  @js.native
  sealed trait isSearchResult extends js.Object
  
  @js.native
  sealed trait last extends js.Object
  
  @js.native
  sealed trait left extends OverlayType
  
  @js.native
  sealed trait loadData extends ChangeSource
  
  @js.native
  sealed trait loose extends js.Object
  
  @js.native
  sealed trait lt extends ConditionName
  
  @js.native
  sealed trait lte extends ConditionName
  
  @js.native
  sealed trait make_read_only extends PredefinedMenuItemKey
  
  @js.native
  sealed trait manualColumnFreeze extends js.Object
  
  @js.native
  sealed trait manualColumnMove extends js.Object
  
  @js.native
  sealed trait manualColumnResize extends js.Object
  
  @js.native
  sealed trait manualRowMove extends js.Object
  
  @js.native
  sealed trait manualRowResize extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait mergeCells extends PredefinedMenuItemKey
  
  @js.native
  sealed trait min extends js.Object
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait mobile extends EditorType
  
  @js.native
  sealed trait monday extends js.Object
  
  @js.native
  sealed trait multiColumnSorting extends js.Object
  
  @js.native
  sealed trait multiple extends js.Object
  
  @js.native
  sealed trait multipleSelectionHandles extends js.Object
  
  @js.native
  sealed trait neq extends ConditionName
  
  @js.native
  sealed trait nestedHeaders extends js.Object
  
  @js.native
  sealed trait nestedRows extends js.Object
  
  @js.native
  sealed trait `non-commercial-and-evaluation` extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait not_between extends ConditionName
  
  @js.native
  sealed trait not_contains extends ConditionName
  
  @js.native
  sealed trait not_empty extends ConditionName
  
  @js.native
  sealed trait numeric
    extends CellType
       with RendererType
       with ValidatorType
  
  @js.native
  sealed trait observeChanges extends js.Object
  
  @js.native
  sealed trait overwrite extends PasteModeType
  
  @js.native
  sealed trait password
    extends CellType
       with EditorType
       with RendererType
  
  @js.native
  sealed trait persistentState extends js.Object
  
  @js.native
  sealed trait populateFromArray extends ChangeSource
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait redo extends PredefinedMenuItemKey
  
  @js.native
  sealed trait remove_col extends PredefinedMenuItemKey
  
  @js.native
  sealed trait remove_row extends PredefinedMenuItemKey
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait row_above extends PredefinedMenuItemKey
  
  @js.native
  sealed trait row_below extends PredefinedMenuItemKey
  
  @js.native
  sealed trait search extends js.Object
  
  @js.native
  sealed trait select extends EditorType
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait shift_down extends PasteModeType
  
  @js.native
  sealed trait shift_right extends PasteModeType
  
  @js.native
  sealed trait single extends js.Object
  
  @js.native
  sealed trait skipRowOnPaste extends js.Object
  
  @js.native
  sealed trait spliceCol extends ChangeSource
  
  @js.native
  sealed trait spliceRow extends ChangeSource
  
  @js.native
  sealed trait strict extends js.Object
  
  @js.native
  sealed trait sum extends js.Object
  
  @js.native
  sealed trait sunday extends js.Object
  
  @js.native
  sealed trait text
    extends CellType
       with EditorType
       with RendererType
  
  @js.native
  sealed trait time
    extends CellType
       with ValidatorType
  
  @js.native
  sealed trait timeValidate extends ChangeSource
  
  @js.native
  sealed trait top extends OverlayType
  
  @js.native
  sealed trait `top-left-corner` extends js.Object
  
  @js.native
  sealed trait top_left_corner extends OverlayType
  
  @js.native
  sealed trait touchScroll extends js.Object
  
  @js.native
  sealed trait trimRows extends js.Object
  
  @js.native
  sealed trait undo extends PredefinedMenuItemKey
  
  @js.native
  sealed trait unfreeze_column extends PredefinedMenuItemKey
  
  @js.native
  sealed trait up extends js.Object
  
  @js.native
  sealed trait valid extends js.Object
  
  @js.native
  sealed trait validateCells extends ChangeSource
  
  @js.native
  sealed trait vertical extends js.Object
  
  @scala.inline
  def `---------`: `---------` = "---------".asInstanceOf[`---------`]
  @scala.inline
  def AutofillDOTfill: AutofillDOTfill = "Autofill.fill".asInstanceOf[AutofillDOTfill]
  @scala.inline
  def Bucket: Bucket = "Bucket".asInstanceOf[Bucket]
  @scala.inline
  def ColumnSummaryDOTreset: ColumnSummaryDOTreset = "ColumnSummary.reset".asInstanceOf[ColumnSummaryDOTreset]
  @scala.inline
  def ColumnSummaryDOTset: ColumnSummaryDOTset = "ColumnSummary.set".asInstanceOf[ColumnSummaryDOTset]
  @scala.inline
  def ContextMenuDOTclearColumns: ContextMenuDOTclearColumns = "ContextMenu.clearColumns".asInstanceOf[ContextMenuDOTclearColumns]
  @scala.inline
  def ContextMenuDOTcolumnLeft: ContextMenuDOTcolumnLeft = "ContextMenu.columnLeft".asInstanceOf[ContextMenuDOTcolumnLeft]
  @scala.inline
  def ContextMenuDOTcolumnRight: ContextMenuDOTcolumnRight = "ContextMenu.columnRight".asInstanceOf[ContextMenuDOTcolumnRight]
  @scala.inline
  def ContextMenuDOTremoveColumn: ContextMenuDOTremoveColumn = "ContextMenu.removeColumn".asInstanceOf[ContextMenuDOTremoveColumn]
  @scala.inline
  def ContextMenuDOTremoveRow: ContextMenuDOTremoveRow = "ContextMenu.removeRow".asInstanceOf[ContextMenuDOTremoveRow]
  @scala.inline
  def ContextMenuDOTrowAbove: ContextMenuDOTrowAbove = "ContextMenu.rowAbove".asInstanceOf[ContextMenuDOTrowAbove]
  @scala.inline
  def ContextMenuDOTrowBelow: ContextMenuDOTrowBelow = "ContextMenu.rowBelow".asInstanceOf[ContextMenuDOTrowBelow]
  @scala.inline
  def CopyPasteDOTpaste: CopyPasteDOTpaste = "CopyPaste.paste".asInstanceOf[CopyPasteDOTpaste]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def GantChartDOTloadData: GantChartDOTloadData = "GantChart.loadData".asInstanceOf[GantChartDOTloadData]
  @scala.inline
  def ObserveChangesDOTchange: ObserveChangesDOTchange = "ObserveChanges.change".asInstanceOf[ObserveChangesDOTchange]
  @scala.inline
  def STATE_EDITING: STATE_EDITING = "STATE_EDITING".asInstanceOf[STATE_EDITING]
  @scala.inline
  def STATE_FINISHED: STATE_FINISHED = "STATE_FINISHED".asInstanceOf[STATE_FINISHED]
  @scala.inline
  def STATE_VIRGIN: STATE_VIRGIN = "STATE_VIRGIN".asInstanceOf[STATE_VIRGIN]
  @scala.inline
  def STATE_WAITING: STATE_WAITING = "STATE_WAITING".asInstanceOf[STATE_WAITING]
  @scala.inline
  def UndoRedoDOTredo: UndoRedoDOTredo = "UndoRedo.redo".asInstanceOf[UndoRedoDOTredo]
  @scala.inline
  def UndoRedoDOTundo: UndoRedoDOTundo = "UndoRedo.undo".asInstanceOf[UndoRedoDOTundo]
  @scala.inline
  def add_child: add_child = "add_child".asInstanceOf[add_child]
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def alignment: alignment = "alignment".asInstanceOf[alignment]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def area: area = "area".asInstanceOf[area]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def autoColumnSize: autoColumnSize = "autoColumnSize".asInstanceOf[autoColumnSize]
  @scala.inline
  def autoRowSize: autoRowSize = "autoRowSize".asInstanceOf[autoRowSize]
  @scala.inline
  def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  @scala.inline
  def autofill: autofill = "autofill".asInstanceOf[autofill]
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def begins_with: begins_with = "begins_with".asInstanceOf[begins_with]
  @scala.inline
  def between: between = "between".asInstanceOf[between]
  @scala.inline
  def bindRowsWithHeaders: bindRowsWithHeaders = "bindRowsWithHeaders".asInstanceOf[bindRowsWithHeaders]
  @scala.inline
  def borders: borders = "borders".asInstanceOf[borders]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `bottom-left-corner`: `bottom-left-corner` = "bottom-left-corner".asInstanceOf[`bottom-left-corner`]
  @scala.inline
  def bottom_left_corner: bottom_left_corner = "bottom_left_corner".asInstanceOf[bottom_left_corner]
  @scala.inline
  def by_value: by_value = "by_value".asInstanceOf[by_value]
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def clear_column: clear_column = "clear_column".asInstanceOf[clear_column]
  @scala.inline
  def col_left: col_left = "col_left".asInstanceOf[col_left]
  @scala.inline
  def col_right: col_right = "col_right".asInstanceOf[col_right]
  @scala.inline
  def collapsibleColumns: collapsibleColumns = "collapsibleColumns".asInstanceOf[collapsibleColumns]
  @scala.inline
  def columnSorting: columnSorting = "columnSorting".asInstanceOf[columnSorting]
  @scala.inline
  def columnSummary: columnSummary = "columnSummary".asInstanceOf[columnSummary]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def comments: comments = "comments".asInstanceOf[comments]
  @scala.inline
  def commentsAddEdit: commentsAddEdit = "commentsAddEdit".asInstanceOf[commentsAddEdit]
  @scala.inline
  def commentsReadOnly: commentsReadOnly = "commentsReadOnly".asInstanceOf[commentsReadOnly]
  @scala.inline
  def commentsRemove: commentsRemove = "commentsRemove".asInstanceOf[commentsRemove]
  @scala.inline
  def conjunction: conjunction = "conjunction".asInstanceOf[conjunction]
  @scala.inline
  def contains: contains = "contains".asInstanceOf[contains]
  @scala.inline
  def contextMenu: contextMenu = "contextMenu".asInstanceOf[contextMenu]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def copyPaste: copyPaste = "copyPaste".asInstanceOf[copyPaste]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def cut: cut = "cut".asInstanceOf[cut]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def dateValidate: dateValidate = "dateValidate".asInstanceOf[dateValidate]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def detach_from_parent: detach_from_parent = "detach_from_parent".asInstanceOf[detach_from_parent]
  @scala.inline
  def disjunction: disjunction = "disjunction".asInstanceOf[disjunction]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def dragToScroll: dragToScroll = "dragToScroll".asInstanceOf[dragToScroll]
  @scala.inline
  def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  @scala.inline
  def dropdownMenu: dropdownMenu = "dropdownMenu".asInstanceOf[dropdownMenu]
  @scala.inline
  def edit: edit = "edit".asInstanceOf[edit]
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  @scala.inline
  def ends_with: ends_with = "ends_with".asInstanceOf[ends_with]
  @scala.inline
  def eq: eq = "eq".asInstanceOf[eq]
  @scala.inline
  def exportFile: exportFile = "exportFile".asInstanceOf[exportFile]
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  @scala.inline
  def filter_action_bar: filter_action_bar = "filter_action_bar".asInstanceOf[filter_action_bar]
  @scala.inline
  def filter_by_condition: filter_by_condition = "filter_by_condition".asInstanceOf[filter_by_condition]
  @scala.inline
  def filter_by_condition2: filter_by_condition2 = "filter_by_condition2".asInstanceOf[filter_by_condition2]
  @scala.inline
  def filter_by_value: filter_by_value = "filter_by_value".asInstanceOf[filter_by_value]
  @scala.inline
  def filter_operators: filter_operators = "filter_operators".asInstanceOf[filter_operators]
  @scala.inline
  def filters: filters = "filters".asInstanceOf[filters]
  @scala.inline
  def formulas: formulas = "formulas".asInstanceOf[formulas]
  @scala.inline
  def freeze_column: freeze_column = "freeze_column".asInstanceOf[freeze_column]
  @scala.inline
  def ganttChart: ganttChart = "ganttChart".asInstanceOf[ganttChart]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def gt: gt = "gt".asInstanceOf[gt]
  @scala.inline
  def gte: gte = "gte".asInstanceOf[gte]
  @scala.inline
  def handsontable: handsontable = "handsontable".asInstanceOf[handsontable]
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  @scala.inline
  def headerTooltips: headerTooltips = "headerTooltips".asInstanceOf[headerTooltips]
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  @scala.inline
  def hiddenColumns: hiddenColumns = "hiddenColumns".asInstanceOf[hiddenColumns]
  @scala.inline
  def hiddenRows: hiddenRows = "hiddenRows".asInstanceOf[hiddenRows]
  @scala.inline
  def hidden_columns_hide: hidden_columns_hide = "hidden_columns_hide".asInstanceOf[hidden_columns_hide]
  @scala.inline
  def hidden_columns_show: hidden_columns_show = "hidden_columns_show".asInstanceOf[hidden_columns_show]
  @scala.inline
  def hidden_rows_hide: hidden_rows_hide = "hidden_rows_hide".asInstanceOf[hidden_rows_hide]
  @scala.inline
  def hidden_rows_show: hidden_rows_show = "hidden_rows_show".asInstanceOf[hidden_rows_show]
  @scala.inline
  def highlight: highlight = "highlight".asInstanceOf[highlight]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def htBottom: htBottom = "htBottom".asInstanceOf[htBottom]
  @scala.inline
  def htCenter: htCenter = "htCenter".asInstanceOf[htCenter]
  @scala.inline
  def htJustify: htJustify = "htJustify".asInstanceOf[htJustify]
  @scala.inline
  def htLeft: htLeft = "htLeft".asInstanceOf[htLeft]
  @scala.inline
  def htMiddle: htMiddle = "htMiddle".asInstanceOf[htMiddle]
  @scala.inline
  def htRight: htRight = "htRight".asInstanceOf[htRight]
  @scala.inline
  def htTop: htTop = "htTop".asInstanceOf[htTop]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def insert_col: insert_col = "insert_col".asInstanceOf[insert_col]
  @scala.inline
  def insert_row: insert_row = "insert_row".asInstanceOf[insert_row]
  @scala.inline
  def isSearchResult: isSearchResult = "isSearchResult".asInstanceOf[isSearchResult]
  @scala.inline
  def last: last = "last".asInstanceOf[last]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def loadData: loadData = "loadData".asInstanceOf[loadData]
  @scala.inline
  def loose: loose = "loose".asInstanceOf[loose]
  @scala.inline
  def lt: lt = "lt".asInstanceOf[lt]
  @scala.inline
  def lte: lte = "lte".asInstanceOf[lte]
  @scala.inline
  def make_read_only: make_read_only = "make_read_only".asInstanceOf[make_read_only]
  @scala.inline
  def manualColumnFreeze: manualColumnFreeze = "manualColumnFreeze".asInstanceOf[manualColumnFreeze]
  @scala.inline
  def manualColumnMove: manualColumnMove = "manualColumnMove".asInstanceOf[manualColumnMove]
  @scala.inline
  def manualColumnResize: manualColumnResize = "manualColumnResize".asInstanceOf[manualColumnResize]
  @scala.inline
  def manualRowMove: manualRowMove = "manualRowMove".asInstanceOf[manualRowMove]
  @scala.inline
  def manualRowResize: manualRowResize = "manualRowResize".asInstanceOf[manualRowResize]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def mergeCells: mergeCells = "mergeCells".asInstanceOf[mergeCells]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
  @scala.inline
  def monday: monday = "monday".asInstanceOf[monday]
  @scala.inline
  def multiColumnSorting: multiColumnSorting = "multiColumnSorting".asInstanceOf[multiColumnSorting]
  @scala.inline
  def multiple: multiple = "multiple".asInstanceOf[multiple]
  @scala.inline
  def multipleSelectionHandles: multipleSelectionHandles = "multipleSelectionHandles".asInstanceOf[multipleSelectionHandles]
  @scala.inline
  def neq: neq = "neq".asInstanceOf[neq]
  @scala.inline
  def nestedHeaders: nestedHeaders = "nestedHeaders".asInstanceOf[nestedHeaders]
  @scala.inline
  def nestedRows: nestedRows = "nestedRows".asInstanceOf[nestedRows]
  @scala.inline
  def `non-commercial-and-evaluation`: `non-commercial-and-evaluation` = "non-commercial-and-evaluation".asInstanceOf[`non-commercial-and-evaluation`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def not_between: not_between = "not_between".asInstanceOf[not_between]
  @scala.inline
  def not_contains: not_contains = "not_contains".asInstanceOf[not_contains]
  @scala.inline
  def not_empty: not_empty = "not_empty".asInstanceOf[not_empty]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def observeChanges: observeChanges = "observeChanges".asInstanceOf[observeChanges]
  @scala.inline
  def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def persistentState: persistentState = "persistentState".asInstanceOf[persistentState]
  @scala.inline
  def populateFromArray: populateFromArray = "populateFromArray".asInstanceOf[populateFromArray]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def redo: redo = "redo".asInstanceOf[redo]
  @scala.inline
  def remove_col: remove_col = "remove_col".asInstanceOf[remove_col]
  @scala.inline
  def remove_row: remove_row = "remove_row".asInstanceOf[remove_row]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def row_above: row_above = "row_above".asInstanceOf[row_above]
  @scala.inline
  def row_below: row_below = "row_below".asInstanceOf[row_below]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def shift_down: shift_down = "shift_down".asInstanceOf[shift_down]
  @scala.inline
  def shift_right: shift_right = "shift_right".asInstanceOf[shift_right]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def skipRowOnPaste: skipRowOnPaste = "skipRowOnPaste".asInstanceOf[skipRowOnPaste]
  @scala.inline
  def spliceCol: spliceCol = "spliceCol".asInstanceOf[spliceCol]
  @scala.inline
  def spliceRow: spliceRow = "spliceRow".asInstanceOf[spliceRow]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def sunday: sunday = "sunday".asInstanceOf[sunday]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def timeValidate: timeValidate = "timeValidate".asInstanceOf[timeValidate]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `top-left-corner`: `top-left-corner` = "top-left-corner".asInstanceOf[`top-left-corner`]
  @scala.inline
  def top_left_corner: top_left_corner = "top_left_corner".asInstanceOf[top_left_corner]
  @scala.inline
  def touchScroll: touchScroll = "touchScroll".asInstanceOf[touchScroll]
  @scala.inline
  def trimRows: trimRows = "trimRows".asInstanceOf[trimRows]
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  @scala.inline
  def unfreeze_column: unfreeze_column = "unfreeze_column".asInstanceOf[unfreeze_column]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  @scala.inline
  def validateCells: validateCells = "validateCells".asInstanceOf[validateCells]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

