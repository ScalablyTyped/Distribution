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
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    calculate: Endpoints => scala.Unit,
    calculateAverage: Endpoints => scala.Double,
    calculateMinMax: (Endpoints, java.lang.String) => scala.Double,
    calculateSum: Endpoints => scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    clearHooks: () => scala.Unit,
    countEmpty: (js.Array[_], scala.Double) => scala.Double,
    countEntries: Endpoints => scala.Double,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    endpoints: Endpoints | scala.Unit,
    getCellValue: (scala.Double, scala.Double) => java.lang.String,
    getPartialMinMax: (js.Array[_], scala.Double, java.lang.String) => scala.Double,
    getPartialSum: (js.Array[_], scala.Double) => scala.Double,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: java.lang.String => scala.Unit
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), calculate = js.Any.fromFunction1(calculate), calculateAverage = js.Any.fromFunction1(calculateAverage), calculateMinMax = js.Any.fromFunction2(calculateMinMax), calculateSum = js.Any.fromFunction1(calculateSum), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), countEmpty = js.Any.fromFunction2(countEmpty), countEntries = js.Any.fromFunction1(countEntries), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, endpoints = endpoints.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getPartialMinMax = js.Any.fromFunction3(getPartialMinMax), getPartialSum = js.Any.fromFunction2(getPartialSum), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks))
  
    __obj.asInstanceOf[ColumnSummary]
  }
}

