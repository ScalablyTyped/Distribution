package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.anon.HexName
import typings.jsrsasign.anon.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PEMInfo extends js.Object {
  var pubkey: Obj = js.native
  var subject: HexName = js.native
}

object PEMInfo {
  @scala.inline
  def apply(pubkey: Obj, subject: HexName): PEMInfo = {
    val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEMInfo]
  }
  @scala.inline
  implicit class PEMInfoOps[Self <: PEMInfo] (val x: Self) extends AnyVal {
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
    def setPubkey(value: Obj): Self = this.set("pubkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: HexName): Self = this.set("subject", value.asInstanceOf[js.Any])
  }
  
}

