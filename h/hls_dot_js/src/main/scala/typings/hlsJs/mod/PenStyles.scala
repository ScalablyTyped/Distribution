package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PenStyles extends StObject {
  
  var background: String
  
  var flash: Boolean
  
  var foreground: String | Null
  
  var italics: Boolean
  
  var underline: Boolean
}
object PenStyles {
  
  inline def apply(background: String, flash: Boolean, italics: Boolean, underline: Boolean): PenStyles = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], italics = italics.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], foreground = null)
    __obj.asInstanceOf[PenStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PenStyles] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundNull: Self = StObject.set(x, "foreground", null)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
