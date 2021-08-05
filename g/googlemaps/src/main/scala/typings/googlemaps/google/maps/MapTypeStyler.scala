package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeStyler extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var gamma: js.UndefOr[Double] = js.undefined
  
  var hue: js.UndefOr[String] = js.undefined
  
  var invert_lightness: js.UndefOr[Boolean] = js.undefined
  
  var lightness: js.UndefOr[Double] = js.undefined
  
  var saturation: js.UndefOr[Double] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object MapTypeStyler {
  
  inline def apply(): MapTypeStyler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeStyler]
  }
  
  extension [Self <: MapTypeStyler](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setHue(value: String): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setInvert_lightness(value: Boolean): Self = StObject.set(x, "invert_lightness", value.asInstanceOf[js.Any])
    
    inline def setInvert_lightnessUndefined: Self = StObject.set(x, "invert_lightness", js.undefined)
    
    inline def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
    
    inline def setLightnessUndefined: Self = StObject.set(x, "lightness", js.undefined)
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
