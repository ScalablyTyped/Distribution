package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProximityOption extends StObject {
  
  var controller: String
  
  var pin: Double | String
}
object ProximityOption {
  
  @scala.inline
  def apply(controller: String, pin: Double | String): ProximityOption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityOption]
  }
  
  @scala.inline
  implicit class ProximityOptionMutableBuilder[Self <: ProximityOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
