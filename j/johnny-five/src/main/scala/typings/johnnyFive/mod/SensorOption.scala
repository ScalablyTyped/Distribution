package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorOption extends StObject {
  
  var board: js.UndefOr[Board] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var freq: js.UndefOr[Double] = js.undefined
  
  var pin: Double | String
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object SensorOption {
  
  inline def apply(pin: Double | String): SensorOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensorOption] (val x: Self) extends AnyVal {
    
    inline def setBoard(value: Board): Self = StObject.set(x, "board", value.asInstanceOf[js.Any])
    
    inline def setBoardUndefined: Self = StObject.set(x, "board", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
