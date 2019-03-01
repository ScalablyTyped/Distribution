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
  def apply(
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[java.lang.String, java.lang.String]
  ): UtilBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[UtilBase64]
  }
}

