package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.parseJWS")
@js.native
object parseJWS extends js.Object {
  /**
    * parse JWS string and set public property 'parsedJWS' dictionary.
    * @param sJWS JWS signature string to be parsed.
    * @throws if sJWS is not comma separated string such like "Header.Payload.Signature".
    * @throws if JWS Header is a malformed JSON string.
    */
  def apply(sJWS: String): Unit = js.native
  def apply(sJWS: String, sigValNotNeeded: Boolean): Unit = js.native
}

