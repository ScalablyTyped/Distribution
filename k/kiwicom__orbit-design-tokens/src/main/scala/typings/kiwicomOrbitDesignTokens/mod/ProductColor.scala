package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductColor extends StObject {
  
  var dark: String
  
  var darkActive: String
  
  var darkHover: String
  
  var darker: String
  
  var light: String
  
  var lightActive: String
  
  var lightHover: String
  
  var normal: String
  
  var normalActive: String
  
  var normalHover: String
}
object ProductColor {
  
  @scala.inline
  def apply(
    dark: String,
    darkActive: String,
    darkHover: String,
    darker: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): ProductColor = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], darkActive = darkActive.asInstanceOf[js.Any], darkHover = darkHover.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductColor]
  }
  
  @scala.inline
  implicit class ProductColorMutableBuilder[Self <: ProductColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkActive(value: String): Self = StObject.set(x, "darkActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkHover(value: String): Self = StObject.set(x, "darkHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarker(value: String): Self = StObject.set(x, "darker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightActive(value: String): Self = StObject.set(x, "lightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightHover(value: String): Self = StObject.set(x, "lightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}
