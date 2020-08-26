package typings.jsrsasign.jsrsasign.KJUR.asn1.csr

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 CertificationRequest structure class
  * @param params associative array of parameters (ex. {})
  * @example
  * csri = new KJUR.asn1.csr.CertificationRequestInfo();
  * csri.setSubjectByParam({'str': '/C=US/O=Test/CN=example.com'});
  * csri.setSubjectPublicKeyByGetKey(pubKeyObj);
  * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
  * csr.sign("SHA256withRSA", prvKeyObj);
  * pem = csr.getPEMString();
  *
  * // -- DEFINITION OF ASN.1 SYNTAX --
  * // CertificationRequest ::= SEQUENCE {
  * //   certificationRequestInfo CertificationRequestInfo,
  * //   signatureAlgorithm       AlgorithmIdentifier{{ SignatureAlgorithms }},
  * //   signature                BIT STRING }
  * //
  * // CertificationRequestInfo ::= SEQUENCE {
  * //   version       INTEGER { v1(0) } (v1,...),
  * //   subject       Name,
  * //   subjectPKInfo SubjectPublicKeyInfo{{ PKInfoAlgorithms }},
  * //   attributes    [0] Attributes{{ CRIAttributes }} }
  */
@js.native
trait CertificationRequest extends ASN1Object {
  /**
    * get PEM formatted certificate signing request (CSR/PKCS#10)
    * @return PEM formatted string of CSR/PKCS#10
    * @description
    * This method is to a get CSR PEM string after signed.
    *
    * @example
    * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
    * csr.sign();
    * pem =  csr.getPEMString();
    * // pem will be following:
    * // -----BEGIN CERTIFICATE REQUEST-----
    * // MII ...snip...
    * // -----END CERTIFICATE REQUEST-----
    */
  def getPEMString(): String = js.native
  /**
    * sign CertificationRequest and set signature value internally
    * @description
    * This method self-signs CertificateRequestInfo with a subject's
    * private key and set signature value internally.
    *
    * @example
    * csr = new KJUR.asn1.csr.CertificationRequest({'csrinfo': csri});
    * csr.sign("SHA256withRSA", prvKeyObj);
    */
  def sign(sigAlgName: String, prvKeyObj: js.Any): Unit = js.native
}

object CertificationRequest {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getPEMString: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    sign: (String, js.Any) => Unit
  ): CertificationRequest = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEMString = js.Any.fromFunction0(getPEMString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[CertificationRequest]
  }
  @scala.inline
  implicit class CertificationRequestOps[Self <: CertificationRequest] (val x: Self) extends AnyVal {
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
    def setGetPEMString(value: () => String): Self = this.set("getPEMString", js.Any.fromFunction0(value))
    @scala.inline
    def setSign(value: (String, js.Any) => Unit): Self = this.set("sign", js.Any.fromFunction2(value))
  }
  
}

