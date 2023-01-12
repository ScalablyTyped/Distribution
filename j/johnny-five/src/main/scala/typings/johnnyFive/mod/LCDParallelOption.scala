package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCDParallelOption
  extends StObject
     with LCDGeneralOption {
  
  var backlight: js.UndefOr[Double] = js.undefined
  
  var pins: js.Array[Any]
}
object LCDParallelOption {
  
  inline def apply(pins: js.Array[Any]): LCDParallelOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDParallelOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LCDParallelOption] (val x: Self) extends AnyVal {
    
    inline def setBacklight(value: Double): Self = StObject.set(x, "backlight", value.asInstanceOf[js.Any])
    
    inline def setBacklightUndefined: Self = StObject.set(x, "backlight", js.undefined)
    
    inline def setPins(value: js.Array[Any]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsVarargs(value: Any*): Self = StObject.set(x, "pins", js.Array(value*))
  }
}
