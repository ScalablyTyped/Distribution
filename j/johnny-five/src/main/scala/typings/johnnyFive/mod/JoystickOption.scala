package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoystickOption extends StObject {
  
  var invert: js.UndefOr[Boolean] = js.native
  
  var invertX: js.UndefOr[Boolean] = js.native
  
  var invertY: js.UndefOr[Boolean] = js.native
  
  var pins: js.Array[String] = js.native
}
object JoystickOption {
  
  @scala.inline
  def apply(pins: js.Array[String]): JoystickOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoystickOption]
  }
  
  @scala.inline
  implicit class JoystickOptionMutableBuilder[Self <: JoystickOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setInvertX(value: Boolean): Self = StObject.set(x, "invertX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertXUndefined: Self = StObject.set(x, "invertX", js.undefined)
    
    @scala.inline
    def setInvertY(value: Boolean): Self = StObject.set(x, "invertY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertYUndefined: Self = StObject.set(x, "invertY", js.undefined)
    
    @scala.inline
    def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value :_*))
  }
}
