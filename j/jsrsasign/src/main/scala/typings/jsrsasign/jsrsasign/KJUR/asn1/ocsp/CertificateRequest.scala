package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateRequest extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var issuerCert: String
  var subjectCert: String
}

object CertificateRequest {
  @scala.inline
  def apply(issuerCert: String, subjectCert: String, alg: String = null): CertificateRequest = {
    val __obj = js.Dynamic.literal(issuerCert = issuerCert, subjectCert = subjectCert)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    __obj.asInstanceOf[CertificateRequest]
  }
}

