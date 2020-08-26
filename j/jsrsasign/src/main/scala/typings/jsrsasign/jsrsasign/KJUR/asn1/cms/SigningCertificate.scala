package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS SigningCertificate attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * SigningCertificate ::= SEQUENCE {
  *    certs SEQUENCE OF ESSCertID,
  *    policies SEQUENCE OF PolicyInformation OPTIONAL }
  * ESSCertID ::= SEQUENCE {
  *    certHash Hash,
  *    issuerSerial IssuerSerial OPTIONAL }
  * IssuerSerial ::= SEQUENCE {
  *    issuer GeneralNames,
  *    serialNumber CertificateSerialNumber }
  * ```
  * @example
  * o = new KJUR.asn1.cms.SigningCertificate({array: [certPEM]});
  */
@js.native
trait SigningCertificate extends Attribute {
  def setCerts(listPEM: js.Array[String]): Unit = js.native
}

object SigningCertificate {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setCerts: js.Array[String] => Unit
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction1(setCerts))
    __obj.asInstanceOf[SigningCertificate]
  }
  @scala.inline
  implicit class SigningCertificateOps[Self <: SigningCertificate] (val x: Self) extends AnyVal {
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
    def setSetCerts(value: js.Array[String] => Unit): Self = this.set("setCerts", js.Any.fromFunction1(value))
  }
  
}

