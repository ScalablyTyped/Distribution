package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.asn1.ocsp.OCSPUtil.getRequestHex")
@js.native
object getRequestHex extends js.Object {
  /**
    * generates hexadecimal string of OCSP request
    * @param issuerCert string of PEM issuer certificate
    * @param subjectCert string of PEM subject certificate to be verified by OCSP
    * @param algName hash algorithm name used for above arguments (ex. "sha1") DEFAULT: sha1
    * @return hexadecimal string of generated OCSP request
    * @description
    * This static method generates hexadecimal string of OCSP request.
    * @example
    * // generate OCSP request using sha1 algorithnm by default.
    * hReq = KJUR.asn1.ocsp.OCSPUtil.getRequestHex("-----BEGIN...", "-----BEGIN...");
    */
  def apply(issuerCert: String, subjectCert: String, alg: String): String = js.native
}

