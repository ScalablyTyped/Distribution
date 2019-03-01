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
    decode: js.Function1[java.lang.String, js.Object],
    encode: js.Function1[js.Object, java.lang.String],
    hash: js.Function1[js.Any, java.lang.String]
  ): util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("hash")(hash)
    __obj.asInstanceOf[util]
  }
}

