package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MML2jaxPreprocessor extends js.Object {
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
  var preview: js.UndefOr[js.Any] = js.undefined
}

object MML2jaxPreprocessor {
  @scala.inline
  def apply(preview: js.Any = null): MML2jaxPreprocessor = {
    val __obj = js.Dynamic.literal()
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[MML2jaxPreprocessor]
  }
}

