package typings.jsrsasign.jsrsasign.KJUR.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexParam extends js.Object {
  var hex: String = js.native
}

object HexParam {
  @scala.inline
  def apply(hex: String): HexParam = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexParam]
  }
  @scala.inline
  implicit class HexParamOps[Self <: HexParam] (val x: Self) extends AnyVal {
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
    def setHex(value: String): Self = this.set("hex", value.asInstanceOf[js.Any])
  }
  
}

