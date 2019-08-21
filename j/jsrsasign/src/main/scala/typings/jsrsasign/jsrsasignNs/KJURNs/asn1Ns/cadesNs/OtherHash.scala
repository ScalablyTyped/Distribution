package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cadesNs

import typings.jsrsasign.Anon_Alg
import typings.jsrsasign.Anon_AlgCert
import typings.jsrsasign.Anon_CertString
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for OtherHash ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * OtherHash ::= CHOICE {
  *    sha1Hash   OtherHashValue,  -- This contains a SHA-1 hash
  *    otherHash  OtherHashAlgAndValue}
  * OtherHashValue ::= OCTET STRING
  * ```
  * @example
  * o = new KJUR.asn1.cades.OtherHash("1234");
  * o = new KJUR.asn1.cades.OtherHash(certPEMStr); // default alg=sha256
  * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', hash: '1234'});
  * o = new KJUR.asn1.cades.OtherHash({alg: 'sha256', cert: certPEM});
  * o = new KJUR.asn1.cades.OtherHash({cert: certPEM});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cades.OtherHash")
@js.native
class OtherHash () extends ASN1Object {
  def this(params: String) = this()
  def this(params: Anon_Alg) = this()
  def this(params: Anon_AlgCert) = this()
  def this(params: Anon_CertString) = this()
  /**
    * set value by PEM string of certificate
    * @param certPEM PEM string of certificate
    * @description
    * This method will set value by a PEM string of a certificate.
    * An algorithm used to hash certificate data will
    * be defined by 'alg' property and 'sha256' is default.
    */
  def setByCertPEM(certPEM: String): Unit = js.native
}

