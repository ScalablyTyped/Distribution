package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorOption extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var freq: js.UndefOr[Boolean] = js.undefined
  
  var pin: Double | String
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object SensorOption {
  
  @scala.inline
  def apply(pin: Double | String): SensorOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOption]
  }
  
  @scala.inline
  implicit class SensorOptionMutableBuilder[Self <: SensorOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFreq(value: Boolean): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
