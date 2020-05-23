package typings.handsontable.mod.Handsontable.Hooks

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
  var beforeRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]] = js.undefined
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
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.undefined
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.undefined
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.undefined
  var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]] = js.undefined
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.undefined
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ Double, Unit]] = js.undefined
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.undefined
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
}

