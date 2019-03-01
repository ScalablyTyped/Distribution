package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRowMove extends Base {
  var backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI
  var eventManager: EventManager
  var guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI
  var removedRows: js.Array[_]
  var rowsMapper: MoveRowsMapper
  def moveRow(row: scala.Double, target: scala.Double): scala.Unit
  def moveRows(rows: js.Array[scala.Double], target: scala.Double): scala.Unit
}

object ManualRowMove {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    backlight: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.BacklightUI,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    guideline: handsontableLib.handsontableMod.HandsontableNs.pluginsNs.moveUINs.GuidelineUI,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    moveRow: js.Function2[scala.Double, scala.Double, scala.Unit],
    moveRows: js.Function2[js.Array[scala.Double], scala.Double, scala.Unit],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    removedRows: js.Array[_],
    rowsMapper: MoveRowsMapper
  ): ManualRowMove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("backlight")(backlight)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("eventManager")(eventManager)
    __obj.updateDynamic("guideline")(guideline)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("moveRow")(moveRow)
    __obj.updateDynamic("moveRows")(moveRows)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("removedRows")(removedRows)
    __obj.updateDynamic("rowsMapper")(rowsMapper)
    __obj.asInstanceOf[ManualRowMove]
  }
}

