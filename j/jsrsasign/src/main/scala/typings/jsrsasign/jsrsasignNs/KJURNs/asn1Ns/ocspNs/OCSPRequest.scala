package typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ocspNs

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 OCSPRequest class for OCSP
  * @param params associative array of parameters
  * @description
  * OCSPRequest ASN.1 class is defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * A signed request is not supported yet in this version.
  * ```
  * OCSPRequest ::= SEQUENCE {
  *   tbsRequest             TBSRequest,
  *   optionalSignature  [0] EXPLICIT Signature OPTIONAL }
  * ```
  * @example
  * // default constructor
  * o = new KJUR.asn1.ocsp.OCSPRequest();
  * // constructor with requestList parameter
  * o = new KJUR.asn1.ocsp.OCSPRequest({reqList:[
  *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
  *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
  * ]});
  */
@JSGlobal("jsrsasign.KJUR.asn1.ocsp.OCSPRequest")
@js.native
class OCSPRequest () extends ASN1Object {
  def this(params: CertificateRequestList) = this()
}

