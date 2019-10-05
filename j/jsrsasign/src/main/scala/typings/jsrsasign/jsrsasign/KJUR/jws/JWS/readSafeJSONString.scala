package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.readSafeJSONString")
@js.native
object readSafeJSONString extends js.Object {
  /**
    * read a String "s" as JSON object if it is safe.
    * If a String "s" is a malformed JSON string or not JSON string,
    * this returns null, otherwise returns JSON object.
    * @param s JSON string
    * @return JSON object or null
    */
  def apply(s: String): js.Object | Null = js.native
}

