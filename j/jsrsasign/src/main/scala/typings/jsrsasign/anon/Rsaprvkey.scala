package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rsaprvkey extends js.Object {
  var rsaprvkey: RSAKey = js.native
  var tbsobj: TBSCertList = js.native
}

object Rsaprvkey {
  @scala.inline
  def apply(rsaprvkey: RSAKey, tbsobj: TBSCertList): Rsaprvkey = {
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rsaprvkey]
  }
  @scala.inline
  implicit class RsaprvkeyOps[Self <: Rsaprvkey] (val x: Self) extends AnyVal {
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
    def setRsaprvkey(value: RSAKey): Self = this.set("rsaprvkey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTbsobj(value: TBSCertList): Self = this.set("tbsobj", value.asInstanceOf[js.Any])
  }
  
}

