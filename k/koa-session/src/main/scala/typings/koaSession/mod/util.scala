package typings.koaSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait util extends js.Object {
  /**
    * Decode the base64 cookie value to an object.
    */
  def decode(str: String): js.Object = js.native
  /**
    * Encode an object into a base64-encoded JSON string.
    */
  def encode(obj: js.Object): String = js.native
  def hash(sess: js.Any): String = js.native
}

object util {
  @scala.inline
  def apply(decode: String => js.Object, encode: js.Object => String, hash: js.Any => String): util = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hash = js.Any.fromFunction1(hash))
    __obj.asInstanceOf[util]
  }
  @scala.inline
  implicit class utilOps[Self <: util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecode(value: String => js.Object): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: js.Object => String): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def setHash(value: js.Any => String): Self = this.set("hash", js.Any.fromFunction1(value))
  }
  
}

