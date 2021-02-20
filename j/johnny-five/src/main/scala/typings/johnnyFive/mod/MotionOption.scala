package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionOption extends StObject {
  
  var pin: Double | String = js.native
}
object MotionOption {
  
  @scala.inline
  def apply(pin: Double | String): MotionOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionOption]
  }
  
  @scala.inline
  implicit class MotionOptionMutableBuilder[Self <: MotionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
