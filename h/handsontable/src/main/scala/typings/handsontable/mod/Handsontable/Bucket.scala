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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof handsontable.handsontable.Handsontable.Hooks.Events ]: std.Array<handsontable.handsontable.Handsontable.Hooks.Events[P]>} */
@js.native
trait Bucket extends js.Object {
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
  var afterColumnMove: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ] = js.native
  var afterColumnResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
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
  var afterLoadData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]] = js.native
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
          /* physicalColumns */ js.Array[Double], 
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
    js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]
  ] = js.native
  var afterRowResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
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
          Unit
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
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
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
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ]
  ] = js.native
  var beforeRowResize: js.UndefOr[
    js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
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
  var hiddenColumn: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]] = js.native
  var hiddenRow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
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
  var modifyCol: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]] = js.native
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
  var modifyRow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  var modifyRowData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  var modifyRowHeader: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  var modifyRowHeaderWidth: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]] = js.native
  var modifyRowHeight: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]] = js.native
  var modifyRowSourceData: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
  var modifyTransformEnd: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]] = js.native
  var modifyTransformStart: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]] = js.native
  var persistentStateLoad: js.UndefOr[
    js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
    ]
  ] = js.native
  var persistentStateReset: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]] = js.native
  var persistentStateSave: js.UndefOr[js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]] = js.native
  var skipLengthCache: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]] = js.native
  var unmodifyCol: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]] = js.native
  var unmodifyRow: js.UndefOr[js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]] = js.native
}

