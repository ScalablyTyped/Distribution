package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleString extends js.Object {
  /**
    * @default consistent
    */
  var style: String = js.native
}

object StyleString {
  @scala.inline
  def apply(style: String): StyleString = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleString]
  }
  @scala.inline
  implicit class StyleStringOps[Self <: StyleString] (val x: Self) extends AnyVal {
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
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

