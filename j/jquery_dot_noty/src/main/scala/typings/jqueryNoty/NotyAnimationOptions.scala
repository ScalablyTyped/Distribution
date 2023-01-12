package typings.jqueryNoty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotyAnimationOptions extends StObject {
  
  var close: js.UndefOr[Any] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var open: js.UndefOr[Any] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object NotyAnimationOptions {
  
  inline def apply(): NotyAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotyAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
