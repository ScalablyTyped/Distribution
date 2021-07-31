package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * X.509 Certificate class to sign and generate hex encoded certificate
  * @param params associative array of parameters (ex. {'tbscertobj': obj, 'prvkeyobj': key})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - tbscertobj - specify `KJUR.asn1.x509.TBSCertificate` object
  * - prvkeyobj - specify `RSAKey`, `KJUR.crypto.ECDSA` or `KJUR.crypto.DSA` object for CA private key to sign the certificate
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: DSA/ECDSA is also supported for CA signging key from asn1x509 1.0.6.
  * @example
  * var caKey = KEYUTIL.getKey(caKeyPEM); // CA's private key
  * var cert = new KJUR.asn1x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': caKey});
  * cert.sign(); // issue certificate by CA's private key
  * var certPEM = cert.getPEMString();
  *
  * // Certificate  ::=  SEQUENCE  {
  * //     tbsCertificate       TBSCertificate,
  * //     signatureAlgorithm   AlgorithmIdentifier,
  * //     signature            BIT STRING  }
  */
trait Certificate
  extends StObject
     with ASN1Object {
  
  /**
    * get PEM formatted certificate string after signed
    * @return PEM formatted string of certificate
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    * var sPEM = cert.getPEMString();
    */
  def getPEMString(): String
  
  /**
    * set signature value internally by hex string
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs});
    * cert.setSignatureHex('01020304');
    */
  def setSignatureHex(sigHex: String): Unit
  
  /**
    * sign TBSCertificate and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({tbscertobj: tbs, prvkeyobj: prvKey});
    * cert.sign();
    */
  def sign(): Unit
}
object Certificate {
  
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
    setSignatureHex: String => Unit,
    sign: () => Unit
  ): Certificate = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEMString = js.Any.fromFunction0(getPEMString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setSignatureHex = js.Any.fromFunction1(setSignatureHex), sign = js.Any.fromFunction0(sign))
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPEMString(value: () => String): Self = StObject.set(x, "getPEMString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSignatureHex(value: String => Unit): Self = StObject.set(x, "setSignatureHex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSign(value: () => Unit): Self = StObject.set(x, "sign", js.Any.fromFunction0(value))
  }
}
