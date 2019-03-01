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

object Hooks {
  @scala.inline
  def apply(
    afterAddChild: js.Function3[
      /* parent */ js.Object, 
      /* element */ js.Object | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ] = null,
    afterBeginEditing: js.Function2[/* row */ scala.Double, /* column */ scala.Double, scala.Unit] = null,
    afterCellMetaReset: js.Function0[scala.Unit] = null,
    afterChange: js.Function2[
      /* changes */ js.Array[js.Tuple4[scala.Double, java.lang.String | scala.Double, _, _]], 
      /* source */ java.lang.String, 
      scala.Unit
    ] = null,
    afterChangesObserved: js.Function0[scala.Unit] = null,
    afterColumnMove: js.Function2[/* startColumn */ scala.Double, /* endColumn */ scala.Double, scala.Unit] = null,
    afterColumnResize: js.Function3[
      /* currentColumn */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ] = null,
    afterColumnSort: js.Function2[
      /* currentSortConfig */ js.Array[js.Object], 
      /* destinationSortConfigs */ js.Array[js.Object], 
      scala.Unit
    ] = null,
    afterContextMenuDefaultOptions: js.Function1[/* predefinedItems */ js.Array[_], scala.Unit] = null,
    afterContextMenuHide: js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ] = null,
    afterContextMenuShow: js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ] = null,
    afterCopy: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit] = null,
    afterCopyLimit: js.Function4[
      /* selectedRows */ scala.Double, 
      /* selectedColumnds */ scala.Double, 
      /* copyRowsLimit */ scala.Double, 
      /* copyColumnsLimit */ scala.Double, 
      scala.Unit
    ] = null,
    afterCreateCol: js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit] = null,
    afterCreateRow: js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit] = null,
    afterCut: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit] = null,
    afterDeselect: js.Function0[scala.Unit] = null,
    afterDestroy: js.Function0[scala.Unit] = null,
    afterDetachChild: js.Function2[/* parent */ js.Object, /* element */ js.Object, scala.Unit] = null,
    afterDocumentKeyDown: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    afterDrawSelection: js.Function4[
      /* currentRow */ scala.Double, 
      /* currentColumn */ scala.Double, 
      /* cornersOfSelection */ js.Array[scala.Double], 
      /* layerLevel */ scala.Double | scala.Unit, 
      java.lang.String | scala.Unit
    ] = null,
    afterDropdownMenuDefaultOptions: js.Function1[/* predefinedItems */ js.Array[_], scala.Unit] = null,
    afterDropdownMenuHide: js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ] = null,
    afterDropdownMenuShow: js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ] = null,
    afterFilter: js.Function1[/* formulasStack */ js.Array[_], scala.Unit] = null,
    afterGetCellMeta: js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ] = null,
    afterGetColHeader: js.Function2[/* col */ scala.Double, /* TH */ stdLib.Element, scala.Unit] = null,
    afterGetColumnHeaderRenderers: js.Function1[/* array */ js.Array[_], scala.Unit] = null,
    afterGetRowHeader: js.Function2[/* row */ scala.Double, /* TH */ stdLib.Element, scala.Unit] = null,
    afterGetRowHeaderRenderers: js.Function1[/* array */ js.Array[_], scala.Unit] = null,
    afterInit: js.Function0[scala.Unit] = null,
    afterLanguageChange: js.Function1[/* languageCode */ java.lang.String, scala.Unit] = null,
    afterListen: js.Function0[scala.Unit] = null,
    afterLoadData: js.Function1[/* firstTime */ scala.Boolean, scala.Unit] = null,
    afterMergeCells: js.Function3[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* mergeParent */ js.Object, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ] = null,
    afterModifyTransformEnd: js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ scala.Double, 
      /* colTransformDir */ scala.Double, 
      scala.Unit
    ] = null,
    afterModifyTransformStart: js.Function3[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* rowTransformDir */ scala.Double, 
      /* colTransformDir */ scala.Double, 
      scala.Unit
    ] = null,
    afterMomentumScroll: js.Function0[scala.Unit] = null,
    afterOnCellContextMenu: js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    afterOnCellCornerDblClick: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit] = null,
    afterOnCellCornerMouseDown: js.Function1[/* event */ stdLib.MouseEvent, scala.Unit] = null,
    afterOnCellMouseDown: js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    afterOnCellMouseOut: js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    afterOnCellMouseOver: js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    afterOnCellMouseUp: js.Function3[
      /* event */ stdLib.MouseEvent, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    afterPaste: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], scala.Unit] = null,
    afterPluginsInitialized: js.Function0[scala.Unit] = null,
    afterRedo: js.Function1[/* action */ js.Object, scala.Unit] = null,
    afterRemoveCellMeta: js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ] = null,
    afterRemoveCol: js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit] = null,
    afterRemoveRow: js.Function2[/* index */ scala.Double, /* amount */ scala.Double, scala.Unit] = null,
    afterRender: js.Function1[/* isForced */ scala.Boolean, scala.Unit] = null,
    afterRenderer: js.Function6[
      /* TD */ stdLib.Element, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ java.lang.String, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ] = null,
    afterRowMove: js.Function2[/* startRow */ scala.Double, /* endRow */ scala.Double, scala.Unit] = null,
    afterRowResize: js.Function3[
      /* currentRow */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ] = null,
    afterScrollHorizontally: js.Function0[scala.Unit] = null,
    afterScrollVertically: js.Function0[scala.Unit] = null,
    afterSelection: js.Function6[
      /* r */ scala.Double, 
      /* c */ scala.Double, 
      /* r2 */ scala.Double, 
      /* c2 */ scala.Double, 
      /* preventScrolling */ js.Object, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ] = null,
    afterSelectionByProp: js.Function6[
      /* r */ scala.Double, 
      /* p */ java.lang.String, 
      /* r2 */ scala.Double, 
      /* p2 */ java.lang.String, 
      /* preventScrolling */ js.Object, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ] = null,
    afterSelectionEnd: js.Function5[
      /* r */ scala.Double, 
      /* c */ scala.Double, 
      /* r2 */ scala.Double, 
      /* c2 */ scala.Double, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ] = null,
    afterSelectionEndByProp: js.Function5[
      /* r */ scala.Double, 
      /* p */ java.lang.String, 
      /* r2 */ scala.Double, 
      /* p2 */ java.lang.String, 
      /* selectionLayerLevel */ scala.Double, 
      scala.Unit
    ] = null,
    afterSetCellMeta: js.Function4[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ] = null,
    afterSetDataAtCell: js.Function2[/* changes */ js.Array[_], /* source */ js.UndefOr[java.lang.String], scala.Unit] = null,
    afterSetDataAtRowProp: js.Function2[/* changes */ js.Array[_], /* source */ js.UndefOr[java.lang.String], scala.Unit] = null,
    afterTrimRow: js.Function1[/* rows */ js.Array[_], scala.Unit] = null,
    afterUndo: js.Function1[/* action */ js.Object, scala.Unit] = null,
    afterUnlisten: js.Function0[scala.Unit] = null,
    afterUnmergeCells: js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ] = null,
    afterUntrimRow: js.Function1[/* rows */ js.Array[_], scala.Unit] = null,
    afterUpdateSettings: js.Function0[scala.Unit] = null,
    afterValidate: js.Function5[
      /* isValid */ scala.Boolean, 
      /* value */ js.Any, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ java.lang.String, 
      scala.Unit | scala.Boolean
    ] = null,
    afterViewportColumnCalculatorOverride: js.Function1[/* calc */ js.Object, scala.Unit] = null,
    afterViewportRowCalculatorOverride: js.Function1[/* calc */ js.Object, scala.Unit] = null,
    beforeAddChild: js.Function3[
      /* parent */ js.Object, 
      /* element */ js.Object | scala.Unit, 
      /* index */ scala.Double | scala.Unit, 
      scala.Unit
    ] = null,
    beforeAutofill: js.Function3[/* start */ js.Object, /* end */ js.Object, /* data */ js.Array[_], scala.Unit] = null,
    beforeAutofillInsidePopulate: js.Function4[
      /* index */ js.Object, 
      /* direction */ java.lang.String, 
      /* input */ js.Array[_], 
      /* deltas */ js.Array[_], 
      scala.Unit
    ] = null,
    beforeCellAlignment: js.Function4[
      /* stateBefore */ js.Any, 
      /* range */ js.Any, 
      /* type */ java.lang.String, 
      /* alignmentClass */ java.lang.String, 
      scala.Unit
    ] = null,
    beforeChange: js.Function2[
      /* changes */ js.Array[js.Tuple4[scala.Double, java.lang.String | scala.Double, _, _]], 
      /* source */ java.lang.String, 
      scala.Unit
    ] = null,
    beforeChangeRender: js.Function2[/* changes */ js.Array[_], /* source */ java.lang.String, scala.Unit] = null,
    beforeColumnMove: js.Function2[/* columns */ js.Array[scala.Double], /* target */ scala.Double, scala.Unit] = null,
    beforeColumnResize: js.Function3[
      /* currentColumn */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      scala.Unit
    ] = null,
    beforeColumnSort: js.Function2[
      /* currentSortConfig */ js.Array[js.Object], 
      /* destinationSortConfigs */ js.Array[js.Object], 
      scala.Unit
    ] = null,
    beforeContextMenuSetItems: js.Function1[/* menuItems */ js.Array[_], scala.Unit] = null,
    beforeContextMenuShow: js.Function1[
      /* context */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.ContextMenu, 
      scala.Unit
    ] = null,
    beforeCopy: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _] = null,
    beforeCreateCol: js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    beforeCreateRow: js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    beforeCut: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _] = null,
    beforeDetachChild: js.Function2[/* parent */ js.Object, /* element */ js.Object, scala.Unit] = null,
    beforeDrawBorders: js.Function2[/* corners */ js.Array[_], /* borderClassName */ java.lang.String, scala.Unit] = null,
    beforeDropdownMenuSetItems: js.Function1[/* menuItems */ js.Array[_], scala.Unit] = null,
    beforeDropdownMenuShow: js.Function1[
      /* instance */ handsontableLib.handsontableMod.HandsontableNs.pluginsNs.DropdownMenu, 
      scala.Unit
    ] = null,
    beforeFilter: js.Function1[/* formulasStack */ js.Array[_], scala.Unit] = null,
    beforeGetCellMeta: js.Function3[
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ] = null,
    beforeInit: js.Function0[scala.Unit] = null,
    beforeInitWalkontable: js.Function1[/* walkontableConfig */ js.Object, scala.Unit] = null,
    beforeKeyDown: js.Function1[/* event */ stdLib.Event, scala.Unit] = null,
    beforeLanguageChange: js.Function1[/* languageCode */ java.lang.String, scala.Unit] = null,
    beforeMergeCells: js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ] = null,
    beforeOnCellContextMenu: js.Function3[/* event */ js.Object, /* coords */ js.Object, /* TD */ stdLib.Element, scala.Unit] = null,
    beforeOnCellMouseDown: js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ js.Object, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ] = null,
    beforeOnCellMouseOut: js.Function3[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      scala.Unit
    ] = null,
    beforeOnCellMouseOver: js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ] = null,
    beforeOnCellMouseUp: js.Function4[
      /* event */ stdLib.Event, 
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      /* TD */ stdLib.Element, 
      /* controller */ js.Object, 
      scala.Unit
    ] = null,
    beforePaste: js.Function2[/* data */ js.Array[_], /* coords */ js.Array[_], _] = null,
    beforeRedo: js.Function1[/* action */ js.Object, scala.Unit] = null,
    beforeRemoveCellClassNames: js.Function0[js.Array[java.lang.String] | scala.Unit] = null,
    beforeRemoveCellMeta: js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* key */ java.lang.String, 
      /* value */ js.Any, 
      scala.Unit
    ] = null,
    beforeRemoveCol: js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* logicalCols */ js.UndefOr[js.Array[_]], 
      scala.Unit
    ] = null,
    beforeRemoveRow: js.Function3[
      /* index */ scala.Double, 
      /* amount */ scala.Double, 
      /* logicalRows */ js.UndefOr[js.Array[_]], 
      scala.Unit
    ] = null,
    beforeRender: js.Function2[/* isForced */ scala.Boolean, /* skipRender */ js.Object, scala.Unit] = null,
    beforeRenderer: js.Function6[
      /* TD */ stdLib.Element, 
      /* row */ scala.Double, 
      /* col */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* value */ java.lang.String, 
      /* cellProperties */ GridSettings, 
      scala.Unit
    ] = null,
    beforeRowMove: js.Function2[/* columns */ js.Array[scala.Double], /* target */ scala.Double, scala.Unit] = null,
    beforeRowResize: js.Function3[
      /* currentRow */ scala.Double, 
      /* newSize */ scala.Double, 
      /* isDoubleClick */ scala.Boolean, 
      _
    ] = null,
    beforeSetRangeEnd: js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ] = null,
    beforeSetRangeStart: js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ] = null,
    beforeSetRangeStartOnly: js.Function1[
      /* coords */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ] = null,
    beforeStretchingColumnWidth: js.Function2[/* stretchedWidth */ scala.Double, /* column */ scala.Double, scala.Unit] = null,
    beforeTouchScroll: js.Function0[scala.Unit] = null,
    beforeUndo: js.Function1[/* action */ js.Object, scala.Unit] = null,
    beforeUnmergeCells: js.Function2[
      /* cellRange */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, 
      /* auto */ scala.Boolean, 
      scala.Unit
    ] = null,
    beforeValidate: js.Function4[
      /* value */ js.Any, 
      /* row */ scala.Double, 
      /* prop */ java.lang.String | scala.Double, 
      /* source */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    beforeValueRender: js.Function2[/* value */ js.Any, /* cellProperties */ js.Object, scala.Unit] = null,
    construct: js.Function0[scala.Unit] = null,
    getRegistered: js.Function0[js.Array[java.lang.String]] = null,
    hiddenColumn: js.Function1[/* column */ scala.Double, scala.Unit] = null,
    hiddenRow: js.Function1[/* row */ scala.Double, scala.Unit] = null,
    init: js.Function0[scala.Unit] = null,
    manualRowHeights: js.Function1[/* state */ js.Array[_], scala.Unit] = null,
    modifyAutofillRange: js.Function2[/* startArea */ js.Array[_], /* entireArea */ js.Array[_], scala.Unit] = null,
    modifyCol: js.Function1[/* col */ scala.Double, scala.Unit] = null,
    modifyColHeader: js.Function1[/* column */ scala.Double, scala.Unit] = null,
    modifyColWidth: js.Function2[/* width */ scala.Double, /* col */ scala.Double, scala.Unit] = null,
    modifyColumnHeaderHeight: js.Function0[scala.Unit] = null,
    modifyCopyableRange: js.Function1[/* copyableRanges */ js.Array[_], scala.Unit] = null,
    modifyData: js.Function4[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* valueHolder */ js.Object, 
      /* ioMode */ java.lang.String, 
      scala.Unit
    ] = null,
    modifyGetCellCoords: js.Function3[
      /* row */ scala.Double, 
      /* column */ scala.Double, 
      /* topmost */ scala.Boolean, 
      scala.Unit
    ] = null,
    modifyRow: js.Function1[/* row */ scala.Double, scala.Unit] = null,
    modifyRowData: js.Function1[/* row */ scala.Double, scala.Unit] = null,
    modifyRowHeader: js.Function1[/* row */ scala.Double, scala.Unit] = null,
    modifyRowHeaderWidth: js.Function1[/* rowHeaderWidth */ scala.Double, scala.Unit] = null,
    modifyRowHeight: js.Function2[/* height */ scala.Double, /* row */ scala.Double, scala.Unit] = null,
    modifyRowSourceData: js.Function1[/* row */ scala.Double, scala.Unit] = null,
    modifyTransformEnd: js.Function1[
      /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ] = null,
    modifyTransformStart: js.Function1[
      /* delta */ handsontableLib.handsontableMod.HandsontableNs.wotNs.CellCoords, 
      scala.Unit
    ] = null,
    persistentStateLoad: js.Function2[/* key */ java.lang.String, /* valuePlaceholder */ js.Object, scala.Unit] = null,
    persistentStateReset: js.Function1[/* key */ java.lang.String, scala.Unit] = null,
    persistentStateSave: js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit] = null,
    skipLengthCache: js.Function1[/* delay */ scala.Double, scala.Unit] = null,
    unmodifyCol: js.Function1[/* col */ scala.Double, scala.Unit] = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (afterAddChild != null) __obj.updateDynamic("afterAddChild")(afterAddChild)
    if (afterBeginEditing != null) __obj.updateDynamic("afterBeginEditing")(afterBeginEditing)
    if (afterCellMetaReset != null) __obj.updateDynamic("afterCellMetaReset")(afterCellMetaReset)
    if (afterChange != null) __obj.updateDynamic("afterChange")(afterChange)
    if (afterChangesObserved != null) __obj.updateDynamic("afterChangesObserved")(afterChangesObserved)
    if (afterColumnMove != null) __obj.updateDynamic("afterColumnMove")(afterColumnMove)
    if (afterColumnResize != null) __obj.updateDynamic("afterColumnResize")(afterColumnResize)
    if (afterColumnSort != null) __obj.updateDynamic("afterColumnSort")(afterColumnSort)
    if (afterContextMenuDefaultOptions != null) __obj.updateDynamic("afterContextMenuDefaultOptions")(afterContextMenuDefaultOptions)
    if (afterContextMenuHide != null) __obj.updateDynamic("afterContextMenuHide")(afterContextMenuHide)
    if (afterContextMenuShow != null) __obj.updateDynamic("afterContextMenuShow")(afterContextMenuShow)
    if (afterCopy != null) __obj.updateDynamic("afterCopy")(afterCopy)
    if (afterCopyLimit != null) __obj.updateDynamic("afterCopyLimit")(afterCopyLimit)
    if (afterCreateCol != null) __obj.updateDynamic("afterCreateCol")(afterCreateCol)
    if (afterCreateRow != null) __obj.updateDynamic("afterCreateRow")(afterCreateRow)
    if (afterCut != null) __obj.updateDynamic("afterCut")(afterCut)
    if (afterDeselect != null) __obj.updateDynamic("afterDeselect")(afterDeselect)
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(afterDestroy)
    if (afterDetachChild != null) __obj.updateDynamic("afterDetachChild")(afterDetachChild)
    if (afterDocumentKeyDown != null) __obj.updateDynamic("afterDocumentKeyDown")(afterDocumentKeyDown)
    if (afterDrawSelection != null) __obj.updateDynamic("afterDrawSelection")(afterDrawSelection)
    if (afterDropdownMenuDefaultOptions != null) __obj.updateDynamic("afterDropdownMenuDefaultOptions")(afterDropdownMenuDefaultOptions)
    if (afterDropdownMenuHide != null) __obj.updateDynamic("afterDropdownMenuHide")(afterDropdownMenuHide)
    if (afterDropdownMenuShow != null) __obj.updateDynamic("afterDropdownMenuShow")(afterDropdownMenuShow)
    if (afterFilter != null) __obj.updateDynamic("afterFilter")(afterFilter)
    if (afterGetCellMeta != null) __obj.updateDynamic("afterGetCellMeta")(afterGetCellMeta)
    if (afterGetColHeader != null) __obj.updateDynamic("afterGetColHeader")(afterGetColHeader)
    if (afterGetColumnHeaderRenderers != null) __obj.updateDynamic("afterGetColumnHeaderRenderers")(afterGetColumnHeaderRenderers)
    if (afterGetRowHeader != null) __obj.updateDynamic("afterGetRowHeader")(afterGetRowHeader)
    if (afterGetRowHeaderRenderers != null) __obj.updateDynamic("afterGetRowHeaderRenderers")(afterGetRowHeaderRenderers)
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (afterLanguageChange != null) __obj.updateDynamic("afterLanguageChange")(afterLanguageChange)
    if (afterListen != null) __obj.updateDynamic("afterListen")(afterListen)
    if (afterLoadData != null) __obj.updateDynamic("afterLoadData")(afterLoadData)
    if (afterMergeCells != null) __obj.updateDynamic("afterMergeCells")(afterMergeCells)
    if (afterModifyTransformEnd != null) __obj.updateDynamic("afterModifyTransformEnd")(afterModifyTransformEnd)
    if (afterModifyTransformStart != null) __obj.updateDynamic("afterModifyTransformStart")(afterModifyTransformStart)
    if (afterMomentumScroll != null) __obj.updateDynamic("afterMomentumScroll")(afterMomentumScroll)
    if (afterOnCellContextMenu != null) __obj.updateDynamic("afterOnCellContextMenu")(afterOnCellContextMenu)
    if (afterOnCellCornerDblClick != null) __obj.updateDynamic("afterOnCellCornerDblClick")(afterOnCellCornerDblClick)
    if (afterOnCellCornerMouseDown != null) __obj.updateDynamic("afterOnCellCornerMouseDown")(afterOnCellCornerMouseDown)
    if (afterOnCellMouseDown != null) __obj.updateDynamic("afterOnCellMouseDown")(afterOnCellMouseDown)
    if (afterOnCellMouseOut != null) __obj.updateDynamic("afterOnCellMouseOut")(afterOnCellMouseOut)
    if (afterOnCellMouseOver != null) __obj.updateDynamic("afterOnCellMouseOver")(afterOnCellMouseOver)
    if (afterOnCellMouseUp != null) __obj.updateDynamic("afterOnCellMouseUp")(afterOnCellMouseUp)
    if (afterPaste != null) __obj.updateDynamic("afterPaste")(afterPaste)
    if (afterPluginsInitialized != null) __obj.updateDynamic("afterPluginsInitialized")(afterPluginsInitialized)
    if (afterRedo != null) __obj.updateDynamic("afterRedo")(afterRedo)
    if (afterRemoveCellMeta != null) __obj.updateDynamic("afterRemoveCellMeta")(afterRemoveCellMeta)
    if (afterRemoveCol != null) __obj.updateDynamic("afterRemoveCol")(afterRemoveCol)
    if (afterRemoveRow != null) __obj.updateDynamic("afterRemoveRow")(afterRemoveRow)
    if (afterRender != null) __obj.updateDynamic("afterRender")(afterRender)
    if (afterRenderer != null) __obj.updateDynamic("afterRenderer")(afterRenderer)
    if (afterRowMove != null) __obj.updateDynamic("afterRowMove")(afterRowMove)
    if (afterRowResize != null) __obj.updateDynamic("afterRowResize")(afterRowResize)
    if (afterScrollHorizontally != null) __obj.updateDynamic("afterScrollHorizontally")(afterScrollHorizontally)
    if (afterScrollVertically != null) __obj.updateDynamic("afterScrollVertically")(afterScrollVertically)
    if (afterSelection != null) __obj.updateDynamic("afterSelection")(afterSelection)
    if (afterSelectionByProp != null) __obj.updateDynamic("afterSelectionByProp")(afterSelectionByProp)
    if (afterSelectionEnd != null) __obj.updateDynamic("afterSelectionEnd")(afterSelectionEnd)
    if (afterSelectionEndByProp != null) __obj.updateDynamic("afterSelectionEndByProp")(afterSelectionEndByProp)
    if (afterSetCellMeta != null) __obj.updateDynamic("afterSetCellMeta")(afterSetCellMeta)
    if (afterSetDataAtCell != null) __obj.updateDynamic("afterSetDataAtCell")(afterSetDataAtCell)
    if (afterSetDataAtRowProp != null) __obj.updateDynamic("afterSetDataAtRowProp")(afterSetDataAtRowProp)
    if (afterTrimRow != null) __obj.updateDynamic("afterTrimRow")(afterTrimRow)
    if (afterUndo != null) __obj.updateDynamic("afterUndo")(afterUndo)
    if (afterUnlisten != null) __obj.updateDynamic("afterUnlisten")(afterUnlisten)
    if (afterUnmergeCells != null) __obj.updateDynamic("afterUnmergeCells")(afterUnmergeCells)
    if (afterUntrimRow != null) __obj.updateDynamic("afterUntrimRow")(afterUntrimRow)
    if (afterUpdateSettings != null) __obj.updateDynamic("afterUpdateSettings")(afterUpdateSettings)
    if (afterValidate != null) __obj.updateDynamic("afterValidate")(afterValidate)
    if (afterViewportColumnCalculatorOverride != null) __obj.updateDynamic("afterViewportColumnCalculatorOverride")(afterViewportColumnCalculatorOverride)
    if (afterViewportRowCalculatorOverride != null) __obj.updateDynamic("afterViewportRowCalculatorOverride")(afterViewportRowCalculatorOverride)
    if (beforeAddChild != null) __obj.updateDynamic("beforeAddChild")(beforeAddChild)
    if (beforeAutofill != null) __obj.updateDynamic("beforeAutofill")(beforeAutofill)
    if (beforeAutofillInsidePopulate != null) __obj.updateDynamic("beforeAutofillInsidePopulate")(beforeAutofillInsidePopulate)
    if (beforeCellAlignment != null) __obj.updateDynamic("beforeCellAlignment")(beforeCellAlignment)
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(beforeChange)
    if (beforeChangeRender != null) __obj.updateDynamic("beforeChangeRender")(beforeChangeRender)
    if (beforeColumnMove != null) __obj.updateDynamic("beforeColumnMove")(beforeColumnMove)
    if (beforeColumnResize != null) __obj.updateDynamic("beforeColumnResize")(beforeColumnResize)
    if (beforeColumnSort != null) __obj.updateDynamic("beforeColumnSort")(beforeColumnSort)
    if (beforeContextMenuSetItems != null) __obj.updateDynamic("beforeContextMenuSetItems")(beforeContextMenuSetItems)
    if (beforeContextMenuShow != null) __obj.updateDynamic("beforeContextMenuShow")(beforeContextMenuShow)
    if (beforeCopy != null) __obj.updateDynamic("beforeCopy")(beforeCopy)
    if (beforeCreateCol != null) __obj.updateDynamic("beforeCreateCol")(beforeCreateCol)
    if (beforeCreateRow != null) __obj.updateDynamic("beforeCreateRow")(beforeCreateRow)
    if (beforeCut != null) __obj.updateDynamic("beforeCut")(beforeCut)
    if (beforeDetachChild != null) __obj.updateDynamic("beforeDetachChild")(beforeDetachChild)
    if (beforeDrawBorders != null) __obj.updateDynamic("beforeDrawBorders")(beforeDrawBorders)
    if (beforeDropdownMenuSetItems != null) __obj.updateDynamic("beforeDropdownMenuSetItems")(beforeDropdownMenuSetItems)
    if (beforeDropdownMenuShow != null) __obj.updateDynamic("beforeDropdownMenuShow")(beforeDropdownMenuShow)
    if (beforeFilter != null) __obj.updateDynamic("beforeFilter")(beforeFilter)
    if (beforeGetCellMeta != null) __obj.updateDynamic("beforeGetCellMeta")(beforeGetCellMeta)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (beforeInitWalkontable != null) __obj.updateDynamic("beforeInitWalkontable")(beforeInitWalkontable)
    if (beforeKeyDown != null) __obj.updateDynamic("beforeKeyDown")(beforeKeyDown)
    if (beforeLanguageChange != null) __obj.updateDynamic("beforeLanguageChange")(beforeLanguageChange)
    if (beforeMergeCells != null) __obj.updateDynamic("beforeMergeCells")(beforeMergeCells)
    if (beforeOnCellContextMenu != null) __obj.updateDynamic("beforeOnCellContextMenu")(beforeOnCellContextMenu)
    if (beforeOnCellMouseDown != null) __obj.updateDynamic("beforeOnCellMouseDown")(beforeOnCellMouseDown)
    if (beforeOnCellMouseOut != null) __obj.updateDynamic("beforeOnCellMouseOut")(beforeOnCellMouseOut)
    if (beforeOnCellMouseOver != null) __obj.updateDynamic("beforeOnCellMouseOver")(beforeOnCellMouseOver)
    if (beforeOnCellMouseUp != null) __obj.updateDynamic("beforeOnCellMouseUp")(beforeOnCellMouseUp)
    if (beforePaste != null) __obj.updateDynamic("beforePaste")(beforePaste)
    if (beforeRedo != null) __obj.updateDynamic("beforeRedo")(beforeRedo)
    if (beforeRemoveCellClassNames != null) __obj.updateDynamic("beforeRemoveCellClassNames")(beforeRemoveCellClassNames)
    if (beforeRemoveCellMeta != null) __obj.updateDynamic("beforeRemoveCellMeta")(beforeRemoveCellMeta)
    if (beforeRemoveCol != null) __obj.updateDynamic("beforeRemoveCol")(beforeRemoveCol)
    if (beforeRemoveRow != null) __obj.updateDynamic("beforeRemoveRow")(beforeRemoveRow)
    if (beforeRender != null) __obj.updateDynamic("beforeRender")(beforeRender)
    if (beforeRenderer != null) __obj.updateDynamic("beforeRenderer")(beforeRenderer)
    if (beforeRowMove != null) __obj.updateDynamic("beforeRowMove")(beforeRowMove)
    if (beforeRowResize != null) __obj.updateDynamic("beforeRowResize")(beforeRowResize)
    if (beforeSetRangeEnd != null) __obj.updateDynamic("beforeSetRangeEnd")(beforeSetRangeEnd)
    if (beforeSetRangeStart != null) __obj.updateDynamic("beforeSetRangeStart")(beforeSetRangeStart)
    if (beforeSetRangeStartOnly != null) __obj.updateDynamic("beforeSetRangeStartOnly")(beforeSetRangeStartOnly)
    if (beforeStretchingColumnWidth != null) __obj.updateDynamic("beforeStretchingColumnWidth")(beforeStretchingColumnWidth)
    if (beforeTouchScroll != null) __obj.updateDynamic("beforeTouchScroll")(beforeTouchScroll)
    if (beforeUndo != null) __obj.updateDynamic("beforeUndo")(beforeUndo)
    if (beforeUnmergeCells != null) __obj.updateDynamic("beforeUnmergeCells")(beforeUnmergeCells)
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(beforeValidate)
    if (beforeValueRender != null) __obj.updateDynamic("beforeValueRender")(beforeValueRender)
    if (construct != null) __obj.updateDynamic("construct")(construct)
    if (getRegistered != null) __obj.updateDynamic("getRegistered")(getRegistered)
    if (hiddenColumn != null) __obj.updateDynamic("hiddenColumn")(hiddenColumn)
    if (hiddenRow != null) __obj.updateDynamic("hiddenRow")(hiddenRow)
    if (init != null) __obj.updateDynamic("init")(init)
    if (manualRowHeights != null) __obj.updateDynamic("manualRowHeights")(manualRowHeights)
    if (modifyAutofillRange != null) __obj.updateDynamic("modifyAutofillRange")(modifyAutofillRange)
    if (modifyCol != null) __obj.updateDynamic("modifyCol")(modifyCol)
    if (modifyColHeader != null) __obj.updateDynamic("modifyColHeader")(modifyColHeader)
    if (modifyColWidth != null) __obj.updateDynamic("modifyColWidth")(modifyColWidth)
    if (modifyColumnHeaderHeight != null) __obj.updateDynamic("modifyColumnHeaderHeight")(modifyColumnHeaderHeight)
    if (modifyCopyableRange != null) __obj.updateDynamic("modifyCopyableRange")(modifyCopyableRange)
    if (modifyData != null) __obj.updateDynamic("modifyData")(modifyData)
    if (modifyGetCellCoords != null) __obj.updateDynamic("modifyGetCellCoords")(modifyGetCellCoords)
    if (modifyRow != null) __obj.updateDynamic("modifyRow")(modifyRow)
    if (modifyRowData != null) __obj.updateDynamic("modifyRowData")(modifyRowData)
    if (modifyRowHeader != null) __obj.updateDynamic("modifyRowHeader")(modifyRowHeader)
    if (modifyRowHeaderWidth != null) __obj.updateDynamic("modifyRowHeaderWidth")(modifyRowHeaderWidth)
    if (modifyRowHeight != null) __obj.updateDynamic("modifyRowHeight")(modifyRowHeight)
    if (modifyRowSourceData != null) __obj.updateDynamic("modifyRowSourceData")(modifyRowSourceData)
    if (modifyTransformEnd != null) __obj.updateDynamic("modifyTransformEnd")(modifyTransformEnd)
    if (modifyTransformStart != null) __obj.updateDynamic("modifyTransformStart")(modifyTransformStart)
    if (persistentStateLoad != null) __obj.updateDynamic("persistentStateLoad")(persistentStateLoad)
    if (persistentStateReset != null) __obj.updateDynamic("persistentStateReset")(persistentStateReset)
    if (persistentStateSave != null) __obj.updateDynamic("persistentStateSave")(persistentStateSave)
    if (skipLengthCache != null) __obj.updateDynamic("skipLengthCache")(skipLengthCache)
    if (unmodifyCol != null) __obj.updateDynamic("unmodifyCol")(unmodifyCol)
    __obj.asInstanceOf[Hooks]
  }
}

