package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathMLInputProcessor extends StObject {
  
  /*Specifies whether to use TeX spacing or MathML spacing when the HTML-CSS output jax is used.*/
  var useMathMLspacing: js.UndefOr[Boolean] = js.undefined
}
object MathMLInputProcessor {
  
  inline def apply(): MathMLInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMLInputProcessor]
  }
  
  extension [Self <: MathMLInputProcessor](x: Self) {
    
    inline def setUseMathMLspacing(value: Boolean): Self = StObject.set(x, "useMathMLspacing", value.asInstanceOf[js.Any])
    
    inline def setUseMathMLspacingUndefined: Self = StObject.set(x, "useMathMLspacing", js.undefined)
  }
}
