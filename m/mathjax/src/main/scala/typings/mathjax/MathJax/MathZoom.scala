package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathZoom extends js.Object {
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathZoom.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.Any = js.native
}

object MathZoom {
  @scala.inline
  def apply(styles: js.Any): MathZoom = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathZoom]
  }
  @scala.inline
  implicit class MathZoomOps[Self <: MathZoom] (val x: Self) extends AnyVal {
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
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

