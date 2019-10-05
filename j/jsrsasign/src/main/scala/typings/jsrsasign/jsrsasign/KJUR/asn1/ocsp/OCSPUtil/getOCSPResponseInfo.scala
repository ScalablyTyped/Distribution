package typings.jsrsasign.jsrsasign.KJUR.asn1.ocsp.OCSPUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.asn1.ocsp.OCSPUtil.getOCSPResponseInfo")
@js.native
object getOCSPResponseInfo extends js.Object {
  /**
    * parse OCSPResponse
    * @param h hexadecimal string of DER OCSPResponse
    * @return JSON object of parsed OCSPResponse
    * @description
    * This static method parse a hexadecimal string of DER OCSPResponse and
    * returns JSON object of its parsed result.
    * Its result has following properties:
    *
    * - responseStatus - integer of responseStatus
    * - certStatus - string of certStatus (ex. good, revoked or unknown)
    * - thisUpdate - string of thisUpdate in Zulu(ex. 20151231235959Z)
    * - nextUpdate - string of nextUpdate in Zulu(ex. 20151231235959Z)
    *
    * @example
    * info = KJUR.asn1.ocsp.OCSPUtil.getOCSPResponseInfo("3082...");
    */
  def apply(h: String): ResponseInfo = js.native
}

