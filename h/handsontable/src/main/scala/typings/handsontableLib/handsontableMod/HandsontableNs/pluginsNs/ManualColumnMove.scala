package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnMove extends Base {
  var backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI
  var columnsMapper: MoveColumnsMapper
  var eventManager: EventManager
  var guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI
  var removedColumns: js.Array[_]
  def moveColumn(column: scala.Double, target: scala.Double): scala.Unit
  def moveColumns(columns: js.Array[scala.Double], target: scala.Double): scala.Unit
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    columnsMapper: MoveColumnsMapper,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    moveColumn: js.Function2[scala.Double, scala.Double, scala.Unit],
    moveColumns: js.Function2[js.Array[scala.Double], scala.Double, scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    removedColumns: js.Array[_]
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = addHook, backlight = backlight, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, columnsMapper = columnsMapper, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, guideline = guideline, init = init, initialized = initialized, isPluginsReady = isPluginsReady, moveColumn = moveColumn, moveColumns = moveColumns, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, removedColumns = removedColumns)
  
    __obj.asInstanceOf[ManualColumnMove]
  }
}

