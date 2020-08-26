package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagParam extends js.Object {
  var str: String = js.native
}

object TagParam {
  @scala.inline
  def apply(str: String): TagParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagParam]
  }
  @scala.inline
  implicit class TagParamOps[Self <: TagParam] (val x: Self) extends AnyVal {
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
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
  }
  
}

