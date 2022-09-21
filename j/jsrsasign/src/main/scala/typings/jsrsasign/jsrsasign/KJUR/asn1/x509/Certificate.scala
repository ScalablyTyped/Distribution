package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * X.509 Certificate class to sign and generate hex encoded certificate
  * @param params JSON object for Certificate parameters
  * @description
  * <br/>
  * This class provides Certificate ASN.1 class structure
  * defined in
  * <a href="https://tools.ietf.org/html/rfc5280#section-4.1">
  * RFC 5280 4.1</a>.
  * <pre>
  * Certificate  ::=  SEQUENCE  {
  *      tbsCertificate       TBSCertificate,
  *      signatureAlgorithm   AlgorithmIdentifier,
  *      signatureValue       BIT STRING  }
  * </pre>
  * Parameter "params" JSON object can be
  * the same as {@link KJUR.asn1.x509.TBSCertificate}.
  * Then they are used to generate TBSCertificate.
  * Additionally just for Certificate, following parameters can be used:
  * <ul>
  * <li>{TBSCertfificate}tbsobj -
  * specifies {@link KJUR.asn1.x509.TBSCertificate}
  * object to be signed if needed.
  * When this isn't specified,
  * this will be set from other parametes of TBSCertificate.
  * <li>{Object}cakey (OPTION) - specifies certificate signing private key.
  * Parameter "cakey" or "sighex" shall be specified. Following
  * values can be specified:
  *   <ul>
  *   <li>PKCS#1/5 or PKCS#8 PEM string of private key
  *   <li>RSAKey/DSA/ECDSA key object. {@link KEYUTIL.getKey} is useful
  *   to generate a key object.
  *   </ul>
  *
  * <li>{String}sighex (OPTION) - hexadecimal string of signature value
  * (i.e. ASN.1 value(V) of signatureValue BIT STRING without
  * unused bits)
  * </ul>
  * CAUTION: APIs of this class have been totally updated without
  * backward compatibility since jsrsasign 9.0.0.<br/>
  * NOTE1: 'params' can be omitted.<br/>
  * NOTE2: DSA/ECDSA is also supported for CA signging key from asn1x509 1.0.6.
  * @example
  * var cert = new KJUR.asn1.x509.Certificate({
  *  version: 3,
  *  serial: {hex: "1234..."},
  *  sigalg: "SHA256withRSAandMGF1",
  *  ...
  *  sighex: "1d3f..." // sign() method won't be called
  * });
  *
  * // sighex will by calculated by signing with cakey
  * var cert = new KJUR.asn1.x509.Certificate({
  *  version: 3,
  *  serial: {hex: "2345..."},
  *  sigalg: "SHA256withRSA",
  *  ...
  *  cakey: "-----BEGIN PRIVATE KEY..."
  * });
  *
  * // use TBSCertificate object to sign
  * var cert = new KJUR.asn1.x509.Certificate({
  *  tbsobj: <<OBJ>>,
  *  sigalg: "SHA256withRSA",
  *  cakey: "-----BEGIN PRIVATE KEY..."
  * });
  */
trait Certificate
  extends StObject
     with ASN1Object {
  
  /**
    * get PEM formatted certificate string after signed
    * @return PEM formatted string of certificate
    * @since jsrsasign 9.0.0 asn1hex 2.0.0
    * @description
    * This method returns a string of PEM formatted
    * certificate.
    * @example
    * cert = new KJUR.asn1.x509.Certificate({...});
    * cert.getPEM() &rarr;
    * "-----BEGIN CERTIFICATE-----\r\n..."
    */
  def getPEM(): String
  
  /**
    * set parameter<br/>
    * @param params JSON object of certificate parameters
    * @description
    * This method will set parameter
    * {@link KJUR.asn1.x509.Certificate#params}
    * to this object.
    * @example
    * cert = new KJUR.asn1.x509.Certificate();
    * cert.setByParam({
    *   version: 3,
    *   serial: {hex: "1234..."},
    *   ...
    * });
    */
  def setByParam(params: X509CertificateParams): Unit
}
object Certificate {
  
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
    setByParam: X509CertificateParams => Unit
  ): Certificate = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getPEM = js.Any.fromFunction0(getPEM), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByParam = js.Any.fromFunction1(setByParam), params = null)
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setGetPEM(value: () => String): Self = StObject.set(x, "getPEM", js.Any.fromFunction0(value))
    
    inline def setSetByParam(value: X509CertificateParams => Unit): Self = StObject.set(x, "setByParam", js.Any.fromFunction1(value))
  }
}
