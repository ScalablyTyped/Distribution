package typings.jqueryColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RgbaColor extends StObject {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var blue: js.UndefOr[Double] = js.native
  
  var green: js.UndefOr[Double] = js.native
  
  var red: js.UndefOr[Double] = js.native
}
object RgbaColor {
  
  @scala.inline
  def apply(): RgbaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbaColor]
  }
  
  @scala.inline
  implicit class RgbaColorMutableBuilder[Self <: RgbaColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
