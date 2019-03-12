package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCells extends Base {
  var autofillCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.AutofillCalculations
  var mergedCellsCollection: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.MergedCellsCollection
  var selectionCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.SelectionCalculations
  def clearCollections(): scala.Unit
  def merge(startRow: scala.Double, startColumn: scala.Double, endRow: scala.Double, endColumn: scala.Double): scala.Unit
  def mergeSelection(cellRange: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange): scala.Unit
  def unmerge(startRow: scala.Double, startColumn: scala.Double, endRow: scala.Double, endColumn: scala.Double): scala.Unit
}

object MergeCells {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    autofillCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.AutofillCalculations,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearCollections: () => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    merge: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    mergeSelection: handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange => scala.Unit,
    mergedCellsCollection: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.MergedCellsCollection,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: java.lang.String => scala.Unit,
    selectionCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.SelectionCalculations,
    unmerge: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit
  ): MergeCells = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autofillCalculations = autofillCalculations, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearCollections = js.Any.fromFunction0(clearCollections), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, merge = js.Any.fromFunction4(merge), mergeSelection = js.Any.fromFunction1(mergeSelection), mergedCellsCollection = mergedCellsCollection, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = js.Any.fromFunction1(removeHook), selectionCalculations = selectionCalculations, unmerge = js.Any.fromFunction4(unmerge))
  
    __obj.asInstanceOf[MergeCells]
  }
}

