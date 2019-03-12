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
    toArray_hex: (js.Any, hashDotJsLib.hashDotJsLibStrings.hex) => js.Array[scala.Double],
    toHex: js.Any => java.lang.String
  ): Utils = {
    val __obj = js.Dynamic.literal(toHex = js.Any.fromFunction1(toHex))
    __obj.updateDynamic("toArray")(js.Any.fromFunction2(toArray_hex))
    __obj.asInstanceOf[Utils]
  }
}

