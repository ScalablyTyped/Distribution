package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimRows extends Base {
  var removedRows: js.Array[_]
  var rowsMapper: TrimRowsMapper
  var trimmedRows: js.Array[_]
  def isTrimmed(row: scala.Double): scala.Boolean
  def trimRow(row: scala.Double): scala.Unit
  def trimRows(rows: js.Array[scala.Double]): scala.Unit
  def untrimAll(): scala.Unit
  def untrimRow(row: scala.Double): scala.Unit
  def untrimRows(rows: js.Array[scala.Double]): scala.Unit
}

object TrimRows {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    isTrimmed: js.Function1[scala.Double, scala.Boolean],
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    removedRows: js.Array[_],
    rowsMapper: TrimRowsMapper,
    trimRow: js.Function1[scala.Double, scala.Unit],
    trimRows: js.Function1[js.Array[scala.Double], scala.Unit],
    trimmedRows: js.Array[_],
    untrimAll: js.Function0[scala.Unit],
    untrimRow: js.Function1[scala.Double, scala.Unit],
    untrimRows: js.Function1[js.Array[scala.Double], scala.Unit]
  ): TrimRows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("isTrimmed")(isTrimmed)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.updateDynamic("removedRows")(removedRows)
    __obj.updateDynamic("rowsMapper")(rowsMapper)
    __obj.updateDynamic("trimRow")(trimRow)
    __obj.updateDynamic("trimRows")(trimRows)
    __obj.updateDynamic("trimmedRows")(trimmedRows)
    __obj.updateDynamic("untrimAll")(untrimAll)
    __obj.updateDynamic("untrimRow")(untrimRow)
    __obj.updateDynamic("untrimRows")(untrimRows)
    __obj.asInstanceOf[TrimRows]
  }
}

