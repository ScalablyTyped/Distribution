package typings.jqueryColor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HslaColor extends StObject {
  
  var alpha: js.UndefOr[Double] = js.undefined
  
  var hue: js.UndefOr[Double] = js.undefined
  
  var lightness: js.UndefOr[Double] = js.undefined
  
  var saturation: js.UndefOr[Double] = js.undefined
}
object HslaColor {
  
  inline def apply(): HslaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HslaColor]
  }
  
  extension [Self <: HslaColor](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
    
    inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
  }
}
