package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.cmsNs

import typings.jsrsasign.Anon_Array
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ArrayParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS SigningCertificateV2 attribute
  * @param params associative array of parameters
  * @description
  * ```
  * oid-signingCertificateV2 = 1.2.840.113549.1.9.16.2.47
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * SigningCertificateV2 ::=  SEQUENCE {
  *    certs        SEQUENCE OF ESSCertIDv2,
  *    policies     SEQUENCE OF PolicyInformation OPTIONAL }
  * ESSCertIDv2 ::=  SEQUENCE {
  *    hashAlgorithm           AlgorithmIdentifier
  *                            DEFAULT {algorithm id-sha256},
  *    certHash                Hash,
  *    issuerSerial            IssuerSerial OPTIONAL }
  * Hash ::= OCTET STRING
  * IssuerSerial ::= SEQUENCE {
  *    issuer                  GeneralNames,
  *    serialNumber            CertificateSerialNumber }
  * ```
  * @example
  * // hash algorithm is sha256 by default:
  * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM]});
  * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM],
  *                                             hashAlg: 'sha512'});
  */
@JSGlobal("jsrsasign.KJUR.asn1.cms.SigningCertificateV2")
@js.native
class SigningCertificateV2 () extends Attribute {
  def this(params: Anon_Array) = this()
  def this(params: ArrayParam[String]) = this()
  def setCerts(listPEM: js.Array[String], hashAlg: String): Unit = js.native
}

