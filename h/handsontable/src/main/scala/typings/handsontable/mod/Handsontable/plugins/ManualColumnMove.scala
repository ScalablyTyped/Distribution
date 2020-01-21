package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnMove extends Base {
  var backlight: BacklightUI
  var columnsMapper: MoveColumnsMapper
  var eventManager: EventManager
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
    eventManager: EventManager,
    guideline: GuidelineUI,
    hot: Core,
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
    removedColumns: js.Array[_],
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), columnsMapper = columnsMapper.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], moveColumn = js.Any.fromFunction2(moveColumn), moveColumns = js.Any.fromFunction2(moveColumns), persistentStateLoad = js.Any.fromFunction0(persistentStateLoad), persistentStateSave = js.Any.fromFunction0(persistentStateSave), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), removedColumns = removedColumns.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[ManualColumnMove]
  }
}

