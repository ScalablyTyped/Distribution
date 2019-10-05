package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import typings.jsrsasign.jsrsasignNumbers.`0`
import typings.jsrsasign.jsrsasignNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.isSafeJSONString")
@js.native
object isSafeJSONString extends js.Object {
  /**
    * check whether a String "s" is a safe JSON string or not.
    * If a String "s" is a malformed JSON string or an other object type
    * this returns 0, otherwise this returns 1.
    * @param s JSON string
    * @return 1 or 0
    */
  def apply(s: String): `0` | `1` = js.native
  def apply(s: String, h: js.Object, p: String): `0` | `1` = js.native
}

