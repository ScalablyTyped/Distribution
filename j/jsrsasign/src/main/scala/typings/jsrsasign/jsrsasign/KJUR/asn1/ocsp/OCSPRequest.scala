package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
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
@js.native
trait OCSPRequest extends ASN1Object

object OCSPRequest {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String
  ): OCSPRequest = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPRequest]
  }
}

