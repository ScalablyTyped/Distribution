package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayOption extends StObject {
  
  var pin: Double | String = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object RelayOption {
  
  @scala.inline
  def apply(pin: Double | String): RelayOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayOption]
  }
  
  @scala.inline
  implicit class RelayOptionMutableBuilder[Self <: RelayOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
