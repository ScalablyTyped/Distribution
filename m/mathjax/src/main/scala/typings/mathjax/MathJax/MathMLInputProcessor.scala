package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathMLInputProcessor extends js.Object {
  
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
  implicit class MathMLInputProcessorOps[Self <: MathMLInputProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUseMathMLspacing(value: Boolean): Self = this.set("useMathMLspacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMathMLspacing: Self = this.set("useMathMLspacing", js.undefined)
  }
}
