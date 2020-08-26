package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sn extends js.Object {
  var sn: IntegerParam = js.native
  var time: StringParam = js.native
}

object Sn {
  @scala.inline
  def apply(sn: IntegerParam, time: StringParam): Sn = {
    val __obj = js.Dynamic.literal(sn = sn.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sn]
  }
  @scala.inline
  implicit class SnOps[Self <: Sn] (val x: Self) extends AnyVal {
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
    def setSn(value: IntegerParam): Self = this.set("sn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: StringParam): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

