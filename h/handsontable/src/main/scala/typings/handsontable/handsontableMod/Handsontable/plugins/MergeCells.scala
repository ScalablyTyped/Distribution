package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin.AutofillCalculations
import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin.MergedCellsCollection
import typings.handsontable.handsontableMod.Handsontable.plugins.MergeCellsPlugin.SelectionCalculations
import typings.handsontable.handsontableMod.Handsontable.wot.CellRange
import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCells extends BasePlugin {
  var autofillCalculations: AutofillCalculations
  var mergedCellsCollection: MergedCellsCollection
  var selectionCalculations: SelectionCalculations
  def clearCollections(): Unit
  def merge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit
  def mergeSelection(cellRange: CellRange): Unit
  def unmerge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit
}

object MergeCells {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autofillCalculations: AutofillCalculations,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearCollections: () => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    merge: (Double, Double, Double, Double) => Unit,
    mergeSelection: CellRange => Unit,
    mergedCellsCollection: MergedCellsCollection,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    selectionCalculations: SelectionCalculations,
    t: RecordTranslator,
    unmerge: (Double, Double, Double, Double) => Unit,
    updatePlugin: () => Unit
  ): MergeCells = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autofillCalculations = autofillCalculations, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearCollections = js.Any.fromFunction0(clearCollections), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, merge = js.Any.fromFunction4(merge), mergeSelection = js.Any.fromFunction1(mergeSelection), mergedCellsCollection = mergedCellsCollection, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), selectionCalculations = selectionCalculations, t = t, unmerge = js.Any.fromFunction4(unmerge), updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[MergeCells]
  }
}

