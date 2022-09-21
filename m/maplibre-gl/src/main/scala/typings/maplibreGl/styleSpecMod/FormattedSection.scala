package typings.maplibreGl.styleSpecMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattedSection extends StObject {
  
  var fontStack: String | Null
  
  var image: ResolvedImage | Null
  
  var scale: Double | Null
  
  var text: String
  
  var textColor: Color | Null
}
object FormattedSection {
  
  inline def apply(text: String): FormattedSection = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], fontStack = null, image = null, scale = null, textColor = null)
    __obj.asInstanceOf[FormattedSection]
  }
  
  extension [Self <: FormattedSection](x: Self) {
    
    inline def setFontStack(value: String): Self = StObject.set(x, "fontStack", value.asInstanceOf[js.Any])
    
    inline def setFontStackNull: Self = StObject.set(x, "fontStack", null)
    
    inline def setImage(value: ResolvedImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
  }
}
