package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMessages extends StObject {
  
  /*The message used for when MathJax must use image fonts rather than local or web-based fonts (for those
    * browsers that don’t handle the @font-face CSS directive).
    */
  var imageFonts: js.UndefOr[js.Array[_]] = js.native
  
  /*The message used when MathJax is unable to find any font to use (i.e., neither local nor web-based nor
    * image-based fonts are available).
    */
  var noFonts: js.UndefOr[js.Array[_]] = js.native
  
  /*The message used for when MathJax uses web-based fonts (rather than local fonts installed on the user’s
    * system).
    */
  var webFont: js.UndefOr[js.Array[_]] = js.native
}
object HTMLMessages {
  
  @scala.inline
  def apply(): HTMLMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLMessages]
  }
  
  @scala.inline
  implicit class HTMLMessagesMutableBuilder[Self <: HTMLMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageFonts(value: js.Array[_]): Self = StObject.set(x, "imageFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFontsUndefined: Self = StObject.set(x, "imageFonts", js.undefined)
    
    @scala.inline
    def setImageFontsVarargs(value: js.Any*): Self = StObject.set(x, "imageFonts", js.Array(value :_*))
    
    @scala.inline
    def setNoFonts(value: js.Array[_]): Self = StObject.set(x, "noFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFontsUndefined: Self = StObject.set(x, "noFonts", js.undefined)
    
    @scala.inline
    def setNoFontsVarargs(value: js.Any*): Self = StObject.set(x, "noFonts", js.Array(value :_*))
    
    @scala.inline
    def setWebFont(value: js.Array[_]): Self = StObject.set(x, "webFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebFontUndefined: Self = StObject.set(x, "webFont", js.undefined)
    
    @scala.inline
    def setWebFontVarargs(value: js.Any*): Self = StObject.set(x, "webFont", js.Array(value :_*))
  }
}
