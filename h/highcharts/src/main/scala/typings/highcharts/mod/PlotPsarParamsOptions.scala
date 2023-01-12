package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPsarParamsOptions extends StObject {
  
  /**
    * (Highstock) Number of maximum decimals that are used in PSAR
    * calculations.
    */
  var decimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Acceleration factor increases by increment each time the
    * extreme point makes a new high.
    */
  var increment: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Index from which PSAR is starting calculation
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The initial value for acceleration factor. Acceleration
    * factor is starting with this value and increases by specified increment
    * each time the extreme point makes a new high. AF can reach a maximum of
    * maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The Maximum value for acceleration factor. AF can reach a
    * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The base period for indicator calculations. This is the
    * number of data points which are taken into account for the indicator
    * calculations.
    */
  var period: js.UndefOr[String] = js.undefined
}
object PlotPsarParamsOptions {
  
  inline def apply(): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotPsarParamsOptions] (val x: Self) extends AnyVal {
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setInitialAccelerationFactor(value: Double): Self = StObject.set(x, "initialAccelerationFactor", value.asInstanceOf[js.Any])
    
    inline def setInitialAccelerationFactorUndefined: Self = StObject.set(x, "initialAccelerationFactor", js.undefined)
    
    inline def setMaxAccelerationFactor(value: Double): Self = StObject.set(x, "maxAccelerationFactor", value.asInstanceOf[js.Any])
    
    inline def setMaxAccelerationFactorUndefined: Self = StObject.set(x, "maxAccelerationFactor", js.undefined)
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
