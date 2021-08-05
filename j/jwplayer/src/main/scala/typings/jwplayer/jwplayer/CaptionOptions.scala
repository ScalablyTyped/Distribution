package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionOptions extends StObject {
  
  var backgroundColor: String
  
  var backgroundOpacity: Double
  
  var color: String
  
  var edgeStyle: String
  
  var fontFamily: String
  
  var fontOpacity: Double
  
  var fontSize: Double
  
  var windowColor: String
  
  var windowOpacity: Double
}
object CaptionOptions {
  
  inline def apply(
    backgroundColor: String,
    backgroundOpacity: Double,
    color: String,
    edgeStyle: String,
    fontFamily: String,
    fontOpacity: Double,
    fontSize: Double,
    windowColor: String,
    windowOpacity: Double
  ): CaptionOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], backgroundOpacity = backgroundOpacity.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], edgeStyle = edgeStyle.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontOpacity = fontOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowOpacity = windowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionOptions]
  }
  
  extension [Self <: CaptionOptions](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundOpacity(value: Double): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEdgeStyle(value: String): Self = StObject.set(x, "edgeStyle", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontOpacity(value: Double): Self = StObject.set(x, "fontOpacity", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setWindowColor(value: String): Self = StObject.set(x, "windowColor", value.asInstanceOf[js.Any])
    
    inline def setWindowOpacity(value: Double): Self = StObject.set(x, "windowOpacity", value.asInstanceOf[js.Any])
  }
}
