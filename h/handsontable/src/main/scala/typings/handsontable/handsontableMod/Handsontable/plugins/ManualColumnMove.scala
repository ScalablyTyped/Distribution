package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.handsontableMod.Handsontable.plugins.moveUI.GuidelineUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnMove extends Base {
  var backlight: BacklightUI
  var columnsMapper: MoveColumnsMapper
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
  var guideline: GuidelineUI
  var removedColumns: js.Array[_]
  def moveColumn(column: Double, target: Double): Unit
  def moveColumns(columns: js.Array[Double], target: Double): Unit
  def persistentStateLoad(): Unit
  def persistentStateSave(): Unit
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    columnsMapper: MoveColumnsMapper,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager,
    guideline: GuidelineUI,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    moveColumn: (Double, Double) => Unit,
    moveColumns: (js.Array[Double], Double) => Unit,
    persistentStateLoad: () => Unit,
    persistentStateSave: () => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    removedColumns: js.Array[_]
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight, callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), columnsMapper = columnsMapper, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, guideline = guideline, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, moveColumn = js.Any.fromFunction2(moveColumn), moveColumns = js.Any.fromFunction2(moveColumns), persistentStateLoad = js.Any.fromFunction0(persistentStateLoad), persistentStateSave = js.Any.fromFunction0(persistentStateSave), pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), removedColumns = removedColumns)
  
    __obj.asInstanceOf[ManualColumnMove]
  }
}

