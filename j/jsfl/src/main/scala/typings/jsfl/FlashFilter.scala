package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashFilter extends StObject {
  
  var angle: Double
  
  var blurX: Double
  
  var blurY: Double
  
  var brightness: Double
  
  var color: js.Any
  
  var contrast: Double
  
  var distance: Double
  
  var enabled: Boolean
  
  var hideObject: Boolean
  
  var highlightColor: js.Any
  
  var hue: Double
  
  var inner: Boolean
  
  var knockout: Boolean
  
  var name: String
  
  var quality: String
  
  var saturation: Double
  
  var shadowColor: js.Any
  
  var strength: Double
  
  var `type`: String
}
object FlashFilter {
  
  @scala.inline
  def apply(
    angle: Double,
    blurX: Double,
    blurY: Double,
    brightness: Double,
    color: js.Any,
    contrast: Double,
    distance: Double,
    enabled: Boolean,
    hideObject: Boolean,
    highlightColor: js.Any,
    hue: Double,
    inner: Boolean,
    knockout: Boolean,
    name: String,
    quality: String,
    saturation: Double,
    shadowColor: js.Any,
    strength: Double,
    `type`: String
  ): FlashFilter = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], blurX = blurX.asInstanceOf[js.Any], blurY = blurY.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hideObject = hideObject.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], knockout = knockout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFilter]
  }
  
  @scala.inline
  implicit class FlashFilterMutableBuilder[Self <: FlashFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurX(value: Double): Self = StObject.set(x, "blurX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurY(value: Double): Self = StObject.set(x, "blurY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideObject(value: Boolean): Self = StObject.set(x, "hideObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightColor(value: js.Any): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInner(value: Boolean): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnockout(value: Boolean): Self = StObject.set(x, "knockout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColor(value: js.Any): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
