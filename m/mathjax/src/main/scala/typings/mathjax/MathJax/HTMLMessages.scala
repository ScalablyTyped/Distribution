package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLMessages extends StObject {
  
  /*The message used for when MathJax must use image fonts rather than local or web-based fonts (for those
    * browsers that don’t handle the @font-face CSS directive).
    */
  var imageFonts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /*The message used when MathJax is unable to find any font to use (i.e., neither local nor web-based nor
    * image-based fonts are available).
    */
  var noFonts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /*The message used for when MathJax uses web-based fonts (rather than local fonts installed on the user’s
    * system).
    */
  var webFont: js.UndefOr[js.Array[Any]] = js.undefined
}
object HTMLMessages {
  
  inline def apply(): HTMLMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLMessages]
  }
  
  extension [Self <: HTMLMessages](x: Self) {
    
    inline def setImageFonts(value: js.Array[Any]): Self = StObject.set(x, "imageFonts", value.asInstanceOf[js.Any])
    
    inline def setImageFontsUndefined: Self = StObject.set(x, "imageFonts", js.undefined)
    
    inline def setImageFontsVarargs(value: Any*): Self = StObject.set(x, "imageFonts", js.Array(value*))
    
    inline def setNoFonts(value: js.Array[Any]): Self = StObject.set(x, "noFonts", value.asInstanceOf[js.Any])
    
    inline def setNoFontsUndefined: Self = StObject.set(x, "noFonts", js.undefined)
    
    inline def setNoFontsVarargs(value: Any*): Self = StObject.set(x, "noFonts", js.Array(value*))
    
    inline def setWebFont(value: js.Array[Any]): Self = StObject.set(x, "webFont", value.asInstanceOf[js.Any])
    
    inline def setWebFontUndefined: Self = StObject.set(x, "webFont", js.undefined)
    
    inline def setWebFontVarargs(value: Any*): Self = StObject.set(x, "webFont", js.Array(value*))
  }
}
