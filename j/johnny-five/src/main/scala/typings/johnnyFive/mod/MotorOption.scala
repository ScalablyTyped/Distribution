package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotorOption extends StObject {
  
  var address: js.UndefOr[Double] = js.undefined
  
  var bits: js.UndefOr[js.Any] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var current: js.UndefOr[SensorOption] = js.undefined
  
  var invertPWM: js.UndefOr[Boolean] = js.undefined
  
  var pins: MotorPins
  
  var register: js.UndefOr[js.Any] = js.undefined
}
object MotorOption {
  
  @scala.inline
  def apply(pins: MotorPins): MotorOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorOption]
  }
  
  @scala.inline
  implicit class MotorOptionMutableBuilder[Self <: MotorOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setBits(value: js.Any): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setCurrent(value: SensorOption): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setInvertPWM(value: Boolean): Self = StObject.set(x, "invertPWM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertPWMUndefined: Self = StObject.set(x, "invertPWM", js.undefined)
    
    @scala.inline
    def setPins(value: MotorPins): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: js.Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
