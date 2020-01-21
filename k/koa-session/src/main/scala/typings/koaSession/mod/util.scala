package typings.koaSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  /**
    * Decode the base64 cookie value to an object.
    */
  def decode(str: String): js.Object
  /**
    * Encode an object into a base64-encoded JSON string.
    */
  def encode(obj: js.Object): String
  def hash(sess: js.Any): String
}

object util {
  @scala.inline
  def apply(decode: String => js.Object, encode: js.Object => String, hash: js.Any => String): util = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hash = js.Any.fromFunction1(hash))
  
    __obj.asInstanceOf[util]
  }
}

