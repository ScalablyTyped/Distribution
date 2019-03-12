package typings
package juiDashCoreLib.juiDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilBase64 extends js.Object {
  def decode(input: java.lang.String): java.lang.String
  def encode(input: java.lang.String): java.lang.String
}

object UtilBase64 {
  @scala.inline
  def apply(decode: java.lang.String => java.lang.String, encode: java.lang.String => java.lang.String): UtilBase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[UtilBase64]
  }
}

