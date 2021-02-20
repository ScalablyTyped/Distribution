package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PingOption extends StObject {
  
  var freq: js.UndefOr[Double] = js.native
  
  var pin: Double | String = js.native
  
  var pulse: js.UndefOr[Double] = js.native
}
object PingOption {
  
  @scala.inline
  def apply(pin: Double | String): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
  
  @scala.inline
  implicit class PingOptionMutableBuilder[Self <: PingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPulse(value: Double): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
  }
}
