package typings.handsontable.handsontableMod.Handsontable.Hooks

import org.scalablytyped.runtime.NumberDictionary
import typings.handsontable.Anon_SkipRender
import typings.handsontable.Anon_Value
import typings.handsontable.Anon_ValueAny
import typings.handsontable.Anon_ValueCellValue
import typings.handsontable.handsontableMod.Handsontable.CellChange
import typings.handsontable.handsontableMod.Handsontable.CellProperties
import typings.handsontable.handsontableMod.Handsontable.CellValue
import typings.handsontable.handsontableMod.Handsontable.ChangeSource
import typings.handsontable.handsontableMod.Handsontable.GridSettings
import typings.handsontable.handsontableMod.Handsontable.RowObject
import typings.handsontable.handsontableMod.Handsontable.SelectionController
import typings.handsontable.handsontableMod.Handsontable.ViewportColumnsCalculator
import typings.handsontable.handsontableMod.Handsontable.columnSorting.Config
import typings.handsontable.handsontableMod.Handsontable.contextMenu.MenuItemConfig
import typings.handsontable.handsontableMod.Handsontable.contextMenu.PredefinedMenuItemKey
import typings.handsontable.handsontableMod.Handsontable.mergeCells.Settings
import typings.handsontable.handsontableMod.Handsontable.plugins.ContextMenu
import typings.handsontable.handsontableMod.Handsontable.plugins.DropdownMenu
import typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin.ColumnConditions
import typings.handsontable.handsontableMod.Handsontable.plugins.RangeType
import typings.handsontable.handsontableMod.Handsontable.plugins.UndoRedoAction
import typings.handsontable.handsontableMod.Handsontable.wot.CellCoords
import typings.handsontable.handsontableMod.Handsontable.wot.CellRange
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
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.undefined
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  var afterCellMetaReset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
  ] = js.undefined
  var afterChangesObserved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterColumnMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.undefined
  var afterColumnResize: js.UndefOr[
    js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
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
      /* selectedColumnds */ Double, 
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
      /* layerLevel */ Double | Unit, 
      String | Unit
    ]
  ] = js.undefined
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.undefined
  var afterDropdownMenuHide: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
  var afterDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.undefined
  var afterFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]] = js.undefined
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.undefined
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.undefined
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
  var afterLoadData: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]] = js.undefined
  var afterMergeCells: js.UndefOr[
    js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
  ] = js.undefined
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.undefined
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.undefined
  var afterMomentumScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var afterPaste: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.undefined
  var afterPluginsInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var afterRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
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
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.undefined
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.undefined
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ String, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.undefined
  var afterRowMove: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]] = js.undefined
  var afterRowResize: js.UndefOr[
    js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.undefined
  var afterScrollHorizontally: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterScrollVertically: js.UndefOr[js.Function0[Unit]] = js.undefined
  var afterSelection: js.UndefOr[
    js.Function6[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* preventScrolling */ Anon_Value, 
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
      /* preventScrolling */ Anon_Value, 
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
    js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var afterSetDataAtCell: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.undefined
  var afterTrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var afterUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
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
  var afterUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var afterUntrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
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
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.undefined
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.undefined
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellCoords, 
      /* end */ CellCoords, 
      /* data */ js.Array[js.Array[CellValue]], 
      Unit
    ]
  ] = js.undefined
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ CellCoords, 
      /* direction */ up | down | left | right, 
      /* input */ js.Array[js.Array[CellValue]], 
      /* deltas */ js.Array[_], 
      Unit
    ]
  ] = js.undefined
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ NumberDictionary[js.Array[String]], 
      /* range */ js.Array[CellRange], 
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
  var beforeColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
  ] = js.undefined
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Unit | Double
    ]
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
      Unit
    ]
  ] = js.undefined
  var beforeHideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]] = js.undefined
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.undefined
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.undefined
  var beforeMergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.undefined
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
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
  var beforeRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
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
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
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
  var beforeRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ Anon_SkipRender, Unit]] = js.undefined
  var beforeRenderer: js.UndefOr[
    js.Function6[
      /* TD */ HTMLTableCellElement, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* value */ CellValue, 
      /* cellProperties */ CellProperties, 
      Unit
    ]
  ] = js.undefined
  var beforeRowMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.undefined
  var beforeRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Double | Unit
    ]
  ] = js.undefined
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeSetRangeStart: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeSetRangeStartOnly: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.undefined
  var beforeStretchingColumnWidth: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]] = js.undefined
  var beforeTouchScroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeTrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.undefined
  var beforeUnhideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUnhideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.undefined
  var beforeUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.undefined
  var beforeUntrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
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
  var construct: js.UndefOr[js.Function0[Unit]] = js.undefined
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.undefined
  var hiddenRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var modifyAutofillRange: js.UndefOr[
    js.Function2[
      /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      Unit
    ]
  ] = js.undefined
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.undefined
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.undefined
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[Unit]] = js.undefined
  var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]] = js.undefined
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ Double, 
      /* column */ Double, 
      /* valueHolder */ Anon_ValueCellValue, 
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
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.undefined
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ Anon_ValueAny, Unit]] = js.undefined
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.undefined
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ Double, Unit]] = js.undefined
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    afterAddChild: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit = null,
    afterBeginEditing: (/* row */ Double, /* column */ Double) => Unit = null,
    afterCellMetaReset: () => Unit = null,
    afterChange: (/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource) => Unit = null,
    afterChangesObserved: () => Unit = null,
    afterColumnMove: (/* columns */ js.Array[Double], /* target */ Double) => Unit = null,
    afterColumnResize: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit = null,
    afterColumnSort: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit = null,
    afterContextMenuDefaultOptions: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit = null,
    afterContextMenuHide: /* context */ ContextMenu => Unit = null,
    afterContextMenuShow: /* context */ ContextMenu => Unit = null,
    afterCopy: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit = null,
    afterCopyLimit: (/* selectedRows */ Double, /* selectedColumnds */ Double, /* copyRowsLimit */ Double, /* copyColumnsLimit */ Double) => Unit = null,
    afterCreateCol: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterCreateRow: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterCut: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit = null,
    afterDeselect: () => Unit = null,
    afterDestroy: () => Unit = null,
    afterDetachChild: (/* parent */ RowObject, /* element */ RowObject) => Unit = null,
    afterDocumentKeyDown: /* event */ KeyboardEvent => Unit = null,
    afterDrawSelection: (/* currentRow */ Double, /* currentColumn */ Double, /* cornersOfSelection */ js.Array[Double], /* layerLevel */ Double | Unit) => String | Unit = null,
    afterDropdownMenuDefaultOptions: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit = null,
    afterDropdownMenuHide: /* instance */ DropdownMenu => Unit = null,
    afterDropdownMenuShow: /* instance */ DropdownMenu => Unit = null,
    afterFilter: /* conditionsStack */ js.Array[ColumnConditions] => Unit = null,
    afterGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit = null,
    afterGetColHeader: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit = null,
    afterGetColumnHeaderRenderers: /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit = null,
    afterGetRowHeader: (/* row */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit = null,
    afterGetRowHeaderRenderers: /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit = null,
    afterHideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterHideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterInit: () => Unit = null,
    afterLanguageChange: /* languageCode */ String => Unit = null,
    afterListen: () => Unit = null,
    afterLoadData: /* initialLoad */ Boolean => Unit = null,
    afterMergeCells: (/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean) => Unit = null,
    afterModifyTransformEnd: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit = null,
    afterModifyTransformStart: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit = null,
    afterMomentumScroll: () => Unit = null,
    afterOnCellContextMenu: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    afterOnCellCornerDblClick: /* event */ MouseEvent => Unit = null,
    afterOnCellCornerMouseDown: /* event */ MouseEvent => Unit = null,
    afterOnCellMouseDown: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    afterOnCellMouseOut: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    afterOnCellMouseOver: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    afterOnCellMouseUp: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    afterPaste: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit = null,
    afterPluginsInitialized: () => Unit = null,
    afterRedo: /* action */ UndoRedoAction => Unit = null,
    afterRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ Boolean) => Unit = null,
    afterRemoveCellMeta: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit = null,
    afterRemoveCol: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterRemoveRow: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterRender: /* isForced */ Boolean => Unit = null,
    afterRenderer: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ String, /* cellProperties */ CellProperties) => Unit = null,
    afterRowMove: (/* startRow */ Double, /* endRow */ Double) => Unit = null,
    afterRowResize: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit = null,
    afterScrollHorizontally: () => Unit = null,
    afterScrollVertically: () => Unit = null,
    afterSelection: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* preventScrolling */ Anon_Value, /* selectionLayerLevel */ Double) => Unit = null,
    afterSelectionByProp: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* preventScrolling */ Anon_Value, /* selectionLayerLevel */ Double) => Unit = null,
    afterSelectionEnd: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* selectionLayerLevel */ Double) => Unit = null,
    afterSelectionEndByProp: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* selectionLayerLevel */ Double) => Unit = null,
    afterSetCellMeta: (/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any) => Unit = null,
    afterSetDataAtCell: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterSetDataAtRowProp: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    afterTrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterUndo: /* action */ UndoRedoAction => Unit = null,
    afterUnhideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterUnhideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterUnlisten: () => Unit = null,
    afterUnmergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit = null,
    afterUntrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit = null,
    afterUpdateSettings: /* newSettings */ GridSettings => Unit = null,
    afterValidate: (/* isValid */ Boolean, /* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ ChangeSource) => Unit | Boolean = null,
    afterViewportColumnCalculatorOverride: /* calc */ ViewportColumnsCalculator => Unit = null,
    afterViewportRowCalculatorOverride: /* calc */ ViewportColumnsCalculator => Unit = null,
    beforeAddChild: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit = null,
    beforeAutofill: (/* start */ CellCoords, /* end */ CellCoords, /* data */ js.Array[js.Array[CellValue]]) => Unit = null,
    beforeAutofillInsidePopulate: (/* index */ CellCoords, /* direction */ up | down | left | right, /* input */ js.Array[js.Array[CellValue]], /* deltas */ js.Array[_]) => Unit = null,
    beforeCellAlignment: (/* stateBefore */ NumberDictionary[js.Array[String]], /* range */ js.Array[CellRange], /* type */ horizontal | vertical, /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom) => Unit = null,
    beforeChange: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit | Boolean = null,
    beforeChangeRender: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit = null,
    beforeColumnMove: (/* columns */ js.Array[Double], /* target */ Double) => Unit | Boolean = null,
    beforeColumnResize: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit | Double = null,
    beforeColumnSort: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit | Boolean = null,
    beforeContextMenuSetItems: /* menuItems */ js.Array[MenuItemConfig] => Unit = null,
    beforeContextMenuShow: /* context */ ContextMenu => Unit = null,
    beforeCopy: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean = null,
    beforeCreateCol: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit | Boolean = null,
    beforeCreateRow: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    beforeCut: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean = null,
    beforeDetachChild: (/* parent */ RowObject, /* element */ RowObject) => Unit = null,
    beforeDrawBorders: (/* corners */ js.Array[Double], /* borderClassName */ js.UndefOr[current | area | highlight]) => Unit = null,
    beforeDropdownMenuSetItems: /* menuItems */ js.Array[MenuItemConfig] => Unit = null,
    beforeDropdownMenuShow: /* instance */ DropdownMenu => Unit = null,
    beforeFilter: /* conditionsStack */ js.Array[ColumnConditions] => Unit | Boolean = null,
    beforeGetCellMeta: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit = null,
    beforeHideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeHideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeInit: () => Unit = null,
    beforeInitWalkontable: /* walkontableConfig */ js.Object => Unit = null,
    beforeKeyDown: /* event */ KeyboardEvent => Unit = null,
    beforeLanguageChange: /* languageCode */ String => Unit = null,
    beforeMergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit = null,
    beforeOnCellContextMenu: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    beforeOnCellMouseDown: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit = null,
    beforeOnCellMouseOut: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit = null,
    beforeOnCellMouseOver: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit = null,
    beforeOnCellMouseUp: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit = null,
    beforePaste: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean = null,
    beforeRedo: /* action */ UndoRedoAction => Unit = null,
    beforeRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ Boolean) => Boolean | Unit = null,
    beforeRemoveCellClassNames: () => js.Array[String] | Unit = null,
    beforeRemoveCellMeta: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit = null,
    beforeRemoveCol: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    beforeRemoveRow: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    beforeRender: (/* isForced */ Boolean, /* skipRender */ Anon_SkipRender) => Unit = null,
    beforeRenderer: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => Unit = null,
    beforeRowMove: (/* columns */ js.Array[Double], /* target */ Double) => Unit = null,
    beforeRowResize: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Double | Unit = null,
    beforeSetRangeEnd: /* coords */ CellCoords => Unit = null,
    beforeSetRangeStart: /* coords */ CellCoords => Unit = null,
    beforeSetRangeStartOnly: /* coords */ CellCoords => Unit = null,
    beforeStretchingColumnWidth: (/* stretchedWidth */ Double, /* column */ Double) => Unit | Double = null,
    beforeTouchScroll: () => Unit = null,
    beforeTrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeUndo: /* action */ UndoRedoAction => Unit = null,
    beforeUnhideColumns: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeUnhideRows: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeUnmergeCells: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit = null,
    beforeUntrimRow: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit = null,
    beforeValidate: (/* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ js.UndefOr[ChangeSource]) => Unit = null,
    beforeValueRender: (/* value */ CellValue, /* cellProperties */ CellProperties) => Unit = null,
    construct: () => Unit = null,
    hiddenColumn: /* column */ Double => Unit = null,
    hiddenRow: /* row */ Double => Unit = null,
    init: () => Unit = null,
    modifyAutofillRange: (/* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]]) => Unit = null,
    modifyCol: /* col */ Double => Unit = null,
    modifyColHeader: /* column */ Double => Unit = null,
    modifyColWidth: (/* width */ Double, /* col */ Double) => Unit = null,
    modifyColumnHeaderHeight: () => Unit = null,
    modifyCopyableRange: /* copyableRanges */ js.Array[RangeType] => Unit = null,
    modifyData: (/* row */ Double, /* column */ Double, /* valueHolder */ Anon_ValueCellValue, /* ioMode */ get | set) => Unit = null,
    modifyGetCellCoords: (/* row */ Double, /* column */ Double, /* topmost */ Boolean) => Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double]) = null,
    modifyRow: /* row */ Double => Unit = null,
    modifyRowData: /* row */ Double => Unit = null,
    modifyRowHeader: /* row */ Double => Unit = null,
    modifyRowHeaderWidth: /* rowHeaderWidth */ Double => Unit = null,
    modifyRowHeight: (/* height */ Double, /* row */ Double) => Unit = null,
    modifyRowSourceData: /* row */ Double => Unit = null,
    modifyTransformEnd: /* delta */ CellCoords => Unit = null,
    modifyTransformStart: /* delta */ CellCoords => Unit = null,
    persistentStateLoad: (/* key */ String, /* valuePlaceholder */ Anon_ValueAny) => Unit = null,
    persistentStateReset: /* key */ String => Unit = null,
    persistentStateSave: (/* key */ String, /* value */ js.Any) => Unit = null,
    skipLengthCache: /* delay */ Double => Unit = null,
    unmodifyCol: /* col */ Double => Unit = null,
    unmodifyRow: /* row */ Double => Unit = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (afterAddChild != null) __obj.updateDynamic("afterAddChild")(js.Any.fromFunction3(afterAddChild))
    if (afterBeginEditing != null) __obj.updateDynamic("afterBeginEditing")(js.Any.fromFunction2(afterBeginEditing))
    if (afterCellMetaReset != null) __obj.updateDynamic("afterCellMetaReset")(js.Any.fromFunction0(afterCellMetaReset))
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction2(afterChange))
    if (afterChangesObserved != null) __obj.updateDynamic("afterChangesObserved")(js.Any.fromFunction0(afterChangesObserved))
    if (afterColumnMove != null) __obj.updateDynamic("afterColumnMove")(js.Any.fromFunction2(afterColumnMove))
    if (afterColumnResize != null) __obj.updateDynamic("afterColumnResize")(js.Any.fromFunction3(afterColumnResize))
    if (afterColumnSort != null) __obj.updateDynamic("afterColumnSort")(js.Any.fromFunction2(afterColumnSort))
    if (afterContextMenuDefaultOptions != null) __obj.updateDynamic("afterContextMenuDefaultOptions")(js.Any.fromFunction1(afterContextMenuDefaultOptions))
    if (afterContextMenuHide != null) __obj.updateDynamic("afterContextMenuHide")(js.Any.fromFunction1(afterContextMenuHide))
    if (afterContextMenuShow != null) __obj.updateDynamic("afterContextMenuShow")(js.Any.fromFunction1(afterContextMenuShow))
    if (afterCopy != null) __obj.updateDynamic("afterCopy")(js.Any.fromFunction2(afterCopy))
    if (afterCopyLimit != null) __obj.updateDynamic("afterCopyLimit")(js.Any.fromFunction4(afterCopyLimit))
    if (afterCreateCol != null) __obj.updateDynamic("afterCreateCol")(js.Any.fromFunction3(afterCreateCol))
    if (afterCreateRow != null) __obj.updateDynamic("afterCreateRow")(js.Any.fromFunction3(afterCreateRow))
    if (afterCut != null) __obj.updateDynamic("afterCut")(js.Any.fromFunction2(afterCut))
    if (afterDeselect != null) __obj.updateDynamic("afterDeselect")(js.Any.fromFunction0(afterDeselect))
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(js.Any.fromFunction0(afterDestroy))
    if (afterDetachChild != null) __obj.updateDynamic("afterDetachChild")(js.Any.fromFunction2(afterDetachChild))
    if (afterDocumentKeyDown != null) __obj.updateDynamic("afterDocumentKeyDown")(js.Any.fromFunction1(afterDocumentKeyDown))
    if (afterDrawSelection != null) __obj.updateDynamic("afterDrawSelection")(js.Any.fromFunction4(afterDrawSelection))
    if (afterDropdownMenuDefaultOptions != null) __obj.updateDynamic("afterDropdownMenuDefaultOptions")(js.Any.fromFunction1(afterDropdownMenuDefaultOptions))
    if (afterDropdownMenuHide != null) __obj.updateDynamic("afterDropdownMenuHide")(js.Any.fromFunction1(afterDropdownMenuHide))
    if (afterDropdownMenuShow != null) __obj.updateDynamic("afterDropdownMenuShow")(js.Any.fromFunction1(afterDropdownMenuShow))
    if (afterFilter != null) __obj.updateDynamic("afterFilter")(js.Any.fromFunction1(afterFilter))
    if (afterGetCellMeta != null) __obj.updateDynamic("afterGetCellMeta")(js.Any.fromFunction3(afterGetCellMeta))
    if (afterGetColHeader != null) __obj.updateDynamic("afterGetColHeader")(js.Any.fromFunction2(afterGetColHeader))
    if (afterGetColumnHeaderRenderers != null) __obj.updateDynamic("afterGetColumnHeaderRenderers")(js.Any.fromFunction1(afterGetColumnHeaderRenderers))
    if (afterGetRowHeader != null) __obj.updateDynamic("afterGetRowHeader")(js.Any.fromFunction2(afterGetRowHeader))
    if (afterGetRowHeaderRenderers != null) __obj.updateDynamic("afterGetRowHeaderRenderers")(js.Any.fromFunction1(afterGetRowHeaderRenderers))
    if (afterHideColumns != null) __obj.updateDynamic("afterHideColumns")(js.Any.fromFunction4(afterHideColumns))
    if (afterHideRows != null) __obj.updateDynamic("afterHideRows")(js.Any.fromFunction4(afterHideRows))
    if (afterInit != null) __obj.updateDynamic("afterInit")(js.Any.fromFunction0(afterInit))
    if (afterLanguageChange != null) __obj.updateDynamic("afterLanguageChange")(js.Any.fromFunction1(afterLanguageChange))
    if (afterListen != null) __obj.updateDynamic("afterListen")(js.Any.fromFunction0(afterListen))
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(js.Any.fromFunction1(afterLoadData))
    if (afterMergeCells != null) __obj.updateDynamic("afterMergeCells")(js.Any.fromFunction3(afterMergeCells))
    if (afterModifyTransformEnd != null) __obj.updateDynamic("afterModifyTransformEnd")(js.Any.fromFunction3(afterModifyTransformEnd))
    if (afterModifyTransformStart != null) __obj.updateDynamic("afterModifyTransformStart")(js.Any.fromFunction3(afterModifyTransformStart))
    if (afterMomentumScroll != null) __obj.updateDynamic("afterMomentumScroll")(js.Any.fromFunction0(afterMomentumScroll))
    if (afterOnCellContextMenu != null) __obj.updateDynamic("afterOnCellContextMenu")(js.Any.fromFunction3(afterOnCellContextMenu))
    if (afterOnCellCornerDblClick != null) __obj.updateDynamic("afterOnCellCornerDblClick")(js.Any.fromFunction1(afterOnCellCornerDblClick))
    if (afterOnCellCornerMouseDown != null) __obj.updateDynamic("afterOnCellCornerMouseDown")(js.Any.fromFunction1(afterOnCellCornerMouseDown))
    if (afterOnCellMouseDown != null) __obj.updateDynamic("afterOnCellMouseDown")(js.Any.fromFunction3(afterOnCellMouseDown))
    if (afterOnCellMouseOut != null) __obj.updateDynamic("afterOnCellMouseOut")(js.Any.fromFunction3(afterOnCellMouseOut))
    if (afterOnCellMouseOver != null) __obj.updateDynamic("afterOnCellMouseOver")(js.Any.fromFunction3(afterOnCellMouseOver))
    if (afterOnCellMouseUp != null) __obj.updateDynamic("afterOnCellMouseUp")(js.Any.fromFunction3(afterOnCellMouseUp))
    if (afterPaste != null) __obj.updateDynamic("afterPaste")(js.Any.fromFunction2(afterPaste))
    if (afterPluginsInitialized != null) __obj.updateDynamic("afterPluginsInitialized")(js.Any.fromFunction0(afterPluginsInitialized))
    if (afterRedo != null) __obj.updateDynamic("afterRedo")(js.Any.fromFunction1(afterRedo))
    if (afterRefreshDimensions != null) __obj.updateDynamic("afterRefreshDimensions")(js.Any.fromFunction3(afterRefreshDimensions))
    if (afterRemoveCellMeta != null) __obj.updateDynamic("afterRemoveCellMeta")(js.Any.fromFunction4(afterRemoveCellMeta))
    if (afterRemoveCol != null) __obj.updateDynamic("afterRemoveCol")(js.Any.fromFunction4(afterRemoveCol))
    if (afterRemoveRow != null) __obj.updateDynamic("afterRemoveRow")(js.Any.fromFunction4(afterRemoveRow))
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction1(afterRender))
    if (afterRenderer != null) __obj.updateDynamic("afterRenderer")(js.Any.fromFunction6(afterRenderer))
    if (afterRowMove != null) __obj.updateDynamic("afterRowMove")(js.Any.fromFunction2(afterRowMove))
    if (afterRowResize != null) __obj.updateDynamic("afterRowResize")(js.Any.fromFunction3(afterRowResize))
    if (afterScrollHorizontally != null) __obj.updateDynamic("afterScrollHorizontally")(js.Any.fromFunction0(afterScrollHorizontally))
    if (afterScrollVertically != null) __obj.updateDynamic("afterScrollVertically")(js.Any.fromFunction0(afterScrollVertically))
    if (afterSelection != null) __obj.updateDynamic("afterSelection")(js.Any.fromFunction6(afterSelection))
    if (afterSelectionByProp != null) __obj.updateDynamic("afterSelectionByProp")(js.Any.fromFunction6(afterSelectionByProp))
    if (afterSelectionEnd != null) __obj.updateDynamic("afterSelectionEnd")(js.Any.fromFunction5(afterSelectionEnd))
    if (afterSelectionEndByProp != null) __obj.updateDynamic("afterSelectionEndByProp")(js.Any.fromFunction5(afterSelectionEndByProp))
    if (afterSetCellMeta != null) __obj.updateDynamic("afterSetCellMeta")(js.Any.fromFunction4(afterSetCellMeta))
    if (afterSetDataAtCell != null) __obj.updateDynamic("afterSetDataAtCell")(js.Any.fromFunction2(afterSetDataAtCell))
    if (afterSetDataAtRowProp != null) __obj.updateDynamic("afterSetDataAtRowProp")(js.Any.fromFunction2(afterSetDataAtRowProp))
    if (afterTrimRow != null) __obj.updateDynamic("afterTrimRow")(js.Any.fromFunction4(afterTrimRow))
    if (afterUndo != null) __obj.updateDynamic("afterUndo")(js.Any.fromFunction1(afterUndo))
    if (afterUnhideColumns != null) __obj.updateDynamic("afterUnhideColumns")(js.Any.fromFunction4(afterUnhideColumns))
    if (afterUnhideRows != null) __obj.updateDynamic("afterUnhideRows")(js.Any.fromFunction4(afterUnhideRows))
    if (afterUnlisten != null) __obj.updateDynamic("afterUnlisten")(js.Any.fromFunction0(afterUnlisten))
    if (afterUnmergeCells != null) __obj.updateDynamic("afterUnmergeCells")(js.Any.fromFunction2(afterUnmergeCells))
    if (afterUntrimRow != null) __obj.updateDynamic("afterUntrimRow")(js.Any.fromFunction4(afterUntrimRow))
    if (afterUpdateSettings != null) __obj.updateDynamic("afterUpdateSettings")(js.Any.fromFunction1(afterUpdateSettings))
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(js.Any.fromFunction5(afterValidate))
    if (afterViewportColumnCalculatorOverride != null) __obj.updateDynamic("afterViewportColumnCalculatorOverride")(js.Any.fromFunction1(afterViewportColumnCalculatorOverride))
    if (afterViewportRowCalculatorOverride != null) __obj.updateDynamic("afterViewportRowCalculatorOverride")(js.Any.fromFunction1(afterViewportRowCalculatorOverride))
    if (beforeAddChild != null) __obj.updateDynamic("beforeAddChild")(js.Any.fromFunction3(beforeAddChild))
    if (beforeAutofill != null) __obj.updateDynamic("beforeAutofill")(js.Any.fromFunction3(beforeAutofill))
    if (beforeAutofillInsidePopulate != null) __obj.updateDynamic("beforeAutofillInsidePopulate")(js.Any.fromFunction4(beforeAutofillInsidePopulate))
    if (beforeCellAlignment != null) __obj.updateDynamic("beforeCellAlignment")(js.Any.fromFunction4(beforeCellAlignment))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (beforeChangeRender != null) __obj.updateDynamic("beforeChangeRender")(js.Any.fromFunction2(beforeChangeRender))
    if (beforeColumnMove != null) __obj.updateDynamic("beforeColumnMove")(js.Any.fromFunction2(beforeColumnMove))
    if (beforeColumnResize != null) __obj.updateDynamic("beforeColumnResize")(js.Any.fromFunction3(beforeColumnResize))
    if (beforeColumnSort != null) __obj.updateDynamic("beforeColumnSort")(js.Any.fromFunction2(beforeColumnSort))
    if (beforeContextMenuSetItems != null) __obj.updateDynamic("beforeContextMenuSetItems")(js.Any.fromFunction1(beforeContextMenuSetItems))
    if (beforeContextMenuShow != null) __obj.updateDynamic("beforeContextMenuShow")(js.Any.fromFunction1(beforeContextMenuShow))
    if (beforeCopy != null) __obj.updateDynamic("beforeCopy")(js.Any.fromFunction2(beforeCopy))
    if (beforeCreateCol != null) __obj.updateDynamic("beforeCreateCol")(js.Any.fromFunction3(beforeCreateCol))
    if (beforeCreateRow != null) __obj.updateDynamic("beforeCreateRow")(js.Any.fromFunction3(beforeCreateRow))
    if (beforeCut != null) __obj.updateDynamic("beforeCut")(js.Any.fromFunction2(beforeCut))
    if (beforeDetachChild != null) __obj.updateDynamic("beforeDetachChild")(js.Any.fromFunction2(beforeDetachChild))
    if (beforeDrawBorders != null) __obj.updateDynamic("beforeDrawBorders")(js.Any.fromFunction2(beforeDrawBorders))
    if (beforeDropdownMenuSetItems != null) __obj.updateDynamic("beforeDropdownMenuSetItems")(js.Any.fromFunction1(beforeDropdownMenuSetItems))
    if (beforeDropdownMenuShow != null) __obj.updateDynamic("beforeDropdownMenuShow")(js.Any.fromFunction1(beforeDropdownMenuShow))
    if (beforeFilter != null) __obj.updateDynamic("beforeFilter")(js.Any.fromFunction1(beforeFilter))
    if (beforeGetCellMeta != null) __obj.updateDynamic("beforeGetCellMeta")(js.Any.fromFunction3(beforeGetCellMeta))
    if (beforeHideColumns != null) __obj.updateDynamic("beforeHideColumns")(js.Any.fromFunction3(beforeHideColumns))
    if (beforeHideRows != null) __obj.updateDynamic("beforeHideRows")(js.Any.fromFunction3(beforeHideRows))
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction0(beforeInit))
    if (beforeInitWalkontable != null) __obj.updateDynamic("beforeInitWalkontable")(js.Any.fromFunction1(beforeInitWalkontable))
    if (beforeKeyDown != null) __obj.updateDynamic("beforeKeyDown")(js.Any.fromFunction1(beforeKeyDown))
    if (beforeLanguageChange != null) __obj.updateDynamic("beforeLanguageChange")(js.Any.fromFunction1(beforeLanguageChange))
    if (beforeMergeCells != null) __obj.updateDynamic("beforeMergeCells")(js.Any.fromFunction2(beforeMergeCells))
    if (beforeOnCellContextMenu != null) __obj.updateDynamic("beforeOnCellContextMenu")(js.Any.fromFunction3(beforeOnCellContextMenu))
    if (beforeOnCellMouseDown != null) __obj.updateDynamic("beforeOnCellMouseDown")(js.Any.fromFunction4(beforeOnCellMouseDown))
    if (beforeOnCellMouseOut != null) __obj.updateDynamic("beforeOnCellMouseOut")(js.Any.fromFunction3(beforeOnCellMouseOut))
    if (beforeOnCellMouseOver != null) __obj.updateDynamic("beforeOnCellMouseOver")(js.Any.fromFunction4(beforeOnCellMouseOver))
    if (beforeOnCellMouseUp != null) __obj.updateDynamic("beforeOnCellMouseUp")(js.Any.fromFunction4(beforeOnCellMouseUp))
    if (beforePaste != null) __obj.updateDynamic("beforePaste")(js.Any.fromFunction2(beforePaste))
    if (beforeRedo != null) __obj.updateDynamic("beforeRedo")(js.Any.fromFunction1(beforeRedo))
    if (beforeRefreshDimensions != null) __obj.updateDynamic("beforeRefreshDimensions")(js.Any.fromFunction3(beforeRefreshDimensions))
    if (beforeRemoveCellClassNames != null) __obj.updateDynamic("beforeRemoveCellClassNames")(js.Any.fromFunction0(beforeRemoveCellClassNames))
    if (beforeRemoveCellMeta != null) __obj.updateDynamic("beforeRemoveCellMeta")(js.Any.fromFunction4(beforeRemoveCellMeta))
    if (beforeRemoveCol != null) __obj.updateDynamic("beforeRemoveCol")(js.Any.fromFunction4(beforeRemoveCol))
    if (beforeRemoveRow != null) __obj.updateDynamic("beforeRemoveRow")(js.Any.fromFunction4(beforeRemoveRow))
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(js.Any.fromFunction2(beforeRender))
    if (beforeRenderer != null) __obj.updateDynamic("beforeRenderer")(js.Any.fromFunction6(beforeRenderer))
    if (beforeRowMove != null) __obj.updateDynamic("beforeRowMove")(js.Any.fromFunction2(beforeRowMove))
    if (beforeRowResize != null) __obj.updateDynamic("beforeRowResize")(js.Any.fromFunction3(beforeRowResize))
    if (beforeSetRangeEnd != null) __obj.updateDynamic("beforeSetRangeEnd")(js.Any.fromFunction1(beforeSetRangeEnd))
    if (beforeSetRangeStart != null) __obj.updateDynamic("beforeSetRangeStart")(js.Any.fromFunction1(beforeSetRangeStart))
    if (beforeSetRangeStartOnly != null) __obj.updateDynamic("beforeSetRangeStartOnly")(js.Any.fromFunction1(beforeSetRangeStartOnly))
    if (beforeStretchingColumnWidth != null) __obj.updateDynamic("beforeStretchingColumnWidth")(js.Any.fromFunction2(beforeStretchingColumnWidth))
    if (beforeTouchScroll != null) __obj.updateDynamic("beforeTouchScroll")(js.Any.fromFunction0(beforeTouchScroll))
    if (beforeTrimRow != null) __obj.updateDynamic("beforeTrimRow")(js.Any.fromFunction3(beforeTrimRow))
    if (beforeUndo != null) __obj.updateDynamic("beforeUndo")(js.Any.fromFunction1(beforeUndo))
    if (beforeUnhideColumns != null) __obj.updateDynamic("beforeUnhideColumns")(js.Any.fromFunction3(beforeUnhideColumns))
    if (beforeUnhideRows != null) __obj.updateDynamic("beforeUnhideRows")(js.Any.fromFunction3(beforeUnhideRows))
    if (beforeUnmergeCells != null) __obj.updateDynamic("beforeUnmergeCells")(js.Any.fromFunction2(beforeUnmergeCells))
    if (beforeUntrimRow != null) __obj.updateDynamic("beforeUntrimRow")(js.Any.fromFunction3(beforeUntrimRow))
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(js.Any.fromFunction4(beforeValidate))
    if (beforeValueRender != null) __obj.updateDynamic("beforeValueRender")(js.Any.fromFunction2(beforeValueRender))
    if (construct != null) __obj.updateDynamic("construct")(js.Any.fromFunction0(construct))
    if (hiddenColumn != null) __obj.updateDynamic("hiddenColumn")(js.Any.fromFunction1(hiddenColumn))
    if (hiddenRow != null) __obj.updateDynamic("hiddenRow")(js.Any.fromFunction1(hiddenRow))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (modifyAutofillRange != null) __obj.updateDynamic("modifyAutofillRange")(js.Any.fromFunction2(modifyAutofillRange))
    if (modifyCol != null) __obj.updateDynamic("modifyCol")(js.Any.fromFunction1(modifyCol))
    if (modifyColHeader != null) __obj.updateDynamic("modifyColHeader")(js.Any.fromFunction1(modifyColHeader))
    if (modifyColWidth != null) __obj.updateDynamic("modifyColWidth")(js.Any.fromFunction2(modifyColWidth))
    if (modifyColumnHeaderHeight != null) __obj.updateDynamic("modifyColumnHeaderHeight")(js.Any.fromFunction0(modifyColumnHeaderHeight))
    if (modifyCopyableRange != null) __obj.updateDynamic("modifyCopyableRange")(js.Any.fromFunction1(modifyCopyableRange))
    if (modifyData != null) __obj.updateDynamic("modifyData")(js.Any.fromFunction4(modifyData))
    if (modifyGetCellCoords != null) __obj.updateDynamic("modifyGetCellCoords")(js.Any.fromFunction3(modifyGetCellCoords))
    if (modifyRow != null) __obj.updateDynamic("modifyRow")(js.Any.fromFunction1(modifyRow))
    if (modifyRowData != null) __obj.updateDynamic("modifyRowData")(js.Any.fromFunction1(modifyRowData))
    if (modifyRowHeader != null) __obj.updateDynamic("modifyRowHeader")(js.Any.fromFunction1(modifyRowHeader))
    if (modifyRowHeaderWidth != null) __obj.updateDynamic("modifyRowHeaderWidth")(js.Any.fromFunction1(modifyRowHeaderWidth))
    if (modifyRowHeight != null) __obj.updateDynamic("modifyRowHeight")(js.Any.fromFunction2(modifyRowHeight))
    if (modifyRowSourceData != null) __obj.updateDynamic("modifyRowSourceData")(js.Any.fromFunction1(modifyRowSourceData))
    if (modifyTransformEnd != null) __obj.updateDynamic("modifyTransformEnd")(js.Any.fromFunction1(modifyTransformEnd))
    if (modifyTransformStart != null) __obj.updateDynamic("modifyTransformStart")(js.Any.fromFunction1(modifyTransformStart))
    if (persistentStateLoad != null) __obj.updateDynamic("persistentStateLoad")(js.Any.fromFunction2(persistentStateLoad))
    if (persistentStateReset != null) __obj.updateDynamic("persistentStateReset")(js.Any.fromFunction1(persistentStateReset))
    if (persistentStateSave != null) __obj.updateDynamic("persistentStateSave")(js.Any.fromFunction2(persistentStateSave))
    if (skipLengthCache != null) __obj.updateDynamic("skipLengthCache")(js.Any.fromFunction1(skipLengthCache))
    if (unmodifyCol != null) __obj.updateDynamic("unmodifyCol")(js.Any.fromFunction1(unmodifyCol))
    if (unmodifyRow != null) __obj.updateDynamic("unmodifyRow")(js.Any.fromFunction1(unmodifyRow))
    __obj.asInstanceOf[Events]
  }
}

