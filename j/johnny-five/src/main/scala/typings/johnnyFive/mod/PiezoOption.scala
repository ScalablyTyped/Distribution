package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PiezoOption extends StObject {
  
  var pin: Double = js.native
}
object PiezoOption {
  
  @scala.inline
  def apply(pin: Double): PiezoOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PiezoOption]
  }
  
  @scala.inline
  implicit class PiezoOptionMutableBuilder[Self <: PiezoOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPin(value: Double): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
