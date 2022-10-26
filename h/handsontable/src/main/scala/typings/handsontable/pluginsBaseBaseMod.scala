package typings.handsontable

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.`3rdpartyWalkontableSrcCalculatorViewportColumnsMod`.ViewportColumnsCalculator
import typings.handsontable.anon.SkipRender
import typings.handsontable.anon.Value
import typings.handsontable.anon.ValueAny
import typings.handsontable.anon.ValueCellValue
import typings.handsontable.commonMod.CellChange
import typings.handsontable.commonMod.CellValue
import typings.handsontable.commonMod.ChangeSource
import typings.handsontable.commonMod.RangeType
import typings.handsontable.commonMod.RowObject
import typings.handsontable.coreMod.default
import typings.handsontable.handsontableInts.`-1`
import typings.handsontable.handsontableInts.`0`
import typings.handsontable.handsontableStrings.afterAddChild
import typings.handsontable.handsontableStrings.afterAutofill
import typings.handsontable.handsontableStrings.afterBeginEditing
import typings.handsontable.handsontableStrings.afterCellMetaReset
import typings.handsontable.handsontableStrings.afterChange
import typings.handsontable.handsontableStrings.afterChangesObserved
import typings.handsontable.handsontableStrings.afterColumnCollapse
import typings.handsontable.handsontableStrings.afterColumnExpand
import typings.handsontable.handsontableStrings.afterColumnMove
import typings.handsontable.handsontableStrings.afterColumnResize
import typings.handsontable.handsontableStrings.afterColumnSort
import typings.handsontable.handsontableStrings.afterContextMenuDefaultOptions
import typings.handsontable.handsontableStrings.afterContextMenuHide
import typings.handsontable.handsontableStrings.afterContextMenuShow
import typings.handsontable.handsontableStrings.afterCopy
import typings.handsontable.handsontableStrings.afterCopyLimit
import typings.handsontable.handsontableStrings.afterCreateCol
import typings.handsontable.handsontableStrings.afterCreateRow
import typings.handsontable.handsontableStrings.afterCut
import typings.handsontable.handsontableStrings.afterDeselect
import typings.handsontable.handsontableStrings.afterDestroy
import typings.handsontable.handsontableStrings.afterDetachChild
import typings.handsontable.handsontableStrings.afterDocumentKeyDown
import typings.handsontable.handsontableStrings.afterDrawSelection
import typings.handsontable.handsontableStrings.afterDropdownMenuDefaultOptions
import typings.handsontable.handsontableStrings.afterDropdownMenuHide
import typings.handsontable.handsontableStrings.afterDropdownMenuShow
import typings.handsontable.handsontableStrings.afterFilter
import typings.handsontable.handsontableStrings.afterFormulasValuesUpdate
import typings.handsontable.handsontableStrings.afterGetCellMeta
import typings.handsontable.handsontableStrings.afterGetColHeader
import typings.handsontable.handsontableStrings.afterGetColumnHeaderRenderers
import typings.handsontable.handsontableStrings.afterGetRowHeader
import typings.handsontable.handsontableStrings.afterGetRowHeaderRenderers
import typings.handsontable.handsontableStrings.afterHideColumns
import typings.handsontable.handsontableStrings.afterHideRows
import typings.handsontable.handsontableStrings.afterInit
import typings.handsontable.handsontableStrings.afterLanguageChange
import typings.handsontable.handsontableStrings.afterListen
import typings.handsontable.handsontableStrings.afterLoadData
import typings.handsontable.handsontableStrings.afterMergeCells
import typings.handsontable.handsontableStrings.afterModifyTransformEnd
import typings.handsontable.handsontableStrings.afterModifyTransformStart
import typings.handsontable.handsontableStrings.afterMomentumScroll
import typings.handsontable.handsontableStrings.afterNamedExpressionAdded
import typings.handsontable.handsontableStrings.afterNamedExpressionRemoved
import typings.handsontable.handsontableStrings.afterOnCellContextMenu
import typings.handsontable.handsontableStrings.afterOnCellCornerDblClick
import typings.handsontable.handsontableStrings.afterOnCellCornerMouseDown
import typings.handsontable.handsontableStrings.afterOnCellMouseDown
import typings.handsontable.handsontableStrings.afterOnCellMouseOut
import typings.handsontable.handsontableStrings.afterOnCellMouseOver
import typings.handsontable.handsontableStrings.afterOnCellMouseUp
import typings.handsontable.handsontableStrings.afterPaste
import typings.handsontable.handsontableStrings.afterPluginsInitialized
import typings.handsontable.handsontableStrings.afterRedo
import typings.handsontable.handsontableStrings.afterRedoStackChange
import typings.handsontable.handsontableStrings.afterRefreshDimensions
import typings.handsontable.handsontableStrings.afterRemoveCellMeta
import typings.handsontable.handsontableStrings.afterRemoveCol
import typings.handsontable.handsontableStrings.afterRemoveRow
import typings.handsontable.handsontableStrings.afterRender
import typings.handsontable.handsontableStrings.afterRenderer
import typings.handsontable.handsontableStrings.afterRowMove
import typings.handsontable.handsontableStrings.afterRowResize
import typings.handsontable.handsontableStrings.afterScrollHorizontally
import typings.handsontable.handsontableStrings.afterScrollVertically
import typings.handsontable.handsontableStrings.afterSelection
import typings.handsontable.handsontableStrings.afterSelectionByProp
import typings.handsontable.handsontableStrings.afterSelectionEnd
import typings.handsontable.handsontableStrings.afterSelectionEndByProp
import typings.handsontable.handsontableStrings.afterSetCellMeta
import typings.handsontable.handsontableStrings.afterSetDataAtCell
import typings.handsontable.handsontableStrings.afterSetDataAtRowProp
import typings.handsontable.handsontableStrings.afterSetSourceDataAtCell
import typings.handsontable.handsontableStrings.afterSheetAdded
import typings.handsontable.handsontableStrings.afterSheetRemoved
import typings.handsontable.handsontableStrings.afterSheetRenamed
import typings.handsontable.handsontableStrings.afterTrimRow
import typings.handsontable.handsontableStrings.afterUndo
import typings.handsontable.handsontableStrings.afterUndoStackChange
import typings.handsontable.handsontableStrings.afterUnhideColumns
import typings.handsontable.handsontableStrings.afterUnhideRows
import typings.handsontable.handsontableStrings.afterUnlisten
import typings.handsontable.handsontableStrings.afterUnmergeCells
import typings.handsontable.handsontableStrings.afterUntrimRow
import typings.handsontable.handsontableStrings.afterUpdateData
import typings.handsontable.handsontableStrings.afterUpdateSettings
import typings.handsontable.handsontableStrings.afterValidate
import typings.handsontable.handsontableStrings.afterViewRender
import typings.handsontable.handsontableStrings.afterViewportColumnCalculatorOverride
import typings.handsontable.handsontableStrings.afterViewportRowCalculatorOverride
import typings.handsontable.handsontableStrings.area
import typings.handsontable.handsontableStrings.beforeAddChild
import typings.handsontable.handsontableStrings.beforeAutofill
import typings.handsontable.handsontableStrings.beforeAutofillInsidePopulate
import typings.handsontable.handsontableStrings.beforeCellAlignment
import typings.handsontable.handsontableStrings.beforeChange
import typings.handsontable.handsontableStrings.beforeChangeRender
import typings.handsontable.handsontableStrings.beforeColumnCollapse
import typings.handsontable.handsontableStrings.beforeColumnExpand
import typings.handsontable.handsontableStrings.beforeColumnMove
import typings.handsontable.handsontableStrings.beforeColumnResize
import typings.handsontable.handsontableStrings.beforeColumnSort
import typings.handsontable.handsontableStrings.beforeContextMenuSetItems
import typings.handsontable.handsontableStrings.beforeContextMenuShow
import typings.handsontable.handsontableStrings.beforeCopy
import typings.handsontable.handsontableStrings.beforeCreateCol
import typings.handsontable.handsontableStrings.beforeCreateRow
import typings.handsontable.handsontableStrings.beforeCut
import typings.handsontable.handsontableStrings.beforeDetachChild
import typings.handsontable.handsontableStrings.beforeDrawBorders
import typings.handsontable.handsontableStrings.beforeDropdownMenuSetItems
import typings.handsontable.handsontableStrings.beforeDropdownMenuShow
import typings.handsontable.handsontableStrings.beforeFilter
import typings.handsontable.handsontableStrings.beforeGetCellMeta
import typings.handsontable.handsontableStrings.beforeHideColumns
import typings.handsontable.handsontableStrings.beforeHideRows
import typings.handsontable.handsontableStrings.beforeHighlightingColumnHeader
import typings.handsontable.handsontableStrings.beforeHighlightingRowHeader
import typings.handsontable.handsontableStrings.beforeInit
import typings.handsontable.handsontableStrings.beforeInitWalkontable
import typings.handsontable.handsontableStrings.beforeKeyDown
import typings.handsontable.handsontableStrings.beforeLanguageChange
import typings.handsontable.handsontableStrings.beforeLoadData
import typings.handsontable.handsontableStrings.beforeMergeCells
import typings.handsontable.handsontableStrings.beforeOnCellContextMenu
import typings.handsontable.handsontableStrings.beforeOnCellMouseDown
import typings.handsontable.handsontableStrings.beforeOnCellMouseOut
import typings.handsontable.handsontableStrings.beforeOnCellMouseOver
import typings.handsontable.handsontableStrings.beforeOnCellMouseUp
import typings.handsontable.handsontableStrings.beforePaste
import typings.handsontable.handsontableStrings.beforeRedo
import typings.handsontable.handsontableStrings.beforeRedoStackChange
import typings.handsontable.handsontableStrings.beforeRefreshDimensions
import typings.handsontable.handsontableStrings.beforeRemoveCellClassNames
import typings.handsontable.handsontableStrings.beforeRemoveCellMeta
import typings.handsontable.handsontableStrings.beforeRemoveCol
import typings.handsontable.handsontableStrings.beforeRemoveRow
import typings.handsontable.handsontableStrings.beforeRender
import typings.handsontable.handsontableStrings.beforeRenderer
import typings.handsontable.handsontableStrings.beforeRowMove
import typings.handsontable.handsontableStrings.beforeRowResize
import typings.handsontable.handsontableStrings.beforeSetCellMeta
import typings.handsontable.handsontableStrings.beforeSetRangeEnd
import typings.handsontable.handsontableStrings.beforeSetRangeStart
import typings.handsontable.handsontableStrings.beforeSetRangeStartOnly
import typings.handsontable.handsontableStrings.beforeStretchingColumnWidth
import typings.handsontable.handsontableStrings.beforeTouchScroll
import typings.handsontable.handsontableStrings.beforeTrimRow
import typings.handsontable.handsontableStrings.beforeUndo
import typings.handsontable.handsontableStrings.beforeUndoStackChange
import typings.handsontable.handsontableStrings.beforeUnhideColumns
import typings.handsontable.handsontableStrings.beforeUnhideRows
import typings.handsontable.handsontableStrings.beforeUnmergeCells
import typings.handsontable.handsontableStrings.beforeUntrimRow
import typings.handsontable.handsontableStrings.beforeUpdateData
import typings.handsontable.handsontableStrings.beforeValidate
import typings.handsontable.handsontableStrings.beforeValueRender
import typings.handsontable.handsontableStrings.beforeViewRender
import typings.handsontable.handsontableStrings.construct
import typings.handsontable.handsontableStrings.current
import typings.handsontable.handsontableStrings.down
import typings.handsontable.handsontableStrings.get
import typings.handsontable.handsontableStrings.highlight
import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.htBottom
import typings.handsontable.handsontableStrings.htCenter
import typings.handsontable.handsontableStrings.htJustify
import typings.handsontable.handsontableStrings.htLeft
import typings.handsontable.handsontableStrings.htMiddle
import typings.handsontable.handsontableStrings.htRight
import typings.handsontable.handsontableStrings.htTop
import typings.handsontable.handsontableStrings.init
import typings.handsontable.handsontableStrings.left
import typings.handsontable.handsontableStrings.modifyAutoColumnSizeSeed
import typings.handsontable.handsontableStrings.modifyAutofillRange
import typings.handsontable.handsontableStrings.modifyColHeader
import typings.handsontable.handsontableStrings.modifyColWidth
import typings.handsontable.handsontableStrings.modifyColumnHeaderHeight
import typings.handsontable.handsontableStrings.modifyCopyableRange
import typings.handsontable.handsontableStrings.modifyData
import typings.handsontable.handsontableStrings.modifyGetCellCoords
import typings.handsontable.handsontableStrings.modifyRowData
import typings.handsontable.handsontableStrings.modifyRowHeader
import typings.handsontable.handsontableStrings.modifyRowHeaderWidth
import typings.handsontable.handsontableStrings.modifyRowHeight
import typings.handsontable.handsontableStrings.modifySourceData
import typings.handsontable.handsontableStrings.modifyTransformEnd
import typings.handsontable.handsontableStrings.modifyTransformStart
import typings.handsontable.handsontableStrings.persistentStateLoad
import typings.handsontable.handsontableStrings.persistentStateReset
import typings.handsontable.handsontableStrings.persistentStateSave
import typings.handsontable.handsontableStrings.right
import typings.handsontable.handsontableStrings.set
import typings.handsontable.handsontableStrings.up
import typings.handsontable.handsontableStrings.vertical
import typings.handsontable.pluginHooksMod.HookHighlightColumnHeaderMeta
import typings.handsontable.pluginHooksMod.HookHighlightRowHeaderMeta
import typings.handsontable.pluginsColumnSortingColumnSortingMod.Config
import typings.handsontable.pluginsContextMenuContextMenuMod.MenuItemConfig
import typings.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.pluginsContextMenuMod.ContextMenu
import typings.handsontable.pluginsDropdownMenuMod.DropdownMenu
import typings.handsontable.pluginsFiltersFiltersMod.ColumnConditions
import typings.handsontable.pluginsMergeCellsMergeCellsMod.Settings
import typings.handsontable.pluginsUndoRedoUndoRedoMod.Action
import typings.handsontable.selectionMod.SelectionController
import typings.handsontable.settingsMod.CellProperties
import typings.handsontable.settingsMod.GridSettings
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsBaseBaseMod {
  
  @JSImport("handsontable/plugins/base/base", "BasePlugin")
  @js.native
  open class BasePlugin protected () extends StObject {
    def this(hotInstance: default) = this()
    
    def addHook(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* targetRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* targetRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: beforeDrawBorders,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifyData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifyData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifySourceData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ]
    ): Unit = js.native
    def addHook(
      key: modifySourceData,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* row */ Double, 
              /* column */ Double, 
              /* valueHolder */ ValueCellValue, 
              /* ioMode */ get | set, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterAddChild(
      key: afterAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              /* successfullyCollapsed */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentCollapsedColumns */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              /* successfullyExpanded */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnMove(
      key: afterColumnMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnMove(
      key: afterColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterColumnSort(
      key: afterColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumns */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectedRows */ Double, 
              /* selectedColumns */ Double, 
              /* copyRowsLimit */ Double, 
              /* copyColumnsLimit */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ js.UndefOr[Double], 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentRow */ Double, 
              /* currentColumn */ Double, 
              /* cornersOfSelection */ js.Array[Double], 
              /* layerLevel */ js.UndefOr[Double], 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* TH */ HTMLTableHeaderCellElement, 
            /* headerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* column */ Double, 
              /* TH */ HTMLTableHeaderCellElement, 
              /* headerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideColumns(
      key: afterHideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideColumns(
      key: afterHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideRows(
      key: afterHideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterHideRows(
      key: afterHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterLoadData(
      key: afterLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[
            /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* mergeParent */ Settings, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* mergeParent */ Settings, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalRows */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterRenderer(
      key: afterRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ String, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRenderer(
      key: afterRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ String, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowMove(
      key: afterRowMove,
      callback: js.UndefOr[
          js.Function5[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowMove(
      key: afterRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              /* orderChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelection(
      key: afterSelection,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelection(
      key: afterSelection,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.UndefOr[
          js.Function6[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* preventScrolling */ Value, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionByProp(
      key: afterSelectionByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* preventScrolling */ Value, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* column */ Double, 
            /* row2 */ Double, 
            /* column2 */ Double, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEnd(
      key: afterSelectionEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* column */ Double, 
              /* row2 */ Double, 
              /* column2 */ Double, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.UndefOr[
          js.Function5[
            /* row */ Double, 
            /* prop */ String, 
            /* row2 */ Double, 
            /* prop2 */ String, 
            /* selectionLayerLevel */ Double, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSelectionEndByProp(
      key: afterSelectionEndByProp,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* row */ Double, 
              /* prop */ String, 
              /* row2 */ Double, 
              /* prop2 */ String, 
              /* selectionLayerLevel */ Double, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetAdded(key: afterSheetAdded, callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterTrimRow(
      key: afterTrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterTrimRow(
      key: afterTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateData(
      key: afterUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterValidate(
      key: afterValidate,
      callback: js.UndefOr[
          js.Function5[
            /* isValid */ Boolean, 
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ ChangeSource, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterValidate(
      key: afterValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function5[
              /* isValid */ Boolean, 
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ ChangeSource, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewRender(key: afterViewRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewRender(key: afterViewRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeAddChild(
      key: beforeAddChild,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange | Null], /* source */ ChangeSource, Unit | Boolean]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange | Null], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedColumns */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCopy(
      key: beforeCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeCut(
      key: beforeCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHideRows(
      key: beforeHideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* column */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightColumnHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightRowHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeLoadData(
      key: beforeLoadData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforePaste(
      key: beforePaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* actionPossible */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ Double, 
              /* amount */ Double, 
              /* physicalColumns */ js.Array[Double], 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRender(key: beforeRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRender(key: beforeRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRenderer(
      key: beforeRenderer,
      callback: js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* column */ Double, 
            /* prop */ String | Double, 
            /* value */ CellValue, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRenderer(
      key: beforeRenderer,
      callback: js.Array[
          js.UndefOr[
            js.Function6[
              /* TD */ HTMLTableCellElement, 
              /* row */ Double, 
              /* column */ Double, 
              /* prop */ String | Double, 
              /* value */ CellValue, 
              /* cellProperties */ CellProperties, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowMove(
      key: beforeRowMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowMove(
      key: beforeRowMove,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* movedRows */ js.Array[Double], 
              /* finalIndex */ Double, 
              /* dropIndex */ js.UndefOr[Double], 
              /* movePossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[
          js.Function1[
            /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* coords */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[
          js.Function2[
            /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
            /* auto */ Boolean, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* cellRange */ typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default, 
              /* auto */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValidate(
      key: beforeValidate,
      callback: js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValidate(
      key: beforeValidate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* value */ CellValue, 
              /* row */ Double, 
              /* prop */ String | Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* seed */ String, 
              /* cellProperties */ CellProperties, 
              /* cellValue */ CellValue, 
              String | Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* column */ Double, 
              /* topmost */ Boolean, 
              Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[
          js.Function1[
            /* delta */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* delta */ typings.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]
    ): Unit = js.native
    @JSName("addHook")
    def addHook_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]
    ): Unit = js.native
    
    def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
    
    def clearHooks(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def disablePlugin(): Unit = js.native
    
    def enablePlugin(): Unit = js.native
    
    var enabled: Boolean = js.native
    
    val hot: default = js.native
    
    def init(): Unit = js.native
    
    var initialized: Boolean = js.native
    
    var isPluginsReady: Boolean = js.native
    
    var pluginName: String = js.native
    
    var pluginsInitializedCallbacks: js.Array[String] = js.native
    
    def removeHooks(
      name: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typings.handsontable.handsontableStrings.afterAddChild, typings.handsontable.handsontableStrings.afterAutofill, typings.handsontable.handsontableStrings.afterBeginEditing */ Any
    ): Unit = js.native
    
    def updatePlugin(): Unit = js.native
  }
}
