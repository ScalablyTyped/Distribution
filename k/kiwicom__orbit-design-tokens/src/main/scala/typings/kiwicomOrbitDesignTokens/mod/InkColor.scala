package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkColor extends StObject {
  
  var light: String
  
  var lightActive: String
  
  var lightHover: String
  
  var lighter: String
  
  var lighterActive: String
  
  var lighterHover: String
  
  var normal: String
  
  var normalActive: String
  
  var normalHover: String
}
object InkColor {
  
  @scala.inline
  def apply(
    light: String,
    lightActive: String,
    lightHover: String,
    lighter: String,
    lighterActive: String,
    lighterHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): InkColor = {
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], lighter = lighter.asInstanceOf[js.Any], lighterActive = lighterActive.asInstanceOf[js.Any], lighterHover = lighterHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkColor]
  }
  
  @scala.inline
  implicit class InkColorMutableBuilder[Self <: InkColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightActive(value: String): Self = StObject.set(x, "lightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightHover(value: String): Self = StObject.set(x, "lightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighter(value: String): Self = StObject.set(x, "lighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighterActive(value: String): Self = StObject.set(x, "lighterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLighterHover(value: String): Self = StObject.set(x, "lighterHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}
