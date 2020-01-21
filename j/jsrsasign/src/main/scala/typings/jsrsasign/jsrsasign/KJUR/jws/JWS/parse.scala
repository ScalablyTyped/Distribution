package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.AnonHeaderObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.parse")
@js.native
object parse extends js.Object {
  /**
    * parse header and payload of JWS signature
    * @param sJWS string of JWS signature to parse
    * @return associative array of parsed header and payload. See below.
    * @throws if sJWS is malformed JWS signature
    * @description
    * This method parses JWS signature string.
    * Resulted associative array has following properties:
    *
    * - headerObj - JSON object of header
    * - payloadObj - JSON object of payload if payload is JSON string otherwise undefined
    * - headerPP - pretty printed JSON header by stringify
    * - payloadPP - pretty printed JSON payload by stringify if payload is JSON otherwise Base64URL decoded raw string of payload
    * - sigHex - hexadecimal string of signature
    *
    * @example
    * KJUR.jws.JWS.parse(sJWS) ->
    * {
    *   headerObj: {"alg": "RS256", "typ": "JWS"},
    *   payloadObj: {"product": "orange", "quantity": 100},
    *   headerPP:
    *   '{
    *     "alg": "RS256",
    *     "typ": "JWS"
    *   }',
    *   payloadPP:
    *   '{
    *     "product": "orange",
    *     "quantity": 100
    *   }',
    *   sigHex: "91f3cd..."
    * }
    */
  def apply(sJWS: String): AnonHeaderObj = js.native
}

