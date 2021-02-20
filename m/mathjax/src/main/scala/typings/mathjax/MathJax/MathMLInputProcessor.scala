package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathMLInputProcessor extends StObject {
  
  /*Specifies whether to use TeX spacing or MathML spacing when the HTML-CSS output jax is used.*/
  var useMathMLspacing: js.UndefOr[Boolean] = js.native
}
object MathMLInputProcessor {
  
  @scala.inline
  def apply(): MathMLInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMLInputProcessor]
  }
  
  @scala.inline
  implicit class MathMLInputProcessorMutableBuilder[Self <: MathMLInputProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseMathMLspacing(value: Boolean): Self = StObject.set(x, "useMathMLspacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMathMLspacingUndefined: Self = StObject.set(x, "useMathMLspacing", js.undefined)
  }
}
