package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSummary extends BasePlugin {
  var endpoints: Endpoints | Unit
  def calculate(endpoint: Endpoints): Unit
  def calculateAverage(endpoint: Endpoints): Double
  def calculateMinMax(endpoint: Endpoints, `type`: String): Double
  def calculateSum(endpoint: Endpoints): Unit
  def countEmpty(rowRange: js.Array[_], col: Double): Double
  def countEntries(endpoint: Endpoints): Double
  def getCellValue(row: Double, col: Double): String
  def getPartialMinMax(rowRange: js.Array[_], col: Double, `type`: String): Double
  def getPartialSum(rowRange: js.Array[_], col: Double): Double
}

object ColumnSummary {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    calculate: Endpoints => Unit,
    calculateAverage: Endpoints => Double,
    calculateMinMax: (Endpoints, String) => Double,
    calculateSum: Endpoints => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    countEmpty: (js.Array[_], Double) => Double,
    countEntries: Endpoints => Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    endpoints: Endpoints | Unit,
    getCellValue: (Double, Double) => String,
    getPartialMinMax: (js.Array[_], Double, String) => Double,
    getPartialSum: (js.Array[_], Double) => Double,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), calculate = js.Any.fromFunction1(calculate), calculateAverage = js.Any.fromFunction1(calculateAverage), calculateMinMax = js.Any.fromFunction2(calculateMinMax), calculateSum = js.Any.fromFunction1(calculateSum), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), countEmpty = js.Any.fromFunction2(countEmpty), countEntries = js.Any.fromFunction1(countEntries), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, endpoints = endpoints.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getPartialMinMax = js.Any.fromFunction3(getPartialMinMax), getPartialSum = js.Any.fromFunction2(getPartialSum), hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, removeHooks = js.Any.fromFunction1(removeHooks), t = t, updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[ColumnSummary]
  }
}

