package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.inArray")
@js.native
object inArray extends js.Object {
  /**
    * check whether item is included by array
    * @param item check whether item is included by array
    * @param a check whether item is included by array
    * @return check whether item is included by array
    * This method verifies whether an item is included by an array.
    * It doesn't care about item ordering in an array.
    * @example
    * KJUR.jws.JWS.inArray('b', ['b', 'c', 'a']) => true
    * KJUR.jws.JWS.inArray('a', ['b', 'c', 'a']) => true
    * KJUR.jws.JWS.inArray('a', ['b', 'c']) => false
    */
  def apply(item: String, a: js.Array[String]): Boolean = js.native
}

