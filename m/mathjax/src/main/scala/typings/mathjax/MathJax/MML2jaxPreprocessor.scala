package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MML2jaxPreprocessor extends StObject {
  
  /*This controls whether mml2jax inserts MathJax_Preview spans to make a preview available, and what preview to
    * use, when it locates mathematics on the page. Possible values are: "mathml", "alttext", , "altimg", "none",
    * or an HTML snippet.
    *
    * The default is "mathml", in which case MathJax keeps the content of the <math> tag as the preview (until it is
    * processed by MathJax). Set to "alttext", to use the <math> tag’s alttext attribute as the preview, if the tag
    * has one. Set to "altimg" to use an image described by the altimg* attributes of the <math> element. Set to
    * "none" to prevent the previews from being inserted (the math will simply disappear until it is typeset). Set
    * to an array containing the description of an HTML snippet in order to use the same preview for all equations
    * on the page (e.g., you could have it say "[math]" or load an image).
    *
    * Examples:
    *
    * preview: ["[math]"],     //  insert the text "[math]" as the preview
    * preview: [["img",{src: "/images/mypic.jpg"}]],  // insert an image as the preview
    */
  var preview: js.UndefOr[Any] = js.undefined
}
object MML2jaxPreprocessor {
  
  inline def apply(): MML2jaxPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MML2jaxPreprocessor]
  }
  
  extension [Self <: MML2jaxPreprocessor](x: Self) {
    
    inline def setPreview(value: Any): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
  }
}
