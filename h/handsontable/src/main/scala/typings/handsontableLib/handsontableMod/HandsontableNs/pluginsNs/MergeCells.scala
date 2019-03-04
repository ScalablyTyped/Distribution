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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    autofillCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.AutofillCalculations,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearCollections: js.Function0[scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    merge: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    mergeSelection: js.Function1[handsontableLib.handsontableMod.HandsontableNs.wotNs.CellRange, scala.Unit],
    mergedCellsCollection: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.MergedCellsCollection,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    selectionCalculations: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.MergeCellsPluginNs.SelectionCalculations,
    unmerge: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit]
  ): MergeCells = {
    val __obj = js.Dynamic.literal(addHook = addHook, autofillCalculations = autofillCalculations, callOnPluginsReady = callOnPluginsReady, clearCollections = clearCollections, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, init = init, initialized = initialized, isPluginsReady = isPluginsReady, merge = merge, mergeSelection = mergeSelection, mergedCellsCollection = mergedCellsCollection, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, selectionCalculations = selectionCalculations, unmerge = unmerge)
  
    __obj.asInstanceOf[MergeCells]
  }
}