object Bucket {
  @scala.inline
  def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
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
    def setAfterAddChildVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* parent */ RowObject, 
            /* element */ RowObject | Unit, 
            /* index */ Double | Unit, 
            Unit
          ]
        ])*
    ): Self = this.set("afterAddChild", js.Array(value :_*))
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
    ): Self = this.set("afterAddChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterAddChild: Self = this.set("afterAddChild", js.undefined)
    @scala.inline
    def setAfterBeginEditingVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]])*): Self = this.set("afterBeginEditing", js.Array(value :_*))
    @scala.inline
    def setAfterBeginEditing(value: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]): Self = this.set("afterBeginEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterBeginEditing: Self = this.set("afterBeginEditing", js.undefined)
    @scala.inline
    def setAfterCellMetaResetVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterCellMetaReset", js.Array(value :_*))
    @scala.inline
    def setAfterCellMetaReset(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterCellMetaReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCellMetaReset: Self = this.set("afterCellMetaReset", js.undefined)
    @scala.inline
    def setAfterChangeVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
        ])*
    ): Self = this.set("afterChange", js.Array(value :_*))
    @scala.inline
    def setAfterChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = this.set("afterChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAfterChangesObservedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterChangesObserved", js.Array(value :_*))
    @scala.inline
    def setAfterChangesObserved(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterChangesObserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterChangesObserved: Self = this.set("afterChangesObserved", js.undefined)
    @scala.inline
    def setAfterColumnMoveVarargs(value: (js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]])*): Self = this.set("afterColumnMove", js.Array(value :_*))
    @scala.inline
    def setAfterColumnMove(
      value: js.Array[
          js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
        ]
    ): Self = this.set("afterColumnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterColumnMove: Self = this.set("afterColumnMove", js.undefined)
    @scala.inline
    def setAfterColumnResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
        ])*
    ): Self = this.set("afterColumnResize", js.Array(value :_*))
    @scala.inline
    def setAfterColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = this.set("afterColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterColumnResize: Self = this.set("afterColumnResize", js.undefined)
    @scala.inline
    def setAfterColumnSortVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit
          ]
        ])*
    ): Self = this.set("afterColumnSort", js.Array(value :_*))
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
    ): Self = this.set("afterColumnSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterColumnSort: Self = this.set("afterColumnSort", js.undefined)
    @scala.inline
    def setAfterContextMenuDefaultOptionsVarargs(
      value: (js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ])*
    ): Self = this.set("afterContextMenuDefaultOptions", js.Array(value :_*))
    @scala.inline
    def setAfterContextMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = this.set("afterContextMenuDefaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterContextMenuDefaultOptions: Self = this.set("afterContextMenuDefaultOptions", js.undefined)
    @scala.inline
    def setAfterContextMenuHideVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = this.set("afterContextMenuHide", js.Array(value :_*))
    @scala.inline
    def setAfterContextMenuHide(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = this.set("afterContextMenuHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterContextMenuHide: Self = this.set("afterContextMenuHide", js.undefined)
    @scala.inline
    def setAfterContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = this.set("afterContextMenuShow", js.Array(value :_*))
    @scala.inline
    def setAfterContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = this.set("afterContextMenuShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterContextMenuShow: Self = this.set("afterContextMenuShow", js.undefined)
    @scala.inline
    def setAfterCopyVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = this.set("afterCopy", js.Array(value :_*))
    @scala.inline
    def setAfterCopy(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = this.set("afterCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCopy: Self = this.set("afterCopy", js.undefined)
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
    ): Self = this.set("afterCopyLimit", js.Array(value :_*))
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
    ): Self = this.set("afterCopyLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCopyLimit: Self = this.set("afterCopyLimit", js.undefined)
    @scala.inline
    def setAfterCreateColVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = this.set("afterCreateCol", js.Array(value :_*))
    @scala.inline
    def setAfterCreateCol(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = this.set("afterCreateCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCreateCol: Self = this.set("afterCreateCol", js.undefined)
    @scala.inline
    def setAfterCreateRowVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = this.set("afterCreateRow", js.Array(value :_*))
    @scala.inline
    def setAfterCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = this.set("afterCreateRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCreateRow: Self = this.set("afterCreateRow", js.undefined)
    @scala.inline
    def setAfterCutVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = this.set("afterCut", js.Array(value :_*))
    @scala.inline
    def setAfterCut(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = this.set("afterCut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCut: Self = this.set("afterCut", js.undefined)
    @scala.inline
    def setAfterDeselectVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterDeselect", js.Array(value :_*))
    @scala.inline
    def setAfterDeselect(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDeselect: Self = this.set("afterDeselect", js.undefined)
    @scala.inline
    def setAfterDestroyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterDestroy", js.Array(value :_*))
    @scala.inline
    def setAfterDestroy(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    @scala.inline
    def setAfterDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = this.set("afterDetachChild", js.Array(value :_*))
    @scala.inline
    def setAfterDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = this.set("afterDetachChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDetachChild: Self = this.set("afterDetachChild", js.undefined)
    @scala.inline
    def setAfterDocumentKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = this.set("afterDocumentKeyDown", js.Array(value :_*))
    @scala.inline
    def setAfterDocumentKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = this.set("afterDocumentKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDocumentKeyDown: Self = this.set("afterDocumentKeyDown", js.undefined)
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
    ): Self = this.set("afterDrawSelection", js.Array(value :_*))
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
    ): Self = this.set("afterDrawSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDrawSelection: Self = this.set("afterDrawSelection", js.undefined)
    @scala.inline
    def setAfterDropdownMenuDefaultOptionsVarargs(
      value: (js.UndefOr[
          js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
        ])*
    ): Self = this.set("afterDropdownMenuDefaultOptions", js.Array(value :_*))
    @scala.inline
    def setAfterDropdownMenuDefaultOptions(
      value: js.Array[
          js.UndefOr[
            js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
          ]
        ]
    ): Self = this.set("afterDropdownMenuDefaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDropdownMenuDefaultOptions: Self = this.set("afterDropdownMenuDefaultOptions", js.undefined)
    @scala.inline
    def setAfterDropdownMenuHideVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = this.set("afterDropdownMenuHide", js.Array(value :_*))
    @scala.inline
    def setAfterDropdownMenuHide(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = this.set("afterDropdownMenuHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDropdownMenuHide: Self = this.set("afterDropdownMenuHide", js.undefined)
    @scala.inline
    def setAfterDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = this.set("afterDropdownMenuShow", js.Array(value :_*))
    @scala.inline
    def setAfterDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = this.set("afterDropdownMenuShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterDropdownMenuShow: Self = this.set("afterDropdownMenuShow", js.undefined)
    @scala.inline
    def setAfterFilterVarargs(value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]])*): Self = this.set("afterFilter", js.Array(value :_*))
    @scala.inline
    def setAfterFilter(value: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]): Self = this.set("afterFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterFilter: Self = this.set("afterFilter", js.undefined)
    @scala.inline
    def setAfterGetCellMetaVarargs(
      value: (js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ])*
    ): Self = this.set("afterGetCellMeta", js.Array(value :_*))
    @scala.inline
    def setAfterGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = this.set("afterGetCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGetCellMeta: Self = this.set("afterGetCellMeta", js.undefined)
    @scala.inline
    def setAfterGetColHeaderVarargs(value: (js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = this.set("afterGetColHeader", js.Array(value :_*))
    @scala.inline
    def setAfterGetColHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = this.set("afterGetColHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGetColHeader: Self = this.set("afterGetColHeader", js.undefined)
    @scala.inline
    def setAfterGetColumnHeaderRenderersVarargs(
      value: (js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ])*
    ): Self = this.set("afterGetColumnHeaderRenderers", js.Array(value :_*))
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
    ): Self = this.set("afterGetColumnHeaderRenderers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGetColumnHeaderRenderers: Self = this.set("afterGetColumnHeaderRenderers", js.undefined)
    @scala.inline
    def setAfterGetRowHeaderVarargs(value: (js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]])*): Self = this.set("afterGetRowHeader", js.Array(value :_*))
    @scala.inline
    def setAfterGetRowHeader(
      value: js.Array[
          js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
        ]
    ): Self = this.set("afterGetRowHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGetRowHeader: Self = this.set("afterGetRowHeader", js.undefined)
    @scala.inline
    def setAfterGetRowHeaderRenderersVarargs(
      value: (js.UndefOr[
          js.Function1[
            /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
            Unit
          ]
        ])*
    ): Self = this.set("afterGetRowHeaderRenderers", js.Array(value :_*))
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
    ): Self = this.set("afterGetRowHeaderRenderers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterGetRowHeaderRenderers: Self = this.set("afterGetRowHeaderRenderers", js.undefined)
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
    ): Self = this.set("afterHideColumns", js.Array(value :_*))
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
    ): Self = this.set("afterHideColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterHideColumns: Self = this.set("afterHideColumns", js.undefined)
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
    ): Self = this.set("afterHideRows", js.Array(value :_*))
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
    ): Self = this.set("afterHideRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterHideRows: Self = this.set("afterHideRows", js.undefined)
    @scala.inline
    def setAfterInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterInit", js.Array(value :_*))
    @scala.inline
    def setAfterInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setAfterLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = this.set("afterLanguageChange", js.Array(value :_*))
    @scala.inline
    def setAfterLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = this.set("afterLanguageChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterLanguageChange: Self = this.set("afterLanguageChange", js.undefined)
    @scala.inline
    def setAfterListenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterListen", js.Array(value :_*))
    @scala.inline
    def setAfterListen(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterListen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterListen: Self = this.set("afterListen", js.undefined)
    @scala.inline
    def setAfterLoadDataVarargs(value: (js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]])*): Self = this.set("afterLoadData", js.Array(value :_*))
    @scala.inline
    def setAfterLoadData(value: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]): Self = this.set("afterLoadData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterLoadData: Self = this.set("afterLoadData", js.undefined)
    @scala.inline
    def setAfterMergeCellsVarargs(
      value: (js.UndefOr[
          js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
        ])*
    ): Self = this.set("afterMergeCells", js.Array(value :_*))
    @scala.inline
    def setAfterMergeCells(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
          ]
        ]
    ): Self = this.set("afterMergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterMergeCells: Self = this.set("afterMergeCells", js.undefined)
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
    ): Self = this.set("afterModifyTransformEnd", js.Array(value :_*))
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
    ): Self = this.set("afterModifyTransformEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterModifyTransformEnd: Self = this.set("afterModifyTransformEnd", js.undefined)
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
    ): Self = this.set("afterModifyTransformStart", js.Array(value :_*))
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
    ): Self = this.set("afterModifyTransformStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterModifyTransformStart: Self = this.set("afterModifyTransformStart", js.undefined)
    @scala.inline
    def setAfterMomentumScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterMomentumScroll", js.Array(value :_*))
    @scala.inline
    def setAfterMomentumScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterMomentumScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterMomentumScroll: Self = this.set("afterMomentumScroll", js.undefined)
    @scala.inline
    def setAfterOnCellContextMenuVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("afterOnCellContextMenu", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("afterOnCellContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellContextMenu: Self = this.set("afterOnCellContextMenu", js.undefined)
    @scala.inline
    def setAfterOnCellCornerDblClickVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = this.set("afterOnCellCornerDblClick", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellCornerDblClick(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = this.set("afterOnCellCornerDblClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellCornerDblClick: Self = this.set("afterOnCellCornerDblClick", js.undefined)
    @scala.inline
    def setAfterOnCellCornerMouseDownVarargs(value: (js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]])*): Self = this.set("afterOnCellCornerMouseDown", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellCornerMouseDown(value: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]): Self = this.set("afterOnCellCornerMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellCornerMouseDown: Self = this.set("afterOnCellCornerMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseDownVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("afterOnCellMouseDown", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellMouseDown(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("afterOnCellMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellMouseDown: Self = this.set("afterOnCellMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseOutVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("afterOnCellMouseOut", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("afterOnCellMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellMouseOut: Self = this.set("afterOnCellMouseOut", js.undefined)
    @scala.inline
    def setAfterOnCellMouseOverVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("afterOnCellMouseOver", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellMouseOver(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("afterOnCellMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellMouseOver: Self = this.set("afterOnCellMouseOver", js.undefined)
    @scala.inline
    def setAfterOnCellMouseUpVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("afterOnCellMouseUp", js.Array(value :_*))
    @scala.inline
    def setAfterOnCellMouseUp(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("afterOnCellMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterOnCellMouseUp: Self = this.set("afterOnCellMouseUp", js.undefined)
    @scala.inline
    def setAfterPasteVarargs(
      value: (js.UndefOr[
          js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
        ])*
    ): Self = this.set("afterPaste", js.Array(value :_*))
    @scala.inline
    def setAfterPaste(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
          ]
        ]
    ): Self = this.set("afterPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterPaste: Self = this.set("afterPaste", js.undefined)
    @scala.inline
    def setAfterPluginsInitializedVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterPluginsInitialized", js.Array(value :_*))
    @scala.inline
    def setAfterPluginsInitialized(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterPluginsInitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterPluginsInitialized: Self = this.set("afterPluginsInitialized", js.undefined)
    @scala.inline
    def setAfterRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = this.set("afterRedo", js.Array(value :_*))
    @scala.inline
    def setAfterRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = this.set("afterRedo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRedo: Self = this.set("afterRedo", js.undefined)
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
    ): Self = this.set("afterRefreshDimensions", js.Array(value :_*))
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
    ): Self = this.set("afterRefreshDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRefreshDimensions: Self = this.set("afterRefreshDimensions", js.undefined)
    @scala.inline
    def setAfterRemoveCellMetaVarargs(
      value: (js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, js.Any, Unit]
        ])*
    ): Self = this.set("afterRemoveCellMeta", js.Array(value :_*))
    @scala.inline
    def setAfterRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = this.set("afterRemoveCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRemoveCellMeta: Self = this.set("afterRemoveCellMeta", js.undefined)
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
    ): Self = this.set("afterRemoveCol", js.Array(value :_*))
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
    ): Self = this.set("afterRemoveCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRemoveCol: Self = this.set("afterRemoveCol", js.undefined)
    @scala.inline
    def setAfterRemoveRowVarargs(
      value: (js.UndefOr[
          js.Function4[
            /* index */ Double, 
            /* amount */ Double, 
            /* physicalColumns */ js.Array[Double], 
            /* source */ js.UndefOr[ChangeSource], 
            Unit
          ]
        ])*
    ): Self = this.set("afterRemoveRow", js.Array(value :_*))
    @scala.inline
    def setAfterRemoveRow(
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
    ): Self = this.set("afterRemoveRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRemoveRow: Self = this.set("afterRemoveRow", js.undefined)
    @scala.inline
    def setAfterRenderVarargs(value: (js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]])*): Self = this.set("afterRender", js.Array(value :_*))
    @scala.inline
    def setAfterRender(value: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]): Self = this.set("afterRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
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
    ): Self = this.set("afterRenderer", js.Array(value :_*))
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
    ): Self = this.set("afterRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRenderer: Self = this.set("afterRenderer", js.undefined)
    @scala.inline
    def setAfterRowMoveVarargs(value: (js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]])*): Self = this.set("afterRowMove", js.Array(value :_*))
    @scala.inline
    def setAfterRowMove(value: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]): Self = this.set("afterRowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRowMove: Self = this.set("afterRowMove", js.undefined)
    @scala.inline
    def setAfterRowResizeVarargs(
      value: (js.UndefOr[
          js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
        ])*
    ): Self = this.set("afterRowResize", js.Array(value :_*))
    @scala.inline
    def setAfterRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
          ]
        ]
    ): Self = this.set("afterRowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterRowResize: Self = this.set("afterRowResize", js.undefined)
    @scala.inline
    def setAfterScrollHorizontallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterScrollHorizontally", js.Array(value :_*))
    @scala.inline
    def setAfterScrollHorizontally(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterScrollHorizontally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterScrollHorizontally: Self = this.set("afterScrollHorizontally", js.undefined)
    @scala.inline
    def setAfterScrollVerticallyVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterScrollVertically", js.Array(value :_*))
    @scala.inline
    def setAfterScrollVertically(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterScrollVertically", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterScrollVertically: Self = this.set("afterScrollVertically", js.undefined)
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
    ): Self = this.set("afterSelection", js.Array(value :_*))
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
    ): Self = this.set("afterSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelection: Self = this.set("afterSelection", js.undefined)
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
    ): Self = this.set("afterSelectionByProp", js.Array(value :_*))
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
    ): Self = this.set("afterSelectionByProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelectionByProp: Self = this.set("afterSelectionByProp", js.undefined)
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
    ): Self = this.set("afterSelectionEnd", js.Array(value :_*))
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
    ): Self = this.set("afterSelectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelectionEnd: Self = this.set("afterSelectionEnd", js.undefined)
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
    ): Self = this.set("afterSelectionEndByProp", js.Array(value :_*))
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
    ): Self = this.set("afterSelectionEndByProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSelectionEndByProp: Self = this.set("afterSelectionEndByProp", js.undefined)
    @scala.inline
    def setAfterSetCellMetaVarargs(
      value: (js.UndefOr[js.Function4[/* row */ Double, /* col */ Double, /* key */ String, js.Any, Unit]])*
    ): Self = this.set("afterSetCellMeta", js.Array(value :_*))
    @scala.inline
    def setAfterSetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = this.set("afterSetCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSetCellMeta: Self = this.set("afterSetCellMeta", js.undefined)
    @scala.inline
    def setAfterSetDataAtCellVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = this.set("afterSetDataAtCell", js.Array(value :_*))
    @scala.inline
    def setAfterSetDataAtCell(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = this.set("afterSetDataAtCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSetDataAtCell: Self = this.set("afterSetDataAtCell", js.undefined)
    @scala.inline
    def setAfterSetDataAtRowPropVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = this.set("afterSetDataAtRowProp", js.Array(value :_*))
    @scala.inline
    def setAfterSetDataAtRowProp(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = this.set("afterSetDataAtRowProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterSetDataAtRowProp: Self = this.set("afterSetDataAtRowProp", js.undefined)
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
    ): Self = this.set("afterTrimRow", js.Array(value :_*))
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
    ): Self = this.set("afterTrimRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterTrimRow: Self = this.set("afterTrimRow", js.undefined)
    @scala.inline
    def setAfterUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = this.set("afterUndo", js.Array(value :_*))
    @scala.inline
    def setAfterUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = this.set("afterUndo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUndo: Self = this.set("afterUndo", js.undefined)
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
    ): Self = this.set("afterUnhideColumns", js.Array(value :_*))
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
    ): Self = this.set("afterUnhideColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUnhideColumns: Self = this.set("afterUnhideColumns", js.undefined)
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
    ): Self = this.set("afterUnhideRows", js.Array(value :_*))
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
    ): Self = this.set("afterUnhideRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUnhideRows: Self = this.set("afterUnhideRows", js.undefined)
    @scala.inline
    def setAfterUnlistenVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("afterUnlisten", js.Array(value :_*))
    @scala.inline
    def setAfterUnlisten(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("afterUnlisten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUnlisten: Self = this.set("afterUnlisten", js.undefined)
    @scala.inline
    def setAfterUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = this.set("afterUnmergeCells", js.Array(value :_*))
    @scala.inline
    def setAfterUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = this.set("afterUnmergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUnmergeCells: Self = this.set("afterUnmergeCells", js.undefined)
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
    ): Self = this.set("afterUntrimRow", js.Array(value :_*))
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
    ): Self = this.set("afterUntrimRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUntrimRow: Self = this.set("afterUntrimRow", js.undefined)
    @scala.inline
    def setAfterUpdateSettingsVarargs(value: (js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]])*): Self = this.set("afterUpdateSettings", js.Array(value :_*))
    @scala.inline
    def setAfterUpdateSettings(value: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]): Self = this.set("afterUpdateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterUpdateSettings: Self = this.set("afterUpdateSettings", js.undefined)
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
    ): Self = this.set("afterValidate", js.Array(value :_*))
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
    ): Self = this.set("afterValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterValidate: Self = this.set("afterValidate", js.undefined)
    @scala.inline
    def setAfterViewportColumnCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = this.set("afterViewportColumnCalculatorOverride", js.Array(value :_*))
    @scala.inline
    def setAfterViewportColumnCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = this.set("afterViewportColumnCalculatorOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterViewportColumnCalculatorOverride: Self = this.set("afterViewportColumnCalculatorOverride", js.undefined)
    @scala.inline
    def setAfterViewportRowCalculatorOverrideVarargs(value: (js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]])*): Self = this.set("afterViewportRowCalculatorOverride", js.Array(value :_*))
    @scala.inline
    def setAfterViewportRowCalculatorOverride(value: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]): Self = this.set("afterViewportRowCalculatorOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterViewportRowCalculatorOverride: Self = this.set("afterViewportRowCalculatorOverride", js.undefined)
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
    ): Self = this.set("beforeAddChild", js.Array(value :_*))
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
    ): Self = this.set("beforeAddChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeAddChild: Self = this.set("beforeAddChild", js.undefined)
    @scala.inline
    def setBeforeAutofillVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* start */ CellCoords, 
            /* end */ CellCoords, 
            /* data */ js.Array[js.Array[CellValue]], 
            Unit
          ]
        ])*
    ): Self = this.set("beforeAutofill", js.Array(value :_*))
    @scala.inline
    def setBeforeAutofill(
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
    ): Self = this.set("beforeAutofill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeAutofill: Self = this.set("beforeAutofill", js.undefined)
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
    ): Self = this.set("beforeAutofillInsidePopulate", js.Array(value :_*))
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
    ): Self = this.set("beforeAutofillInsidePopulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeAutofillInsidePopulate: Self = this.set("beforeAutofillInsidePopulate", js.undefined)
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
    ): Self = this.set("beforeCellAlignment", js.Array(value :_*))
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
    ): Self = this.set("beforeCellAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCellAlignment: Self = this.set("beforeCellAlignment", js.undefined)
    @scala.inline
    def setBeforeChangeVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
        ])*
    ): Self = this.set("beforeChange", js.Array(value :_*))
    @scala.inline
    def setBeforeChange(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
          ]
        ]
    ): Self = this.set("beforeChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setBeforeChangeRenderVarargs(
      value: (js.UndefOr[
          js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
        ])*
    ): Self = this.set("beforeChangeRender", js.Array(value :_*))
    @scala.inline
    def setBeforeChangeRender(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
          ]
        ]
    ): Self = this.set("beforeChangeRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeChangeRender: Self = this.set("beforeChangeRender", js.undefined)
    @scala.inline
    def setBeforeColumnMoveVarargs(
      value: (js.UndefOr[
          js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
        ])*
    ): Self = this.set("beforeColumnMove", js.Array(value :_*))
    @scala.inline
    def setBeforeColumnMove(
      value: js.Array[
          js.UndefOr[
            js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
          ]
        ]
    ): Self = this.set("beforeColumnMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeColumnMove: Self = this.set("beforeColumnMove", js.undefined)
    @scala.inline
    def setBeforeColumnResizeVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentColumn */ Double, 
            /* newSize */ Double, 
            /* isDoubleClick */ Boolean, 
            Unit | Double
          ]
        ])*
    ): Self = this.set("beforeColumnResize", js.Array(value :_*))
    @scala.inline
    def setBeforeColumnResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentColumn */ Double, 
              /* newSize */ Double, 
              /* isDoubleClick */ Boolean, 
              Unit | Double
            ]
          ]
        ]
    ): Self = this.set("beforeColumnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeColumnResize: Self = this.set("beforeColumnResize", js.undefined)
    @scala.inline
    def setBeforeColumnSortVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* currentSortConfig */ js.Array[Config], 
            /* destinationSortConfigs */ js.Array[Config], 
            Unit | Boolean
          ]
        ])*
    ): Self = this.set("beforeColumnSort", js.Array(value :_*))
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
    ): Self = this.set("beforeColumnSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeColumnSort: Self = this.set("beforeColumnSort", js.undefined)
    @scala.inline
    def setBeforeContextMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = this.set("beforeContextMenuSetItems", js.Array(value :_*))
    @scala.inline
    def setBeforeContextMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = this.set("beforeContextMenuSetItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeContextMenuSetItems: Self = this.set("beforeContextMenuSetItems", js.undefined)
    @scala.inline
    def setBeforeContextMenuShowVarargs(value: (js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]])*): Self = this.set("beforeContextMenuShow", js.Array(value :_*))
    @scala.inline
    def setBeforeContextMenuShow(value: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]): Self = this.set("beforeContextMenuShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeContextMenuShow: Self = this.set("beforeContextMenuShow", js.undefined)
    @scala.inline
    def setBeforeCopyVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = this.set("beforeCopy", js.Array(value :_*))
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
    ): Self = this.set("beforeCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCopy: Self = this.set("beforeCopy", js.undefined)
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
    ): Self = this.set("beforeCreateCol", js.Array(value :_*))
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
    ): Self = this.set("beforeCreateCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCreateCol: Self = this.set("beforeCreateCol", js.undefined)
    @scala.inline
    def setBeforeCreateRowVarargs(
      value: (js.UndefOr[
          js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
        ])*
    ): Self = this.set("beforeCreateRow", js.Array(value :_*))
    @scala.inline
    def setBeforeCreateRow(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
          ]
        ]
    ): Self = this.set("beforeCreateRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCreateRow: Self = this.set("beforeCreateRow", js.undefined)
    @scala.inline
    def setBeforeCutVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = this.set("beforeCut", js.Array(value :_*))
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
    ): Self = this.set("beforeCut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCut: Self = this.set("beforeCut", js.undefined)
    @scala.inline
    def setBeforeDetachChildVarargs(value: (js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]])*): Self = this.set("beforeDetachChild", js.Array(value :_*))
    @scala.inline
    def setBeforeDetachChild(value: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]): Self = this.set("beforeDetachChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDetachChild: Self = this.set("beforeDetachChild", js.undefined)
    @scala.inline
    def setBeforeDrawBordersVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* corners */ js.Array[Double], 
            /* borderClassName */ js.UndefOr[current | area | highlight], 
            Unit
          ]
        ])*
    ): Self = this.set("beforeDrawBorders", js.Array(value :_*))
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
    ): Self = this.set("beforeDrawBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDrawBorders: Self = this.set("beforeDrawBorders", js.undefined)
    @scala.inline
    def setBeforeDropdownMenuSetItemsVarargs(value: (js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]])*): Self = this.set("beforeDropdownMenuSetItems", js.Array(value :_*))
    @scala.inline
    def setBeforeDropdownMenuSetItems(value: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]): Self = this.set("beforeDropdownMenuSetItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDropdownMenuSetItems: Self = this.set("beforeDropdownMenuSetItems", js.undefined)
    @scala.inline
    def setBeforeDropdownMenuShowVarargs(value: (js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]])*): Self = this.set("beforeDropdownMenuShow", js.Array(value :_*))
    @scala.inline
    def setBeforeDropdownMenuShow(value: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]): Self = this.set("beforeDropdownMenuShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeDropdownMenuShow: Self = this.set("beforeDropdownMenuShow", js.undefined)
    @scala.inline
    def setBeforeFilterVarargs(
      value: (js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]])*
    ): Self = this.set("beforeFilter", js.Array(value :_*))
    @scala.inline
    def setBeforeFilter(
      value: js.Array[
          js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
        ]
    ): Self = this.set("beforeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeFilter: Self = this.set("beforeFilter", js.undefined)
    @scala.inline
    def setBeforeGetCellMetaVarargs(
      value: (js.UndefOr[
          js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
        ])*
    ): Self = this.set("beforeGetCellMeta", js.Array(value :_*))
    @scala.inline
    def setBeforeGetCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
          ]
        ]
    ): Self = this.set("beforeGetCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeGetCellMeta: Self = this.set("beforeGetCellMeta", js.undefined)
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
    ): Self = this.set("beforeHideColumns", js.Array(value :_*))
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
    ): Self = this.set("beforeHideColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeHideColumns: Self = this.set("beforeHideColumns", js.undefined)
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
    ): Self = this.set("beforeHideRows", js.Array(value :_*))
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
    ): Self = this.set("beforeHideRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeHideRows: Self = this.set("beforeHideRows", js.undefined)
    @scala.inline
    def setBeforeInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("beforeInit", js.Array(value :_*))
    @scala.inline
    def setBeforeInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("beforeInit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    @scala.inline
    def setBeforeInitWalkontableVarargs(value: (js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]])*): Self = this.set("beforeInitWalkontable", js.Array(value :_*))
    @scala.inline
    def setBeforeInitWalkontable(value: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]): Self = this.set("beforeInitWalkontable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeInitWalkontable: Self = this.set("beforeInitWalkontable", js.undefined)
    @scala.inline
    def setBeforeKeyDownVarargs(value: (js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]])*): Self = this.set("beforeKeyDown", js.Array(value :_*))
    @scala.inline
    def setBeforeKeyDown(value: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]): Self = this.set("beforeKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeKeyDown: Self = this.set("beforeKeyDown", js.undefined)
    @scala.inline
    def setBeforeLanguageChangeVarargs(value: (js.UndefOr[js.Function1[/* languageCode */ String, Unit]])*): Self = this.set("beforeLanguageChange", js.Array(value :_*))
    @scala.inline
    def setBeforeLanguageChange(value: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]): Self = this.set("beforeLanguageChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeLanguageChange: Self = this.set("beforeLanguageChange", js.undefined)
    @scala.inline
    def setBeforeMergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = this.set("beforeMergeCells", js.Array(value :_*))
    @scala.inline
    def setBeforeMergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = this.set("beforeMergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeMergeCells: Self = this.set("beforeMergeCells", js.undefined)
    @scala.inline
    def setBeforeOnCellContextMenuVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("beforeOnCellContextMenu", js.Array(value :_*))
    @scala.inline
    def setBeforeOnCellContextMenu(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("beforeOnCellContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeOnCellContextMenu: Self = this.set("beforeOnCellContextMenu", js.undefined)
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
    ): Self = this.set("beforeOnCellMouseDown", js.Array(value :_*))
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
    ): Self = this.set("beforeOnCellMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeOnCellMouseDown: Self = this.set("beforeOnCellMouseDown", js.undefined)
    @scala.inline
    def setBeforeOnCellMouseOutVarargs(
      value: (js.UndefOr[
          js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
        ])*
    ): Self = this.set("beforeOnCellMouseOut", js.Array(value :_*))
    @scala.inline
    def setBeforeOnCellMouseOut(
      value: js.Array[
          js.UndefOr[
            js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
          ]
        ]
    ): Self = this.set("beforeOnCellMouseOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeOnCellMouseOut: Self = this.set("beforeOnCellMouseOut", js.undefined)
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
    ): Self = this.set("beforeOnCellMouseOver", js.Array(value :_*))
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
    ): Self = this.set("beforeOnCellMouseOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeOnCellMouseOver: Self = this.set("beforeOnCellMouseOver", js.undefined)
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
    ): Self = this.set("beforeOnCellMouseUp", js.Array(value :_*))
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
    ): Self = this.set("beforeOnCellMouseUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeOnCellMouseUp: Self = this.set("beforeOnCellMouseUp", js.undefined)
    @scala.inline
    def setBeforePasteVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* data */ js.Array[js.Array[CellValue]], 
            /* coords */ js.Array[RangeType], 
            Unit | Boolean
          ]
        ])*
    ): Self = this.set("beforePaste", js.Array(value :_*))
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
    ): Self = this.set("beforePaste", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforePaste: Self = this.set("beforePaste", js.undefined)
    @scala.inline
    def setBeforeRedoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = this.set("beforeRedo", js.Array(value :_*))
    @scala.inline
    def setBeforeRedo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = this.set("beforeRedo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRedo: Self = this.set("beforeRedo", js.undefined)
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
    ): Self = this.set("beforeRefreshDimensions", js.Array(value :_*))
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
    ): Self = this.set("beforeRefreshDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRefreshDimensions: Self = this.set("beforeRefreshDimensions", js.undefined)
    @scala.inline
    def setBeforeRemoveCellClassNamesVarargs(value: (js.UndefOr[js.Function0[js.Array[String] | Unit]])*): Self = this.set("beforeRemoveCellClassNames", js.Array(value :_*))
    @scala.inline
    def setBeforeRemoveCellClassNames(value: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]): Self = this.set("beforeRemoveCellClassNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRemoveCellClassNames: Self = this.set("beforeRemoveCellClassNames", js.undefined)
    @scala.inline
    def setBeforeRemoveCellMetaVarargs(
      value: (js.UndefOr[
          js.Function4[/* row */ Double, /* column */ Double, /* key */ String, js.Any, Unit]
        ])*
    ): Self = this.set("beforeRemoveCellMeta", js.Array(value :_*))
    @scala.inline
    def setBeforeRemoveCellMeta(
      value: js.Array[
          js.UndefOr[
            js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
          ]
        ]
    ): Self = this.set("beforeRemoveCellMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRemoveCellMeta: Self = this.set("beforeRemoveCellMeta", js.undefined)
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
    ): Self = this.set("beforeRemoveCol", js.Array(value :_*))
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
    ): Self = this.set("beforeRemoveCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRemoveCol: Self = this.set("beforeRemoveCol", js.undefined)
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
    ): Self = this.set("beforeRemoveRow", js.Array(value :_*))
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
    ): Self = this.set("beforeRemoveRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRemoveRow: Self = this.set("beforeRemoveRow", js.undefined)
    @scala.inline
    def setBeforeRenderVarargs(value: (js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]])*): Self = this.set("beforeRender", js.Array(value :_*))
    @scala.inline
    def setBeforeRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
        ]
    ): Self = this.set("beforeRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRender: Self = this.set("beforeRender", js.undefined)
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
    ): Self = this.set("beforeRenderer", js.Array(value :_*))
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
    ): Self = this.set("beforeRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRenderer: Self = this.set("beforeRenderer", js.undefined)
    @scala.inline
    def setBeforeRowMoveVarargs(value: (js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]])*): Self = this.set("beforeRowMove", js.Array(value :_*))
    @scala.inline
    def setBeforeRowMove(
      value: js.Array[
          js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
        ]
    ): Self = this.set("beforeRowMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRowMove: Self = this.set("beforeRowMove", js.undefined)
    @scala.inline
    def setBeforeRowResizeVarargs(
      value: (js.UndefOr[
          js.Function3[
            /* currentRow */ Double, 
            /* newSize */ Double, 
            /* isDoubleClick */ Boolean, 
            Double | Unit
          ]
        ])*
    ): Self = this.set("beforeRowResize", js.Array(value :_*))
    @scala.inline
    def setBeforeRowResize(
      value: js.Array[
          js.UndefOr[
            js.Function3[
              /* currentRow */ Double, 
              /* newSize */ Double, 
              /* isDoubleClick */ Boolean, 
              Double | Unit
            ]
          ]
        ]
    ): Self = this.set("beforeRowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeRowResize: Self = this.set("beforeRowResize", js.undefined)
    @scala.inline
    def setBeforeSetRangeEndVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = this.set("beforeSetRangeEnd", js.Array(value :_*))
    @scala.inline
    def setBeforeSetRangeEnd(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = this.set("beforeSetRangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSetRangeEnd: Self = this.set("beforeSetRangeEnd", js.undefined)
    @scala.inline
    def setBeforeSetRangeStartVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = this.set("beforeSetRangeStart", js.Array(value :_*))
    @scala.inline
    def setBeforeSetRangeStart(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = this.set("beforeSetRangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSetRangeStart: Self = this.set("beforeSetRangeStart", js.undefined)
    @scala.inline
    def setBeforeSetRangeStartOnlyVarargs(value: (js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]])*): Self = this.set("beforeSetRangeStartOnly", js.Array(value :_*))
    @scala.inline
    def setBeforeSetRangeStartOnly(value: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]): Self = this.set("beforeSetRangeStartOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeSetRangeStartOnly: Self = this.set("beforeSetRangeStartOnly", js.undefined)
    @scala.inline
    def setBeforeStretchingColumnWidthVarargs(
      value: (js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]])*
    ): Self = this.set("beforeStretchingColumnWidth", js.Array(value :_*))
    @scala.inline
    def setBeforeStretchingColumnWidth(
      value: js.Array[
          js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
        ]
    ): Self = this.set("beforeStretchingColumnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeStretchingColumnWidth: Self = this.set("beforeStretchingColumnWidth", js.undefined)
    @scala.inline
    def setBeforeTouchScrollVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("beforeTouchScroll", js.Array(value :_*))
    @scala.inline
    def setBeforeTouchScroll(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("beforeTouchScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTouchScroll: Self = this.set("beforeTouchScroll", js.undefined)
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
    ): Self = this.set("beforeTrimRow", js.Array(value :_*))
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
    ): Self = this.set("beforeTrimRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeTrimRow: Self = this.set("beforeTrimRow", js.undefined)
    @scala.inline
    def setBeforeUndoVarargs(value: (js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]])*): Self = this.set("beforeUndo", js.Array(value :_*))
    @scala.inline
    def setBeforeUndo(value: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]): Self = this.set("beforeUndo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUndo: Self = this.set("beforeUndo", js.undefined)
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
    ): Self = this.set("beforeUnhideColumns", js.Array(value :_*))
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
    ): Self = this.set("beforeUnhideColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUnhideColumns: Self = this.set("beforeUnhideColumns", js.undefined)
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
    ): Self = this.set("beforeUnhideRows", js.Array(value :_*))
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
    ): Self = this.set("beforeUnhideRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUnhideRows: Self = this.set("beforeUnhideRows", js.undefined)
    @scala.inline
    def setBeforeUnmergeCellsVarargs(value: (js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]])*): Self = this.set("beforeUnmergeCells", js.Array(value :_*))
    @scala.inline
    def setBeforeUnmergeCells(value: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]): Self = this.set("beforeUnmergeCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUnmergeCells: Self = this.set("beforeUnmergeCells", js.undefined)
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
    ): Self = this.set("beforeUntrimRow", js.Array(value :_*))
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
    ): Self = this.set("beforeUntrimRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeUntrimRow: Self = this.set("beforeUntrimRow", js.undefined)
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
    ): Self = this.set("beforeValidate", js.Array(value :_*))
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
    ): Self = this.set("beforeValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
    @scala.inline
    def setBeforeValueRenderVarargs(
      value: (js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]])*
    ): Self = this.set("beforeValueRender", js.Array(value :_*))
    @scala.inline
    def setBeforeValueRender(
      value: js.Array[
          js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
        ]
    ): Self = this.set("beforeValueRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeValueRender: Self = this.set("beforeValueRender", js.undefined)
    @scala.inline
    def setConstructVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("construct", js.Array(value :_*))
    @scala.inline
    def setConstruct(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("construct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstruct: Self = this.set("construct", js.undefined)
    @scala.inline
    def setHiddenColumnVarargs(value: (js.UndefOr[js.Function1[/* column */ Double, Unit]])*): Self = this.set("hiddenColumn", js.Array(value :_*))
    @scala.inline
    def setHiddenColumn(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = this.set("hiddenColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumn: Self = this.set("hiddenColumn", js.undefined)
    @scala.inline
    def setHiddenRowVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("hiddenRow", js.Array(value :_*))
    @scala.inline
    def setHiddenRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("hiddenRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenRow: Self = this.set("hiddenRow", js.undefined)
    @scala.inline
    def setInitVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("init", js.Array(value :_*))
    @scala.inline
    def setInit(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setModifyAutofillRangeVarargs(
      value: (js.UndefOr[
          js.Function2[
            /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
            Unit
          ]
        ])*
    ): Self = this.set("modifyAutofillRange", js.Array(value :_*))
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
    ): Self = this.set("modifyAutofillRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyAutofillRange: Self = this.set("modifyAutofillRange", js.undefined)
    @scala.inline
    def setModifyColVarargs(value: (js.UndefOr[js.Function1[/* col */ Double, Unit]])*): Self = this.set("modifyCol", js.Array(value :_*))
    @scala.inline
    def setModifyCol(value: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Self = this.set("modifyCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyCol: Self = this.set("modifyCol", js.undefined)
    @scala.inline
    def setModifyColHeaderVarargs(value: (js.UndefOr[js.Function1[/* column */ Double, Unit]])*): Self = this.set("modifyColHeader", js.Array(value :_*))
    @scala.inline
    def setModifyColHeader(value: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]): Self = this.set("modifyColHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyColHeader: Self = this.set("modifyColHeader", js.undefined)
    @scala.inline
    def setModifyColWidthVarargs(value: (js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]])*): Self = this.set("modifyColWidth", js.Array(value :_*))
    @scala.inline
    def setModifyColWidth(value: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]): Self = this.set("modifyColWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyColWidth: Self = this.set("modifyColWidth", js.undefined)
    @scala.inline
    def setModifyColumnHeaderHeightVarargs(value: js.UndefOr[js.Function0[Unit]]*): Self = this.set("modifyColumnHeaderHeight", js.Array(value :_*))
    @scala.inline
    def setModifyColumnHeaderHeight(value: js.Array[js.UndefOr[js.Function0[Unit]]]): Self = this.set("modifyColumnHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyColumnHeaderHeight: Self = this.set("modifyColumnHeaderHeight", js.undefined)
    @scala.inline
    def setModifyCopyableRangeVarargs(value: (js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]])*): Self = this.set("modifyCopyableRange", js.Array(value :_*))
    @scala.inline
    def setModifyCopyableRange(value: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]): Self = this.set("modifyCopyableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyCopyableRange: Self = this.set("modifyCopyableRange", js.undefined)
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
    ): Self = this.set("modifyData", js.Array(value :_*))
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
    ): Self = this.set("modifyData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyData: Self = this.set("modifyData", js.undefined)
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
    ): Self = this.set("modifyGetCellCoords", js.Array(value :_*))
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
    ): Self = this.set("modifyGetCellCoords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyGetCellCoords: Self = this.set("modifyGetCellCoords", js.undefined)
    @scala.inline
    def setModifyRowVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("modifyRow", js.Array(value :_*))
    @scala.inline
    def setModifyRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("modifyRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRow: Self = this.set("modifyRow", js.undefined)
    @scala.inline
    def setModifyRowDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("modifyRowData", js.Array(value :_*))
    @scala.inline
    def setModifyRowData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("modifyRowData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRowData: Self = this.set("modifyRowData", js.undefined)
    @scala.inline
    def setModifyRowHeaderVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("modifyRowHeader", js.Array(value :_*))
    @scala.inline
    def setModifyRowHeader(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("modifyRowHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRowHeader: Self = this.set("modifyRowHeader", js.undefined)
    @scala.inline
    def setModifyRowHeaderWidthVarargs(value: (js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]])*): Self = this.set("modifyRowHeaderWidth", js.Array(value :_*))
    @scala.inline
    def setModifyRowHeaderWidth(value: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]): Self = this.set("modifyRowHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRowHeaderWidth: Self = this.set("modifyRowHeaderWidth", js.undefined)
    @scala.inline
    def setModifyRowHeightVarargs(value: (js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]])*): Self = this.set("modifyRowHeight", js.Array(value :_*))
    @scala.inline
    def setModifyRowHeight(value: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]): Self = this.set("modifyRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRowHeight: Self = this.set("modifyRowHeight", js.undefined)
    @scala.inline
    def setModifyRowSourceDataVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("modifyRowSourceData", js.Array(value :_*))
    @scala.inline
    def setModifyRowSourceData(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("modifyRowSourceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyRowSourceData: Self = this.set("modifyRowSourceData", js.undefined)
    @scala.inline
    def setModifyTransformEndVarargs(value: (js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]])*): Self = this.set("modifyTransformEnd", js.Array(value :_*))
    @scala.inline
    def setModifyTransformEnd(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = this.set("modifyTransformEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyTransformEnd: Self = this.set("modifyTransformEnd", js.undefined)
    @scala.inline
    def setModifyTransformStartVarargs(value: (js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]])*): Self = this.set("modifyTransformStart", js.Array(value :_*))
    @scala.inline
    def setModifyTransformStart(value: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]): Self = this.set("modifyTransformStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyTransformStart: Self = this.set("modifyTransformStart", js.undefined)
    @scala.inline
    def setPersistentStateLoadVarargs(value: (js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]])*): Self = this.set("persistentStateLoad", js.Array(value :_*))
    @scala.inline
    def setPersistentStateLoad(
      value: js.Array[
          js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
        ]
    ): Self = this.set("persistentStateLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentStateLoad: Self = this.set("persistentStateLoad", js.undefined)
    @scala.inline
    def setPersistentStateResetVarargs(value: (js.UndefOr[js.Function1[/* key */ String, Unit]])*): Self = this.set("persistentStateReset", js.Array(value :_*))
    @scala.inline
    def setPersistentStateReset(value: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]): Self = this.set("persistentStateReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentStateReset: Self = this.set("persistentStateReset", js.undefined)
    @scala.inline
    def setPersistentStateSaveVarargs(value: (js.UndefOr[js.Function2[/* key */ String, js.Any, Unit]])*): Self = this.set("persistentStateSave", js.Array(value :_*))
    @scala.inline
    def setPersistentStateSave(value: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]): Self = this.set("persistentStateSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentStateSave: Self = this.set("persistentStateSave", js.undefined)
    @scala.inline
    def setSkipLengthCacheVarargs(value: (js.UndefOr[js.Function1[/* delay */ Double, Unit]])*): Self = this.set("skipLengthCache", js.Array(value :_*))
    @scala.inline
    def setSkipLengthCache(value: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]): Self = this.set("skipLengthCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLengthCache: Self = this.set("skipLengthCache", js.undefined)
    @scala.inline
    def setUnmodifyColVarargs(value: (js.UndefOr[js.Function1[/* col */ Double, Unit]])*): Self = this.set("unmodifyCol", js.Array(value :_*))
    @scala.inline
    def setUnmodifyCol(value: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]): Self = this.set("unmodifyCol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmodifyCol: Self = this.set("unmodifyCol", js.undefined)
    @scala.inline
    def setUnmodifyRowVarargs(value: (js.UndefOr[js.Function1[/* row */ Double, Unit]])*): Self = this.set("unmodifyRow", js.Array(value :_*))
    @scala.inline
    def setUnmodifyRow(value: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]): Self = this.set("unmodifyRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmodifyRow: Self = this.set("unmodifyRow", js.undefined)
  }
  
}

