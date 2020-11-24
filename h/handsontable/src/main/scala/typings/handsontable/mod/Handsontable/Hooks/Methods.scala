package typings.handsontable.mod.Handsontable.Hooks

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.anon.SkipRender
import typings.handsontable.anon.Value
import typings.handsontable.anon.ValueAny
import typings.handsontable.anon.ValueCellValue
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
import typings.handsontable.handsontableStrings.afterTrimRow
import typings.handsontable.handsontableStrings.afterUndo
import typings.handsontable.handsontableStrings.afterUnhideColumns
import typings.handsontable.handsontableStrings.afterUnhideRows
import typings.handsontable.handsontableStrings.afterUnlisten
import typings.handsontable.handsontableStrings.afterUnmergeCells
import typings.handsontable.handsontableStrings.afterUntrimRow
import typings.handsontable.handsontableStrings.afterUpdateSettings
import typings.handsontable.handsontableStrings.afterValidate
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
import typings.handsontable.handsontableStrings.beforeUnhideColumns
import typings.handsontable.handsontableStrings.beforeUnhideRows
import typings.handsontable.handsontableStrings.beforeUnmergeCells
import typings.handsontable.handsontableStrings.beforeUntrimRow
import typings.handsontable.handsontableStrings.beforeValidate
import typings.handsontable.handsontableStrings.beforeValueRender
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
import typings.handsontable.mod.Handsontable
import typings.handsontable.mod.Handsontable.Bucket
import typings.handsontable.mod.Handsontable.CellChange
import typings.handsontable.mod.Handsontable.CellProperties
import typings.handsontable.mod.Handsontable.CellValue
import typings.handsontable.mod.Handsontable.ChangeSource
import typings.handsontable.mod.Handsontable.GridSettings
import typings.handsontable.mod.Handsontable.RowObject
import typings.handsontable.mod.Handsontable.SelectionController
import typings.handsontable.mod.Handsontable.ViewportColumnsCalculator
import typings.handsontable.mod.Handsontable.columnSorting.Config
import typings.handsontable.mod.Handsontable.contextMenu.MenuItemConfig
import typings.handsontable.mod.Handsontable.contextMenu.PredefinedMenuItemKey
import typings.handsontable.mod.Handsontable.mergeCells.Settings
import typings.handsontable.mod.Handsontable.plugins.ContextMenu
import typings.handsontable.mod.Handsontable.plugins.DropdownMenu
import typings.handsontable.mod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import typings.handsontable.mod.Handsontable.plugins.RangeType
import typings.handsontable.mod.Handsontable.plugins.UndoRedoAction
import typings.handsontable.mod.Handsontable.wot.CellCoords
import typings.handsontable.mod.Handsontable.wot.CellRange
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  def add(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[CellRange], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeCellAlignment,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[CellRange], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: beforeDrawBorders,
    callback: js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  def add(
    key: modifySourceData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* col */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ]
  ): Methods = js.native
  def add(
    key: modifySourceData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* col */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  def add(
    key: modifySourceData,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* col */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  def add(
    key: modifySourceData,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* col */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAutofill(
    key: afterAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAutofill(
    key: afterAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterAutofill(
    key: afterAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterAutofill(
    key: afterAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterBeginEditing(
    key: afterBeginEditing,
    callback: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterChange(
    key: afterChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterChangesObserved(
    key: afterChangesObserved,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* collapsePossible */ Boolean, 
        /* successfullyCollapsed */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* collapsePossible */ Boolean, 
        /* successfullyCollapsed */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          /* successfullyCollapsed */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          /* successfullyCollapsed */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* expandPossible */ Boolean, 
        /* successfullyExpanded */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* expandPossible */ Boolean, 
        /* successfullyExpanded */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          /* successfullyExpanded */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          /* successfullyExpanded */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterColumnResize(
    key: afterColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuDefaultOptions(
    key: afterContextMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopy(
    key: afterCopy,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumnds */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumnds */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateCol(
    key: afterCreateCol,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCreateRow(
    key: afterCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterCut(
    key: afterCut,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDetachChild(
    key: afterDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ Double | Unit, 
          String | Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentRow */ Double, 
          /* currentColumn */ Double, 
          /* cornersOfSelection */ js.Array[Double], 
          /* layerLevel */ Double | Unit, 
          String | Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuDefaultOptions(
    key: afterDropdownMenuDefaultOptions,
    callback: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterFilter(
    key: afterFilter,
    callback: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetColumnHeaderRenderers(
    key: afterGetColumnHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeader(
    key: afterGetRowHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterGetRowHeaderRenderers(
    key: afterGetRowHeaderRenderers,
    callback: js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterLoadData(
    key: afterLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterMomentumScroll(
    key: afterMomentumScroll,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterPaste(
    key: afterPaste,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterPluginsInitialized(
    key: afterPluginsInitialized,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterRedo(
    key: afterRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterRedo(
    key: afterRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterRender(
    key: afterRender,
    callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterRender(
    key: afterRender,
    callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ String, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ String, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[
      js.Function5[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        /* orderChanged */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[
      js.Function5[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        /* orderChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function5[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowMove(
    key: afterRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function5[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterRowResize(
    key: afterRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterScrollHorizontally(
    key: afterScrollHorizontally,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterScrollVertically(
    key: afterScrollVertically,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtCell(
    key: afterSetDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetDataAtRowProp(
    key: afterSetDataAtRowProp,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetSourceDataAtCell(
    key: afterSetSourceDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetSourceDataAtCell(
    key: afterSetSourceDataAtCell,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterSetSourceDataAtCell(
    key: afterSetSourceDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_afterSetSourceDataAtCell(
    key: afterSetSourceDataAtCell,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUndo(
    key: afterUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterUndo(
    key: afterUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportColumnCalculatorOverride(
    key: afterViewportColumnCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_afterViewportRowCalculatorOverride(
    key: afterViewportRowCalculatorOverride,
    callback: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit | Boolean
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit | Boolean
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChange(
    key: beforeChange,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeChangeRender(
    key: beforeChangeRender,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeColumnResize(
    key: beforeColumnResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuSetItems(
    key: beforeContextMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeCreateRow(
    key: beforeCreateRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDetachChild(
    key: beforeDetachChild,
    callback: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuSetItems(
    key: beforeDropdownMenuSetItems,
    callback: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeFilter(
    key: beforeFilter,
    callback: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeGetCellMeta(
    key: beforeGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeHideRows(
    key: beforeHideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLoadData(
    key: beforeLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeLoadData(
    key: beforeLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeLoadData(
    key: beforeLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeLoadData(
    key: beforeLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeRedo(
    key: beforeRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeRedo(
    key: beforeRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ CellValue, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ CellValue, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[
      js.Function4[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[
      js.Function4[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.UndefOr[
      js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeRowResize(
    key: beforeRowResize,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Boolean | Unit]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Boolean | Unit]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(key: beforeSetRangeEnd, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(key: beforeSetRangeStart, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(key: beforeSetRangeStartOnly, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeStretchingColumnWidth(
    key: beforeStretchingColumnWidth,
    callback: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Methods = js.native
  @JSName("add")
  def add_beforeUndo(
    key: beforeUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Methods = js.native
  @JSName("add")
  def add_beforeUndo(
    key: beforeUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_beforeValueRender(
    key: beforeValueRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(
    key: modifyColHeader,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyColHeader(
    key: modifyColHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyColumnHeaderHeight(
    key: modifyColumnHeaderHeight,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyCopyableRange(
    key: modifyCopyableRange,
    callback: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
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
  ): Methods = js.native
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
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowData(
    key: modifyRowData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowData(
    key: modifyRowData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowHeight(
    key: modifyRowHeight,
    callback: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Methods = js.native
  @JSName("add")
  def add_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(key: modifyTransformEnd, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(key: modifyTransformStart, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateLoad(
    key: persistentStateLoad,
    callback: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(
    key: persistentStateReset,
    callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Methods = js.native
  @JSName("add")
  def add_persistentStateReset(
    key: persistentStateReset,
    callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]],
    context: Handsontable
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  ): Methods = js.native
  @JSName("add")
  def add_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]],
    context: Handsontable
  ): Methods = js.native
  
  def createEmptyBucket(): Bucket = js.native
  
  def deregister(key: String): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(context: Handsontable): Unit = js.native
  
  def getBucket(): Bucket = js.native
  def getBucket(context: Handsontable): Bucket = js.native
  
  def getRegistered(): js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any
  ] = js.native
  
  def has(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any): Boolean = js.native
  def has(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any,
    context: Handsontable
  ): Boolean = js.native
  
  def isRegistered(key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any): Boolean = js.native
  
  def once(
    key: afterModifyTransformEnd,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
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
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformEnd,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
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
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
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
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: afterModifyTransformStart,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
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
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ]
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.UndefOr[
      js.Function4[
        /* index */ CellCoords, 
        /* direction */ up | down | left | right, 
        /* input */ js.Array[js.Array[CellValue]], 
        /* deltas */ js.Array[_], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeAutofillInsidePopulate,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
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
          /* index */ CellCoords, 
          /* direction */ up | down | left | right, 
          /* input */ js.Array[js.Array[CellValue]], 
          /* deltas */ js.Array[_], 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.UndefOr[
      js.Function4[
        /* stateBefore */ NumberDictionary[js.Array[String]], 
        /* range */ js.Array[CellRange], 
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
        /* range */ js.Array[CellRange], 
        /* type */ horizontal | vertical, 
        /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: beforeCellAlignment,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* stateBefore */ NumberDictionary[js.Array[String]], 
          /* range */ js.Array[CellRange], 
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
          /* range */ js.Array[CellRange], 
          /* type */ horizontal | vertical, 
          /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  def once(
    key: modifySourceData,
    callback: js.UndefOr[
      js.Function4[
        /* row */ Double, 
        /* col */ Double, 
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
        /* col */ Double, 
        /* valueHolder */ ValueCellValue, 
        /* ioMode */ get | set, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  def once(
    key: modifySourceData,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* col */ Double, 
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
          /* col */ Double, 
          /* valueHolder */ ValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
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
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAddChild(
    key: afterAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
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
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAutofill(
    key: afterAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterAutofill(
    key: afterAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterAutofill(
    key: afterAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterAutofill(
    key: afterAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterCellMetaReset(key: afterCellMetaReset, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(key: afterChangesObserved, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterChangesObserved(
    key: afterChangesObserved,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
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
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* collapsePossible */ Boolean, 
        /* successfullyCollapsed */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnCollapse(
    key: afterColumnCollapse,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
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
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* collapsePossible */ Boolean, 
          /* successfullyCollapsed */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.UndefOr[
      js.Function4[
        /* currentCollapsedColumn */ js.Array[Double], 
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
        /* currentCollapsedColumn */ js.Array[Double], 
        /* destinationCollapsedColumns */ js.Array[Double], 
        /* expandPossible */ Boolean, 
        /* successfullyExpanded */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnExpand(
    key: afterColumnExpand,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* currentCollapsedColumn */ js.Array[Double], 
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
          /* currentCollapsedColumn */ js.Array[Double], 
          /* destinationCollapsedColumns */ js.Array[Double], 
          /* expandPossible */ Boolean, 
          /* successfullyExpanded */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterColumnMove(
    key: afterColumnMove,
    callback: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(key: afterContextMenuHide, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterContextMenuHide(
    key: afterContextMenuHide,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(key: afterContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterContextMenuShow(
    key: afterContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.UndefOr[
      js.Function4[
        /* selectedRows */ Double, 
        /* selectedColumnds */ Double, 
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
        /* selectedColumnds */ Double, 
        /* copyRowsLimit */ Double, 
        /* copyColumnsLimit */ Double, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterCopyLimit(
    key: afterCopyLimit,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* selectedRows */ Double, 
          /* selectedColumnds */ Double, 
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
          /* selectedColumnds */ Double, 
          /* copyRowsLimit */ Double, 
          /* copyColumnsLimit */ Double, 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterDeselect(key: afterDeselect, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterDestroy(key: afterDestroy, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterDetachChild(
    key: afterDetachChild,
    callback: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(key: afterDocumentKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDocumentKeyDown(
    key: afterDocumentKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDrawSelection(
    key: afterDrawSelection,
    callback: js.UndefOr[
      js.Function4[
        /* currentRow */ Double, 
        /* currentColumn */ Double, 
        /* cornersOfSelection */ js.Array[Double], 
        /* layerLevel */ Double | Unit, 
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
        /* layerLevel */ Double | Unit, 
        String | Unit
      ]
    ],
    context: Handsontable
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
          /* layerLevel */ Double | Unit, 
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
          /* layerLevel */ Double | Unit, 
          String | Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(key: afterDropdownMenuHide, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuHide(
    key: afterDropdownMenuHide,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(key: afterDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterDropdownMenuShow(
    key: afterDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetCellMeta(
    key: afterGetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterGetColHeader(
    key: afterGetColHeader,
    callback: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterInit(key: afterInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(key: afterLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterLanguageChange(
    key: afterLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterListen(key: afterListen, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterLoadData(
    key: afterLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterMergeCells(
    key: afterMergeCells,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(key: afterMomentumScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterMomentumScroll(
    key: afterMomentumScroll,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellContextMenu(
    key: afterOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(key: afterOnCellCornerDblClick, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerDblClick(
    key: afterOnCellCornerDblClick,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(key: afterOnCellCornerMouseDown, callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterOnCellCornerMouseDown(
    key: afterOnCellCornerMouseDown,
    callback: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseDown(
    key: afterOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOut(
    key: afterOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseOver(
    key: afterOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterOnCellMouseUp(
    key: afterOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(key: afterPluginsInitialized, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterPluginsInitialized(
    key: afterPluginsInitialized,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRedo(key: afterRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterRedo(
    key: afterRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRedo(key: afterRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterRedo(
    key: afterRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterRemoveCellMeta(
    key: afterRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRender(key: afterRender, callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterRender(
    key: afterRender,
    callback: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRender(key: afterRender, callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterRender(
    key: afterRender,
    callback: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
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
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ String, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRenderer(
    key: afterRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
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
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ String, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.UndefOr[
      js.Function5[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
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
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        /* orderChanged */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterRowMove(
    key: afterRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function5[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
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
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          /* orderChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(key: afterScrollHorizontally, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterScrollHorizontally(
    key: afterScrollHorizontally,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(key: afterScrollVertically, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterScrollVertically(
    key: afterScrollVertically,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_afterSetCellMeta(
    key: afterSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUndo(key: afterUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUndo(
    key: afterUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUndo(key: afterUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterUndo(
    key: afterUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_afterUnlisten(key: afterUnlisten, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_afterUnmergeCells(
    key: afterUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(key: afterUpdateSettings, callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]): Unit = js.native
  @JSName("once")
  def once_afterUpdateSettings(
    key: afterUpdateSettings,
    callback: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
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
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAddChild(
    key: beforeAddChild,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
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
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit | Boolean
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit | Boolean
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit | Boolean
        ]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeAutofill(
    key: beforeAutofill,
    callback: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit | Boolean
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeColumnMove(
    key: beforeColumnMove,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(key: beforeContextMenuShow, callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeContextMenuShow(
    key: beforeContextMenuShow,
    callback: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(key: beforeDropdownMenuShow, callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeDropdownMenuShow(
    key: beforeDropdownMenuShow,
    callback: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideColumns(
    key: beforeHideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeHideRows(
    key: beforeHideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeInit(key: beforeInit, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeInitWalkontable(
    key: beforeInitWalkontable,
    callback: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(key: beforeKeyDown, callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(key: beforeKeyDown, callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeKeyDown(
    key: beforeKeyDown,
    callback: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(key: beforeLanguageChange, callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeLanguageChange(
    key: beforeLanguageChange,
    callback: js.UndefOr[js.Function1[/* languageCode */ String, Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeLoadData(
    key: beforeLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeLoadData(
    key: beforeLoadData,
    callback: js.UndefOr[
      js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeLoadData(
    key: beforeLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeLoadData(
    key: beforeLoadData,
    callback: js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeMergeCells(
    key: beforeMergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellContextMenu(
    key: beforeOnCellContextMenu,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
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
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseDown(
    key: beforeOnCellMouseDown,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
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
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOut(
    key: beforeOnCellMouseOut,
    callback: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
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
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseOver(
    key: beforeOnCellMouseOver,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
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
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.UndefOr[
      js.Function4[
        /* event */ MouseEvent, 
        /* coords */ CellCoords, 
        /* TD */ HTMLTableCellElement, 
        /* controller */ SelectionController, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeOnCellMouseUp(
    key: beforeOnCellMouseUp,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
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
        js.Function4[
          /* event */ MouseEvent, 
          /* coords */ CellCoords, 
          /* TD */ HTMLTableCellElement, 
          /* controller */ SelectionController, 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRedo(key: beforeRedo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeRedo(
    key: beforeRedo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRedo(key: beforeRedo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeRedo(
    key: beforeRedo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(key: beforeRemoveCellClassNames, callback: js.UndefOr[js.Function0[js.Array[String] | Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellClassNames(
    key: beforeRemoveCellClassNames,
    callback: js.UndefOr[js.Function0[js.Array[String] | Unit]],
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRemoveCellMeta(
    key: beforeRemoveCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeRender(
    key: beforeRender,
    callback: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.UndefOr[
      js.Function6[
        /* TD */ HTMLTableCellElement, 
        /* row */ Double, 
        /* col */ Double, 
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
        /* col */ Double, 
        /* prop */ String | Double, 
        /* value */ CellValue, 
        /* cellProperties */ CellProperties, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRenderer(
    key: beforeRenderer,
    callback: js.Array[
      js.UndefOr[
        js.Function6[
          /* TD */ HTMLTableCellElement, 
          /* row */ Double, 
          /* col */ Double, 
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
          /* col */ Double, 
          /* prop */ String | Double, 
          /* value */ CellValue, 
          /* cellProperties */ CellProperties, 
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.UndefOr[
      js.Function4[
        /* movedRows */ js.Array[Double], 
        /* finalIndex */ Double, 
        /* dropIndex */ Double | Unit, 
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
        /* dropIndex */ Double | Unit, 
        /* movePossible */ Boolean, 
        Unit
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeRowMove(
    key: beforeRowMove,
    callback: js.Array[
      js.UndefOr[
        js.Function4[
          /* movedRows */ js.Array[Double], 
          /* finalIndex */ Double, 
          /* dropIndex */ Double | Unit, 
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
          /* dropIndex */ Double | Unit, 
          /* movePossible */ Boolean, 
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Boolean | Unit]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Boolean | Unit]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
      ]
    ]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetCellMeta(
    key: beforeSetCellMeta,
    callback: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(key: beforeSetRangeEnd, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeEnd(
    key: beforeSetRangeEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(key: beforeSetRangeStart, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStart(
    key: beforeSetRangeStart,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(key: beforeSetRangeStartOnly, callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeSetRangeStartOnly(
    key: beforeSetRangeStartOnly,
    callback: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeTouchScroll(key: beforeTouchScroll, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_beforeTrimRow(
    key: beforeTrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUndo(key: beforeUndo, callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]): Unit = js.native
  @JSName("once")
  def once_beforeUndo(
    key: beforeUndo,
    callback: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUndo(key: beforeUndo, callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Unit = js.native
  @JSName("once")
  def once_beforeUndo(
    key: beforeUndo,
    callback: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideColumns(
    key: beforeUnhideColumns,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnhideRows(
    key: beforeUnhideRows,
    callback: js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_beforeUnmergeCells(
    key: beforeUnmergeCells,
    callback: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_beforeUntrimRow(
    key: beforeUntrimRow,
    callback: js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
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
        Unit
      ]
    ],
    context: Handsontable
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
          Unit
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
          Unit
        ]
      ]
    ],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_construct(key: construct, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_init(key: init, callback: js.Array[js.UndefOr[js.Function0[Unit]]], context: Handsontable): Unit = js.native
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(key: modifyColHeader, callback: js.UndefOr[js.Function1[/* column */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(
    key: modifyColHeader,
    callback: js.UndefOr[js.Function1[/* column */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(key: modifyColHeader, callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyColHeader(
    key: modifyColHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyColWidth(
    key: modifyColWidth,
    callback: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.UndefOr[js.Function0[Unit]], context: Handsontable): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(key: modifyColumnHeaderHeight, callback: js.Array[js.UndefOr[js.Function0[Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyColumnHeaderHeight(
    key: modifyColumnHeaderHeight,
    callback: js.Array[js.UndefOr[js.Function0[Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowData(key: modifyRowData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowData(
    key: modifyRowData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowData(key: modifyRowData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowData(
    key: modifyRowData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(key: modifyRowHeader, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(key: modifyRowHeader, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeader(
    key: modifyRowHeader,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(key: modifyRowHeaderWidth, callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowHeaderWidth(
    key: modifyRowHeaderWidth,
    callback: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.UndefOr[js.Function1[/* row */ Double, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.UndefOr[js.Function1[/* row */ Double, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(key: modifyRowSourceData, callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Unit = js.native
  @JSName("once")
  def once_modifyRowSourceData(
    key: modifyRowSourceData,
    callback: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(key: modifyTransformEnd, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformEnd(
    key: modifyTransformEnd,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(key: modifyTransformStart, callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_modifyTransformStart(
    key: modifyTransformStart,
    callback: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    context: Handsontable
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
    context: Handsontable
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
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(key: persistentStateReset, callback: js.UndefOr[js.Function1[/* key */ String, Unit]]): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(
    key: persistentStateReset,
    callback: js.UndefOr[js.Function1[/* key */ String, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(key: persistentStateReset, callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Unit = js.native
  @JSName("once")
  def once_persistentStateReset(
    key: persistentStateReset,
    callback: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]],
    context: Handsontable
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  ): Unit = js.native
  @JSName("once")
  def once_persistentStateSave(
    key: persistentStateSave,
    callback: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]],
    context: Handsontable
  ): Unit = js.native
  
  def register(key: String): Unit = js.native
  
  def remove(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any,
    callback: js.Function
  ): Boolean = js.native
  def remove(
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any,
    callback: js.Function,
    context: Handsontable
  ): Boolean = js.native
  
  def run(
    context: Handsontable,
    key: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 163 */ js.Any,
    p1: js.UndefOr[js.Any],
    p2: js.UndefOr[js.Any],
    p3: js.UndefOr[js.Any],
    p4: js.UndefOr[js.Any],
    p5: js.UndefOr[js.Any],
    p6: js.UndefOr[js.Any]
  ): js.Any = js.native
}
