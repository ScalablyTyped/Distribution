package typings.handsontable

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.anon.SkipRender
import typings.handsontable.anon.Value
import typings.handsontable.anon.ValueAny
import typings.handsontable.anon.ValueCellValue
import typings.handsontable.columnSortingColumnSortingMod.Config
import typings.handsontable.commonMod.CellChange
import typings.handsontable.commonMod.CellValue
import typings.handsontable.commonMod.ChangeSource
import typings.handsontable.commonMod.RangeType
import typings.handsontable.commonMod.RowObject
import typings.handsontable.contextMenuContextMenuMod.MenuItemConfig
import typings.handsontable.contextMenuContextMenuMod.PredefinedMenuItemKey
import typings.handsontable.contextMenuMod.ContextMenu
import typings.handsontable.dropdownMenuMod.DropdownMenu
import typings.handsontable.filtersFiltersMod.ColumnConditions
import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
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
import typings.handsontable.handsontableStrings.modifyRowSourceData
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
import typings.handsontable.mergeCellsMergeCellsMod.Settings
import typings.handsontable.rangeMod.default
import typings.handsontable.selectionMod.SelectionController
import typings.handsontable.settingsMod.CellProperties
import typings.handsontable.settingsMod.GridSettings
import typings.handsontable.undoRedoUndoRedoMod.Action
import typings.handsontable.viewportColumnsMod.ViewportColumnsCalculator
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginHooksMod {
  
  @JSImport("handsontable/pluginHooks", "Hooks")
  @js.native
  open class Hooks () extends StObject {
    
    def add(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typings.handsontable.coordsMod.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typings.handsontable.coordsMod.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.coordsMod.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.coordsMod.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ]
    ): Hooks = js.native
    def add(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
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
    ): Hooks = js.native
    def add(
      key: beforeDrawBorders,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
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
    ): Hooks = js.native
    def add(
      key: modifyData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
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
    ): Hooks = js.native
    def add(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
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
    ): Hooks = js.native
    def add(
      key: modifySourceData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    def add(
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
    ): Hooks = js.native
    def add(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterAddChild(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterAddChild(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterCellMetaReset(
      key: afterCellMetaReset,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterCellMetaReset(
      key: afterCellMetaReset,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterChangesObserved(
      key: afterChangesObserved,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterChangesObserved(
      key: afterChangesObserved,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnCollapse(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnCollapse(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnCollapse(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnExpand(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnExpand(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnExpand(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnSort(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterColumnSort(
      key: afterColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopyLimit(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumns */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopyLimit(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterCopyLimit(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterDeselect(
      key: afterDeselect,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterDeselect(
      key: afterDeselect,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterDestroy(
      key: afterDestroy,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterDestroy(
      key: afterDestroy,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDrawSelection(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ js.UndefOr[Double], 
            String | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDrawSelection(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterDrawSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideColumns(
      key: afterHideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideRows(
      key: afterHideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterHideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterInit(
      key: afterInit,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterInit(
      key: afterInit,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterListen(
      key: afterListen,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterListen(
      key: afterListen,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterLoadData(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterLoadData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterMomentumScroll(
      key: afterMomentumScroll,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterMomentumScroll(
      key: afterMomentumScroll,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterPluginsInitialized(
      key: afterPluginsInitialized,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterPluginsInitialized(
      key: afterPluginsInitialized,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterRedo(
      key: afterRedo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterRedo(
      key: afterRedo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedoStackChange(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRefreshDimensions(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRefreshDimensions(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCol(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCol(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRemoveRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterRender(
      key: afterRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterRender(
      key: afterRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRenderer(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRenderer(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterScrollHorizontally(
      key: afterScrollHorizontally,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterScrollHorizontally(
      key: afterScrollHorizontally,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterScrollVertically(
      key: afterScrollVertically,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterScrollVertically(
      key: afterScrollVertically,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelection(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelection(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionByProp(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionByProp(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEnd(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEnd(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEnd(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEnd(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEndByProp(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEndByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEndByProp(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterSelectionEndByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetAdded(key: afterSheetAdded, callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterTrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterTrimRow(
      key: afterTrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterTrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterTrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterUndo(
      key: afterUndo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterUndo(
      key: afterUndo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndoStackChange(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnhideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterUnlisten(
      key: afterUnlisten,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterUnlisten(
      key: afterUnlisten,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUntrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUntrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUntrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateData(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterValidate(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterValidate(
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
    ): Hooks = js.native
    @JSName("add")
    def add_afterValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewRender(key: afterViewRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Hooks = js.native
    @JSName("add")
    def add_afterViewRender(
      key: afterViewRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewRender(key: afterViewRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_afterViewRender(
      key: afterViewRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeAddChild(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeAddChild(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnCollapse(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnCollapse(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnExpand(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnExpand(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnSort(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCopy(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCopy(
      key: beforeCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateCol(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCut(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeCut(
      key: beforeCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingColumnHeader(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingColumnHeader(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingRowHeader(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeHighlightingRowHeader(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeInit(
      key: beforeInit,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeInit(
      key: beforeInit,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeKeyDown(
      key: beforeKeyDown,
      callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeKeyDown(
      key: beforeKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLoadData(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeLoadData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforePaste(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforePaste(
      key: beforePaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeRedo(
      key: beforeRedo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeRedo(
      key: beforeRedo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRefreshDimensions(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRefreshDimensions(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCol(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCol(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRemoveRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRender(key: beforeRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeRender(
      key: beforeRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRender(key: beforeRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeRender(
      key: beforeRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRenderer(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRenderer(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowMove(
      key: beforeRowMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowMove(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeTouchScroll(
      key: beforeTouchScroll,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeTouchScroll(
      key: beforeTouchScroll,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeTrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Hooks = js.native
    @JSName("add")
    def add_beforeUndo(
      key: beforeUndo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_beforeUndo(
      key: beforeUndo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideColumns(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideRows(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnhideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUntrimRow(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUntrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUpdateData(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeUpdateData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValidate(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValidate(
      key: beforeValidate,
      callback: js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValidate(
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
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_construct(
      key: construct,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_construct(
      key: construct,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: typings.handsontable.coreMod.default): Hooks = js.native
    @JSName("add")
    def add_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_init(
      key: init,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutoColumnSizeSeed(
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
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutoColumnSizeSeed(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutofillRange(
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
    ): Hooks = js.native
    @JSName("add")
    def add_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyColHeader(
      key: modifyColHeader,
      callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_modifyColHeader(
      key: modifyColHeader,
      callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyColumnHeaderHeight(
      key: modifyColumnHeaderHeight,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Hooks = js.native
    @JSName("add")
    def add_modifyColumnHeaderHeight(
      key: modifyColumnHeaderHeight,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyGetCellCoords(
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
    ): Hooks = js.native
    @JSName("add")
    def add_modifyGetCellCoords(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowData(
      key: modifyRowData,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowData(
      key: modifyRowData,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeader(
      key: modifyRowHeader,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeader(
      key: modifyRowHeader,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowSourceData(
      key: modifyRowSourceData,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_modifyRowSourceData(
      key: modifyRowSourceData,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Hooks = js.native
    @JSName("add")
    def add_persistentStateReset(
      key: persistentStateReset,
      callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Hooks = js.native
    @JSName("add")
    def add_persistentStateReset(
      key: persistentStateReset,
      callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]
    ): Hooks = js.native
    @JSName("add")
    def add_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Hooks = js.native
    
    def createEmptyBucket(): Bucket = js.native
    
    def deregister(key: String): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(context: typings.handsontable.coreMod.default): Unit = js.native
    
    def getBucket(): Bucket = js.native
    def getBucket(context: typings.handsontable.coreMod.default): Bucket = js.native
    
    def getRegistered(): js.Array[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any
      ] = js.native
    
    def has(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any): Boolean = js.native
    def has(
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any,
      context: typings.handsontable.coreMod.default
    ): Boolean = js.native
    
    def isDeprecated(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any): Boolean = js.native
    
    def isRegistered(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any): Boolean = js.native
    
    def once(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* fillData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterModifyTransformEnd,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterModifyTransformEnd,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterModifyTransformStart,
      callback: js.UndefOr[
          js.Function3[
            /* coords */ typings.handsontable.coordsMod.default, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: afterModifyTransformStart,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typings.handsontable.coordsMod.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeAutofillInsidePopulate,
      callback: js.UndefOr[
          js.Function4[
            /* index */ typings.handsontable.coordsMod.default, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[Any], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.coordsMod.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeAutofillInsidePopulate,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.coordsMod.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeAutofill,
      callback: js.UndefOr[
          js.Function4[
            /* selectionData */ js.Array[js.Array[CellValue]], 
            /* sourceRange */ default, 
            /* targetRange */ default, 
            /* direction */ up | down | left | right, 
            js.Array[js.Array[CellValue]] | Boolean | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeAutofill,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeCellAlignment,
      callback: js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[default], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeCellAlignment,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ]
    ): Unit = js.native
    def once(
      key: beforeDrawBorders,
      callback: js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
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
    def once(
      key: beforeDrawBorders,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
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
    def once(
      key: modifyData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
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
    def once(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
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
    def once(
      key: modifySourceData,
      callback: js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    def once(
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
    def once(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterAddChild(
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
    @JSName("once")
    def once_afterAddChild(
      key: afterAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterAddChild(
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
    @JSName("once")
    def once_afterAddChild(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterBeginEditing(
      key: afterBeginEditing,
      callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterCellMetaReset(
      key: afterCellMetaReset,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterCellMetaReset(
      key: afterCellMetaReset,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterChange(
      key: afterChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterChange(
      key: afterChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterChangesObserved(
      key: afterChangesObserved,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterChangesObserved(
      key: afterChangesObserved,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnCollapse(
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
    @JSName("once")
    def once_afterColumnCollapse(
      key: afterColumnCollapse,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnCollapse(
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
    @JSName("once")
    def once_afterColumnCollapse(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnExpand(
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
    @JSName("once")
    def once_afterColumnExpand(
      key: afterColumnExpand,
      callback: js.UndefOr[
          js.Function4[
            /* currentCollapsedColumns */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnExpand(
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
    @JSName("once")
    def once_afterColumnExpand(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnMove(
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
    @JSName("once")
    def once_afterColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnMove(
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
    @JSName("once")
    def once_afterColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnResize(
      key: afterColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnResize(
      key: afterColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnSort(
      key: afterColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterColumnSort(
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
    @JSName("once")
    def once_afterColumnSort(
      key: afterColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuDefaultOptions(
      key: afterContextMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuHide(
      key: afterContextMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterContextMenuShow(
      key: afterContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCopy(
      key: afterCopy,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCopy(
      key: afterCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCopyLimit(
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
    @JSName("once")
    def once_afterCopyLimit(
      key: afterCopyLimit,
      callback: js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumns */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCopyLimit(
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
    @JSName("once")
    def once_afterCopyLimit(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateCol(
      key: afterCreateCol,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateCol(
      key: afterCreateCol,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateRow(
      key: afterCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCreateRow(
      key: afterCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCut(
      key: afterCut,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterCut(
      key: afterCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterDeselect(
      key: afterDeselect,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterDeselect(
      key: afterDeselect,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterDestroy(
      key: afterDestroy,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterDestroy(
      key: afterDestroy,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterDetachChild(
      key: afterDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterDetachChild(
      key: afterDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterDocumentKeyDown(
      key: afterDocumentKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDrawSelection(
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
    @JSName("once")
    def once_afterDrawSelection(
      key: afterDrawSelection,
      callback: js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ js.UndefOr[Double], 
            String | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDrawSelection(
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
    @JSName("once")
    def once_afterDrawSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuDefaultOptions(
      key: afterDropdownMenuDefaultOptions,
      callback: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuHide(
      key: afterDropdownMenuHide,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterDropdownMenuShow(
      key: afterDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterFilter(
      key: afterFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterFilter(
      key: afterFilter,
      callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterFormulasValuesUpdate(
      key: afterFormulasValuesUpdate,
      callback: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetCellMeta(
      key: afterGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColHeader(
      key: afterGetColHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetColumnHeaderRenderers(
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
    @JSName("once")
    def once_afterGetColumnHeaderRenderers(
      key: afterGetColumnHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeader(
      key: afterGetRowHeader,
      callback: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterGetRowHeaderRenderers(
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
    @JSName("once")
    def once_afterGetRowHeaderRenderers(
      key: afterGetRowHeaderRenderers,
      callback: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterHideColumns(
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
    @JSName("once")
    def once_afterHideColumns(
      key: afterHideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterHideColumns(
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
    @JSName("once")
    def once_afterHideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterHideRows(
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
    @JSName("once")
    def once_afterHideRows(
      key: afterHideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterHideRows(
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
    @JSName("once")
    def once_afterHideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterInit(
      key: afterInit,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterInit(
      key: afterInit,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterLanguageChange(
      key: afterLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterListen(
      key: afterListen,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterListen(
      key: afterListen,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterLoadData(
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
    @JSName("once")
    def once_afterLoadData(
      key: afterLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterLoadData(
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
    @JSName("once")
    def once_afterLoadData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterMergeCells(
      key: afterMergeCells,
      callback: js.UndefOr[
          js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterMergeCells(
      key: afterMergeCells,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterMomentumScroll(
      key: afterMomentumScroll,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterMomentumScroll(
      key: afterMomentumScroll,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionAdded(
      key: afterNamedExpressionAdded,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.UndefOr[
          js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterNamedExpressionRemoved(
      key: afterNamedExpressionRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellContextMenu(
      key: afterOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerDblClick(
      key: afterOnCellCornerDblClick,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellCornerMouseDown(
      key: afterOnCellCornerMouseDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseDown(
      key: afterOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOut(
      key: afterOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseOver(
      key: afterOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterOnCellMouseUp(
      key: afterOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterPaste(
      key: afterPaste,
      callback: js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterPaste(
      key: afterPaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterPluginsInitialized(
      key: afterPluginsInitialized,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterPluginsInitialized(
      key: afterPluginsInitialized,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterRedo(
      key: afterRedo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterRedo(
      key: afterRedo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* undoneActionsBefore */ js.Array[Action], 
            /* undoneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRedoStackChange(
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
    @JSName("once")
    def once_afterRedoStackChange(
      key: afterRedoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRefreshDimensions(
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
    @JSName("once")
    def once_afterRefreshDimensions(
      key: afterRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRefreshDimensions(
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
    @JSName("once")
    def once_afterRefreshDimensions(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCellMeta(
      key: afterRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCol(
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
    @JSName("once")
    def once_afterRemoveCol(
      key: afterRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveCol(
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
    @JSName("once")
    def once_afterRemoveCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveRow(
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
    @JSName("once")
    def once_afterRemoveRow(
      key: afterRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRemoveRow(
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
    @JSName("once")
    def once_afterRemoveRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterRender(
      key: afterRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterRender(
      key: afterRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRenderer(
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
    @JSName("once")
    def once_afterRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRenderer(
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
    @JSName("once")
    def once_afterRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRowMove(
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
    @JSName("once")
    def once_afterRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRowMove(
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
    @JSName("once")
    def once_afterRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterRowResize(
      key: afterRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterRowResize(
      key: afterRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterScrollHorizontally(
      key: afterScrollHorizontally,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterScrollHorizontally(
      key: afterScrollHorizontally,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterScrollVertically(
      key: afterScrollVertically,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterScrollVertically(
      key: afterScrollVertically,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelection(
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
    @JSName("once")
    def once_afterSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelection(
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
    @JSName("once")
    def once_afterSelection(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionByProp(
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
    @JSName("once")
    def once_afterSelectionByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionByProp(
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
    @JSName("once")
    def once_afterSelectionByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionEnd(
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
    @JSName("once")
    def once_afterSelectionEnd(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionEnd(
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
    @JSName("once")
    def once_afterSelectionEnd(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionEndByProp(
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
    @JSName("once")
    def once_afterSelectionEndByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSelectionEndByProp(
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
    @JSName("once")
    def once_afterSelectionEndByProp(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetCellMeta(
      key: afterSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtCell(
      key: afterSetDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetDataAtRowProp(
      key: afterSetDataAtRowProp,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSetSourceDataAtCell(
      key: afterSetSourceDataAtCell,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetAdded(key: afterSheetAdded, callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetAdded(
      key: afterSheetAdded,
      callback: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.UndefOr[
          js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRemoved(
      key: afterSheetRemoved,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterSheetRenamed(
      key: afterSheetRenamed,
      callback: js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterTrimRow(
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
    @JSName("once")
    def once_afterTrimRow(
      key: afterTrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterTrimRow(
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
    @JSName("once")
    def once_afterTrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterUndo(
      key: afterUndo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterUndo(
      key: afterUndo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.UndefOr[
          js.Function2[
            /* doneActionsBefore */ js.Array[Action], 
            /* doneActionsAfter */ js.Array[Action], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUndoStackChange(
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
    @JSName("once")
    def once_afterUndoStackChange(
      key: afterUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnhideColumns(
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
    @JSName("once")
    def once_afterUnhideColumns(
      key: afterUnhideColumns,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnhideColumns(
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
    @JSName("once")
    def once_afterUnhideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnhideRows(
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
    @JSName("once")
    def once_afterUnhideRows(
      key: afterUnhideRows,
      callback: js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnhideRows(
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
    @JSName("once")
    def once_afterUnhideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_afterUnlisten(
      key: afterUnlisten,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterUnlisten(
      key: afterUnlisten,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterUnmergeCells(
      key: afterUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUntrimRow(
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
    @JSName("once")
    def once_afterUntrimRow(
      key: afterUntrimRow,
      callback: js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUntrimRow(
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
    @JSName("once")
    def once_afterUntrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUpdateData(
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
    @JSName("once")
    def once_afterUpdateData(
      key: afterUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUpdateData(
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
    @JSName("once")
    def once_afterUpdateData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterUpdateSettings(
      key: afterUpdateSettings,
      callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterValidate(
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
    @JSName("once")
    def once_afterValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterValidate(
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
    @JSName("once")
    def once_afterValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewRender(key: afterViewRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("once")
    def once_afterViewRender(
      key: afterViewRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewRender(key: afterViewRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("once")
    def once_afterViewRender(
      key: afterViewRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportColumnCalculatorOverride(
      key: afterViewportColumnCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_afterViewportRowCalculatorOverride(
      key: afterViewportRowCalculatorOverride,
      callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeAddChild(
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
    @JSName("once")
    def once_beforeAddChild(
      key: beforeAddChild,
      callback: js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ js.UndefOr[RowObject], 
            /* index */ js.UndefOr[Double], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeAddChild(
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
    @JSName("once")
    def once_beforeAddChild(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeChange(
      key: beforeChange,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeChange(
      key: beforeChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeChangeRender(
      key: beforeChangeRender,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnCollapse(
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
    @JSName("once")
    def once_beforeColumnCollapse(
      key: beforeColumnCollapse,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnCollapse(
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
    @JSName("once")
    def once_beforeColumnCollapse(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnExpand(
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
    @JSName("once")
    def once_beforeColumnExpand(
      key: beforeColumnExpand,
      callback: js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnExpand(
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
    @JSName("once")
    def once_beforeColumnExpand(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnMove(
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
    @JSName("once")
    def once_beforeColumnMove(
      key: beforeColumnMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedColumns */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnMove(
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
    @JSName("once")
    def once_beforeColumnMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnResize(
      key: beforeColumnResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeColumnSort(
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
    @JSName("once")
    def once_beforeColumnSort(
      key: beforeColumnSort,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuSetItems(
      key: beforeContextMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeContextMenuShow(
      key: beforeContextMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeCopy(
      key: beforeCopy,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCopy(
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
    @JSName("once")
    def once_beforeCopy(
      key: beforeCopy,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateCol(
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
    @JSName("once")
    def once_beforeCreateCol(
      key: beforeCreateCol,
      callback: js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateCol(
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
    @JSName("once")
    def once_beforeCreateCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeCreateRow(
      key: beforeCreateRow,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeCut(
      key: beforeCut,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeCut(
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
    @JSName("once")
    def once_beforeCut(
      key: beforeCut,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeDetachChild(
      key: beforeDetachChild,
      callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuSetItems(
      key: beforeDropdownMenuSetItems,
      callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeDropdownMenuShow(
      key: beforeDropdownMenuShow,
      callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeFilter(
      key: beforeFilter,
      callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeFilter(
      key: beforeFilter,
      callback: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeGetCellMeta(
      key: beforeGetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHideColumns(
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
    @JSName("once")
    def once_beforeHideColumns(
      key: beforeHideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHideColumns(
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
    @JSName("once")
    def once_beforeHideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHideRows(
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
    @JSName("once")
    def once_beforeHideRows(
      key: beforeHideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHideRows(
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
    @JSName("once")
    def once_beforeHideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHighlightingColumnHeader(
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
    @JSName("once")
    def once_beforeHighlightingColumnHeader(
      key: beforeHighlightingColumnHeader,
      callback: js.UndefOr[
          js.Function3[
            /* column */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightColumnHeaderMeta, 
            Double | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHighlightingColumnHeader(
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
    @JSName("once")
    def once_beforeHighlightingColumnHeader(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHighlightingRowHeader(
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
    @JSName("once")
    def once_beforeHighlightingRowHeader(
      key: beforeHighlightingRowHeader,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* headerLevel */ Double, 
            /* highlightMeta */ HookHighlightRowHeaderMeta, 
            Double | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeHighlightingRowHeader(
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
    @JSName("once")
    def once_beforeHighlightingRowHeader(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeInit(
      key: beforeInit,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeInit(
      key: beforeInit,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeInitWalkontable(
      key: beforeInitWalkontable,
      callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeKeyDown(
      key: beforeKeyDown,
      callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeKeyDown(
      key: beforeKeyDown,
      callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeLanguageChange(
      key: beforeLanguageChange,
      callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeLoadData(
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
    @JSName("once")
    def once_beforeLoadData(
      key: beforeLoadData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeLoadData(
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
    @JSName("once")
    def once_beforeLoadData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeMergeCells(
      key: beforeMergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellContextMenu(
      key: beforeOnCellContextMenu,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseDown(
      key: beforeOnCellMouseDown,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOut(
      key: beforeOnCellMouseOut,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseOver(
      key: beforeOnCellMouseOver,
      callback: js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.UndefOr[
          js.Function3[
            /* event */ MouseEvent, 
            /* coords */ typings.handsontable.coordsMod.default, 
            /* TD */ HTMLTableCellElement, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeOnCellMouseUp(
      key: beforeOnCellMouseUp,
      callback: js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforePaste(
      key: beforePaste,
      callback: js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforePaste(
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
    @JSName("once")
    def once_beforePaste(
      key: beforePaste,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeRedo(
      key: beforeRedo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeRedo(
      key: beforeRedo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRedoStackChange(
      key: beforeRedoStackChange,
      callback: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRefreshDimensions(
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
    @JSName("once")
    def once_beforeRefreshDimensions(
      key: beforeRefreshDimensions,
      callback: js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRefreshDimensions(
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
    @JSName("once")
    def once_beforeRefreshDimensions(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellClassNames(
      key: beforeRemoveCellClassNames,
      callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCellMeta(
      key: beforeRemoveCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCol(
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
    @JSName("once")
    def once_beforeRemoveCol(
      key: beforeRemoveCol,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveCol(
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
    @JSName("once")
    def once_beforeRemoveCol(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveRow(
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
    @JSName("once")
    def once_beforeRemoveRow(
      key: beforeRemoveRow,
      callback: js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRemoveRow(
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
    @JSName("once")
    def once_beforeRemoveRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRender(key: beforeRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeRender(
      key: beforeRender,
      callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRender(key: beforeRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeRender(
      key: beforeRender,
      callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRenderer(
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
    @JSName("once")
    def once_beforeRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRenderer(
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
    @JSName("once")
    def once_beforeRenderer(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowMove(
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
    @JSName("once")
    def once_beforeRowMove(
      key: beforeRowMove,
      callback: js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ js.UndefOr[Double], 
            /* movePossible */ Boolean, 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowMove(
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
    @JSName("once")
    def once_beforeRowMove(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowResize(
      key: beforeRowResize,
      callback: js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeRowResize(
      key: beforeRowResize,
      callback: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetCellMeta(
      key: beforeSetCellMeta,
      callback: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeEnd(
      key: beforeSetRangeEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStart(
      key: beforeSetRangeStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeSetRangeStartOnly(
      key: beforeSetRangeStartOnly,
      callback: js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeStretchingColumnWidth(
      key: beforeStretchingColumnWidth,
      callback: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeTouchScroll(
      key: beforeTouchScroll,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeTouchScroll(
      key: beforeTouchScroll,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeTrimRow(
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
    @JSName("once")
    def once_beforeTrimRow(
      key: beforeTrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeTrimRow(
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
    @JSName("once")
    def once_beforeTrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ Action, Unit]]): Unit = js.native
    @JSName("once")
    def once_beforeUndo(
      key: beforeUndo,
      callback: js.UndefOr[js.Function1[/* action */ Action, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Unit = js.native
    @JSName("once")
    def once_beforeUndo(
      key: beforeUndo,
      callback: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.UndefOr[
          js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeUndoStackChange(
      key: beforeUndoStackChange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnhideColumns(
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
    @JSName("once")
    def once_beforeUnhideColumns(
      key: beforeUnhideColumns,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnhideColumns(
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
    @JSName("once")
    def once_beforeUnhideColumns(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnhideRows(
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
    @JSName("once")
    def once_beforeUnhideRows(
      key: beforeUnhideRows,
      callback: js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnhideRows(
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
    @JSName("once")
    def once_beforeUnhideRows(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeUnmergeCells(
      key: beforeUnmergeCells,
      callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUntrimRow(
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
    @JSName("once")
    def once_beforeUntrimRow(
      key: beforeUntrimRow,
      callback: js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit | Boolean
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUntrimRow(
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
    @JSName("once")
    def once_beforeUntrimRow(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUpdateData(
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
    @JSName("once")
    def once_beforeUpdateData(
      key: beforeUpdateData,
      callback: js.UndefOr[
          js.Function3[
            /* sourceData */ js.Array[CellValue], 
            /* initialLoad */ Boolean, 
            /* source */ js.UndefOr[String], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeUpdateData(
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
    @JSName("once")
    def once_beforeUpdateData(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeValidate(
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
    @JSName("once")
    def once_beforeValidate(
      key: beforeValidate,
      callback: js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeValidate(
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
    @JSName("once")
    def once_beforeValidate(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeValueRender(
      key: beforeValueRender,
      callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeValueRender(
      key: beforeValueRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_beforeViewRender(
      key: beforeViewRender,
      callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_beforeViewRender(
      key: beforeViewRender,
      callback: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_construct(
      key: construct,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_construct(
      key: construct,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: typings.handsontable.coreMod.default): Unit = js.native
    @JSName("once")
    def once_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_init(
      key: init,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyAutoColumnSizeSeed(
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
    @JSName("once")
    def once_modifyAutoColumnSizeSeed(
      key: modifyAutoColumnSizeSeed,
      callback: js.UndefOr[
          js.Function3[
            /* seed */ String, 
            /* cellProperties */ CellProperties, 
            /* cellValue */ CellValue, 
            String | Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyAutoColumnSizeSeed(
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
    @JSName("once")
    def once_modifyAutoColumnSizeSeed(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyAutofillRange(
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
    @JSName("once")
    def once_modifyAutofillRange(
      key: modifyAutofillRange,
      callback: js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyColHeader(
      key: modifyColHeader,
      callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
    @JSName("once")
    def once_modifyColHeader(
      key: modifyColHeader,
      callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyColWidth(
      key: modifyColWidth,
      callback: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyColWidth(
      key: modifyColWidth,
      callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyColumnHeaderHeight(
      key: modifyColumnHeaderHeight,
      callback: js.UndefOr[js.Function0[Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
    @JSName("once")
    def once_modifyColumnHeaderHeight(
      key: modifyColumnHeaderHeight,
      callback: js.Array[js.UndefOr[js.Function0[Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyCopyableRange(
      key: modifyCopyableRange,
      callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyGetCellCoords(
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
    @JSName("once")
    def once_modifyGetCellCoords(
      key: modifyGetCellCoords,
      callback: js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyGetCellCoords(
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
    @JSName("once")
    def once_modifyGetCellCoords(
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
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyRowData(
      key: modifyRowData,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("once")
    def once_modifyRowData(
      key: modifyRowData,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyRowHeader(
      key: modifyRowHeader,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("once")
    def once_modifyRowHeader(
      key: modifyRowHeader,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeaderWidth(
      key: modifyRowHeaderWidth,
      callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowHeight(
      key: modifyRowHeight,
      callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
    @JSName("once")
    def once_modifyRowSourceData(
      key: modifyRowSourceData,
      callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
    @JSName("once")
    def once_modifyRowSourceData(
      key: modifyRowSourceData,
      callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformEnd(
      key: modifyTransformEnd,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_modifyTransformStart(
      key: modifyTransformStart,
      callback: js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateLoad(
      key: persistentStateLoad,
      callback: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
    @JSName("once")
    def once_persistentStateReset(
      key: persistentStateReset,
      callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
    @JSName("once")
    def once_persistentStateReset(
      key: persistentStateReset,
      callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateSave(
      key: persistentStateSave,
      callback: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]
    ): Unit = js.native
    @JSName("once")
    def once_persistentStateSave(
      key: persistentStateSave,
      callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]],
      context: typings.handsontable.coreMod.default
    ): Unit = js.native
    
    def register(key: String): Unit = js.native
    
    def remove(
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any,
      callback: js.Function0[Unit]
    ): Boolean = js.native
    def remove(
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any,
      callback: js.Function0[Unit],
      context: typings.handsontable.coreMod.default
    ): Boolean = js.native
    
    def run(
      context: typings.handsontable.coreMod.default,
      key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 180 */ Any,
      p1: js.UndefOr[Any],
      p2: js.UndefOr[Any],
      p3: js.UndefOr[Any],
      p4: js.UndefOr[Any],
      p5: js.UndefOr[Any],
      p6: js.UndefOr[Any]
    ): Any = js.native
  }
  
  /* Inlined {[ P in keyof handsontable.handsontable/pluginHooks.Events ]: std.Array<handsontable.handsontable/pluginHooks.Events[P]>} */
  trait Bucket extends StObject {
    
    var afterAddChild: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterAutofill: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* fillData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterBeginEditing: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]] = js.undefined
    
    var afterCellMetaReset: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterChange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterChangesObserved: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterColumnCollapse: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterColumnExpand: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterColumnMove: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterColumnResize: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterColumnSort: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterContextMenuDefaultOptions: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterContextMenuHide: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.undefined
    
    var afterContextMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.undefined
    
    var afterCopy: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterCopyLimit: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterCreateCol: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterCreateRow: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterCut: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterDeselect: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterDestroy: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterDetachChild: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
      ] = js.undefined
    
    var afterDocumentKeyDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]] = js.undefined
    
    var afterDrawSelection: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterDropdownMenuDefaultOptions: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterDropdownMenuHide: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.undefined
    
    var afterDropdownMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.undefined
    
    var afterFilter: js.UndefOr[
        js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
      ] = js.undefined
    
    var afterFormulasValuesUpdate: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]] = js.undefined
    
    var afterGetCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterGetColHeader: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
      ] = js.undefined
    
    var afterGetColumnHeaderRenderers: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterGetRowHeader: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
      ] = js.undefined
    
    var afterGetRowHeaderRenderers: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterHideColumns: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterHideRows: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterInit: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterLanguageChange: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]] = js.undefined
    
    var afterListen: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterLoadData: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterMergeCells: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterModifyTransformEnd: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterModifyTransformStart: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ typings.handsontable.coordsMod.default, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterMomentumScroll: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterNamedExpressionAdded: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterNamedExpressionRemoved: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterOnCellContextMenu: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterOnCellCornerDblClick: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]] = js.undefined
    
    var afterOnCellCornerMouseDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]] = js.undefined
    
    var afterOnCellMouseDown: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterOnCellMouseOut: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterOnCellMouseOver: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterOnCellMouseUp: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterPaste: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterPluginsInitialized: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterRedo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]] = js.undefined
    
    var afterRedoStackChange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* undoneActionsBefore */ js.Array[Action], 
              /* undoneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterRefreshDimensions: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* stateChanged */ Boolean, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterRemoveCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterRemoveCol: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterRemoveRow: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterRender: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]] = js.undefined
    
    var afterRenderer: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterRowMove: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterRowResize: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterScrollHorizontally: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterScrollVertically: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterSelection: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterSelectionByProp: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterSelectionEnd: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterSelectionEndByProp: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterSetCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
      ] = js.undefined
    
    var afterSetDataAtCell: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterSetDataAtRowProp: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterSetSourceDataAtCell: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterSheetAdded: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]] = js.undefined
    
    var afterSheetRemoved: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
          ]
        ]
      ] = js.undefined
    
    var afterSheetRenamed: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
        ]
      ] = js.undefined
    
    var afterTrimRow: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterUndo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]] = js.undefined
    
    var afterUndoStackChange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* doneActionsBefore */ js.Array[Action], 
              /* doneActionsAfter */ js.Array[Action], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterUnhideColumns: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterUnhideRows: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterUnlisten: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var afterUnmergeCells: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
      ] = js.undefined
    
    var afterUntrimRow: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterUpdateData: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var afterUpdateSettings: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]] = js.undefined
    
    var afterValidate: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var afterViewRender: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]] = js.undefined
    
    var afterViewportColumnCalculatorOverride: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]] = js.undefined
    
    var afterViewportRowCalculatorOverride: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]] = js.undefined
    
    var beforeAddChild: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ js.UndefOr[RowObject], 
              /* index */ js.UndefOr[Double], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeAutofill: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* selectionData */ js.Array[js.Array[CellValue]], 
              /* sourceRange */ default, 
              /* targetRange */ default, 
              /* direction */ up | down | left | right, 
              js.Array[js.Array[CellValue]] | Boolean | Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeAutofillInsidePopulate: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* index */ typings.handsontable.coordsMod.default, 
              /* direction */ up | down | left | right, 
              /* input */ js.Array[js.Array[CellValue]], 
              /* deltas */ js.Array[Any], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeCellAlignment: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* stateBefore */ NumberDictionary[js.Array[String]], 
              /* range */ js.Array[default], 
              /* type */ horizontal | vertical, 
              /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeChange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
      ] = js.undefined
    
    var beforeChangeRender: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeColumnCollapse: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* collapsePossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeColumnExpand: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentCollapsedColumn */ js.Array[Double], 
              /* destinationCollapsedColumns */ js.Array[Double], 
              /* expandPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeColumnMove: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeColumnResize: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
      ] = js.undefined
    
    var beforeColumnSort: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* currentSortConfig */ js.Array[Config], 
              /* destinationSortConfigs */ js.Array[Config], 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeContextMenuSetItems: js.UndefOr[
        js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
      ] = js.undefined
    
    var beforeContextMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.undefined
    
    var beforeCopy: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeCreateCol: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* index */ Double, 
              /* amount */ Double, 
              /* source */ js.UndefOr[ChangeSource], 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeCreateRow: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeCut: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeDetachChild: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
      ] = js.undefined
    
    var beforeDrawBorders: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* corners */ js.Array[Double], 
              /* borderClassName */ js.UndefOr[current | area | highlight], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeDropdownMenuSetItems: js.UndefOr[
        js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
      ] = js.undefined
    
    var beforeDropdownMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.undefined
    
    var beforeFilter: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
      ] = js.undefined
    
    var beforeGetCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeHideColumns: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeHideRows: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeHighlightingColumnHeader: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* column */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightColumnHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeHighlightingRowHeader: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* headerLevel */ Double, 
              /* highlightMeta */ HookHighlightRowHeaderMeta, 
              Double | Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeInit: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var beforeInitWalkontable: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]] = js.undefined
    
    var beforeKeyDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]] = js.undefined
    
    var beforeLanguageChange: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]] = js.undefined
    
    var beforeLoadData: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeMergeCells: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
      ] = js.undefined
    
    var beforeOnCellContextMenu: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeOnCellMouseDown: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeOnCellMouseOut: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeOnCellMouseOver: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              /* controller */ SelectionController, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeOnCellMouseUp: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* event */ MouseEvent, 
              /* coords */ typings.handsontable.coordsMod.default, 
              /* TD */ HTMLTableCellElement, 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforePaste: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* data */ js.Array[js.Array[CellValue]], 
              /* coords */ js.Array[RangeType], 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeRedo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]] = js.undefined
    
    var beforeRedoStackChange: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]] = js.undefined
    
    var beforeRefreshDimensions: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* previousDimensions */ js.Object, 
              /* currentDimensions */ js.Object, 
              /* actionPossible */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeRemoveCellClassNames: js.UndefOr[js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]] = js.undefined
    
    var beforeRemoveCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeRemoveCol: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeRemoveRow: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeRender: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]] = js.undefined
    
    var beforeRenderer: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeRowMove: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeRowResize: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeSetCellMeta: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeSetRangeEnd: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
      ] = js.undefined
    
    var beforeSetRangeStart: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
      ] = js.undefined
    
    var beforeSetRangeStartOnly: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
        ]
      ] = js.undefined
    
    var beforeStretchingColumnWidth: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
      ] = js.undefined
    
    var beforeTouchScroll: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var beforeTrimRow: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeUndo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]] = js.undefined
    
    var beforeUndoStackChange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
          ]
        ]
      ] = js.undefined
    
    var beforeUnhideColumns: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeUnhideRows: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeUnmergeCells: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]
      ] = js.undefined
    
    var beforeUntrimRow: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit | Boolean
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeUpdateData: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* sourceData */ js.Array[CellValue], 
              /* initialLoad */ Boolean, 
              /* source */ js.UndefOr[String], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var beforeValidate: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var beforeValueRender: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
      ] = js.undefined
    
    var beforeViewRender: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
      ] = js.undefined
    
    var construct: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var init: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var modifyAutoColumnSizeSeed: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* seed */ String, 
              /* cellProperties */ CellProperties, 
              /* cellValue */ CellValue, 
              String | Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var modifyAutofillRange: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function2[
              /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
              Unit
            ]
          ]
        ]
      ] = js.undefined
    
    var modifyColHeader: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]] = js.undefined
    
    var modifyColWidth: js.UndefOr[
        js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]
      ] = js.undefined
    
    var modifyColumnHeaderHeight: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.undefined
    
    var modifyCopyableRange: js.UndefOr[
        js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
      ] = js.undefined
    
    var modifyData: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var modifyGetCellCoords: js.UndefOr[
        js.Array[
          js.UndefOr[
            js.Function3[
              /* row */ Double, 
              /* column */ Double, 
              /* topmost */ Boolean, 
              Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
            ]
          ]
        ]
      ] = js.undefined
    
    var modifyRowData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.undefined
    
    var modifyRowHeader: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.undefined
    
    var modifyRowHeaderWidth: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]] = js.undefined
    
    var modifyRowHeight: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]] = js.undefined
    
    var modifyRowSourceData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.undefined
    
    var modifySourceData: js.UndefOr[
        js.Array[
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
      ] = js.undefined
    
    var modifyTransformEnd: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
      ] = js.undefined
    
    var modifyTransformStart: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
        ]
      ] = js.undefined
    
    var persistentStateLoad: js.UndefOr[
        js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
      ] = js.undefined
    
    var persistentStateReset: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]] = js.undefined
    
    var persistentStateSave: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]] = js.undefined
  }
  object Bucket {
    
    inline def apply(): Bucket = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bucket]
    }
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setAfterAddChild(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* parent */ RowObject, 
                  /* element */ js.UndefOr[RowObject], 
                  /* index */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterAddChild", value.asInstanceOf[js.Any])
      
      inline def setAfterAddChildUndefined: Self = StObject.set(x, "afterAddChild", js.undefined)
      
      inline def setAfterAddChildVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* parent */ RowObject, 
                /* element */ js.UndefOr[RowObject], 
                /* index */ js.UndefOr[Double], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterAddChild", js.Array(value*))
      
      inline def setAfterAutofill(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* fillData */ js.Array[js.Array[CellValue]], 
                  /* sourceRange */ default, 
                  /* targetRange */ default, 
                  /* direction */ up | down | left | right, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterAutofill", value.asInstanceOf[js.Any])
      
      inline def setAfterAutofillUndefined: Self = StObject.set(x, "afterAutofill", js.undefined)
      
      inline def setAfterAutofillVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* fillData */ js.Array[js.Array[CellValue]], 
                /* sourceRange */ default, 
                /* targetRange */ default, 
                /* direction */ up | down | left | right, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterAutofill", js.Array(value*))
      
      inline def setAfterBeginEditing(value: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]): Self = StObject.set(x, "afterBeginEditing", value.asInstanceOf[js.Any])
      
      inline def setAfterBeginEditingUndefined: Self = StObject.set(x, "afterBeginEditing", js.undefined)
      
      inline def setAfterBeginEditingVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]])*): Self = StObject.set(x, "afterBeginEditing", js.Array(value*))
      
      inline def setAfterCellMetaReset(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterCellMetaReset", value.asInstanceOf[js.Any])
      
      inline def setAfterCellMetaResetUndefined: Self = StObject.set(x, "afterCellMetaReset", js.undefined)
      
      inline def setAfterCellMetaResetVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterCellMetaReset", js.Array(value*))
      
      inline def setAfterChange(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterChange", value.asInstanceOf[js.Any])
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setAfterChangeVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
            ])*
      ): Self = StObject.set(x, "afterChange", js.Array(value*))
      
      inline def setAfterChangesObserved(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterChangesObserved", value.asInstanceOf[js.Any])
      
      inline def setAfterChangesObservedUndefined: Self = StObject.set(x, "afterChangesObserved", js.undefined)
      
      inline def setAfterChangesObservedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterChangesObserved", js.Array(value*))
      
      inline def setAfterColumnCollapse(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterColumnCollapse", value.asInstanceOf[js.Any])
      
      inline def setAfterColumnCollapseUndefined: Self = StObject.set(x, "afterColumnCollapse", js.undefined)
      
      inline def setAfterColumnCollapseVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentCollapsedColumns */ js.Array[Double], 
                /* destinationCollapsedColumns */ js.Array[Double], 
                /* collapsePossible */ Boolean, 
                /* successfullyCollapsed */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterColumnCollapse", js.Array(value*))
      
      inline def setAfterColumnExpand(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterColumnExpand", value.asInstanceOf[js.Any])
      
      inline def setAfterColumnExpandUndefined: Self = StObject.set(x, "afterColumnExpand", js.undefined)
      
      inline def setAfterColumnExpandVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentCollapsedColumns */ js.Array[Double], 
                /* destinationCollapsedColumns */ js.Array[Double], 
                /* expandPossible */ Boolean, 
                /* successfullyExpanded */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterColumnExpand", js.Array(value*))
      
      inline def setAfterColumnMove(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterColumnMove", value.asInstanceOf[js.Any])
      
      inline def setAfterColumnMoveUndefined: Self = StObject.set(x, "afterColumnMove", js.undefined)
      
      inline def setAfterColumnMoveVarargs(
        value: (js.UndefOr[
              js.Function5[
                /* movedColumns */ js.Array[Double], 
                /* finalIndex */ Double, 
                /* dropIndex */ js.UndefOr[Double], 
                /* movePossible */ Boolean, 
                /* orderChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterColumnMove", js.Array(value*))
      
      inline def setAfterColumnResize(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterColumnResize", value.asInstanceOf[js.Any])
      
      inline def setAfterColumnResizeUndefined: Self = StObject.set(x, "afterColumnResize", js.undefined)
      
      inline def setAfterColumnResizeVarargs(
        value: (js.UndefOr[
              js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
            ])*
      ): Self = StObject.set(x, "afterColumnResize", js.Array(value*))
      
      inline def setAfterColumnSort(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* currentSortConfig */ js.Array[Config], 
                  /* destinationSortConfigs */ js.Array[Config], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterColumnSort", value.asInstanceOf[js.Any])
      
      inline def setAfterColumnSortUndefined: Self = StObject.set(x, "afterColumnSort", js.undefined)
      
      inline def setAfterColumnSortVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* currentSortConfig */ js.Array[Config], 
                /* destinationSortConfigs */ js.Array[Config], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterColumnSort", js.Array(value*))
      
      inline def setAfterContextMenuDefaultOptions(
        value: js.Array[
              js.UndefOr[
                js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterContextMenuDefaultOptions", value.asInstanceOf[js.Any])
      
      inline def setAfterContextMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterContextMenuDefaultOptions", js.undefined)
      
      inline def setAfterContextMenuDefaultOptionsVarargs(
        value: (js.UndefOr[
              js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
            ])*
      ): Self = StObject.set(x, "afterContextMenuDefaultOptions", js.Array(value*))
      
      inline def setAfterContextMenuHide(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "afterContextMenuHide", value.asInstanceOf[js.Any])
      
      inline def setAfterContextMenuHideUndefined: Self = StObject.set(x, "afterContextMenuHide", js.undefined)
      
      inline def setAfterContextMenuHideVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "afterContextMenuHide", js.Array(value*))
      
      inline def setAfterContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "afterContextMenuShow", value.asInstanceOf[js.Any])
      
      inline def setAfterContextMenuShowUndefined: Self = StObject.set(x, "afterContextMenuShow", js.undefined)
      
      inline def setAfterContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "afterContextMenuShow", js.Array(value*))
      
      inline def setAfterCopy(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterCopy", value.asInstanceOf[js.Any])
      
      inline def setAfterCopyLimit(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterCopyLimit", value.asInstanceOf[js.Any])
      
      inline def setAfterCopyLimitUndefined: Self = StObject.set(x, "afterCopyLimit", js.undefined)
      
      inline def setAfterCopyLimitVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* selectedRows */ Double, 
                /* selectedColumns */ Double, 
                /* copyRowsLimit */ Double, 
                /* copyColumnsLimit */ Double, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterCopyLimit", js.Array(value*))
      
      inline def setAfterCopyUndefined: Self = StObject.set(x, "afterCopy", js.undefined)
      
      inline def setAfterCopyVarargs(
        value: (js.UndefOr[
              js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
            ])*
      ): Self = StObject.set(x, "afterCopy", js.Array(value*))
      
      inline def setAfterCreateCol(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterCreateCol", value.asInstanceOf[js.Any])
      
      inline def setAfterCreateColUndefined: Self = StObject.set(x, "afterCreateCol", js.undefined)
      
      inline def setAfterCreateColVarargs(
        value: (js.UndefOr[
              js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "afterCreateCol", js.Array(value*))
      
      inline def setAfterCreateRow(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterCreateRow", value.asInstanceOf[js.Any])
      
      inline def setAfterCreateRowUndefined: Self = StObject.set(x, "afterCreateRow", js.undefined)
      
      inline def setAfterCreateRowVarargs(
        value: (js.UndefOr[
              js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "afterCreateRow", js.Array(value*))
      
      inline def setAfterCut(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterCut", value.asInstanceOf[js.Any])
      
      inline def setAfterCutUndefined: Self = StObject.set(x, "afterCut", js.undefined)
      
      inline def setAfterCutVarargs(
        value: (js.UndefOr[
              js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
            ])*
      ): Self = StObject.set(x, "afterCut", js.Array(value*))
      
      inline def setAfterDeselect(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterDeselect", value.asInstanceOf[js.Any])
      
      inline def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
      
      inline def setAfterDeselectVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterDeselect", js.Array(value*))
      
      inline def setAfterDestroy(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
      
      inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
      
      inline def setAfterDestroyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterDestroy", js.Array(value*))
      
      inline def setAfterDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = StObject.set(x, "afterDetachChild", value.asInstanceOf[js.Any])
      
      inline def setAfterDetachChildUndefined: Self = StObject.set(x, "afterDetachChild", js.undefined)
      
      inline def setAfterDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = StObject.set(x, "afterDetachChild", js.Array(value*))
      
      inline def setAfterDocumentKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = StObject.set(x, "afterDocumentKeyDown", value.asInstanceOf[js.Any])
      
      inline def setAfterDocumentKeyDownUndefined: Self = StObject.set(x, "afterDocumentKeyDown", js.undefined)
      
      inline def setAfterDocumentKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = StObject.set(x, "afterDocumentKeyDown", js.Array(value*))
      
      inline def setAfterDrawSelection(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterDrawSelection", value.asInstanceOf[js.Any])
      
      inline def setAfterDrawSelectionUndefined: Self = StObject.set(x, "afterDrawSelection", js.undefined)
      
      inline def setAfterDrawSelectionVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentRow */ Double, 
                /* currentColumn */ Double, 
                /* cornersOfSelection */ js.Array[Double], 
                /* layerLevel */ js.UndefOr[Double], 
                String | Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterDrawSelection", js.Array(value*))
      
      inline def setAfterDropdownMenuDefaultOptions(
        value: js.Array[
              js.UndefOr[
                js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterDropdownMenuDefaultOptions", value.asInstanceOf[js.Any])
      
      inline def setAfterDropdownMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.undefined)
      
      inline def setAfterDropdownMenuDefaultOptionsVarargs(
        value: (js.UndefOr[
              js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
            ])*
      ): Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.Array(value*))
      
      inline def setAfterDropdownMenuHide(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "afterDropdownMenuHide", value.asInstanceOf[js.Any])
      
      inline def setAfterDropdownMenuHideUndefined: Self = StObject.set(x, "afterDropdownMenuHide", js.undefined)
      
      inline def setAfterDropdownMenuHideVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "afterDropdownMenuHide", js.Array(value*))
      
      inline def setAfterDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "afterDropdownMenuShow", value.asInstanceOf[js.Any])
      
      inline def setAfterDropdownMenuShowUndefined: Self = StObject.set(x, "afterDropdownMenuShow", js.undefined)
      
      inline def setAfterDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "afterDropdownMenuShow", js.Array(value*))
      
      inline def setAfterFilter(value: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]): Self = StObject.set(x, "afterFilter", value.asInstanceOf[js.Any])
      
      inline def setAfterFilterUndefined: Self = StObject.set(x, "afterFilter", js.undefined)
      
      inline def setAfterFilterVarargs(value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]])*): Self = StObject.set(x, "afterFilter", js.Array(value*))
      
      inline def setAfterFormulasValuesUpdate(value: js.Array[js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]]]): Self = StObject.set(x, "afterFormulasValuesUpdate", value.asInstanceOf[js.Any])
      
      inline def setAfterFormulasValuesUpdateUndefined: Self = StObject.set(x, "afterFormulasValuesUpdate", js.undefined)
      
      inline def setAfterFormulasValuesUpdateVarargs(value: (js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]])*): Self = StObject.set(x, "afterFormulasValuesUpdate", js.Array(value*))
      
      inline def setAfterGetCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterGetCellMeta", value.asInstanceOf[js.Any])
      
      inline def setAfterGetCellMetaUndefined: Self = StObject.set(x, "afterGetCellMeta", js.undefined)
      
      inline def setAfterGetCellMetaVarargs(
        value: (js.UndefOr[
              js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
            ])*
      ): Self = StObject.set(x, "afterGetCellMeta", js.Array(value*))
      
      inline def setAfterGetColHeader(
        value: js.Array[
              js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
            ]
      ): Self = StObject.set(x, "afterGetColHeader", value.asInstanceOf[js.Any])
      
      inline def setAfterGetColHeaderUndefined: Self = StObject.set(x, "afterGetColHeader", js.undefined)
      
      inline def setAfterGetColHeaderVarargs(value: (js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = StObject.set(x, "afterGetColHeader", js.Array(value*))
      
      inline def setAfterGetColumnHeaderRenderers(
        value: js.Array[
              js.UndefOr[
                js.Function1[
                  /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterGetColumnHeaderRenderers", value.asInstanceOf[js.Any])
      
      inline def setAfterGetColumnHeaderRenderersUndefined: Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.undefined)
      
      inline def setAfterGetColumnHeaderRenderersVarargs(
        value: (js.UndefOr[
              js.Function1[
                /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.Array(value*))
      
      inline def setAfterGetRowHeader(
        value: js.Array[
              js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
            ]
      ): Self = StObject.set(x, "afterGetRowHeader", value.asInstanceOf[js.Any])
      
      inline def setAfterGetRowHeaderRenderers(
        value: js.Array[
              js.UndefOr[
                js.Function1[
                  /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterGetRowHeaderRenderers", value.asInstanceOf[js.Any])
      
      inline def setAfterGetRowHeaderRenderersUndefined: Self = StObject.set(x, "afterGetRowHeaderRenderers", js.undefined)
      
      inline def setAfterGetRowHeaderRenderersVarargs(
        value: (js.UndefOr[
              js.Function1[
                /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterGetRowHeaderRenderers", js.Array(value*))
      
      inline def setAfterGetRowHeaderUndefined: Self = StObject.set(x, "afterGetRowHeader", js.undefined)
      
      inline def setAfterGetRowHeaderVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = StObject.set(x, "afterGetRowHeader", js.Array(value*))
      
      inline def setAfterHideColumns(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterHideColumns", value.asInstanceOf[js.Any])
      
      inline def setAfterHideColumnsUndefined: Self = StObject.set(x, "afterHideColumns", js.undefined)
      
      inline def setAfterHideColumnsVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterHideColumns", js.Array(value*))
      
      inline def setAfterHideRows(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterHideRows", value.asInstanceOf[js.Any])
      
      inline def setAfterHideRowsUndefined: Self = StObject.set(x, "afterHideRows", js.undefined)
      
      inline def setAfterHideRowsVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterHideRows", js.Array(value*))
      
      inline def setAfterInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterInit", value.asInstanceOf[js.Any])
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterInit", js.Array(value*))
      
      inline def setAfterLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = StObject.set(x, "afterLanguageChange", value.asInstanceOf[js.Any])
      
      inline def setAfterLanguageChangeUndefined: Self = StObject.set(x, "afterLanguageChange", js.undefined)
      
      inline def setAfterLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = StObject.set(x, "afterLanguageChange", js.Array(value*))
      
      inline def setAfterListen(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterListen", value.asInstanceOf[js.Any])
      
      inline def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      inline def setAfterListenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterListen", js.Array(value*))
      
      inline def setAfterLoadData(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* sourceData */ js.Array[CellValue], 
                  /* initialLoad */ Boolean, 
                  /* source */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterLoadData", value.asInstanceOf[js.Any])
      
      inline def setAfterLoadDataUndefined: Self = StObject.set(x, "afterLoadData", js.undefined)
      
      inline def setAfterLoadDataVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* sourceData */ js.Array[CellValue], 
                /* initialLoad */ Boolean, 
                /* source */ js.UndefOr[String], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterLoadData", js.Array(value*))
      
      inline def setAfterMergeCells(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterMergeCells", value.asInstanceOf[js.Any])
      
      inline def setAfterMergeCellsUndefined: Self = StObject.set(x, "afterMergeCells", js.undefined)
      
      inline def setAfterMergeCellsVarargs(
        value: (js.UndefOr[
              js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
            ])*
      ): Self = StObject.set(x, "afterMergeCells", js.Array(value*))
      
      inline def setAfterModifyTransformEnd(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* rowTransformDir */ `-1` | `0`, 
                  /* colTransformDir */ `-1` | `0`, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterModifyTransformEnd", value.asInstanceOf[js.Any])
      
      inline def setAfterModifyTransformEndUndefined: Self = StObject.set(x, "afterModifyTransformEnd", js.undefined)
      
      inline def setAfterModifyTransformEndVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* coords */ typings.handsontable.coordsMod.default, 
                /* rowTransformDir */ `-1` | `0`, 
                /* colTransformDir */ `-1` | `0`, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterModifyTransformEnd", js.Array(value*))
      
      inline def setAfterModifyTransformStart(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* rowTransformDir */ `-1` | `0`, 
                  /* colTransformDir */ `-1` | `0`, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterModifyTransformStart", value.asInstanceOf[js.Any])
      
      inline def setAfterModifyTransformStartUndefined: Self = StObject.set(x, "afterModifyTransformStart", js.undefined)
      
      inline def setAfterModifyTransformStartVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* coords */ typings.handsontable.coordsMod.default, 
                /* rowTransformDir */ `-1` | `0`, 
                /* colTransformDir */ `-1` | `0`, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterModifyTransformStart", js.Array(value*))
      
      inline def setAfterMomentumScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterMomentumScroll", value.asInstanceOf[js.Any])
      
      inline def setAfterMomentumScrollUndefined: Self = StObject.set(x, "afterMomentumScroll", js.undefined)
      
      inline def setAfterMomentumScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterMomentumScroll", js.Array(value*))
      
      inline def setAfterNamedExpressionAdded(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterNamedExpressionAdded", value.asInstanceOf[js.Any])
      
      inline def setAfterNamedExpressionAddedUndefined: Self = StObject.set(x, "afterNamedExpressionAdded", js.undefined)
      
      inline def setAfterNamedExpressionAddedVarargs(
        value: (js.UndefOr[
              js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
            ])*
      ): Self = StObject.set(x, "afterNamedExpressionAdded", js.Array(value*))
      
      inline def setAfterNamedExpressionRemoved(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterNamedExpressionRemoved", value.asInstanceOf[js.Any])
      
      inline def setAfterNamedExpressionRemovedUndefined: Self = StObject.set(x, "afterNamedExpressionRemoved", js.undefined)
      
      inline def setAfterNamedExpressionRemovedVarargs(
        value: (js.UndefOr[
              js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
            ])*
      ): Self = StObject.set(x, "afterNamedExpressionRemoved", js.Array(value*))
      
      inline def setAfterOnCellContextMenu(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterOnCellContextMenu", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellContextMenuUndefined: Self = StObject.set(x, "afterOnCellContextMenu", js.undefined)
      
      inline def setAfterOnCellContextMenuVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterOnCellContextMenu", js.Array(value*))
      
      inline def setAfterOnCellCornerDblClick(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = StObject.set(x, "afterOnCellCornerDblClick", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellCornerDblClickUndefined: Self = StObject.set(x, "afterOnCellCornerDblClick", js.undefined)
      
      inline def setAfterOnCellCornerDblClickVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = StObject.set(x, "afterOnCellCornerDblClick", js.Array(value*))
      
      inline def setAfterOnCellCornerMouseDown(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = StObject.set(x, "afterOnCellCornerMouseDown", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellCornerMouseDownUndefined: Self = StObject.set(x, "afterOnCellCornerMouseDown", js.undefined)
      
      inline def setAfterOnCellCornerMouseDownVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = StObject.set(x, "afterOnCellCornerMouseDown", js.Array(value*))
      
      inline def setAfterOnCellMouseDown(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterOnCellMouseDown", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellMouseDownUndefined: Self = StObject.set(x, "afterOnCellMouseDown", js.undefined)
      
      inline def setAfterOnCellMouseDownVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterOnCellMouseDown", js.Array(value*))
      
      inline def setAfterOnCellMouseOut(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterOnCellMouseOut", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellMouseOutUndefined: Self = StObject.set(x, "afterOnCellMouseOut", js.undefined)
      
      inline def setAfterOnCellMouseOutVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterOnCellMouseOut", js.Array(value*))
      
      inline def setAfterOnCellMouseOver(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterOnCellMouseOver", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellMouseOverUndefined: Self = StObject.set(x, "afterOnCellMouseOver", js.undefined)
      
      inline def setAfterOnCellMouseOverVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterOnCellMouseOver", js.Array(value*))
      
      inline def setAfterOnCellMouseUp(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterOnCellMouseUp", value.asInstanceOf[js.Any])
      
      inline def setAfterOnCellMouseUpUndefined: Self = StObject.set(x, "afterOnCellMouseUp", js.undefined)
      
      inline def setAfterOnCellMouseUpVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterOnCellMouseUp", js.Array(value*))
      
      inline def setAfterPaste(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterPaste", value.asInstanceOf[js.Any])
      
      inline def setAfterPasteUndefined: Self = StObject.set(x, "afterPaste", js.undefined)
      
      inline def setAfterPasteVarargs(
        value: (js.UndefOr[
              js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
            ])*
      ): Self = StObject.set(x, "afterPaste", js.Array(value*))
      
      inline def setAfterPluginsInitialized(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterPluginsInitialized", value.asInstanceOf[js.Any])
      
      inline def setAfterPluginsInitializedUndefined: Self = StObject.set(x, "afterPluginsInitialized", js.undefined)
      
      inline def setAfterPluginsInitializedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterPluginsInitialized", js.Array(value*))
      
      inline def setAfterRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Self = StObject.set(x, "afterRedo", value.asInstanceOf[js.Any])
      
      inline def setAfterRedoStackChange(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* undoneActionsBefore */ js.Array[Action], 
                  /* undoneActionsAfter */ js.Array[Action], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterRedoStackChange", value.asInstanceOf[js.Any])
      
      inline def setAfterRedoStackChangeUndefined: Self = StObject.set(x, "afterRedoStackChange", js.undefined)
      
      inline def setAfterRedoStackChangeVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* undoneActionsBefore */ js.Array[Action], 
                /* undoneActionsAfter */ js.Array[Action], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRedoStackChange", js.Array(value*))
      
      inline def setAfterRedoUndefined: Self = StObject.set(x, "afterRedo", js.undefined)
      
      inline def setAfterRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ Action, Unit]])*): Self = StObject.set(x, "afterRedo", js.Array(value*))
      
      inline def setAfterRefreshDimensions(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* previousDimensions */ js.Object, 
                  /* currentDimensions */ js.Object, 
                  /* stateChanged */ Boolean, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterRefreshDimensions", value.asInstanceOf[js.Any])
      
      inline def setAfterRefreshDimensionsUndefined: Self = StObject.set(x, "afterRefreshDimensions", js.undefined)
      
      inline def setAfterRefreshDimensionsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* previousDimensions */ js.Object, 
                /* currentDimensions */ js.Object, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRefreshDimensions", js.Array(value*))
      
      inline def setAfterRemoveCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterRemoveCellMeta", value.asInstanceOf[js.Any])
      
      inline def setAfterRemoveCellMetaUndefined: Self = StObject.set(x, "afterRemoveCellMeta", js.undefined)
      
      inline def setAfterRemoveCellMetaVarargs(
        value: (js.UndefOr[
              js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
            ])*
      ): Self = StObject.set(x, "afterRemoveCellMeta", js.Array(value*))
      
      inline def setAfterRemoveCol(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterRemoveCol", value.asInstanceOf[js.Any])
      
      inline def setAfterRemoveColUndefined: Self = StObject.set(x, "afterRemoveCol", js.undefined)
      
      inline def setAfterRemoveColVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* index */ Double, 
                /* amount */ Double, 
                /* physicalColumns */ js.Array[Double], 
                /* source */ js.UndefOr[ChangeSource], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRemoveCol", js.Array(value*))
      
      inline def setAfterRemoveRow(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterRemoveRow", value.asInstanceOf[js.Any])
      
      inline def setAfterRemoveRowUndefined: Self = StObject.set(x, "afterRemoveRow", js.undefined)
      
      inline def setAfterRemoveRowVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* index */ Double, 
                /* amount */ Double, 
                /* physicalRows */ js.Array[Double], 
                /* source */ js.UndefOr[ChangeSource], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRemoveRow", js.Array(value*))
      
      inline def setAfterRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = StObject.set(x, "afterRender", value.asInstanceOf[js.Any])
      
      inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
      
      inline def setAfterRenderVarargs(value: (js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]])*): Self = StObject.set(x, "afterRender", js.Array(value*))
      
      inline def setAfterRenderer(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterRenderer", value.asInstanceOf[js.Any])
      
      inline def setAfterRendererUndefined: Self = StObject.set(x, "afterRenderer", js.undefined)
      
      inline def setAfterRendererVarargs(
        value: (js.UndefOr[
              js.Function6[
                /* TD */ HTMLTableCellElement, 
                /* row */ Double, 
                /* column */ Double, 
                /* prop */ String | Double, 
                /* value */ String, 
                /* cellProperties */ CellProperties, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRenderer", js.Array(value*))
      
      inline def setAfterRowMove(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterRowMove", value.asInstanceOf[js.Any])
      
      inline def setAfterRowMoveUndefined: Self = StObject.set(x, "afterRowMove", js.undefined)
      
      inline def setAfterRowMoveVarargs(
        value: (js.UndefOr[
              js.Function5[
                /* movedRows */ js.Array[Double], 
                /* finalIndex */ Double, 
                /* dropIndex */ js.UndefOr[Double], 
                /* movePossible */ Boolean, 
                /* orderChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterRowMove", js.Array(value*))
      
      inline def setAfterRowResize(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterRowResize", value.asInstanceOf[js.Any])
      
      inline def setAfterRowResizeUndefined: Self = StObject.set(x, "afterRowResize", js.undefined)
      
      inline def setAfterRowResizeVarargs(
        value: (js.UndefOr[
              js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
            ])*
      ): Self = StObject.set(x, "afterRowResize", js.Array(value*))
      
      inline def setAfterScrollHorizontally(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterScrollHorizontally", value.asInstanceOf[js.Any])
      
      inline def setAfterScrollHorizontallyUndefined: Self = StObject.set(x, "afterScrollHorizontally", js.undefined)
      
      inline def setAfterScrollHorizontallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterScrollHorizontally", js.Array(value*))
      
      inline def setAfterScrollVertically(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterScrollVertically", value.asInstanceOf[js.Any])
      
      inline def setAfterScrollVerticallyUndefined: Self = StObject.set(x, "afterScrollVertically", js.undefined)
      
      inline def setAfterScrollVerticallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterScrollVertically", js.Array(value*))
      
      inline def setAfterSelection(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterSelection", value.asInstanceOf[js.Any])
      
      inline def setAfterSelectionByProp(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterSelectionByProp", value.asInstanceOf[js.Any])
      
      inline def setAfterSelectionByPropUndefined: Self = StObject.set(x, "afterSelectionByProp", js.undefined)
      
      inline def setAfterSelectionByPropVarargs(
        value: (js.UndefOr[
              js.Function6[
                /* row */ Double, 
                /* prop */ String, 
                /* row2 */ Double, 
                /* prop2 */ String, 
                /* preventScrolling */ Value, 
                /* selectionLayerLevel */ Double, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterSelectionByProp", js.Array(value*))
      
      inline def setAfterSelectionEnd(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterSelectionEnd", value.asInstanceOf[js.Any])
      
      inline def setAfterSelectionEndByProp(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterSelectionEndByProp", value.asInstanceOf[js.Any])
      
      inline def setAfterSelectionEndByPropUndefined: Self = StObject.set(x, "afterSelectionEndByProp", js.undefined)
      
      inline def setAfterSelectionEndByPropVarargs(
        value: (js.UndefOr[
              js.Function5[
                /* row */ Double, 
                /* prop */ String, 
                /* row2 */ Double, 
                /* prop2 */ String, 
                /* selectionLayerLevel */ Double, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterSelectionEndByProp", js.Array(value*))
      
      inline def setAfterSelectionEndUndefined: Self = StObject.set(x, "afterSelectionEnd", js.undefined)
      
      inline def setAfterSelectionEndVarargs(
        value: (js.UndefOr[
              js.Function5[
                /* row */ Double, 
                /* column */ Double, 
                /* row2 */ Double, 
                /* column2 */ Double, 
                /* selectionLayerLevel */ Double, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterSelectionEnd", js.Array(value*))
      
      inline def setAfterSelectionUndefined: Self = StObject.set(x, "afterSelection", js.undefined)
      
      inline def setAfterSelectionVarargs(
        value: (js.UndefOr[
              js.Function6[
                /* row */ Double, 
                /* column */ Double, 
                /* row2 */ Double, 
                /* column2 */ Double, 
                /* preventScrolling */ Value, 
                /* selectionLayerLevel */ Double, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterSelection", js.Array(value*))
      
      inline def setAfterSetCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterSetCellMeta", value.asInstanceOf[js.Any])
      
      inline def setAfterSetCellMetaUndefined: Self = StObject.set(x, "afterSetCellMeta", js.undefined)
      
      inline def setAfterSetCellMetaVarargs(
        value: (js.UndefOr[
              js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
            ])*
      ): Self = StObject.set(x, "afterSetCellMeta", js.Array(value*))
      
      inline def setAfterSetDataAtCell(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterSetDataAtCell", value.asInstanceOf[js.Any])
      
      inline def setAfterSetDataAtCellUndefined: Self = StObject.set(x, "afterSetDataAtCell", js.undefined)
      
      inline def setAfterSetDataAtCellVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "afterSetDataAtCell", js.Array(value*))
      
      inline def setAfterSetDataAtRowProp(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterSetDataAtRowProp", value.asInstanceOf[js.Any])
      
      inline def setAfterSetDataAtRowPropUndefined: Self = StObject.set(x, "afterSetDataAtRowProp", js.undefined)
      
      inline def setAfterSetDataAtRowPropVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "afterSetDataAtRowProp", js.Array(value*))
      
      inline def setAfterSetSourceDataAtCell(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterSetSourceDataAtCell", value.asInstanceOf[js.Any])
      
      inline def setAfterSetSourceDataAtCellUndefined: Self = StObject.set(x, "afterSetSourceDataAtCell", js.undefined)
      
      inline def setAfterSetSourceDataAtCellVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "afterSetSourceDataAtCell", js.Array(value*))
      
      inline def setAfterSheetAdded(value: js.Array[js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]]]): Self = StObject.set(x, "afterSheetAdded", value.asInstanceOf[js.Any])
      
      inline def setAfterSheetAddedUndefined: Self = StObject.set(x, "afterSheetAdded", js.undefined)
      
      inline def setAfterSheetAddedVarargs(value: (js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]])*): Self = StObject.set(x, "afterSheetAdded", js.Array(value*))
      
      inline def setAfterSheetRemoved(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
              ]
            ]
      ): Self = StObject.set(x, "afterSheetRemoved", value.asInstanceOf[js.Any])
      
      inline def setAfterSheetRemovedUndefined: Self = StObject.set(x, "afterSheetRemoved", js.undefined)
      
      inline def setAfterSheetRemovedVarargs(
        value: (js.UndefOr[
              js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
            ])*
      ): Self = StObject.set(x, "afterSheetRemoved", js.Array(value*))
      
      inline def setAfterSheetRenamed(
        value: js.Array[
              js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]]
            ]
      ): Self = StObject.set(x, "afterSheetRenamed", value.asInstanceOf[js.Any])
      
      inline def setAfterSheetRenamedUndefined: Self = StObject.set(x, "afterSheetRenamed", js.undefined)
      
      inline def setAfterSheetRenamedVarargs(value: (js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]])*): Self = StObject.set(x, "afterSheetRenamed", js.Array(value*))
      
      inline def setAfterTrimRow(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterTrimRow", value.asInstanceOf[js.Any])
      
      inline def setAfterTrimRowUndefined: Self = StObject.set(x, "afterTrimRow", js.undefined)
      
      inline def setAfterTrimRowVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentTrimConfig */ js.Array[Double], 
                /* destinationTrimConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterTrimRow", js.Array(value*))
      
      inline def setAfterUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Self = StObject.set(x, "afterUndo", value.asInstanceOf[js.Any])
      
      inline def setAfterUndoStackChange(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* doneActionsBefore */ js.Array[Action], 
                  /* doneActionsAfter */ js.Array[Action], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterUndoStackChange", value.asInstanceOf[js.Any])
      
      inline def setAfterUndoStackChangeUndefined: Self = StObject.set(x, "afterUndoStackChange", js.undefined)
      
      inline def setAfterUndoStackChangeVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* doneActionsBefore */ js.Array[Action], 
                /* doneActionsAfter */ js.Array[Action], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterUndoStackChange", js.Array(value*))
      
      inline def setAfterUndoUndefined: Self = StObject.set(x, "afterUndo", js.undefined)
      
      inline def setAfterUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ Action, Unit]])*): Self = StObject.set(x, "afterUndo", js.Array(value*))
      
      inline def setAfterUnhideColumns(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterUnhideColumns", value.asInstanceOf[js.Any])
      
      inline def setAfterUnhideColumnsUndefined: Self = StObject.set(x, "afterUnhideColumns", js.undefined)
      
      inline def setAfterUnhideColumnsVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterUnhideColumns", js.Array(value*))
      
      inline def setAfterUnhideRows(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterUnhideRows", value.asInstanceOf[js.Any])
      
      inline def setAfterUnhideRowsUndefined: Self = StObject.set(x, "afterUnhideRows", js.undefined)
      
      inline def setAfterUnhideRowsVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterUnhideRows", js.Array(value*))
      
      inline def setAfterUnlisten(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterUnlisten", value.asInstanceOf[js.Any])
      
      inline def setAfterUnlistenUndefined: Self = StObject.set(x, "afterUnlisten", js.undefined)
      
      inline def setAfterUnlistenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterUnlisten", js.Array(value*))
      
      inline def setAfterUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "afterUnmergeCells", value.asInstanceOf[js.Any])
      
      inline def setAfterUnmergeCellsUndefined: Self = StObject.set(x, "afterUnmergeCells", js.undefined)
      
      inline def setAfterUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "afterUnmergeCells", js.Array(value*))
      
      inline def setAfterUntrimRow(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterUntrimRow", value.asInstanceOf[js.Any])
      
      inline def setAfterUntrimRowUndefined: Self = StObject.set(x, "afterUntrimRow", js.undefined)
      
      inline def setAfterUntrimRowVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* currentTrimConfig */ js.Array[Double], 
                /* destinationTrimConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                /* stateChanged */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterUntrimRow", js.Array(value*))
      
      inline def setAfterUpdateData(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* sourceData */ js.Array[CellValue], 
                  /* initialLoad */ Boolean, 
                  /* source */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "afterUpdateData", value.asInstanceOf[js.Any])
      
      inline def setAfterUpdateDataUndefined: Self = StObject.set(x, "afterUpdateData", js.undefined)
      
      inline def setAfterUpdateDataVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* sourceData */ js.Array[CellValue], 
                /* initialLoad */ Boolean, 
                /* source */ js.UndefOr[String], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "afterUpdateData", js.Array(value*))
      
      inline def setAfterUpdateSettings(value: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]): Self = StObject.set(x, "afterUpdateSettings", value.asInstanceOf[js.Any])
      
      inline def setAfterUpdateSettingsUndefined: Self = StObject.set(x, "afterUpdateSettings", js.undefined)
      
      inline def setAfterUpdateSettingsVarargs(value: (js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]])*): Self = StObject.set(x, "afterUpdateSettings", js.Array(value*))
      
      inline def setAfterValidate(
        value: js.Array[
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
      ): Self = StObject.set(x, "afterValidate", value.asInstanceOf[js.Any])
      
      inline def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
      
      inline def setAfterValidateVarargs(
        value: (js.UndefOr[
              js.Function5[
                /* isValid */ Boolean, 
                /* value */ CellValue, 
                /* row */ Double, 
                /* prop */ String | Double, 
                /* source */ ChangeSource, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "afterValidate", js.Array(value*))
      
      inline def setAfterViewRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = StObject.set(x, "afterViewRender", value.asInstanceOf[js.Any])
      
      inline def setAfterViewRenderUndefined: Self = StObject.set(x, "afterViewRender", js.undefined)
      
      inline def setAfterViewRenderVarargs(value: (js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]])*): Self = StObject.set(x, "afterViewRender", js.Array(value*))
      
      inline def setAfterViewportColumnCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = StObject.set(x, "afterViewportColumnCalculatorOverride", value.asInstanceOf[js.Any])
      
      inline def setAfterViewportColumnCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.undefined)
      
      inline def setAfterViewportColumnCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.Array(value*))
      
      inline def setAfterViewportRowCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = StObject.set(x, "afterViewportRowCalculatorOverride", value.asInstanceOf[js.Any])
      
      inline def setAfterViewportRowCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.undefined)
      
      inline def setAfterViewportRowCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.Array(value*))
      
      inline def setBeforeAddChild(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* parent */ RowObject, 
                  /* element */ js.UndefOr[RowObject], 
                  /* index */ js.UndefOr[Double], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeAddChild", value.asInstanceOf[js.Any])
      
      inline def setBeforeAddChildUndefined: Self = StObject.set(x, "beforeAddChild", js.undefined)
      
      inline def setBeforeAddChildVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* parent */ RowObject, 
                /* element */ js.UndefOr[RowObject], 
                /* index */ js.UndefOr[Double], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeAddChild", js.Array(value*))
      
      inline def setBeforeAutofill(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* selectionData */ js.Array[js.Array[CellValue]], 
                  /* sourceRange */ default, 
                  /* targetRange */ default, 
                  /* direction */ up | down | left | right, 
                  js.Array[js.Array[CellValue]] | Boolean | Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeAutofill", value.asInstanceOf[js.Any])
      
      inline def setBeforeAutofillInsidePopulate(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* index */ typings.handsontable.coordsMod.default, 
                  /* direction */ up | down | left | right, 
                  /* input */ js.Array[js.Array[CellValue]], 
                  /* deltas */ js.Array[Any], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeAutofillInsidePopulate", value.asInstanceOf[js.Any])
      
      inline def setBeforeAutofillInsidePopulateUndefined: Self = StObject.set(x, "beforeAutofillInsidePopulate", js.undefined)
      
      inline def setBeforeAutofillInsidePopulateVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* index */ typings.handsontable.coordsMod.default, 
                /* direction */ up | down | left | right, 
                /* input */ js.Array[js.Array[CellValue]], 
                /* deltas */ js.Array[Any], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeAutofillInsidePopulate", js.Array(value*))
      
      inline def setBeforeAutofillUndefined: Self = StObject.set(x, "beforeAutofill", js.undefined)
      
      inline def setBeforeAutofillVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* selectionData */ js.Array[js.Array[CellValue]], 
                /* sourceRange */ default, 
                /* targetRange */ default, 
                /* direction */ up | down | left | right, 
                js.Array[js.Array[CellValue]] | Boolean | Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeAutofill", js.Array(value*))
      
      inline def setBeforeCellAlignment(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* stateBefore */ NumberDictionary[js.Array[String]], 
                  /* range */ js.Array[default], 
                  /* type */ horizontal | vertical, 
                  /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeCellAlignment", value.asInstanceOf[js.Any])
      
      inline def setBeforeCellAlignmentUndefined: Self = StObject.set(x, "beforeCellAlignment", js.undefined)
      
      inline def setBeforeCellAlignmentVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* stateBefore */ NumberDictionary[js.Array[String]], 
                /* range */ js.Array[default], 
                /* type */ horizontal | vertical, 
                /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeCellAlignment", js.Array(value*))
      
      inline def setBeforeChange(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
              ]
            ]
      ): Self = StObject.set(x, "beforeChange", value.asInstanceOf[js.Any])
      
      inline def setBeforeChangeRender(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeChangeRender", value.asInstanceOf[js.Any])
      
      inline def setBeforeChangeRenderUndefined: Self = StObject.set(x, "beforeChangeRender", js.undefined)
      
      inline def setBeforeChangeRenderVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
            ])*
      ): Self = StObject.set(x, "beforeChangeRender", js.Array(value*))
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setBeforeChangeVarargs(
        value: (js.UndefOr[
              js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
            ])*
      ): Self = StObject.set(x, "beforeChange", js.Array(value*))
      
      inline def setBeforeColumnCollapse(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentCollapsedColumn */ js.Array[Double], 
                  /* destinationCollapsedColumns */ js.Array[Double], 
                  /* collapsePossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeColumnCollapse", value.asInstanceOf[js.Any])
      
      inline def setBeforeColumnCollapseUndefined: Self = StObject.set(x, "beforeColumnCollapse", js.undefined)
      
      inline def setBeforeColumnCollapseVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentCollapsedColumn */ js.Array[Double], 
                /* destinationCollapsedColumns */ js.Array[Double], 
                /* collapsePossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeColumnCollapse", js.Array(value*))
      
      inline def setBeforeColumnExpand(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentCollapsedColumn */ js.Array[Double], 
                  /* destinationCollapsedColumns */ js.Array[Double], 
                  /* expandPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeColumnExpand", value.asInstanceOf[js.Any])
      
      inline def setBeforeColumnExpandUndefined: Self = StObject.set(x, "beforeColumnExpand", js.undefined)
      
      inline def setBeforeColumnExpandVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentCollapsedColumn */ js.Array[Double], 
                /* destinationCollapsedColumns */ js.Array[Double], 
                /* expandPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeColumnExpand", js.Array(value*))
      
      inline def setBeforeColumnMove(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeColumnMove", value.asInstanceOf[js.Any])
      
      inline def setBeforeColumnMoveUndefined: Self = StObject.set(x, "beforeColumnMove", js.undefined)
      
      inline def setBeforeColumnMoveVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* movedColumns */ js.Array[Double], 
                /* finalIndex */ Double, 
                /* dropIndex */ js.UndefOr[Double], 
                /* movePossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeColumnMove", js.Array(value*))
      
      inline def setBeforeColumnResize(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
              ]
            ]
      ): Self = StObject.set(x, "beforeColumnResize", value.asInstanceOf[js.Any])
      
      inline def setBeforeColumnResizeUndefined: Self = StObject.set(x, "beforeColumnResize", js.undefined)
      
      inline def setBeforeColumnResizeVarargs(
        value: (js.UndefOr[
              js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
            ])*
      ): Self = StObject.set(x, "beforeColumnResize", js.Array(value*))
      
      inline def setBeforeColumnSort(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* currentSortConfig */ js.Array[Config], 
                  /* destinationSortConfigs */ js.Array[Config], 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeColumnSort", value.asInstanceOf[js.Any])
      
      inline def setBeforeColumnSortUndefined: Self = StObject.set(x, "beforeColumnSort", js.undefined)
      
      inline def setBeforeColumnSortVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* currentSortConfig */ js.Array[Config], 
                /* destinationSortConfigs */ js.Array[Config], 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeColumnSort", js.Array(value*))
      
      inline def setBeforeContextMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = StObject.set(x, "beforeContextMenuSetItems", value.asInstanceOf[js.Any])
      
      inline def setBeforeContextMenuSetItemsUndefined: Self = StObject.set(x, "beforeContextMenuSetItems", js.undefined)
      
      inline def setBeforeContextMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = StObject.set(x, "beforeContextMenuSetItems", js.Array(value*))
      
      inline def setBeforeContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "beforeContextMenuShow", value.asInstanceOf[js.Any])
      
      inline def setBeforeContextMenuShowUndefined: Self = StObject.set(x, "beforeContextMenuShow", js.undefined)
      
      inline def setBeforeContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "beforeContextMenuShow", js.Array(value*))
      
      inline def setBeforeCopy(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* data */ js.Array[js.Array[CellValue]], 
                  /* coords */ js.Array[RangeType], 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeCopy", value.asInstanceOf[js.Any])
      
      inline def setBeforeCopyUndefined: Self = StObject.set(x, "beforeCopy", js.undefined)
      
      inline def setBeforeCopyVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* data */ js.Array[js.Array[CellValue]], 
                /* coords */ js.Array[RangeType], 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeCopy", js.Array(value*))
      
      inline def setBeforeCreateCol(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* index */ Double, 
                  /* amount */ Double, 
                  /* source */ js.UndefOr[ChangeSource], 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeCreateCol", value.asInstanceOf[js.Any])
      
      inline def setBeforeCreateColUndefined: Self = StObject.set(x, "beforeCreateCol", js.undefined)
      
      inline def setBeforeCreateColVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* index */ Double, 
                /* amount */ Double, 
                /* source */ js.UndefOr[ChangeSource], 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeCreateCol", js.Array(value*))
      
      inline def setBeforeCreateRow(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeCreateRow", value.asInstanceOf[js.Any])
      
      inline def setBeforeCreateRowUndefined: Self = StObject.set(x, "beforeCreateRow", js.undefined)
      
      inline def setBeforeCreateRowVarargs(
        value: (js.UndefOr[
              js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
            ])*
      ): Self = StObject.set(x, "beforeCreateRow", js.Array(value*))
      
      inline def setBeforeCut(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* data */ js.Array[js.Array[CellValue]], 
                  /* coords */ js.Array[RangeType], 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeCut", value.asInstanceOf[js.Any])
      
      inline def setBeforeCutUndefined: Self = StObject.set(x, "beforeCut", js.undefined)
      
      inline def setBeforeCutVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* data */ js.Array[js.Array[CellValue]], 
                /* coords */ js.Array[RangeType], 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeCut", js.Array(value*))
      
      inline def setBeforeDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = StObject.set(x, "beforeDetachChild", value.asInstanceOf[js.Any])
      
      inline def setBeforeDetachChildUndefined: Self = StObject.set(x, "beforeDetachChild", js.undefined)
      
      inline def setBeforeDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = StObject.set(x, "beforeDetachChild", js.Array(value*))
      
      inline def setBeforeDrawBorders(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* corners */ js.Array[Double], 
                  /* borderClassName */ js.UndefOr[current | area | highlight], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeDrawBorders", value.asInstanceOf[js.Any])
      
      inline def setBeforeDrawBordersUndefined: Self = StObject.set(x, "beforeDrawBorders", js.undefined)
      
      inline def setBeforeDrawBordersVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* corners */ js.Array[Double], 
                /* borderClassName */ js.UndefOr[current | area | highlight], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeDrawBorders", js.Array(value*))
      
      inline def setBeforeDropdownMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = StObject.set(x, "beforeDropdownMenuSetItems", value.asInstanceOf[js.Any])
      
      inline def setBeforeDropdownMenuSetItemsUndefined: Self = StObject.set(x, "beforeDropdownMenuSetItems", js.undefined)
      
      inline def setBeforeDropdownMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = StObject.set(x, "beforeDropdownMenuSetItems", js.Array(value*))
      
      inline def setBeforeDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "beforeDropdownMenuShow", value.asInstanceOf[js.Any])
      
      inline def setBeforeDropdownMenuShowUndefined: Self = StObject.set(x, "beforeDropdownMenuShow", js.undefined)
      
      inline def setBeforeDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "beforeDropdownMenuShow", js.Array(value*))
      
      inline def setBeforeFilter(
        value: js.Array[
              js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
            ]
      ): Self = StObject.set(x, "beforeFilter", value.asInstanceOf[js.Any])
      
      inline def setBeforeFilterUndefined: Self = StObject.set(x, "beforeFilter", js.undefined)
      
      inline def setBeforeFilterVarargs(
        value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]])*
      ): Self = StObject.set(x, "beforeFilter", js.Array(value*))
      
      inline def setBeforeGetCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeGetCellMeta", value.asInstanceOf[js.Any])
      
      inline def setBeforeGetCellMetaUndefined: Self = StObject.set(x, "beforeGetCellMeta", js.undefined)
      
      inline def setBeforeGetCellMetaVarargs(
        value: (js.UndefOr[
              js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
            ])*
      ): Self = StObject.set(x, "beforeGetCellMeta", js.Array(value*))
      
      inline def setBeforeHideColumns(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentHideConfig */ js.Array[Double], 
                  /* destinationHideConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeHideColumns", value.asInstanceOf[js.Any])
      
      inline def setBeforeHideColumnsUndefined: Self = StObject.set(x, "beforeHideColumns", js.undefined)
      
      inline def setBeforeHideColumnsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeHideColumns", js.Array(value*))
      
      inline def setBeforeHideRows(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentHideConfig */ js.Array[Double], 
                  /* destinationHideConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeHideRows", value.asInstanceOf[js.Any])
      
      inline def setBeforeHideRowsUndefined: Self = StObject.set(x, "beforeHideRows", js.undefined)
      
      inline def setBeforeHideRowsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeHideRows", js.Array(value*))
      
      inline def setBeforeHighlightingColumnHeader(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* column */ Double, 
                  /* headerLevel */ Double, 
                  /* highlightMeta */ HookHighlightColumnHeaderMeta, 
                  Double | Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeHighlightingColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setBeforeHighlightingColumnHeaderUndefined: Self = StObject.set(x, "beforeHighlightingColumnHeader", js.undefined)
      
      inline def setBeforeHighlightingColumnHeaderVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* column */ Double, 
                /* headerLevel */ Double, 
                /* highlightMeta */ HookHighlightColumnHeaderMeta, 
                Double | Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeHighlightingColumnHeader", js.Array(value*))
      
      inline def setBeforeHighlightingRowHeader(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* row */ Double, 
                  /* headerLevel */ Double, 
                  /* highlightMeta */ HookHighlightRowHeaderMeta, 
                  Double | Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeHighlightingRowHeader", value.asInstanceOf[js.Any])
      
      inline def setBeforeHighlightingRowHeaderUndefined: Self = StObject.set(x, "beforeHighlightingRowHeader", js.undefined)
      
      inline def setBeforeHighlightingRowHeaderVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* row */ Double, 
                /* headerLevel */ Double, 
                /* highlightMeta */ HookHighlightRowHeaderMeta, 
                Double | Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeHighlightingRowHeader", js.Array(value*))
      
      inline def setBeforeInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "beforeInit", value.asInstanceOf[js.Any])
      
      inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
      
      inline def setBeforeInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "beforeInit", js.Array(value*))
      
      inline def setBeforeInitWalkontable(value: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]): Self = StObject.set(x, "beforeInitWalkontable", value.asInstanceOf[js.Any])
      
      inline def setBeforeInitWalkontableUndefined: Self = StObject.set(x, "beforeInitWalkontable", js.undefined)
      
      inline def setBeforeInitWalkontableVarargs(value: (js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]])*): Self = StObject.set(x, "beforeInitWalkontable", js.Array(value*))
      
      inline def setBeforeKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = StObject.set(x, "beforeKeyDown", value.asInstanceOf[js.Any])
      
      inline def setBeforeKeyDownUndefined: Self = StObject.set(x, "beforeKeyDown", js.undefined)
      
      inline def setBeforeKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = StObject.set(x, "beforeKeyDown", js.Array(value*))
      
      inline def setBeforeLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = StObject.set(x, "beforeLanguageChange", value.asInstanceOf[js.Any])
      
      inline def setBeforeLanguageChangeUndefined: Self = StObject.set(x, "beforeLanguageChange", js.undefined)
      
      inline def setBeforeLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = StObject.set(x, "beforeLanguageChange", js.Array(value*))
      
      inline def setBeforeLoadData(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* sourceData */ js.Array[CellValue], 
                  /* initialLoad */ Boolean, 
                  /* source */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeLoadData", value.asInstanceOf[js.Any])
      
      inline def setBeforeLoadDataUndefined: Self = StObject.set(x, "beforeLoadData", js.undefined)
      
      inline def setBeforeLoadDataVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* sourceData */ js.Array[CellValue], 
                /* initialLoad */ Boolean, 
                /* source */ js.UndefOr[String], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeLoadData", js.Array(value*))
      
      inline def setBeforeMergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "beforeMergeCells", value.asInstanceOf[js.Any])
      
      inline def setBeforeMergeCellsUndefined: Self = StObject.set(x, "beforeMergeCells", js.undefined)
      
      inline def setBeforeMergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "beforeMergeCells", js.Array(value*))
      
      inline def setBeforeOnCellContextMenu(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeOnCellContextMenu", value.asInstanceOf[js.Any])
      
      inline def setBeforeOnCellContextMenuUndefined: Self = StObject.set(x, "beforeOnCellContextMenu", js.undefined)
      
      inline def setBeforeOnCellContextMenuVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeOnCellContextMenu", js.Array(value*))
      
      inline def setBeforeOnCellMouseDown(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  /* controller */ SelectionController, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeOnCellMouseDown", value.asInstanceOf[js.Any])
      
      inline def setBeforeOnCellMouseDownUndefined: Self = StObject.set(x, "beforeOnCellMouseDown", js.undefined)
      
      inline def setBeforeOnCellMouseDownVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                /* controller */ SelectionController, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeOnCellMouseDown", js.Array(value*))
      
      inline def setBeforeOnCellMouseOut(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeOnCellMouseOut", value.asInstanceOf[js.Any])
      
      inline def setBeforeOnCellMouseOutUndefined: Self = StObject.set(x, "beforeOnCellMouseOut", js.undefined)
      
      inline def setBeforeOnCellMouseOutVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeOnCellMouseOut", js.Array(value*))
      
      inline def setBeforeOnCellMouseOver(
        value: js.Array[
              js.UndefOr[
                js.Function4[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  /* controller */ SelectionController, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeOnCellMouseOver", value.asInstanceOf[js.Any])
      
      inline def setBeforeOnCellMouseOverUndefined: Self = StObject.set(x, "beforeOnCellMouseOver", js.undefined)
      
      inline def setBeforeOnCellMouseOverVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                /* controller */ SelectionController, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeOnCellMouseOver", js.Array(value*))
      
      inline def setBeforeOnCellMouseUp(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* event */ MouseEvent, 
                  /* coords */ typings.handsontable.coordsMod.default, 
                  /* TD */ HTMLTableCellElement, 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeOnCellMouseUp", value.asInstanceOf[js.Any])
      
      inline def setBeforeOnCellMouseUpUndefined: Self = StObject.set(x, "beforeOnCellMouseUp", js.undefined)
      
      inline def setBeforeOnCellMouseUpVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* event */ MouseEvent, 
                /* coords */ typings.handsontable.coordsMod.default, 
                /* TD */ HTMLTableCellElement, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeOnCellMouseUp", js.Array(value*))
      
      inline def setBeforePaste(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* data */ js.Array[js.Array[CellValue]], 
                  /* coords */ js.Array[RangeType], 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforePaste", value.asInstanceOf[js.Any])
      
      inline def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
      
      inline def setBeforePasteVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* data */ js.Array[js.Array[CellValue]], 
                /* coords */ js.Array[RangeType], 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforePaste", js.Array(value*))
      
      inline def setBeforeRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Self = StObject.set(x, "beforeRedo", value.asInstanceOf[js.Any])
      
      inline def setBeforeRedoStackChange(value: js.Array[js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]]]): Self = StObject.set(x, "beforeRedoStackChange", value.asInstanceOf[js.Any])
      
      inline def setBeforeRedoStackChangeUndefined: Self = StObject.set(x, "beforeRedoStackChange", js.undefined)
      
      inline def setBeforeRedoStackChangeVarargs(value: (js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]])*): Self = StObject.set(x, "beforeRedoStackChange", js.Array(value*))
      
      inline def setBeforeRedoUndefined: Self = StObject.set(x, "beforeRedo", js.undefined)
      
      inline def setBeforeRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ Action, Unit]])*): Self = StObject.set(x, "beforeRedo", js.Array(value*))
      
      inline def setBeforeRefreshDimensions(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* previousDimensions */ js.Object, 
                  /* currentDimensions */ js.Object, 
                  /* actionPossible */ Boolean, 
                  Boolean | Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeRefreshDimensions", value.asInstanceOf[js.Any])
      
      inline def setBeforeRefreshDimensionsUndefined: Self = StObject.set(x, "beforeRefreshDimensions", js.undefined)
      
      inline def setBeforeRefreshDimensionsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* previousDimensions */ js.Object, 
                /* currentDimensions */ js.Object, 
                /* actionPossible */ Boolean, 
                Boolean | Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeRefreshDimensions", js.Array(value*))
      
      inline def setBeforeRemoveCellClassNames(value: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]): Self = StObject.set(x, "beforeRemoveCellClassNames", value.asInstanceOf[js.Any])
      
      inline def setBeforeRemoveCellClassNamesUndefined: Self = StObject.set(x, "beforeRemoveCellClassNames", js.undefined)
      
      inline def setBeforeRemoveCellClassNamesVarargs(value: (js.UndefOr[js.Function0[js.Array[String] | Unit]])*): Self = StObject.set(x, "beforeRemoveCellClassNames", js.Array(value*))
      
      inline def setBeforeRemoveCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeRemoveCellMeta", value.asInstanceOf[js.Any])
      
      inline def setBeforeRemoveCellMetaUndefined: Self = StObject.set(x, "beforeRemoveCellMeta", js.undefined)
      
      inline def setBeforeRemoveCellMetaVarargs(
        value: (js.UndefOr[
              js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
            ])*
      ): Self = StObject.set(x, "beforeRemoveCellMeta", js.Array(value*))
      
      inline def setBeforeRemoveCol(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeRemoveCol", value.asInstanceOf[js.Any])
      
      inline def setBeforeRemoveColUndefined: Self = StObject.set(x, "beforeRemoveCol", js.undefined)
      
      inline def setBeforeRemoveColVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* index */ Double, 
                /* amount */ Double, 
                /* physicalColumns */ js.Array[Double], 
                /* source */ js.UndefOr[ChangeSource], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeRemoveCol", js.Array(value*))
      
      inline def setBeforeRemoveRow(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeRemoveRow", value.asInstanceOf[js.Any])
      
      inline def setBeforeRemoveRowUndefined: Self = StObject.set(x, "beforeRemoveRow", js.undefined)
      
      inline def setBeforeRemoveRowVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* index */ Double, 
                /* amount */ Double, 
                /* physicalColumns */ js.Array[Double], 
                /* source */ js.UndefOr[ChangeSource], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeRemoveRow", js.Array(value*))
      
      inline def setBeforeRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = StObject.set(x, "beforeRender", value.asInstanceOf[js.Any])
      
      inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
      
      inline def setBeforeRenderVarargs(value: (js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]])*): Self = StObject.set(x, "beforeRender", js.Array(value*))
      
      inline def setBeforeRenderer(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeRenderer", value.asInstanceOf[js.Any])
      
      inline def setBeforeRendererUndefined: Self = StObject.set(x, "beforeRenderer", js.undefined)
      
      inline def setBeforeRendererVarargs(
        value: (js.UndefOr[
              js.Function6[
                /* TD */ HTMLTableCellElement, 
                /* row */ Double, 
                /* column */ Double, 
                /* prop */ String | Double, 
                /* value */ CellValue, 
                /* cellProperties */ CellProperties, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeRenderer", js.Array(value*))
      
      inline def setBeforeRowMove(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeRowMove", value.asInstanceOf[js.Any])
      
      inline def setBeforeRowMoveUndefined: Self = StObject.set(x, "beforeRowMove", js.undefined)
      
      inline def setBeforeRowMoveVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* movedRows */ js.Array[Double], 
                /* finalIndex */ Double, 
                /* dropIndex */ js.UndefOr[Double], 
                /* movePossible */ Boolean, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeRowMove", js.Array(value*))
      
      inline def setBeforeRowResize(
        value: js.Array[
              js.UndefOr[
                js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeRowResize", value.asInstanceOf[js.Any])
      
      inline def setBeforeRowResizeUndefined: Self = StObject.set(x, "beforeRowResize", js.undefined)
      
      inline def setBeforeRowResizeVarargs(
        value: (js.UndefOr[
              js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
            ])*
      ): Self = StObject.set(x, "beforeRowResize", js.Array(value*))
      
      inline def setBeforeSetCellMeta(
        value: js.Array[
              js.UndefOr[
                js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeSetCellMeta", value.asInstanceOf[js.Any])
      
      inline def setBeforeSetCellMetaUndefined: Self = StObject.set(x, "beforeSetCellMeta", js.undefined)
      
      inline def setBeforeSetCellMetaVarargs(
        value: (js.UndefOr[
              js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
            ])*
      ): Self = StObject.set(x, "beforeSetCellMeta", js.Array(value*))
      
      inline def setBeforeSetRangeEnd(
        value: js.Array[
              js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
            ]
      ): Self = StObject.set(x, "beforeSetRangeEnd", value.asInstanceOf[js.Any])
      
      inline def setBeforeSetRangeEndUndefined: Self = StObject.set(x, "beforeSetRangeEnd", js.undefined)
      
      inline def setBeforeSetRangeEndVarargs(value: (js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]])*): Self = StObject.set(x, "beforeSetRangeEnd", js.Array(value*))
      
      inline def setBeforeSetRangeStart(
        value: js.Array[
              js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
            ]
      ): Self = StObject.set(x, "beforeSetRangeStart", value.asInstanceOf[js.Any])
      
      inline def setBeforeSetRangeStartOnly(
        value: js.Array[
              js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]]
            ]
      ): Self = StObject.set(x, "beforeSetRangeStartOnly", value.asInstanceOf[js.Any])
      
      inline def setBeforeSetRangeStartOnlyUndefined: Self = StObject.set(x, "beforeSetRangeStartOnly", js.undefined)
      
      inline def setBeforeSetRangeStartOnlyVarargs(value: (js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]])*): Self = StObject.set(x, "beforeSetRangeStartOnly", js.Array(value*))
      
      inline def setBeforeSetRangeStartUndefined: Self = StObject.set(x, "beforeSetRangeStart", js.undefined)
      
      inline def setBeforeSetRangeStartVarargs(value: (js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]])*): Self = StObject.set(x, "beforeSetRangeStart", js.Array(value*))
      
      inline def setBeforeStretchingColumnWidth(
        value: js.Array[
              js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
            ]
      ): Self = StObject.set(x, "beforeStretchingColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setBeforeStretchingColumnWidthUndefined: Self = StObject.set(x, "beforeStretchingColumnWidth", js.undefined)
      
      inline def setBeforeStretchingColumnWidthVarargs(
        value: (js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]])*
      ): Self = StObject.set(x, "beforeStretchingColumnWidth", js.Array(value*))
      
      inline def setBeforeTouchScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "beforeTouchScroll", value.asInstanceOf[js.Any])
      
      inline def setBeforeTouchScrollUndefined: Self = StObject.set(x, "beforeTouchScroll", js.undefined)
      
      inline def setBeforeTouchScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "beforeTouchScroll", js.Array(value*))
      
      inline def setBeforeTrimRow(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentTrimConfig */ js.Array[Double], 
                  /* destinationTrimConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeTrimRow", value.asInstanceOf[js.Any])
      
      inline def setBeforeTrimRowUndefined: Self = StObject.set(x, "beforeTrimRow", js.undefined)
      
      inline def setBeforeTrimRowVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentTrimConfig */ js.Array[Double], 
                /* destinationTrimConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeTrimRow", js.Array(value*))
      
      inline def setBeforeUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ Action, Unit]]]): Self = StObject.set(x, "beforeUndo", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndoStackChange(
        value: js.Array[
              js.UndefOr[
                js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
              ]
            ]
      ): Self = StObject.set(x, "beforeUndoStackChange", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndoStackChangeUndefined: Self = StObject.set(x, "beforeUndoStackChange", js.undefined)
      
      inline def setBeforeUndoStackChangeVarargs(
        value: (js.UndefOr[
              js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
            ])*
      ): Self = StObject.set(x, "beforeUndoStackChange", js.Array(value*))
      
      inline def setBeforeUndoUndefined: Self = StObject.set(x, "beforeUndo", js.undefined)
      
      inline def setBeforeUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ Action, Unit]])*): Self = StObject.set(x, "beforeUndo", js.Array(value*))
      
      inline def setBeforeUnhideColumns(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentHideConfig */ js.Array[Double], 
                  /* destinationHideConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeUnhideColumns", value.asInstanceOf[js.Any])
      
      inline def setBeforeUnhideColumnsUndefined: Self = StObject.set(x, "beforeUnhideColumns", js.undefined)
      
      inline def setBeforeUnhideColumnsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeUnhideColumns", js.Array(value*))
      
      inline def setBeforeUnhideRows(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentHideConfig */ js.Array[Double], 
                  /* destinationHideConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeUnhideRows", value.asInstanceOf[js.Any])
      
      inline def setBeforeUnhideRowsUndefined: Self = StObject.set(x, "beforeUnhideRows", js.undefined)
      
      inline def setBeforeUnhideRowsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentHideConfig */ js.Array[Double], 
                /* destinationHideConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeUnhideRows", js.Array(value*))
      
      inline def setBeforeUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "beforeUnmergeCells", value.asInstanceOf[js.Any])
      
      inline def setBeforeUnmergeCellsUndefined: Self = StObject.set(x, "beforeUnmergeCells", js.undefined)
      
      inline def setBeforeUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "beforeUnmergeCells", js.Array(value*))
      
      inline def setBeforeUntrimRow(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* currentTrimConfig */ js.Array[Double], 
                  /* destinationTrimConfig */ js.Array[Double], 
                  /* actionPossible */ Boolean, 
                  Unit | Boolean
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeUntrimRow", value.asInstanceOf[js.Any])
      
      inline def setBeforeUntrimRowUndefined: Self = StObject.set(x, "beforeUntrimRow", js.undefined)
      
      inline def setBeforeUntrimRowVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* currentTrimConfig */ js.Array[Double], 
                /* destinationTrimConfig */ js.Array[Double], 
                /* actionPossible */ Boolean, 
                Unit | Boolean
              ]
            ])*
      ): Self = StObject.set(x, "beforeUntrimRow", js.Array(value*))
      
      inline def setBeforeUpdateData(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* sourceData */ js.Array[CellValue], 
                  /* initialLoad */ Boolean, 
                  /* source */ js.UndefOr[String], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "beforeUpdateData", value.asInstanceOf[js.Any])
      
      inline def setBeforeUpdateDataUndefined: Self = StObject.set(x, "beforeUpdateData", js.undefined)
      
      inline def setBeforeUpdateDataVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* sourceData */ js.Array[CellValue], 
                /* initialLoad */ Boolean, 
                /* source */ js.UndefOr[String], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeUpdateData", js.Array(value*))
      
      inline def setBeforeValidate(
        value: js.Array[
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
      ): Self = StObject.set(x, "beforeValidate", value.asInstanceOf[js.Any])
      
      inline def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
      
      inline def setBeforeValidateVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* value */ CellValue, 
                /* row */ Double, 
                /* prop */ String | Double, 
                /* source */ js.UndefOr[ChangeSource], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "beforeValidate", js.Array(value*))
      
      inline def setBeforeValueRender(
        value: js.Array[
              js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
            ]
      ): Self = StObject.set(x, "beforeValueRender", value.asInstanceOf[js.Any])
      
      inline def setBeforeValueRenderUndefined: Self = StObject.set(x, "beforeValueRender", js.undefined)
      
      inline def setBeforeValueRenderVarargs(
        value: (js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]])*
      ): Self = StObject.set(x, "beforeValueRender", js.Array(value*))
      
      inline def setBeforeViewRender(
        value: js.Array[
              js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
            ]
      ): Self = StObject.set(x, "beforeViewRender", value.asInstanceOf[js.Any])
      
      inline def setBeforeViewRenderUndefined: Self = StObject.set(x, "beforeViewRender", js.undefined)
      
      inline def setBeforeViewRenderVarargs(value: (js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]])*): Self = StObject.set(x, "beforeViewRender", js.Array(value*))
      
      inline def setConstruct(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setConstructVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "construct", js.Array(value*))
      
      inline def setInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "init", js.Array(value*))
      
      inline def setModifyAutoColumnSizeSeed(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* seed */ String, 
                  /* cellProperties */ CellProperties, 
                  /* cellValue */ CellValue, 
                  String | Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "modifyAutoColumnSizeSeed", value.asInstanceOf[js.Any])
      
      inline def setModifyAutoColumnSizeSeedUndefined: Self = StObject.set(x, "modifyAutoColumnSizeSeed", js.undefined)
      
      inline def setModifyAutoColumnSizeSeedVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* seed */ String, 
                /* cellProperties */ CellProperties, 
                /* cellValue */ CellValue, 
                String | Unit
              ]
            ])*
      ): Self = StObject.set(x, "modifyAutoColumnSizeSeed", js.Array(value*))
      
      inline def setModifyAutofillRange(
        value: js.Array[
              js.UndefOr[
                js.Function2[
                  /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
                  /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
                  Unit
                ]
              ]
            ]
      ): Self = StObject.set(x, "modifyAutofillRange", value.asInstanceOf[js.Any])
      
      inline def setModifyAutofillRangeUndefined: Self = StObject.set(x, "modifyAutofillRange", js.undefined)
      
      inline def setModifyAutofillRangeVarargs(
        value: (js.UndefOr[
              js.Function2[
                /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
                /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "modifyAutofillRange", js.Array(value*))
      
      inline def setModifyColHeader(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = StObject.set(x, "modifyColHeader", value.asInstanceOf[js.Any])
      
      inline def setModifyColHeaderUndefined: Self = StObject.set(x, "modifyColHeader", js.undefined)
      
      inline def setModifyColHeaderVarargs(value: (js.UndefOr[js.Function1[/* column */ Double, Unit]])*): Self = StObject.set(x, "modifyColHeader", js.Array(value*))
      
      inline def setModifyColWidth(value: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]]]): Self = StObject.set(x, "modifyColWidth", value.asInstanceOf[js.Any])
      
      inline def setModifyColWidthUndefined: Self = StObject.set(x, "modifyColWidth", js.undefined)
      
      inline def setModifyColWidthVarargs(value: (js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]])*): Self = StObject.set(x, "modifyColWidth", js.Array(value*))
      
      inline def setModifyColumnHeaderHeight(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "modifyColumnHeaderHeight", value.asInstanceOf[js.Any])
      
      inline def setModifyColumnHeaderHeightUndefined: Self = StObject.set(x, "modifyColumnHeaderHeight", js.undefined)
      
      inline def setModifyColumnHeaderHeightVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "modifyColumnHeaderHeight", js.Array(value*))
      
      inline def setModifyCopyableRange(value: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]): Self = StObject.set(x, "modifyCopyableRange", value.asInstanceOf[js.Any])
      
      inline def setModifyCopyableRangeUndefined: Self = StObject.set(x, "modifyCopyableRange", js.undefined)
      
      inline def setModifyCopyableRangeVarargs(value: (js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]])*): Self = StObject.set(x, "modifyCopyableRange", js.Array(value*))
      
      inline def setModifyData(
        value: js.Array[
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
      ): Self = StObject.set(x, "modifyData", value.asInstanceOf[js.Any])
      
      inline def setModifyDataUndefined: Self = StObject.set(x, "modifyData", js.undefined)
      
      inline def setModifyDataVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* row */ Double, 
                /* column */ Double, 
                /* valueHolder */ ValueCellValue, 
                /* ioMode */ get | set, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "modifyData", js.Array(value*))
      
      inline def setModifyGetCellCoords(
        value: js.Array[
              js.UndefOr[
                js.Function3[
                  /* row */ Double, 
                  /* column */ Double, 
                  /* topmost */ Boolean, 
                  Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
                ]
              ]
            ]
      ): Self = StObject.set(x, "modifyGetCellCoords", value.asInstanceOf[js.Any])
      
      inline def setModifyGetCellCoordsUndefined: Self = StObject.set(x, "modifyGetCellCoords", js.undefined)
      
      inline def setModifyGetCellCoordsVarargs(
        value: (js.UndefOr[
              js.Function3[
                /* row */ Double, 
                /* column */ Double, 
                /* topmost */ Boolean, 
                Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
              ]
            ])*
      ): Self = StObject.set(x, "modifyGetCellCoords", js.Array(value*))
      
      inline def setModifyRowData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowData", value.asInstanceOf[js.Any])
      
      inline def setModifyRowDataUndefined: Self = StObject.set(x, "modifyRowData", js.undefined)
      
      inline def setModifyRowDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowData", js.Array(value*))
      
      inline def setModifyRowHeader(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeader", value.asInstanceOf[js.Any])
      
      inline def setModifyRowHeaderUndefined: Self = StObject.set(x, "modifyRowHeader", js.undefined)
      
      inline def setModifyRowHeaderVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeader", js.Array(value*))
      
      inline def setModifyRowHeaderWidth(value: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeaderWidth", value.asInstanceOf[js.Any])
      
      inline def setModifyRowHeaderWidthUndefined: Self = StObject.set(x, "modifyRowHeaderWidth", js.undefined)
      
      inline def setModifyRowHeaderWidthVarargs(value: (js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeaderWidth", js.Array(value*))
      
      inline def setModifyRowHeight(value: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeight", value.asInstanceOf[js.Any])
      
      inline def setModifyRowHeightUndefined: Self = StObject.set(x, "modifyRowHeight", js.undefined)
      
      inline def setModifyRowHeightVarargs(value: (js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeight", js.Array(value*))
      
      inline def setModifyRowSourceData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowSourceData", value.asInstanceOf[js.Any])
      
      inline def setModifyRowSourceDataUndefined: Self = StObject.set(x, "modifyRowSourceData", js.undefined)
      
      inline def setModifyRowSourceDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowSourceData", js.Array(value*))
      
      inline def setModifySourceData(
        value: js.Array[
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
      ): Self = StObject.set(x, "modifySourceData", value.asInstanceOf[js.Any])
      
      inline def setModifySourceDataUndefined: Self = StObject.set(x, "modifySourceData", js.undefined)
      
      inline def setModifySourceDataVarargs(
        value: (js.UndefOr[
              js.Function4[
                /* row */ Double, 
                /* column */ Double, 
                /* valueHolder */ ValueCellValue, 
                /* ioMode */ get | set, 
                Unit
              ]
            ])*
      ): Self = StObject.set(x, "modifySourceData", js.Array(value*))
      
      inline def setModifyTransformEnd(
        value: js.Array[
              js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
            ]
      ): Self = StObject.set(x, "modifyTransformEnd", value.asInstanceOf[js.Any])
      
      inline def setModifyTransformEndUndefined: Self = StObject.set(x, "modifyTransformEnd", js.undefined)
      
      inline def setModifyTransformEndVarargs(value: (js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]])*): Self = StObject.set(x, "modifyTransformEnd", js.Array(value*))
      
      inline def setModifyTransformStart(
        value: js.Array[
              js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]]
            ]
      ): Self = StObject.set(x, "modifyTransformStart", value.asInstanceOf[js.Any])
      
      inline def setModifyTransformStartUndefined: Self = StObject.set(x, "modifyTransformStart", js.undefined)
      
      inline def setModifyTransformStartVarargs(value: (js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]])*): Self = StObject.set(x, "modifyTransformStart", js.Array(value*))
      
      inline def setPersistentStateLoad(
        value: js.Array[
              js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
            ]
      ): Self = StObject.set(x, "persistentStateLoad", value.asInstanceOf[js.Any])
      
      inline def setPersistentStateLoadUndefined: Self = StObject.set(x, "persistentStateLoad", js.undefined)
      
      inline def setPersistentStateLoadVarargs(value: (js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]])*): Self = StObject.set(x, "persistentStateLoad", js.Array(value*))
      
      inline def setPersistentStateReset(value: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Self = StObject.set(x, "persistentStateReset", value.asInstanceOf[js.Any])
      
      inline def setPersistentStateResetUndefined: Self = StObject.set(x, "persistentStateReset", js.undefined)
      
      inline def setPersistentStateResetVarargs(value: (js.UndefOr[js.Function1[/* key */ String, Unit]])*): Self = StObject.set(x, "persistentStateReset", js.Array(value*))
      
      inline def setPersistentStateSave(value: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]]]): Self = StObject.set(x, "persistentStateSave", value.asInstanceOf[js.Any])
      
      inline def setPersistentStateSaveUndefined: Self = StObject.set(x, "persistentStateSave", js.undefined)
      
      inline def setPersistentStateSaveVarargs(value: (js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]])*): Self = StObject.set(x, "persistentStateSave", js.Array(value*))
    }
  }
  
  trait Events extends StObject {
    
    var afterAddChild: js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ js.UndefOr[RowObject], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var afterAutofill: js.UndefOr[
        js.Function4[
          /* fillData */ js.Array[js.Array[CellValue]], 
          /* sourceRange */ default, 
          /* targetRange */ default, 
          /* direction */ up | down | left | right, 
          Unit
        ]
      ] = js.undefined
    
    var afterBeginEditing: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
    
    var afterCellMetaReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterChange: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ] = js.undefined
    
    var afterChangesObserved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterColumnCollapse: js.UndefOr[
        js.Function4[
          /* currentCollapsedColumns */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          /* successfullyCollapsed */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterColumnExpand: js.UndefOr[
        js.Function4[
          /* currentCollapsedColumns */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          /* successfullyExpanded */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterColumnMove: js.UndefOr[
        js.Function5[
          /* movedColumns */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterColumnResize: js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
      ] = js.undefined
    
    var afterColumnSort: js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ] = js.undefined
    
    var afterContextMenuDefaultOptions: js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ] = js.undefined
    
    var afterContextMenuHide: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
    
    var afterContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
    
    var afterCopy: js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ] = js.undefined
    
    var afterCopyLimit: js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumns */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var afterCreateCol: js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var afterCreateRow: js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var afterCut: js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ] = js.undefined
    
    var afterDeselect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.undefined
    
    var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    var afterDrawSelection: js.UndefOr[
        js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ js.UndefOr[Double], 
          String | Unit
        ]
      ] = js.undefined
    
    var afterDropdownMenuDefaultOptions: js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ] = js.undefined
    
    var afterDropdownMenuHide: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
    
    var afterDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
    
    var afterFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]] = js.undefined
    
    var afterFormulasValuesUpdate: js.UndefOr[js.Function1[/* changes */ js.Array[js.Object], Unit]] = js.undefined
    
    var afterGetCellMeta: js.UndefOr[
        js.Function3[/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties, Unit]
      ] = js.undefined
    
    var afterGetColHeader: js.UndefOr[js.Function2[/* column */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
    
    var afterGetColumnHeaderRenderers: js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ] = js.undefined
    
    var afterGetRowHeader: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
    
    var afterGetRowHeaderRenderers: js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ] = js.undefined
    
    var afterHideColumns: js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterHideRows: js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.undefined
    
    var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterLoadData: js.UndefOr[
        js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    var afterMergeCells: js.UndefOr[
        js.Function3[/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ] = js.undefined
    
    var afterModifyTransformEnd: js.UndefOr[
        js.Function3[
          /* coords */ typings.handsontable.coordsMod.default, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ] = js.undefined
    
    var afterModifyTransformStart: js.UndefOr[
        js.Function3[
          /* coords */ typings.handsontable.coordsMod.default, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ] = js.undefined
    
    var afterMomentumScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterNamedExpressionAdded: js.UndefOr[
        js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
      ] = js.undefined
    
    var afterNamedExpressionRemoved: js.UndefOr[
        js.Function2[/* namedExpressionName */ String, /* changes */ js.Array[js.Object], Unit]
      ] = js.undefined
    
    var afterOnCellContextMenu: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var afterOnCellMouseDown: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var afterOnCellMouseOut: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var afterOnCellMouseOver: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var afterOnCellMouseUp: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var afterPaste: js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ] = js.undefined
    
    var afterPluginsInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterRedo: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var afterRedoStackChange: js.UndefOr[
        js.Function2[
          /* undoneActionsBefore */ js.Array[Action], 
          /* undoneActionsAfter */ js.Array[Action], 
          Unit
        ]
      ] = js.undefined
    
    var afterRefreshDimensions: js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterRemoveCellMeta: js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
      ] = js.undefined
    
    var afterRemoveCol: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ] = js.undefined
    
    var afterRemoveRow: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalRows */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ] = js.undefined
    
    var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
    
    var afterRenderer: js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* column */ Double, 
          /* prop */ String | Double, 
          /* value */ String, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ] = js.undefined
    
    var afterRowMove: js.UndefOr[
        js.Function5[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterRowResize: js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
      ] = js.undefined
    
    var afterScrollHorizontally: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterScrollVertically: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterSelection: js.UndefOr[
        js.Function6[
          /* row */ Double, 
          /* column */ Double, 
          /* row2 */ Double, 
          /* column2 */ Double, 
          /* preventScrolling */ Value, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var afterSelectionByProp: js.UndefOr[
        js.Function6[
          /* row */ Double, 
          /* prop */ String, 
          /* row2 */ Double, 
          /* prop2 */ String, 
          /* preventScrolling */ Value, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var afterSelectionEnd: js.UndefOr[
        js.Function5[
          /* row */ Double, 
          /* column */ Double, 
          /* row2 */ Double, 
          /* column2 */ Double, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var afterSelectionEndByProp: js.UndefOr[
        js.Function5[
          /* row */ Double, 
          /* prop */ String, 
          /* row2 */ Double, 
          /* prop2 */ String, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var afterSetCellMeta: js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
      ] = js.undefined
    
    var afterSetDataAtCell: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var afterSetDataAtRowProp: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var afterSetSourceDataAtCell: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var afterSheetAdded: js.UndefOr[js.Function1[/* addedSheetDisplayName */ String, Unit]] = js.undefined
    
    var afterSheetRemoved: js.UndefOr[
        js.Function2[/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object], Unit]
      ] = js.undefined
    
    var afterSheetRenamed: js.UndefOr[js.Function2[/* oldDisplayName */ String, /* newDisplayName */ String, Unit]] = js.undefined
    
    var afterTrimRow: js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterUndo: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var afterUndoStackChange: js.UndefOr[
        js.Function2[
          /* doneActionsBefore */ js.Array[Action], 
          /* doneActionsAfter */ js.Array[Action], 
          Unit
        ]
      ] = js.undefined
    
    var afterUnhideColumns: js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterUnhideRows: js.UndefOr[
        js.Function4[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterUnlisten: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]] = js.undefined
    
    var afterUntrimRow: js.UndefOr[
        js.Function4[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var afterUpdateData: js.UndefOr[
        js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    var afterUpdateSettings: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]] = js.undefined
    
    var afterValidate: js.UndefOr[
        js.Function5[
          /* isValid */ Boolean, 
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ ChangeSource, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var afterViewRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
    
    var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
    
    var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
    
    var beforeAddChild: js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ js.UndefOr[RowObject], 
          /* index */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    var beforeAutofill: js.UndefOr[
        js.Function4[
          /* selectionData */ js.Array[js.Array[CellValue]], 
          /* sourceRange */ default, 
          /* targetRange */ default, 
          /* direction */ up | down | left | right, 
          js.Array[js.Array[CellValue]] | Boolean | Unit
        ]
      ] = js.undefined
    
    var beforeAutofillInsidePopulate: js.UndefOr[
        js.Function4[
          /* index */ typings.handsontable.coordsMod.default, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[Any], 
          Unit
        ]
      ] = js.undefined
    
    var beforeCellAlignment: js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[default], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ] = js.undefined
    
    var beforeChange: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ] = js.undefined
    
    var beforeChangeRender: js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ] = js.undefined
    
    var beforeColumnCollapse: js.UndefOr[
        js.Function3[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeColumnExpand: js.UndefOr[
        js.Function3[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeColumnMove: js.UndefOr[
        js.Function4[
          /* movedColumns */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeColumnResize: js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
      ] = js.undefined
    
    var beforeColumnSort: js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeContextMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.undefined
    
    var beforeContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.undefined
    
    var beforeCopy: js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeCreateCol: js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeCreateRow: js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ] = js.undefined
    
    var beforeCut: js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.undefined
    
    var beforeDrawBorders: js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ] = js.undefined
    
    var beforeDropdownMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.undefined
    
    var beforeDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
    
    var beforeFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]] = js.undefined
    
    var beforeGetCellMeta: js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ] = js.undefined
    
    var beforeHideColumns: js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeHideRows: js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeHighlightingColumnHeader: js.UndefOr[
        js.Function3[
          /* column */ Double, 
          /* headerLevel */ Double, 
          /* highlightMeta */ HookHighlightColumnHeaderMeta, 
          Double | Unit
        ]
      ] = js.undefined
    
    var beforeHighlightingRowHeader: js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* headerLevel */ Double, 
          /* highlightMeta */ HookHighlightRowHeaderMeta, 
          Double | Unit
        ]
      ] = js.undefined
    
    var beforeInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]] = js.undefined
    
    var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
    
    var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.undefined
    
    var beforeLoadData: js.UndefOr[
        js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    var beforeMergeCells: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]] = js.undefined
    
    var beforeOnCellContextMenu: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var beforeOnCellMouseDown: js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ] = js.undefined
    
    var beforeOnCellMouseOut: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var beforeOnCellMouseOver: js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ] = js.undefined
    
    var beforeOnCellMouseUp: js.UndefOr[
        js.Function3[
          /* event */ MouseEvent, 
          /* coords */ typings.handsontable.coordsMod.default, 
          /* TD */ HTMLTableCellElement, 
          Unit
        ]
      ] = js.undefined
    
    var beforePaste: js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeRedo: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var beforeRedoStackChange: js.UndefOr[js.Function1[/* undoneActions */ js.Array[Action], Unit]] = js.undefined
    
    var beforeRefreshDimensions: js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var beforeRemoveCellClassNames: js.UndefOr[js.Function0[js.Array[String] | Unit]] = js.undefined
    
    var beforeRemoveCellMeta: js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any, Unit]
      ] = js.undefined
    
    var beforeRemoveCol: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ] = js.undefined
    
    var beforeRemoveRow: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* amount */ Double, 
          /* physicalColumns */ js.Array[Double], 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ] = js.undefined
    
    var beforeRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
    
    var beforeRenderer: js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* column */ Double, 
          /* prop */ String | Double, 
          /* value */ CellValue, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ] = js.undefined
    
    var beforeRowMove: js.UndefOr[
        js.Function4[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ js.UndefOr[Double], 
          /* movePossible */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var beforeRowResize: js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
      ] = js.undefined
    
    var beforeSetCellMeta: js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any, Boolean | Unit]
      ] = js.undefined
    
    var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]] = js.undefined
    
    var beforeSetRangeStart: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]] = js.undefined
    
    var beforeSetRangeStartOnly: js.UndefOr[js.Function1[/* coords */ typings.handsontable.coordsMod.default, Unit]] = js.undefined
    
    var beforeStretchingColumnWidth: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]] = js.undefined
    
    var beforeTouchScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeTrimRow: js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeUndo: js.UndefOr[js.Function1[/* action */ Action, Unit]] = js.undefined
    
    var beforeUndoStackChange: js.UndefOr[
        js.Function2[/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String], Unit]
      ] = js.undefined
    
    var beforeUnhideColumns: js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeUnhideRows: js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ default, /* auto */ Boolean, Unit]] = js.undefined
    
    var beforeUntrimRow: js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit | Boolean
        ]
      ] = js.undefined
    
    var beforeUpdateData: js.UndefOr[
        js.Function3[
          /* sourceData */ js.Array[CellValue], 
          /* initialLoad */ Boolean, 
          /* source */ js.UndefOr[String], 
          Unit
        ]
      ] = js.undefined
    
    var beforeValidate: js.UndefOr[
        js.Function4[
          /* value */ CellValue, 
          /* row */ Double, 
          /* prop */ String | Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit
        ]
      ] = js.undefined
    
    var beforeValueRender: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]] = js.undefined
    
    var beforeViewRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]] = js.undefined
    
    var construct: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var modifyAutoColumnSizeSeed: js.UndefOr[
        js.Function3[
          /* seed */ String, 
          /* cellProperties */ CellProperties, 
          /* cellValue */ CellValue, 
          String | Unit
        ]
      ] = js.undefined
    
    var modifyAutofillRange: js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ] = js.undefined
    
    var modifyColHeader: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.undefined
    
    var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* column */ Double, Unit]] = js.undefined
    
    var modifyColumnHeaderHeight: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]] = js.undefined
    
    var modifyData: js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ] = js.undefined
    
    var modifyGetCellCoords: js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ] = js.undefined
    
    var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.undefined
    
    var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
    
    var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
    
    var modifySourceData: js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ] = js.undefined
    
    var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]] = js.undefined
    
    var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ typings.handsontable.coordsMod.default, Unit]] = js.undefined
    
    var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]] = js.undefined
    
    var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Unit]] = js.undefined
  }
  object Events {
    
    inline def apply(): Events = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setAfterAddChild(
        value: (/* parent */ RowObject, /* element */ js.UndefOr[RowObject], /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "afterAddChild", js.Any.fromFunction3(value))
      
      inline def setAfterAddChildUndefined: Self = StObject.set(x, "afterAddChild", js.undefined)
      
      inline def setAfterAutofill(
        value: (/* fillData */ js.Array[js.Array[CellValue]], /* sourceRange */ default, /* targetRange */ default, /* direction */ up | down | left | right) => Unit
      ): Self = StObject.set(x, "afterAutofill", js.Any.fromFunction4(value))
      
      inline def setAfterAutofillUndefined: Self = StObject.set(x, "afterAutofill", js.undefined)
      
      inline def setAfterBeginEditing(value: (/* row */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "afterBeginEditing", js.Any.fromFunction2(value))
      
      inline def setAfterBeginEditingUndefined: Self = StObject.set(x, "afterBeginEditing", js.undefined)
      
      inline def setAfterCellMetaReset(value: () => Unit): Self = StObject.set(x, "afterCellMetaReset", js.Any.fromFunction0(value))
      
      inline def setAfterCellMetaResetUndefined: Self = StObject.set(x, "afterCellMetaReset", js.undefined)
      
      inline def setAfterChange(value: (/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource) => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction2(value))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setAfterChangesObserved(value: () => Unit): Self = StObject.set(x, "afterChangesObserved", js.Any.fromFunction0(value))
      
      inline def setAfterChangesObservedUndefined: Self = StObject.set(x, "afterChangesObserved", js.undefined)
      
      inline def setAfterColumnCollapse(
        value: (/* currentCollapsedColumns */ js.Array[Double], /* destinationCollapsedColumns */ js.Array[Double], /* collapsePossible */ Boolean, /* successfullyCollapsed */ Boolean) => Unit
      ): Self = StObject.set(x, "afterColumnCollapse", js.Any.fromFunction4(value))
      
      inline def setAfterColumnCollapseUndefined: Self = StObject.set(x, "afterColumnCollapse", js.undefined)
      
      inline def setAfterColumnExpand(
        value: (/* currentCollapsedColumns */ js.Array[Double], /* destinationCollapsedColumns */ js.Array[Double], /* expandPossible */ Boolean, /* successfullyExpanded */ Boolean) => Unit
      ): Self = StObject.set(x, "afterColumnExpand", js.Any.fromFunction4(value))
      
      inline def setAfterColumnExpandUndefined: Self = StObject.set(x, "afterColumnExpand", js.undefined)
      
      inline def setAfterColumnMove(
        value: (/* movedColumns */ js.Array[Double], /* finalIndex */ Double, /* dropIndex */ js.UndefOr[Double], /* movePossible */ Boolean, /* orderChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterColumnMove", js.Any.fromFunction5(value))
      
      inline def setAfterColumnMoveUndefined: Self = StObject.set(x, "afterColumnMove", js.undefined)
      
      inline def setAfterColumnResize(value: (/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean) => Unit): Self = StObject.set(x, "afterColumnResize", js.Any.fromFunction3(value))
      
      inline def setAfterColumnResizeUndefined: Self = StObject.set(x, "afterColumnResize", js.undefined)
      
      inline def setAfterColumnSort(
        value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit
      ): Self = StObject.set(x, "afterColumnSort", js.Any.fromFunction2(value))
      
      inline def setAfterColumnSortUndefined: Self = StObject.set(x, "afterColumnSort", js.undefined)
      
      inline def setAfterContextMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = StObject.set(x, "afterContextMenuDefaultOptions", js.Any.fromFunction1(value))
      
      inline def setAfterContextMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterContextMenuDefaultOptions", js.undefined)
      
      inline def setAfterContextMenuHide(value: /* context */ ContextMenu => Unit): Self = StObject.set(x, "afterContextMenuHide", js.Any.fromFunction1(value))
      
      inline def setAfterContextMenuHideUndefined: Self = StObject.set(x, "afterContextMenuHide", js.undefined)
      
      inline def setAfterContextMenuShow(value: /* context */ ContextMenu => Unit): Self = StObject.set(x, "afterContextMenuShow", js.Any.fromFunction1(value))
      
      inline def setAfterContextMenuShowUndefined: Self = StObject.set(x, "afterContextMenuShow", js.undefined)
      
      inline def setAfterCopy(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = StObject.set(x, "afterCopy", js.Any.fromFunction2(value))
      
      inline def setAfterCopyLimit(
        value: (/* selectedRows */ Double, /* selectedColumns */ Double, /* copyRowsLimit */ Double, /* copyColumnsLimit */ Double) => Unit
      ): Self = StObject.set(x, "afterCopyLimit", js.Any.fromFunction4(value))
      
      inline def setAfterCopyLimitUndefined: Self = StObject.set(x, "afterCopyLimit", js.undefined)
      
      inline def setAfterCopyUndefined: Self = StObject.set(x, "afterCopy", js.undefined)
      
      inline def setAfterCreateCol(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "afterCreateCol", js.Any.fromFunction3(value))
      
      inline def setAfterCreateColUndefined: Self = StObject.set(x, "afterCreateCol", js.undefined)
      
      inline def setAfterCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "afterCreateRow", js.Any.fromFunction3(value))
      
      inline def setAfterCreateRowUndefined: Self = StObject.set(x, "afterCreateRow", js.undefined)
      
      inline def setAfterCut(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = StObject.set(x, "afterCut", js.Any.fromFunction2(value))
      
      inline def setAfterCutUndefined: Self = StObject.set(x, "afterCut", js.undefined)
      
      inline def setAfterDeselect(value: () => Unit): Self = StObject.set(x, "afterDeselect", js.Any.fromFunction0(value))
      
      inline def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
      
      inline def setAfterDestroy(value: () => Unit): Self = StObject.set(x, "afterDestroy", js.Any.fromFunction0(value))
      
      inline def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
      
      inline def setAfterDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = StObject.set(x, "afterDetachChild", js.Any.fromFunction2(value))
      
      inline def setAfterDetachChildUndefined: Self = StObject.set(x, "afterDetachChild", js.undefined)
      
      inline def setAfterDocumentKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "afterDocumentKeyDown", js.Any.fromFunction1(value))
      
      inline def setAfterDocumentKeyDownUndefined: Self = StObject.set(x, "afterDocumentKeyDown", js.undefined)
      
      inline def setAfterDrawSelection(
        value: (/* currentRow */ Double, /* currentColumn */ Double, /* cornersOfSelection */ js.Array[Double], /* layerLevel */ js.UndefOr[Double]) => String | Unit
      ): Self = StObject.set(x, "afterDrawSelection", js.Any.fromFunction4(value))
      
      inline def setAfterDrawSelectionUndefined: Self = StObject.set(x, "afterDrawSelection", js.undefined)
      
      inline def setAfterDropdownMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.Any.fromFunction1(value))
      
      inline def setAfterDropdownMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.undefined)
      
      inline def setAfterDropdownMenuHide(value: /* instance */ DropdownMenu => Unit): Self = StObject.set(x, "afterDropdownMenuHide", js.Any.fromFunction1(value))
      
      inline def setAfterDropdownMenuHideUndefined: Self = StObject.set(x, "afterDropdownMenuHide", js.undefined)
      
      inline def setAfterDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = StObject.set(x, "afterDropdownMenuShow", js.Any.fromFunction1(value))
      
      inline def setAfterDropdownMenuShowUndefined: Self = StObject.set(x, "afterDropdownMenuShow", js.undefined)
      
      inline def setAfterFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit): Self = StObject.set(x, "afterFilter", js.Any.fromFunction1(value))
      
      inline def setAfterFilterUndefined: Self = StObject.set(x, "afterFilter", js.undefined)
      
      inline def setAfterFormulasValuesUpdate(value: /* changes */ js.Array[js.Object] => Unit): Self = StObject.set(x, "afterFormulasValuesUpdate", js.Any.fromFunction1(value))
      
      inline def setAfterFormulasValuesUpdateUndefined: Self = StObject.set(x, "afterFormulasValuesUpdate", js.undefined)
      
      inline def setAfterGetCellMeta(value: (/* row */ Double, /* column */ Double, /* cellProperties */ CellProperties) => Unit): Self = StObject.set(x, "afterGetCellMeta", js.Any.fromFunction3(value))
      
      inline def setAfterGetCellMetaUndefined: Self = StObject.set(x, "afterGetCellMeta", js.undefined)
      
      inline def setAfterGetColHeader(value: (/* column */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = StObject.set(x, "afterGetColHeader", js.Any.fromFunction2(value))
      
      inline def setAfterGetColHeaderUndefined: Self = StObject.set(x, "afterGetColHeader", js.undefined)
      
      inline def setAfterGetColumnHeaderRenderers(
        value: /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
      ): Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.Any.fromFunction1(value))
      
      inline def setAfterGetColumnHeaderRenderersUndefined: Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.undefined)
      
      inline def setAfterGetRowHeader(value: (/* row */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = StObject.set(x, "afterGetRowHeader", js.Any.fromFunction2(value))
      
      inline def setAfterGetRowHeaderRenderers(
        value: /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
      ): Self = StObject.set(x, "afterGetRowHeaderRenderers", js.Any.fromFunction1(value))
      
      inline def setAfterGetRowHeaderRenderersUndefined: Self = StObject.set(x, "afterGetRowHeaderRenderers", js.undefined)
      
      inline def setAfterGetRowHeaderUndefined: Self = StObject.set(x, "afterGetRowHeader", js.undefined)
      
      inline def setAfterHideColumns(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterHideColumns", js.Any.fromFunction4(value))
      
      inline def setAfterHideColumnsUndefined: Self = StObject.set(x, "afterHideColumns", js.undefined)
      
      inline def setAfterHideRows(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterHideRows", js.Any.fromFunction4(value))
      
      inline def setAfterHideRowsUndefined: Self = StObject.set(x, "afterHideRows", js.undefined)
      
      inline def setAfterInit(value: () => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction0(value))
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterLanguageChange(value: /* languageCode */ String => Unit): Self = StObject.set(x, "afterLanguageChange", js.Any.fromFunction1(value))
      
      inline def setAfterLanguageChangeUndefined: Self = StObject.set(x, "afterLanguageChange", js.undefined)
      
      inline def setAfterListen(value: () => Unit): Self = StObject.set(x, "afterListen", js.Any.fromFunction0(value))
      
      inline def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      inline def setAfterLoadData(
        value: (/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, /* source */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "afterLoadData", js.Any.fromFunction3(value))
      
      inline def setAfterLoadDataUndefined: Self = StObject.set(x, "afterLoadData", js.undefined)
      
      inline def setAfterMergeCells(value: (/* cellRange */ default, /* mergeParent */ Settings, /* auto */ Boolean) => Unit): Self = StObject.set(x, "afterMergeCells", js.Any.fromFunction3(value))
      
      inline def setAfterMergeCellsUndefined: Self = StObject.set(x, "afterMergeCells", js.undefined)
      
      inline def setAfterModifyTransformEnd(
        value: (/* coords */ typings.handsontable.coordsMod.default, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
      ): Self = StObject.set(x, "afterModifyTransformEnd", js.Any.fromFunction3(value))
      
      inline def setAfterModifyTransformEndUndefined: Self = StObject.set(x, "afterModifyTransformEnd", js.undefined)
      
      inline def setAfterModifyTransformStart(
        value: (/* coords */ typings.handsontable.coordsMod.default, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
      ): Self = StObject.set(x, "afterModifyTransformStart", js.Any.fromFunction3(value))
      
      inline def setAfterModifyTransformStartUndefined: Self = StObject.set(x, "afterModifyTransformStart", js.undefined)
      
      inline def setAfterMomentumScroll(value: () => Unit): Self = StObject.set(x, "afterMomentumScroll", js.Any.fromFunction0(value))
      
      inline def setAfterMomentumScrollUndefined: Self = StObject.set(x, "afterMomentumScroll", js.undefined)
      
      inline def setAfterNamedExpressionAdded(value: (/* namedExpressionName */ String, /* changes */ js.Array[js.Object]) => Unit): Self = StObject.set(x, "afterNamedExpressionAdded", js.Any.fromFunction2(value))
      
      inline def setAfterNamedExpressionAddedUndefined: Self = StObject.set(x, "afterNamedExpressionAdded", js.undefined)
      
      inline def setAfterNamedExpressionRemoved(value: (/* namedExpressionName */ String, /* changes */ js.Array[js.Object]) => Unit): Self = StObject.set(x, "afterNamedExpressionRemoved", js.Any.fromFunction2(value))
      
      inline def setAfterNamedExpressionRemovedUndefined: Self = StObject.set(x, "afterNamedExpressionRemoved", js.undefined)
      
      inline def setAfterOnCellContextMenu(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "afterOnCellContextMenu", js.Any.fromFunction3(value))
      
      inline def setAfterOnCellContextMenuUndefined: Self = StObject.set(x, "afterOnCellContextMenu", js.undefined)
      
      inline def setAfterOnCellCornerDblClick(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "afterOnCellCornerDblClick", js.Any.fromFunction1(value))
      
      inline def setAfterOnCellCornerDblClickUndefined: Self = StObject.set(x, "afterOnCellCornerDblClick", js.undefined)
      
      inline def setAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Unit): Self = StObject.set(x, "afterOnCellCornerMouseDown", js.Any.fromFunction1(value))
      
      inline def setAfterOnCellCornerMouseDownUndefined: Self = StObject.set(x, "afterOnCellCornerMouseDown", js.undefined)
      
      inline def setAfterOnCellMouseDown(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "afterOnCellMouseDown", js.Any.fromFunction3(value))
      
      inline def setAfterOnCellMouseDownUndefined: Self = StObject.set(x, "afterOnCellMouseDown", js.undefined)
      
      inline def setAfterOnCellMouseOut(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "afterOnCellMouseOut", js.Any.fromFunction3(value))
      
      inline def setAfterOnCellMouseOutUndefined: Self = StObject.set(x, "afterOnCellMouseOut", js.undefined)
      
      inline def setAfterOnCellMouseOver(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "afterOnCellMouseOver", js.Any.fromFunction3(value))
      
      inline def setAfterOnCellMouseOverUndefined: Self = StObject.set(x, "afterOnCellMouseOver", js.undefined)
      
      inline def setAfterOnCellMouseUp(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "afterOnCellMouseUp", js.Any.fromFunction3(value))
      
      inline def setAfterOnCellMouseUpUndefined: Self = StObject.set(x, "afterOnCellMouseUp", js.undefined)
      
      inline def setAfterPaste(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = StObject.set(x, "afterPaste", js.Any.fromFunction2(value))
      
      inline def setAfterPasteUndefined: Self = StObject.set(x, "afterPaste", js.undefined)
      
      inline def setAfterPluginsInitialized(value: () => Unit): Self = StObject.set(x, "afterPluginsInitialized", js.Any.fromFunction0(value))
      
      inline def setAfterPluginsInitializedUndefined: Self = StObject.set(x, "afterPluginsInitialized", js.undefined)
      
      inline def setAfterRedo(value: /* action */ Action => Unit): Self = StObject.set(x, "afterRedo", js.Any.fromFunction1(value))
      
      inline def setAfterRedoStackChange(
        value: (/* undoneActionsBefore */ js.Array[Action], /* undoneActionsAfter */ js.Array[Action]) => Unit
      ): Self = StObject.set(x, "afterRedoStackChange", js.Any.fromFunction2(value))
      
      inline def setAfterRedoStackChangeUndefined: Self = StObject.set(x, "afterRedoStackChange", js.undefined)
      
      inline def setAfterRedoUndefined: Self = StObject.set(x, "afterRedo", js.undefined)
      
      inline def setAfterRefreshDimensions(
        value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterRefreshDimensions", js.Any.fromFunction3(value))
      
      inline def setAfterRefreshDimensionsUndefined: Self = StObject.set(x, "afterRefreshDimensions", js.undefined)
      
      inline def setAfterRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any) => Unit): Self = StObject.set(x, "afterRemoveCellMeta", js.Any.fromFunction4(value))
      
      inline def setAfterRemoveCellMetaUndefined: Self = StObject.set(x, "afterRemoveCellMeta", js.undefined)
      
      inline def setAfterRemoveCol(
        value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
      ): Self = StObject.set(x, "afterRemoveCol", js.Any.fromFunction4(value))
      
      inline def setAfterRemoveColUndefined: Self = StObject.set(x, "afterRemoveCol", js.undefined)
      
      inline def setAfterRemoveRow(
        value: (/* index */ Double, /* amount */ Double, /* physicalRows */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
      ): Self = StObject.set(x, "afterRemoveRow", js.Any.fromFunction4(value))
      
      inline def setAfterRemoveRowUndefined: Self = StObject.set(x, "afterRemoveRow", js.undefined)
      
      inline def setAfterRender(value: /* isForced */ Boolean => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction1(value))
      
      inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
      
      inline def setAfterRenderer(
        value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* column */ Double, /* prop */ String | Double, /* value */ String, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "afterRenderer", js.Any.fromFunction6(value))
      
      inline def setAfterRendererUndefined: Self = StObject.set(x, "afterRenderer", js.undefined)
      
      inline def setAfterRowMove(
        value: (/* movedRows */ js.Array[Double], /* finalIndex */ Double, /* dropIndex */ js.UndefOr[Double], /* movePossible */ Boolean, /* orderChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterRowMove", js.Any.fromFunction5(value))
      
      inline def setAfterRowMoveUndefined: Self = StObject.set(x, "afterRowMove", js.undefined)
      
      inline def setAfterRowResize(value: (/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean) => Unit): Self = StObject.set(x, "afterRowResize", js.Any.fromFunction3(value))
      
      inline def setAfterRowResizeUndefined: Self = StObject.set(x, "afterRowResize", js.undefined)
      
      inline def setAfterScrollHorizontally(value: () => Unit): Self = StObject.set(x, "afterScrollHorizontally", js.Any.fromFunction0(value))
      
      inline def setAfterScrollHorizontallyUndefined: Self = StObject.set(x, "afterScrollHorizontally", js.undefined)
      
      inline def setAfterScrollVertically(value: () => Unit): Self = StObject.set(x, "afterScrollVertically", js.Any.fromFunction0(value))
      
      inline def setAfterScrollVerticallyUndefined: Self = StObject.set(x, "afterScrollVertically", js.undefined)
      
      inline def setAfterSelection(
        value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
      ): Self = StObject.set(x, "afterSelection", js.Any.fromFunction6(value))
      
      inline def setAfterSelectionByProp(
        value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
      ): Self = StObject.set(x, "afterSelectionByProp", js.Any.fromFunction6(value))
      
      inline def setAfterSelectionByPropUndefined: Self = StObject.set(x, "afterSelectionByProp", js.undefined)
      
      inline def setAfterSelectionEnd(
        value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* selectionLayerLevel */ Double) => Unit
      ): Self = StObject.set(x, "afterSelectionEnd", js.Any.fromFunction5(value))
      
      inline def setAfterSelectionEndByProp(
        value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* selectionLayerLevel */ Double) => Unit
      ): Self = StObject.set(x, "afterSelectionEndByProp", js.Any.fromFunction5(value))
      
      inline def setAfterSelectionEndByPropUndefined: Self = StObject.set(x, "afterSelectionEndByProp", js.undefined)
      
      inline def setAfterSelectionEndUndefined: Self = StObject.set(x, "afterSelectionEnd", js.undefined)
      
      inline def setAfterSelectionUndefined: Self = StObject.set(x, "afterSelection", js.undefined)
      
      inline def setAfterSetCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any) => Unit): Self = StObject.set(x, "afterSetCellMeta", js.Any.fromFunction4(value))
      
      inline def setAfterSetCellMetaUndefined: Self = StObject.set(x, "afterSetCellMeta", js.undefined)
      
      inline def setAfterSetDataAtCell(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "afterSetDataAtCell", js.Any.fromFunction2(value))
      
      inline def setAfterSetDataAtCellUndefined: Self = StObject.set(x, "afterSetDataAtCell", js.undefined)
      
      inline def setAfterSetDataAtRowProp(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "afterSetDataAtRowProp", js.Any.fromFunction2(value))
      
      inline def setAfterSetDataAtRowPropUndefined: Self = StObject.set(x, "afterSetDataAtRowProp", js.undefined)
      
      inline def setAfterSetSourceDataAtCell(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "afterSetSourceDataAtCell", js.Any.fromFunction2(value))
      
      inline def setAfterSetSourceDataAtCellUndefined: Self = StObject.set(x, "afterSetSourceDataAtCell", js.undefined)
      
      inline def setAfterSheetAdded(value: /* addedSheetDisplayName */ String => Unit): Self = StObject.set(x, "afterSheetAdded", js.Any.fromFunction1(value))
      
      inline def setAfterSheetAddedUndefined: Self = StObject.set(x, "afterSheetAdded", js.undefined)
      
      inline def setAfterSheetRemoved(value: (/* removedSheetDisplayName */ String, /* changes */ js.Array[js.Object]) => Unit): Self = StObject.set(x, "afterSheetRemoved", js.Any.fromFunction2(value))
      
      inline def setAfterSheetRemovedUndefined: Self = StObject.set(x, "afterSheetRemoved", js.undefined)
      
      inline def setAfterSheetRenamed(value: (/* oldDisplayName */ String, /* newDisplayName */ String) => Unit): Self = StObject.set(x, "afterSheetRenamed", js.Any.fromFunction2(value))
      
      inline def setAfterSheetRenamedUndefined: Self = StObject.set(x, "afterSheetRenamed", js.undefined)
      
      inline def setAfterTrimRow(
        value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterTrimRow", js.Any.fromFunction4(value))
      
      inline def setAfterTrimRowUndefined: Self = StObject.set(x, "afterTrimRow", js.undefined)
      
      inline def setAfterUndo(value: /* action */ Action => Unit): Self = StObject.set(x, "afterUndo", js.Any.fromFunction1(value))
      
      inline def setAfterUndoStackChange(value: (/* doneActionsBefore */ js.Array[Action], /* doneActionsAfter */ js.Array[Action]) => Unit): Self = StObject.set(x, "afterUndoStackChange", js.Any.fromFunction2(value))
      
      inline def setAfterUndoStackChangeUndefined: Self = StObject.set(x, "afterUndoStackChange", js.undefined)
      
      inline def setAfterUndoUndefined: Self = StObject.set(x, "afterUndo", js.undefined)
      
      inline def setAfterUnhideColumns(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterUnhideColumns", js.Any.fromFunction4(value))
      
      inline def setAfterUnhideColumnsUndefined: Self = StObject.set(x, "afterUnhideColumns", js.undefined)
      
      inline def setAfterUnhideRows(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterUnhideRows", js.Any.fromFunction4(value))
      
      inline def setAfterUnhideRowsUndefined: Self = StObject.set(x, "afterUnhideRows", js.undefined)
      
      inline def setAfterUnlisten(value: () => Unit): Self = StObject.set(x, "afterUnlisten", js.Any.fromFunction0(value))
      
      inline def setAfterUnlistenUndefined: Self = StObject.set(x, "afterUnlisten", js.undefined)
      
      inline def setAfterUnmergeCells(value: (/* cellRange */ default, /* auto */ Boolean) => Unit): Self = StObject.set(x, "afterUnmergeCells", js.Any.fromFunction2(value))
      
      inline def setAfterUnmergeCellsUndefined: Self = StObject.set(x, "afterUnmergeCells", js.undefined)
      
      inline def setAfterUntrimRow(
        value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
      ): Self = StObject.set(x, "afterUntrimRow", js.Any.fromFunction4(value))
      
      inline def setAfterUntrimRowUndefined: Self = StObject.set(x, "afterUntrimRow", js.undefined)
      
      inline def setAfterUpdateData(
        value: (/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, /* source */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "afterUpdateData", js.Any.fromFunction3(value))
      
      inline def setAfterUpdateDataUndefined: Self = StObject.set(x, "afterUpdateData", js.undefined)
      
      inline def setAfterUpdateSettings(value: /* newSettings */ GridSettings => Unit): Self = StObject.set(x, "afterUpdateSettings", js.Any.fromFunction1(value))
      
      inline def setAfterUpdateSettingsUndefined: Self = StObject.set(x, "afterUpdateSettings", js.undefined)
      
      inline def setAfterValidate(
        value: (/* isValid */ Boolean, /* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ ChangeSource) => Unit | Boolean
      ): Self = StObject.set(x, "afterValidate", js.Any.fromFunction5(value))
      
      inline def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
      
      inline def setAfterViewRender(value: /* isForced */ Boolean => Unit): Self = StObject.set(x, "afterViewRender", js.Any.fromFunction1(value))
      
      inline def setAfterViewRenderUndefined: Self = StObject.set(x, "afterViewRender", js.undefined)
      
      inline def setAfterViewportColumnCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.Any.fromFunction1(value))
      
      inline def setAfterViewportColumnCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.undefined)
      
      inline def setAfterViewportRowCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.Any.fromFunction1(value))
      
      inline def setAfterViewportRowCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.undefined)
      
      inline def setBeforeAddChild(
        value: (/* parent */ RowObject, /* element */ js.UndefOr[RowObject], /* index */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "beforeAddChild", js.Any.fromFunction3(value))
      
      inline def setBeforeAddChildUndefined: Self = StObject.set(x, "beforeAddChild", js.undefined)
      
      inline def setBeforeAutofill(
        value: (/* selectionData */ js.Array[js.Array[CellValue]], /* sourceRange */ default, /* targetRange */ default, /* direction */ up | down | left | right) => js.Array[js.Array[CellValue]] | Boolean | Unit
      ): Self = StObject.set(x, "beforeAutofill", js.Any.fromFunction4(value))
      
      inline def setBeforeAutofillInsidePopulate(
        value: (/* index */ typings.handsontable.coordsMod.default, /* direction */ up | down | left | right, /* input */ js.Array[js.Array[CellValue]], /* deltas */ js.Array[Any]) => Unit
      ): Self = StObject.set(x, "beforeAutofillInsidePopulate", js.Any.fromFunction4(value))
      
      inline def setBeforeAutofillInsidePopulateUndefined: Self = StObject.set(x, "beforeAutofillInsidePopulate", js.undefined)
      
      inline def setBeforeAutofillUndefined: Self = StObject.set(x, "beforeAutofill", js.undefined)
      
      inline def setBeforeCellAlignment(
        value: (/* stateBefore */ NumberDictionary[js.Array[String]], /* range */ js.Array[default], /* type */ horizontal | vertical, /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom) => Unit
      ): Self = StObject.set(x, "beforeCellAlignment", js.Any.fromFunction4(value))
      
      inline def setBeforeCellAlignmentUndefined: Self = StObject.set(x, "beforeCellAlignment", js.undefined)
      
      inline def setBeforeChange(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit | Boolean): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      inline def setBeforeChangeRender(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit): Self = StObject.set(x, "beforeChangeRender", js.Any.fromFunction2(value))
      
      inline def setBeforeChangeRenderUndefined: Self = StObject.set(x, "beforeChangeRender", js.undefined)
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setBeforeColumnCollapse(
        value: (/* currentCollapsedColumn */ js.Array[Double], /* destinationCollapsedColumns */ js.Array[Double], /* collapsePossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeColumnCollapse", js.Any.fromFunction3(value))
      
      inline def setBeforeColumnCollapseUndefined: Self = StObject.set(x, "beforeColumnCollapse", js.undefined)
      
      inline def setBeforeColumnExpand(
        value: (/* currentCollapsedColumn */ js.Array[Double], /* destinationCollapsedColumns */ js.Array[Double], /* expandPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeColumnExpand", js.Any.fromFunction3(value))
      
      inline def setBeforeColumnExpandUndefined: Self = StObject.set(x, "beforeColumnExpand", js.undefined)
      
      inline def setBeforeColumnMove(
        value: (/* movedColumns */ js.Array[Double], /* finalIndex */ Double, /* dropIndex */ js.UndefOr[Double], /* movePossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeColumnMove", js.Any.fromFunction4(value))
      
      inline def setBeforeColumnMoveUndefined: Self = StObject.set(x, "beforeColumnMove", js.undefined)
      
      inline def setBeforeColumnResize(value: (/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean) => Unit | Double): Self = StObject.set(x, "beforeColumnResize", js.Any.fromFunction3(value))
      
      inline def setBeforeColumnResizeUndefined: Self = StObject.set(x, "beforeColumnResize", js.undefined)
      
      inline def setBeforeColumnSort(
        value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit | Boolean
      ): Self = StObject.set(x, "beforeColumnSort", js.Any.fromFunction2(value))
      
      inline def setBeforeColumnSortUndefined: Self = StObject.set(x, "beforeColumnSort", js.undefined)
      
      inline def setBeforeContextMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = StObject.set(x, "beforeContextMenuSetItems", js.Any.fromFunction1(value))
      
      inline def setBeforeContextMenuSetItemsUndefined: Self = StObject.set(x, "beforeContextMenuSetItems", js.undefined)
      
      inline def setBeforeContextMenuShow(value: /* context */ ContextMenu => Unit): Self = StObject.set(x, "beforeContextMenuShow", js.Any.fromFunction1(value))
      
      inline def setBeforeContextMenuShowUndefined: Self = StObject.set(x, "beforeContextMenuShow", js.undefined)
      
      inline def setBeforeCopy(
        value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
      ): Self = StObject.set(x, "beforeCopy", js.Any.fromFunction2(value))
      
      inline def setBeforeCopyUndefined: Self = StObject.set(x, "beforeCopy", js.undefined)
      
      inline def setBeforeCreateCol(
        value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit | Boolean
      ): Self = StObject.set(x, "beforeCreateCol", js.Any.fromFunction3(value))
      
      inline def setBeforeCreateColUndefined: Self = StObject.set(x, "beforeCreateCol", js.undefined)
      
      inline def setBeforeCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = StObject.set(x, "beforeCreateRow", js.Any.fromFunction3(value))
      
      inline def setBeforeCreateRowUndefined: Self = StObject.set(x, "beforeCreateRow", js.undefined)
      
      inline def setBeforeCut(
        value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
      ): Self = StObject.set(x, "beforeCut", js.Any.fromFunction2(value))
      
      inline def setBeforeCutUndefined: Self = StObject.set(x, "beforeCut", js.undefined)
      
      inline def setBeforeDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = StObject.set(x, "beforeDetachChild", js.Any.fromFunction2(value))
      
      inline def setBeforeDetachChildUndefined: Self = StObject.set(x, "beforeDetachChild", js.undefined)
      
      inline def setBeforeDrawBorders(
        value: (/* corners */ js.Array[Double], /* borderClassName */ js.UndefOr[current | area | highlight]) => Unit
      ): Self = StObject.set(x, "beforeDrawBorders", js.Any.fromFunction2(value))
      
      inline def setBeforeDrawBordersUndefined: Self = StObject.set(x, "beforeDrawBorders", js.undefined)
      
      inline def setBeforeDropdownMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = StObject.set(x, "beforeDropdownMenuSetItems", js.Any.fromFunction1(value))
      
      inline def setBeforeDropdownMenuSetItemsUndefined: Self = StObject.set(x, "beforeDropdownMenuSetItems", js.undefined)
      
      inline def setBeforeDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = StObject.set(x, "beforeDropdownMenuShow", js.Any.fromFunction1(value))
      
      inline def setBeforeDropdownMenuShowUndefined: Self = StObject.set(x, "beforeDropdownMenuShow", js.undefined)
      
      inline def setBeforeFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit | Boolean): Self = StObject.set(x, "beforeFilter", js.Any.fromFunction1(value))
      
      inline def setBeforeFilterUndefined: Self = StObject.set(x, "beforeFilter", js.undefined)
      
      inline def setBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit): Self = StObject.set(x, "beforeGetCellMeta", js.Any.fromFunction3(value))
      
      inline def setBeforeGetCellMetaUndefined: Self = StObject.set(x, "beforeGetCellMeta", js.undefined)
      
      inline def setBeforeHideColumns(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeHideColumns", js.Any.fromFunction3(value))
      
      inline def setBeforeHideColumnsUndefined: Self = StObject.set(x, "beforeHideColumns", js.undefined)
      
      inline def setBeforeHideRows(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeHideRows", js.Any.fromFunction3(value))
      
      inline def setBeforeHideRowsUndefined: Self = StObject.set(x, "beforeHideRows", js.undefined)
      
      inline def setBeforeHighlightingColumnHeader(
        value: (/* column */ Double, /* headerLevel */ Double, /* highlightMeta */ HookHighlightColumnHeaderMeta) => Double | Unit
      ): Self = StObject.set(x, "beforeHighlightingColumnHeader", js.Any.fromFunction3(value))
      
      inline def setBeforeHighlightingColumnHeaderUndefined: Self = StObject.set(x, "beforeHighlightingColumnHeader", js.undefined)
      
      inline def setBeforeHighlightingRowHeader(
        value: (/* row */ Double, /* headerLevel */ Double, /* highlightMeta */ HookHighlightRowHeaderMeta) => Double | Unit
      ): Self = StObject.set(x, "beforeHighlightingRowHeader", js.Any.fromFunction3(value))
      
      inline def setBeforeHighlightingRowHeaderUndefined: Self = StObject.set(x, "beforeHighlightingRowHeader", js.undefined)
      
      inline def setBeforeInit(value: () => Unit): Self = StObject.set(x, "beforeInit", js.Any.fromFunction0(value))
      
      inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
      
      inline def setBeforeInitWalkontable(value: /* walkontableConfig */ js.Object => Unit): Self = StObject.set(x, "beforeInitWalkontable", js.Any.fromFunction1(value))
      
      inline def setBeforeInitWalkontableUndefined: Self = StObject.set(x, "beforeInitWalkontable", js.undefined)
      
      inline def setBeforeKeyDown(value: /* event */ KeyboardEvent => Unit): Self = StObject.set(x, "beforeKeyDown", js.Any.fromFunction1(value))
      
      inline def setBeforeKeyDownUndefined: Self = StObject.set(x, "beforeKeyDown", js.undefined)
      
      inline def setBeforeLanguageChange(value: /* languageCode */ String => Unit): Self = StObject.set(x, "beforeLanguageChange", js.Any.fromFunction1(value))
      
      inline def setBeforeLanguageChangeUndefined: Self = StObject.set(x, "beforeLanguageChange", js.undefined)
      
      inline def setBeforeLoadData(
        value: (/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, /* source */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "beforeLoadData", js.Any.fromFunction3(value))
      
      inline def setBeforeLoadDataUndefined: Self = StObject.set(x, "beforeLoadData", js.undefined)
      
      inline def setBeforeMergeCells(value: (/* cellRange */ default, /* auto */ Boolean) => Unit): Self = StObject.set(x, "beforeMergeCells", js.Any.fromFunction2(value))
      
      inline def setBeforeMergeCellsUndefined: Self = StObject.set(x, "beforeMergeCells", js.undefined)
      
      inline def setBeforeOnCellContextMenu(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "beforeOnCellContextMenu", js.Any.fromFunction3(value))
      
      inline def setBeforeOnCellContextMenuUndefined: Self = StObject.set(x, "beforeOnCellContextMenu", js.undefined)
      
      inline def setBeforeOnCellMouseDown(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
      ): Self = StObject.set(x, "beforeOnCellMouseDown", js.Any.fromFunction4(value))
      
      inline def setBeforeOnCellMouseDownUndefined: Self = StObject.set(x, "beforeOnCellMouseDown", js.undefined)
      
      inline def setBeforeOnCellMouseOut(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "beforeOnCellMouseOut", js.Any.fromFunction3(value))
      
      inline def setBeforeOnCellMouseOutUndefined: Self = StObject.set(x, "beforeOnCellMouseOut", js.undefined)
      
      inline def setBeforeOnCellMouseOver(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
      ): Self = StObject.set(x, "beforeOnCellMouseOver", js.Any.fromFunction4(value))
      
      inline def setBeforeOnCellMouseOverUndefined: Self = StObject.set(x, "beforeOnCellMouseOver", js.undefined)
      
      inline def setBeforeOnCellMouseUp(
        value: (/* event */ MouseEvent, /* coords */ typings.handsontable.coordsMod.default, /* TD */ HTMLTableCellElement) => Unit
      ): Self = StObject.set(x, "beforeOnCellMouseUp", js.Any.fromFunction3(value))
      
      inline def setBeforeOnCellMouseUpUndefined: Self = StObject.set(x, "beforeOnCellMouseUp", js.undefined)
      
      inline def setBeforePaste(
        value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
      ): Self = StObject.set(x, "beforePaste", js.Any.fromFunction2(value))
      
      inline def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
      
      inline def setBeforeRedo(value: /* action */ Action => Unit): Self = StObject.set(x, "beforeRedo", js.Any.fromFunction1(value))
      
      inline def setBeforeRedoStackChange(value: /* undoneActions */ js.Array[Action] => Unit): Self = StObject.set(x, "beforeRedoStackChange", js.Any.fromFunction1(value))
      
      inline def setBeforeRedoStackChangeUndefined: Self = StObject.set(x, "beforeRedoStackChange", js.undefined)
      
      inline def setBeforeRedoUndefined: Self = StObject.set(x, "beforeRedo", js.undefined)
      
      inline def setBeforeRefreshDimensions(
        value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ Boolean) => Boolean | Unit
      ): Self = StObject.set(x, "beforeRefreshDimensions", js.Any.fromFunction3(value))
      
      inline def setBeforeRefreshDimensionsUndefined: Self = StObject.set(x, "beforeRefreshDimensions", js.undefined)
      
      inline def setBeforeRemoveCellClassNames(value: () => js.Array[String] | Unit): Self = StObject.set(x, "beforeRemoveCellClassNames", js.Any.fromFunction0(value))
      
      inline def setBeforeRemoveCellClassNamesUndefined: Self = StObject.set(x, "beforeRemoveCellClassNames", js.undefined)
      
      inline def setBeforeRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ Any) => Unit): Self = StObject.set(x, "beforeRemoveCellMeta", js.Any.fromFunction4(value))
      
      inline def setBeforeRemoveCellMetaUndefined: Self = StObject.set(x, "beforeRemoveCellMeta", js.undefined)
      
      inline def setBeforeRemoveCol(
        value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
      ): Self = StObject.set(x, "beforeRemoveCol", js.Any.fromFunction4(value))
      
      inline def setBeforeRemoveColUndefined: Self = StObject.set(x, "beforeRemoveCol", js.undefined)
      
      inline def setBeforeRemoveRow(
        value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
      ): Self = StObject.set(x, "beforeRemoveRow", js.Any.fromFunction4(value))
      
      inline def setBeforeRemoveRowUndefined: Self = StObject.set(x, "beforeRemoveRow", js.undefined)
      
      inline def setBeforeRender(value: /* isForced */ Boolean => Unit): Self = StObject.set(x, "beforeRender", js.Any.fromFunction1(value))
      
      inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
      
      inline def setBeforeRenderer(
        value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* column */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => Unit
      ): Self = StObject.set(x, "beforeRenderer", js.Any.fromFunction6(value))
      
      inline def setBeforeRendererUndefined: Self = StObject.set(x, "beforeRenderer", js.undefined)
      
      inline def setBeforeRowMove(
        value: (/* movedRows */ js.Array[Double], /* finalIndex */ Double, /* dropIndex */ js.UndefOr[Double], /* movePossible */ Boolean) => Unit
      ): Self = StObject.set(x, "beforeRowMove", js.Any.fromFunction4(value))
      
      inline def setBeforeRowMoveUndefined: Self = StObject.set(x, "beforeRowMove", js.undefined)
      
      inline def setBeforeRowResize(value: (/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean) => Double | Unit): Self = StObject.set(x, "beforeRowResize", js.Any.fromFunction3(value))
      
      inline def setBeforeRowResizeUndefined: Self = StObject.set(x, "beforeRowResize", js.undefined)
      
      inline def setBeforeSetCellMeta(value: (/* row */ Double, /* col */ Double, /* key */ String, /* value */ Any) => Boolean | Unit): Self = StObject.set(x, "beforeSetCellMeta", js.Any.fromFunction4(value))
      
      inline def setBeforeSetCellMetaUndefined: Self = StObject.set(x, "beforeSetCellMeta", js.undefined)
      
      inline def setBeforeSetRangeEnd(value: /* coords */ typings.handsontable.coordsMod.default => Unit): Self = StObject.set(x, "beforeSetRangeEnd", js.Any.fromFunction1(value))
      
      inline def setBeforeSetRangeEndUndefined: Self = StObject.set(x, "beforeSetRangeEnd", js.undefined)
      
      inline def setBeforeSetRangeStart(value: /* coords */ typings.handsontable.coordsMod.default => Unit): Self = StObject.set(x, "beforeSetRangeStart", js.Any.fromFunction1(value))
      
      inline def setBeforeSetRangeStartOnly(value: /* coords */ typings.handsontable.coordsMod.default => Unit): Self = StObject.set(x, "beforeSetRangeStartOnly", js.Any.fromFunction1(value))
      
      inline def setBeforeSetRangeStartOnlyUndefined: Self = StObject.set(x, "beforeSetRangeStartOnly", js.undefined)
      
      inline def setBeforeSetRangeStartUndefined: Self = StObject.set(x, "beforeSetRangeStart", js.undefined)
      
      inline def setBeforeStretchingColumnWidth(value: (/* stretchedWidth */ Double, /* column */ Double) => Unit | Double): Self = StObject.set(x, "beforeStretchingColumnWidth", js.Any.fromFunction2(value))
      
      inline def setBeforeStretchingColumnWidthUndefined: Self = StObject.set(x, "beforeStretchingColumnWidth", js.undefined)
      
      inline def setBeforeTouchScroll(value: () => Unit): Self = StObject.set(x, "beforeTouchScroll", js.Any.fromFunction0(value))
      
      inline def setBeforeTouchScrollUndefined: Self = StObject.set(x, "beforeTouchScroll", js.undefined)
      
      inline def setBeforeTrimRow(
        value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeTrimRow", js.Any.fromFunction3(value))
      
      inline def setBeforeTrimRowUndefined: Self = StObject.set(x, "beforeTrimRow", js.undefined)
      
      inline def setBeforeUndo(value: /* action */ Action => Unit): Self = StObject.set(x, "beforeUndo", js.Any.fromFunction1(value))
      
      inline def setBeforeUndoStackChange(value: (/* doneActions */ js.Array[Action], /* source */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "beforeUndoStackChange", js.Any.fromFunction2(value))
      
      inline def setBeforeUndoStackChangeUndefined: Self = StObject.set(x, "beforeUndoStackChange", js.undefined)
      
      inline def setBeforeUndoUndefined: Self = StObject.set(x, "beforeUndo", js.undefined)
      
      inline def setBeforeUnhideColumns(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeUnhideColumns", js.Any.fromFunction3(value))
      
      inline def setBeforeUnhideColumnsUndefined: Self = StObject.set(x, "beforeUnhideColumns", js.undefined)
      
      inline def setBeforeUnhideRows(
        value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeUnhideRows", js.Any.fromFunction3(value))
      
      inline def setBeforeUnhideRowsUndefined: Self = StObject.set(x, "beforeUnhideRows", js.undefined)
      
      inline def setBeforeUnmergeCells(value: (/* cellRange */ default, /* auto */ Boolean) => Unit): Self = StObject.set(x, "beforeUnmergeCells", js.Any.fromFunction2(value))
      
      inline def setBeforeUnmergeCellsUndefined: Self = StObject.set(x, "beforeUnmergeCells", js.undefined)
      
      inline def setBeforeUntrimRow(
        value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit | Boolean
      ): Self = StObject.set(x, "beforeUntrimRow", js.Any.fromFunction3(value))
      
      inline def setBeforeUntrimRowUndefined: Self = StObject.set(x, "beforeUntrimRow", js.undefined)
      
      inline def setBeforeUpdateData(
        value: (/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, /* source */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "beforeUpdateData", js.Any.fromFunction3(value))
      
      inline def setBeforeUpdateDataUndefined: Self = StObject.set(x, "beforeUpdateData", js.undefined)
      
      inline def setBeforeValidate(
        value: (/* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ js.UndefOr[ChangeSource]) => Unit
      ): Self = StObject.set(x, "beforeValidate", js.Any.fromFunction4(value))
      
      inline def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
      
      inline def setBeforeValueRender(value: (/* value */ CellValue, /* cellProperties */ CellProperties) => Unit): Self = StObject.set(x, "beforeValueRender", js.Any.fromFunction2(value))
      
      inline def setBeforeValueRenderUndefined: Self = StObject.set(x, "beforeValueRender", js.undefined)
      
      inline def setBeforeViewRender(value: (/* isForced */ Boolean, /* skipRender */ SkipRender) => Unit): Self = StObject.set(x, "beforeViewRender", js.Any.fromFunction2(value))
      
      inline def setBeforeViewRenderUndefined: Self = StObject.set(x, "beforeViewRender", js.undefined)
      
      inline def setConstruct(value: () => Unit): Self = StObject.set(x, "construct", js.Any.fromFunction0(value))
      
      inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setModifyAutoColumnSizeSeed(
        value: (/* seed */ String, /* cellProperties */ CellProperties, /* cellValue */ CellValue) => String | Unit
      ): Self = StObject.set(x, "modifyAutoColumnSizeSeed", js.Any.fromFunction3(value))
      
      inline def setModifyAutoColumnSizeSeedUndefined: Self = StObject.set(x, "modifyAutoColumnSizeSeed", js.undefined)
      
      inline def setModifyAutofillRange(
        value: (/* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]]) => Unit
      ): Self = StObject.set(x, "modifyAutofillRange", js.Any.fromFunction2(value))
      
      inline def setModifyAutofillRangeUndefined: Self = StObject.set(x, "modifyAutofillRange", js.undefined)
      
      inline def setModifyColHeader(value: /* column */ Double => Unit): Self = StObject.set(x, "modifyColHeader", js.Any.fromFunction1(value))
      
      inline def setModifyColHeaderUndefined: Self = StObject.set(x, "modifyColHeader", js.undefined)
      
      inline def setModifyColWidth(value: (/* width */ Double, /* column */ Double) => Unit): Self = StObject.set(x, "modifyColWidth", js.Any.fromFunction2(value))
      
      inline def setModifyColWidthUndefined: Self = StObject.set(x, "modifyColWidth", js.undefined)
      
      inline def setModifyColumnHeaderHeight(value: () => Unit): Self = StObject.set(x, "modifyColumnHeaderHeight", js.Any.fromFunction0(value))
      
      inline def setModifyColumnHeaderHeightUndefined: Self = StObject.set(x, "modifyColumnHeaderHeight", js.undefined)
      
      inline def setModifyCopyableRange(value: /* copyableRanges */ js.Array[RangeType] => Unit): Self = StObject.set(x, "modifyCopyableRange", js.Any.fromFunction1(value))
      
      inline def setModifyCopyableRangeUndefined: Self = StObject.set(x, "modifyCopyableRange", js.undefined)
      
      inline def setModifyData(
        value: (/* row */ Double, /* column */ Double, /* valueHolder */ ValueCellValue, /* ioMode */ get | set) => Unit
      ): Self = StObject.set(x, "modifyData", js.Any.fromFunction4(value))
      
      inline def setModifyDataUndefined: Self = StObject.set(x, "modifyData", js.undefined)
      
      inline def setModifyGetCellCoords(
        value: (/* row */ Double, /* column */ Double, /* topmost */ Boolean) => Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ): Self = StObject.set(x, "modifyGetCellCoords", js.Any.fromFunction3(value))
      
      inline def setModifyGetCellCoordsUndefined: Self = StObject.set(x, "modifyGetCellCoords", js.undefined)
      
      inline def setModifyRowData(value: /* row */ Double => Unit): Self = StObject.set(x, "modifyRowData", js.Any.fromFunction1(value))
      
      inline def setModifyRowDataUndefined: Self = StObject.set(x, "modifyRowData", js.undefined)
      
      inline def setModifyRowHeader(value: /* row */ Double => Unit): Self = StObject.set(x, "modifyRowHeader", js.Any.fromFunction1(value))
      
      inline def setModifyRowHeaderUndefined: Self = StObject.set(x, "modifyRowHeader", js.undefined)
      
      inline def setModifyRowHeaderWidth(value: /* rowHeaderWidth */ Double => Unit): Self = StObject.set(x, "modifyRowHeaderWidth", js.Any.fromFunction1(value))
      
      inline def setModifyRowHeaderWidthUndefined: Self = StObject.set(x, "modifyRowHeaderWidth", js.undefined)
      
      inline def setModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Unit): Self = StObject.set(x, "modifyRowHeight", js.Any.fromFunction2(value))
      
      inline def setModifyRowHeightUndefined: Self = StObject.set(x, "modifyRowHeight", js.undefined)
      
      inline def setModifyRowSourceData(value: /* row */ Double => Unit): Self = StObject.set(x, "modifyRowSourceData", js.Any.fromFunction1(value))
      
      inline def setModifyRowSourceDataUndefined: Self = StObject.set(x, "modifyRowSourceData", js.undefined)
      
      inline def setModifySourceData(
        value: (/* row */ Double, /* column */ Double, /* valueHolder */ ValueCellValue, /* ioMode */ get | set) => Unit
      ): Self = StObject.set(x, "modifySourceData", js.Any.fromFunction4(value))
      
      inline def setModifySourceDataUndefined: Self = StObject.set(x, "modifySourceData", js.undefined)
      
      inline def setModifyTransformEnd(value: /* delta */ typings.handsontable.coordsMod.default => Unit): Self = StObject.set(x, "modifyTransformEnd", js.Any.fromFunction1(value))
      
      inline def setModifyTransformEndUndefined: Self = StObject.set(x, "modifyTransformEnd", js.undefined)
      
      inline def setModifyTransformStart(value: /* delta */ typings.handsontable.coordsMod.default => Unit): Self = StObject.set(x, "modifyTransformStart", js.Any.fromFunction1(value))
      
      inline def setModifyTransformStartUndefined: Self = StObject.set(x, "modifyTransformStart", js.undefined)
      
      inline def setPersistentStateLoad(value: (/* key */ String, /* valuePlaceholder */ ValueAny) => Unit): Self = StObject.set(x, "persistentStateLoad", js.Any.fromFunction2(value))
      
      inline def setPersistentStateLoadUndefined: Self = StObject.set(x, "persistentStateLoad", js.undefined)
      
      inline def setPersistentStateReset(value: /* key */ String => Unit): Self = StObject.set(x, "persistentStateReset", js.Any.fromFunction1(value))
      
      inline def setPersistentStateResetUndefined: Self = StObject.set(x, "persistentStateReset", js.undefined)
      
      inline def setPersistentStateSave(value: (/* key */ String, /* value */ Any) => Unit): Self = StObject.set(x, "persistentStateSave", js.Any.fromFunction2(value))
      
      inline def setPersistentStateSaveUndefined: Self = StObject.set(x, "persistentStateSave", js.undefined)
    }
  }
  
  trait HookHighlightColumnHeaderMeta extends StObject {
    
    var classNames: js.Array[String]
    
    var columnCursor: Double
    
    var selectionType: String
    
    var selectionWidth: Double
  }
  object HookHighlightColumnHeaderMeta {
    
    inline def apply(classNames: js.Array[String], columnCursor: Double, selectionType: String, selectionWidth: Double): HookHighlightColumnHeaderMeta = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], columnCursor = columnCursor.asInstanceOf[js.Any], selectionType = selectionType.asInstanceOf[js.Any], selectionWidth = selectionWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookHighlightColumnHeaderMeta]
    }
    
    extension [Self <: HookHighlightColumnHeaderMeta](x: Self) {
      
      inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
      
      inline def setColumnCursor(value: Double): Self = StObject.set(x, "columnCursor", value.asInstanceOf[js.Any])
      
      inline def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionWidth(value: Double): Self = StObject.set(x, "selectionWidth", value.asInstanceOf[js.Any])
    }
  }
  
  trait HookHighlightRowHeaderMeta extends StObject {
    
    var classNames: js.Array[String]
    
    var rowCursor: Double
    
    var selectionHeight: Double
    
    var selectionType: String
  }
  object HookHighlightRowHeaderMeta {
    
    inline def apply(classNames: js.Array[String], rowCursor: Double, selectionHeight: Double, selectionType: String): HookHighlightRowHeaderMeta = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], rowCursor = rowCursor.asInstanceOf[js.Any], selectionHeight = selectionHeight.asInstanceOf[js.Any], selectionType = selectionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookHighlightRowHeaderMeta]
    }
    
    extension [Self <: HookHighlightRowHeaderMeta](x: Self) {
      
      inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
      
      inline def setRowCursor(value: Double): Self = StObject.set(x, "rowCursor", value.asInstanceOf[js.Any])
      
      inline def setSelectionHeight(value: Double): Self = StObject.set(x, "selectionHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectionType(value: String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
    }
  }
}
