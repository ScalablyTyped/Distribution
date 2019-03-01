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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("freezeColumn")(freezeColumn)
    __obj.updateDynamic("frozenColumnsBasePositions")(frozenColumnsBasePositions)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("manualColumnMovePlugin")(manualColumnMovePlugin)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("unfreezeColumn")(unfreezeColumn)
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

