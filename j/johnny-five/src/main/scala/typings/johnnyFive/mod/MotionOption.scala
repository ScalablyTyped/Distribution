package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionOption extends StObject {
  
  var pin: Double | String
}
object MotionOption {
  
  inline def apply(pin: Double | String): MotionOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionOption] (val x: Self) extends AnyVal {
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
