package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerCert extends js.Object {
  var certs: js.Array[String] = js.native
  var hashAlg: String = js.native
  var sigAlg: String = js.native
  var signerCert: String = js.native
  var signerPrvKey: String = js.native
  var tstInfo: TSTInfo = js.native
}

object SignerCert {
  @scala.inline
  def apply(
    certs: js.Array[String],
    hashAlg: String,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String,
    tstInfo: TSTInfo
  ): SignerCert = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any], tstInfo = tstInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerCert]
  }
  @scala.inline
  implicit class SignerCertOps[Self <: SignerCert] (val x: Self) extends AnyVal {
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
    def setCertsVarargs(value: String*): Self = this.set("certs", js.Array(value :_*))
    @scala.inline
    def setCerts(value: js.Array[String]): Self = this.set("certs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigAlg(value: String): Self = this.set("sigAlg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignerCert(value: String): Self = this.set("signerCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignerPrvKey(value: String): Self = this.set("signerPrvKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setTstInfo(value: TSTInfo): Self = this.set("tstInfo", value.asInstanceOf[js.Any])
  }
  
}

