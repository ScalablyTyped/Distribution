package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServoPCA9685Option
  extends StObject
     with ServoGeneralOption {
  
  var address: js.UndefOr[Double] = js.undefined
}
object ServoPCA9685Option {
  
  inline def apply(pin: Double | String): ServoPCA9685Option = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoPCA9685Option]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServoPCA9685Option] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
  }
}
