package typings.less2sass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Less2Sass extends js.Object {
  def convert(file: String): String = js.native
}

object Less2Sass {
  @scala.inline
  def apply(convert: String => String): Less2Sass = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert))
    __obj.asInstanceOf[Less2Sass]
  }
  @scala.inline
  implicit class Less2SassOps[Self <: Less2Sass] (val x: Self) extends AnyVal {
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
    def setConvert(value: String => String): Self = this.set("convert", js.Any.fromFunction1(value))
  }
  
}

