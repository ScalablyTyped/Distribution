package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSummary extends Base {
  var endpoints: Endpoints | scala.Unit
  def calculate(endpoint: Endpoints): scala.Unit
  def calculateAverage(endpoint: Endpoints): scala.Double
  def calculateMinMax(endpoint: Endpoints, `type`: java.lang.String): scala.Double
  def calculateSum(endpoint: Endpoints): scala.Unit
  def countEmpty(rowRange: js.Array[_], col: scala.Double): scala.Double
  def countEntries(endpoint: Endpoints): scala.Double
  def getCellValue(row: scala.Double, col: scala.Double): java.lang.String
  def getPartialMinMax(rowRange: js.Array[_], col: scala.Double, `type`: java.lang.String): scala.Double
  def getPartialSum(rowRange: js.Array[_], col: scala.Double): scala.Double
}

object ColumnSummary {
  @scala.inline
  def apply(
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    calculate: js.Function1[Endpoints, scala.Unit],
    calculateAverage: js.Function1[Endpoints, scala.Double],
    calculateMinMax: js.Function2[Endpoints, java.lang.String, scala.Double],
    calculateSum: js.Function1[Endpoints, scala.Unit],
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    clearHooks: js.Function0[scala.Unit],
    countEmpty: js.Function2[js.Array[_], scala.Double, scala.Double],
    countEntries: js.Function1[Endpoints, scala.Double],
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    endpoints: Endpoints | scala.Unit,
    getCellValue: js.Function2[scala.Double, scala.Double, java.lang.String],
    getPartialMinMax: js.Function3[js.Array[_], scala.Double, java.lang.String, scala.Double],
    getPartialSum: js.Function2[js.Array[_], scala.Double, scala.Double],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHook: js.Function1[java.lang.String, scala.Unit]
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHook")(addHook)
    __obj.updateDynamic("calculate")(calculate)
    __obj.updateDynamic("calculateAverage")(calculateAverage)
    __obj.updateDynamic("calculateMinMax")(calculateMinMax)
    __obj.updateDynamic("calculateSum")(calculateSum)
    __obj.updateDynamic("callOnPluginsReady")(callOnPluginsReady)
    __obj.updateDynamic("clearHooks")(clearHooks)
    __obj.updateDynamic("countEmpty")(countEmpty)
    __obj.updateDynamic("countEntries")(countEntries)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("disablePlugin")(disablePlugin)
    __obj.updateDynamic("enablePlugin")(enablePlugin)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    __obj.updateDynamic("getCellValue")(getCellValue)
    __obj.updateDynamic("getPartialMinMax")(getPartialMinMax)
    __obj.updateDynamic("getPartialSum")(getPartialSum)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("isPluginsReady")(isPluginsReady)
    __obj.updateDynamic("pluginName")(pluginName)
    __obj.updateDynamic("pluginsInitializedCallback")(pluginsInitializedCallback)
    __obj.updateDynamic("removeHook")(removeHook)
    __obj.asInstanceOf[ColumnSummary]
  }
}

