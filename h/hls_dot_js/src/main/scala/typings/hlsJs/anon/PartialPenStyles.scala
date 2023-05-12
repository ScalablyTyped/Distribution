package typings.hlsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hls.js.hls.js.PenStyles> */
trait PartialPenStyles extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var flash: js.UndefOr[Boolean] = js.undefined
  
  var foreground: js.UndefOr[String | Null] = js.undefined
  
  var italics: js.UndefOr[Boolean] = js.undefined
  
  var underline: js.UndefOr[Boolean] = js.undefined
}
object PartialPenStyles {
  
  inline def apply(): PartialPenStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPenStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPenStyles] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundNull: Self = StObject.set(x, "foreground", null)
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
