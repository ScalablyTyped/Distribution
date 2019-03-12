package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formulas extends Base {
  var dataProvider: DataProvider
  var eventManager: EventManager
  var sheet: Sheet
  var undoRedoSnapshot: UndoRedoSnapshot
  def getCellValue(row: scala.Double, column: scala.Double): js.Any
  def getVariable(name: java.lang.String): js.Any
  def hasComputedCellValue(row: scala.Double, column: scala.Double): scala.Boolean
  def recalculate(): scala.Unit
  def recalculateFull(): scala.Unit
  def recalculateOptimized(): scala.Unit
  def setVariable(name: java.lang.String, value: js.Any): scala.Unit
}

object Formulas {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function0[scala.Unit]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    dataProvider: DataProvider,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    getCellValue: (scala.Double, scala.Double) => js.Any,
    getVariable: java.lang.String => js.Any,
    hasComputedCellValue: (scala.Double, scala.Double) => scala.Boolean,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: () => scala.Unit,
    recalculateFull: () => scala.Unit,
    recalculateOptimized: () => scala.Unit,
    removeHook: java.lang.String => scala.Unit,
    setVariable: (java.lang.String, js.Any) => scala.Unit,
    sheet: Sheet,
    undoRedoSnapshot: UndoRedoSnapshot
  ): Formulas = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), dataProvider = dataProvider, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getCellValue = js.Any.fromFunction2(getCellValue), getVariable = js.Any.fromFunction1(getVariable), hasComputedCellValue = js.Any.fromFunction2(hasComputedCellValue), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, recalculate = js.Any.fromFunction0(recalculate), recalculateFull = js.Any.fromFunction0(recalculateFull), recalculateOptimized = js.Any.fromFunction0(recalculateOptimized), removeHook = js.Any.fromFunction1(removeHook), setVariable = js.Any.fromFunction2(setVariable), sheet = sheet, undoRedoSnapshot = undoRedoSnapshot)
  
    __obj.asInstanceOf[Formulas]
  }
}

