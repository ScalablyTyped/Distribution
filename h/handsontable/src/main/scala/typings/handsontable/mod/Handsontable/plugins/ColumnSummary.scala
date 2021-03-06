package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSummary extends Base {
  
  def calculate(endpoint: Endpoints): Unit = js.native
  
  def calculateAverage(endpoint: Endpoints): Double = js.native
  
  def calculateMinMax(endpoint: Endpoints, `type`: String): Double = js.native
  
  def calculateSum(endpoint: Endpoints): Unit = js.native
  
  def countEmpty(rowRange: js.Array[_], col: Double): Double = js.native
  
  def countEntries(endpoint: Endpoints): Double = js.native
  
  var endpoints: Endpoints | Unit = js.native
  
  def getCellValue(row: Double, col: Double): String = js.native
  
  def getPartialMinMax(rowRange: js.Array[_], col: Double, `type`: String): Double = js.native
  
  def getPartialSum(rowRange: js.Array[_], col: Double): Double = js.native
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
    updatePlugin: () => Unit
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), calculate = js.Any.fromFunction1(calculate), calculateAverage = js.Any.fromFunction1(calculateAverage), calculateMinMax = js.Any.fromFunction2(calculateMinMax), calculateSum = js.Any.fromFunction1(calculateSum), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), countEmpty = js.Any.fromFunction2(countEmpty), countEntries = js.Any.fromFunction1(countEntries), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], getCellValue = js.Any.fromFunction2(getCellValue), getPartialMinMax = js.Any.fromFunction3(getPartialMinMax), getPartialSum = js.Any.fromFunction2(getPartialSum), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ColumnSummary]
  }
  
  @scala.inline
  implicit class ColumnSummaryMutableBuilder[Self <: ColumnSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: Endpoints => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateAverage(value: Endpoints => Double): Self = StObject.set(x, "calculateAverage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateMinMax(value: (Endpoints, String) => Double): Self = StObject.set(x, "calculateMinMax", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCalculateSum(value: Endpoints => Unit): Self = StObject.set(x, "calculateSum", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCountEmpty(value: (js.Array[_], Double) => Double): Self = StObject.set(x, "countEmpty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCountEntries(value: Endpoints => Double): Self = StObject.set(x, "countEntries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndpoints(value: Endpoints | Unit): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellValue(value: (Double, Double) => String): Self = StObject.set(x, "getCellValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPartialMinMax(value: (js.Array[_], Double, String) => Double): Self = StObject.set(x, "getPartialMinMax", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPartialSum(value: (js.Array[_], Double) => Double): Self = StObject.set(x, "getPartialSum", js.Any.fromFunction2(value))
  }
}
