package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotorOption extends StObject {
  
  var address: js.UndefOr[Double] = js.undefined
  
  var bits: js.UndefOr[Any] = js.undefined
  
  var controller: js.UndefOr[String] = js.undefined
  
  var current: js.UndefOr[SensorOption] = js.undefined
  
  var invertPWM: js.UndefOr[Boolean] = js.undefined
  
  var pins: MotorPins
  
  var register: js.UndefOr[Any] = js.undefined
}
object MotorOption {
  
  inline def apply(pins: MotorPins): MotorOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorOption]
  }
  
  extension [Self <: MotorOption](x: Self) {
    
    inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBits(value: Any): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    
    inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setCurrent(value: SensorOption): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setInvertPWM(value: Boolean): Self = StObject.set(x, "invertPWM", value.asInstanceOf[js.Any])
    
    inline def setInvertPWMUndefined: Self = StObject.set(x, "invertPWM", js.undefined)
    
    inline def setPins(value: MotorPins): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setRegister(value: Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
