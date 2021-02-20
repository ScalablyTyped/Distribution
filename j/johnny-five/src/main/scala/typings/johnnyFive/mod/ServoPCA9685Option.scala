package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServoPCA9685Option extends ServoGeneralOption {
  
  var address: js.UndefOr[Double] = js.native
}
object ServoPCA9685Option {
  
  @scala.inline
  def apply(pin: Double | String): ServoPCA9685Option = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoPCA9685Option]
  }
  
  @scala.inline
  implicit class ServoPCA9685OptionMutableBuilder[Self <: ServoPCA9685Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Double): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
  }
}
