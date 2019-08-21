package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.x509Ns

import typings.jsrsasign.Anon_Rsaprvkey
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
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
@JSGlobal("jsrsasign.KJUR.asn1.x509.CRL")
@js.native
class CRL () extends ASN1Object {
  def this(params: Anon_Rsaprvkey) = this()
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

