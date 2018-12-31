package typings
package handsontableLib.handsontableMod.HandsontableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks extends js.Object {
  var afterAddChild: js.UndefOr[
    js.Function3[
      /* parent */ js.Object, 
      /* element */ js.Object | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ]
  ] = js.undefined
  var afterBeginEditing: js.UndefOr[js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit]] = js.undefined
  var afterCellMetaReset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterChange: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[js.Tuple4[scala.Double, java.lang.String | scala.Double, _, _]], 
      /* source */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var afterChangesObserved: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterColumnMove: js.UndefOr[
    js.Function2[/* startColumn */ scala.Double, /* endColumn */ scala.Double, scala.Unit]
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
      /* currentSortConfig */ js.Array[js.Object], 
      /* destinationSortConfigs */ js.Array[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var afterContextMenuDefaultOptions: js.UndefOr[js.Function1[/* predefinedItems */ js.Array[_], scala.Unit]] = js.undefined
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
  var afterCopy: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit]] = js.undefined
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
  var afterCut: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit]] = js.undefined
  var afterDeselect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterDestroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterDetachChild: js.UndefOr[js.Function2[/* parent */ js.Object, /* element */ js.Object, scala.Unit]] = js.undefined
  var afterDocumentKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var afterDrawSelection: js.UndefOr[
    js.Function4[
      /* currentRow */ scala.Double, 
      /* currentColumn */ scala.Double, 
      /* cornersOfSelection */ js.Array[scala.Double], 
      /* layerLevel */ scala.Double | scala.Unit, 
      java.lang.String | scala.Unit
    ]
  ] = js.undefined
  var afterDropdownMenuDefaultOptions: js.UndefOr[js.Function1[/* predefinedItems */ js.Array[_], scala.Unit]] = js.undefined
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
  var afterFilter: js.UndefOr[js.Function1[/* formulasStack */ js.Array[_], scala.Unit]] = js.undefined
  var afterGetCellMeta: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ]
  ] = js.undefined
  var afterGetColHeader: js.UndefOr[js.Function2[/* col */ scala.Double, /* TH */ stdLib.Element, scala.Unit]] = js.undefined
  var afterGetColumnHeaderRenderers: js.UndefOr[js.Function1[/* array */ js.Array[_], scala.Unit]] = js.undefined
  var afterGetRowHeader: js.UndefOr[js.Function2[/* row */ scala.Double, /* TH */ stdLib.Element, scala.Unit]] = js.undefined
  var afterGetRowHeaderRenderers: js.UndefOr[js.Function1[/* array */ js.Array[_], scala.Unit]] = js.undefined
  var afterInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterLanguageChange: js.UndefOr[js.Function1[/* languageCode */ java.lang.String, scala.Unit]] = js.undefined
  var afterListen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterLoadData: js.UndefOr[js.Function1[/* firstTime */ scala.Boolean, scala.Unit]] = js.undefined
  var afterMergeCells: js.UndefOr[
    js.Function3[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* mergeParent */ js.Object, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterModifyTransformEnd: js.UndefOr[
    js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ scala.Double, 
      /* colTransformDir */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterModifyTransformStart: js.UndefOr[
    js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ scala.Double, 
      /* colTransformDir */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterMomentumScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterOnCellContextMenu: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellCornerDblClick: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  var afterOnCellCornerMouseDown: js.UndefOr[js.Function1[/* event */ stdLib.MouseEvent, scala.Unit]] = js.undefined
  var afterOnCellMouseDown: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseOut: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseOver: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var afterOnCellMouseUp: js.UndefOr[
    js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var afterPaste: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit]] = js.undefined
  var afterPluginsInitialized: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterRedo: js.UndefOr[js.Function1[/* action */ js.Object, scala.Unit]] = js.undefined
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
      /* TD */ stdLib.Element, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ java.lang.String, 
      /* cellProperties */ GridSettings, 
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
      /* r */ scala.Double, 
      /* c */ scala.Double, 
      /* r2 */ scala.Double, 
      /* c2 */ scala.Double, 
      /* preventScrolling */ js.Object, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionByProp: js.UndefOr[
    js.Function6[
      /* r */ scala.Double, 
      /* p */ java.lang.String, 
      /* r2 */ scala.Double, 
      /* p2 */ java.lang.String, 
      /* preventScrolling */ js.Object, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionEnd: js.UndefOr[
    js.Function5[
      /* r */ scala.Double, 
      /* c */ scala.Double, 
      /* r2 */ scala.Double, 
      /* c2 */ scala.Double, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var afterSelectionEndByProp: js.UndefOr[
    js.Function5[
      /* r */ scala.Double, 
      /* p */ java.lang.String, 
      /* r2 */ scala.Double, 
      /* p2 */ java.lang.String, 
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
    js.Function2[/* changes */ js.Array[_], /* source */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  var afterSetDataAtRowProp: js.UndefOr[
    js.Function2[/* changes */ js.Array[_], /* source */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  var afterTrimRow: js.UndefOr[js.Function1[/* rows */ js.Array[_], scala.Unit]] = js.undefined
  var afterUndo: js.UndefOr[js.Function1[/* action */ js.Object, scala.Unit]] = js.undefined
  var afterUnlisten: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterUnmergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var afterUntrimRow: js.UndefOr[js.Function1[/* rows */ js.Array[_], scala.Unit]] = js.undefined
  var afterUpdateSettings: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterValidate: js.UndefOr[
    js.Function5[
      /* isValid */ scala.Boolean, 
      /* value */ js.Any, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ java.lang.String, 
      scala.Unit | scala.Boolean
    ]
  ] = js.undefined
  var afterViewportColumnCalculatorOverride: js.UndefOr[js.Function1[/* calc */ js.Object, scala.Unit]] = js.undefined
  var afterViewportRowCalculatorOverride: js.UndefOr[js.Function1[/* calc */ js.Object, scala.Unit]] = js.undefined
  var beforeAddChild: js.UndefOr[
    js.Function3[
      /* parent */ js.Object, 
      /* element */ js.Object | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeAutofill: js.UndefOr[
    js.Function3[/* start */ js.Object, /* end */ js.Object, /* data */ js.Array[_], scala.Unit]
  ] = js.undefined
  var beforeAutofillInsidePopulate: js.UndefOr[
    js.Function4[
      /* index */ js.Object, 
      /* direction */ java.lang.String, 
      /* input */ js.Array[_], 
      /* deltas */ js.Array[_], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCellAlignment: js.UndefOr[
    js.Function4[
      /* stateBefore */ js.Any, 
      /* range */ js.Any, 
      /* type */ java.lang.String, 
      /* alignmentClass */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeChange: js.UndefOr[
    js.Function2[
      /* changes */ js.Array[js.Tuple4[scala.Double, java.lang.String | scala.Double, _, _]], 
      /* source */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeChangeRender: js.UndefOr[
    js.Function2[/* changes */ js.Array[_], /* source */ java.lang.String, scala.Unit]
  ] = js.undefined
  var beforeColumnMove: js.UndefOr[
    js.Function2[/* columns */ js.Array[scala.Double], /* target */ scala.Double, scala.Unit]
  ] = js.undefined
  var beforeColumnResize: js.UndefOr[
    js.Function3[
      /* currentColumn */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeColumnSort: js.UndefOr[
    js.Function2[
      /* currentSortConfig */ js.Array[js.Object], 
      /* destinationSortConfigs */ js.Array[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeContextMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[_], scala.Unit]] = js.undefined
  var beforeContextMenuShow: js.UndefOr[
    js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCopy: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _]] = js.undefined
  var beforeCreateCol: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCreateRow: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeCut: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _]] = js.undefined
  var beforeDetachChild: js.UndefOr[js.Function2[/* parent */ js.Object, /* element */ js.Object, scala.Unit]] = js.undefined
  var beforeDrawBorders: js.UndefOr[
    js.Function2[/* corners */ js.Array[_], /* borderClassName */ java.lang.String, scala.Unit]
  ] = js.undefined
  var beforeDropdownMenuSetItems: js.UndefOr[js.Function1[/* menuItems */ js.Array[_], scala.Unit]] = js.undefined
  var beforeDropdownMenuShow: js.UndefOr[
    js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeFilter: js.UndefOr[js.Function1[/* formulasStack */ js.Array[_], scala.Unit]] = js.undefined
  var beforeGetCellMeta: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeInitWalkontable: js.UndefOr[js.Function1[/* walkontableConfig */ js.Object, scala.Unit]] = js.undefined
  var beforeKeyDown: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var beforeLanguageChange: js.UndefOr[js.Function1[/* languageCode */ java.lang.String, scala.Unit]] = js.undefined
  var beforeMergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellContextMenu: js.UndefOr[
    js.Function3[/* event */ js.Object, /* coords */ js.Object, /* TD */ stdLib.Element, scala.Unit]
  ] = js.undefined
  var beforeOnCellMouseDown: js.UndefOr[
    js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ js.Object, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOut: js.UndefOr[
    js.Function3[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseOver: js.UndefOr[
    js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeOnCellMouseUp: js.UndefOr[
    js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var beforePaste: js.UndefOr[js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _]] = js.undefined
  var beforeRedo: js.UndefOr[js.Function1[/* action */ js.Object, scala.Unit]] = js.undefined
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
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* logicalCols */ js.UndefOr[js.Array[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRemoveRow: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* logicalRows */ js.UndefOr[js.Array[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRender: js.UndefOr[
    js.Function2[/* isForced */ scala.Boolean, /* skipRender */ js.Object, scala.Unit]
  ] = js.undefined
  var beforeRenderer: js.UndefOr[
    js.Function6[
      /* TD */ stdLib.Element, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ java.lang.String, 
      /* cellProperties */ GridSettings, 
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
      _
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
    js.Function2[/* stretchedWidth */ scala.Double, /* column */ scala.Double, scala.Unit]
  ] = js.undefined
  var beforeTouchScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeUndo: js.UndefOr[js.Function1[/* action */ js.Object, scala.Unit]] = js.undefined
  var beforeUnmergeCells: js.UndefOr[
    js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeValueRender: js.UndefOr[js.Function2[/* value */ js.Any, /* cellProperties */ js.Object, scala.Unit]] = js.undefined
  var construct: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getRegistered: js.UndefOr[js.Function0[js.Array[java.lang.String]]] = js.undefined
  var hiddenColumn: js.UndefOr[js.Function1[/* column */ scala.Double, scala.Unit]] = js.undefined
  var hiddenRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
  var init: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var manualRowHeights: js.UndefOr[js.Function1[/* state */ js.Array[_], scala.Unit]] = js.undefined
  var modifyAutofillRange: js.UndefOr[
    js.Function2[/* startArea */ js.Array[_], /* entireArea */ js.Array[_], scala.Unit]
  ] = js.undefined
  var modifyCol: js.UndefOr[js.Function1[/* col */ scala.Double, scala.Unit]] = js.undefined
  var modifyColHeader: js.UndefOr[js.Function1[/* column */ scala.Double, scala.Unit]] = js.undefined
  var modifyColWidth: js.UndefOr[js.Function2[/* width */ scala.Double, /* col */ scala.Double, scala.Unit]] = js.undefined
  var modifyColumnHeaderHeight: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var modifyCopyableRange: js.UndefOr[js.Function1[/* copyableRanges */ js.Array[_], scala.Unit]] = js.undefined
  var modifyData: js.UndefOr[
    js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* valueHolder */ js.Object, 
      /* ioMode */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var modifyGetCellCoords: js.UndefOr[
    js.Function3[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* topmost */ scala.Boolean, 
      scala.Unit
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
    js.Function2[/* key */ java.lang.String, /* valuePlaceholder */ js.Object, scala.Unit]
  ] = js.undefined
  var persistentStateReset: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Unit]] = js.undefined
  var persistentStateSave: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]] = js.undefined
  var skipLengthCache: js.UndefOr[js.Function1[/* delay */ scala.Double, scala.Unit]] = js.undefined
  var unmodifyCol: js.UndefOr[js.Function1[/* col */ scala.Double, scala.Unit]] = js.undefined
  var unmodifyRow: js.UndefOr[js.Function1[/* row */ scala.Double, scala.Unit]] = js.undefined
}

