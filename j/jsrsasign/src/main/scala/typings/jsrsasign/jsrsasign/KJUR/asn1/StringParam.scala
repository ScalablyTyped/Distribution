package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringParam extends js.Object {
  var str: String = js.native
}

object StringParam {
  @scala.inline
  def apply(str: String): StringParam = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParam]
  }
  @scala.inline
  implicit class StringParamOps[Self <: StringParam] (val x: Self) extends AnyVal {
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

