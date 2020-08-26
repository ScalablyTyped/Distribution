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

@js.native
trait Events extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.native
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.native
  var afterCellMetaReset: js.UndefOr[js.Function0[Unit]] = js.native
  var afterChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource, Unit]
  ] = js.native
  var afterChangesObserved: js.UndefOr[js.Function0[Unit]] = js.native
  var afterColumnMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.native
  var afterColumnResize: js.UndefOr[
    js.Function3[/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.native
  var afterColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit
    ]
  ] = js.native
  var afterContextMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.native
  var afterContextMenuHide: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var afterContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var afterCopy: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRows */ Double, 
      /* selectedColumnds */ Double, 
      /* copyRowsLimit */ Double, 
      /* copyColumnsLimit */ Double, 
      Unit
    ]
  ] = js.native
  var afterCreateCol: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterCut: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterDeselect: js.UndefOr[js.Function0[Unit]] = js.native
  var afterDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  var afterDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.native
  var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var afterDrawSelection: js.UndefOr[
    js.Function4[
      /* currentRow */ Double, 
      /* currentColumn */ Double, 
      /* cornersOfSelection */ js.Array[Double], 
      /* layerLevel */ Double | Unit, 
      String | Unit
    ]
  ] = js.native
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Function1[/* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig], Unit]
  ] = js.native
  var afterDropdownMenuHide: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var afterDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var afterFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit]] = js.native
  var afterGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.native
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  var afterGetColumnHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.native
  var afterGetRowHeader: js.UndefOr[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] = js.native
  var afterGetRowHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]], 
      Unit
    ]
  ] = js.native
  var afterHideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterHideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterInit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.native
  var afterListen: js.UndefOr[js.Function0[Unit]] = js.native
  var afterLoadData: js.UndefOr[js.Function1[/* initialLoad */ Boolean, Unit]] = js.native
  var afterMergeCells: js.UndefOr[
    js.Function3[/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean, Unit]
  ] = js.native
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.native
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ CellCoords, 
      /* rowTransformDir */ `-1` | `0`, 
      /* colTransformDir */ `-1` | `0`, 
      Unit
    ]
  ] = js.native
  var afterMomentumScroll: js.UndefOr[js.Function0[Unit]] = js.native
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var afterPaste: js.UndefOr[
    js.Function2[/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType], Unit]
  ] = js.native
  var afterPluginsInitialized: js.UndefOr[js.Function0[Unit]] = js.native
  var afterRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var afterRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var afterRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var afterRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var afterRender: js.UndefOr[js.Function1[/* isForced */ Boolean, Unit]] = js.native
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
  ] = js.native
  var afterRowMove: js.UndefOr[js.Function2[/* startRow */ Double, /* endRow */ Double, Unit]] = js.native
  var afterRowResize: js.UndefOr[
    js.Function3[/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean, Unit]
  ] = js.native
  var afterScrollHorizontally: js.UndefOr[js.Function0[Unit]] = js.native
  var afterScrollVertically: js.UndefOr[js.Function0[Unit]] = js.native
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
  ] = js.native
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
  ] = js.native
  var afterSelectionEnd: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* column */ Double, 
      /* row2 */ Double, 
      /* column2 */ Double, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSelectionEndByProp: js.UndefOr[
    js.Function5[
      /* row */ Double, 
      /* prop */ String, 
      /* row2 */ Double, 
      /* prop2 */ String, 
      /* selectionLayerLevel */ Double, 
      Unit
    ]
  ] = js.native
  var afterSetCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var afterSetDataAtCell: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var afterTrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var afterUnhideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUnhideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUnlisten: js.UndefOr[js.Function0[Unit]] = js.native
  var afterUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var afterUntrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      /* stateChanged */ Boolean, 
      Unit
    ]
  ] = js.native
  var afterUpdateSettings: js.UndefOr[js.Function1[/* newSettings */ GridSettings, Unit]] = js.native
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ Boolean, 
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ ChangeSource, 
      Unit | Boolean
    ]
  ] = js.native
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.native
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ ViewportColumnsCalculator, Unit]] = js.native
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ RowObject, 
      /* element */ RowObject | Unit, 
      /* index */ Double | Unit, 
      Unit
    ]
  ] = js.native
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ CellCoords, 
      /* end */ CellCoords, 
      /* data */ js.Array[js.Array[CellValue]], 
      Unit
    ]
  ] = js.native
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ CellCoords, 
      /* direction */ up | down | left | right, 
      /* input */ js.Array[js.Array[CellValue]], 
      /* deltas */ js.Array[_], 
      Unit
    ]
  ] = js.native
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ NumberDictionary[js.Array[String]], 
      /* range */ js.Array[CellRange], 
      /* type */ horizontal | vertical, 
      /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom, 
      Unit
    ]
  ] = js.native
  var beforeChange: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit | Boolean]
  ] = js.native
  var beforeChangeRender: js.UndefOr[
    js.Function2[/* changes */ js.Array[CellChange], /* source */ ChangeSource, Unit]
  ] = js.native
  var beforeColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit | Boolean]
  ] = js.native
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Unit | Double
    ]
  ] = js.native
  var beforeColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[Config], 
      /* destinationSortConfigs */ js.Array[Config], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeContextMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.native
  var beforeContextMenuShow: js.UndefOr[js.Function1[/* context */ ContextMenu, Unit]] = js.native
  var beforeCopy: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeCreateCol: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* amount */ Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeCreateRow: js.UndefOr[
    js.Function3[/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource], Unit]
  ] = js.native
  var beforeCut: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeDetachChild: js.UndefOr[js.Function2[/* parent */ RowObject, /* element */ RowObject, Unit]] = js.native
  var beforeDrawBorders: js.UndefOr[
    js.Function2[
      /* corners */ js.Array[Double], 
      /* borderClassName */ js.UndefOr[current | area | highlight], 
      Unit
    ]
  ] = js.native
  var beforeDropdownMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[MenuItemConfig], Unit]] = js.native
  var beforeDropdownMenuShow: js.UndefOr[js.Function1[/* instance */ DropdownMenu, Unit]] = js.native
  var beforeFilter: js.UndefOr[js.Function1[/* conditionsStack */ js.Array[ColumnConditions], Unit | Boolean]] = js.native
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties, Unit]
  ] = js.native
  var beforeHideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeHideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeInit: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, Unit]] = js.native
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Unit]] = js.native
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ String, Unit]] = js.native
  var beforeMergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, Unit]
  ] = js.native
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ MouseEvent, 
      /* coords */ CellCoords, 
      /* TD */ HTMLTableCellElement, 
      /* controller */ SelectionController, 
      Unit
    ]
  ] = js.native
  var beforePaste: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[CellValue]], 
      /* coords */ js.Array[RangeType], 
      Unit | Boolean
    ]
  ] = js.native
  var beforeRedo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var beforeRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* actionPossible */ Boolean, 
      Boolean | Unit
    ]
  ] = js.native
  var beforeRemoveCellClassNames: js.UndefOr[js.Function0[js.Array[String] | Unit]] = js.native
  var beforeRemoveCellMeta: js.UndefOr[
    js.Function4[/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any, Unit]
  ] = js.native
  var beforeRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* amount */ Double, 
      /* physicalColumns */ js.Array[Double], 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeRender: js.UndefOr[js.Function2[/* isForced */ Boolean, /* skipRender */ SkipRender, Unit]] = js.native
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
  ] = js.native
  var beforeRowMove: js.UndefOr[js.Function2[/* columns */ js.Array[Double], /* target */ Double, Unit]] = js.native
  var beforeRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ Double, 
      /* newSize */ Double, 
      /* isDoubleClick */ Boolean, 
      Double | Unit
    ]
  ] = js.native
  var beforeSetRangeEnd: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeSetRangeStart: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeSetRangeStartOnly: js.UndefOr[js.Function1[/* coords */ CellCoords, Unit]] = js.native
  var beforeStretchingColumnWidth: js.UndefOr[js.Function2[/* stretchedWidth */ Double, /* column */ Double, Unit | Double]] = js.native
  var beforeTouchScroll: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeTrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUndo: js.UndefOr[js.Function1[/* action */ UndoRedoAction, Unit]] = js.native
  var beforeUnhideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUnhideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[Double], 
      /* destinationHideConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeUnmergeCells: js.UndefOr[js.Function2[/* cellRange */ CellRange, /* auto */ Boolean, Unit]] = js.native
  var beforeUntrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[Double], 
      /* destinationTrimConfig */ js.Array[Double], 
      /* actionPossible */ Boolean, 
      Unit
    ]
  ] = js.native
  var beforeValidate: js.UndefOr[
    js.Function4[
      /* value */ CellValue, 
      /* row */ Double, 
      /* prop */ String | Double, 
      /* source */ js.UndefOr[ChangeSource], 
      Unit
    ]
  ] = js.native
  var beforeValueRender: js.UndefOr[js.Function2[/* value */ CellValue, /* cellProperties */ CellProperties, Unit]] = js.native
  var construct: js.UndefOr[js.Function0[Unit]] = js.native
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.native
  var hiddenRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var modifyAutofillRange: js.UndefOr[
    js.Function2[
      /* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], 
      Unit
    ]
  ] = js.native
  var modifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ Double, Unit]] = js.native
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ Double, /* col */ Double, Unit]] = js.native
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[Unit]] = js.native
  var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[RangeType], Unit]] = js.native
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ Double, 
      /* column */ Double, 
      /* valueHolder */ ValueCellValue, 
      /* ioMode */ get | set, 
      Unit
    ]
  ] = js.native
  var modifyGetCellCoords: js.UndefOr[
    js.Function3[
      /* row */ Double, 
      /* column */ Double, 
      /* topmost */ Boolean, 
      Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ]
  ] = js.native
  var modifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ Double, Unit]] = js.native
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ Double, /* row */ Double, Unit]] = js.native
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
  var modifyTransformEnd: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.native
  var modifyTransformStart: js.UndefOr[js.Function1[/* delta */ CellCoords, Unit]] = js.native
  var persistentStateLoad: js.UndefOr[js.Function2[/* key */ String, /* valuePlaceholder */ ValueAny, Unit]] = js.native
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.native
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ Double, Unit]] = js.native
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ Double, Unit]] = js.native
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setAfterAddChild(value: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit): Self = this.set("afterAddChild", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterAddChild: Self = this.set("afterAddChild", js.undefined)
    @scala.inline
    def setAfterBeginEditing(value: (/* row */ Double, /* column */ Double) => Unit): Self = this.set("afterBeginEditing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterBeginEditing: Self = this.set("afterBeginEditing", js.undefined)
    @scala.inline
    def setAfterCellMetaReset(value: () => Unit): Self = this.set("afterCellMetaReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterCellMetaReset: Self = this.set("afterCellMetaReset", js.undefined)
    @scala.inline
    def setAfterChange(value: (/* changes */ js.Array[CellChange] | Null, /* source */ ChangeSource) => Unit): Self = this.set("afterChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAfterChangesObserved(value: () => Unit): Self = this.set("afterChangesObserved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterChangesObserved: Self = this.set("afterChangesObserved", js.undefined)
    @scala.inline
    def setAfterColumnMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit): Self = this.set("afterColumnMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterColumnMove: Self = this.set("afterColumnMove", js.undefined)
    @scala.inline
    def setAfterColumnResize(value: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit): Self = this.set("afterColumnResize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterColumnResize: Self = this.set("afterColumnResize", js.undefined)
    @scala.inline
    def setAfterColumnSort(
      value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit
    ): Self = this.set("afterColumnSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterColumnSort: Self = this.set("afterColumnSort", js.undefined)
    @scala.inline
    def setAfterContextMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = this.set("afterContextMenuDefaultOptions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterContextMenuDefaultOptions: Self = this.set("afterContextMenuDefaultOptions", js.undefined)
    @scala.inline
    def setAfterContextMenuHide(value: /* context */ ContextMenu => Unit): Self = this.set("afterContextMenuHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterContextMenuHide: Self = this.set("afterContextMenuHide", js.undefined)
    @scala.inline
    def setAfterContextMenuShow(value: /* context */ ContextMenu => Unit): Self = this.set("afterContextMenuShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterContextMenuShow: Self = this.set("afterContextMenuShow", js.undefined)
    @scala.inline
    def setAfterCopy(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = this.set("afterCopy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterCopy: Self = this.set("afterCopy", js.undefined)
    @scala.inline
    def setAfterCopyLimit(
      value: (/* selectedRows */ Double, /* selectedColumnds */ Double, /* copyRowsLimit */ Double, /* copyColumnsLimit */ Double) => Unit
    ): Self = this.set("afterCopyLimit", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterCopyLimit: Self = this.set("afterCopyLimit", js.undefined)
    @scala.inline
    def setAfterCreateCol(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = this.set("afterCreateCol", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterCreateCol: Self = this.set("afterCreateCol", js.undefined)
    @scala.inline
    def setAfterCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = this.set("afterCreateRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterCreateRow: Self = this.set("afterCreateRow", js.undefined)
    @scala.inline
    def setAfterCut(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = this.set("afterCut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterCut: Self = this.set("afterCut", js.undefined)
    @scala.inline
    def setAfterDeselect(value: () => Unit): Self = this.set("afterDeselect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterDeselect: Self = this.set("afterDeselect", js.undefined)
    @scala.inline
    def setAfterDestroy(value: () => Unit): Self = this.set("afterDestroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterDestroy: Self = this.set("afterDestroy", js.undefined)
    @scala.inline
    def setAfterDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = this.set("afterDetachChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterDetachChild: Self = this.set("afterDetachChild", js.undefined)
    @scala.inline
    def setAfterDocumentKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("afterDocumentKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDocumentKeyDown: Self = this.set("afterDocumentKeyDown", js.undefined)
    @scala.inline
    def setAfterDrawSelection(
      value: (/* currentRow */ Double, /* currentColumn */ Double, /* cornersOfSelection */ js.Array[Double], /* layerLevel */ Double | Unit) => String | Unit
    ): Self = this.set("afterDrawSelection", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterDrawSelection: Self = this.set("afterDrawSelection", js.undefined)
    @scala.inline
    def setAfterDropdownMenuDefaultOptions(value: /* predefinedItems */ js.Array[PredefinedMenuItemKey | MenuItemConfig] => Unit): Self = this.set("afterDropdownMenuDefaultOptions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDropdownMenuDefaultOptions: Self = this.set("afterDropdownMenuDefaultOptions", js.undefined)
    @scala.inline
    def setAfterDropdownMenuHide(value: /* instance */ DropdownMenu => Unit): Self = this.set("afterDropdownMenuHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDropdownMenuHide: Self = this.set("afterDropdownMenuHide", js.undefined)
    @scala.inline
    def setAfterDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = this.set("afterDropdownMenuShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterDropdownMenuShow: Self = this.set("afterDropdownMenuShow", js.undefined)
    @scala.inline
    def setAfterFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit): Self = this.set("afterFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterFilter: Self = this.set("afterFilter", js.undefined)
    @scala.inline
    def setAfterGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit): Self = this.set("afterGetCellMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterGetCellMeta: Self = this.set("afterGetCellMeta", js.undefined)
    @scala.inline
    def setAfterGetColHeader(value: (/* col */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = this.set("afterGetColHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterGetColHeader: Self = this.set("afterGetColHeader", js.undefined)
    @scala.inline
    def setAfterGetColumnHeaderRenderers(
      value: /* renderers */ js.Array[js.Function2[/* col */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
    ): Self = this.set("afterGetColumnHeaderRenderers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterGetColumnHeaderRenderers: Self = this.set("afterGetColumnHeaderRenderers", js.undefined)
    @scala.inline
    def setAfterGetRowHeader(value: (/* row */ Double, /* TH */ HTMLTableHeaderCellElement) => Unit): Self = this.set("afterGetRowHeader", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterGetRowHeader: Self = this.set("afterGetRowHeader", js.undefined)
    @scala.inline
    def setAfterGetRowHeaderRenderers(
      value: /* renderers */ js.Array[js.Function2[/* row */ Double, /* TH */ HTMLTableHeaderCellElement, Unit]] => Unit
    ): Self = this.set("afterGetRowHeaderRenderers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterGetRowHeaderRenderers: Self = this.set("afterGetRowHeaderRenderers", js.undefined)
    @scala.inline
    def setAfterHideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterHideColumns", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterHideColumns: Self = this.set("afterHideColumns", js.undefined)
    @scala.inline
    def setAfterHideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterHideRows", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterHideRows: Self = this.set("afterHideRows", js.undefined)
    @scala.inline
    def setAfterInit(value: () => Unit): Self = this.set("afterInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    @scala.inline
    def setAfterLanguageChange(value: /* languageCode */ String => Unit): Self = this.set("afterLanguageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLanguageChange: Self = this.set("afterLanguageChange", js.undefined)
    @scala.inline
    def setAfterListen(value: () => Unit): Self = this.set("afterListen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterListen: Self = this.set("afterListen", js.undefined)
    @scala.inline
    def setAfterLoadData(value: /* initialLoad */ Boolean => Unit): Self = this.set("afterLoadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterLoadData: Self = this.set("afterLoadData", js.undefined)
    @scala.inline
    def setAfterMergeCells(value: (/* cellRange */ CellRange, /* mergeParent */ Settings, /* auto */ Boolean) => Unit): Self = this.set("afterMergeCells", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterMergeCells: Self = this.set("afterMergeCells", js.undefined)
    @scala.inline
    def setAfterModifyTransformEnd(
      value: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
    ): Self = this.set("afterModifyTransformEnd", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterModifyTransformEnd: Self = this.set("afterModifyTransformEnd", js.undefined)
    @scala.inline
    def setAfterModifyTransformStart(
      value: (/* coords */ CellCoords, /* rowTransformDir */ `-1` | `0`, /* colTransformDir */ `-1` | `0`) => Unit
    ): Self = this.set("afterModifyTransformStart", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterModifyTransformStart: Self = this.set("afterModifyTransformStart", js.undefined)
    @scala.inline
    def setAfterMomentumScroll(value: () => Unit): Self = this.set("afterMomentumScroll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterMomentumScroll: Self = this.set("afterMomentumScroll", js.undefined)
    @scala.inline
    def setAfterOnCellContextMenu(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("afterOnCellContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellContextMenu: Self = this.set("afterOnCellContextMenu", js.undefined)
    @scala.inline
    def setAfterOnCellCornerDblClick(value: /* event */ MouseEvent => Unit): Self = this.set("afterOnCellCornerDblClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterOnCellCornerDblClick: Self = this.set("afterOnCellCornerDblClick", js.undefined)
    @scala.inline
    def setAfterOnCellCornerMouseDown(value: /* event */ MouseEvent => Unit): Self = this.set("afterOnCellCornerMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterOnCellCornerMouseDown: Self = this.set("afterOnCellCornerMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseDown(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("afterOnCellMouseDown", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseDown: Self = this.set("afterOnCellMouseDown", js.undefined)
    @scala.inline
    def setAfterOnCellMouseOut(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("afterOnCellMouseOut", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseOut: Self = this.set("afterOnCellMouseOut", js.undefined)
    @scala.inline
    def setAfterOnCellMouseOver(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("afterOnCellMouseOver", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseOver: Self = this.set("afterOnCellMouseOver", js.undefined)
    @scala.inline
    def setAfterOnCellMouseUp(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("afterOnCellMouseUp", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterOnCellMouseUp: Self = this.set("afterOnCellMouseUp", js.undefined)
    @scala.inline
    def setAfterPaste(value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit): Self = this.set("afterPaste", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterPaste: Self = this.set("afterPaste", js.undefined)
    @scala.inline
    def setAfterPluginsInitialized(value: () => Unit): Self = this.set("afterPluginsInitialized", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterPluginsInitialized: Self = this.set("afterPluginsInitialized", js.undefined)
    @scala.inline
    def setAfterRedo(value: /* action */ UndoRedoAction => Unit): Self = this.set("afterRedo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterRedo: Self = this.set("afterRedo", js.undefined)
    @scala.inline
    def setAfterRefreshDimensions(
      value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterRefreshDimensions", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterRefreshDimensions: Self = this.set("afterRefreshDimensions", js.undefined)
    @scala.inline
    def setAfterRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = this.set("afterRemoveCellMeta", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterRemoveCellMeta: Self = this.set("afterRemoveCellMeta", js.undefined)
    @scala.inline
    def setAfterRemoveCol(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = this.set("afterRemoveCol", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterRemoveCol: Self = this.set("afterRemoveCol", js.undefined)
    @scala.inline
    def setAfterRemoveRow(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = this.set("afterRemoveRow", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterRemoveRow: Self = this.set("afterRemoveRow", js.undefined)
    @scala.inline
    def setAfterRender(value: /* isForced */ Boolean => Unit): Self = this.set("afterRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    @scala.inline
    def setAfterRenderer(
      value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ String, /* cellProperties */ CellProperties) => Unit
    ): Self = this.set("afterRenderer", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAfterRenderer: Self = this.set("afterRenderer", js.undefined)
    @scala.inline
    def setAfterRowMove(value: (/* startRow */ Double, /* endRow */ Double) => Unit): Self = this.set("afterRowMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterRowMove: Self = this.set("afterRowMove", js.undefined)
    @scala.inline
    def setAfterRowResize(value: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit): Self = this.set("afterRowResize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfterRowResize: Self = this.set("afterRowResize", js.undefined)
    @scala.inline
    def setAfterScrollHorizontally(value: () => Unit): Self = this.set("afterScrollHorizontally", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterScrollHorizontally: Self = this.set("afterScrollHorizontally", js.undefined)
    @scala.inline
    def setAfterScrollVertically(value: () => Unit): Self = this.set("afterScrollVertically", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterScrollVertically: Self = this.set("afterScrollVertically", js.undefined)
    @scala.inline
    def setAfterSelection(
      value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
    ): Self = this.set("afterSelection", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAfterSelection: Self = this.set("afterSelection", js.undefined)
    @scala.inline
    def setAfterSelectionByProp(
      value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* preventScrolling */ Value, /* selectionLayerLevel */ Double) => Unit
    ): Self = this.set("afterSelectionByProp", js.Any.fromFunction6(value))
    @scala.inline
    def deleteAfterSelectionByProp: Self = this.set("afterSelectionByProp", js.undefined)
    @scala.inline
    def setAfterSelectionEnd(
      value: (/* row */ Double, /* column */ Double, /* row2 */ Double, /* column2 */ Double, /* selectionLayerLevel */ Double) => Unit
    ): Self = this.set("afterSelectionEnd", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterSelectionEnd: Self = this.set("afterSelectionEnd", js.undefined)
    @scala.inline
    def setAfterSelectionEndByProp(
      value: (/* row */ Double, /* prop */ String, /* row2 */ Double, /* prop2 */ String, /* selectionLayerLevel */ Double) => Unit
    ): Self = this.set("afterSelectionEndByProp", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterSelectionEndByProp: Self = this.set("afterSelectionEndByProp", js.undefined)
    @scala.inline
    def setAfterSetCellMeta(value: (/* row */ Double, /* col */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = this.set("afterSetCellMeta", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterSetCellMeta: Self = this.set("afterSetCellMeta", js.undefined)
    @scala.inline
    def setAfterSetDataAtCell(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = this.set("afterSetDataAtCell", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterSetDataAtCell: Self = this.set("afterSetDataAtCell", js.undefined)
    @scala.inline
    def setAfterSetDataAtRowProp(value: (/* changes */ js.Array[CellChange], /* source */ js.UndefOr[ChangeSource]) => Unit): Self = this.set("afterSetDataAtRowProp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterSetDataAtRowProp: Self = this.set("afterSetDataAtRowProp", js.undefined)
    @scala.inline
    def setAfterTrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterTrimRow", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterTrimRow: Self = this.set("afterTrimRow", js.undefined)
    @scala.inline
    def setAfterUndo(value: /* action */ UndoRedoAction => Unit): Self = this.set("afterUndo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterUndo: Self = this.set("afterUndo", js.undefined)
    @scala.inline
    def setAfterUnhideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterUnhideColumns", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterUnhideColumns: Self = this.set("afterUnhideColumns", js.undefined)
    @scala.inline
    def setAfterUnhideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterUnhideRows", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterUnhideRows: Self = this.set("afterUnhideRows", js.undefined)
    @scala.inline
    def setAfterUnlisten(value: () => Unit): Self = this.set("afterUnlisten", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterUnlisten: Self = this.set("afterUnlisten", js.undefined)
    @scala.inline
    def setAfterUnmergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = this.set("afterUnmergeCells", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterUnmergeCells: Self = this.set("afterUnmergeCells", js.undefined)
    @scala.inline
    def setAfterUntrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean, /* stateChanged */ Boolean) => Unit
    ): Self = this.set("afterUntrimRow", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAfterUntrimRow: Self = this.set("afterUntrimRow", js.undefined)
    @scala.inline
    def setAfterUpdateSettings(value: /* newSettings */ GridSettings => Unit): Self = this.set("afterUpdateSettings", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterUpdateSettings: Self = this.set("afterUpdateSettings", js.undefined)
    @scala.inline
    def setAfterValidate(
      value: (/* isValid */ Boolean, /* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ ChangeSource) => Unit | Boolean
    ): Self = this.set("afterValidate", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAfterValidate: Self = this.set("afterValidate", js.undefined)
    @scala.inline
    def setAfterViewportColumnCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = this.set("afterViewportColumnCalculatorOverride", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterViewportColumnCalculatorOverride: Self = this.set("afterViewportColumnCalculatorOverride", js.undefined)
    @scala.inline
    def setAfterViewportRowCalculatorOverride(value: /* calc */ ViewportColumnsCalculator => Unit): Self = this.set("afterViewportRowCalculatorOverride", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterViewportRowCalculatorOverride: Self = this.set("afterViewportRowCalculatorOverride", js.undefined)
    @scala.inline
    def setBeforeAddChild(value: (/* parent */ RowObject, /* element */ RowObject | Unit, /* index */ Double | Unit) => Unit): Self = this.set("beforeAddChild", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeAddChild: Self = this.set("beforeAddChild", js.undefined)
    @scala.inline
    def setBeforeAutofill(
      value: (/* start */ CellCoords, /* end */ CellCoords, /* data */ js.Array[js.Array[CellValue]]) => Unit
    ): Self = this.set("beforeAutofill", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeAutofill: Self = this.set("beforeAutofill", js.undefined)
    @scala.inline
    def setBeforeAutofillInsidePopulate(
      value: (/* index */ CellCoords, /* direction */ up | down | left | right, /* input */ js.Array[js.Array[CellValue]], /* deltas */ js.Array[_]) => Unit
    ): Self = this.set("beforeAutofillInsidePopulate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeAutofillInsidePopulate: Self = this.set("beforeAutofillInsidePopulate", js.undefined)
    @scala.inline
    def setBeforeCellAlignment(
      value: (/* stateBefore */ NumberDictionary[js.Array[String]], /* range */ js.Array[CellRange], /* type */ horizontal | vertical, /* alignmentClass */ htLeft | htCenter | htRight | htJustify | htTop | htMiddle | htBottom) => Unit
    ): Self = this.set("beforeCellAlignment", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeCellAlignment: Self = this.set("beforeCellAlignment", js.undefined)
    @scala.inline
    def setBeforeChange(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit | Boolean): Self = this.set("beforeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setBeforeChangeRender(value: (/* changes */ js.Array[CellChange], /* source */ ChangeSource) => Unit): Self = this.set("beforeChangeRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeChangeRender: Self = this.set("beforeChangeRender", js.undefined)
    @scala.inline
    def setBeforeColumnMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit | Boolean): Self = this.set("beforeColumnMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeColumnMove: Self = this.set("beforeColumnMove", js.undefined)
    @scala.inline
    def setBeforeColumnResize(
      value: (/* currentColumn */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Unit | Double
    ): Self = this.set("beforeColumnResize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeColumnResize: Self = this.set("beforeColumnResize", js.undefined)
    @scala.inline
    def setBeforeColumnSort(
      value: (/* currentSortConfig */ js.Array[Config], /* destinationSortConfigs */ js.Array[Config]) => Unit | Boolean
    ): Self = this.set("beforeColumnSort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeColumnSort: Self = this.set("beforeColumnSort", js.undefined)
    @scala.inline
    def setBeforeContextMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = this.set("beforeContextMenuSetItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeContextMenuSetItems: Self = this.set("beforeContextMenuSetItems", js.undefined)
    @scala.inline
    def setBeforeContextMenuShow(value: /* context */ ContextMenu => Unit): Self = this.set("beforeContextMenuShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeContextMenuShow: Self = this.set("beforeContextMenuShow", js.undefined)
    @scala.inline
    def setBeforeCopy(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = this.set("beforeCopy", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeCopy: Self = this.set("beforeCopy", js.undefined)
    @scala.inline
    def setBeforeCreateCol(
      value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit | Boolean
    ): Self = this.set("beforeCreateCol", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeCreateCol: Self = this.set("beforeCreateCol", js.undefined)
    @scala.inline
    def setBeforeCreateRow(value: (/* index */ Double, /* amount */ Double, /* source */ js.UndefOr[ChangeSource]) => Unit): Self = this.set("beforeCreateRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeCreateRow: Self = this.set("beforeCreateRow", js.undefined)
    @scala.inline
    def setBeforeCut(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = this.set("beforeCut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeCut: Self = this.set("beforeCut", js.undefined)
    @scala.inline
    def setBeforeDetachChild(value: (/* parent */ RowObject, /* element */ RowObject) => Unit): Self = this.set("beforeDetachChild", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeDetachChild: Self = this.set("beforeDetachChild", js.undefined)
    @scala.inline
    def setBeforeDrawBorders(
      value: (/* corners */ js.Array[Double], /* borderClassName */ js.UndefOr[current | area | highlight]) => Unit
    ): Self = this.set("beforeDrawBorders", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeDrawBorders: Self = this.set("beforeDrawBorders", js.undefined)
    @scala.inline
    def setBeforeDropdownMenuSetItems(value: /* menuItems */ js.Array[MenuItemConfig] => Unit): Self = this.set("beforeDropdownMenuSetItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDropdownMenuSetItems: Self = this.set("beforeDropdownMenuSetItems", js.undefined)
    @scala.inline
    def setBeforeDropdownMenuShow(value: /* instance */ DropdownMenu => Unit): Self = this.set("beforeDropdownMenuShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDropdownMenuShow: Self = this.set("beforeDropdownMenuShow", js.undefined)
    @scala.inline
    def setBeforeFilter(value: /* conditionsStack */ js.Array[ColumnConditions] => Unit | Boolean): Self = this.set("beforeFilter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeFilter: Self = this.set("beforeFilter", js.undefined)
    @scala.inline
    def setBeforeGetCellMeta(value: (/* row */ Double, /* col */ Double, /* cellProperties */ CellProperties) => Unit): Self = this.set("beforeGetCellMeta", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeGetCellMeta: Self = this.set("beforeGetCellMeta", js.undefined)
    @scala.inline
    def setBeforeHideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeHideColumns", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeHideColumns: Self = this.set("beforeHideColumns", js.undefined)
    @scala.inline
    def setBeforeHideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeHideRows", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeHideRows: Self = this.set("beforeHideRows", js.undefined)
    @scala.inline
    def setBeforeInit(value: () => Unit): Self = this.set("beforeInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    @scala.inline
    def setBeforeInitWalkontable(value: /* walkontableConfig */ js.Object => Unit): Self = this.set("beforeInitWalkontable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeInitWalkontable: Self = this.set("beforeInitWalkontable", js.undefined)
    @scala.inline
    def setBeforeKeyDown(value: /* event */ KeyboardEvent => Unit): Self = this.set("beforeKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeKeyDown: Self = this.set("beforeKeyDown", js.undefined)
    @scala.inline
    def setBeforeLanguageChange(value: /* languageCode */ String => Unit): Self = this.set("beforeLanguageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeLanguageChange: Self = this.set("beforeLanguageChange", js.undefined)
    @scala.inline
    def setBeforeMergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = this.set("beforeMergeCells", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeMergeCells: Self = this.set("beforeMergeCells", js.undefined)
    @scala.inline
    def setBeforeOnCellContextMenu(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("beforeOnCellContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeOnCellContextMenu: Self = this.set("beforeOnCellContextMenu", js.undefined)
    @scala.inline
    def setBeforeOnCellMouseDown(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = this.set("beforeOnCellMouseDown", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeOnCellMouseDown: Self = this.set("beforeOnCellMouseDown", js.undefined)
    @scala.inline
    def setBeforeOnCellMouseOut(value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement) => Unit): Self = this.set("beforeOnCellMouseOut", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeOnCellMouseOut: Self = this.set("beforeOnCellMouseOut", js.undefined)
    @scala.inline
    def setBeforeOnCellMouseOver(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = this.set("beforeOnCellMouseOver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeOnCellMouseOver: Self = this.set("beforeOnCellMouseOver", js.undefined)
    @scala.inline
    def setBeforeOnCellMouseUp(
      value: (/* event */ MouseEvent, /* coords */ CellCoords, /* TD */ HTMLTableCellElement, /* controller */ SelectionController) => Unit
    ): Self = this.set("beforeOnCellMouseUp", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeOnCellMouseUp: Self = this.set("beforeOnCellMouseUp", js.undefined)
    @scala.inline
    def setBeforePaste(
      value: (/* data */ js.Array[js.Array[CellValue]], /* coords */ js.Array[RangeType]) => Unit | Boolean
    ): Self = this.set("beforePaste", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforePaste: Self = this.set("beforePaste", js.undefined)
    @scala.inline
    def setBeforeRedo(value: /* action */ UndoRedoAction => Unit): Self = this.set("beforeRedo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeRedo: Self = this.set("beforeRedo", js.undefined)
    @scala.inline
    def setBeforeRefreshDimensions(
      value: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ Boolean) => Boolean | Unit
    ): Self = this.set("beforeRefreshDimensions", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRefreshDimensions: Self = this.set("beforeRefreshDimensions", js.undefined)
    @scala.inline
    def setBeforeRemoveCellClassNames(value: () => js.Array[String] | Unit): Self = this.set("beforeRemoveCellClassNames", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeRemoveCellClassNames: Self = this.set("beforeRemoveCellClassNames", js.undefined)
    @scala.inline
    def setBeforeRemoveCellMeta(value: (/* row */ Double, /* column */ Double, /* key */ String, /* value */ js.Any) => Unit): Self = this.set("beforeRemoveCellMeta", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeRemoveCellMeta: Self = this.set("beforeRemoveCellMeta", js.undefined)
    @scala.inline
    def setBeforeRemoveCol(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = this.set("beforeRemoveCol", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeRemoveCol: Self = this.set("beforeRemoveCol", js.undefined)
    @scala.inline
    def setBeforeRemoveRow(
      value: (/* index */ Double, /* amount */ Double, /* physicalColumns */ js.Array[Double], /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = this.set("beforeRemoveRow", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeRemoveRow: Self = this.set("beforeRemoveRow", js.undefined)
    @scala.inline
    def setBeforeRender(value: (/* isForced */ Boolean, /* skipRender */ SkipRender) => Unit): Self = this.set("beforeRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeRender: Self = this.set("beforeRender", js.undefined)
    @scala.inline
    def setBeforeRenderer(
      value: (/* TD */ HTMLTableCellElement, /* row */ Double, /* col */ Double, /* prop */ String | Double, /* value */ CellValue, /* cellProperties */ CellProperties) => Unit
    ): Self = this.set("beforeRenderer", js.Any.fromFunction6(value))
    @scala.inline
    def deleteBeforeRenderer: Self = this.set("beforeRenderer", js.undefined)
    @scala.inline
    def setBeforeRowMove(value: (/* columns */ js.Array[Double], /* target */ Double) => Unit): Self = this.set("beforeRowMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeRowMove: Self = this.set("beforeRowMove", js.undefined)
    @scala.inline
    def setBeforeRowResize(
      value: (/* currentRow */ Double, /* newSize */ Double, /* isDoubleClick */ Boolean) => Double | Unit
    ): Self = this.set("beforeRowResize", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeRowResize: Self = this.set("beforeRowResize", js.undefined)
    @scala.inline
    def setBeforeSetRangeEnd(value: /* coords */ CellCoords => Unit): Self = this.set("beforeSetRangeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSetRangeEnd: Self = this.set("beforeSetRangeEnd", js.undefined)
    @scala.inline
    def setBeforeSetRangeStart(value: /* coords */ CellCoords => Unit): Self = this.set("beforeSetRangeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSetRangeStart: Self = this.set("beforeSetRangeStart", js.undefined)
    @scala.inline
    def setBeforeSetRangeStartOnly(value: /* coords */ CellCoords => Unit): Self = this.set("beforeSetRangeStartOnly", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSetRangeStartOnly: Self = this.set("beforeSetRangeStartOnly", js.undefined)
    @scala.inline
    def setBeforeStretchingColumnWidth(value: (/* stretchedWidth */ Double, /* column */ Double) => Unit | Double): Self = this.set("beforeStretchingColumnWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeStretchingColumnWidth: Self = this.set("beforeStretchingColumnWidth", js.undefined)
    @scala.inline
    def setBeforeTouchScroll(value: () => Unit): Self = this.set("beforeTouchScroll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeTouchScroll: Self = this.set("beforeTouchScroll", js.undefined)
    @scala.inline
    def setBeforeTrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeTrimRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeTrimRow: Self = this.set("beforeTrimRow", js.undefined)
    @scala.inline
    def setBeforeUndo(value: /* action */ UndoRedoAction => Unit): Self = this.set("beforeUndo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeUndo: Self = this.set("beforeUndo", js.undefined)
    @scala.inline
    def setBeforeUnhideColumns(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeUnhideColumns", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeUnhideColumns: Self = this.set("beforeUnhideColumns", js.undefined)
    @scala.inline
    def setBeforeUnhideRows(
      value: (/* currentHideConfig */ js.Array[Double], /* destinationHideConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeUnhideRows", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeUnhideRows: Self = this.set("beforeUnhideRows", js.undefined)
    @scala.inline
    def setBeforeUnmergeCells(value: (/* cellRange */ CellRange, /* auto */ Boolean) => Unit): Self = this.set("beforeUnmergeCells", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeUnmergeCells: Self = this.set("beforeUnmergeCells", js.undefined)
    @scala.inline
    def setBeforeUntrimRow(
      value: (/* currentTrimConfig */ js.Array[Double], /* destinationTrimConfig */ js.Array[Double], /* actionPossible */ Boolean) => Unit
    ): Self = this.set("beforeUntrimRow", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeUntrimRow: Self = this.set("beforeUntrimRow", js.undefined)
    @scala.inline
    def setBeforeValidate(
      value: (/* value */ CellValue, /* row */ Double, /* prop */ String | Double, /* source */ js.UndefOr[ChangeSource]) => Unit
    ): Self = this.set("beforeValidate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeValidate: Self = this.set("beforeValidate", js.undefined)
    @scala.inline
    def setBeforeValueRender(value: (/* value */ CellValue, /* cellProperties */ CellProperties) => Unit): Self = this.set("beforeValueRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeValueRender: Self = this.set("beforeValueRender", js.undefined)
    @scala.inline
    def setConstruct(value: () => Unit): Self = this.set("construct", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConstruct: Self = this.set("construct", js.undefined)
    @scala.inline
    def setHiddenColumn(value: /* column */ Double => Unit): Self = this.set("hiddenColumn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHiddenColumn: Self = this.set("hiddenColumn", js.undefined)
    @scala.inline
    def setHiddenRow(value: /* row */ Double => Unit): Self = this.set("hiddenRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHiddenRow: Self = this.set("hiddenRow", js.undefined)
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setModifyAutofillRange(
      value: (/* startArea */ js.Array[js.Tuple4[Double, Double, Double, Double]], /* entireArea */ js.Array[js.Tuple4[Double, Double, Double, Double]]) => Unit
    ): Self = this.set("modifyAutofillRange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModifyAutofillRange: Self = this.set("modifyAutofillRange", js.undefined)
    @scala.inline
    def setModifyCol(value: /* col */ Double => Unit): Self = this.set("modifyCol", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyCol: Self = this.set("modifyCol", js.undefined)
    @scala.inline
    def setModifyColHeader(value: /* column */ Double => Unit): Self = this.set("modifyColHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyColHeader: Self = this.set("modifyColHeader", js.undefined)
    @scala.inline
    def setModifyColWidth(value: (/* width */ Double, /* col */ Double) => Unit): Self = this.set("modifyColWidth", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModifyColWidth: Self = this.set("modifyColWidth", js.undefined)
    @scala.inline
    def setModifyColumnHeaderHeight(value: () => Unit): Self = this.set("modifyColumnHeaderHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteModifyColumnHeaderHeight: Self = this.set("modifyColumnHeaderHeight", js.undefined)
    @scala.inline
    def setModifyCopyableRange(value: /* copyableRanges */ js.Array[RangeType] => Unit): Self = this.set("modifyCopyableRange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyCopyableRange: Self = this.set("modifyCopyableRange", js.undefined)
    @scala.inline
    def setModifyData(
      value: (/* row */ Double, /* column */ Double, /* valueHolder */ ValueCellValue, /* ioMode */ get | set) => Unit
    ): Self = this.set("modifyData", js.Any.fromFunction4(value))
    @scala.inline
    def deleteModifyData: Self = this.set("modifyData", js.undefined)
    @scala.inline
    def setModifyGetCellCoords(
      value: (/* row */ Double, /* column */ Double, /* topmost */ Boolean) => Unit | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ): Self = this.set("modifyGetCellCoords", js.Any.fromFunction3(value))
    @scala.inline
    def deleteModifyGetCellCoords: Self = this.set("modifyGetCellCoords", js.undefined)
    @scala.inline
    def setModifyRow(value: /* row */ Double => Unit): Self = this.set("modifyRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRow: Self = this.set("modifyRow", js.undefined)
    @scala.inline
    def setModifyRowData(value: /* row */ Double => Unit): Self = this.set("modifyRowData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRowData: Self = this.set("modifyRowData", js.undefined)
    @scala.inline
    def setModifyRowHeader(value: /* row */ Double => Unit): Self = this.set("modifyRowHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRowHeader: Self = this.set("modifyRowHeader", js.undefined)
    @scala.inline
    def setModifyRowHeaderWidth(value: /* rowHeaderWidth */ Double => Unit): Self = this.set("modifyRowHeaderWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRowHeaderWidth: Self = this.set("modifyRowHeaderWidth", js.undefined)
    @scala.inline
    def setModifyRowHeight(value: (/* height */ Double, /* row */ Double) => Unit): Self = this.set("modifyRowHeight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteModifyRowHeight: Self = this.set("modifyRowHeight", js.undefined)
    @scala.inline
    def setModifyRowSourceData(value: /* row */ Double => Unit): Self = this.set("modifyRowSourceData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyRowSourceData: Self = this.set("modifyRowSourceData", js.undefined)
    @scala.inline
    def setModifyTransformEnd(value: /* delta */ CellCoords => Unit): Self = this.set("modifyTransformEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyTransformEnd: Self = this.set("modifyTransformEnd", js.undefined)
    @scala.inline
    def setModifyTransformStart(value: /* delta */ CellCoords => Unit): Self = this.set("modifyTransformStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModifyTransformStart: Self = this.set("modifyTransformStart", js.undefined)
    @scala.inline
    def setPersistentStateLoad(value: (/* key */ String, /* valuePlaceholder */ ValueAny) => Unit): Self = this.set("persistentStateLoad", js.Any.fromFunction2(value))
    @scala.inline
    def deletePersistentStateLoad: Self = this.set("persistentStateLoad", js.undefined)
    @scala.inline
    def setPersistentStateReset(value: /* key */ String => Unit): Self = this.set("persistentStateReset", js.Any.fromFunction1(value))
    @scala.inline
    def deletePersistentStateReset: Self = this.set("persistentStateReset", js.undefined)
    @scala.inline
    def setPersistentStateSave(value: (/* key */ String, /* value */ js.Any) => Unit): Self = this.set("persistentStateSave", js.Any.fromFunction2(value))
    @scala.inline
    def deletePersistentStateSave: Self = this.set("persistentStateSave", js.undefined)
    @scala.inline
    def setSkipLengthCache(value: /* delay */ Double => Unit): Self = this.set("skipLengthCache", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkipLengthCache: Self = this.set("skipLengthCache", js.undefined)
    @scala.inline
    def setUnmodifyCol(value: /* col */ Double => Unit): Self = this.set("unmodifyCol", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnmodifyCol: Self = this.set("unmodifyCol", js.undefined)
    @scala.inline
    def setUnmodifyRow(value: /* row */ Double => Unit): Self = this.set("unmodifyRow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnmodifyRow: Self = this.set("unmodifyRow", js.undefined)
  }
  
}

