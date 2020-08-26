package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Critical extends js.Object {
  var critical: js.UndefOr[Boolean] = js.native
  var issuer: StringParam = js.native
  var kid: HexParam = js.native
  var sn: HexParam = js.native
}

object Critical {
  @scala.inline
  def apply(issuer: StringParam, kid: HexParam, sn: HexParam): Critical = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  @scala.inline
  implicit class CriticalOps[Self <: Critical] (val x: Self) extends AnyVal {
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
    def setIssuer(value: StringParam): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setKid(value: HexParam): Self = this.set("kid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSn(value: HexParam): Self = this.set("sn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritical(value: Boolean): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCritical: Self = this.set("critical", js.undefined)
  }
  
}

