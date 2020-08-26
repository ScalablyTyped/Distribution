package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.anon.Typ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWSResult extends js.Object {
  /** JSON object of header */
  var headerObj: Typ = js.native
  /** pretty printed JSON header by stringify */
  var headerPP: String = js.native
  /** JSON object of payload if payload is JSON string otherwise undefined */
  var payloadObj: js.UndefOr[js.Object] = js.native
  /** pretty printed JSON payload by stringify if payload is JSON otherwise Base64URL decoded raw string of payload */
  var payloadPP: String = js.native
  /** hexadecimal string of signature */
  var sigHex: String = js.native
}

object JWSResult {
  @scala.inline
  def apply(headerObj: Typ, headerPP: String, payloadPP: String, sigHex: String): JWSResult = {
    val __obj = js.Dynamic.literal(headerObj = headerObj.asInstanceOf[js.Any], headerPP = headerPP.asInstanceOf[js.Any], payloadPP = payloadPP.asInstanceOf[js.Any], sigHex = sigHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWSResult]
  }
  @scala.inline
  implicit class JWSResultOps[Self <: JWSResult] (val x: Self) extends AnyVal {
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
    def setHeaderObj(value: Typ): Self = this.set("headerObj", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderPP(value: String): Self = this.set("headerPP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayloadPP(value: String): Self = this.set("payloadPP", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigHex(value: String): Self = this.set("sigHex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayloadObj(value: js.Object): Self = this.set("payloadObj", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadObj: Self = this.set("payloadObj", js.undefined)
  }
  
}

