package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.anon.SkipRender
import typings.handsontable.anon.Value
import typings.handsontable.anon.ValueAny
import typings.handsontable.anon.ValueCellValue
import typings.handsontable.handsontableNumbers.`-1`
import typings.handsontable.handsontableNumbers.`0`
import typings.handsontable.handsontableStrings.area
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
import typings.handsontable.handsontableStrings.left
import typings.handsontable.handsontableStrings.right
import typings.handsontable.handsontableStrings.set
import typings.handsontable.handsontableStrings.up
import typings.handsontable.handsontableStrings.vertical
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof handsontable.handsontable.Handsontable.Hooks.Events ]: std.Array<handsontable.handsontable.Handsontable.Hooks.Events[P]>} */
@js.native
trait Bucket extends StObject {
  
  var afterAddChild: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var afterAutofill: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var afterBeginEditing: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]] = js.native
  
  var afterCellMetaReset: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterChange: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ]
  ] = js.native
  
  var afterChangesObserved: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterColumnCollapse: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterColumnExpand: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterColumnMove: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ] = js.native
  
  var afterColumnResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
  var afterContextMenuDefaultOptions: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ] = js.native
  
  var afterContextMenuHide: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.native
  
  var afterContextMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.native
  
  var afterCopy: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ] = js.native
  
  var afterCopyLimit: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterCreateCol: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
  var afterCreateRow: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
  var afterCut: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ] = js.native
  
  var afterDeselect: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterDestroy: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterDetachChild: js.UndefOr[
    js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ] = js.native
  
  var afterDocumentKeyDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]] = js.native
  
  var afterDrawSelection: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ]
  ] = js.native
  
  var afterDropdownMenuHide: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.native
  
  var afterDropdownMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.native
  
  var afterFilter: js.UndefOr[
    js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
  ] = js.native
  
  var afterGetCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ] = js.native
  
  var afterGetColHeader: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ] = js.native
  
  var afterGetColumnHeaderRenderers: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var afterGetRowHeader: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ]
  ] = js.native
  
  var afterGetRowHeaderRenderers: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var afterInit: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterLanguageChange: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]] = js.native
  
  var afterListen: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterLoadData: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ] = js.native
  
  var afterMergeCells: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ]
  ] = js.native
  
  var afterModifyTransformEnd: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var afterModifyTransformStart: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var afterMomentumScroll: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterOnCellContextMenu: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var afterOnCellCornerDblClick: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]] = js.native
  
  var afterOnCellCornerMouseDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]] = js.native
  
  var afterOnCellMouseDown: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var afterOnCellMouseOut: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var afterOnCellMouseOver: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var afterOnCellMouseUp: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var afterPaste: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ]
  ] = js.native
  
  var afterPluginsInitialized: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterRedo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]] = js.native
  
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
  ] = js.native
  
  var afterRemoveCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var afterRender: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]] = js.native
  
  var afterRenderer: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterRowMove: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var afterRowResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ]
  ] = js.native
  
  var afterScrollHorizontally: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterScrollVertically: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var afterSetCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ] = js.native
  
  var afterSetDataAtCell: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
  var afterSetDataAtRowProp: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
  var afterSetSourceDataAtCell: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
  var afterUndo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var afterUnlisten: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var afterUnmergeCells: js.UndefOr[
    js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ] = js.native
  
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
  ] = js.native
  
  var afterUpdateSettings: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]] = js.native
  
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
  ] = js.native
  
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]] = js.native
  
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]] = js.native
  
  var beforeAddChild: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeAutofill: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit | Boolean
        ]
      ]
    ]
  ] = js.native
  
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeCellAlignment: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeChange: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ]
  ] = js.native
  
  var beforeChangeRender: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var beforeColumnMove: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ]
  ] = js.native
  
  var beforeColumnResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
  var beforeContextMenuSetItems: js.UndefOr[
    js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ] = js.native
  
  var beforeContextMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var beforeCreateRow: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
  var beforeDetachChild: js.UndefOr[
    js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  ] = js.native
  
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
  ] = js.native
  
  var beforeDropdownMenuSetItems: js.UndefOr[
    js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  ] = js.native
  
  var beforeDropdownMenuShow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]] = js.native
  
  var beforeFilter: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ]
  ] = js.native
  
  var beforeGetCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ]
  ] = js.native
  
  var beforeHideColumns: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeHideRows: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeInit: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var beforeInitWalkontable: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]] = js.native
  
  var beforeKeyDown: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]] = js.native
  
  var beforeLanguageChange: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]] = js.native
  
  var beforeLoadData: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
      ]
    ]
  ] = js.native
  
  var beforeMergeCells: js.UndefOr[
    js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ] = js.native
  
  var beforeOnCellContextMenu: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var beforeOnCellMouseDown: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeOnCellMouseOut: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ]
  ] = js.native
  
  var beforeOnCellMouseOver: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeOnCellMouseUp: js.UndefOr[
    js.Array[
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
  ] = js.native
  
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
  ] = js.native
  
  var beforeRedo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]] = js.native
  
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
  ] = js.native
  
  var beforeRemoveCellClassNames: js.UndefOr[js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]] = js.native
  
  var beforeRemoveCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var beforeRender: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
    ]
  ] = js.native
  
  var beforeRenderer: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeRowMove: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var beforeRowResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
      ]
    ]
  ] = js.native
  
  var beforeSetCellMeta: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
      ]
    ]
  ] = js.native
  
  var beforeSetRangeEnd: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]] = js.native
  
  var beforeSetRangeStart: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]] = js.native
  
  var beforeSetRangeStartOnly: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]] = js.native
  
  var beforeStretchingColumnWidth: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ]
  ] = js.native
  
  var beforeTouchScroll: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var beforeTrimRow: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeUndo: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]] = js.native
  
  var beforeUnhideColumns: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeUnhideRows: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
  var beforeUnmergeCells: js.UndefOr[
    js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  ] = js.native
  
  var beforeUntrimRow: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ]
  ] = js.native
  
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
  ] = js.native
  
  var beforeValueRender: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ]
  ] = js.native
  
  var construct: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var init: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
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
  ] = js.native
  
  var modifyColHeader: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]] = js.native
  
  var modifyColWidth: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]] = js.native
  
  var modifyColumnHeaderHeight: js.UndefOr[js.Array[js.UndefOr[js.Function0[Unit]]]] = js.native
  
  var modifyCopyableRange: js.UndefOr[
    js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  var modifyRowData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  
  var modifyRowHeader: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  
  var modifyRowHeaderWidth: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]] = js.native
  
  var modifyRowHeight: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]] = js.native
  
  var modifyRowSourceData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  
  var modifySourceData: js.UndefOr[
    js.Array[
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
  ] = js.native
  
  var modifyTransformEnd: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]] = js.native
  
  var modifyTransformStart: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]] = js.native
  
  var persistentStateLoad: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ]
  ] = js.native
  
  var persistentStateReset: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]] = js.native
  
  var persistentStateSave: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]] = js.native
}
object Bucket {
  
