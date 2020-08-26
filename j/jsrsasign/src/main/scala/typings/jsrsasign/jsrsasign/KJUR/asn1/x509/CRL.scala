package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * X.509 CRL class to sign and generate hex encoded CRL
  * @param params associative array of parameters (ex. {'tbsobj': obj, 'rsaprvkey': key})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - tbsobj - specify `KJUR.asn1.x509.TBSCertList` object to be signed
  * - rsaprvkey - specify `RSAKey` object CA private key
  *
  * NOTE: 'params' can be omitted.
  * __EXAMPLE__
  * @example
  * var prvKey = new RSAKey(); // CA's private key
  * prvKey.readPrivateKeyFromASN1HexString("3080...");
  * var crl = new KJUR.asn1x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
  * crl.sign(); // issue CRL by CA's private key
  * var hCRL = crl.getEncodedHex();
  *
  * // CertificateList  ::=  SEQUENCE  {
  * //     tbsCertList          TBSCertList,
  * //     signatureAlgorithm   AlgorithmIdentifier,
  * //     signatureValue       BIT STRING  }
  */
@js.native
trait CRL extends ASN1Object {
  /**
    * get PEM formatted CRL string after signed
    * @return PEM formatted string of certificate
    * @example
    * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'rsaprvkey': prvKey});
    * cert.sign();
    * var sPEM =  cert.getPEMString();
    */
  def getPEMString(): String = js.native
  /**
    * sign TBSCertList and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    */
  def sign(): Unit = js.native
}

object CRL {
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
    sign: () => Unit
  ): CRL = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEMString = js.Any.fromFunction0(getPEMString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], sign = js.Any.fromFunction0(sign))
    __obj.asInstanceOf[CRL]
  }
  @scala.inline
  implicit class CRLOps[Self <: CRL] (val x: Self) extends AnyVal {
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
    def setSign(value: () => Unit): Self = this.set("sign", js.Any.fromFunction0(value))
  }
  
}

