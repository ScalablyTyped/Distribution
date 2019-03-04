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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    dataProvider: DataProvider,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    getCellValue: js.Function2[scala.Double, scala.Double, js.Any],
    getVariable: js.Function1[java.lang.String, js.Any],
    hasComputedCellValue: js.Function2[scala.Double, scala.Double, scala.Boolean],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: js.Function0[scala.Unit],
    recalculateFull: js.Function0[scala.Unit],
    recalculateOptimized: js.Function0[scala.Unit],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    setVariable: js.Function2[java.lang.String, js.Any, scala.Unit],
    sheet: Sheet,
    undoRedoSnapshot: UndoRedoSnapshot
  ): Formulas = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, dataProvider = dataProvider, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, getCellValue = getCellValue, getVariable = getVariable, hasComputedCellValue = hasComputedCellValue, init = init, initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, recalculate = recalculate, recalculateFull = recalculateFull, recalculateOptimized = recalculateOptimized, removeHook = removeHook, setVariable = setVariable, sheet = sheet, undoRedoSnapshot = undoRedoSnapshot)
  
    __obj.asInstanceOf[Formulas]
  }
}

