package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait CRL
  extends StObject
     with ASN1Object {
  
  /**
    * get PEM formatted CRL string after signed.
    * @return PEM formatted string of CRL
    * @description
    * This method returns a string of PEM formatted CRL.
    * @example
    * crl = new KJUR.asn1.x509.CRL({...});
    * crl.getPEM() →
    * "-----BEGIN X509 CRL-----\r\n..."
    */
  def getPEM(): String
  
  /**
    * sign TBSCertList and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.CRL({'tbsobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    */
  def sign(): Unit
}
object CRL {
  
  inline def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getPEM: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    sign: () => Unit
  ): CRL = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEM = js.Any.fromFunction0(getPEM), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], sign = js.Any.fromFunction0(sign), params = null)
    __obj.asInstanceOf[CRL]
  }
  
  extension [Self <: CRL](x: Self) {
    
    inline def setGetPEM(value: () => String): Self = StObject.set(x, "getPEM", js.Any.fromFunction0(value))
    
    inline def setSign(value: () => Unit): Self = StObject.set(x, "sign", js.Any.fromFunction0(value))
  }
}
