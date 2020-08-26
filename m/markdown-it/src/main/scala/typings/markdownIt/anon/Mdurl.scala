package typings.markdownIt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mdurl extends js.Object {
  var mdurl: Typeofmdurl = js.native
}

object Mdurl {
  @scala.inline
  def apply(mdurl: Typeofmdurl): Mdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mdurl]
  }
  @scala.inline
  implicit class MdurlOps[Self <: Mdurl] (val x: Self) extends AnyVal {
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
    def setMdurl(value: Typeofmdurl): Self = this.set("mdurl", value.asInstanceOf[js.Any])
  }
  
}

