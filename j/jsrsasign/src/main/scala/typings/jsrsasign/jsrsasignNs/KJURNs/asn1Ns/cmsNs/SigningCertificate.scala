package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS SigningCertificate attribute
  * @param params associative array of parameters
  * @description
  * ```
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * SigningCertificate ::= SEQUENCE {
  *    certs SEQUENCE OF ESSCertID,
  *    policies SEQUENCE OF PolicyInformation OPTIONAL }
  * ESSCertID ::= SEQUENCE {
  *    certHash Hash,
  *    issuerSerial IssuerSerial OPTIONAL }
  * IssuerSerial ::= SEQUENCE {
  *    issuer GeneralNames,
  *    serialNumber CertificateSerialNumber }
  * ```
  * @example
  * o = new KJUR.asn1.cms.SigningCertificate({array: [certPEM]});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.SigningCertificate")
@js.native
class SigningCertificate () extends Attribute {
  def this(params: ArrayParam[String]) = this()
  def setCerts(listPEM: js.Array[String]): Unit = js.native
}

