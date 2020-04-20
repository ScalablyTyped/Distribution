package typings.handsontable

import typings.handsontable.mod.Handsontable.CellType
import typings.handsontable.mod.Handsontable.ChangeSource
import typings.handsontable.mod.Handsontable.EditorType
import typings.handsontable.mod.Handsontable.RendererType
import typings.handsontable.mod.Handsontable.ValidatorType
import typings.handsontable.mod.Handsontable._editors.EditorState
import typings.handsontable.mod.Handsontable.columnSorting.SortOrderType
import typings.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ConditionName
import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.OperationType
import typings.handsontable.mod.Handsontable.plugins.PasteModeType
import typings.handsontable.mod.Handsontable.wot.OverlayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object handsontableStrings {
  @js.native
  sealed trait `---------` extends PredefinedMenuItemKey
  
  @js.native
  sealed trait AutofillDotfill extends ChangeSource
  
  @js.native
  sealed trait ColumnSummaryDotreset extends ChangeSource
  
  @js.native
  sealed trait ColumnSummaryDotset extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotclearColumns extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotcolumnLeft extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotcolumnRight extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotremoveColumn extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotremoveRow extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotrowAbove extends ChangeSource
  
  @js.native
  sealed trait ContextMenuDotrowBelow extends ChangeSource
  
  @js.native
  sealed trait CopyPasteDotpaste extends ChangeSource
  
  @js.native
  sealed trait GantChartDotloadData extends ChangeSource
  
  @js.native
  sealed trait ObserveChangesDotchange extends ChangeSource
  
  @js.native
  sealed trait STATE_EDITING extends EditorState
  
  @js.native
  sealed trait STATE_FINISHED extends EditorState
  
  @js.native
  sealed trait STATE_VIRGIN extends EditorState
  
  @js.native
  sealed trait STATE_WAITING extends EditorState
  
  @js.native
  sealed trait UndoRedoDotredo extends ChangeSource
  
  @js.native
  sealed trait UndoRedoDotundo extends ChangeSource
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait add_child extends PredefinedMenuItemKey
  
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait afterAddChild extends js.Object
  
  @js.native
  sealed trait afterBeginEditing extends js.Object
  
  @js.native
  sealed trait afterCellMetaReset extends js.Object
  
  @js.native
  sealed trait afterChange extends js.Object
  
  @js.native
  sealed trait afterChangesObserved extends js.Object
  
  @js.native
  sealed trait afterColumnMove extends js.Object
  
  @js.native
  sealed trait afterColumnResize extends js.Object
  
  @js.native
  sealed trait afterColumnSort extends js.Object
  
  @js.native
  sealed trait afterContextMenuDefaultOptions extends js.Object
  
  @js.native
  sealed trait afterContextMenuHide extends js.Object
  
  @js.native
  sealed trait afterContextMenuShow extends js.Object
  
  @js.native
  sealed trait afterCopy extends js.Object
  
  @js.native
  sealed trait afterCopyLimit extends js.Object
  
  @js.native
  sealed trait afterCreateCol extends js.Object
  
  @js.native
  sealed trait afterCreateRow extends js.Object
  
  @js.native
  sealed trait afterCut extends js.Object
  
  @js.native
  sealed trait afterDeselect extends js.Object
  
  @js.native
  sealed trait afterDestroy extends js.Object
  
  @js.native
  sealed trait afterDetachChild extends js.Object
  
  @js.native
  sealed trait afterDocumentKeyDown extends js.Object
  
  @js.native
  sealed trait afterDrawSelection extends js.Object
  
  @js.native
  sealed trait afterDropdownMenuDefaultOptions extends js.Object
  
  @js.native
  sealed trait afterDropdownMenuHide extends js.Object
  
  @js.native
  sealed trait afterDropdownMenuShow extends js.Object
  
  @js.native
  sealed trait afterFilter extends js.Object
  
  @js.native
  sealed trait afterGetCellMeta extends js.Object
  
  @js.native
  sealed trait afterGetColHeader extends js.Object
  
  @js.native
  sealed trait afterGetColumnHeaderRenderers extends js.Object
  
  @js.native
  sealed trait afterGetRowHeader extends js.Object
  
  @js.native
  sealed trait afterGetRowHeaderRenderers extends js.Object
  
  @js.native
  sealed trait afterHideColumns extends js.Object
  
  @js.native
  sealed trait afterHideRows extends js.Object
  
  @js.native
  sealed trait afterInit extends js.Object
  
  @js.native
  sealed trait afterLanguageChange extends js.Object
  
  @js.native
  sealed trait afterListen extends js.Object
  
  @js.native
  sealed trait afterLoadData extends js.Object
  
  @js.native
  sealed trait afterMergeCells extends js.Object
  
  @js.native
  sealed trait afterModifyTransformEnd extends js.Object
  
  @js.native
  sealed trait afterModifyTransformStart extends js.Object
  
  @js.native
  sealed trait afterMomentumScroll extends js.Object
  
  @js.native
  sealed trait afterOnCellContextMenu extends js.Object
  
  @js.native
  sealed trait afterOnCellCornerDblClick extends js.Object
  
  @js.native
  sealed trait afterOnCellCornerMouseDown extends js.Object
  
  @js.native
  sealed trait afterOnCellMouseDown extends js.Object
  
  @js.native
  sealed trait afterOnCellMouseOut extends js.Object
  
  @js.native
  sealed trait afterOnCellMouseOver extends js.Object
  
  @js.native
  sealed trait afterOnCellMouseUp extends js.Object
  
  @js.native
  sealed trait afterPaste extends js.Object
  
  @js.native
  sealed trait afterPluginsInitialized extends js.Object
  
  @js.native
  sealed trait afterRedo extends js.Object
  
  @js.native
  sealed trait afterRefreshDimensions extends js.Object
  
  @js.native
  sealed trait afterRemoveCellMeta extends js.Object
  
  @js.native
  sealed trait afterRemoveCol extends js.Object
  
  @js.native
  sealed trait afterRemoveRow extends js.Object
  
  @js.native
  sealed trait afterRender extends js.Object
  
  @js.native
  sealed trait afterRenderer extends js.Object
  
  @js.native
  sealed trait afterRowMove extends js.Object
  
  @js.native
  sealed trait afterRowResize extends js.Object
  
  @js.native
  sealed trait afterScrollHorizontally extends js.Object
  
  @js.native
  sealed trait afterScrollVertically extends js.Object
  
  @js.native
  sealed trait afterSelection extends js.Object
  
  @js.native
  sealed trait afterSelectionByProp extends js.Object
  
  @js.native
  sealed trait afterSelectionEnd extends js.Object
  
  @js.native
  sealed trait afterSelectionEndByProp extends js.Object
  
  @js.native
  sealed trait afterSetCellMeta extends js.Object
  
  @js.native
  sealed trait afterSetDataAtCell extends js.Object
  
  @js.native
  sealed trait afterSetDataAtRowProp extends js.Object
  
  @js.native
  sealed trait afterTrimRow extends js.Object
  
  @js.native
  sealed trait afterUndo extends js.Object
  
  @js.native
  sealed trait afterUnhideColumns extends js.Object
  
  @js.native
  sealed trait afterUnhideRows extends js.Object
  
  @js.native
  sealed trait afterUnlisten extends js.Object
  
  @js.native
  sealed trait afterUnmergeCells extends js.Object
  
  @js.native
  sealed trait afterUntrimRow extends js.Object
  
  @js.native
  sealed trait afterUpdateSettings extends js.Object
  
  @js.native
  sealed trait afterValidate extends js.Object
  
  @js.native
  sealed trait afterViewportColumnCalculatorOverride extends js.Object
  
  @js.native
  sealed trait afterViewportRowCalculatorOverride extends js.Object
  
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
  sealed trait basePlugin extends js.Object
  
  @js.native
  sealed trait before extends js.Object
  
  @js.native
  sealed trait beforeAddChild extends js.Object
  
  @js.native
  sealed trait beforeAutofill extends js.Object
  
  @js.native
  sealed trait beforeAutofillInsidePopulate extends js.Object
  
  @js.native
  sealed trait beforeCellAlignment extends js.Object
  
  @js.native
  sealed trait beforeChange extends js.Object
  
  @js.native
  sealed trait beforeChangeRender extends js.Object
  
  @js.native
  sealed trait beforeColumnMove extends js.Object
  
  @js.native
  sealed trait beforeColumnResize extends js.Object
  
  @js.native
  sealed trait beforeColumnSort extends js.Object
  
  @js.native
  sealed trait beforeContextMenuSetItems extends js.Object
  
  @js.native
  sealed trait beforeContextMenuShow extends js.Object
  
  @js.native
  sealed trait beforeCopy extends js.Object
  
  @js.native
  sealed trait beforeCreateCol extends js.Object
  
  @js.native
  sealed trait beforeCreateRow extends js.Object
  
  @js.native
  sealed trait beforeCut extends js.Object
  
  @js.native
  sealed trait beforeDetachChild extends js.Object
  
  @js.native
  sealed trait beforeDrawBorders extends js.Object
  
  @js.native
  sealed trait beforeDropdownMenuSetItems extends js.Object
  
  @js.native
  sealed trait beforeDropdownMenuShow extends js.Object
  
  @js.native
  sealed trait beforeFilter extends js.Object
  
  @js.native
  sealed trait beforeGetCellMeta extends js.Object
  
  @js.native
  sealed trait beforeHideColumns extends js.Object
  
  @js.native
  sealed trait beforeHideRows extends js.Object
  
  @js.native
  sealed trait beforeInit extends js.Object
  
  @js.native
  sealed trait beforeInitWalkontable extends js.Object
  
  @js.native
  sealed trait beforeKeyDown extends js.Object
  
  @js.native
  sealed trait beforeLanguageChange extends js.Object
  
  @js.native
  sealed trait beforeMergeCells extends js.Object
  
  @js.native
  sealed trait beforeOnCellContextMenu extends js.Object
  
  @js.native
  sealed trait beforeOnCellMouseDown extends js.Object
  
  @js.native
  sealed trait beforeOnCellMouseOut extends js.Object
  
  @js.native
  sealed trait beforeOnCellMouseOver extends js.Object
  
  @js.native
  sealed trait beforeOnCellMouseUp extends js.Object
  
  @js.native
  sealed trait beforePaste extends js.Object
  
  @js.native
  sealed trait beforeRedo extends js.Object
  
  @js.native
  sealed trait beforeRefreshDimensions extends js.Object
  
  @js.native
  sealed trait beforeRemoveCellClassNames extends js.Object
  
  @js.native
  sealed trait beforeRemoveCellMeta extends js.Object
  
  @js.native
  sealed trait beforeRemoveCol extends js.Object
  
  @js.native
  sealed trait beforeRemoveRow extends js.Object
  
  @js.native
  sealed trait beforeRender extends js.Object
  
  @js.native
  sealed trait beforeRenderer extends js.Object
  
  @js.native
  sealed trait beforeRowMove extends js.Object
  
  @js.native
  sealed trait beforeRowResize extends js.Object
  
  @js.native
  sealed trait beforeSetRangeEnd extends js.Object
  
  @js.native
  sealed trait beforeSetRangeStart extends js.Object
  
  @js.native
  sealed trait beforeSetRangeStartOnly extends js.Object
  
  @js.native
  sealed trait beforeStretchingColumnWidth extends js.Object
  
  @js.native
  sealed trait beforeTouchScroll extends js.Object
  
  @js.native
  sealed trait beforeTrimRow extends js.Object
  
  @js.native
  sealed trait beforeUndo extends js.Object
  
  @js.native
  sealed trait beforeUnhideColumns extends js.Object
  
  @js.native
  sealed trait beforeUnhideRows extends js.Object
  
  @js.native
  sealed trait beforeUnmergeCells extends js.Object
  
  @js.native
  sealed trait beforeUntrimRow extends js.Object
  
  @js.native
  sealed trait beforeValidate extends js.Object
  
  @js.native
  sealed trait beforeValueRender extends js.Object
  
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
  sealed trait construct extends js.Object
  
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
  sealed trait hiddenColumn extends js.Object
  
  @js.native
  sealed trait hiddenColumns extends js.Object
  
  @js.native
  sealed trait hiddenRow extends js.Object
  
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
  sealed trait init extends js.Object
  
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
  sealed trait modifyAutofillRange extends js.Object
  
  @js.native
  sealed trait modifyCol extends js.Object
  
  @js.native
  sealed trait modifyColHeader extends js.Object
  
  @js.native
  sealed trait modifyColWidth extends js.Object
  
  @js.native
  sealed trait modifyColumnHeaderHeight extends js.Object
  
  @js.native
  sealed trait modifyCopyableRange extends js.Object
  
  @js.native
  sealed trait modifyData extends js.Object
  
  @js.native
  sealed trait modifyGetCellCoords extends js.Object
  
  @js.native
  sealed trait modifyRow extends js.Object
  
  @js.native
  sealed trait modifyRowData extends js.Object
  
  @js.native
  sealed trait modifyRowHeader extends js.Object
  
  @js.native
  sealed trait modifyRowHeaderWidth extends js.Object
  
  @js.native
  sealed trait modifyRowHeight extends js.Object
  
  @js.native
  sealed trait modifyRowSourceData extends js.Object
  
  @js.native
  sealed trait modifyTransformEnd extends js.Object
  
  @js.native
  sealed trait modifyTransformStart extends js.Object
  
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
  sealed trait persistentStateLoad extends js.Object
  
  @js.native
  sealed trait persistentStateReset extends js.Object
  
  @js.native
  sealed trait persistentStateSave extends js.Object
  
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
  sealed trait skipLengthCache extends js.Object
  
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
  sealed trait unmodifyCol extends js.Object
  
  @js.native
  sealed trait unmodifyRow extends js.Object
  
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
  def AutofillDotfill: AutofillDotfill = "Autofill.fill".asInstanceOf[AutofillDotfill]
  @scala.inline
  def ColumnSummaryDotreset: ColumnSummaryDotreset = "ColumnSummary.reset".asInstanceOf[ColumnSummaryDotreset]
  @scala.inline
  def ColumnSummaryDotset: ColumnSummaryDotset = "ColumnSummary.set".asInstanceOf[ColumnSummaryDotset]
  @scala.inline
  def ContextMenuDotclearColumns: ContextMenuDotclearColumns = "ContextMenu.clearColumns".asInstanceOf[ContextMenuDotclearColumns]
  @scala.inline
  def ContextMenuDotcolumnLeft: ContextMenuDotcolumnLeft = "ContextMenu.columnLeft".asInstanceOf[ContextMenuDotcolumnLeft]
  @scala.inline
  def ContextMenuDotcolumnRight: ContextMenuDotcolumnRight = "ContextMenu.columnRight".asInstanceOf[ContextMenuDotcolumnRight]
  @scala.inline
  def ContextMenuDotremoveColumn: ContextMenuDotremoveColumn = "ContextMenu.removeColumn".asInstanceOf[ContextMenuDotremoveColumn]
  @scala.inline
  def ContextMenuDotremoveRow: ContextMenuDotremoveRow = "ContextMenu.removeRow".asInstanceOf[ContextMenuDotremoveRow]
  @scala.inline
  def ContextMenuDotrowAbove: ContextMenuDotrowAbove = "ContextMenu.rowAbove".asInstanceOf[ContextMenuDotrowAbove]
  @scala.inline
  def ContextMenuDotrowBelow: ContextMenuDotrowBelow = "ContextMenu.rowBelow".asInstanceOf[ContextMenuDotrowBelow]
  @scala.inline
  def CopyPasteDotpaste: CopyPasteDotpaste = "CopyPaste.paste".asInstanceOf[CopyPasteDotpaste]
  @scala.inline
  def GantChartDotloadData: GantChartDotloadData = "GantChart.loadData".asInstanceOf[GantChartDotloadData]
  @scala.inline
  def ObserveChangesDotchange: ObserveChangesDotchange = "ObserveChanges.change".asInstanceOf[ObserveChangesDotchange]
  @scala.inline
  def STATE_EDITING: STATE_EDITING = "STATE_EDITING".asInstanceOf[STATE_EDITING]
  @scala.inline
  def STATE_FINISHED: STATE_FINISHED = "STATE_FINISHED".asInstanceOf[STATE_FINISHED]
  @scala.inline
  def STATE_VIRGIN: STATE_VIRGIN = "STATE_VIRGIN".asInstanceOf[STATE_VIRGIN]
  @scala.inline
  def STATE_WAITING: STATE_WAITING = "STATE_WAITING".asInstanceOf[STATE_WAITING]
  @scala.inline
  def UndoRedoDotredo: UndoRedoDotredo = "UndoRedo.redo".asInstanceOf[UndoRedoDotredo]
  @scala.inline
  def UndoRedoDotundo: UndoRedoDotundo = "UndoRedo.undo".asInstanceOf[UndoRedoDotundo]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def add_child: add_child = "add_child".asInstanceOf[add_child]
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def afterAddChild: afterAddChild = "afterAddChild".asInstanceOf[afterAddChild]
  @scala.inline
  def afterBeginEditing: afterBeginEditing = "afterBeginEditing".asInstanceOf[afterBeginEditing]
  @scala.inline
  def afterCellMetaReset: afterCellMetaReset = "afterCellMetaReset".asInstanceOf[afterCellMetaReset]
  @scala.inline
  def afterChange: afterChange = "afterChange".asInstanceOf[afterChange]
  @scala.inline
  def afterChangesObserved: afterChangesObserved = "afterChangesObserved".asInstanceOf[afterChangesObserved]
  @scala.inline
  def afterColumnMove: afterColumnMove = "afterColumnMove".asInstanceOf[afterColumnMove]
  @scala.inline
  def afterColumnResize: afterColumnResize = "afterColumnResize".asInstanceOf[afterColumnResize]
  @scala.inline
  def afterColumnSort: afterColumnSort = "afterColumnSort".asInstanceOf[afterColumnSort]
  @scala.inline
  def afterContextMenuDefaultOptions: afterContextMenuDefaultOptions = "afterContextMenuDefaultOptions".asInstanceOf[afterContextMenuDefaultOptions]
  @scala.inline
  def afterContextMenuHide: afterContextMenuHide = "afterContextMenuHide".asInstanceOf[afterContextMenuHide]
  @scala.inline
  def afterContextMenuShow: afterContextMenuShow = "afterContextMenuShow".asInstanceOf[afterContextMenuShow]
  @scala.inline
  def afterCopy: afterCopy = "afterCopy".asInstanceOf[afterCopy]
  @scala.inline
  def afterCopyLimit: afterCopyLimit = "afterCopyLimit".asInstanceOf[afterCopyLimit]
  @scala.inline
  def afterCreateCol: afterCreateCol = "afterCreateCol".asInstanceOf[afterCreateCol]
  @scala.inline
  def afterCreateRow: afterCreateRow = "afterCreateRow".asInstanceOf[afterCreateRow]
  @scala.inline
  def afterCut: afterCut = "afterCut".asInstanceOf[afterCut]
  @scala.inline
  def afterDeselect: afterDeselect = "afterDeselect".asInstanceOf[afterDeselect]
  @scala.inline
  def afterDestroy: afterDestroy = "afterDestroy".asInstanceOf[afterDestroy]
  @scala.inline
  def afterDetachChild: afterDetachChild = "afterDetachChild".asInstanceOf[afterDetachChild]
  @scala.inline
  def afterDocumentKeyDown: afterDocumentKeyDown = "afterDocumentKeyDown".asInstanceOf[afterDocumentKeyDown]
  @scala.inline
  def afterDrawSelection: afterDrawSelection = "afterDrawSelection".asInstanceOf[afterDrawSelection]
  @scala.inline
  def afterDropdownMenuDefaultOptions: afterDropdownMenuDefaultOptions = "afterDropdownMenuDefaultOptions".asInstanceOf[afterDropdownMenuDefaultOptions]
  @scala.inline
  def afterDropdownMenuHide: afterDropdownMenuHide = "afterDropdownMenuHide".asInstanceOf[afterDropdownMenuHide]
  @scala.inline
  def afterDropdownMenuShow: afterDropdownMenuShow = "afterDropdownMenuShow".asInstanceOf[afterDropdownMenuShow]
  @scala.inline
  def afterFilter: afterFilter = "afterFilter".asInstanceOf[afterFilter]
  @scala.inline
  def afterGetCellMeta: afterGetCellMeta = "afterGetCellMeta".asInstanceOf[afterGetCellMeta]
  @scala.inline
  def afterGetColHeader: afterGetColHeader = "afterGetColHeader".asInstanceOf[afterGetColHeader]
  @scala.inline
  def afterGetColumnHeaderRenderers: afterGetColumnHeaderRenderers = "afterGetColumnHeaderRenderers".asInstanceOf[afterGetColumnHeaderRenderers]
  @scala.inline
  def afterGetRowHeader: afterGetRowHeader = "afterGetRowHeader".asInstanceOf[afterGetRowHeader]
  @scala.inline
  def afterGetRowHeaderRenderers: afterGetRowHeaderRenderers = "afterGetRowHeaderRenderers".asInstanceOf[afterGetRowHeaderRenderers]
  @scala.inline
  def afterHideColumns: afterHideColumns = "afterHideColumns".asInstanceOf[afterHideColumns]
  @scala.inline
  def afterHideRows: afterHideRows = "afterHideRows".asInstanceOf[afterHideRows]
  @scala.inline
  def afterInit: afterInit = "afterInit".asInstanceOf[afterInit]
  @scala.inline
  def afterLanguageChange: afterLanguageChange = "afterLanguageChange".asInstanceOf[afterLanguageChange]
  @scala.inline
  def afterListen: afterListen = "afterListen".asInstanceOf[afterListen]
  @scala.inline
  def afterLoadData: afterLoadData = "afterLoadData".asInstanceOf[afterLoadData]
  @scala.inline
  def afterMergeCells: afterMergeCells = "afterMergeCells".asInstanceOf[afterMergeCells]
  @scala.inline
  def afterModifyTransformEnd: afterModifyTransformEnd = "afterModifyTransformEnd".asInstanceOf[afterModifyTransformEnd]
  @scala.inline
  def afterModifyTransformStart: afterModifyTransformStart = "afterModifyTransformStart".asInstanceOf[afterModifyTransformStart]
  @scala.inline
  def afterMomentumScroll: afterMomentumScroll = "afterMomentumScroll".asInstanceOf[afterMomentumScroll]
  @scala.inline
  def afterOnCellContextMenu: afterOnCellContextMenu = "afterOnCellContextMenu".asInstanceOf[afterOnCellContextMenu]
  @scala.inline
  def afterOnCellCornerDblClick: afterOnCellCornerDblClick = "afterOnCellCornerDblClick".asInstanceOf[afterOnCellCornerDblClick]
  @scala.inline
  def afterOnCellCornerMouseDown: afterOnCellCornerMouseDown = "afterOnCellCornerMouseDown".asInstanceOf[afterOnCellCornerMouseDown]
  @scala.inline
  def afterOnCellMouseDown: afterOnCellMouseDown = "afterOnCellMouseDown".asInstanceOf[afterOnCellMouseDown]
  @scala.inline
  def afterOnCellMouseOut: afterOnCellMouseOut = "afterOnCellMouseOut".asInstanceOf[afterOnCellMouseOut]
  @scala.inline
  def afterOnCellMouseOver: afterOnCellMouseOver = "afterOnCellMouseOver".asInstanceOf[afterOnCellMouseOver]
  @scala.inline
  def afterOnCellMouseUp: afterOnCellMouseUp = "afterOnCellMouseUp".asInstanceOf[afterOnCellMouseUp]
  @scala.inline
  def afterPaste: afterPaste = "afterPaste".asInstanceOf[afterPaste]
  @scala.inline
  def afterPluginsInitialized: afterPluginsInitialized = "afterPluginsInitialized".asInstanceOf[afterPluginsInitialized]
  @scala.inline
  def afterRedo: afterRedo = "afterRedo".asInstanceOf[afterRedo]
  @scala.inline
  def afterRefreshDimensions: afterRefreshDimensions = "afterRefreshDimensions".asInstanceOf[afterRefreshDimensions]
  @scala.inline
  def afterRemoveCellMeta: afterRemoveCellMeta = "afterRemoveCellMeta".asInstanceOf[afterRemoveCellMeta]
  @scala.inline
  def afterRemoveCol: afterRemoveCol = "afterRemoveCol".asInstanceOf[afterRemoveCol]
  @scala.inline
  def afterRemoveRow: afterRemoveRow = "afterRemoveRow".asInstanceOf[afterRemoveRow]
  @scala.inline
  def afterRender: afterRender = "afterRender".asInstanceOf[afterRender]
  @scala.inline
  def afterRenderer: afterRenderer = "afterRenderer".asInstanceOf[afterRenderer]
  @scala.inline
  def afterRowMove: afterRowMove = "afterRowMove".asInstanceOf[afterRowMove]
  @scala.inline
  def afterRowResize: afterRowResize = "afterRowResize".asInstanceOf[afterRowResize]
  @scala.inline
  def afterScrollHorizontally: afterScrollHorizontally = "afterScrollHorizontally".asInstanceOf[afterScrollHorizontally]
  @scala.inline
  def afterScrollVertically: afterScrollVertically = "afterScrollVertically".asInstanceOf[afterScrollVertically]
  @scala.inline
  def afterSelection: afterSelection = "afterSelection".asInstanceOf[afterSelection]
  @scala.inline
  def afterSelectionByProp: afterSelectionByProp = "afterSelectionByProp".asInstanceOf[afterSelectionByProp]
  @scala.inline
  def afterSelectionEnd: afterSelectionEnd = "afterSelectionEnd".asInstanceOf[afterSelectionEnd]
  @scala.inline
  def afterSelectionEndByProp: afterSelectionEndByProp = "afterSelectionEndByProp".asInstanceOf[afterSelectionEndByProp]
  @scala.inline
  def afterSetCellMeta: afterSetCellMeta = "afterSetCellMeta".asInstanceOf[afterSetCellMeta]
  @scala.inline
  def afterSetDataAtCell: afterSetDataAtCell = "afterSetDataAtCell".asInstanceOf[afterSetDataAtCell]
  @scala.inline
  def afterSetDataAtRowProp: afterSetDataAtRowProp = "afterSetDataAtRowProp".asInstanceOf[afterSetDataAtRowProp]
  @scala.inline
  def afterTrimRow: afterTrimRow = "afterTrimRow".asInstanceOf[afterTrimRow]
  @scala.inline
  def afterUndo: afterUndo = "afterUndo".asInstanceOf[afterUndo]
  @scala.inline
  def afterUnhideColumns: afterUnhideColumns = "afterUnhideColumns".asInstanceOf[afterUnhideColumns]
  @scala.inline
  def afterUnhideRows: afterUnhideRows = "afterUnhideRows".asInstanceOf[afterUnhideRows]
  @scala.inline
  def afterUnlisten: afterUnlisten = "afterUnlisten".asInstanceOf[afterUnlisten]
  @scala.inline
  def afterUnmergeCells: afterUnmergeCells = "afterUnmergeCells".asInstanceOf[afterUnmergeCells]
  @scala.inline
  def afterUntrimRow: afterUntrimRow = "afterUntrimRow".asInstanceOf[afterUntrimRow]
  @scala.inline
  def afterUpdateSettings: afterUpdateSettings = "afterUpdateSettings".asInstanceOf[afterUpdateSettings]
  @scala.inline
  def afterValidate: afterValidate = "afterValidate".asInstanceOf[afterValidate]
  @scala.inline
  def afterViewportColumnCalculatorOverride: afterViewportColumnCalculatorOverride = "afterViewportColumnCalculatorOverride".asInstanceOf[afterViewportColumnCalculatorOverride]
  @scala.inline
  def afterViewportRowCalculatorOverride: afterViewportRowCalculatorOverride = "afterViewportRowCalculatorOverride".asInstanceOf[afterViewportRowCalculatorOverride]
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
  def basePlugin: basePlugin = "basePlugin".asInstanceOf[basePlugin]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def beforeAddChild: beforeAddChild = "beforeAddChild".asInstanceOf[beforeAddChild]
  @scala.inline
  def beforeAutofill: beforeAutofill = "beforeAutofill".asInstanceOf[beforeAutofill]
  @scala.inline
  def beforeAutofillInsidePopulate: beforeAutofillInsidePopulate = "beforeAutofillInsidePopulate".asInstanceOf[beforeAutofillInsidePopulate]
  @scala.inline
  def beforeCellAlignment: beforeCellAlignment = "beforeCellAlignment".asInstanceOf[beforeCellAlignment]
  @scala.inline
  def beforeChange: beforeChange = "beforeChange".asInstanceOf[beforeChange]
  @scala.inline
  def beforeChangeRender: beforeChangeRender = "beforeChangeRender".asInstanceOf[beforeChangeRender]
  @scala.inline
  def beforeColumnMove: beforeColumnMove = "beforeColumnMove".asInstanceOf[beforeColumnMove]
  @scala.inline
  def beforeColumnResize: beforeColumnResize = "beforeColumnResize".asInstanceOf[beforeColumnResize]
  @scala.inline
  def beforeColumnSort: beforeColumnSort = "beforeColumnSort".asInstanceOf[beforeColumnSort]
  @scala.inline
  def beforeContextMenuSetItems: beforeContextMenuSetItems = "beforeContextMenuSetItems".asInstanceOf[beforeContextMenuSetItems]
  @scala.inline
  def beforeContextMenuShow: beforeContextMenuShow = "beforeContextMenuShow".asInstanceOf[beforeContextMenuShow]
  @scala.inline
  def beforeCopy: beforeCopy = "beforeCopy".asInstanceOf[beforeCopy]
  @scala.inline
  def beforeCreateCol: beforeCreateCol = "beforeCreateCol".asInstanceOf[beforeCreateCol]
  @scala.inline
  def beforeCreateRow: beforeCreateRow = "beforeCreateRow".asInstanceOf[beforeCreateRow]
  @scala.inline
  def beforeCut: beforeCut = "beforeCut".asInstanceOf[beforeCut]
  @scala.inline
  def beforeDetachChild: beforeDetachChild = "beforeDetachChild".asInstanceOf[beforeDetachChild]
  @scala.inline
  def beforeDrawBorders: beforeDrawBorders = "beforeDrawBorders".asInstanceOf[beforeDrawBorders]
  @scala.inline
  def beforeDropdownMenuSetItems: beforeDropdownMenuSetItems = "beforeDropdownMenuSetItems".asInstanceOf[beforeDropdownMenuSetItems]
  @scala.inline
  def beforeDropdownMenuShow: beforeDropdownMenuShow = "beforeDropdownMenuShow".asInstanceOf[beforeDropdownMenuShow]
  @scala.inline
  def beforeFilter: beforeFilter = "beforeFilter".asInstanceOf[beforeFilter]
  @scala.inline
  def beforeGetCellMeta: beforeGetCellMeta = "beforeGetCellMeta".asInstanceOf[beforeGetCellMeta]
  @scala.inline
  def beforeHideColumns: beforeHideColumns = "beforeHideColumns".asInstanceOf[beforeHideColumns]
  @scala.inline
  def beforeHideRows: beforeHideRows = "beforeHideRows".asInstanceOf[beforeHideRows]
  @scala.inline
  def beforeInit: beforeInit = "beforeInit".asInstanceOf[beforeInit]
  @scala.inline
  def beforeInitWalkontable: beforeInitWalkontable = "beforeInitWalkontable".asInstanceOf[beforeInitWalkontable]
  @scala.inline
  def beforeKeyDown: beforeKeyDown = "beforeKeyDown".asInstanceOf[beforeKeyDown]
  @scala.inline
  def beforeLanguageChange: beforeLanguageChange = "beforeLanguageChange".asInstanceOf[beforeLanguageChange]
  @scala.inline
  def beforeMergeCells: beforeMergeCells = "beforeMergeCells".asInstanceOf[beforeMergeCells]
  @scala.inline
  def beforeOnCellContextMenu: beforeOnCellContextMenu = "beforeOnCellContextMenu".asInstanceOf[beforeOnCellContextMenu]
  @scala.inline
  def beforeOnCellMouseDown: beforeOnCellMouseDown = "beforeOnCellMouseDown".asInstanceOf[beforeOnCellMouseDown]
  @scala.inline
  def beforeOnCellMouseOut: beforeOnCellMouseOut = "beforeOnCellMouseOut".asInstanceOf[beforeOnCellMouseOut]
  @scala.inline
  def beforeOnCellMouseOver: beforeOnCellMouseOver = "beforeOnCellMouseOver".asInstanceOf[beforeOnCellMouseOver]
  @scala.inline
  def beforeOnCellMouseUp: beforeOnCellMouseUp = "beforeOnCellMouseUp".asInstanceOf[beforeOnCellMouseUp]
  @scala.inline
  def beforePaste: beforePaste = "beforePaste".asInstanceOf[beforePaste]
  @scala.inline
  def beforeRedo: beforeRedo = "beforeRedo".asInstanceOf[beforeRedo]
  @scala.inline
  def beforeRefreshDimensions: beforeRefreshDimensions = "beforeRefreshDimensions".asInstanceOf[beforeRefreshDimensions]
  @scala.inline
  def beforeRemoveCellClassNames: beforeRemoveCellClassNames = "beforeRemoveCellClassNames".asInstanceOf[beforeRemoveCellClassNames]
  @scala.inline
  def beforeRemoveCellMeta: beforeRemoveCellMeta = "beforeRemoveCellMeta".asInstanceOf[beforeRemoveCellMeta]
  @scala.inline
  def beforeRemoveCol: beforeRemoveCol = "beforeRemoveCol".asInstanceOf[beforeRemoveCol]
  @scala.inline
  def beforeRemoveRow: beforeRemoveRow = "beforeRemoveRow".asInstanceOf[beforeRemoveRow]
  @scala.inline
  def beforeRender: beforeRender = "beforeRender".asInstanceOf[beforeRender]
  @scala.inline
  def beforeRenderer: beforeRenderer = "beforeRenderer".asInstanceOf[beforeRenderer]
  @scala.inline
  def beforeRowMove: beforeRowMove = "beforeRowMove".asInstanceOf[beforeRowMove]
  @scala.inline
  def beforeRowResize: beforeRowResize = "beforeRowResize".asInstanceOf[beforeRowResize]
  @scala.inline
  def beforeSetRangeEnd: beforeSetRangeEnd = "beforeSetRangeEnd".asInstanceOf[beforeSetRangeEnd]
  @scala.inline
  def beforeSetRangeStart: beforeSetRangeStart = "beforeSetRangeStart".asInstanceOf[beforeSetRangeStart]
  @scala.inline
  def beforeSetRangeStartOnly: beforeSetRangeStartOnly = "beforeSetRangeStartOnly".asInstanceOf[beforeSetRangeStartOnly]
  @scala.inline
  def beforeStretchingColumnWidth: beforeStretchingColumnWidth = "beforeStretchingColumnWidth".asInstanceOf[beforeStretchingColumnWidth]
  @scala.inline
  def beforeTouchScroll: beforeTouchScroll = "beforeTouchScroll".asInstanceOf[beforeTouchScroll]
  @scala.inline
  def beforeTrimRow: beforeTrimRow = "beforeTrimRow".asInstanceOf[beforeTrimRow]
  @scala.inline
  def beforeUndo: beforeUndo = "beforeUndo".asInstanceOf[beforeUndo]
  @scala.inline
  def beforeUnhideColumns: beforeUnhideColumns = "beforeUnhideColumns".asInstanceOf[beforeUnhideColumns]
  @scala.inline
  def beforeUnhideRows: beforeUnhideRows = "beforeUnhideRows".asInstanceOf[beforeUnhideRows]
  @scala.inline
  def beforeUnmergeCells: beforeUnmergeCells = "beforeUnmergeCells".asInstanceOf[beforeUnmergeCells]
  @scala.inline
  def beforeUntrimRow: beforeUntrimRow = "beforeUntrimRow".asInstanceOf[beforeUntrimRow]
  @scala.inline
  def beforeValidate: beforeValidate = "beforeValidate".asInstanceOf[beforeValidate]
  @scala.inline
  def beforeValueRender: beforeValueRender = "beforeValueRender".asInstanceOf[beforeValueRender]
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
  def construct: construct = "construct".asInstanceOf[construct]
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
  def hiddenColumn: hiddenColumn = "hiddenColumn".asInstanceOf[hiddenColumn]
  @scala.inline
  def hiddenColumns: hiddenColumns = "hiddenColumns".asInstanceOf[hiddenColumns]
  @scala.inline
  def hiddenRow: hiddenRow = "hiddenRow".asInstanceOf[hiddenRow]
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
  def init: init = "init".asInstanceOf[init]
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
  def modifyAutofillRange: modifyAutofillRange = "modifyAutofillRange".asInstanceOf[modifyAutofillRange]
  @scala.inline
  def modifyCol: modifyCol = "modifyCol".asInstanceOf[modifyCol]
  @scala.inline
  def modifyColHeader: modifyColHeader = "modifyColHeader".asInstanceOf[modifyColHeader]
  @scala.inline
  def modifyColWidth: modifyColWidth = "modifyColWidth".asInstanceOf[modifyColWidth]
  @scala.inline
  def modifyColumnHeaderHeight: modifyColumnHeaderHeight = "modifyColumnHeaderHeight".asInstanceOf[modifyColumnHeaderHeight]
  @scala.inline
  def modifyCopyableRange: modifyCopyableRange = "modifyCopyableRange".asInstanceOf[modifyCopyableRange]
  @scala.inline
  def modifyData: modifyData = "modifyData".asInstanceOf[modifyData]
  @scala.inline
  def modifyGetCellCoords: modifyGetCellCoords = "modifyGetCellCoords".asInstanceOf[modifyGetCellCoords]
  @scala.inline
  def modifyRow: modifyRow = "modifyRow".asInstanceOf[modifyRow]
  @scala.inline
  def modifyRowData: modifyRowData = "modifyRowData".asInstanceOf[modifyRowData]
  @scala.inline
  def modifyRowHeader: modifyRowHeader = "modifyRowHeader".asInstanceOf[modifyRowHeader]
  @scala.inline
  def modifyRowHeaderWidth: modifyRowHeaderWidth = "modifyRowHeaderWidth".asInstanceOf[modifyRowHeaderWidth]
  @scala.inline
  def modifyRowHeight: modifyRowHeight = "modifyRowHeight".asInstanceOf[modifyRowHeight]
  @scala.inline
  def modifyRowSourceData: modifyRowSourceData = "modifyRowSourceData".asInstanceOf[modifyRowSourceData]
  @scala.inline
  def modifyTransformEnd: modifyTransformEnd = "modifyTransformEnd".asInstanceOf[modifyTransformEnd]
  @scala.inline
  def modifyTransformStart: modifyTransformStart = "modifyTransformStart".asInstanceOf[modifyTransformStart]
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
  def persistentStateLoad: persistentStateLoad = "persistentStateLoad".asInstanceOf[persistentStateLoad]
  @scala.inline
  def persistentStateReset: persistentStateReset = "persistentStateReset".asInstanceOf[persistentStateReset]
  @scala.inline
  def persistentStateSave: persistentStateSave = "persistentStateSave".asInstanceOf[persistentStateSave]
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
  def skipLengthCache: skipLengthCache = "skipLengthCache".asInstanceOf[skipLengthCache]
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
  def unmodifyCol: unmodifyCol = "unmodifyCol".asInstanceOf[unmodifyCol]
  @scala.inline
  def unmodifyRow: unmodifyRow = "unmodifyRow".asInstanceOf[unmodifyRow]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  @scala.inline
  def validateCells: validateCells = "validateCells".asInstanceOf[validateCells]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

