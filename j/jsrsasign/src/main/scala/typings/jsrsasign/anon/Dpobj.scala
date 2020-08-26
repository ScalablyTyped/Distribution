package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dpobj extends js.Object {
  var dpobj: ASN1Object = js.native
}

object Dpobj {
  @scala.inline
  def apply(dpobj: ASN1Object): Dpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dpobj]
  }
  @scala.inline
  implicit class DpobjOps[Self <: Dpobj] (val x: Self) extends AnyVal {
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
    def setDpobj(value: ASN1Object): Self = this.set("dpobj", value.asInstanceOf[js.Any])
  }
  
}

