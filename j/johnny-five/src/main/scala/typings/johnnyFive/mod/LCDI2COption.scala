package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LCDI2COption extends LCDGeneralOption {
  
  var backlight: js.UndefOr[Double] = js.native
  
  var controller: String = js.native
}
object LCDI2COption {
  
  @scala.inline
  def apply(controller: String): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
  
  @scala.inline
  implicit class LCDI2COptionMutableBuilder[Self <: LCDI2COption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklight(value: Double): Self = StObject.set(x, "backlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklightUndefined: Self = StObject.set(x, "backlight", js.undefined)
    
    @scala.inline
    def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
  }
}
