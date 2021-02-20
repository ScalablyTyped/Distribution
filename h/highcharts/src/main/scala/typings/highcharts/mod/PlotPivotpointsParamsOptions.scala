package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPivotpointsParamsOptions extends StObject {
  
  /**
    * (Highstock) Algorithm used to calculate ressistance and support lines
    * based on pivot points. Implemented algorithms: `'standard'`,
    * `'fibonacci'` and `'camarilla'`
    */
  var algorithm: js.UndefOr[String] = js.native
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.native
}
object PlotPivotpointsParamsOptions {
  
  @scala.inline
  def apply(): PlotPivotpointsParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPivotpointsParamsOptions]
  }
  
  @scala.inline
  implicit class PlotPivotpointsParamsOptionsMutableBuilder[Self <: PlotPivotpointsParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
