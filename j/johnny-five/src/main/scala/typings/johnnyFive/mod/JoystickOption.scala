package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoystickOption extends StObject {
  
  var invert: js.UndefOr[Boolean] = js.undefined
  
  var invertX: js.UndefOr[Boolean] = js.undefined
  
  var invertY: js.UndefOr[Boolean] = js.undefined
  
  var pins: js.Array[String]
}
object JoystickOption {
  
  inline def apply(pins: js.Array[String]): JoystickOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoystickOption]
  }
  
  extension [Self <: JoystickOption](x: Self) {
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setInvertX(value: Boolean): Self = StObject.set(x, "invertX", value.asInstanceOf[js.Any])
    
    inline def setInvertXUndefined: Self = StObject.set(x, "invertX", js.undefined)
    
    inline def setInvertY(value: Boolean): Self = StObject.set(x, "invertY", value.asInstanceOf[js.Any])
    
    inline def setInvertYUndefined: Self = StObject.set(x, "invertY", js.undefined)
    
    inline def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value*))
  }
}
