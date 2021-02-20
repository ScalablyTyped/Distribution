package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPsarParamsOptions extends StObject {
  
  /**
    * (Highstock) Number of maximum decimals that are used in PSAR
    * calculations.
    */
  var decimals: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Acceleration factor increases by increment each time the
    * extreme point makes a new high.
    */
  var increment: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) Index from which PSAR is starting calculation
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The initial value for acceleration factor. Acceleration
    * factor is starting with this value and increases by specified increment
    * each time the extreme point makes a new high. AF can reach a maximum of
    * maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.native
  
  /**
    * (Highstock) The Maximum value for acceleration factor. AF can reach a
    * maximum of maxAccelerationFactor, no matter how long the uptrend extends.
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.native
}
object PlotPsarParamsOptions {
  
  @scala.inline
  def apply(): PlotPsarParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPsarParamsOptions]
  }
  
  @scala.inline
  implicit class PlotPsarParamsOptionsMutableBuilder[Self <: PlotPsarParamsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setInitialAccelerationFactor(value: Double): Self = StObject.set(x, "initialAccelerationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAccelerationFactorUndefined: Self = StObject.set(x, "initialAccelerationFactor", js.undefined)
    
    @scala.inline
    def setMaxAccelerationFactor(value: Double): Self = StObject.set(x, "maxAccelerationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAccelerationFactorUndefined: Self = StObject.set(x, "maxAccelerationFactor", js.undefined)
  }
}
