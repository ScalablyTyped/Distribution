package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.getEncodedSignatureValueFromJWS")
@js.native
object getEncodedSignatureValueFromJWS extends js.Object {
  /**
    * get Encoed Signature Value from JWS string.
    * @param sJWS JWS signature string to be verified
    * @return string of Encoded Signature Value
    * @throws if sJWS is not comma separated string such like "Header.Payload.Signature".
    */
  def apply(sJWS: String): String = js.native
}

