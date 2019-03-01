package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  @JSName("toArray")
  def toArray_hex(msg: js.Any, enc: hashDotJsLib.hashDotJsLibStrings.hex): js.Array[scala.Double]
  def toHex(msg: js.Any): java.lang.String
}

object Utils {
  @scala.inline
  def apply(
    toArray_hex: js.Function2[js.Any, hashDotJsLib.hashDotJsLibStrings.hex, js.Array[scala.Double]],
    toHex: js.Function1[js.Any, java.lang.String]
  ): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toArray")(toArray_hex)
    __obj.updateDynamic("toHex")(toHex)
    __obj.asInstanceOf[Utils]
  }
}

