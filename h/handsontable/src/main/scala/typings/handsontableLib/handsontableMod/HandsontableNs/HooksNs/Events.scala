package typings
package handsontableLib.handsontableMod.HandsontableNs.HooksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ]
  ] = js.undefined
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  var afterCellMetaReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterChange: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange] | scala.Null, 
      /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource, 
      scala.Unit
    ]
  ] = js.undefined
  var afterChangesObserved: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[scala.Double], /* target */ scala.Double, scala.Unit]
  ] = js.undefined
  var afterColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], 
      /* destinationSortConfigs */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], 
      scala.Unit
    ]
  ] = js.undefined
  var afterContextMenuDefaultOptions: js.UndefOr[
    js.Function1[
      /* predefinedItems */ js.Array[
        handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var afterContextMenuHide: js.UndefOr[
    js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var afterContextMenuShow: js.UndefOr[
    js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var afterCopy: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit
    ]
  ] = js.undefined
  var afterCopyLimit: js.UndefOr[
    js.Function4[
      /* selectedRows */ scala.Double, 
      /* selectedColumnds */ scala.Double, 
      /* copyRowsLimit */ scala.Double, 
      /* copyColumnsLimit */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterCreateCol: js.UndefOr[js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit]] = js.undefined
  var afterCreateRow: js.UndefOr[js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit]] = js.undefined
  var afterCut: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit
    ]
  ] = js.undefined
  var afterDeselect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterDestroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterDetachChild: js.UndefOr[
    js.Function2[
      /* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      scala.Unit
    ]
  ] = js.undefined
  var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  var afterDrawSelection: js.UndefOr[
    js.Function4[
      /* currentRow */ scala.Double, 
      /* currentColumn */ scala.Double, 
      /* cornersOfSelection */ js.Array[scala.Double], 
      /* layerLevel */ scala.Double | scala.Unit, 
      java.lang.String | scala.Unit
    ]
  ] = js.undefined
  var afterDropdownMenuDefaultOptions: js.UndefOr[
    js.Function1[
      /* predefinedItems */ js.Array[
        handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var afterDropdownMenuHide: js.UndefOr[
    js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var afterDropdownMenuShow: js.UndefOr[
    js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var afterFilter: js.UndefOr[
    js.Function1[
      /* conditionsStack */ js.Array[
        handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var afterGetCellMeta: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties, 
      scala.Unit
    ]
  ] = js.undefined
  var afterGetColHeader: js.UndefOr[
    js.Function2[/* col */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
  ] = js.undefined
  var afterGetColumnHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[
        js.Function2[/* col */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var afterGetRowHeader: js.UndefOr[
    js.Function2[/* row */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
  ] = js.undefined
  var afterGetRowHeaderRenderers: js.UndefOr[
    js.Function1[
      /* renderers */ js.Array[
        js.Function2[/* row */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var afterHideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterHideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ java.lang.String, scala.Unit]] = js.undefined
  var afterListen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterLoadData: js.UndefOr[js.Function1[/* initialLoad */ scala.Boolean, scala.Unit]] = js.undefined
  var afterMergeCells: js.UndefOr[
    js.Function3[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* mergeParent */ handsontableLib.handsontableMod.HandsontableNs.mergeCellsNs.Settings, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, 
      /* colTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, 
      scala.Unit
    ]
  ] = js.undefined
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, 
      /* colTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, 
      scala.Unit
    ]
  ] = js.undefined
  var afterMomentumScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var afterPaste: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit
    ]
  ] = js.undefined
  var afterPluginsInitialized: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterRedo: js.UndefOr[
    js.Function1[
      /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction, 
      scala.Unit
    ]
  ] = js.undefined
  var afterRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterRemoveCellMeta: js.UndefOr[
    js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var afterRemoveCol: js.UndefOr[js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit]] = js.undefined
  var afterRemoveRow: js.UndefOr[js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit]] = js.undefined
  var afterRender: js.UndefOr[js.Function1[/* isForced */ scala.Boolean, scala.Unit]] = js.undefined
  var afterRenderer: js.UndefOr[
    js.Function6[
      /* TD */ stdLib.HTMLTableCellElement, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ java.lang.String, 
      /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties, 
      scala.Unit
    ]
  ] = js.undefined
  var afterRowMove: js.UndefOr[js.Function2[/* startRow */ scala.Double, /* endRow */ scala.Double, scala.Unit]] = js.undefined
  var afterRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterScrollHorizontally: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterScrollVertically: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterSelection: js.UndefOr[
    js.Function6[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* row2 */ scala.Double, 
      /* column2 */ scala.Double, 
      /* preventScrolling */ handsontableLib.Anon_Value, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionByProp: js.UndefOr[
    js.Function6[
      /* row */ scala.Double, 
      /* prop */ java.lang.String, 
      /* row2 */ scala.Double, 
      /* prop2 */ java.lang.String, 
      /* preventScrolling */ handsontableLib.Anon_Value, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionEnd: js.UndefOr[
    js.Function5[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* row2 */ scala.Double, 
      /* column2 */ scala.Double, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionEndByProp: js.UndefOr[
    js.Function5[
      /* row */ scala.Double, 
      /* prop */ java.lang.String, 
      /* row2 */ scala.Double, 
      /* prop2 */ java.lang.String, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSetCellMeta: js.UndefOr[
    js.Function4[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSetDataAtCell: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var afterTrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[scala.Double], 
      /* destinationTrimConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUndo: js.UndefOr[
    js.Function1[
      /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUnhideColumns: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUnhideRows: js.UndefOr[
    js.Function4[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUnlisten: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterUnmergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUntrimRow: js.UndefOr[
    js.Function4[
      /* currentTrimConfig */ js.Array[scala.Double], 
      /* destinationTrimConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      /* stateChanged */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUpdateSettings: js.UndefOr[
    js.Function1[
      /* newSettings */ handsontableLib.handsontableMod.HandsontableNs.GridSettings, 
      scala.Unit
    ]
  ] = js.undefined
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ scala.Boolean, 
      /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var afterViewportColumnCalculatorOverride: js.UndefOr[
    js.Function1[
      /* calc */ handsontableLib.handsontableMod.HandsontableNs.ViewportColumnsCalculator, 
      scala.Unit
    ]
  ] = js.undefined
  var afterViewportRowCalculatorOverride: js.UndefOr[
    js.Function1[
      /* calc */ handsontableLib.handsontableMod.HandsontableNs.ViewportColumnsCalculator, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeAutofill: js.UndefOr[
    js.Function3[
      /* start */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* end */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* direction */ handsontableLib.handsontableLibStrings.up | handsontableLib.handsontableLibStrings.down | handsontableLib.handsontableLibStrings.left | handsontableLib.handsontableLibStrings.right, 
      /* input */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* deltas */ js.Array[_], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]], 
      /* range */ js.Array[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange], 
      /* type */ handsontableLib.handsontableLibStrings.horizontal | handsontableLib.handsontableLibStrings.vertical, 
      /* alignmentClass */ handsontableLib.handsontableLibStrings.htLeft | handsontableLib.handsontableLibStrings.htCenter | handsontableLib.handsontableLibStrings.htRight | handsontableLib.handsontableLibStrings.htJustify | handsontableLib.handsontableLibStrings.htTop | handsontableLib.handsontableLibStrings.htMiddle | handsontableLib.handsontableLibStrings.htBottom, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeChange: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], 
      /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeChangeRender: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], 
      /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeColumnMove: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[scala.Double], 
      /* target */ scala.Double, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit | scala.Double
    ]
  ] = js.undefined
  var beforeColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], 
      /* destinationSortConfigs */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeContextMenuSetItems: js.UndefOr[
    js.Function1[
      /* menuItems */ js.Array[handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeContextMenuShow: js.UndefOr[
    js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCopy: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeCreateCol: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeCreateRow: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCut: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeDetachChild: js.UndefOr[
    js.Function2[
      /* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeDrawBorders: js.UndefOr[
    js.Function2[
      /* corners */ js.Array[scala.Double], 
      /* borderClassName */ js.UndefOr[
        handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.highlight
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeDropdownMenuSetItems: js.UndefOr[
    js.Function1[
      /* menuItems */ js.Array[handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeDropdownMenuShow: js.UndefOr[
    js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeFilter: js.UndefOr[
    js.Function1[
      /* conditionsStack */ js.Array[
        handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
      ], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeHideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeHideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, scala.Unit]] = js.undefined
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ java.lang.String, scala.Unit]] = js.undefined
  var beforeMergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.HTMLTableCellElement, 
      /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController, 
      scala.Unit
    ]
  ] = js.undefined
  var beforePaste: js.UndefOr[
    js.Function2[
      /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], 
      /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var beforeRedo: js.UndefOr[
    js.Function1[
      /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRefreshDimensions: js.UndefOr[
    js.Function3[
      /* previousDimensions */ js.Object, 
      /* currentDimensions */ js.Object, 
      /* actionPossible */ scala.Boolean, 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  var beforeRemoveCellClassNames: js.UndefOr[js.Function0[js.Array[java.lang.String] | scala.Unit]] = js.undefined
  var beforeRemoveCellMeta: js.UndefOr[
    js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRemoveCol: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* physicalColumns */ js.Array[scala.Double], 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRemoveRow: js.UndefOr[
    js.Function4[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* physicalColumns */ js.Array[scala.Double], 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRender: js.UndefOr[
    js.Function2[
      /* isForced */ scala.Boolean, 
      /* skipRender */ handsontableLib.Anon_SkipRender, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRenderer: js.UndefOr[
    js.Function6[
      /* TD */ stdLib.HTMLTableCellElement, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, 
      /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRowMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[scala.Double], /* target */ scala.Double, scala.Unit]
  ] = js.undefined
  var beforeRowResize: js.UndefOr[
    js.Function3[
      /* currentRow */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Double | scala.Unit
    ]
  ] = js.undefined
  var beforeSetRangeEnd: js.UndefOr[
    js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeSetRangeStart: js.UndefOr[
    js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeSetRangeStartOnly: js.UndefOr[
    js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeStretchingColumnWidth: js.UndefOr[
    js.Function2[
      /* stretchedWidth */ scala.Double, 
      /* column */ scala.Double, 
      scala.Unit | scala.Double
    ]
  ] = js.undefined
  var beforeTouchScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeTrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[scala.Double], 
      /* destinationTrimConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUndo: js.UndefOr[
    js.Function1[
      /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUnhideColumns: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUnhideRows: js.UndefOr[
    js.Function3[
      /* currentHideConfig */ js.Array[scala.Double], 
      /* destinationHideConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUnmergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeUntrimRow: js.UndefOr[
    js.Function3[
      /* currentTrimConfig */ js.Array[scala.Double], 
      /* destinationTrimConfig */ js.Array[scala.Double], 
      /* actionPossible */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    js.Function4[
      /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeValueRender: js.UndefOr[
    js.Function2[
      /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, 
      /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties, 
      scala.Unit
    ]
  ] = js.undefined
  var construct: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ scala.Double, scala.Unit]] = js.undefined
  var hiddenRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var modifyAutofillRange: js.UndefOr[
    js.Function2[
      /* startArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]], 
      /* entireArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]], 
      scala.Unit
    ]
  ] = js.undefined
  var modifyCol: js.UndefOr[js.Function1[/* col */ scala.Double, scala.Unit]] = js.undefined
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ scala.Double, scala.Unit]] = js.undefined
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ scala.Double, /* col */ scala.Double, scala.Unit]] = js.undefined
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var modifyCopyableRange: js.UndefOr[
    js.Function1[
      /* copyableRanges */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType], 
      scala.Unit
    ]
  ] = js.undefined
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* valueHolder */ handsontableLib.Anon_ValueCellValue, 
      /* ioMode */ handsontableLib.handsontableLibStrings.get | handsontableLib.handsontableLibStrings.set, 
      scala.Unit
    ]
  ] = js.undefined
  var modifyGetCellCoords: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* topmost */ scala.Boolean, 
      scala.Unit | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
    ]
  ] = js.undefined
  var modifyRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var modifyRowData: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var modifyRowHeader: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var modifyRowHeaderWidth: js.UndefOr[js.Function1[/* rowHeaderWidth */ scala.Double, scala.Unit]] = js.undefined
  var modifyRowHeight: js.UndefOr[js.Function2[/* height */ scala.Double, /* row */ scala.Double, scala.Unit]] = js.undefined
  var modifyRowSourceData: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var modifyTransformEnd: js.UndefOr[
    js.Function1[
      /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ]
  ] = js.undefined
  var modifyTransformStart: js.UndefOr[
    js.Function1[
      /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ]
  ] = js.undefined
  var persistentStateLoad: js.UndefOr[
    js.Function2[
      /* key */ java.lang.String, 
      /* valuePlaceholder */ handsontableLib.Anon_ValueAny, 
      scala.Unit
    ]
  ] = js.undefined
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Unit]] = js.undefined
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]] = js.undefined
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ scala.Double, scala.Unit]] = js.undefined
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ scala.Double, scala.Unit]] = js.undefined
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    afterAddChild: (/* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject | scala.Unit, /* index */ scala.Double | scala.Unit) => scala.Unit = null,
    afterBeginEditing: (/* row */ scala.Double, /* column */ scala.Double) => scala.Unit = null,
    afterCellMetaReset: () => scala.Unit = null,
    afterChange: (/* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange] | scala.Null, /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource) => scala.Unit = null,
    afterChangesObserved: () => scala.Unit = null,
    afterColumnMove: (/* columns */ js.Array[scala.Double], /* target */ scala.Double) => scala.Unit = null,
    afterColumnResize: (/* currentColumn */ scala.Double, /* newSize */ scala.Double, /* isDoubleClick */ scala.Boolean) => scala.Unit = null,
    afterColumnSort: (/* currentSortConfig */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], /* destinationSortConfigs */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config]) => scala.Unit = null,
    afterContextMenuDefaultOptions: /* predefinedItems */ js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig
    ] => scala.Unit = null,
    afterContextMenuHide: /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu => scala.Unit = null,
    afterContextMenuShow: /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu => scala.Unit = null,
    afterCopy: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit = null,
    afterCopyLimit: (/* selectedRows */ scala.Double, /* selectedColumnds */ scala.Double, /* copyRowsLimit */ scala.Double, /* copyColumnsLimit */ scala.Double) => scala.Unit = null,
    afterCreateCol: (/* index */ scala.Double, /* amount */ scala.Double) => scala.Unit = null,
    afterCreateRow: (/* index */ scala.Double, /* amount */ scala.Double) => scala.Unit = null,
    afterCut: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit = null,
    afterDeselect: () => scala.Unit = null,
    afterDestroy: () => scala.Unit = null,
    afterDetachChild: (/* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject) => scala.Unit = null,
    afterDocumentKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    afterDrawSelection: (/* currentRow */ scala.Double, /* currentColumn */ scala.Double, /* cornersOfSelection */ js.Array[scala.Double], /* layerLevel */ scala.Double | scala.Unit) => java.lang.String | scala.Unit = null,
    afterDropdownMenuDefaultOptions: /* predefinedItems */ js.Array[
      handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.PredefinedMenuItemKey | handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig
    ] => scala.Unit = null,
    afterDropdownMenuHide: /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu => scala.Unit = null,
    afterDropdownMenuShow: /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu => scala.Unit = null,
    afterFilter: /* conditionsStack */ js.Array[
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
    ] => scala.Unit = null,
    afterGetCellMeta: (/* row */ scala.Double, /* col */ scala.Double, /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties) => scala.Unit = null,
    afterGetColHeader: (/* col */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement) => scala.Unit = null,
    afterGetColumnHeaderRenderers: /* renderers */ js.Array[
      js.Function2[/* col */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
    ] => scala.Unit = null,
    afterGetRowHeader: (/* row */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement) => scala.Unit = null,
    afterGetRowHeaderRenderers: /* renderers */ js.Array[
      js.Function2[/* row */ scala.Double, /* TH */ stdLib.HTMLTableHeaderCellElement, scala.Unit]
    ] => scala.Unit = null,
    afterHideColumns: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterHideRows: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterInit: () => scala.Unit = null,
    afterLanguageChange: /* languageCode */ java.lang.String => scala.Unit = null,
    afterListen: () => scala.Unit = null,
    afterLoadData: /* initialLoad */ scala.Boolean => scala.Unit = null,
    afterMergeCells: (/* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, /* mergeParent */ handsontableLib.handsontableMod.HandsontableNs.mergeCellsNs.Settings, /* auto */ scala.Boolean) => scala.Unit = null,
    afterModifyTransformEnd: (/* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* rowTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, /* colTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`) => scala.Unit = null,
    afterModifyTransformStart: (/* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* rowTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`, /* colTransformDir */ handsontableLib.handsontableLibNumbers.`-1` | handsontableLib.handsontableLibNumbers.`0`) => scala.Unit = null,
    afterMomentumScroll: () => scala.Unit = null,
    afterOnCellContextMenu: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    afterOnCellCornerDblClick: /* event */ stdLib.MouseEvent => scala.Unit = null,
    afterOnCellCornerMouseDown: /* event */ stdLib.MouseEvent => scala.Unit = null,
    afterOnCellMouseDown: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    afterOnCellMouseOut: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    afterOnCellMouseOver: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    afterOnCellMouseUp: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    afterPaste: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit = null,
    afterPluginsInitialized: () => scala.Unit = null,
    afterRedo: /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction => scala.Unit = null,
    afterRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterRemoveCellMeta: (/* row */ scala.Double, /* column */ scala.Double, /* key */ java.lang.String, /* value */ js.Any) => scala.Unit = null,
    afterRemoveCol: (/* index */ scala.Double, /* amount */ scala.Double) => scala.Unit = null,
    afterRemoveRow: (/* index */ scala.Double, /* amount */ scala.Double) => scala.Unit = null,
    afterRender: /* isForced */ scala.Boolean => scala.Unit = null,
    afterRenderer: (/* TD */ stdLib.HTMLTableCellElement, /* row */ scala.Double, /* col */ scala.Double, /* prop */ java.lang.String | scala.Double, /* value */ java.lang.String, /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties) => scala.Unit = null,
    afterRowMove: (/* startRow */ scala.Double, /* endRow */ scala.Double) => scala.Unit = null,
    afterRowResize: (/* currentRow */ scala.Double, /* newSize */ scala.Double, /* isDoubleClick */ scala.Boolean) => scala.Unit = null,
    afterScrollHorizontally: () => scala.Unit = null,
    afterScrollVertically: () => scala.Unit = null,
    afterSelection: (/* row */ scala.Double, /* column */ scala.Double, /* row2 */ scala.Double, /* column2 */ scala.Double, /* preventScrolling */ handsontableLib.Anon_Value, /* selectionLayerLevel */ scala.Double) => scala.Unit = null,
    afterSelectionByProp: (/* row */ scala.Double, /* prop */ java.lang.String, /* row2 */ scala.Double, /* prop2 */ java.lang.String, /* preventScrolling */ handsontableLib.Anon_Value, /* selectionLayerLevel */ scala.Double) => scala.Unit = null,
    afterSelectionEnd: (/* row */ scala.Double, /* column */ scala.Double, /* row2 */ scala.Double, /* column2 */ scala.Double, /* selectionLayerLevel */ scala.Double) => scala.Unit = null,
    afterSelectionEndByProp: (/* row */ scala.Double, /* prop */ java.lang.String, /* row2 */ scala.Double, /* prop2 */ java.lang.String, /* selectionLayerLevel */ scala.Double) => scala.Unit = null,
    afterSetCellMeta: (/* row */ scala.Double, /* col */ scala.Double, /* key */ java.lang.String, /* value */ js.Any) => scala.Unit = null,
    afterSetDataAtCell: (/* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    afterSetDataAtRowProp: (/* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    afterTrimRow: (/* currentTrimConfig */ js.Array[scala.Double], /* destinationTrimConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterUndo: /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction => scala.Unit = null,
    afterUnhideColumns: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterUnhideRows: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterUnlisten: () => scala.Unit = null,
    afterUnmergeCells: (/* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, /* auto */ scala.Boolean) => scala.Unit = null,
    afterUntrimRow: (/* currentTrimConfig */ js.Array[scala.Double], /* destinationTrimConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean, /* stateChanged */ scala.Boolean) => scala.Unit = null,
    afterUpdateSettings: /* newSettings */ handsontableLib.handsontableMod.HandsontableNs.GridSettings => scala.Unit = null,
    afterValidate: (/* isValid */ scala.Boolean, /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, /* row */ scala.Double, /* prop */ java.lang.String | scala.Double, /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource) => scala.Unit | scala.Boolean = null,
    afterViewportColumnCalculatorOverride: /* calc */ handsontableLib.handsontableMod.HandsontableNs.ViewportColumnsCalculator => scala.Unit = null,
    afterViewportRowCalculatorOverride: /* calc */ handsontableLib.handsontableMod.HandsontableNs.ViewportColumnsCalculator => scala.Unit = null,
    beforeAddChild: (/* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject | scala.Unit, /* index */ scala.Double | scala.Unit) => scala.Unit = null,
    beforeAutofill: (/* start */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* end */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]]) => scala.Unit = null,
    beforeAutofillInsidePopulate: (/* index */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* direction */ handsontableLib.handsontableLibStrings.up | handsontableLib.handsontableLibStrings.down | handsontableLib.handsontableLibStrings.left | handsontableLib.handsontableLibStrings.right, /* input */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* deltas */ js.Array[_]) => scala.Unit = null,
    beforeCellAlignment: (/* stateBefore */ org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]], /* range */ js.Array[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange], /* type */ handsontableLib.handsontableLibStrings.horizontal | handsontableLib.handsontableLibStrings.vertical, /* alignmentClass */ handsontableLib.handsontableLibStrings.htLeft | handsontableLib.handsontableLibStrings.htCenter | handsontableLib.handsontableLibStrings.htRight | handsontableLib.handsontableLibStrings.htJustify | handsontableLib.handsontableLibStrings.htTop | handsontableLib.handsontableLibStrings.htMiddle | handsontableLib.handsontableLibStrings.htBottom) => scala.Unit = null,
    beforeChange: (/* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource) => scala.Unit | scala.Boolean = null,
    beforeChangeRender: (/* changes */ js.Array[handsontableLib.handsontableMod.HandsontableNs.CellChange], /* source */ handsontableLib.handsontableMod.HandsontableNs.ChangeSource) => scala.Unit = null,
    beforeColumnMove: (/* columns */ js.Array[scala.Double], /* target */ scala.Double) => scala.Unit | scala.Boolean = null,
    beforeColumnResize: (/* currentColumn */ scala.Double, /* newSize */ scala.Double, /* isDoubleClick */ scala.Boolean) => scala.Unit | scala.Double = null,
    beforeColumnSort: (/* currentSortConfig */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config], /* destinationSortConfigs */ js.Array[handsontableLib.handsontableMod.HandsontableNs.columnSortingNs.Config]) => scala.Unit | scala.Boolean = null,
    beforeContextMenuSetItems: /* menuItems */ js.Array[handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig] => scala.Unit = null,
    beforeContextMenuShow: /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu => scala.Unit = null,
    beforeCopy: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit | scala.Boolean = null,
    beforeCreateCol: (/* index */ scala.Double, /* amount */ scala.Double, /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit | scala.Boolean = null,
    beforeCreateRow: (/* index */ scala.Double, /* amount */ scala.Double, /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    beforeCut: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit | scala.Boolean = null,
    beforeDetachChild: (/* parent */ handsontableLib.handsontableMod.HandsontableNs.RowObject, /* element */ handsontableLib.handsontableMod.HandsontableNs.RowObject) => scala.Unit = null,
    beforeDrawBorders: (/* corners */ js.Array[scala.Double], /* borderClassName */ js.UndefOr[
      handsontableLib.handsontableLibStrings.current | handsontableLib.handsontableLibStrings.area | handsontableLib.handsontableLibStrings.highlight
    ]) => scala.Unit = null,
    beforeDropdownMenuSetItems: /* menuItems */ js.Array[handsontableLib.handsontableMod.HandsontableNs.contextMenuNs.MenuItemConfig] => scala.Unit = null,
    beforeDropdownMenuShow: /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu => scala.Unit = null,
    beforeFilter: /* conditionsStack */ js.Array[
      handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs.ColumnConditions
    ] => scala.Unit | scala.Boolean = null,
    beforeGetCellMeta: (/* row */ scala.Double, /* col */ scala.Double, /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties) => scala.Unit = null,
    beforeHideColumns: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeHideRows: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeInit: () => scala.Unit = null,
    beforeInitWalkontable: /* walkontableConfig */ js.Object => scala.Unit = null,
    beforeKeyDown: /* event */ stdLib.KeyboardEvent => scala.Unit = null,
    beforeLanguageChange: /* languageCode */ java.lang.String => scala.Unit = null,
    beforeMergeCells: (/* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, /* auto */ scala.Boolean) => scala.Unit = null,
    beforeOnCellContextMenu: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    beforeOnCellMouseDown: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement, /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController) => scala.Unit = null,
    beforeOnCellMouseOut: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement) => scala.Unit = null,
    beforeOnCellMouseOver: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement, /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController) => scala.Unit = null,
    beforeOnCellMouseUp: (/* event */ stdLib.MouseEvent, /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, /* TD */ stdLib.HTMLTableCellElement, /* controller */ handsontableLib.handsontableMod.HandsontableNs.SelectionController) => scala.Unit = null,
    beforePaste: (/* data */ js.Array[js.Array[handsontableLib.handsontableMod.HandsontableNs.CellValue]], /* coords */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType]) => scala.Unit | scala.Boolean = null,
    beforeRedo: /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction => scala.Unit = null,
    beforeRefreshDimensions: (/* previousDimensions */ js.Object, /* currentDimensions */ js.Object, /* actionPossible */ scala.Boolean) => scala.Boolean | scala.Unit = null,
    beforeRemoveCellClassNames: () => js.Array[java.lang.String] | scala.Unit = null,
    beforeRemoveCellMeta: (/* row */ scala.Double, /* column */ scala.Double, /* key */ java.lang.String, /* value */ js.Any) => scala.Unit = null,
    beforeRemoveCol: (/* index */ scala.Double, /* amount */ scala.Double, /* physicalColumns */ js.Array[scala.Double], /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    beforeRemoveRow: (/* index */ scala.Double, /* amount */ scala.Double, /* physicalColumns */ js.Array[scala.Double], /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    beforeRender: (/* isForced */ scala.Boolean, /* skipRender */ handsontableLib.Anon_SkipRender) => scala.Unit = null,
    beforeRenderer: (/* TD */ stdLib.HTMLTableCellElement, /* row */ scala.Double, /* col */ scala.Double, /* prop */ java.lang.String | scala.Double, /* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties) => scala.Unit = null,
    beforeRowMove: (/* columns */ js.Array[scala.Double], /* target */ scala.Double) => scala.Unit = null,
    beforeRowResize: (/* currentRow */ scala.Double, /* newSize */ scala.Double, /* isDoubleClick */ scala.Boolean) => scala.Double | scala.Unit = null,
    beforeSetRangeEnd: /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords => scala.Unit = null,
    beforeSetRangeStart: /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords => scala.Unit = null,
    beforeSetRangeStartOnly: /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords => scala.Unit = null,
    beforeStretchingColumnWidth: (/* stretchedWidth */ scala.Double, /* column */ scala.Double) => scala.Unit | scala.Double = null,
    beforeTouchScroll: () => scala.Unit = null,
    beforeTrimRow: (/* currentTrimConfig */ js.Array[scala.Double], /* destinationTrimConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeUndo: /* action */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.UndoRedoAction => scala.Unit = null,
    beforeUnhideColumns: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeUnhideRows: (/* currentHideConfig */ js.Array[scala.Double], /* destinationHideConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeUnmergeCells: (/* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, /* auto */ scala.Boolean) => scala.Unit = null,
    beforeUntrimRow: (/* currentTrimConfig */ js.Array[scala.Double], /* destinationTrimConfig */ js.Array[scala.Double], /* actionPossible */ scala.Boolean) => scala.Unit = null,
    beforeValidate: (/* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, /* row */ scala.Double, /* prop */ java.lang.String | scala.Double, /* source */ js.UndefOr[handsontableLib.handsontableMod.HandsontableNs.ChangeSource]) => scala.Unit = null,
    beforeValueRender: (/* value */ handsontableLib.handsontableMod.HandsontableNs.CellValue, /* cellProperties */ handsontableLib.handsontableMod.HandsontableNs.CellProperties) => scala.Unit = null,
    construct: () => scala.Unit = null,
    hiddenColumn: /* column */ scala.Double => scala.Unit = null,
    hiddenRow: /* row */ scala.Double => scala.Unit = null,
    init: () => scala.Unit = null,
    modifyAutofillRange: (/* startArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]], /* entireArea */ js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]]) => scala.Unit = null,
    modifyCol: /* col */ scala.Double => scala.Unit = null,
    modifyColHeader: /* column */ scala.Double => scala.Unit = null,
    modifyColWidth: (/* width */ scala.Double, /* col */ scala.Double) => scala.Unit = null,
    modifyColumnHeaderHeight: () => scala.Unit = null,
    modifyCopyableRange: /* copyableRanges */ js.Array[handsontableLib.handsontableMod.HandsontableNs.pluginsNs.RangeType] => scala.Unit = null,
    modifyData: (/* row */ scala.Double, /* column */ scala.Double, /* valueHolder */ handsontableLib.Anon_ValueCellValue, /* ioMode */ handsontableLib.handsontableLibStrings.get | handsontableLib.handsontableLibStrings.set) => scala.Unit = null,
    modifyGetCellCoords: (/* row */ scala.Double, /* column */ scala.Double, /* topmost */ scala.Boolean) => scala.Unit | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) = null,
    modifyRow: /* row */ scala.Double => scala.Unit = null,
    modifyRowData: /* row */ scala.Double => scala.Unit = null,
    modifyRowHeader: /* row */ scala.Double => scala.Unit = null,
    modifyRowHeaderWidth: /* rowHeaderWidth */ scala.Double => scala.Unit = null,
    modifyRowHeight: (/* height */ scala.Double, /* row */ scala.Double) => scala.Unit = null,
    modifyRowSourceData: /* row */ scala.Double => scala.Unit = null,
    modifyTransformEnd: /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords => scala.Unit = null,
    modifyTransformStart: /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords => scala.Unit = null,
    persistentStateLoad: (/* key */ java.lang.String, /* valuePlaceholder */ handsontableLib.Anon_ValueAny) => scala.Unit = null,
    persistentStateReset: /* key */ java.lang.String => scala.Unit = null,
    persistentStateSave: (/* key */ java.lang.String, /* value */ js.Any) => scala.Unit = null,
    skipLengthCache: /* delay */ scala.Double => scala.Unit = null,
    unmodifyCol: /* col */ scala.Double => scala.Unit = null,
    unmodifyRow: /* row */ scala.Double => scala.Unit = null
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
    if (afterCreateCol != null) __obj.updateDynamic("afterCreateCol")(js.Any.fromFunction2(afterCreateCol))
    if (afterCreateRow != null) __obj.updateDynamic("afterCreateRow")(js.Any.fromFunction2(afterCreateRow))
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
    if (afterRemoveCol != null) __obj.updateDynamic("afterRemoveCol")(js.Any.fromFunction2(afterRemoveCol))
    if (afterRemoveRow != null) __obj.updateDynamic("afterRemoveRow")(js.Any.fromFunction2(afterRemoveRow))
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

