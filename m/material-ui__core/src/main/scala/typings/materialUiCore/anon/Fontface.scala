package typings.materialUiCore.anon

import typings.materialUiStyles.withStylesWithStylesMod.JSSFontface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fontface extends StObject {
  
  var `@font-face`: js.UndefOr[JSSFontface | js.Array[JSSFontface]] = js.undefined
}
object Fontface {
  
  inline def apply(): Fontface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fontface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fontface] (val x: Self) extends AnyVal {
    
    inline def `set@font-face`(value: JSSFontface | js.Array[JSSFontface]): Self = StObject.set(x, "@font-face", value.asInstanceOf[js.Any])
    
    inline def `set@font-faceUndefined`: Self = StObject.set(x, "@font-face", js.undefined)
    
    inline def `set@font-faceVarargs`(value: JSSFontface*): Self = StObject.set(x, "@font-face", js.Array(value*))
  }
}
