package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cadesNs

import typings.jsrsasign.Anon_Cert
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for OtherCertID ASN.1 object
  * @param params associative array of parameters
  * @description
  * ```
  * OtherCertID ::= SEQUENCE {
  *    otherCertHash    OtherHash,
  *    issuerSerial     IssuerSerial OPTIONAL }
  * ```
  * @example
  * o = new KJUR.asn1.cades.OtherCertID(certPEM);
  * o = new KJUR.asn1.cades.OtherCertID({cert:certPEM, hasis: false});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cades.OtherCertID")
@js.native
class OtherCertID () extends ASN1Object {
  def this(params: String) = this()
  def this(params: Anon_Cert) = this()
  /**
    * set value by PEM string of certificate
    * @param certPEM PEM string of certificate
    * @description
    * This method will set value by a PEM string of a certificate.
    * This will add IssuerAndSerialNumber by default
    * which depends on hasIssuerSerial flag.
    */
  def setByCertPEM(certPEM: String): Unit = js.native
}

