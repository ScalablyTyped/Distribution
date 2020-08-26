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
@js.native
trait TBSRequest extends ASN1Object {
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

object TBSRequest {
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
    isModified: String,
    setRequestListByParam: js.Array[CertificateRequest] => Unit
  ): TBSRequest = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setRequestListByParam = js.Any.fromFunction1(setRequestListByParam))
    __obj.asInstanceOf[TBSRequest]
  }
  @scala.inline
  implicit class TBSRequestOps[Self <: TBSRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetRequestListByParam(value: js.Array[CertificateRequest] => Unit): Self = this.set("setRequestListByParam", js.Any.fromFunction1(value))
  }
  
}

