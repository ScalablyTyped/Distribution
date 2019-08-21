package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_CertString
import typings.jsrsasign.Anon_Issuer
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for IssuerAndSerialNumber ASN.1 structure for CMS
  * @param params associative array of parameters
  * @description
  * ```
  * IssuerAndSerialNumber ::= SEQUENCE {
  *    issuer Name,
  *    serialNumber CertificateSerialNumber }
  * CertificateSerialNumber ::= INTEGER
  * ```
  * @example
  * // specify by X500Name and DERInteger
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber(
  *      {issuer: {str: '/C=US/O=T1'}, serial {int: 3}});
  * // specify by PEM certificate
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber({cert: certPEM});
  * o = new KJUR.asn1.cms.IssuerAndSerialNumber(certPEM); // since 1.0.3
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.IssuerAndSerialNumber")
@js.native
class IssuerAndSerialNumber () extends ASN1Object {
  def this(params: String) = this()
  def this(params: Anon_CertString) = this()
  def this(params: Anon_Issuer) = this()
  def setByCertPEM(certPEM: String): Unit = js.native
}

