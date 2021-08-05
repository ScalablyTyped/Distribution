package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudColor extends StObject {
  
  var dark: String
  
  var light: String
  
  var lightActive: String
  
  var lightHover: String
  
  var normal: String
  
  var normalActive: String
  
  var normalHover: String
}
object CloudColor {
  
  inline def apply(
    dark: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): CloudColor = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudColor]
  }
  
  extension [Self <: CloudColor](x: Self) {
    
    inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightActive(value: String): Self = StObject.set(x, "lightActive", value.asInstanceOf[js.Any])
    
    inline def setLightHover(value: String): Self = StObject.set(x, "lightHover", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalActive(value: String): Self = StObject.set(x, "normalActive", value.asInstanceOf[js.Any])
    
    inline def setNormalHover(value: String): Self = StObject.set(x, "normalHover", value.asInstanceOf[js.Any])
  }
}
