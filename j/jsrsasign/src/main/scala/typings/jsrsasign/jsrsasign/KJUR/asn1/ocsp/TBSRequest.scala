package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 TBSRequest class for OCSP
  * @param params associative array of parameters
  * @description
  * TBSRequest ASN.1 class is defined in
  * [RFC 6960 4.1.1](https://tools.ietf.org/html/rfc6960#section-4.1.1).
  * ```
  * TBSRequest ::= SEQUENCE {
  *   version            [0] EXPLICIT Version DEFAULT v1,
  *   requestorName      [1] EXPLICIT GeneralName OPTIONAL,
  *   requestList            SEQUENCE OF Request,
  *   requestExtensions  [2] EXPLICIT Extensions OPTIONAL }
  * ```
  * @example
  * // default constructor
  * o = new KJUR.asn1.ocsp.TBSRequest();
  * // constructor with requestList parameter
  * o = new KJUR.asn1.ocsp.TBSRequest({reqList:[
  *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
  *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
  * ]});
  */
@JSGlobal("jsrsasign.KJUR.asn1.ocsp.TBSRequest")
@js.native
class TBSRequest () extends ASN1Object {
  def this(params: CertificateRequestList) = this()
  /**
    * set TBSRequest ASN.1 object by array of parameters.
    * @param aParams array of parameters for Request class
    * @example
    * o = new KJUR.asn1.ocsp.TBSRequest();
    * o.setRequestListByParam([
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg:},
    *   {issuerCert: "-----BEGIN...", subjectCert: "-----BEGIN...", alg: "sha256"}
    * ]);
    */
  def setRequestListByParam(aParams: js.Array[CertificateRequest]): Unit = js.native
}

