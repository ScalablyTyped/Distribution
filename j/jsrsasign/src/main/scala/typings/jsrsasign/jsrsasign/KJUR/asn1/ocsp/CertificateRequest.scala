package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRequest extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var issuerCert: String = js.native
  var subjectCert: String = js.native
}

object CertificateRequest {
  @scala.inline
  def apply(issuerCert: String, subjectCert: String): CertificateRequest = {
    val __obj = js.Dynamic.literal(issuerCert = issuerCert.asInstanceOf[js.Any], subjectCert = subjectCert.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRequest]
  }
  @scala.inline
  implicit class CertificateRequestOps[Self <: CertificateRequest] (val x: Self) extends AnyVal {
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
    def setIssuerCert(value: String): Self = this.set("issuerCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectCert(value: String): Self = this.set("subjectCert", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
  }
  
}

