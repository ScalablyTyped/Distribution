package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.anon.Typ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWSResult extends js.Object {
  /** JSON object of header */
  var headerObj: Typ
  /** pretty printed JSON header by stringify */
  var headerPP: String
  /** JSON object of payload if payload is JSON string otherwise undefined */
  var payloadObj: js.UndefOr[js.Object] = js.undefined
  /** pretty printed JSON payload by stringify if payload is JSON otherwise Base64URL decoded raw string of payload */
  var payloadPP: String
  /** hexadecimal string of signature */
  var sigHex: String
}

object JWSResult {
  @scala.inline
  def apply(headerObj: Typ, headerPP: String, payloadPP: String, sigHex: String, payloadObj: js.Object = null): JWSResult = {
    val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], payloadPP = payloadPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
    if (payloadObj != null) __obj.updateDynamic("payloadObj")(payloadObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWSResult]
  }
}

