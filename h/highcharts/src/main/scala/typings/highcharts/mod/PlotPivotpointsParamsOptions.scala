package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPivotpointsParamsOptions extends StObject {
  
  /**
    * (Highstock) Algorithm used to calculate ressistance and support lines
    * based on pivot points. Implemented algorithms: `'standard'`,
    * `'fibonacci'` and `'camarilla'`
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[Double] = js.undefined
}
object PlotPivotpointsParamsOptions {
  
  inline def apply(): PlotPivotpointsParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPivotpointsParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPivotpointsParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
