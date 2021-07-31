package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.DEFAULT
import typings.johnnyFive.johnnyFiveStrings.FORWARD
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE_BRAKE
import typings.johnnyFive.johnnyFiveStrings.PCA9685
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ESCOption extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var controller: js.UndefOr[PCA9685 | DEFAULT] = js.undefined
  
  var device: js.UndefOr[FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE] = js.undefined
  
  var neutral: js.UndefOr[Double] = js.undefined
  
  var pin: Double | String
  
  var pwmRange: js.UndefOr[js.Array[Double]] = js.undefined
}
object ESCOption {
  
  @scala.inline
  def apply(pin: Double | String): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
  
  @scala.inline
  implicit class ESCOptionMutableBuilder[Self <: ESCOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setController(value: PCA9685 | DEFAULT): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setDevice(value: FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setNeutral(value: Double): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwmRange(value: js.Array[Double]): Self = StObject.set(x, "pwmRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwmRangeUndefined: Self = StObject.set(x, "pwmRange", js.undefined)
    
    @scala.inline
    def setPwmRangeVarargs(value: Double*): Self = StObject.set(x, "pwmRange", js.Array(value :_*))
  }
}
