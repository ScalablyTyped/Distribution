package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonOption extends StObject {
  
  var holdtime: js.UndefOr[Double] = js.undefined
  
  var invert: js.UndefOr[Boolean] = js.undefined
  
  var isPulldown: js.UndefOr[Boolean] = js.undefined
  
  var isPullup: js.UndefOr[Boolean] = js.undefined
  
  var pin: Double | String
}
object ButtonOption {
  
  @scala.inline
  def apply(pin: Double | String): ButtonOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOption]
  }
  
  @scala.inline
  implicit class ButtonOptionMutableBuilder[Self <: ButtonOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoldtime(value: Double): Self = StObject.set(x, "holdtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldtimeUndefined: Self = StObject.set(x, "holdtime", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setIsPulldown(value: Boolean): Self = StObject.set(x, "isPulldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPulldownUndefined: Self = StObject.set(x, "isPulldown", js.undefined)
    
    @scala.inline
    def setIsPullup(value: Boolean): Self = StObject.set(x, "isPullup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPullupUndefined: Self = StObject.set(x, "isPullup", js.undefined)
    
    @scala.inline
    def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
  }
}
