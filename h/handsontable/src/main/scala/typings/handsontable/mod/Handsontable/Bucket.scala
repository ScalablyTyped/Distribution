package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.AnonSkipRender
import typings.handsontable.AnonValue
import typings.handsontable.AnonValueAny
import typings.handsontable.AnonValueCellValue
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
        /* preventScrolling */ AnonValue, 
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
        /* preventScrolling */ AnonValue, 
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
    js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ AnonSkipRender, Unit]]
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
        /* valueHolder */ AnonValueCellValue, 
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
    js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ AnonValueAny, Unit]]
  ]
  var persistentStateReset: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]]
  var persistentStateSave: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]]
  var skipLengthCache: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]]
  var unmodifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]]
  var unmodifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
}

object Bucket {
  @scala.inline
  def apply(
    afterAddChild: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    afterBeginEditing: js.Array[js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]]],
    afterCellMetaReset: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterChange: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
      ]
    ],
    afterChangesObserved: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterColumnMove: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    afterColumnResize: js.Array[
      js.UndefOr[
        js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    afterColumnSort: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit
        ]
      ]
    ],
    afterContextMenuDefaultOptions: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    afterContextMenuHide: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    afterContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    afterCopy: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    afterCopyLimit: js.Array[
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
    afterCreateCol: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    afterCreateRow: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    afterCut: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    afterDeselect: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterDestroy: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    afterDocumentKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    afterDrawSelection: js.Array[
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
    afterDropdownMenuDefaultOptions: js.Array[
      js.UndefOr[
        js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
      ]
    ],
    afterDropdownMenuHide: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    afterDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    afterFilter: js.Array[js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]]],
    afterGetCellMeta: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    afterGetColHeader: js.Array[
      js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    afterGetColumnHeaderRenderers: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    afterGetRowHeader: js.Array[
      js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]]
    ],
    afterGetRowHeaderRenderers: js.Array[
      js.UndefOr[
        js.Function1[
          /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
          Unit
        ]
      ]
    ],
    afterHideColumns: js.Array[
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
    afterHideRows: js.Array[
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
    afterInit: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    afterListen: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterLoadData: js.Array[js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]]],
    afterMergeCells: js.Array[
      js.UndefOr[
        js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
      ]
    ],
    afterModifyTransformEnd: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    afterModifyTransformStart: js.Array[
      js.UndefOr[
        js.Function3[
          /* coords */ CellCoords, 
          /* rowTransformDir */ `-1` | `0`, 
          /* colTransformDir */ `-1` | `0`, 
          Unit
        ]
      ]
    ],
    afterMomentumScroll: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterOnCellContextMenu: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    afterOnCellCornerDblClick: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    afterOnCellCornerMouseDown: js.Array[js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]]],
    afterOnCellMouseDown: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    afterOnCellMouseOut: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    afterOnCellMouseOver: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    afterOnCellMouseUp: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    afterPaste: js.Array[
      js.UndefOr[
        js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
      ]
    ],
    afterPluginsInitialized: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    afterRefreshDimensions: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* stateChanged */ Boolean, 
          Unit
        ]
      ]
    ],
    afterRemoveCellMeta: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    afterRemoveCol: js.Array[
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
    afterRemoveRow: js.Array[
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
    afterRender: js.Array[js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]]],
    afterRenderer: js.Array[
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
    afterRowMove: js.Array[js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]]],
    afterRowResize: js.Array[
      js.UndefOr[
        js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
      ]
    ],
    afterScrollHorizontally: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterScrollVertically: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterSelection: js.Array[
      js.UndefOr[
        js.Function6[
          /* row */ Double, 
          /* column */ Double, 
          /* row2 */ Double, 
          /* column2 */ Double, 
          /* preventScrolling */ AnonValue, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ]
    ],
    afterSelectionByProp: js.Array[
      js.UndefOr[
        js.Function6[
          /* row */ Double, 
          /* prop */ String, 
          /* row2 */ Double, 
          /* prop2 */ String, 
          /* preventScrolling */ AnonValue, 
          /* selectionLayerLevel */ Double, 
          Unit
        ]
      ]
    ],
    afterSelectionEnd: js.Array[
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
    afterSelectionEndByProp: js.Array[
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
    afterSetCellMeta: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    afterSetDataAtCell: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    afterSetDataAtRowProp: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    afterTrimRow: js.Array[
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
    afterUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    afterUnhideColumns: js.Array[
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
    afterUnhideRows: js.Array[
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
    afterUnlisten: js.Array[js.UndefOr[js.Function0[Unit]]],
    afterUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    afterUntrimRow: js.Array[
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
    afterUpdateSettings: js.Array[js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]]],
    afterValidate: js.Array[
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
    afterViewportColumnCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    afterViewportRowCalculatorOverride: js.Array[js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]]],
    beforeAddChild: js.Array[
      js.UndefOr[
        js.Function3[
          /* parent */ RowObject, 
          /* element */ RowObject | Unit, 
          /* index */ Double | Unit, 
          Unit
        ]
      ]
    ],
    beforeAutofill: js.Array[
      js.UndefOr[
        js.Function3[
          /* start */ CellCoords, 
          /* end */ CellCoords, 
          /* data */ js.Array[js.Array[CellValue]], 
          Unit
        ]
      ]
    ],
    beforeAutofillInsidePopulate: js.Array[
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
    beforeCellAlignment: js.Array[
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
    beforeChange: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
      ]
    ],
    beforeChangeRender: js.Array[
      js.UndefOr[
        js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
      ]
    ],
    beforeColumnMove: js.Array[
      js.UndefOr[
        js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
      ]
    ],
    beforeColumnResize: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentColumn */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Unit | Double
        ]
      ]
    ],
    beforeColumnSort: js.Array[
      js.UndefOr[
        js.Function2[
          /* currentSortConfig */ js.Array[Config], 
          /* destinationSortConfigs */ js.Array[Config], 
          Unit | Boolean
        ]
      ]
    ],
    beforeContextMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    beforeContextMenuShow: js.Array[js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]]],
    beforeCopy: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    beforeCreateCol: js.Array[
      js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* amount */ Double, 
          /* source */ js.UndefOr[ChangeSource], 
          Unit | Boolean
        ]
      ]
    ],
    beforeCreateRow: js.Array[
      js.UndefOr[
        js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
      ]
    ],
    beforeCut: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    beforeDetachChild: js.Array[js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]]],
    beforeDrawBorders: js.Array[
      js.UndefOr[
        js.Function2[
          /* corners */ js.Array[Double], 
          /* borderClassName */ js.UndefOr[current | area | highlight], 
          Unit
        ]
      ]
    ],
    beforeDropdownMenuSetItems: js.Array[js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]]],
    beforeDropdownMenuShow: js.Array[js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]]],
    beforeFilter: js.Array[
      js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]]
    ],
    beforeGetCellMeta: js.Array[
      js.UndefOr[
        js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
      ]
    ],
    beforeHideColumns: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeHideRows: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeInit: js.Array[js.UndefOr[js.Function0[Unit]]],
    beforeInitWalkontable: js.Array[js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]]],
    beforeKeyDown: js.Array[js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]]],
    beforeLanguageChange: js.Array[js.UndefOr[js.Function1[/* languageCode */ String, Unit]]],
    beforeMergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    beforeOnCellContextMenu: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    beforeOnCellMouseDown: js.Array[
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
    beforeOnCellMouseOut: js.Array[
      js.UndefOr[
        js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
      ]
    ],
    beforeOnCellMouseOver: js.Array[
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
    beforeOnCellMouseUp: js.Array[
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
    beforePaste: js.Array[
      js.UndefOr[
        js.Function2[
          /* data */ js.Array[js.Array[CellValue]], 
          /* coords */ js.Array[RangeType], 
          Unit | Boolean
        ]
      ]
    ],
    beforeRedo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    beforeRefreshDimensions: js.Array[
      js.UndefOr[
        js.Function3[
          /* previousDimensions */ js.Object, 
          /* currentDimensions */ js.Object, 
          /* actionPossible */ Boolean, 
          Boolean | Unit
        ]
      ]
    ],
    beforeRemoveCellClassNames: js.Array[js.UndefOr[js.Function0[js.Array[String] | Unit]]],
    beforeRemoveCellMeta: js.Array[
      js.UndefOr[
        js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ _, Unit]
      ]
    ],
    beforeRemoveCol: js.Array[
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
    beforeRemoveRow: js.Array[
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
    beforeRender: js.Array[
      js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ AnonSkipRender, Unit]]
    ],
    beforeRenderer: js.Array[
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
    beforeRowMove: js.Array[
      js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]]
    ],
    beforeRowResize: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentRow */ Double, 
          /* newSize */ Double, 
          /* isDoubleClick */ Boolean, 
          Double | Unit
        ]
      ]
    ],
    beforeSetRangeEnd: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    beforeSetRangeStart: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    beforeSetRangeStartOnly: js.Array[js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]]],
    beforeStretchingColumnWidth: js.Array[
      js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]]
    ],
    beforeTouchScroll: js.Array[js.UndefOr[js.Function0[Unit]]],
    beforeTrimRow: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeUndo: js.Array[js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]]],
    beforeUnhideColumns: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeUnhideRows: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentHideConfig */ js.Array[Double], 
          /* destinationHideConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeUnmergeCells: js.Array[js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]]],
    beforeUntrimRow: js.Array[
      js.UndefOr[
        js.Function3[
          /* currentTrimConfig */ js.Array[Double], 
          /* destinationTrimConfig */ js.Array[Double], 
          /* actionPossible */ Boolean, 
          Unit
        ]
      ]
    ],
    beforeValidate: js.Array[
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
    beforeValueRender: js.Array[
      js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]]
    ],
    construct: js.Array[js.UndefOr[js.Function0[Unit]]],
    hiddenColumn: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    hiddenRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    init: js.Array[js.UndefOr[js.Function0[Unit]]],
    modifyAutofillRange: js.Array[
      js.UndefOr[
        js.Function2[
          /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
          Unit
        ]
      ]
    ],
    modifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    modifyColHeader: js.Array[js.UndefOr[js.Function1[/* column */ Double, Unit]]],
    modifyColWidth: js.Array[js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]]],
    modifyColumnHeaderHeight: js.Array[js.UndefOr[js.Function0[Unit]]],
    modifyCopyableRange: js.Array[js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]]],
    modifyData: js.Array[
      js.UndefOr[
        js.Function4[
          /* row */ Double, 
          /* column */ Double, 
          /* valueHolder */ AnonValueCellValue, 
          /* ioMode */ get | set, 
          Unit
        ]
      ]
    ],
    modifyGetCellCoords: js.Array[
      js.UndefOr[
        js.Function3[
          /* row */ Double, 
          /* column */ Double, 
          /* topmost */ Boolean, 
          Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
        ]
      ]
    ],
    modifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    modifyRowData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    modifyRowHeader: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    modifyRowHeaderWidth: js.Array[js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]]],
    modifyRowHeight: js.Array[js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]]],
    modifyRowSourceData: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]],
    modifyTransformEnd: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    modifyTransformStart: js.Array[js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]]],
    persistentStateLoad: js.Array[
      js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ AnonValueAny, Unit]]
    ],
    persistentStateReset: js.Array[js.UndefOr[js.Function1[/* key */ String, Unit]]],
    persistentStateSave: js.Array[js.UndefOr[js.Function2[/* key */ String, /* value */ _, Unit]]],
    skipLengthCache: js.Array[js.UndefOr[js.Function1[/* delay */ Double, Unit]]],
    unmodifyCol: js.Array[js.UndefOr[js.Function1[/* col */ Double, Unit]]],
    unmodifyRow: js.Array[js.UndefOr[js.Function1[/* row */ Double, Unit]]]
  ): Bucket = {
    val __obj = js.Dynamic.literal(afterAddChild = afterAddChild.asInstanceOf[js.Any], afterBeginEditing = afterBeginEditing.asInstanceOf[js.Any], afterCellMetaReset = afterCellMetaReset.asInstanceOf[js.Any], afterChange = afterChange.asInstanceOf[js.Any], afterChangesObserved = afterChangesObserved.asInstanceOf[js.Any], afterColumnMove = afterColumnMove.asInstanceOf[js.Any], afterColumnResize = afterColumnResize.asInstanceOf[js.Any], afterColumnSort = afterColumnSort.asInstanceOf[js.Any], afterContextMenuDefaultOptions = afterContextMenuDefaultOptions.asInstanceOf[js.Any], afterContextMenuHide = afterContextMenuHide.asInstanceOf[js.Any], afterContextMenuShow = afterContextMenuShow.asInstanceOf[js.Any], afterCopy = afterCopy.asInstanceOf[js.Any], afterCopyLimit = afterCopyLimit.asInstanceOf[js.Any], afterCreateCol = afterCreateCol.asInstanceOf[js.Any], afterCreateRow = afterCreateRow.asInstanceOf[js.Any], afterCut = afterCut.asInstanceOf[js.Any], afterDeselect = afterDeselect.asInstanceOf[js.Any], afterDestroy = afterDestroy.asInstanceOf[js.Any], afterDetachChild = afterDetachChild.asInstanceOf[js.Any], afterDocumentKeyDown = afterDocumentKeyDown.asInstanceOf[js.Any], afterDrawSelection = afterDrawSelection.asInstanceOf[js.Any], afterDropdownMenuDefaultOptions = afterDropdownMenuDefaultOptions.asInstanceOf[js.Any], afterDropdownMenuHide = afterDropdownMenuHide.asInstanceOf[js.Any], afterDropdownMenuShow = afterDropdownMenuShow.asInstanceOf[js.Any], afterFilter = afterFilter.asInstanceOf[js.Any], afterGetCellMeta = afterGetCellMeta.asInstanceOf[js.Any], afterGetColHeader = afterGetColHeader.asInstanceOf[js.Any], afterGetColumnHeaderRenderers = afterGetColumnHeaderRenderers.asInstanceOf[js.Any], afterGetRowHeader = afterGetRowHeader.asInstanceOf[js.Any], afterGetRowHeaderRenderers = afterGetRowHeaderRenderers.asInstanceOf[js.Any], afterHideColumns = afterHideColumns.asInstanceOf[js.Any], afterHideRows = afterHideRows.asInstanceOf[js.Any], afterInit = afterInit.asInstanceOf[js.Any], afterLanguageChange = afterLanguageChange.asInstanceOf[js.Any], afterListen = afterListen.asInstanceOf[js.Any], afterLoadData = afterLoadData.asInstanceOf[js.Any], afterMergeCells = afterMergeCells.asInstanceOf[js.Any], afterModifyTransformEnd = afterModifyTransformEnd.asInstanceOf[js.Any], afterModifyTransformStart = afterModifyTransformStart.asInstanceOf[js.Any], afterMomentumScroll = afterMomentumScroll.asInstanceOf[js.Any], afterOnCellContextMenu = afterOnCellContextMenu.asInstanceOf[js.Any], afterOnCellCornerDblClick = afterOnCellCornerDblClick.asInstanceOf[js.Any], afterOnCellCornerMouseDown = afterOnCellCornerMouseDown.asInstanceOf[js.Any], afterOnCellMouseDown = afterOnCellMouseDown.asInstanceOf[js.Any], afterOnCellMouseOut = afterOnCellMouseOut.asInstanceOf[js.Any], afterOnCellMouseOver = afterOnCellMouseOver.asInstanceOf[js.Any], afterOnCellMouseUp = afterOnCellMouseUp.asInstanceOf[js.Any], afterPaste = afterPaste.asInstanceOf[js.Any], afterPluginsInitialized = afterPluginsInitialized.asInstanceOf[js.Any], afterRedo = afterRedo.asInstanceOf[js.Any], afterRefreshDimensions = afterRefreshDimensions.asInstanceOf[js.Any], afterRemoveCellMeta = afterRemoveCellMeta.asInstanceOf[js.Any], afterRemoveCol = afterRemoveCol.asInstanceOf[js.Any], afterRemoveRow = afterRemoveRow.asInstanceOf[js.Any], afterRender = afterRender.asInstanceOf[js.Any], afterRenderer = afterRenderer.asInstanceOf[js.Any], afterRowMove = afterRowMove.asInstanceOf[js.Any], afterRowResize = afterRowResize.asInstanceOf[js.Any], afterScrollHorizontally = afterScrollHorizontally.asInstanceOf[js.Any], afterScrollVertically = afterScrollVertically.asInstanceOf[js.Any], afterSelection = afterSelection.asInstanceOf[js.Any], afterSelectionByProp = afterSelectionByProp.asInstanceOf[js.Any], afterSelectionEnd = afterSelectionEnd.asInstanceOf[js.Any], afterSelectionEndByProp = afterSelectionEndByProp.asInstanceOf[js.Any], afterSetCellMeta = afterSetCellMeta.asInstanceOf[js.Any], afterSetDataAtCell = afterSetDataAtCell.asInstanceOf[js.Any], afterSetDataAtRowProp = afterSetDataAtRowProp.asInstanceOf[js.Any], afterTrimRow = afterTrimRow.asInstanceOf[js.Any], afterUndo = afterUndo.asInstanceOf[js.Any], afterUnhideColumns = afterUnhideColumns.asInstanceOf[js.Any], afterUnhideRows = afterUnhideRows.asInstanceOf[js.Any], afterUnlisten = afterUnlisten.asInstanceOf[js.Any], afterUnmergeCells = afterUnmergeCells.asInstanceOf[js.Any], afterUntrimRow = afterUntrimRow.asInstanceOf[js.Any], afterUpdateSettings = afterUpdateSettings.asInstanceOf[js.Any], afterValidate = afterValidate.asInstanceOf[js.Any], afterViewportColumnCalculatorOverride = afterViewportColumnCalculatorOverride.asInstanceOf[js.Any], afterViewportRowCalculatorOverride = afterViewportRowCalculatorOverride.asInstanceOf[js.Any], beforeAddChild = beforeAddChild.asInstanceOf[js.Any], beforeAutofill = beforeAutofill.asInstanceOf[js.Any], beforeAutofillInsidePopulate = beforeAutofillInsidePopulate.asInstanceOf[js.Any], beforeCellAlignment = beforeCellAlignment.asInstanceOf[js.Any], beforeChange = beforeChange.asInstanceOf[js.Any], beforeChangeRender = beforeChangeRender.asInstanceOf[js.Any], beforeColumnMove = beforeColumnMove.asInstanceOf[js.Any], beforeColumnResize = beforeColumnResize.asInstanceOf[js.Any], beforeColumnSort = beforeColumnSort.asInstanceOf[js.Any], beforeContextMenuSetItems = beforeContextMenuSetItems.asInstanceOf[js.Any], beforeContextMenuShow = beforeContextMenuShow.asInstanceOf[js.Any], beforeCopy = beforeCopy.asInstanceOf[js.Any], beforeCreateCol = beforeCreateCol.asInstanceOf[js.Any], beforeCreateRow = beforeCreateRow.asInstanceOf[js.Any], beforeCut = beforeCut.asInstanceOf[js.Any], beforeDetachChild = beforeDetachChild.asInstanceOf[js.Any], beforeDrawBorders = beforeDrawBorders.asInstanceOf[js.Any], beforeDropdownMenuSetItems = beforeDropdownMenuSetItems.asInstanceOf[js.Any], beforeDropdownMenuShow = beforeDropdownMenuShow.asInstanceOf[js.Any], beforeFilter = beforeFilter.asInstanceOf[js.Any], beforeGetCellMeta = beforeGetCellMeta.asInstanceOf[js.Any], beforeHideColumns = beforeHideColumns.asInstanceOf[js.Any], beforeHideRows = beforeHideRows.asInstanceOf[js.Any], beforeInit = beforeInit.asInstanceOf[js.Any], beforeInitWalkontable = beforeInitWalkontable.asInstanceOf[js.Any], beforeKeyDown = beforeKeyDown.asInstanceOf[js.Any], beforeLanguageChange = beforeLanguageChange.asInstanceOf[js.Any], beforeMergeCells = beforeMergeCells.asInstanceOf[js.Any], beforeOnCellContextMenu = beforeOnCellContextMenu.asInstanceOf[js.Any], beforeOnCellMouseDown = beforeOnCellMouseDown.asInstanceOf[js.Any], beforeOnCellMouseOut = beforeOnCellMouseOut.asInstanceOf[js.Any], beforeOnCellMouseOver = beforeOnCellMouseOver.asInstanceOf[js.Any], beforeOnCellMouseUp = beforeOnCellMouseUp.asInstanceOf[js.Any], beforePaste = beforePaste.asInstanceOf[js.Any], beforeRedo = beforeRedo.asInstanceOf[js.Any], beforeRefreshDimensions = beforeRefreshDimensions.asInstanceOf[js.Any], beforeRemoveCellClassNames = beforeRemoveCellClassNames.asInstanceOf[js.Any], beforeRemoveCellMeta = beforeRemoveCellMeta.asInstanceOf[js.Any], beforeRemoveCol = beforeRemoveCol.asInstanceOf[js.Any], beforeRemoveRow = beforeRemoveRow.asInstanceOf[js.Any], beforeRender = beforeRender.asInstanceOf[js.Any], beforeRenderer = beforeRenderer.asInstanceOf[js.Any], beforeRowMove = beforeRowMove.asInstanceOf[js.Any], beforeRowResize = beforeRowResize.asInstanceOf[js.Any], beforeSetRangeEnd = beforeSetRangeEnd.asInstanceOf[js.Any], beforeSetRangeStart = beforeSetRangeStart.asInstanceOf[js.Any], beforeSetRangeStartOnly = beforeSetRangeStartOnly.asInstanceOf[js.Any], beforeStretchingColumnWidth = beforeStretchingColumnWidth.asInstanceOf[js.Any], beforeTouchScroll = beforeTouchScroll.asInstanceOf[js.Any], beforeTrimRow = beforeTrimRow.asInstanceOf[js.Any], beforeUndo = beforeUndo.asInstanceOf[js.Any], beforeUnhideColumns = beforeUnhideColumns.asInstanceOf[js.Any], beforeUnhideRows = beforeUnhideRows.asInstanceOf[js.Any], beforeUnmergeCells = beforeUnmergeCells.asInstanceOf[js.Any], beforeUntrimRow = beforeUntrimRow.asInstanceOf[js.Any], beforeValidate = beforeValidate.asInstanceOf[js.Any], beforeValueRender = beforeValueRender.asInstanceOf[js.Any], construct = construct.asInstanceOf[js.Any], hiddenColumn = hiddenColumn.asInstanceOf[js.Any], hiddenRow = hiddenRow.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], modifyAutofillRange = modifyAutofillRange.asInstanceOf[js.Any], modifyCol = modifyCol.asInstanceOf[js.Any], modifyColHeader = modifyColHeader.asInstanceOf[js.Any], modifyColWidth = modifyColWidth.asInstanceOf[js.Any], modifyColumnHeaderHeight = modifyColumnHeaderHeight.asInstanceOf[js.Any], modifyCopyableRange = modifyCopyableRange.asInstanceOf[js.Any], modifyData = modifyData.asInstanceOf[js.Any], modifyGetCellCoords = modifyGetCellCoords.asInstanceOf[js.Any], modifyRow = modifyRow.asInstanceOf[js.Any], modifyRowData = modifyRowData.asInstanceOf[js.Any], modifyRowHeader = modifyRowHeader.asInstanceOf[js.Any], modifyRowHeaderWidth = modifyRowHeaderWidth.asInstanceOf[js.Any], modifyRowHeight = modifyRowHeight.asInstanceOf[js.Any], modifyRowSourceData = modifyRowSourceData.asInstanceOf[js.Any], modifyTransformEnd = modifyTransformEnd.asInstanceOf[js.Any], modifyTransformStart = modifyTransformStart.asInstanceOf[js.Any], persistentStateLoad = persistentStateLoad.asInstanceOf[js.Any], persistentStateReset = persistentStateReset.asInstanceOf[js.Any], persistentStateSave = persistentStateSave.asInstanceOf[js.Any], skipLengthCache = skipLengthCache.asInstanceOf[js.Any], unmodifyCol = unmodifyCol.asInstanceOf[js.Any], unmodifyRow = unmodifyRow.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bucket]
  }
}

