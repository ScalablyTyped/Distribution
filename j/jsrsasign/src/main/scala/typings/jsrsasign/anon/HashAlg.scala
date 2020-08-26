package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlg extends js.Object {
  var hashAlg: String = js.native
  var sAttr: SignaturePolicyIdentifier = js.native
  var sigAlg: String = js.native
  var signerCert: String = js.native
  var signerPrvKey: String = js.native
}

object HashAlg {
  @scala.inline
  def apply(
    hashAlg: String,
    sAttr: SignaturePolicyIdentifier,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String
  ): HashAlg = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], sAttr = sAttr.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlg]
  }
  @scala.inline
  implicit class HashAlgOps[Self <: HashAlg] (val x: Self) extends AnyVal {
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
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSAttr(value: SignaturePolicyIdentifier): Self = this.set("sAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigAlg(value: String): Self = this.set("sigAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignerCert(value: String): Self = this.set("signerCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignerPrvKey(value: String): Self = this.set("signerPrvKey", value.asInstanceOf[js.Any])
  }
  
}

