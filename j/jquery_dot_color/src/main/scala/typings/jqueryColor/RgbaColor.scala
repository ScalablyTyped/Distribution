package typings.jqueryColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RgbaColor extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var blue: js.UndefOr[Double] = js.undefined
  
  var green: js.UndefOr[Double] = js.undefined
  
  var red: js.UndefOr[Double] = js.undefined
}
object RgbaColor {
  
  inline def apply(): RgbaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RgbaColor]
  }
  
  extension [Self <: RgbaColor](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
