package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathZoom extends js.Object {
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathZoom.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.Any
}

object MathZoom {
  @scala.inline
  def apply(styles: js.Any): MathZoom = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathZoom]
  }
}

