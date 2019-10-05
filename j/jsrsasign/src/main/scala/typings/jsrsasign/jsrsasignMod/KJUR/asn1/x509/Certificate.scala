package typings.jsrsasign.jsrsasignMod.KJUR.asn1.x509

import typings.jsrsasign.Anon_Prvkeyobj
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
@JSImport("jsrsasign", "KJUR.asn1.x509.Certificate")
@js.native
class Certificate ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Certificate {
  def this(params: Anon_Prvkeyobj) = this()
}