  @scala.inline
  def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterAddChild(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ RowObject | Unit, 
              /* index */ Double | Unit, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterAddChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterAddChildUndefined: Self = StObject.set(x, "afterAddChild", js.undefined)
    
    @scala.inline
    def setAfterAddChildVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ RowObject | Unit, 
            /* index */ Double | Unit, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterAddChild", js.Array(value :_*))
    
    @scala.inline
    def setAfterAutofill(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* start */ CellCoords, 
              /* end */ CellCoords, 
              /* data */ js.Array[js.Array[CellValue]], 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterAutofillUndefined: Self = StObject.set(x, "afterAutofill", js.undefined)
    
    @scala.inline
    def setAfterAutofillVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* start */ CellCoords, 
            /* end */ CellCoords, 
            /* data */ js.Array[js.Array[CellValue]], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterAutofill", js.Array(value :_*))
    
    @scala.inline
    def setAfterBeginEditing(value: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]): Self = StObject.set(x, "afterBeginEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBeginEditingUndefined: Self = StObject.set(x, "afterBeginEditing", js.undefined)
    
    @scala.inline
    def setAfterBeginEditingVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]])*): Self = StObject.set(x, "afterBeginEditing", js.Array(value :_*))
    
    @scala.inline
    def setAfterCellMetaReset(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterCellMetaReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCellMetaResetUndefined: Self = StObject.set(x, "afterCellMetaReset", js.undefined)
    
    @scala.inline
    def setAfterCellMetaResetVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterCellMetaReset", js.Array(value :_*))
    
    @scala.inline
    def setAfterChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
    
    @scala.inline
    def setAfterChangeVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ])*
    ): Self = StObject.set(x, "afterChange", js.Array(value :_*))
    
    @scala.inline
    def setAfterChangesObserved(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterChangesObserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterChangesObservedUndefined: Self = StObject.set(x, "afterChangesObserved", js.undefined)
    
    @scala.inline
    def setAfterChangesObservedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterChangesObserved", js.Array(value :_*))
    
    @scala.inline
    def setAfterColumnCollapse(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterColumnCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColumnCollapseUndefined: Self = StObject.set(x, "afterColumnCollapse", js.undefined)
    
    @scala.inline
    def setAfterColumnCollapseVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            /* successfullyCollapsed */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterColumnCollapse", js.Array(value :_*))
    
    @scala.inline
    def setAfterColumnExpand(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterColumnExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColumnExpandUndefined: Self = StObject.set(x, "afterColumnExpand", js.undefined)
    
    @scala.inline
    def setAfterColumnExpandVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            /* successfullyExpanded */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterColumnExpand", js.Array(value :_*))
    
    @scala.inline
    def setAfterColumnMove(
      value: js.Array[
          js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
        ]
    ): Self = StObject.set(x, "afterColumnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColumnMoveUndefined: Self = StObject.set(x, "afterColumnMove", js.undefined)
    
    @scala.inline
    def setAfterColumnMoveVarargs(value: (js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]])*): Self = StObject.set(x, "afterColumnMove", js.Array(value :_*))
    
    @scala.inline
    def setAfterColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterColumnResizeUndefined: Self = StObject.set(x, "afterColumnResize", js.undefined)
    
    @scala.inline
    def setAfterColumnResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit]
        ])*
    ): Self = StObject.set(x, "afterColumnResize", js.Array(value :_*))
    
    @scala.inline
    def setAfterColumnSort(
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
    
    @scala.inline
    def setAfterColumnSortUndefined: Self = StObject.set(x, "afterColumnSort", js.undefined)
    
    @scala.inline
    def setAfterColumnSortVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterColumnSort", js.Array(value :_*))
    
    @scala.inline
    def setAfterContextMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterContextMenuDefaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContextMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterContextMenuDefaultOptions", js.undefined)
    
    @scala.inline
    def setAfterContextMenuDefaultOptionsVarargs(
      value: (js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ])*
    ): Self = StObject.set(x, "afterContextMenuDefaultOptions", js.Array(value :_*))
    
    @scala.inline
    def setAfterContextMenuHide(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "afterContextMenuHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContextMenuHideUndefined: Self = StObject.set(x, "afterContextMenuHide", js.undefined)
    
    @scala.inline
    def setAfterContextMenuHideVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "afterContextMenuHide", js.Array(value :_*))
    
    @scala.inline
    def setAfterContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "afterContextMenuShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContextMenuShowUndefined: Self = StObject.set(x, "afterContextMenuShow", js.undefined)
    
    @scala.inline
    def setAfterContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "afterContextMenuShow", js.Array(value :_*))
    
    @scala.inline
    def setAfterCopy(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCopyLimit(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterCopyLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCopyLimitUndefined: Self = StObject.set(x, "afterCopyLimit", js.undefined)
    
    @scala.inline
    def setAfterCopyLimitVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* selectedRows */ Double, 
            /* selectedColumnds */ Double, 
            /* copyRowsLimit */ Double, 
            /* copyColumnsLimit */ Double, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterCopyLimit", js.Array(value :_*))
    
    @scala.inline
    def setAfterCopyUndefined: Self = StObject.set(x, "afterCopy", js.undefined)
    
    @scala.inline
    def setAfterCopyVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = StObject.set(x, "afterCopy", js.Array(value :_*))
    
    @scala.inline
    def setAfterCreateCol(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterCreateCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCreateColUndefined: Self = StObject.set(x, "afterCreateCol", js.undefined)
    
    @scala.inline
    def setAfterCreateColVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "afterCreateCol", js.Array(value :_*))
    
    @scala.inline
    def setAfterCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterCreateRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCreateRowUndefined: Self = StObject.set(x, "afterCreateRow", js.undefined)
    
    @scala.inline
    def setAfterCreateRowVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "afterCreateRow", js.Array(value :_*))
    
    @scala.inline
    def setAfterCut(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterCutUndefined: Self = StObject.set(x, "afterCut", js.undefined)
    
    @scala.inline
    def setAfterCutVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = StObject.set(x, "afterCut", js.Array(value :_*))
    
    @scala.inline
    def setAfterDeselect(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDeselectUndefined: Self = StObject.set(x, "afterDeselect", js.undefined)
    
    @scala.inline
    def setAfterDeselectVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterDeselect", js.Array(value :_*))
    
    @scala.inline
    def setAfterDestroy(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDestroyUndefined: Self = StObject.set(x, "afterDestroy", js.undefined)
    
    @scala.inline
    def setAfterDestroyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterDestroy", js.Array(value :_*))
    
    @scala.inline
    def setAfterDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = StObject.set(x, "afterDetachChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDetachChildUndefined: Self = StObject.set(x, "afterDetachChild", js.undefined)
    
    @scala.inline
    def setAfterDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = StObject.set(x, "afterDetachChild", js.Array(value :_*))
    
    @scala.inline
    def setAfterDocumentKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = StObject.set(x, "afterDocumentKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDocumentKeyDownUndefined: Self = StObject.set(x, "afterDocumentKeyDown", js.undefined)
    
    @scala.inline
    def setAfterDocumentKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = StObject.set(x, "afterDocumentKeyDown", js.Array(value :_*))
    
    @scala.inline
    def setAfterDrawSelection(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterDrawSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDrawSelectionUndefined: Self = StObject.set(x, "afterDrawSelection", js.undefined)
    
    @scala.inline
    def setAfterDrawSelectionVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentRow */ Double, 
            /* currentColumn */ Double, 
            /* cornersOfSelection */ js.Array[Double], 
            /* layerLevel */ Double | Unit, 
            String | Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterDrawSelection", js.Array(value :_*))
    
    @scala.inline
    def setAfterDropdownMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterDropdownMenuDefaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDropdownMenuDefaultOptionsUndefined: Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.undefined)
    
    @scala.inline
    def setAfterDropdownMenuDefaultOptionsVarargs(
      value: (js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ])*
    ): Self = StObject.set(x, "afterDropdownMenuDefaultOptions", js.Array(value :_*))
    
    @scala.inline
    def setAfterDropdownMenuHide(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "afterDropdownMenuHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDropdownMenuHideUndefined: Self = StObject.set(x, "afterDropdownMenuHide", js.undefined)
    
    @scala.inline
    def setAfterDropdownMenuHideVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "afterDropdownMenuHide", js.Array(value :_*))
    
    @scala.inline
    def setAfterDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "afterDropdownMenuShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterDropdownMenuShowUndefined: Self = StObject.set(x, "afterDropdownMenuShow", js.undefined)
    
    @scala.inline
    def setAfterDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "afterDropdownMenuShow", js.Array(value :_*))
    
    @scala.inline
    def setAfterFilter(value: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]): Self = StObject.set(x, "afterFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterFilterUndefined: Self = StObject.set(x, "afterFilter", js.undefined)
    
    @scala.inline
    def setAfterFilterVarargs(value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]])*): Self = StObject.set(x, "afterFilter", js.Array(value :_*))
    
    @scala.inline
    def setAfterGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterGetCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGetCellMetaUndefined: Self = StObject.set(x, "afterGetCellMeta", js.undefined)
    
    @scala.inline
    def setAfterGetCellMetaVarargs(
      value: (js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ])*
    ): Self = StObject.set(x, "afterGetCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setAfterGetColHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = StObject.set(x, "afterGetColHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGetColHeaderUndefined: Self = StObject.set(x, "afterGetColHeader", js.undefined)
    
    @scala.inline
    def setAfterGetColHeaderVarargs(value: (js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = StObject.set(x, "afterGetColHeader", js.Array(value :_*))
    
    @scala.inline
    def setAfterGetColumnHeaderRenderers(
      value: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterGetColumnHeaderRenderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGetColumnHeaderRenderersUndefined: Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.undefined)
    
    @scala.inline
    def setAfterGetColumnHeaderRenderersVarargs(
      value: (js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterGetColumnHeaderRenderers", js.Array(value :_*))
    
    @scala.inline
    def setAfterGetRowHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = StObject.set(x, "afterGetRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGetRowHeaderRenderers(
      value: js.Array[
          js.UndefOr[
            js.Function1[
              /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterGetRowHeaderRenderers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterGetRowHeaderRenderersUndefined: Self = StObject.set(x, "afterGetRowHeaderRenderers", js.undefined)
    
    @scala.inline
    def setAfterGetRowHeaderRenderersVarargs(
      value: (js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterGetRowHeaderRenderers", js.Array(value :_*))
    
    @scala.inline
    def setAfterGetRowHeaderUndefined: Self = StObject.set(x, "afterGetRowHeader", js.undefined)
    
    @scala.inline
    def setAfterGetRowHeaderVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = StObject.set(x, "afterGetRowHeader", js.Array(value :_*))
    
    @scala.inline
    def setAfterHideColumns(
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
    
    @scala.inline
    def setAfterHideColumnsUndefined: Self = StObject.set(x, "afterHideColumns", js.undefined)
    
    @scala.inline
    def setAfterHideColumnsVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterHideColumns", js.Array(value :_*))
    
    @scala.inline
    def setAfterHideRows(
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
    
    @scala.inline
    def setAfterHideRowsUndefined: Self = StObject.set(x, "afterHideRows", js.undefined)
    
    @scala.inline
    def setAfterHideRowsVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterHideRows", js.Array(value :_*))
    
    @scala.inline
    def setAfterInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    @scala.inline
    def setAfterInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterInit", js.Array(value :_*))
    
    @scala.inline
    def setAfterLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = StObject.set(x, "afterLanguageChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterLanguageChangeUndefined: Self = StObject.set(x, "afterLanguageChange", js.undefined)
    
    @scala.inline
    def setAfterLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = StObject.set(x, "afterLanguageChange", js.Array(value :_*))
    
    @scala.inline
    def setAfterListen(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterListen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
    
    @scala.inline
    def setAfterListenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterListen", js.Array(value :_*))
    
    @scala.inline
    def setAfterLoadData(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterLoadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterLoadDataUndefined: Self = StObject.set(x, "afterLoadData", js.undefined)
    
    @scala.inline
    def setAfterLoadDataVarargs(
      value: (js.UndefOr[
          js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
        ])*
    ): Self = StObject.set(x, "afterLoadData", js.Array(value :_*))
    
    @scala.inline
    def setAfterMergeCells(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterMergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterMergeCellsUndefined: Self = StObject.set(x, "afterMergeCells", js.undefined)
    
    @scala.inline
    def setAfterMergeCellsVarargs(
      value: (js.UndefOr[
          js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ])*
    ): Self = StObject.set(x, "afterMergeCells", js.Array(value :_*))
    
    @scala.inline
    def setAfterModifyTransformEnd(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ CellCoords, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterModifyTransformEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterModifyTransformEndUndefined: Self = StObject.set(x, "afterModifyTransformEnd", js.undefined)
    
    @scala.inline
    def setAfterModifyTransformEndVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* coords */ CellCoords, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterModifyTransformEnd", js.Array(value :_*))
    
    @scala.inline
    def setAfterModifyTransformStart(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* coords */ CellCoords, 
              /* rowTransformDir */ `-1` | `0`, 
              /* colTransformDir */ `-1` | `0`, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "afterModifyTransformStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterModifyTransformStartUndefined: Self = StObject.set(x, "afterModifyTransformStart", js.undefined)
    
    @scala.inline
    def setAfterModifyTransformStartVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* coords */ CellCoords, 
            /* rowTransformDir */ `-1` | `0`, 
            /* colTransformDir */ `-1` | `0`, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterModifyTransformStart", js.Array(value :_*))
    
    @scala.inline
    def setAfterMomentumScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterMomentumScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterMomentumScrollUndefined: Self = StObject.set(x, "afterMomentumScroll", js.undefined)
    
    @scala.inline
    def setAfterMomentumScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterMomentumScroll", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterOnCellContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellContextMenuUndefined: Self = StObject.set(x, "afterOnCellContextMenu", js.undefined)
    
    @scala.inline
    def setAfterOnCellContextMenuVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "afterOnCellContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellCornerDblClick(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = StObject.set(x, "afterOnCellCornerDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellCornerDblClickUndefined: Self = StObject.set(x, "afterOnCellCornerDblClick", js.undefined)
    
    @scala.inline
    def setAfterOnCellCornerDblClickVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = StObject.set(x, "afterOnCellCornerDblClick", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellCornerMouseDown(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = StObject.set(x, "afterOnCellCornerMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellCornerMouseDownUndefined: Self = StObject.set(x, "afterOnCellCornerMouseDown", js.undefined)
    
    @scala.inline
    def setAfterOnCellCornerMouseDownVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = StObject.set(x, "afterOnCellCornerMouseDown", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellMouseDown(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterOnCellMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellMouseDownUndefined: Self = StObject.set(x, "afterOnCellMouseDown", js.undefined)
    
    @scala.inline
    def setAfterOnCellMouseDownVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "afterOnCellMouseDown", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterOnCellMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellMouseOutUndefined: Self = StObject.set(x, "afterOnCellMouseOut", js.undefined)
    
    @scala.inline
    def setAfterOnCellMouseOutVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "afterOnCellMouseOut", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellMouseOver(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterOnCellMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellMouseOverUndefined: Self = StObject.set(x, "afterOnCellMouseOver", js.undefined)
    
    @scala.inline
    def setAfterOnCellMouseOverVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "afterOnCellMouseOver", js.Array(value :_*))
    
    @scala.inline
    def setAfterOnCellMouseUp(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterOnCellMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterOnCellMouseUpUndefined: Self = StObject.set(x, "afterOnCellMouseUp", js.undefined)
    
    @scala.inline
    def setAfterOnCellMouseUpVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "afterOnCellMouseUp", js.Array(value :_*))
    
    @scala.inline
    def setAfterPaste(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterPasteUndefined: Self = StObject.set(x, "afterPaste", js.undefined)
    
    @scala.inline
    def setAfterPasteVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = StObject.set(x, "afterPaste", js.Array(value :_*))
    
    @scala.inline
    def setAfterPluginsInitialized(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterPluginsInitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterPluginsInitializedUndefined: Self = StObject.set(x, "afterPluginsInitialized", js.undefined)
    
    @scala.inline
    def setAfterPluginsInitializedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterPluginsInitialized", js.Array(value :_*))
    
    @scala.inline
    def setAfterRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = StObject.set(x, "afterRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRedoUndefined: Self = StObject.set(x, "afterRedo", js.undefined)
    
    @scala.inline
    def setAfterRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = StObject.set(x, "afterRedo", js.Array(value :_*))
    
    @scala.inline
    def setAfterRefreshDimensions(
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
    
    @scala.inline
    def setAfterRefreshDimensionsUndefined: Self = StObject.set(x, "afterRefreshDimensions", js.undefined)
    
    @scala.inline
    def setAfterRefreshDimensionsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterRefreshDimensions", js.Array(value :_*))
    
    @scala.inline
    def setAfterRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterRemoveCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRemoveCellMetaUndefined: Self = StObject.set(x, "afterRemoveCellMeta", js.undefined)
    
    @scala.inline
    def setAfterRemoveCellMetaVarargs(
      value: (js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, js.Any, Unit]
        ])*
    ): Self = StObject.set(x, "afterRemoveCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setAfterRemoveCol(
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
    
    @scala.inline
    def setAfterRemoveColUndefined: Self = StObject.set(x, "afterRemoveCol", js.undefined)
    
    @scala.inline
    def setAfterRemoveColVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterRemoveCol", js.Array(value :_*))
    
    @scala.inline
    def setAfterRemoveRow(
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
    
    @scala.inline
    def setAfterRemoveRowUndefined: Self = StObject.set(x, "afterRemoveRow", js.undefined)
    
    @scala.inline
    def setAfterRemoveRowVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalRows */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterRemoveRow", js.Array(value :_*))
    
    @scala.inline
    def setAfterRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = StObject.set(x, "afterRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setAfterRenderVarargs(value: (js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]])*): Self = StObject.set(x, "afterRender", js.Array(value :_*))
    
    @scala.inline
    def setAfterRenderer(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRendererUndefined: Self = StObject.set(x, "afterRenderer", js.undefined)
    
    @scala.inline
    def setAfterRendererVarargs(
      value: (js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* col */ Double, 
            /* prop */ String | Double, 
            /* value */ String, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterRenderer", js.Array(value :_*))
    
    @scala.inline
    def setAfterRowMove(
      value: js.Array[
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
    ): Self = StObject.set(x, "afterRowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRowMoveUndefined: Self = StObject.set(x, "afterRowMove", js.undefined)
    
    @scala.inline
    def setAfterRowMoveVarargs(
      value: (js.UndefOr[
          js.Function5[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ Double | Unit, 
            /* movePossible */ Boolean, 
            /* orderChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterRowMove", js.Array(value :_*))
    
    @scala.inline
    def setAfterRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterRowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterRowResizeUndefined: Self = StObject.set(x, "afterRowResize", js.undefined)
    
    @scala.inline
    def setAfterRowResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Unit]
        ])*
    ): Self = StObject.set(x, "afterRowResize", js.Array(value :_*))
    
    @scala.inline
    def setAfterScrollHorizontally(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterScrollHorizontally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterScrollHorizontallyUndefined: Self = StObject.set(x, "afterScrollHorizontally", js.undefined)
    
    @scala.inline
    def setAfterScrollHorizontallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterScrollHorizontally", js.Array(value :_*))
    
    @scala.inline
    def setAfterScrollVertically(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterScrollVertically", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterScrollVerticallyUndefined: Self = StObject.set(x, "afterScrollVertically", js.undefined)
    
    @scala.inline
    def setAfterScrollVerticallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterScrollVertically", js.Array(value :_*))
    
    @scala.inline
    def setAfterSelection(
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
    
    @scala.inline
    def setAfterSelectionByProp(
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
    
    @scala.inline
    def setAfterSelectionByPropUndefined: Self = StObject.set(x, "afterSelectionByProp", js.undefined)
    
    @scala.inline
    def setAfterSelectionByPropVarargs(
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
    ): Self = StObject.set(x, "afterSelectionByProp", js.Array(value :_*))
    
    @scala.inline
    def setAfterSelectionEnd(
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
    
    @scala.inline
    def setAfterSelectionEndByProp(
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
    
    @scala.inline
    def setAfterSelectionEndByPropUndefined: Self = StObject.set(x, "afterSelectionEndByProp", js.undefined)
    
    @scala.inline
    def setAfterSelectionEndByPropVarargs(
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
    ): Self = StObject.set(x, "afterSelectionEndByProp", js.Array(value :_*))
    
    @scala.inline
    def setAfterSelectionEndUndefined: Self = StObject.set(x, "afterSelectionEnd", js.undefined)
    
    @scala.inline
    def setAfterSelectionEndVarargs(
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
    ): Self = StObject.set(x, "afterSelectionEnd", js.Array(value :_*))
    
    @scala.inline
    def setAfterSelectionUndefined: Self = StObject.set(x, "afterSelection", js.undefined)
    
    @scala.inline
    def setAfterSelectionVarargs(
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
    ): Self = StObject.set(x, "afterSelection", js.Array(value :_*))
    
    @scala.inline
    def setAfterSetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterSetCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSetCellMetaUndefined: Self = StObject.set(x, "afterSetCellMeta", js.undefined)
    
    @scala.inline
    def setAfterSetCellMetaVarargs(
      value: (js.UndefOr[js.Function4[/* row */ Double, /* col */ Double, /* key */ String, js.Any, Unit]])*
    ): Self = StObject.set(x, "afterSetCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setAfterSetDataAtCell(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterSetDataAtCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSetDataAtCellUndefined: Self = StObject.set(x, "afterSetDataAtCell", js.undefined)
    
    @scala.inline
    def setAfterSetDataAtCellVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "afterSetDataAtCell", js.Array(value :_*))
    
    @scala.inline
    def setAfterSetDataAtRowProp(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterSetDataAtRowProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSetDataAtRowPropUndefined: Self = StObject.set(x, "afterSetDataAtRowProp", js.undefined)
    
    @scala.inline
    def setAfterSetDataAtRowPropVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "afterSetDataAtRowProp", js.Array(value :_*))
    
    @scala.inline
    def setAfterSetSourceDataAtCell(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "afterSetSourceDataAtCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterSetSourceDataAtCellUndefined: Self = StObject.set(x, "afterSetSourceDataAtCell", js.undefined)
    
    @scala.inline
    def setAfterSetSourceDataAtCellVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "afterSetSourceDataAtCell", js.Array(value :_*))
    
    @scala.inline
    def setAfterTrimRow(
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
    
    @scala.inline
    def setAfterTrimRowUndefined: Self = StObject.set(x, "afterTrimRow", js.undefined)
    
    @scala.inline
    def setAfterTrimRowVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterTrimRow", js.Array(value :_*))
    
    @scala.inline
    def setAfterUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = StObject.set(x, "afterUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndoUndefined: Self = StObject.set(x, "afterUndo", js.undefined)
    
    @scala.inline
    def setAfterUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = StObject.set(x, "afterUndo", js.Array(value :_*))
    
    @scala.inline
    def setAfterUnhideColumns(
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
    
    @scala.inline
    def setAfterUnhideColumnsUndefined: Self = StObject.set(x, "afterUnhideColumns", js.undefined)
    
    @scala.inline
    def setAfterUnhideColumnsVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterUnhideColumns", js.Array(value :_*))
    
    @scala.inline
    def setAfterUnhideRows(
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
    
    @scala.inline
    def setAfterUnhideRowsUndefined: Self = StObject.set(x, "afterUnhideRows", js.undefined)
    
    @scala.inline
    def setAfterUnhideRowsVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterUnhideRows", js.Array(value :_*))
    
    @scala.inline
    def setAfterUnlisten(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "afterUnlisten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUnlistenUndefined: Self = StObject.set(x, "afterUnlisten", js.undefined)
    
    @scala.inline
    def setAfterUnlistenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "afterUnlisten", js.Array(value :_*))
    
    @scala.inline
    def setAfterUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "afterUnmergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUnmergeCellsUndefined: Self = StObject.set(x, "afterUnmergeCells", js.undefined)
    
    @scala.inline
    def setAfterUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "afterUnmergeCells", js.Array(value :_*))
    
    @scala.inline
    def setAfterUntrimRow(
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
    
    @scala.inline
    def setAfterUntrimRowUndefined: Self = StObject.set(x, "afterUntrimRow", js.undefined)
    
    @scala.inline
    def setAfterUntrimRowVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            /* stateChanged */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "afterUntrimRow", js.Array(value :_*))
    
    @scala.inline
    def setAfterUpdateSettings(value: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]): Self = StObject.set(x, "afterUpdateSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUpdateSettingsUndefined: Self = StObject.set(x, "afterUpdateSettings", js.undefined)
    
    @scala.inline
    def setAfterUpdateSettingsVarargs(value: (js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]])*): Self = StObject.set(x, "afterUpdateSettings", js.Array(value :_*))
    
    @scala.inline
    def setAfterValidate(
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
    
    @scala.inline
    def setAfterValidateUndefined: Self = StObject.set(x, "afterValidate", js.undefined)
    
    @scala.inline
    def setAfterValidateVarargs(
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
    ): Self = StObject.set(x, "afterValidate", js.Array(value :_*))
    
    @scala.inline
    def setAfterViewportColumnCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = StObject.set(x, "afterViewportColumnCalculatorOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterViewportColumnCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.undefined)
    
    @scala.inline
    def setAfterViewportColumnCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = StObject.set(x, "afterViewportColumnCalculatorOverride", js.Array(value :_*))
    
    @scala.inline
    def setAfterViewportRowCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = StObject.set(x, "afterViewportRowCalculatorOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterViewportRowCalculatorOverrideUndefined: Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.undefined)
    
    @scala.inline
    def setAfterViewportRowCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = StObject.set(x, "afterViewportRowCalculatorOverride", js.Array(value :_*))
    
    @scala.inline
    def setBeforeAddChild(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* parent */ RowObject, 
              /* element */ RowObject | Unit, 
              /* index */ Double | Unit, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeAddChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeAddChildUndefined: Self = StObject.set(x, "beforeAddChild", js.undefined)
    
    @scala.inline
    def setBeforeAddChildVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ RowObject | Unit, 
            /* index */ Double | Unit, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeAddChild", js.Array(value :_*))
    
    @scala.inline
    def setBeforeAutofill(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* start */ CellCoords, 
              /* end */ CellCoords, 
              /* data */ js.Array[js.Array[CellValue]], 
              Unit | Boolean
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeAutofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeAutofillInsidePopulate(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeAutofillInsidePopulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeAutofillInsidePopulateUndefined: Self = StObject.set(x, "beforeAutofillInsidePopulate", js.undefined)
    
    @scala.inline
    def setBeforeAutofillInsidePopulateVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ CellCoords, 
            /* direction */ up | down | left | right, 
            /* input */ js.Array[js.Array[CellValue]], 
            /* deltas */ js.Array[js.Any], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeAutofillInsidePopulate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeAutofillUndefined: Self = StObject.set(x, "beforeAutofill", js.undefined)
    
    @scala.inline
    def setBeforeAutofillVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* start */ CellCoords, 
            /* end */ CellCoords, 
            /* data */ js.Array[js.Array[CellValue]], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeAutofill", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCellAlignment(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeCellAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCellAlignmentUndefined: Self = StObject.set(x, "beforeCellAlignment", js.undefined)
    
    @scala.inline
    def setBeforeCellAlignmentVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* stateBefore */ NumberDictionary[js.Array[String]], 
            /* range */ js.Array[CellRange], 
            /* type */ horizontal | vertical, 
            /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeCellAlignment", js.Array(value :_*))
    
    @scala.inline
    def setBeforeChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Self = StObject.set(x, "beforeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeChangeRender(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeChangeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeChangeRenderUndefined: Self = StObject.set(x, "beforeChangeRender", js.undefined)
    
    @scala.inline
    def setBeforeChangeRenderVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ])*
    ): Self = StObject.set(x, "beforeChangeRender", js.Array(value :_*))
    
    @scala.inline
    def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
    
    @scala.inline
    def setBeforeChangeVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ])*
    ): Self = StObject.set(x, "beforeChange", js.Array(value :_*))
    
    @scala.inline
    def setBeforeColumnCollapse(
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
    
    @scala.inline
    def setBeforeColumnCollapseUndefined: Self = StObject.set(x, "beforeColumnCollapse", js.undefined)
    
    @scala.inline
    def setBeforeColumnCollapseVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* collapsePossible */ Boolean, 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeColumnCollapse", js.Array(value :_*))
    
    @scala.inline
    def setBeforeColumnExpand(
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
    
    @scala.inline
    def setBeforeColumnExpandUndefined: Self = StObject.set(x, "beforeColumnExpand", js.undefined)
    
    @scala.inline
    def setBeforeColumnExpandVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentCollapsedColumn */ js.Array[Double], 
            /* destinationCollapsedColumns */ js.Array[Double], 
            /* expandPossible */ Boolean, 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeColumnExpand", js.Array(value :_*))
    
    @scala.inline
    def setBeforeColumnMove(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
          ]
        ]
    ): Self = StObject.set(x, "beforeColumnMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeColumnMoveUndefined: Self = StObject.set(x, "beforeColumnMove", js.undefined)
    
    @scala.inline
    def setBeforeColumnMoveVarargs(
      value: (js.UndefOr[
          js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
        ])*
    ): Self = StObject.set(x, "beforeColumnMove", js.Array(value :_*))
    
    @scala.inline
    def setBeforeColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
          ]
        ]
    ): Self = StObject.set(x, "beforeColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeColumnResizeUndefined: Self = StObject.set(x, "beforeColumnResize", js.undefined)
    
    @scala.inline
    def setBeforeColumnResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* newSize */ Double, /* column */ Double, /* isDoubleClick */ Boolean, Unit | Double]
        ])*
    ): Self = StObject.set(x, "beforeColumnResize", js.Array(value :_*))
    
    @scala.inline
    def setBeforeColumnSort(
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
    
    @scala.inline
    def setBeforeColumnSortUndefined: Self = StObject.set(x, "beforeColumnSort", js.undefined)
    
    @scala.inline
    def setBeforeColumnSortVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeColumnSort", js.Array(value :_*))
    
    @scala.inline
    def setBeforeContextMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = StObject.set(x, "beforeContextMenuSetItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeContextMenuSetItemsUndefined: Self = StObject.set(x, "beforeContextMenuSetItems", js.undefined)
    
    @scala.inline
    def setBeforeContextMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = StObject.set(x, "beforeContextMenuSetItems", js.Array(value :_*))
    
    @scala.inline
    def setBeforeContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = StObject.set(x, "beforeContextMenuShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeContextMenuShowUndefined: Self = StObject.set(x, "beforeContextMenuShow", js.undefined)
    
    @scala.inline
    def setBeforeContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = StObject.set(x, "beforeContextMenuShow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCopy(
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
    
    @scala.inline
    def setBeforeCopyUndefined: Self = StObject.set(x, "beforeCopy", js.undefined)
    
    @scala.inline
    def setBeforeCopyVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeCopy", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCreateCol(
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
    
    @scala.inline
    def setBeforeCreateColUndefined: Self = StObject.set(x, "beforeCreateCol", js.undefined)
    
    @scala.inline
    def setBeforeCreateColVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* index */ Double, 
            /* amount */ Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeCreateCol", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeCreateRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeCreateRowUndefined: Self = StObject.set(x, "beforeCreateRow", js.undefined)
    
    @scala.inline
    def setBeforeCreateRowVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = StObject.set(x, "beforeCreateRow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeCut(
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
    
    @scala.inline
    def setBeforeCutUndefined: Self = StObject.set(x, "beforeCut", js.undefined)
    
    @scala.inline
    def setBeforeCutVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforeCut", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = StObject.set(x, "beforeDetachChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDetachChildUndefined: Self = StObject.set(x, "beforeDetachChild", js.undefined)
    
    @scala.inline
    def setBeforeDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = StObject.set(x, "beforeDetachChild", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDrawBorders(
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
    
    @scala.inline
    def setBeforeDrawBordersUndefined: Self = StObject.set(x, "beforeDrawBorders", js.undefined)
    
    @scala.inline
    def setBeforeDrawBordersVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeDrawBorders", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDropdownMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = StObject.set(x, "beforeDropdownMenuSetItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDropdownMenuSetItemsUndefined: Self = StObject.set(x, "beforeDropdownMenuSetItems", js.undefined)
    
    @scala.inline
    def setBeforeDropdownMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = StObject.set(x, "beforeDropdownMenuSetItems", js.Array(value :_*))
    
    @scala.inline
    def setBeforeDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = StObject.set(x, "beforeDropdownMenuShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeDropdownMenuShowUndefined: Self = StObject.set(x, "beforeDropdownMenuShow", js.undefined)
    
    @scala.inline
    def setBeforeDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = StObject.set(x, "beforeDropdownMenuShow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeFilter(
      value: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Self = StObject.set(x, "beforeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeFilterUndefined: Self = StObject.set(x, "beforeFilter", js.undefined)
    
    @scala.inline
    def setBeforeFilterVarargs(
      value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]])*
    ): Self = StObject.set(x, "beforeFilter", js.Array(value :_*))
    
    @scala.inline
    def setBeforeGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeGetCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeGetCellMetaUndefined: Self = StObject.set(x, "beforeGetCellMeta", js.undefined)
    
    @scala.inline
    def setBeforeGetCellMetaVarargs(
      value: (js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ])*
    ): Self = StObject.set(x, "beforeGetCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setBeforeHideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeHideColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeHideColumnsUndefined: Self = StObject.set(x, "beforeHideColumns", js.undefined)
    
    @scala.inline
    def setBeforeHideColumnsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeHideColumns", js.Array(value :_*))
    
    @scala.inline
    def setBeforeHideRows(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeHideRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeHideRowsUndefined: Self = StObject.set(x, "beforeHideRows", js.undefined)
    
    @scala.inline
    def setBeforeHideRowsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeHideRows", js.Array(value :_*))
    
    @scala.inline
    def setBeforeInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "beforeInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "beforeInit", js.Array(value :_*))
    
    @scala.inline
    def setBeforeInitWalkontable(value: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]): Self = StObject.set(x, "beforeInitWalkontable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeInitWalkontableUndefined: Self = StObject.set(x, "beforeInitWalkontable", js.undefined)
    
    @scala.inline
    def setBeforeInitWalkontableVarargs(value: (js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]])*): Self = StObject.set(x, "beforeInitWalkontable", js.Array(value :_*))
    
    @scala.inline
    def setBeforeKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = StObject.set(x, "beforeKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeKeyDownUndefined: Self = StObject.set(x, "beforeKeyDown", js.undefined)
    
    @scala.inline
    def setBeforeKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = StObject.set(x, "beforeKeyDown", js.Array(value :_*))
    
    @scala.inline
    def setBeforeLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = StObject.set(x, "beforeLanguageChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeLanguageChangeUndefined: Self = StObject.set(x, "beforeLanguageChange", js.undefined)
    
    @scala.inline
    def setBeforeLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = StObject.set(x, "beforeLanguageChange", js.Array(value :_*))
    
    @scala.inline
    def setBeforeLoadData(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeLoadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeLoadDataUndefined: Self = StObject.set(x, "beforeLoadData", js.undefined)
    
    @scala.inline
    def setBeforeLoadDataVarargs(
      value: (js.UndefOr[
          js.Function2[/* sourceData */ js.Array[CellValue], /* initialLoad */ Boolean, Unit]
        ])*
    ): Self = StObject.set(x, "beforeLoadData", js.Array(value :_*))
    
    @scala.inline
    def setBeforeMergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "beforeMergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeMergeCellsUndefined: Self = StObject.set(x, "beforeMergeCells", js.undefined)
    
    @scala.inline
    def setBeforeMergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "beforeMergeCells", js.Array(value :_*))
    
    @scala.inline
    def setBeforeOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeOnCellContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeOnCellContextMenuUndefined: Self = StObject.set(x, "beforeOnCellContextMenu", js.undefined)
    
    @scala.inline
    def setBeforeOnCellContextMenuVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "beforeOnCellContextMenu", js.Array(value :_*))
    
    @scala.inline
    def setBeforeOnCellMouseDown(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeOnCellMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeOnCellMouseDownUndefined: Self = StObject.set(x, "beforeOnCellMouseDown", js.undefined)
    
    @scala.inline
    def setBeforeOnCellMouseDownVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ CellCoords, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeOnCellMouseDown", js.Array(value :_*))
    
    @scala.inline
    def setBeforeOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeOnCellMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeOnCellMouseOutUndefined: Self = StObject.set(x, "beforeOnCellMouseOut", js.undefined)
    
    @scala.inline
    def setBeforeOnCellMouseOutVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = StObject.set(x, "beforeOnCellMouseOut", js.Array(value :_*))
    
    @scala.inline
    def setBeforeOnCellMouseOver(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeOnCellMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeOnCellMouseOverUndefined: Self = StObject.set(x, "beforeOnCellMouseOver", js.undefined)
    
    @scala.inline
    def setBeforeOnCellMouseOverVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ CellCoords, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeOnCellMouseOver", js.Array(value :_*))
    
    @scala.inline
    def setBeforeOnCellMouseUp(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeOnCellMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeOnCellMouseUpUndefined: Self = StObject.set(x, "beforeOnCellMouseUp", js.undefined)
    
    @scala.inline
    def setBeforeOnCellMouseUpVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* event */ MouseEvent, 
            /* coords */ CellCoords, 
            /* TD */ HTMLTableCellElement, 
            /* controller */ SelectionController, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeOnCellMouseUp", js.Array(value :_*))
    
    @scala.inline
    def setBeforePaste(
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
    
    @scala.inline
    def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
    
    @scala.inline
    def setBeforePasteVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = StObject.set(x, "beforePaste", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = StObject.set(x, "beforeRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRedoUndefined: Self = StObject.set(x, "beforeRedo", js.undefined)
    
    @scala.inline
    def setBeforeRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = StObject.set(x, "beforeRedo", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRefreshDimensions(
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
    
    @scala.inline
    def setBeforeRefreshDimensionsUndefined: Self = StObject.set(x, "beforeRefreshDimensions", js.undefined)
    
    @scala.inline
    def setBeforeRefreshDimensionsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* previousDimensions */ js.Object, 
            /* currentDimensions */ js.Object, 
            /* actionPossible */ Boolean, 
            Boolean | Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeRefreshDimensions", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRemoveCellClassNames(value: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]): Self = StObject.set(x, "beforeRemoveCellClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRemoveCellClassNamesUndefined: Self = StObject.set(x, "beforeRemoveCellClassNames", js.undefined)
    
    @scala.inline
    def setBeforeRemoveCellClassNamesVarargs(value: (js.UndefOr[js.Function0[js.Array[String] | Unit]])*): Self = StObject.set(x, "beforeRemoveCellClassNames", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeRemoveCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRemoveCellMetaUndefined: Self = StObject.set(x, "beforeRemoveCellMeta", js.undefined)
    
    @scala.inline
    def setBeforeRemoveCellMetaVarargs(
      value: (js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, js.Any, Unit]
        ])*
    ): Self = StObject.set(x, "beforeRemoveCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRemoveCol(
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
    
    @scala.inline
    def setBeforeRemoveColUndefined: Self = StObject.set(x, "beforeRemoveCol", js.undefined)
    
    @scala.inline
    def setBeforeRemoveColVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeRemoveCol", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRemoveRow(
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
    
    @scala.inline
    def setBeforeRemoveRowUndefined: Self = StObject.set(x, "beforeRemoveRow", js.undefined)
    
    @scala.inline
    def setBeforeRemoveRowVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeRemoveRow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Self = StObject.set(x, "beforeRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
    
    @scala.inline
    def setBeforeRenderVarargs(value: (js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]])*): Self = StObject.set(x, "beforeRender", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRenderer(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRendererUndefined: Self = StObject.set(x, "beforeRenderer", js.undefined)
    
    @scala.inline
    def setBeforeRendererVarargs(
      value: (js.UndefOr[
          js.Function6[
            /* TD */ HTMLTableCellElement, 
            /* row */ Double, 
            /* col */ Double, 
            /* prop */ String | Double, 
            /* value */ CellValue, 
            /* cellProperties */ CellProperties, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeRenderer", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRowMove(
      value: js.Array[
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
    ): Self = StObject.set(x, "beforeRowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRowMoveUndefined: Self = StObject.set(x, "beforeRowMove", js.undefined)
    
    @scala.inline
    def setBeforeRowMoveVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* movedRows */ js.Array[Double], 
            /* finalIndex */ Double, 
            /* dropIndex */ Double | Unit, 
            /* movePossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeRowMove", js.Array(value :_*))
    
    @scala.inline
    def setBeforeRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeRowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeRowResizeUndefined: Self = StObject.set(x, "beforeRowResize", js.undefined)
    
    @scala.inline
    def setBeforeRowResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* newSize */ Double, /* row */ Double, /* isDoubleClick */ Boolean, Double | Unit]
        ])*
    ): Self = StObject.set(x, "beforeRowResize", js.Array(value :_*))
    
    @scala.inline
    def setBeforeSetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Boolean | Unit]
          ]
        ]
    ): Self = StObject.set(x, "beforeSetCellMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSetCellMetaUndefined: Self = StObject.set(x, "beforeSetCellMeta", js.undefined)
    
    @scala.inline
    def setBeforeSetCellMetaVarargs(
      value: (js.UndefOr[
          js.Function4[/* row */ Double, /* col */ Double, /* key */ String, js.Any, Boolean | Unit]
        ])*
    ): Self = StObject.set(x, "beforeSetCellMeta", js.Array(value :_*))
    
    @scala.inline
    def setBeforeSetRangeEnd(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = StObject.set(x, "beforeSetRangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSetRangeEndUndefined: Self = StObject.set(x, "beforeSetRangeEnd", js.undefined)
    
    @scala.inline
    def setBeforeSetRangeEndVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = StObject.set(x, "beforeSetRangeEnd", js.Array(value :_*))
    
    @scala.inline
    def setBeforeSetRangeStart(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = StObject.set(x, "beforeSetRangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSetRangeStartOnly(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = StObject.set(x, "beforeSetRangeStartOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeSetRangeStartOnlyUndefined: Self = StObject.set(x, "beforeSetRangeStartOnly", js.undefined)
    
    @scala.inline
    def setBeforeSetRangeStartOnlyVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = StObject.set(x, "beforeSetRangeStartOnly", js.Array(value :_*))
    
    @scala.inline
    def setBeforeSetRangeStartUndefined: Self = StObject.set(x, "beforeSetRangeStart", js.undefined)
    
    @scala.inline
    def setBeforeSetRangeStartVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = StObject.set(x, "beforeSetRangeStart", js.Array(value :_*))
    
    @scala.inline
    def setBeforeStretchingColumnWidth(
      value: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Self = StObject.set(x, "beforeStretchingColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeStretchingColumnWidthUndefined: Self = StObject.set(x, "beforeStretchingColumnWidth", js.undefined)
    
    @scala.inline
    def setBeforeStretchingColumnWidthVarargs(
      value: (js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]])*
    ): Self = StObject.set(x, "beforeStretchingColumnWidth", js.Array(value :_*))
    
    @scala.inline
    def setBeforeTouchScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "beforeTouchScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeTouchScrollUndefined: Self = StObject.set(x, "beforeTouchScroll", js.undefined)
    
    @scala.inline
    def setBeforeTouchScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "beforeTouchScroll", js.Array(value :_*))
    
    @scala.inline
    def setBeforeTrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeTrimRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeTrimRowUndefined: Self = StObject.set(x, "beforeTrimRow", js.undefined)
    
    @scala.inline
    def setBeforeTrimRowVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeTrimRow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = StObject.set(x, "beforeUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndoUndefined: Self = StObject.set(x, "beforeUndo", js.undefined)
    
    @scala.inline
    def setBeforeUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = StObject.set(x, "beforeUndo", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUnhideColumns(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeUnhideColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUnhideColumnsUndefined: Self = StObject.set(x, "beforeUnhideColumns", js.undefined)
    
    @scala.inline
    def setBeforeUnhideColumnsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeUnhideColumns", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUnhideRows(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentHideConfig */ js.Array[Double], 
              /* destinationHideConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeUnhideRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUnhideRowsUndefined: Self = StObject.set(x, "beforeUnhideRows", js.undefined)
    
    @scala.inline
    def setBeforeUnhideRowsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentHideConfig */ js.Array[Double], 
            /* destinationHideConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeUnhideRows", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = StObject.set(x, "beforeUnmergeCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUnmergeCellsUndefined: Self = StObject.set(x, "beforeUnmergeCells", js.undefined)
    
    @scala.inline
    def setBeforeUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = StObject.set(x, "beforeUnmergeCells", js.Array(value :_*))
    
    @scala.inline
    def setBeforeUntrimRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentTrimConfig */ js.Array[Double], 
              /* destinationTrimConfig */ js.Array[Double], 
              /* actionPossible */ Boolean, 
              Unit
            ]
          ]
        ]
    ): Self = StObject.set(x, "beforeUntrimRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUntrimRowUndefined: Self = StObject.set(x, "beforeUntrimRow", js.undefined)
    
    @scala.inline
    def setBeforeUntrimRowVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentTrimConfig */ js.Array[Double], 
            /* destinationTrimConfig */ js.Array[Double], 
            /* actionPossible */ Boolean, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeUntrimRow", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValidate(
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
    
    @scala.inline
    def setBeforeValidateUndefined: Self = StObject.set(x, "beforeValidate", js.undefined)
    
    @scala.inline
    def setBeforeValidateVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* value */ CellValue, 
            /* row */ Double, 
            /* prop */ String | Double, 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "beforeValidate", js.Array(value :_*))
    
    @scala.inline
    def setBeforeValueRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Self = StObject.set(x, "beforeValueRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeValueRenderUndefined: Self = StObject.set(x, "beforeValueRender", js.undefined)
    
    @scala.inline
    def setBeforeValueRenderVarargs(
      value: (js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]])*
    ): Self = StObject.set(x, "beforeValueRender", js.Array(value :_*))
    
    @scala.inline
    def setConstruct(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "construct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
    
    @scala.inline
    def setConstructVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "construct", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "init", js.Array(value :_*))
    
    @scala.inline
    def setModifyAutofillRange(
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
    
    @scala.inline
    def setModifyAutofillRangeUndefined: Self = StObject.set(x, "modifyAutofillRange", js.undefined)
    
    @scala.inline
    def setModifyAutofillRangeVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "modifyAutofillRange", js.Array(value :_*))
    
    @scala.inline
    def setModifyColHeader(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = StObject.set(x, "modifyColHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyColHeaderUndefined: Self = StObject.set(x, "modifyColHeader", js.undefined)
    
    @scala.inline
    def setModifyColHeaderVarargs(value: (js.UndefOr[js.Function1[/* column */ Double, Unit]])*): Self = StObject.set(x, "modifyColHeader", js.Array(value :_*))
    
    @scala.inline
    def setModifyColWidth(value: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]): Self = StObject.set(x, "modifyColWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyColWidthUndefined: Self = StObject.set(x, "modifyColWidth", js.undefined)
    
    @scala.inline
    def setModifyColWidthVarargs(value: (js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]])*): Self = StObject.set(x, "modifyColWidth", js.Array(value :_*))
    
    @scala.inline
    def setModifyColumnHeaderHeight(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "modifyColumnHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyColumnHeaderHeightUndefined: Self = StObject.set(x, "modifyColumnHeaderHeight", js.undefined)
    
    @scala.inline
    def setModifyColumnHeaderHeightVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = StObject.set(x, "modifyColumnHeaderHeight", js.Array(value :_*))
    
    @scala.inline
    def setModifyCopyableRange(value: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]): Self = StObject.set(x, "modifyCopyableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyCopyableRangeUndefined: Self = StObject.set(x, "modifyCopyableRange", js.undefined)
    
    @scala.inline
    def setModifyCopyableRangeVarargs(value: (js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]])*): Self = StObject.set(x, "modifyCopyableRange", js.Array(value :_*))
    
    @scala.inline
    def setModifyData(
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
    
    @scala.inline
    def setModifyDataUndefined: Self = StObject.set(x, "modifyData", js.undefined)
    
    @scala.inline
    def setModifyDataVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* column */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "modifyData", js.Array(value :_*))
    
    @scala.inline
    def setModifyGetCellCoords(
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
    
    @scala.inline
    def setModifyGetCellCoordsUndefined: Self = StObject.set(x, "modifyGetCellCoords", js.undefined)
    
    @scala.inline
    def setModifyGetCellCoordsVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* row */ Double, 
            /* column */ Double, 
            /* topmost */ Boolean, 
            Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
          ]
        ])*
    ): Self = StObject.set(x, "modifyGetCellCoords", js.Array(value :_*))
    
    @scala.inline
    def setModifyRowData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRowDataUndefined: Self = StObject.set(x, "modifyRowData", js.undefined)
    
    @scala.inline
    def setModifyRowDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowData", js.Array(value :_*))
    
    @scala.inline
    def setModifyRowHeader(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRowHeaderUndefined: Self = StObject.set(x, "modifyRowHeader", js.undefined)
    
    @scala.inline
    def setModifyRowHeaderVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeader", js.Array(value :_*))
    
    @scala.inline
    def setModifyRowHeaderWidth(value: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeaderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRowHeaderWidthUndefined: Self = StObject.set(x, "modifyRowHeaderWidth", js.undefined)
    
    @scala.inline
    def setModifyRowHeaderWidthVarargs(value: (js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeaderWidth", js.Array(value :_*))
    
    @scala.inline
    def setModifyRowHeight(value: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRowHeightUndefined: Self = StObject.set(x, "modifyRowHeight", js.undefined)
    
    @scala.inline
    def setModifyRowHeightVarargs(value: (js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowHeight", js.Array(value :_*))
    
    @scala.inline
    def setModifyRowSourceData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = StObject.set(x, "modifyRowSourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRowSourceDataUndefined: Self = StObject.set(x, "modifyRowSourceData", js.undefined)
    
    @scala.inline
    def setModifyRowSourceDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = StObject.set(x, "modifyRowSourceData", js.Array(value :_*))
    
    @scala.inline
    def setModifySourceData(
      value: js.Array[
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
    ): Self = StObject.set(x, "modifySourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifySourceDataUndefined: Self = StObject.set(x, "modifySourceData", js.undefined)
    
    @scala.inline
    def setModifySourceDataVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* row */ Double, 
            /* col */ Double, 
            /* valueHolder */ ValueCellValue, 
            /* ioMode */ get | set, 
            Unit
          ]
        ])*
    ): Self = StObject.set(x, "modifySourceData", js.Array(value :_*))
    
    @scala.inline
    def setModifyTransformEnd(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = StObject.set(x, "modifyTransformEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyTransformEndUndefined: Self = StObject.set(x, "modifyTransformEnd", js.undefined)
    
    @scala.inline
    def setModifyTransformEndVarargs(value: (js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]])*): Self = StObject.set(x, "modifyTransformEnd", js.Array(value :_*))
    
    @scala.inline
    def setModifyTransformStart(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = StObject.set(x, "modifyTransformStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyTransformStartUndefined: Self = StObject.set(x, "modifyTransformStart", js.undefined)
    
    @scala.inline
    def setModifyTransformStartVarargs(value: (js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]])*): Self = StObject.set(x, "modifyTransformStart", js.Array(value :_*))
    
    @scala.inline
    def setPersistentStateLoad(
      value: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Self = StObject.set(x, "persistentStateLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateLoadUndefined: Self = StObject.set(x, "persistentStateLoad", js.undefined)
    
    @scala.inline
    def setPersistentStateLoadVarargs(value: (js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]])*): Self = StObject.set(x, "persistentStateLoad", js.Array(value :_*))
    
    @scala.inline
    def setPersistentStateReset(value: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Self = StObject.set(x, "persistentStateReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateResetUndefined: Self = StObject.set(x, "persistentStateReset", js.undefined)
    
    @scala.inline
    def setPersistentStateResetVarargs(value: (js.UndefOr[js.Function1[/* key */ String, Unit]])*): Self = StObject.set(x, "persistentStateReset", js.Array(value :_*))
    
    @scala.inline
    def setPersistentStateSave(value: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]): Self = StObject.set(x, "persistentStateSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentStateSaveUndefined: Self = StObject.set(x, "persistentStateSave", js.undefined)
    
    @scala.inline
    def setPersistentStateSaveVarargs(value: (js.UndefOr[js.Function2[/* key */ String, js.Any, Unit]])*): Self = StObject.set(x, "persistentStateSave", js.Array(value :_*))
  }
}
