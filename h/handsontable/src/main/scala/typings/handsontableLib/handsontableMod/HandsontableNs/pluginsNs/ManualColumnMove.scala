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
  def persistentStateLoad(): scala.Unit
  def persistentStateSave(): scala.Unit
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    columnsMapper: MoveColumnsMapper,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    moveColumn: (scala.Double, scala.Double) => scala.Unit,
    moveColumns: (js.Array[scala.Double], scala.Double) => scala.Unit,
    persistentStateLoad: () => scala.Unit,
    persistentStateSave: () => scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit,
    removedColumns: js.Array[_]
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), columnsMapper = columnsMapper, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, guideline = guideline, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, moveColumn = js.Any.fromFunction2(moveColumn), moveColumns = js.Any.fromFunction2(moveColumns), persistentStateLoad = js.Any.fromFunction0(persistentStateLoad), persistentStateSave = js.Any.fromFunction0(persistentStateSave), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), removedColumns = removedColumns)
  
    __obj.asInstanceOf[ManualColumnMove]
  }
}

