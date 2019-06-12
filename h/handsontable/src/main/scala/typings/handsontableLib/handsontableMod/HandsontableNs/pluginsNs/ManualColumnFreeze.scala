package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnFreeze extends Base {
  var frozenColumnsBasePositions: js.Array[_]
  var manualColumnMovePlugin: ManualColumnMove
  def freezeColumn(column: scala.Double): scala.Unit
  def unfreezeColumn(column: scala.Double): scala.Unit
}

object ManualColumnFreeze {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    freezeColumn: scala.Double => scala.Unit,
    frozenColumnsBasePositions: js.Array[_],
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    manualColumnMovePlugin: ManualColumnMove,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit,
    unfreezeColumn: scala.Double => scala.Unit
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, freezeColumn = js.Any.fromFunction1(freezeColumn), frozenColumnsBasePositions = frozenColumnsBasePositions, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, manualColumnMovePlugin = manualColumnMovePlugin, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), unfreezeColumn = js.Any.fromFunction1(unfreezeColumn))
  
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

