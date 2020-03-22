package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import typings.jsrsasign.AnonNamehash
import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 Request class for OCSP
  * @param params associative array of parameters
  * @description
  * Request ASN.1 class is defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * singleRequestExtensions is not supported yet in this version such as nonce.
  * ```
  * Request ::= SEQUENCE {
  *   reqCert                  CertID,
  *   singleRequestExtensions  [0] EXPLICIT Extensions OPTIONAL }
  * ```
  * @example
  * // default constructor
  * o = new KJUR.asn1.ocsp.Request();
  * // constructor with certs (sha1 is used by default)
  * o = new KJUR.asn1.ocsp.Request({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN..."});
  * // constructor with certs and sha256
  * o = new KJUR.asn1.ocsp.Request({issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"});
  * // constructor with values
  * o = new KJUR.asn1.ocsp.Request({namehash: "1a...", keyhash: "ad...", serial: "1234", alg: "sha256"});
  */
@JSGlobal("jsrsasign.KJUR.asn1.ocsp.Request")
@js.native
class Request () extends ASN1Object {
  def this(params: AnonNamehash) = this()
  def this(params: CertificateRequest) = this()
}

