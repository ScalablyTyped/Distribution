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
trait Bucket extends js.Object {
  var afterAddChild: js.Array[
    js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ]
  var afterBeginEditing: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]]
  var afterCellMetaReset: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterChange: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
    ]
  ]
  var afterChangesObserved: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterColumnMove: js.Array[
    js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ]
  var afterColumnResize: js.Array[
    js.UndefOr[
      js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ]
  var afterColumnSort: js.Array[
    js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit
      ]
    ]
  ]
  var afterContextMenuDefaultOptions: js.Array[
    js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ]
  var afterContextMenuHide: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  var afterContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  var afterCopy: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ]
  var afterCopyLimit: js.Array[
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
  var afterCreateCol: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ]
  var afterCreateRow: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ]
  var afterCut: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ]
  var afterDeselect: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterDestroy: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  var afterDocumentKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
  var afterDrawSelection: js.Array[
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
  var afterDropdownMenuDefaultOptions: js.Array[
    js.UndefOr[
      js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
    ]
  ]
  var afterDropdownMenuHide: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  var afterDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  var afterFilter: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]]
  var afterGetCellMeta: js.Array[
    js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ]
  var afterGetColHeader: js.Array[
    js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ]
  var afterGetColumnHeaderRenderers: js.Array[
    js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ]
  var afterGetRowHeader: js.Array[
    js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
  ]
  var afterGetRowHeaderRenderers: js.Array[
    js.UndefOr[
      js.Function1[
        /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
        Unit
      ]
    ]
  ]
  var afterHideColumns: js.Array[
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
  var afterHideRows: js.Array[
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
  var afterInit: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  var afterListen: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterLoadData: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]]
  var afterMergeCells: js.Array[
    js.UndefOr[
      js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
    ]
  ]
  var afterModifyTransformEnd: js.Array[
    js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ]
  var afterModifyTransformStart: js.Array[
    js.UndefOr[
      js.Function3[
        /* coords */ CellCoords, 
        /* rowTransformDir */ `-1` | `0`, 
        /* colTransformDir */ `-1` | `0`, 
        Unit
      ]
    ]
  ]
  var afterMomentumScroll: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterOnCellContextMenu: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var afterOnCellCornerDblClick: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  var afterOnCellCornerMouseDown: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]]
  var afterOnCellMouseDown: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var afterOnCellMouseOut: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var afterOnCellMouseOver: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var afterOnCellMouseUp: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var afterPaste: js.Array[
    js.UndefOr[
      js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
    ]
  ]
  var afterPluginsInitialized: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]
  var afterRefreshDimensions: js.Array[
    js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* stateChanged */ Boolean, 
        Unit
      ]
    ]
  ]
  var afterRemoveCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ]
  var afterRemoveCol: js.Array[
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
  var afterRemoveRow: js.Array[
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
  var afterRender: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]]
  var afterRenderer: js.Array[
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
  var afterRowMove: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]]
  var afterRowResize: js.Array[
    js.UndefOr[
      js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
    ]
  ]
  var afterScrollHorizontally: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterScrollVertically: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterSelection: js.Array[
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
  var afterSelectionByProp: js.Array[
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
  var afterSelectionEnd: js.Array[
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
  var afterSelectionEndByProp: js.Array[
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
  var afterSetCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ]
  var afterSetDataAtCell: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ]
  var afterSetDataAtRowProp: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ]
  var afterTrimRow: js.Array[
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
  var afterUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]
  var afterUnhideColumns: js.Array[
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
  var afterUnhideRows: js.Array[
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
  var afterUnlisten: js.Array[js.UndefOr[js.Function0[Unit]]]
  var afterUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  var afterUntrimRow: js.Array[
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
  var afterUpdateSettings: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]]
  var afterValidate: js.Array[
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
  var afterViewportColumnCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  var afterViewportRowCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]]
  var beforeAddChild: js.Array[
    js.UndefOr[
      js.Function3[
        /* parent */ RowObject, 
        /* element */ RowObject | Unit, 
        /* index */ Double | Unit, 
        Unit
      ]
    ]
  ]
  var beforeAutofill: js.Array[
    js.UndefOr[
      js.Function3[
        /* start */ CellCoords, 
        /* end */ CellCoords, 
        /* data */ js.Array[js.Array[CellValue]], 
        Unit
      ]
    ]
  ]
  var beforeAutofillInsidePopulate: js.Array[
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
  var beforeCellAlignment: js.Array[
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
  var beforeChange: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
    ]
  ]
  var beforeChangeRender: js.Array[
    js.UndefOr[
      js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
    ]
  ]
  var beforeColumnMove: js.Array[
    js.UndefOr[
      js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
    ]
  ]
  var beforeColumnResize: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentColumn */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Unit | Double
      ]
    ]
  ]
  var beforeColumnSort: js.Array[
    js.UndefOr[
      js.Function2[
        /* currentSortConfig */ js.Array[Config], 
        /* destinationSortConfigs */ js.Array[Config], 
        Unit | Boolean
      ]
    ]
  ]
  var beforeContextMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  var beforeContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]]
  var beforeCopy: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ]
  var beforeCreateCol: js.Array[
    js.UndefOr[
      js.Function3[
        /* index */ Double, 
        /* amount */ Double, 
        /* source */ js.UndefOr[ChangeSource], 
        Unit | Boolean
      ]
    ]
  ]
  var beforeCreateRow: js.Array[
    js.UndefOr[
      js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
    ]
  ]
  var beforeCut: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ]
  var beforeDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]]
  var beforeDrawBorders: js.Array[
    js.UndefOr[
      js.Function2[
        /* corners */ js.Array[Double], 
        /* borderClassName */ js.UndefOr[current | area | highlight], 
        Unit
      ]
    ]
  ]
  var beforeDropdownMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]]
  var beforeDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]]
  var beforeFilter: js.Array[
    js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
  ]
  var beforeGetCellMeta: js.Array[
    js.UndefOr[
      js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
    ]
  ]
  var beforeHideColumns: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeHideRows: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeInit: js.Array[js.UndefOr[js.Function0[Unit]]]
  var beforeInitWalkontable: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]]
  var beforeKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]]
  var beforeLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]]
  var beforeMergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  var beforeOnCellContextMenu: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var beforeOnCellMouseDown: js.Array[
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
  var beforeOnCellMouseOut: js.Array[
    js.UndefOr[
      js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
    ]
  ]
  var beforeOnCellMouseOver: js.Array[
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
  var beforeOnCellMouseUp: js.Array[
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
  var beforePaste: js.Array[
    js.UndefOr[
      js.Function2[
        /* data */ js.Array[js.Array[CellValue]], 
        /* coords */ js.Array[RangeType], 
        Unit | Boolean
      ]
    ]
  ]
  var beforeRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]
  var beforeRefreshDimensions: js.Array[
    js.UndefOr[
      js.Function3[
        /* previousDimensions */ js.Object, 
        /* currentDimensions */ js.Object, 
        /* actionPossible */ Boolean, 
        Boolean | Unit
      ]
    ]
  ]
  var beforeRemoveCellClassNames: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]]
  var beforeRemoveCellMeta: js.Array[
    js.UndefOr[
      js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
    ]
  ]
  var beforeRemoveCol: js.Array[
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
  var beforeRemoveRow: js.Array[
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
  var beforeRender: js.Array[
    js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]]
  ]
  var beforeRenderer: js.Array[
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
  var beforeRowMove: js.Array[
    js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
  ]
  var beforeRowResize: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentRow */ Double, 
        /* newSize */ Double, 
        /* isDoubleClick */ Boolean, 
        Double | Unit
      ]
    ]
  ]
  var beforeSetRangeEnd: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  var beforeSetRangeStart: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  var beforeSetRangeStartOnly: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]]
  var beforeStretchingColumnWidth: js.Array[
    js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
  ]
  var beforeTouchScroll: js.Array[js.UndefOr[js.Function0[Unit]]]
  var beforeTrimRow: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]]
  var beforeUnhideColumns: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeUnhideRows: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentHideConfig */ js.Array[Double], 
        /* destinationHideConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]]
  var beforeUntrimRow: js.Array[
    js.UndefOr[
      js.Function3[
        /* currentTrimConfig */ js.Array[Double], 
        /* destinationTrimConfig */ js.Array[Double], 
        /* actionPossible */ Boolean, 
        Unit
      ]
    ]
  ]
  var beforeValidate: js.Array[
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
  var beforeValueRender: js.Array[
    js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
  ]
  var construct: js.Array[js.UndefOr[js.Function0[Unit]]]
  var hiddenColumn: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]
  var hiddenRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  var init: js.Array[js.UndefOr[js.Function0[Unit]]]
  var modifyAutofillRange: js.Array[
    js.UndefOr[
      js.Function2[
        /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
        Unit
      ]
    ]
  ]
  var modifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]
  var modifyColHeader: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]]
  var modifyColWidth: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]]
  var modifyColumnHeaderHeight: js.Array[js.UndefOr[js.Function0[Unit]]]
  var modifyCopyableRange: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]]
  var modifyData: js.Array[
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
  var modifyGetCellCoords: js.Array[
    js.UndefOr[
      js.Function3[
        /* row */ Double, 
        /* column */ Double, 
        /* topmost */ Boolean, 
        Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
      ]
    ]
  ]
  var modifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  var modifyRowData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  var modifyRowHeader: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  var modifyRowHeaderWidth: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]]
  var modifyRowHeight: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]]
  var modifyRowSourceData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  var modifyTransformEnd: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  var modifyTransformStart: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]]
  var persistentStateLoad: js.Array[
    js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]]
  ]
  var persistentStateReset: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]
  var persistentStateSave: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  var skipLengthCache: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]
  var unmodifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]
  var unmodifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
}

