package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  /**
    * Decode the base64 cookie value to an object.
    */
  def decode(str: java.lang.String): js.Object
  /**
    * Encode an object into a base64-encoded JSON string.
    */
  def encode(obj: js.Object): java.lang.String
  def hash(sess: js.Any): java.lang.String
}

object util {
  @scala.inline
  def apply(
    decode: java.lang.String => js.Object,
    encode: js.Object => java.lang.String,
    hash: js.Any => java.lang.String
  ): util = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hash = js.Any.fromFunction1(hash))
  
    __obj.asInstanceOf[util]
  }
}

