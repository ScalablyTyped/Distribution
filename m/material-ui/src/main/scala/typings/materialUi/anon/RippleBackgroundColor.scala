package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RippleBackgroundColor extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var rippleBackgroundColor: js.UndefOr[String] = js.undefined
}
object RippleBackgroundColor {
  
  @scala.inline
  def apply(): RippleBackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleBackgroundColor]
  }
  
  @scala.inline
  implicit class RippleBackgroundColorMutableBuilder[Self <: RippleBackgroundColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setRippleBackgroundColor(value: String): Self = StObject.set(x, "rippleBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleBackgroundColorUndefined: Self = StObject.set(x, "rippleBackgroundColor", js.undefined)
  }
}
