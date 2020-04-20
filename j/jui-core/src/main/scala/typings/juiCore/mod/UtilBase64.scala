package typings.juiCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilBase64 extends js.Object {
  def decode(input: String): String
  def encode(input: String): String
}

object UtilBase64 {
  @scala.inline
  def apply(decode: String => String, encode: String => String): UtilBase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[UtilBase64]
  }
}

