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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    freezeColumn: js.Function1[scala.Double, scala.Unit],
    frozenColumnsBasePositions: js.Array[_],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    manualColumnMovePlugin: ManualColumnMove,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    unfreezeColumn: js.Function1[scala.Double, scala.Unit]
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(addHook = addHook, callOnPluginsReady = callOnPluginsReady, clearHooks = clearHooks, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, freezeColumn = freezeColumn, frozenColumnsBasePositions = frozenColumnsBasePositions, init = init, initialized = initialized, isPluginsReady = isPluginsReady, manualColumnMovePlugin = manualColumnMovePlugin, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHook = removeHook, unfreezeColumn = unfreezeColumn)
  
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

