package typings.handsontable.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnFreeze extends Base {
  var frozenColumnsBasePositions: js.Array[_]
  var manualColumnMovePlugin: ManualColumnMove
  def freezeColumn(column: Double): Unit
  def unfreezeColumn(column: Double): Unit
}

object ManualColumnFreeze {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    freezeColumn: Double => Unit,
    frozenColumnsBasePositions: js.Array[_],
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    manualColumnMovePlugin: ManualColumnMove,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    unfreezeColumn: Double => Unit
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, freezeColumn = js.Any.fromFunction1(freezeColumn), frozenColumnsBasePositions = frozenColumnsBasePositions, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, manualColumnMovePlugin = manualColumnMovePlugin, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), unfreezeColumn = js.Any.fromFunction1(unfreezeColumn))
  
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

