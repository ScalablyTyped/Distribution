package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCDParallelOption
  extends StObject
     with LCDGeneralOption {
  
  var backlight: js.UndefOr[Double] = js.undefined
  
  var pins: js.Array[js.Any]
}
object LCDParallelOption {
  
  @scala.inline
  def apply(pins: js.Array[js.Any]): LCDParallelOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDParallelOption]
  }
  
  @scala.inline
  implicit class LCDParallelOptionMutableBuilder[Self <: LCDParallelOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklight(value: Double): Self = StObject.set(x, "backlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBacklightUndefined: Self = StObject.set(x, "backlight", js.undefined)
    
    @scala.inline
    def setPins(value: js.Array[js.Any]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: js.Any*): Self = StObject.set(x, "pins", js.Array(value :_*))
  }
}
