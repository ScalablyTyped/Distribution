package typings.jsrsasign.jsrsasign.KJUR.jws.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.KJUR.jws.JWS.includedArray")
@js.native
object includedArray extends js.Object {
  /**
    * check whether array is included by another array
    * @param a1 check whether set a1 is included by a2
    * @param a2 check whether set a1 is included by a2
    * @return check whether set a1 is included by a2
    * This method verifies whether an array is included by another array.
    * It doesn't care about item ordering in a array.
    * @example
    * KJUR.jws.JWS.includedArray(['b'], ['b', 'c', 'a']) => true
    * KJUR.jws.JWS.includedArray(['a', 'b'], ['b', 'c', 'a']) => true
    * KJUR.jws.JWS.includedArray(['a', 'b'], ['b', 'c']) => false
    */
  def apply(a1: js.Array[String], a2: js.Array[String]): Boolean = js.native
}

