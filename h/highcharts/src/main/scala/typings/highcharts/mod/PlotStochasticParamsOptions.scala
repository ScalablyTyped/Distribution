package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotStochasticParamsOptions extends StObject {
  
  /**
    * (Highstock) Periods for Stochastic oscillator: [%K, %D].
    */
  var periods: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object PlotStochasticParamsOptions {
  
  @scala.inline
  def apply(): PlotStochasticParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotStochasticParamsOptions]
  }
  
  @scala.inline
  implicit class PlotStochasticParamsOptionsMutableBuilder[Self <: PlotStochasticParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriods(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodsUndefined: Self = StObject.set(x, "periods", js.undefined)
  }
}
