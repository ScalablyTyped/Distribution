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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("dataProvider")(dataProvider)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("eventManager")(eventManager)
    __obj.updateDynamic("getCellValue")(getCellValue)
    __obj.updateDynamic("getVariable")(getVariable)
    __obj.updateDynamic("hasComputedCellValue")(hasComputedCellValue)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("recalculate")(recalculate)
    __obj.updateDynamic("recalculateFull")(recalculateFull)
    __obj.updateDynamic("recalculateOptimized")(recalculateOptimized)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("setVariable")(setVariable)
    __obj.updateDynamic("sheet")(sheet)
    __obj.updateDynamic("undoRedoSnapshot")(undoRedoSnapshot)
    __obj.asInstanceOf[Formulas]
  }
}

