package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.NC
import typings.johnnyFive.johnnyFiveStrings.NO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchOption extends StObject {
  
  var pin: Double | String
  
  var `type`: js.UndefOr[NO | NC] = js.undefined
}
object SwitchOption {
  
  @scala.inline
  def apply(pin: Double | String): SwitchOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOption]
  }
  
  @scala.inline
  implicit class SwitchOptionMutableBuilder[Self <: SwitchOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NO | NC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
