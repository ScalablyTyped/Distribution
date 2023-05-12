package typings.handsontable

import typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.DirectionType
import typings.handsontable.`3rdpartyWalkontableSrcMod`.OverlayType
import typings.handsontable.cellTypesMod.CellType
import typings.handsontable.commonMod.ChangeSource
import typings.handsontable.coreMod.AlterActions
import typings.handsontable.editorsMod.EditorType
import typings.handsontable.pluginsAutofillAutofillMod.Direction
import typings.handsontable.pluginsColumnSortingColumnSortingMod.SortOrderType
import typings.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.pluginsCopyPasteCopyPasteMod.CopyModeType
import typings.handsontable.pluginsCopyPasteCopyPasteMod.PasteModeType
import typings.handsontable.pluginsFiltersConditionCollectionMod.ConditionName
import typings.handsontable.pluginsFiltersFiltersMod._ConditionName
import typings.handsontable.pluginsFiltersFiltersMod._OperationType
import typings.handsontable.renderersMod.RendererType
import typings.handsontable.translationsIndexMapperMod.MapTypes
import typings.handsontable.validatorsMod.ValidatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handsontableStrings {
  
  @js.native
  sealed trait `---------`
    extends StObject
       with PredefinedMenuItemKey
  inline def `---------`: `---------` = "---------".asInstanceOf[`---------`]
  
  @js.native
  sealed trait AutofillDotfill
    extends StObject
       with ChangeSource
  inline def AutofillDotfill: AutofillDotfill = "Autofill.fill".asInstanceOf[AutofillDotfill]
  
  @js.native
  sealed trait ColumnSummaryDotreset
    extends StObject
       with ChangeSource
  inline def ColumnSummaryDotreset: ColumnSummaryDotreset = "ColumnSummary.reset".asInstanceOf[ColumnSummaryDotreset]
  
  @js.native
  sealed trait ColumnSummaryDotset
    extends StObject
       with ChangeSource
  inline def ColumnSummaryDotset: ColumnSummaryDotset = "ColumnSummary.set".asInstanceOf[ColumnSummaryDotset]
  
  @js.native
  sealed trait Comma extends StObject
  inline def Comma: Comma = ",".asInstanceOf[Comma]
  
  @js.native
  sealed trait ContextMenuDotclearColumns
    extends StObject
       with ChangeSource
  inline def ContextMenuDotclearColumns: ContextMenuDotclearColumns = "ContextMenu.clearColumns".asInstanceOf[ContextMenuDotclearColumns]
  
  @js.native
  sealed trait ContextMenuDotcolumnLeft
    extends StObject
       with ChangeSource
  inline def ContextMenuDotcolumnLeft: ContextMenuDotcolumnLeft = "ContextMenu.columnLeft".asInstanceOf[ContextMenuDotcolumnLeft]
  
  @js.native
  sealed trait ContextMenuDotcolumnRight
    extends StObject
       with ChangeSource
  inline def ContextMenuDotcolumnRight: ContextMenuDotcolumnRight = "ContextMenu.columnRight".asInstanceOf[ContextMenuDotcolumnRight]
  
  @js.native
  sealed trait ContextMenuDotremoveColumn
    extends StObject
       with ChangeSource
  inline def ContextMenuDotremoveColumn: ContextMenuDotremoveColumn = "ContextMenu.removeColumn".asInstanceOf[ContextMenuDotremoveColumn]
  
  @js.native
  sealed trait ContextMenuDotremoveRow
    extends StObject
       with ChangeSource
  inline def ContextMenuDotremoveRow: ContextMenuDotremoveRow = "ContextMenu.removeRow".asInstanceOf[ContextMenuDotremoveRow]
  
  @js.native
  sealed trait ContextMenuDotrowAbove
    extends StObject
       with ChangeSource
  inline def ContextMenuDotrowAbove: ContextMenuDotrowAbove = "ContextMenu.rowAbove".asInstanceOf[ContextMenuDotrowAbove]
  
  @js.native
  sealed trait ContextMenuDotrowBelow
    extends StObject
       with ChangeSource
  inline def ContextMenuDotrowBelow: ContextMenuDotrowBelow = "ContextMenu.rowBelow".asInstanceOf[ContextMenuDotrowBelow]
  
  @js.native
  sealed trait CopyPasteDotpaste
    extends StObject
       with ChangeSource
  inline def CopyPasteDotpaste: CopyPasteDotpaste = "CopyPaste.paste".asInstanceOf[CopyPasteDotpaste]
  
  @js.native
  sealed trait Dot extends StObject
  inline def Dot: Dot = ".".asInstanceOf[Dot]
  
  @js.native
  sealed trait `E-W` extends StObject
  inline def `E-W`: `E-W` = "E-W".asInstanceOf[`E-W`]
  
  @js.native
  sealed trait `N-S` extends StObject
  inline def `N-S`: `N-S` = "N-S".asInstanceOf[`N-S`]
  
  @js.native
  sealed trait `NE-SW`
    extends StObject
       with DirectionType
  inline def `NE-SW`: `NE-SW` = "NE-SW".asInstanceOf[`NE-SW`]
  
  @js.native
  sealed trait `NW-SE`
    extends StObject
       with DirectionType
  inline def `NW-SE`: `NW-SE` = "NW-SE".asInstanceOf[`NW-SE`]
  
  @js.native
  sealed trait `S-N` extends StObject
  inline def `S-N`: `S-N` = "S-N".asInstanceOf[`S-N`]
  
  @js.native
  sealed trait `SE-NW`
    extends StObject
       with DirectionType
  inline def `SE-NW`: `SE-NW` = "SE-NW".asInstanceOf[`SE-NW`]
  
  @js.native
  sealed trait `SW-NE`
    extends StObject
       with DirectionType
  inline def `SW-NE`: `SW-NE` = "SW-NE".asInstanceOf[`SW-NE`]
  
  @js.native
  sealed trait Semicolon extends StObject
  inline def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  
  @js.native
  sealed trait Space extends StObject
  inline def Space: Space = (" ").asInstanceOf[Space]
  
  @js.native
  sealed trait UndoRedoDotredo
    extends StObject
       with ChangeSource
  inline def UndoRedoDotredo: UndoRedoDotredo = "UndoRedo.redo".asInstanceOf[UndoRedoDotredo]
  
  @js.native
  sealed trait UndoRedoDotundo
    extends StObject
       with ChangeSource
  inline def UndoRedoDotundo: UndoRedoDotundo = "UndoRedo.undo".asInstanceOf[UndoRedoDotundo]
  
  @js.native
  sealed trait Verticalline extends StObject
  inline def Verticalline: Verticalline = "|".asInstanceOf[Verticalline]
  
  @js.native
  sealed trait `W-E` extends StObject
  inline def `W-E`: `W-E` = "W-E".asInstanceOf[`W-E`]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait add_child
    extends StObject
       with PredefinedMenuItemKey
  inline def add_child: add_child = "add_child".asInstanceOf[add_child]
  
  @js.native
  sealed trait after extends StObject
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait afterAddChild extends StObject
  inline def afterAddChild: afterAddChild = "afterAddChild".asInstanceOf[afterAddChild]
  
  @js.native
  sealed trait afterAutofill extends StObject
  inline def afterAutofill: afterAutofill = "afterAutofill".asInstanceOf[afterAutofill]
  
  @js.native
  sealed trait afterBeginEditing extends StObject
  inline def afterBeginEditing: afterBeginEditing = "afterBeginEditing".asInstanceOf[afterBeginEditing]
  
  @js.native
  sealed trait afterCellMetaReset extends StObject
  inline def afterCellMetaReset: afterCellMetaReset = "afterCellMetaReset".asInstanceOf[afterCellMetaReset]
  
  @js.native
  sealed trait afterChange extends StObject
  inline def afterChange: afterChange = "afterChange".asInstanceOf[afterChange]
  
  @js.native
  sealed trait afterChangesObserved extends StObject
  inline def afterChangesObserved: afterChangesObserved = "afterChangesObserved".asInstanceOf[afterChangesObserved]
  
  @js.native
  sealed trait afterColumnCollapse extends StObject
  inline def afterColumnCollapse: afterColumnCollapse = "afterColumnCollapse".asInstanceOf[afterColumnCollapse]
  
  @js.native
  sealed trait afterColumnExpand extends StObject
  inline def afterColumnExpand: afterColumnExpand = "afterColumnExpand".asInstanceOf[afterColumnExpand]
  
  @js.native
  sealed trait afterColumnFreeze extends StObject
  inline def afterColumnFreeze: afterColumnFreeze = "afterColumnFreeze".asInstanceOf[afterColumnFreeze]
  
  @js.native
  sealed trait afterColumnMove extends StObject
  inline def afterColumnMove: afterColumnMove = "afterColumnMove".asInstanceOf[afterColumnMove]
  
  @js.native
  sealed trait afterColumnResize extends StObject
  inline def afterColumnResize: afterColumnResize = "afterColumnResize".asInstanceOf[afterColumnResize]
  
  @js.native
  sealed trait afterColumnSort extends StObject
  inline def afterColumnSort: afterColumnSort = "afterColumnSort".asInstanceOf[afterColumnSort]
  
  @js.native
  sealed trait afterColumnUnfreeze extends StObject
  inline def afterColumnUnfreeze: afterColumnUnfreeze = "afterColumnUnfreeze".asInstanceOf[afterColumnUnfreeze]
  
  @js.native
  sealed trait afterContextMenuDefaultOptions extends StObject
  inline def afterContextMenuDefaultOptions: afterContextMenuDefaultOptions = "afterContextMenuDefaultOptions".asInstanceOf[afterContextMenuDefaultOptions]
  
  @js.native
  sealed trait afterContextMenuHide extends StObject
  inline def afterContextMenuHide: afterContextMenuHide = "afterContextMenuHide".asInstanceOf[afterContextMenuHide]
  
  @js.native
  sealed trait afterContextMenuShow extends StObject
  inline def afterContextMenuShow: afterContextMenuShow = "afterContextMenuShow".asInstanceOf[afterContextMenuShow]
  
  @js.native
  sealed trait afterCopy extends StObject
  inline def afterCopy: afterCopy = "afterCopy".asInstanceOf[afterCopy]
  
  @js.native
  sealed trait afterCopyLimit extends StObject
  inline def afterCopyLimit: afterCopyLimit = "afterCopyLimit".asInstanceOf[afterCopyLimit]
  
  @js.native
  sealed trait afterCreateCol extends StObject
  inline def afterCreateCol: afterCreateCol = "afterCreateCol".asInstanceOf[afterCreateCol]
  
  @js.native
  sealed trait afterCreateRow extends StObject
  inline def afterCreateRow: afterCreateRow = "afterCreateRow".asInstanceOf[afterCreateRow]
  
  @js.native
  sealed trait afterCut extends StObject
  inline def afterCut: afterCut = "afterCut".asInstanceOf[afterCut]
  
  @js.native
  sealed trait afterDeselect extends StObject
  inline def afterDeselect: afterDeselect = "afterDeselect".asInstanceOf[afterDeselect]
  
  @js.native
  sealed trait afterDestroy extends StObject
  inline def afterDestroy: afterDestroy = "afterDestroy".asInstanceOf[afterDestroy]
  
  @js.native
  sealed trait afterDetachChild extends StObject
  inline def afterDetachChild: afterDetachChild = "afterDetachChild".asInstanceOf[afterDetachChild]
  
  @js.native
  sealed trait afterDocumentKeyDown extends StObject
  inline def afterDocumentKeyDown: afterDocumentKeyDown = "afterDocumentKeyDown".asInstanceOf[afterDocumentKeyDown]
  
  @js.native
  sealed trait afterDrawSelection extends StObject
  inline def afterDrawSelection: afterDrawSelection = "afterDrawSelection".asInstanceOf[afterDrawSelection]
  
  @js.native
  sealed trait afterDropdownMenuDefaultOptions extends StObject
  inline def afterDropdownMenuDefaultOptions: afterDropdownMenuDefaultOptions = "afterDropdownMenuDefaultOptions".asInstanceOf[afterDropdownMenuDefaultOptions]
  
  @js.native
  sealed trait afterDropdownMenuHide extends StObject
  inline def afterDropdownMenuHide: afterDropdownMenuHide = "afterDropdownMenuHide".asInstanceOf[afterDropdownMenuHide]
  
  @js.native
  sealed trait afterDropdownMenuShow extends StObject
  inline def afterDropdownMenuShow: afterDropdownMenuShow = "afterDropdownMenuShow".asInstanceOf[afterDropdownMenuShow]
  
  @js.native
  sealed trait afterFilter extends StObject
  inline def afterFilter: afterFilter = "afterFilter".asInstanceOf[afterFilter]
  
  @js.native
  sealed trait afterFormulasValuesUpdate extends StObject
  inline def afterFormulasValuesUpdate: afterFormulasValuesUpdate = "afterFormulasValuesUpdate".asInstanceOf[afterFormulasValuesUpdate]
  
  @js.native
  sealed trait afterGetCellMeta extends StObject
  inline def afterGetCellMeta: afterGetCellMeta = "afterGetCellMeta".asInstanceOf[afterGetCellMeta]
  
  @js.native
  sealed trait afterGetColHeader extends StObject
  inline def afterGetColHeader: afterGetColHeader = "afterGetColHeader".asInstanceOf[afterGetColHeader]
  
  @js.native
  sealed trait afterGetColumnHeaderRenderers extends StObject
  inline def afterGetColumnHeaderRenderers: afterGetColumnHeaderRenderers = "afterGetColumnHeaderRenderers".asInstanceOf[afterGetColumnHeaderRenderers]
  
  @js.native
  sealed trait afterGetRowHeader extends StObject
  inline def afterGetRowHeader: afterGetRowHeader = "afterGetRowHeader".asInstanceOf[afterGetRowHeader]
  
  @js.native
  sealed trait afterGetRowHeaderRenderers extends StObject
  inline def afterGetRowHeaderRenderers: afterGetRowHeaderRenderers = "afterGetRowHeaderRenderers".asInstanceOf[afterGetRowHeaderRenderers]
  
  @js.native
  sealed trait afterHideColumns extends StObject
  inline def afterHideColumns: afterHideColumns = "afterHideColumns".asInstanceOf[afterHideColumns]
  
  @js.native
  sealed trait afterHideRows extends StObject
  inline def afterHideRows: afterHideRows = "afterHideRows".asInstanceOf[afterHideRows]
  
  @js.native
  sealed trait afterInit extends StObject
  inline def afterInit: afterInit = "afterInit".asInstanceOf[afterInit]
  
  @js.native
  sealed trait afterLanguageChange extends StObject
  inline def afterLanguageChange: afterLanguageChange = "afterLanguageChange".asInstanceOf[afterLanguageChange]
  
  @js.native
  sealed trait afterListen extends StObject
  inline def afterListen: afterListen = "afterListen".asInstanceOf[afterListen]
  
  @js.native
  sealed trait afterLoadData extends StObject
  inline def afterLoadData: afterLoadData = "afterLoadData".asInstanceOf[afterLoadData]
  
  @js.native
  sealed trait afterMergeCells extends StObject
  inline def afterMergeCells: afterMergeCells = "afterMergeCells".asInstanceOf[afterMergeCells]
  
  @js.native
  sealed trait afterModifyTransformEnd extends StObject
  inline def afterModifyTransformEnd: afterModifyTransformEnd = "afterModifyTransformEnd".asInstanceOf[afterModifyTransformEnd]
  
  @js.native
  sealed trait afterModifyTransformStart extends StObject
  inline def afterModifyTransformStart: afterModifyTransformStart = "afterModifyTransformStart".asInstanceOf[afterModifyTransformStart]
  
  @js.native
  sealed trait afterMomentumScroll extends StObject
  inline def afterMomentumScroll: afterMomentumScroll = "afterMomentumScroll".asInstanceOf[afterMomentumScroll]
  
  @js.native
  sealed trait afterNamedExpressionAdded extends StObject
  inline def afterNamedExpressionAdded: afterNamedExpressionAdded = "afterNamedExpressionAdded".asInstanceOf[afterNamedExpressionAdded]
  
  @js.native
  sealed trait afterNamedExpressionRemoved extends StObject
  inline def afterNamedExpressionRemoved: afterNamedExpressionRemoved = "afterNamedExpressionRemoved".asInstanceOf[afterNamedExpressionRemoved]
  
  @js.native
  sealed trait afterOnCellContextMenu extends StObject
  inline def afterOnCellContextMenu: afterOnCellContextMenu = "afterOnCellContextMenu".asInstanceOf[afterOnCellContextMenu]
  
  @js.native
  sealed trait afterOnCellCornerDblClick extends StObject
  inline def afterOnCellCornerDblClick: afterOnCellCornerDblClick = "afterOnCellCornerDblClick".asInstanceOf[afterOnCellCornerDblClick]
  
  @js.native
  sealed trait afterOnCellCornerMouseDown extends StObject
  inline def afterOnCellCornerMouseDown: afterOnCellCornerMouseDown = "afterOnCellCornerMouseDown".asInstanceOf[afterOnCellCornerMouseDown]
  
  @js.native
  sealed trait afterOnCellMouseDown extends StObject
  inline def afterOnCellMouseDown: afterOnCellMouseDown = "afterOnCellMouseDown".asInstanceOf[afterOnCellMouseDown]
  
  @js.native
  sealed trait afterOnCellMouseOut extends StObject
  inline def afterOnCellMouseOut: afterOnCellMouseOut = "afterOnCellMouseOut".asInstanceOf[afterOnCellMouseOut]
  
  @js.native
  sealed trait afterOnCellMouseOver extends StObject
  inline def afterOnCellMouseOver: afterOnCellMouseOver = "afterOnCellMouseOver".asInstanceOf[afterOnCellMouseOver]
  
  @js.native
  sealed trait afterOnCellMouseUp extends StObject
  inline def afterOnCellMouseUp: afterOnCellMouseUp = "afterOnCellMouseUp".asInstanceOf[afterOnCellMouseUp]
  
  @js.native
  sealed trait afterPaste extends StObject
  inline def afterPaste: afterPaste = "afterPaste".asInstanceOf[afterPaste]
  
  @js.native
  sealed trait afterPluginsInitialized extends StObject
  inline def afterPluginsInitialized: afterPluginsInitialized = "afterPluginsInitialized".asInstanceOf[afterPluginsInitialized]
  
  @js.native
  sealed trait afterRedo extends StObject
  inline def afterRedo: afterRedo = "afterRedo".asInstanceOf[afterRedo]
  
  @js.native
  sealed trait afterRedoStackChange extends StObject
  inline def afterRedoStackChange: afterRedoStackChange = "afterRedoStackChange".asInstanceOf[afterRedoStackChange]
  
  @js.native
  sealed trait afterRefreshDimensions extends StObject
  inline def afterRefreshDimensions: afterRefreshDimensions = "afterRefreshDimensions".asInstanceOf[afterRefreshDimensions]
  
  @js.native
  sealed trait afterRemoveCellMeta extends StObject
  inline def afterRemoveCellMeta: afterRemoveCellMeta = "afterRemoveCellMeta".asInstanceOf[afterRemoveCellMeta]
  
  @js.native
  sealed trait afterRemoveCol extends StObject
  inline def afterRemoveCol: afterRemoveCol = "afterRemoveCol".asInstanceOf[afterRemoveCol]
  
  @js.native
  sealed trait afterRemoveRow extends StObject
  inline def afterRemoveRow: afterRemoveRow = "afterRemoveRow".asInstanceOf[afterRemoveRow]
  
  @js.native
  sealed trait afterRender extends StObject
  inline def afterRender: afterRender = "afterRender".asInstanceOf[afterRender]
  
  @js.native
  sealed trait afterRenderer extends StObject
  inline def afterRenderer: afterRenderer = "afterRenderer".asInstanceOf[afterRenderer]
  
  @js.native
  sealed trait afterRowMove extends StObject
  inline def afterRowMove: afterRowMove = "afterRowMove".asInstanceOf[afterRowMove]
  
  @js.native
  sealed trait afterRowResize extends StObject
  inline def afterRowResize: afterRowResize = "afterRowResize".asInstanceOf[afterRowResize]
  
  @js.native
  sealed trait afterScrollHorizontally extends StObject
  inline def afterScrollHorizontally: afterScrollHorizontally = "afterScrollHorizontally".asInstanceOf[afterScrollHorizontally]
  
  @js.native
  sealed trait afterScrollVertically extends StObject
  inline def afterScrollVertically: afterScrollVertically = "afterScrollVertically".asInstanceOf[afterScrollVertically]
  
  @js.native
  sealed trait afterSelection extends StObject
  inline def afterSelection: afterSelection = "afterSelection".asInstanceOf[afterSelection]
  
  @js.native
  sealed trait afterSelectionByProp extends StObject
  inline def afterSelectionByProp: afterSelectionByProp = "afterSelectionByProp".asInstanceOf[afterSelectionByProp]
  
  @js.native
  sealed trait afterSelectionEnd extends StObject
  inline def afterSelectionEnd: afterSelectionEnd = "afterSelectionEnd".asInstanceOf[afterSelectionEnd]
  
  @js.native
  sealed trait afterSelectionEndByProp extends StObject
  inline def afterSelectionEndByProp: afterSelectionEndByProp = "afterSelectionEndByProp".asInstanceOf[afterSelectionEndByProp]
  
  @js.native
  sealed trait afterSetCellMeta extends StObject
  inline def afterSetCellMeta: afterSetCellMeta = "afterSetCellMeta".asInstanceOf[afterSetCellMeta]
  
  @js.native
  sealed trait afterSetDataAtCell extends StObject
  inline def afterSetDataAtCell: afterSetDataAtCell = "afterSetDataAtCell".asInstanceOf[afterSetDataAtCell]
  
  @js.native
  sealed trait afterSetDataAtRowProp extends StObject
  inline def afterSetDataAtRowProp: afterSetDataAtRowProp = "afterSetDataAtRowProp".asInstanceOf[afterSetDataAtRowProp]
  
  @js.native
  sealed trait afterSetSourceDataAtCell extends StObject
  inline def afterSetSourceDataAtCell: afterSetSourceDataAtCell = "afterSetSourceDataAtCell".asInstanceOf[afterSetSourceDataAtCell]
  
  @js.native
  sealed trait afterSheetAdded extends StObject
  inline def afterSheetAdded: afterSheetAdded = "afterSheetAdded".asInstanceOf[afterSheetAdded]
  
  @js.native
  sealed trait afterSheetRemoved extends StObject
  inline def afterSheetRemoved: afterSheetRemoved = "afterSheetRemoved".asInstanceOf[afterSheetRemoved]
  
  @js.native
  sealed trait afterSheetRenamed extends StObject
  inline def afterSheetRenamed: afterSheetRenamed = "afterSheetRenamed".asInstanceOf[afterSheetRenamed]
  
  @js.native
  sealed trait afterTrimRow extends StObject
  inline def afterTrimRow: afterTrimRow = "afterTrimRow".asInstanceOf[afterTrimRow]
  
  @js.native
  sealed trait afterUndo extends StObject
  inline def afterUndo: afterUndo = "afterUndo".asInstanceOf[afterUndo]
  
  @js.native
  sealed trait afterUndoStackChange extends StObject
  inline def afterUndoStackChange: afterUndoStackChange = "afterUndoStackChange".asInstanceOf[afterUndoStackChange]
  
  @js.native
  sealed trait afterUnhideColumns extends StObject
  inline def afterUnhideColumns: afterUnhideColumns = "afterUnhideColumns".asInstanceOf[afterUnhideColumns]
  
  @js.native
  sealed trait afterUnhideRows extends StObject
  inline def afterUnhideRows: afterUnhideRows = "afterUnhideRows".asInstanceOf[afterUnhideRows]
  
  @js.native
  sealed trait afterUnlisten extends StObject
  inline def afterUnlisten: afterUnlisten = "afterUnlisten".asInstanceOf[afterUnlisten]
  
  @js.native
  sealed trait afterUnmergeCells extends StObject
  inline def afterUnmergeCells: afterUnmergeCells = "afterUnmergeCells".asInstanceOf[afterUnmergeCells]
  
  @js.native
  sealed trait afterUntrimRow extends StObject
  inline def afterUntrimRow: afterUntrimRow = "afterUntrimRow".asInstanceOf[afterUntrimRow]
  
  @js.native
  sealed trait afterUpdateData extends StObject
  inline def afterUpdateData: afterUpdateData = "afterUpdateData".asInstanceOf[afterUpdateData]
  
  @js.native
  sealed trait afterUpdateSettings extends StObject
  inline def afterUpdateSettings: afterUpdateSettings = "afterUpdateSettings".asInstanceOf[afterUpdateSettings]
  
  @js.native
  sealed trait afterValidate extends StObject
  inline def afterValidate: afterValidate = "afterValidate".asInstanceOf[afterValidate]
  
  @js.native
  sealed trait afterViewRender extends StObject
  inline def afterViewRender: afterViewRender = "afterViewRender".asInstanceOf[afterViewRender]
  
  @js.native
  sealed trait afterViewportColumnCalculatorOverride extends StObject
  inline def afterViewportColumnCalculatorOverride: afterViewportColumnCalculatorOverride = "afterViewportColumnCalculatorOverride".asInstanceOf[afterViewportColumnCalculatorOverride]
  
  @js.native
  sealed trait afterViewportRowCalculatorOverride extends StObject
  inline def afterViewportRowCalculatorOverride: afterViewportRowCalculatorOverride = "afterViewportRowCalculatorOverride".asInstanceOf[afterViewportRowCalculatorOverride]
  
  @js.native
  sealed trait alignment
    extends StObject
       with PredefinedMenuItemKey
  inline def alignment: alignment = "alignment".asInstanceOf[alignment]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait any extends StObject
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait area extends StObject
  inline def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait asc
    extends StObject
       with SortOrderType
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait auto
    extends StObject
       with ChangeSource
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait autoColumnSize extends StObject
  inline def autoColumnSize: autoColumnSize = "autoColumnSize".asInstanceOf[autoColumnSize]
  
  @js.native
  sealed trait autoRowSize extends StObject
  inline def autoRowSize: autoRowSize = "autoRowSize".asInstanceOf[autoRowSize]
  
  @js.native
  sealed trait autocomplete
    extends StObject
       with CellType
       with EditorType
       with RendererType
       with ValidatorType
  inline def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  
  @js.native
  sealed trait autofill extends StObject
  inline def autofill: autofill = "autofill".asInstanceOf[autofill]
  
  @js.native
  sealed trait average extends StObject
  inline def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait base
    extends StObject
       with EditorType
       with RendererType
  inline def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait basePlugin extends StObject
  inline def basePlugin: basePlugin = "basePlugin".asInstanceOf[basePlugin]
  
  @js.native
  sealed trait before extends StObject
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait beforeAddChild extends StObject
  inline def beforeAddChild: beforeAddChild = "beforeAddChild".asInstanceOf[beforeAddChild]
  
  @js.native
  sealed trait beforeAutofill extends StObject
  inline def beforeAutofill: beforeAutofill = "beforeAutofill".asInstanceOf[beforeAutofill]
  
  @js.native
  sealed trait beforeAutofillInsidePopulate extends StObject
  inline def beforeAutofillInsidePopulate: beforeAutofillInsidePopulate = "beforeAutofillInsidePopulate".asInstanceOf[beforeAutofillInsidePopulate]
  
  @js.native
  sealed trait beforeCellAlignment extends StObject
  inline def beforeCellAlignment: beforeCellAlignment = "beforeCellAlignment".asInstanceOf[beforeCellAlignment]
  
  @js.native
  sealed trait beforeChange extends StObject
  inline def beforeChange: beforeChange = "beforeChange".asInstanceOf[beforeChange]
  
  @js.native
  sealed trait beforeChangeRender extends StObject
  inline def beforeChangeRender: beforeChangeRender = "beforeChangeRender".asInstanceOf[beforeChangeRender]
  
  @js.native
  sealed trait beforeColumnCollapse extends StObject
  inline def beforeColumnCollapse: beforeColumnCollapse = "beforeColumnCollapse".asInstanceOf[beforeColumnCollapse]
  
  @js.native
  sealed trait beforeColumnExpand extends StObject
  inline def beforeColumnExpand: beforeColumnExpand = "beforeColumnExpand".asInstanceOf[beforeColumnExpand]
  
  @js.native
  sealed trait beforeColumnFreeze extends StObject
  inline def beforeColumnFreeze: beforeColumnFreeze = "beforeColumnFreeze".asInstanceOf[beforeColumnFreeze]
  
  @js.native
  sealed trait beforeColumnMove extends StObject
  inline def beforeColumnMove: beforeColumnMove = "beforeColumnMove".asInstanceOf[beforeColumnMove]
  
  @js.native
  sealed trait beforeColumnResize extends StObject
  inline def beforeColumnResize: beforeColumnResize = "beforeColumnResize".asInstanceOf[beforeColumnResize]
  
  @js.native
  sealed trait beforeColumnSort extends StObject
  inline def beforeColumnSort: beforeColumnSort = "beforeColumnSort".asInstanceOf[beforeColumnSort]
  
  @js.native
  sealed trait beforeColumnUnfreeze extends StObject
  inline def beforeColumnUnfreeze: beforeColumnUnfreeze = "beforeColumnUnfreeze".asInstanceOf[beforeColumnUnfreeze]
  
  @js.native
  sealed trait beforeContextMenuSetItems extends StObject
  inline def beforeContextMenuSetItems: beforeContextMenuSetItems = "beforeContextMenuSetItems".asInstanceOf[beforeContextMenuSetItems]
  
  @js.native
  sealed trait beforeContextMenuShow extends StObject
  inline def beforeContextMenuShow: beforeContextMenuShow = "beforeContextMenuShow".asInstanceOf[beforeContextMenuShow]
  
  @js.native
  sealed trait beforeCopy extends StObject
  inline def beforeCopy: beforeCopy = "beforeCopy".asInstanceOf[beforeCopy]
  
  @js.native
  sealed trait beforeCreateCol extends StObject
  inline def beforeCreateCol: beforeCreateCol = "beforeCreateCol".asInstanceOf[beforeCreateCol]
  
  @js.native
  sealed trait beforeCreateRow extends StObject
  inline def beforeCreateRow: beforeCreateRow = "beforeCreateRow".asInstanceOf[beforeCreateRow]
  
  @js.native
  sealed trait beforeCut extends StObject
  inline def beforeCut: beforeCut = "beforeCut".asInstanceOf[beforeCut]
  
  @js.native
  sealed trait beforeDetachChild extends StObject
  inline def beforeDetachChild: beforeDetachChild = "beforeDetachChild".asInstanceOf[beforeDetachChild]
  
  @js.native
  sealed trait beforeDrawBorders extends StObject
  inline def beforeDrawBorders: beforeDrawBorders = "beforeDrawBorders".asInstanceOf[beforeDrawBorders]
  
  @js.native
  sealed trait beforeDropdownMenuSetItems extends StObject
  inline def beforeDropdownMenuSetItems: beforeDropdownMenuSetItems = "beforeDropdownMenuSetItems".asInstanceOf[beforeDropdownMenuSetItems]
  
  @js.native
  sealed trait beforeDropdownMenuShow extends StObject
  inline def beforeDropdownMenuShow: beforeDropdownMenuShow = "beforeDropdownMenuShow".asInstanceOf[beforeDropdownMenuShow]
  
  @js.native
  sealed trait beforeFilter extends StObject
  inline def beforeFilter: beforeFilter = "beforeFilter".asInstanceOf[beforeFilter]
  
  @js.native
  sealed trait beforeGetCellMeta extends StObject
  inline def beforeGetCellMeta: beforeGetCellMeta = "beforeGetCellMeta".asInstanceOf[beforeGetCellMeta]
  
  @js.native
  sealed trait beforeHideColumns extends StObject
  inline def beforeHideColumns: beforeHideColumns = "beforeHideColumns".asInstanceOf[beforeHideColumns]
  
  @js.native
  sealed trait beforeHideRows extends StObject
  inline def beforeHideRows: beforeHideRows = "beforeHideRows".asInstanceOf[beforeHideRows]
  
  @js.native
  sealed trait beforeHighlightingColumnHeader extends StObject
  inline def beforeHighlightingColumnHeader: beforeHighlightingColumnHeader = "beforeHighlightingColumnHeader".asInstanceOf[beforeHighlightingColumnHeader]
  
  @js.native
  sealed trait beforeHighlightingRowHeader extends StObject
  inline def beforeHighlightingRowHeader: beforeHighlightingRowHeader = "beforeHighlightingRowHeader".asInstanceOf[beforeHighlightingRowHeader]
  
  @js.native
  sealed trait beforeInit extends StObject
  inline def beforeInit: beforeInit = "beforeInit".asInstanceOf[beforeInit]
  
  @js.native
  sealed trait beforeInitWalkontable extends StObject
  inline def beforeInitWalkontable: beforeInitWalkontable = "beforeInitWalkontable".asInstanceOf[beforeInitWalkontable]
  
  @js.native
  sealed trait beforeKeyDown extends StObject
  inline def beforeKeyDown: beforeKeyDown = "beforeKeyDown".asInstanceOf[beforeKeyDown]
  
  @js.native
  sealed trait beforeLanguageChange extends StObject
  inline def beforeLanguageChange: beforeLanguageChange = "beforeLanguageChange".asInstanceOf[beforeLanguageChange]
  
  @js.native
  sealed trait beforeLoadData extends StObject
  inline def beforeLoadData: beforeLoadData = "beforeLoadData".asInstanceOf[beforeLoadData]
  
  @js.native
  sealed trait beforeMergeCells extends StObject
  inline def beforeMergeCells: beforeMergeCells = "beforeMergeCells".asInstanceOf[beforeMergeCells]
  
  @js.native
  sealed trait beforeOnCellContextMenu extends StObject
  inline def beforeOnCellContextMenu: beforeOnCellContextMenu = "beforeOnCellContextMenu".asInstanceOf[beforeOnCellContextMenu]
  
  @js.native
  sealed trait beforeOnCellMouseDown extends StObject
  inline def beforeOnCellMouseDown: beforeOnCellMouseDown = "beforeOnCellMouseDown".asInstanceOf[beforeOnCellMouseDown]
  
  @js.native
  sealed trait beforeOnCellMouseOut extends StObject
  inline def beforeOnCellMouseOut: beforeOnCellMouseOut = "beforeOnCellMouseOut".asInstanceOf[beforeOnCellMouseOut]
  
  @js.native
  sealed trait beforeOnCellMouseOver extends StObject
  inline def beforeOnCellMouseOver: beforeOnCellMouseOver = "beforeOnCellMouseOver".asInstanceOf[beforeOnCellMouseOver]
  
  @js.native
  sealed trait beforeOnCellMouseUp extends StObject
  inline def beforeOnCellMouseUp: beforeOnCellMouseUp = "beforeOnCellMouseUp".asInstanceOf[beforeOnCellMouseUp]
  
  @js.native
  sealed trait beforePaste extends StObject
  inline def beforePaste: beforePaste = "beforePaste".asInstanceOf[beforePaste]
  
  @js.native
  sealed trait beforeRedo extends StObject
  inline def beforeRedo: beforeRedo = "beforeRedo".asInstanceOf[beforeRedo]
  
  @js.native
  sealed trait beforeRedoStackChange extends StObject
  inline def beforeRedoStackChange: beforeRedoStackChange = "beforeRedoStackChange".asInstanceOf[beforeRedoStackChange]
  
  @js.native
  sealed trait beforeRefreshDimensions extends StObject
  inline def beforeRefreshDimensions: beforeRefreshDimensions = "beforeRefreshDimensions".asInstanceOf[beforeRefreshDimensions]
  
  @js.native
  sealed trait beforeRemoveCellClassNames extends StObject
  inline def beforeRemoveCellClassNames: beforeRemoveCellClassNames = "beforeRemoveCellClassNames".asInstanceOf[beforeRemoveCellClassNames]
  
  @js.native
  sealed trait beforeRemoveCellMeta extends StObject
  inline def beforeRemoveCellMeta: beforeRemoveCellMeta = "beforeRemoveCellMeta".asInstanceOf[beforeRemoveCellMeta]
  
  @js.native
  sealed trait beforeRemoveCol extends StObject
  inline def beforeRemoveCol: beforeRemoveCol = "beforeRemoveCol".asInstanceOf[beforeRemoveCol]
  
  @js.native
  sealed trait beforeRemoveRow extends StObject
  inline def beforeRemoveRow: beforeRemoveRow = "beforeRemoveRow".asInstanceOf[beforeRemoveRow]
  
  @js.native
  sealed trait beforeRender extends StObject
  inline def beforeRender: beforeRender = "beforeRender".asInstanceOf[beforeRender]
  
  @js.native
  sealed trait beforeRenderer extends StObject
  inline def beforeRenderer: beforeRenderer = "beforeRenderer".asInstanceOf[beforeRenderer]
  
  @js.native
  sealed trait beforeRowMove extends StObject
  inline def beforeRowMove: beforeRowMove = "beforeRowMove".asInstanceOf[beforeRowMove]
  
  @js.native
  sealed trait beforeRowResize extends StObject
  inline def beforeRowResize: beforeRowResize = "beforeRowResize".asInstanceOf[beforeRowResize]
  
  @js.native
  sealed trait beforeSetCellMeta extends StObject
  inline def beforeSetCellMeta: beforeSetCellMeta = "beforeSetCellMeta".asInstanceOf[beforeSetCellMeta]
  
  @js.native
  sealed trait beforeSetRangeEnd extends StObject
  inline def beforeSetRangeEnd: beforeSetRangeEnd = "beforeSetRangeEnd".asInstanceOf[beforeSetRangeEnd]
  
  @js.native
  sealed trait beforeSetRangeStart extends StObject
  inline def beforeSetRangeStart: beforeSetRangeStart = "beforeSetRangeStart".asInstanceOf[beforeSetRangeStart]
  
  @js.native
  sealed trait beforeSetRangeStartOnly extends StObject
  inline def beforeSetRangeStartOnly: beforeSetRangeStartOnly = "beforeSetRangeStartOnly".asInstanceOf[beforeSetRangeStartOnly]
  
  @js.native
  sealed trait beforeStretchingColumnWidth extends StObject
  inline def beforeStretchingColumnWidth: beforeStretchingColumnWidth = "beforeStretchingColumnWidth".asInstanceOf[beforeStretchingColumnWidth]
  
  @js.native
  sealed trait beforeTouchScroll extends StObject
  inline def beforeTouchScroll: beforeTouchScroll = "beforeTouchScroll".asInstanceOf[beforeTouchScroll]
  
  @js.native
  sealed trait beforeTrimRow extends StObject
  inline def beforeTrimRow: beforeTrimRow = "beforeTrimRow".asInstanceOf[beforeTrimRow]
  
  @js.native
  sealed trait beforeUndo extends StObject
  inline def beforeUndo: beforeUndo = "beforeUndo".asInstanceOf[beforeUndo]
  
  @js.native
  sealed trait beforeUndoStackChange extends StObject
  inline def beforeUndoStackChange: beforeUndoStackChange = "beforeUndoStackChange".asInstanceOf[beforeUndoStackChange]
  
  @js.native
  sealed trait beforeUnhideColumns extends StObject
  inline def beforeUnhideColumns: beforeUnhideColumns = "beforeUnhideColumns".asInstanceOf[beforeUnhideColumns]
  
  @js.native
  sealed trait beforeUnhideRows extends StObject
  inline def beforeUnhideRows: beforeUnhideRows = "beforeUnhideRows".asInstanceOf[beforeUnhideRows]
  
  @js.native
  sealed trait beforeUnmergeCells extends StObject
  inline def beforeUnmergeCells: beforeUnmergeCells = "beforeUnmergeCells".asInstanceOf[beforeUnmergeCells]
  
  @js.native
  sealed trait beforeUntrimRow extends StObject
  inline def beforeUntrimRow: beforeUntrimRow = "beforeUntrimRow".asInstanceOf[beforeUntrimRow]
  
  @js.native
  sealed trait beforeUpdateData extends StObject
  inline def beforeUpdateData: beforeUpdateData = "beforeUpdateData".asInstanceOf[beforeUpdateData]
  
  @js.native
  sealed trait beforeValidate extends StObject
  inline def beforeValidate: beforeValidate = "beforeValidate".asInstanceOf[beforeValidate]
  
  @js.native
  sealed trait beforeValueRender extends StObject
  inline def beforeValueRender: beforeValueRender = "beforeValueRender".asInstanceOf[beforeValueRender]
  
  @js.native
  sealed trait beforeViewRender extends StObject
  inline def beforeViewRender: beforeViewRender = "beforeViewRender".asInstanceOf[beforeViewRender]
  
  @js.native
  sealed trait begins_with
    extends StObject
       with ConditionName
       with _ConditionName
  inline def begins_with: begins_with = "begins_with".asInstanceOf[begins_with]
  
  @js.native
  sealed trait between
    extends StObject
       with ConditionName
       with _ConditionName
  inline def between: between = "between".asInstanceOf[between]
  
  @js.native
  sealed trait bindRowsWithHeaders extends StObject
  inline def bindRowsWithHeaders: bindRowsWithHeaders = "bindRowsWithHeaders".asInstanceOf[bindRowsWithHeaders]
  
  @js.native
  sealed trait borders
    extends StObject
       with PredefinedMenuItemKey
  inline def borders: borders = "borders".asInstanceOf[borders]
  
  @js.native
  sealed trait bottom
    extends StObject
       with OverlayType
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-left-corner` extends StObject
  inline def `bottom-left-corner`: `bottom-left-corner` = "bottom-left-corner".asInstanceOf[`bottom-left-corner`]
  
  @js.native
  sealed trait bottom_left_corner
    extends StObject
       with OverlayType
  inline def bottom_left_corner: bottom_left_corner = "bottom_left_corner".asInstanceOf[bottom_left_corner]
  
  @js.native
  sealed trait by_value
    extends StObject
       with ConditionName
       with _ConditionName
  inline def by_value: by_value = "by_value".asInstanceOf[by_value]
  
  @js.native
  sealed trait cell extends StObject
  inline def cell: cell = "cell".asInstanceOf[cell]
  
  @js.native
  sealed trait `cells-only`
    extends StObject
       with CopyModeType
  inline def `cells-only`: `cells-only` = "cells-only".asInstanceOf[`cells-only`]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with CellType
       with EditorType
       with RendererType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait clear_column
    extends StObject
       with PredefinedMenuItemKey
  inline def clear_column: clear_column = "clear_column".asInstanceOf[clear_column]
  
  @js.native
  sealed trait col_left
    extends StObject
       with PredefinedMenuItemKey
  inline def col_left: col_left = "col_left".asInstanceOf[col_left]
  
  @js.native
  sealed trait col_right
    extends StObject
       with PredefinedMenuItemKey
  inline def col_right: col_right = "col_right".asInstanceOf[col_right]
  
  @js.native
  sealed trait collapse extends StObject
  inline def collapse: collapse = "collapse".asInstanceOf[collapse]
  
  @js.native
  sealed trait collapsibleColumns extends StObject
  inline def collapsibleColumns: collapsibleColumns = "collapsibleColumns".asInstanceOf[collapsibleColumns]
  
  @js.native
  sealed trait `column-headers-only`
    extends StObject
       with CopyModeType
  inline def `column-headers-only`: `column-headers-only` = "column-headers-only".asInstanceOf[`column-headers-only`]
  
  @js.native
  sealed trait columnSorting extends StObject
  inline def columnSorting: columnSorting = "columnSorting".asInstanceOf[columnSorting]
  
  @js.native
  sealed trait columnSummary extends StObject
  inline def columnSummary: columnSummary = "columnSummary".asInstanceOf[columnSummary]
  
  @js.native
  sealed trait comment extends StObject
  inline def comment: comment = "comment".asInstanceOf[comment]
  
  @js.native
  sealed trait comments extends StObject
  inline def comments: comments = "comments".asInstanceOf[comments]
  
  @js.native
  sealed trait commentsAddEdit
    extends StObject
       with PredefinedMenuItemKey
  inline def commentsAddEdit: commentsAddEdit = "commentsAddEdit".asInstanceOf[commentsAddEdit]
  
  @js.native
  sealed trait commentsReadOnly
    extends StObject
       with PredefinedMenuItemKey
  inline def commentsReadOnly: commentsReadOnly = "commentsReadOnly".asInstanceOf[commentsReadOnly]
  
  @js.native
  sealed trait commentsRemove
    extends StObject
       with PredefinedMenuItemKey
  inline def commentsRemove: commentsRemove = "commentsRemove".asInstanceOf[commentsRemove]
  
  @js.native
  sealed trait conjunction
    extends StObject
       with _OperationType
  inline def conjunction: conjunction = "conjunction".asInstanceOf[conjunction]
  
  @js.native
  sealed trait construct extends StObject
  inline def construct: construct = "construct".asInstanceOf[construct]
  
  @js.native
  sealed trait contains
    extends StObject
       with ConditionName
       with _ConditionName
  inline def contains: contains = "contains".asInstanceOf[contains]
  
  @js.native
  sealed trait contextMenu extends StObject
  inline def contextMenu: contextMenu = "contextMenu".asInstanceOf[contextMenu]
  
  @js.native
  sealed trait copy
    extends StObject
       with PredefinedMenuItemKey
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait copyPaste extends StObject
  inline def copyPaste: copyPaste = "copyPaste".asInstanceOf[copyPaste]
  
  @js.native
  sealed trait copy_column_headers_only
    extends StObject
       with PredefinedMenuItemKey
  inline def copy_column_headers_only: copy_column_headers_only = "copy_column_headers_only".asInstanceOf[copy_column_headers_only]
  
  @js.native
  sealed trait copy_with_column_group_headers
    extends StObject
       with PredefinedMenuItemKey
  inline def copy_with_column_group_headers: copy_with_column_group_headers = "copy_with_column_group_headers".asInstanceOf[copy_with_column_group_headers]
  
  @js.native
  sealed trait copy_with_column_headers
    extends StObject
       with PredefinedMenuItemKey
  inline def copy_with_column_headers: copy_with_column_headers = "copy_with_column_headers".asInstanceOf[copy_with_column_headers]
  
  @js.native
  sealed trait count extends StObject
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait current extends StObject
  inline def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait custom extends StObject
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait customBorders extends StObject
  inline def customBorders: customBorders = "customBorders".asInstanceOf[customBorders]
  
  @js.native
  sealed trait cut
    extends StObject
       with PredefinedMenuItemKey
  inline def cut: cut = "cut".asInstanceOf[cut]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait date
    extends StObject
       with CellType
       with EditorType
       with ValidatorType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dateValidate
    extends StObject
       with ChangeSource
  inline def dateValidate: dateValidate = "dateValidate".asInstanceOf[dateValidate]
  
  @js.native
  sealed trait `de-CH` extends StObject
  inline def `de-CH`: `de-CH` = "de-CH".asInstanceOf[`de-CH`]
  
  @js.native
  sealed trait `de-DE` extends StObject
  inline def `de-DE`: `de-DE` = "de-DE".asInstanceOf[`de-DE`]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortOrderType
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait detach_from_parent
    extends StObject
       with PredefinedMenuItemKey
  inline def detach_from_parent: detach_from_parent = "detach_from_parent".asInstanceOf[detach_from_parent]
  
  @js.native
  sealed trait disjunction
    extends StObject
       with _OperationType
  inline def disjunction: disjunction = "disjunction".asInstanceOf[disjunction]
  
  @js.native
  sealed trait down extends StObject
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait dragToScroll extends StObject
  inline def dragToScroll: dragToScroll = "dragToScroll".asInstanceOf[dragToScroll]
  
  @js.native
  sealed trait dropdown
    extends StObject
       with CellType
       with EditorType
  inline def dropdown: dropdown = "dropdown".asInstanceOf[dropdown]
  
  @js.native
  sealed trait dropdownMenu extends StObject
  inline def dropdownMenu: dropdownMenu = "dropdownMenu".asInstanceOf[dropdownMenu]
  
  @js.native
  sealed trait edit
    extends StObject
       with ChangeSource
  inline def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait empty
    extends StObject
       with ConditionName
       with _ConditionName
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait `en-US` extends StObject
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait ends_with
    extends StObject
       with ConditionName
       with _ConditionName
  inline def ends_with: ends_with = "ends_with".asInstanceOf[ends_with]
  
  @js.native
  sealed trait eq
    extends StObject
       with ConditionName
       with _ConditionName
  inline def eq: eq = "eq".asInstanceOf[eq]
  
  @js.native
  sealed trait `es-MX` extends StObject
  inline def `es-MX`: `es-MX` = "es-MX".asInstanceOf[`es-MX`]
  
  @js.native
  sealed trait expand extends StObject
  inline def expand: expand = "expand".asInstanceOf[expand]
  
  @js.native
  sealed trait exportFile extends StObject
  inline def exportFile: exportFile = "exportFile".asInstanceOf[exportFile]
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait filter extends StObject
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait filter_action_bar
    extends StObject
       with PredefinedMenuItemKey
  inline def filter_action_bar: filter_action_bar = "filter_action_bar".asInstanceOf[filter_action_bar]
  
  @js.native
  sealed trait filter_by_condition
    extends StObject
       with PredefinedMenuItemKey
  inline def filter_by_condition: filter_by_condition = "filter_by_condition".asInstanceOf[filter_by_condition]
  
  @js.native
  sealed trait filter_by_condition2
    extends StObject
       with PredefinedMenuItemKey
  inline def filter_by_condition2: filter_by_condition2 = "filter_by_condition2".asInstanceOf[filter_by_condition2]
  
  @js.native
  sealed trait filter_by_value
    extends StObject
       with PredefinedMenuItemKey
  inline def filter_by_value: filter_by_value = "filter_by_value".asInstanceOf[filter_by_value]
  
  @js.native
  sealed trait filter_operators
    extends StObject
       with PredefinedMenuItemKey
  inline def filter_operators: filter_operators = "filter_operators".asInstanceOf[filter_operators]
  
  @js.native
  sealed trait filters extends StObject
  inline def filters: filters = "filters".asInstanceOf[filters]
  
  @js.native
  sealed trait formulas extends StObject
  inline def formulas: formulas = "formulas".asInstanceOf[formulas]
  
  @js.native
  sealed trait `fr-FR` extends StObject
  inline def `fr-FR`: `fr-FR` = "fr-FR".asInstanceOf[`fr-FR`]
  
  @js.native
  sealed trait freeze_column
    extends StObject
       with PredefinedMenuItemKey
  inline def freeze_column: freeze_column = "freeze_column".asInstanceOf[freeze_column]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait gt
    extends StObject
       with ConditionName
       with _ConditionName
  inline def gt: gt = "gt".asInstanceOf[gt]
  
  @js.native
  sealed trait gte
    extends StObject
       with ConditionName
       with _ConditionName
  inline def gte: gte = "gte".asInstanceOf[gte]
  
  @js.native
  sealed trait handsontable
    extends StObject
       with CellType
       with EditorType
  inline def handsontable: handsontable = "handsontable".asInstanceOf[handsontable]
  
  @js.native
  sealed trait header extends StObject
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait hidden
    extends StObject
       with MapTypes
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hiddenColumns extends StObject
  inline def hiddenColumns: hiddenColumns = "hiddenColumns".asInstanceOf[hiddenColumns]
  
  @js.native
  sealed trait hiddenRows extends StObject
  inline def hiddenRows: hiddenRows = "hiddenRows".asInstanceOf[hiddenRows]
  
  @js.native
  sealed trait hidden_columns_hide
    extends StObject
       with PredefinedMenuItemKey
  inline def hidden_columns_hide: hidden_columns_hide = "hidden_columns_hide".asInstanceOf[hidden_columns_hide]
  
  @js.native
  sealed trait hidden_columns_show
    extends StObject
       with PredefinedMenuItemKey
  inline def hidden_columns_show: hidden_columns_show = "hidden_columns_show".asInstanceOf[hidden_columns_show]
  
  @js.native
  sealed trait hidden_rows_hide
    extends StObject
       with PredefinedMenuItemKey
  inline def hidden_rows_hide: hidden_rows_hide = "hidden_rows_hide".asInstanceOf[hidden_rows_hide]
  
  @js.native
  sealed trait hidden_rows_show
    extends StObject
       with PredefinedMenuItemKey
  inline def hidden_rows_show: hidden_rows_show = "hidden_rows_show".asInstanceOf[hidden_rows_show]
  
  @js.native
  sealed trait hiding extends StObject
  inline def hiding: hiding = "hiding".asInstanceOf[hiding]
  
  @js.native
  sealed trait highlight extends StObject
  inline def highlight: highlight = "highlight".asInstanceOf[highlight]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Direction
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait htBottom extends StObject
  inline def htBottom: htBottom = "htBottom".asInstanceOf[htBottom]
  
  @js.native
  sealed trait htCenter extends StObject
  inline def htCenter: htCenter = "htCenter".asInstanceOf[htCenter]
  
  @js.native
  sealed trait htJustify extends StObject
  inline def htJustify: htJustify = "htJustify".asInstanceOf[htJustify]
  
  @js.native
  sealed trait htLeft extends StObject
  inline def htLeft: htLeft = "htLeft".asInstanceOf[htLeft]
  
  @js.native
  sealed trait htMiddle extends StObject
  inline def htMiddle: htMiddle = "htMiddle".asInstanceOf[htMiddle]
  
  @js.native
  sealed trait htRight extends StObject
  inline def htRight: htRight = "htRight".asInstanceOf[htRight]
  
  @js.native
  sealed trait htTop extends StObject
  inline def htTop: htTop = "htTop".asInstanceOf[htTop]
  
  @js.native
  sealed trait html
    extends StObject
       with RendererType
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait index
    extends StObject
       with MapTypes
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait inherit extends StObject
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait init extends StObject
  inline def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait insert extends StObject
  inline def insert: insert = "insert".asInstanceOf[insert]
  
  @js.native
  sealed trait insert_col
    extends StObject
       with AlterActions
  inline def insert_col: insert_col = "insert_col".asInstanceOf[insert_col]
  
  @js.native
  sealed trait insert_col_end
    extends StObject
       with AlterActions
  inline def insert_col_end: insert_col_end = "insert_col_end".asInstanceOf[insert_col_end]
  
  @js.native
  sealed trait insert_col_start
    extends StObject
       with AlterActions
  inline def insert_col_start: insert_col_start = "insert_col_start".asInstanceOf[insert_col_start]
  
  @js.native
  sealed trait insert_row
    extends StObject
       with AlterActions
  inline def insert_row: insert_row = "insert_row".asInstanceOf[insert_row]
  
  @js.native
  sealed trait insert_row_above
    extends StObject
       with AlterActions
  inline def insert_row_above: insert_row_above = "insert_row_above".asInstanceOf[insert_row_above]
  
  @js.native
  sealed trait insert_row_below
    extends StObject
       with AlterActions
  inline def insert_row_below: insert_row_below = "insert_row_below".asInstanceOf[insert_row_below]
  
  @js.native
  sealed trait isSearchResult extends StObject
  inline def isSearchResult: isSearchResult = "isSearchResult".asInstanceOf[isSearchResult]
  
  @js.native
  sealed trait `it-IT` extends StObject
  inline def `it-IT`: `it-IT` = "it-IT".asInstanceOf[`it-IT`]
  
  @js.native
  sealed trait `js-JP` extends StObject
  inline def `js-JP`: `js-JP` = "js-JP".asInstanceOf[`js-JP`]
  
  @js.native
  sealed trait `ko-KR` extends StObject
  inline def `ko-KR`: `ko-KR` = "ko-KR".asInstanceOf[`ko-KR`]
  
  @js.native
  sealed trait last extends StObject
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait left
    extends StObject
       with OverlayType
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait linkedPhysicalIndexToValue
    extends StObject
       with MapTypes
  inline def linkedPhysicalIndexToValue: linkedPhysicalIndexToValue = "linkedPhysicalIndexToValue".asInstanceOf[linkedPhysicalIndexToValue]
  
  @js.native
  sealed trait loadData
    extends StObject
       with ChangeSource
  inline def loadData: loadData = "loadData".asInstanceOf[loadData]
  
  @js.native
  sealed trait loose extends StObject
  inline def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait lower extends StObject
  inline def lower: lower = "lower".asInstanceOf[lower]
  
  @js.native
  sealed trait lt
    extends StObject
       with ConditionName
       with _ConditionName
  inline def lt: lt = "lt".asInstanceOf[lt]
  
  @js.native
  sealed trait lte
    extends StObject
       with ConditionName
       with _ConditionName
  inline def lte: lte = "lte".asInstanceOf[lte]
  
  @js.native
  sealed trait ltr extends StObject
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait `lv-LV` extends StObject
  inline def `lv-LV`: `lv-LV` = "lv-LV".asInstanceOf[`lv-LV`]
  
  @js.native
  sealed trait make_read_only
    extends StObject
       with PredefinedMenuItemKey
  inline def make_read_only: make_read_only = "make_read_only".asInstanceOf[make_read_only]
  
  @js.native
  sealed trait manualColumnFreeze extends StObject
  inline def manualColumnFreeze: manualColumnFreeze = "manualColumnFreeze".asInstanceOf[manualColumnFreeze]
  
  @js.native
  sealed trait manualColumnMove extends StObject
  inline def manualColumnMove: manualColumnMove = "manualColumnMove".asInstanceOf[manualColumnMove]
  
  @js.native
  sealed trait manualColumnResize extends StObject
  inline def manualColumnResize: manualColumnResize = "manualColumnResize".asInstanceOf[manualColumnResize]
  
  @js.native
  sealed trait manualRowMove extends StObject
  inline def manualRowMove: manualRowMove = "manualRowMove".asInstanceOf[manualRowMove]
  
  @js.native
  sealed trait manualRowResize extends StObject
  inline def manualRowResize: manualRowResize = "manualRowResize".asInstanceOf[manualRowResize]
  
  @js.native
  sealed trait max extends StObject
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait mergeCells
    extends StObject
       with PredefinedMenuItemKey
  inline def mergeCells: mergeCells = "mergeCells".asInstanceOf[mergeCells]
  
  @js.native
  sealed trait min extends StObject
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait mixed extends StObject
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait modifyAutoColumnSizeSeed extends StObject
  inline def modifyAutoColumnSizeSeed: modifyAutoColumnSizeSeed = "modifyAutoColumnSizeSeed".asInstanceOf[modifyAutoColumnSizeSeed]
  
  @js.native
  sealed trait modifyAutofillRange extends StObject
  inline def modifyAutofillRange: modifyAutofillRange = "modifyAutofillRange".asInstanceOf[modifyAutofillRange]
  
  @js.native
  sealed trait modifyColHeader extends StObject
  inline def modifyColHeader: modifyColHeader = "modifyColHeader".asInstanceOf[modifyColHeader]
  
  @js.native
  sealed trait modifyColWidth extends StObject
  inline def modifyColWidth: modifyColWidth = "modifyColWidth".asInstanceOf[modifyColWidth]
  
  @js.native
  sealed trait modifyColumnHeaderHeight extends StObject
  inline def modifyColumnHeaderHeight: modifyColumnHeaderHeight = "modifyColumnHeaderHeight".asInstanceOf[modifyColumnHeaderHeight]
  
  @js.native
  sealed trait modifyColumnHeaderValue extends StObject
  inline def modifyColumnHeaderValue: modifyColumnHeaderValue = "modifyColumnHeaderValue".asInstanceOf[modifyColumnHeaderValue]
  
  @js.native
  sealed trait modifyCopyableRange extends StObject
  inline def modifyCopyableRange: modifyCopyableRange = "modifyCopyableRange".asInstanceOf[modifyCopyableRange]
  
  @js.native
  sealed trait modifyData extends StObject
  inline def modifyData: modifyData = "modifyData".asInstanceOf[modifyData]
  
  @js.native
  sealed trait modifyGetCellCoords extends StObject
  inline def modifyGetCellCoords: modifyGetCellCoords = "modifyGetCellCoords".asInstanceOf[modifyGetCellCoords]
  
  @js.native
  sealed trait modifyRowData extends StObject
  inline def modifyRowData: modifyRowData = "modifyRowData".asInstanceOf[modifyRowData]
  
  @js.native
  sealed trait modifyRowHeader extends StObject
  inline def modifyRowHeader: modifyRowHeader = "modifyRowHeader".asInstanceOf[modifyRowHeader]
  
  @js.native
  sealed trait modifyRowHeaderWidth extends StObject
  inline def modifyRowHeaderWidth: modifyRowHeaderWidth = "modifyRowHeaderWidth".asInstanceOf[modifyRowHeaderWidth]
  
  @js.native
  sealed trait modifyRowHeight extends StObject
  inline def modifyRowHeight: modifyRowHeight = "modifyRowHeight".asInstanceOf[modifyRowHeight]
  
  @js.native
  sealed trait modifySourceData extends StObject
  inline def modifySourceData: modifySourceData = "modifySourceData".asInstanceOf[modifySourceData]
  
  @js.native
  sealed trait modifyTransformEnd extends StObject
  inline def modifyTransformEnd: modifyTransformEnd = "modifyTransformEnd".asInstanceOf[modifyTransformEnd]
  
  @js.native
  sealed trait modifyTransformStart extends StObject
  inline def modifyTransformStart: modifyTransformStart = "modifyTransformStart".asInstanceOf[modifyTransformStart]
  
  @js.native
  sealed trait multiColumnSorting extends StObject
  inline def multiColumnSorting: multiColumnSorting = "multiColumnSorting".asInstanceOf[multiColumnSorting]
  
  @js.native
  sealed trait multiple extends StObject
  inline def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait multipleSelectionHandles extends StObject
  inline def multipleSelectionHandles: multipleSelectionHandles = "multipleSelectionHandles".asInstanceOf[multipleSelectionHandles]
  
  @js.native
  sealed trait `nb-NO` extends StObject
  inline def `nb-NO`: `nb-NO` = "nb-NO".asInstanceOf[`nb-NO`]
  
  @js.native
  sealed trait neq
    extends StObject
       with ConditionName
       with _ConditionName
  inline def neq: neq = "neq".asInstanceOf[neq]
  
  @js.native
  sealed trait nestedHeaders extends StObject
  inline def nestedHeaders: nestedHeaders = "nestedHeaders".asInstanceOf[nestedHeaders]
  
  @js.native
  sealed trait nestedRows extends StObject
  inline def nestedRows: nestedRows = "nestedRows".asInstanceOf[nestedRows]
  
  @js.native
  sealed trait `nl-NL` extends StObject
  inline def `nl-NL`: `nl-NL` = "nl-NL".asInstanceOf[`nl-NL`]
  
  @js.native
  sealed trait `non-commercial-and-evaluation` extends StObject
  inline def `non-commercial-and-evaluation`: `non-commercial-and-evaluation` = "non-commercial-and-evaluation".asInstanceOf[`non-commercial-and-evaluation`]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait not_between
    extends StObject
       with ConditionName
       with _ConditionName
  inline def not_between: not_between = "not_between".asInstanceOf[not_between]
  
  @js.native
  sealed trait not_contains
    extends StObject
       with ConditionName
       with _ConditionName
  inline def not_contains: not_contains = "not_contains".asInstanceOf[not_contains]
  
  @js.native
  sealed trait not_empty
    extends StObject
       with ConditionName
       with _ConditionName
  inline def not_empty: not_empty = "not_empty".asInstanceOf[not_empty]
  
  @js.native
  sealed trait numeric
    extends StObject
       with CellType
       with EditorType
       with RendererType
       with ValidatorType
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait overwrite
    extends StObject
       with PasteModeType
  inline def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  
  @js.native
  sealed trait password
    extends StObject
       with CellType
       with EditorType
       with RendererType
  inline def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait persistentState extends StObject
  inline def persistentState: persistentState = "persistentState".asInstanceOf[persistentState]
  
  @js.native
  sealed trait persistentStateLoad extends StObject
  inline def persistentStateLoad: persistentStateLoad = "persistentStateLoad".asInstanceOf[persistentStateLoad]
  
  @js.native
  sealed trait persistentStateReset extends StObject
  inline def persistentStateReset: persistentStateReset = "persistentStateReset".asInstanceOf[persistentStateReset]
  
  @js.native
  sealed trait persistentStateSave extends StObject
  inline def persistentStateSave: persistentStateSave = "persistentStateSave".asInstanceOf[persistentStateSave]
  
  @js.native
  sealed trait physicalIndexToValue
    extends StObject
       with MapTypes
  inline def physicalIndexToValue: physicalIndexToValue = "physicalIndexToValue".asInstanceOf[physicalIndexToValue]
  
  @js.native
  sealed trait `pl-PL` extends StObject
  inline def `pl-PL`: `pl-PL` = "pl-PL".asInstanceOf[`pl-PL`]
  
  @js.native
  sealed trait populateFromArray
    extends StObject
       with ChangeSource
  inline def populateFromArray: populateFromArray = "populateFromArray".asInstanceOf[populateFromArray]
  
  @js.native
  sealed trait `pt-BR` extends StObject
  inline def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @js.native
  sealed trait range extends StObject
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait redo
    extends StObject
       with PredefinedMenuItemKey
  inline def redo: redo = "redo".asInstanceOf[redo]
  
  @js.native
  sealed trait remove extends StObject
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait remove_col
    extends StObject
       with AlterActions
       with PredefinedMenuItemKey
  inline def remove_col: remove_col = "remove_col".asInstanceOf[remove_col]
  
  @js.native
  sealed trait remove_row
    extends StObject
       with AlterActions
       with PredefinedMenuItemKey
  inline def remove_row: remove_row = "remove_row".asInstanceOf[remove_row]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait row_above
    extends StObject
       with PredefinedMenuItemKey
  inline def row_above: row_above = "row_above".asInstanceOf[row_above]
  
  @js.native
  sealed trait row_below
    extends StObject
       with PredefinedMenuItemKey
  inline def row_below: row_below = "row_below".asInstanceOf[row_below]
  
  @js.native
  sealed trait rtl extends StObject
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait `ru-RU` extends StObject
  inline def `ru-RU`: `ru-RU` = "ru-RU".asInstanceOf[`ru-RU`]
  
  @js.native
  sealed trait search extends StObject
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait select
    extends StObject
       with EditorType
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait shift_down
    extends StObject
       with PasteModeType
  inline def shift_down: shift_down = "shift_down".asInstanceOf[shift_down]
  
  @js.native
  sealed trait shift_right
    extends StObject
       with PasteModeType
  inline def shift_right: shift_right = "shift_right".asInstanceOf[shift_right]
  
  @js.native
  sealed trait single extends StObject
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait skipRowOnPaste extends StObject
  inline def skipRowOnPaste: skipRowOnPaste = "skipRowOnPaste".asInstanceOf[skipRowOnPaste]
  
  @js.native
  sealed trait spliceCol
    extends StObject
       with ChangeSource
  inline def spliceCol: spliceCol = "spliceCol".asInstanceOf[spliceCol]
  
  @js.native
  sealed trait spliceRow
    extends StObject
       with ChangeSource
  inline def spliceRow: spliceRow = "spliceRow".asInstanceOf[spliceRow]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait strict extends StObject
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait sum extends StObject
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait text
    extends StObject
       with CellType
       with EditorType
       with RendererType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait time
    extends StObject
       with CellType
       with EditorType
       with RendererType
       with ValidatorType
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeValidate
    extends StObject
       with ChangeSource
  inline def timeValidate: timeValidate = "timeValidate".asInstanceOf[timeValidate]
  
  @js.native
  sealed trait top
    extends StObject
       with OverlayType
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-left-corner` extends StObject
  inline def `top-left-corner`: `top-left-corner` = "top-left-corner".asInstanceOf[`top-left-corner`]
  
  @js.native
  sealed trait top_left_corner
    extends StObject
       with OverlayType
  inline def top_left_corner: top_left_corner = "top_left_corner".asInstanceOf[top_left_corner]
  
  @js.native
  sealed trait touchScroll extends StObject
  inline def touchScroll: touchScroll = "touchScroll".asInstanceOf[touchScroll]
  
  @js.native
  sealed trait trimRows extends StObject
  inline def trimRows: trimRows = "trimRows".asInstanceOf[trimRows]
  
  @js.native
  sealed trait trimming
    extends StObject
       with MapTypes
  inline def trimming: trimming = "trimming".asInstanceOf[trimming]
  
  @js.native
  sealed trait undo
    extends StObject
       with PredefinedMenuItemKey
  inline def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait undoRedo extends StObject
  inline def undoRedo: undoRedo = "undoRedo".asInstanceOf[undoRedo]
  
  @js.native
  sealed trait unfreeze_column
    extends StObject
       with PredefinedMenuItemKey
  inline def unfreeze_column: unfreeze_column = "unfreeze_column".asInstanceOf[unfreeze_column]
  
  @js.native
  sealed trait up extends StObject
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait upper extends StObject
  inline def upper: upper = "upper".asInstanceOf[upper]
  
  @js.native
  sealed trait valid extends StObject
  inline def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait validateCells
    extends StObject
       with ChangeSource
  inline def validateCells: validateCells = "validateCells".asInstanceOf[validateCells]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Direction
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `with-all-column-headers`
    extends StObject
       with CopyModeType
  inline def `with-all-column-headers`: `with-all-column-headers` = "with-all-column-headers".asInstanceOf[`with-all-column-headers`]
  
  @js.native
  sealed trait `with-column-headers`
    extends StObject
       with CopyModeType
  inline def `with-column-headers`: `with-column-headers` = "with-column-headers".asInstanceOf[`with-column-headers`]
  
  @js.native
  sealed trait `zh-CN` extends StObject
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-TW` extends StObject
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
}
