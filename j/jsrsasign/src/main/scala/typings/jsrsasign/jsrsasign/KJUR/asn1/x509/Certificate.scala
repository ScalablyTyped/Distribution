package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.AnonPrvkeyobj
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("jsrsasign.KJUR.asn1.x509.Certificate")
@js.native
class Certificate () extends ASN1Object {
  def this(params: AnonPrvkeyobj) = this()
  /**
    * get PEM formatted certificate string after signed
    * @return PEM formatted string of certificate
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs, 'prvkeyobj': prvKey});
    * cert.sign();
    * var sPEM = cert.getPEMString();
    */
  def getPEMString(): String = js.native
  /**
    * set signature value internally by hex string
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({'tbscertobj': tbs});
    * cert.setSignatureHex('01020304');
    */
  def setSignatureHex(sigHex: String): Unit = js.native
  /**
    * sign TBSCertificate and set signature value internally
    * @example
    * var cert = new KJUR.asn1.x509.Certificate({tbscertobj: tbs, prvkeyobj: prvKey});
    * cert.sign();
    */
  def sign(): Unit = js.native
}

