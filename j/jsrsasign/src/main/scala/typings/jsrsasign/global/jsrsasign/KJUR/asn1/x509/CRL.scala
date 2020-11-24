package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.Rsaprvkey
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("jsrsasign.KJUR.asn1.x509.CRL")
@js.native
class CRL ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.CRL {
  def this(params: Rsaprvkey) = this()
}
