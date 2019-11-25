package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSMath2jaxPreprocessor extends js.Object {
  /*This controls whether jsMath2jax inserts MathJax_Preview spans to make a preview available, and what preview
    * to use, when it locates in-line or display mathematics in the page. The default is "TeX", which means use the
    * TeX code as the preview (which will be visible until it is processed by MathJax). Set to "none" to prevent
    * previews from being inserted (the math will simply disappear until it is typeset). Set to an array containing
    * the description of an HTML snippet in order to use the same preview for all equations on the page.
    */
  var preview: js.Any
}

object JSMath2jaxPreprocessor {
  @scala.inline
  def apply(preview: js.Any): JSMath2jaxPreprocessor = {
    val __obj = js.Dynamic.literal(preview = preview.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSMath2jaxPreprocessor]
  }
}

