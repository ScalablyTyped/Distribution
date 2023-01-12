package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCDI2COption
  extends StObject
     with LCDGeneralOption {
  
  var backlight: js.UndefOr[Double] = js.undefined
  
  var controller: String
}
object LCDI2COption {
  
  inline def apply(controller: String): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LCDI2COption] (val x: Self) extends AnyVal {
    
    inline def setBacklight(value: Double): Self = StObject.set(x, "backlight", value.asInstanceOf[js.Any])
    
    inline def setBacklightUndefined: Self = StObject.set(x, "backlight", js.undefined)
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
  }
}
