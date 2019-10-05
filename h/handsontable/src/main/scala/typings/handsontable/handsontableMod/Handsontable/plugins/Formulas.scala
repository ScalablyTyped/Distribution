package typings.handsontable.handsontableMod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formulas extends Base {
  var dataProvider: DataProvider
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
  var sheet: Sheet
  var undoRedoSnapshot: UndoRedoSnapshot
  def getCellValue(row: Double, column: Double): js.Any
  def getVariable(name: String): js.Any
  def hasComputedCellValue(row: Double, column: Double): Boolean
  def recalculate(): Unit
  def recalculateFull(): Unit
  def recalculateOptimized(): Unit
  def setVariable(name: String, value: js.Any): Unit
}

object Formulas {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    dataProvider: DataProvider,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager,
    getCellValue: (Double, Double) => js.Any,
    getVariable: String => js.Any,
    hasComputedCellValue: (Double, Double) => Boolean,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: () => Unit,
    recalculateFull: () => Unit,
    recalculateOptimized: () => Unit,
    removeHooks: String => Unit,
    setVariable: (String, js.Any) => Unit,
    sheet: Sheet,
    undoRedoSnapshot: UndoRedoSnapshot
  ): Formulas = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), dataProvider = dataProvider, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getCellValue = js.Any.fromFunction2(getCellValue), getVariable = js.Any.fromFunction1(getVariable), hasComputedCellValue = js.Any.fromFunction2(hasComputedCellValue), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, recalculate = js.Any.fromFunction0(recalculate), recalculateFull = js.Any.fromFunction0(recalculateFull), recalculateOptimized = js.Any.fromFunction0(recalculateOptimized), removeHooks = js.Any.fromFunction1(removeHooks), setVariable = js.Any.fromFunction2(setVariable), sheet = sheet, undoRedoSnapshot = undoRedoSnapshot)
  
    __obj.asInstanceOf[Formulas]
  }
}

