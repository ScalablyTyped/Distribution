package typings.hashDotJs

import typings.hashDotJs.hashDotJsStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  @JSName("toArray")
  def toArray_hex(msg: js.Any, enc: hex): js.Array[Double]
  def toHex(msg: js.Any): String
}

object Utils {
  @scala.inline
  def apply(toArray_hex: (js.Any, hex) => js.Array[Double], toHex: js.Any => String): Utils = {
    val __obj = js.Dynamic.literal(toHex = js.Any.fromFunction1(toHex))
    __obj.updateDynamic("toArray")(js.Any.fromFunction2(toArray_hex))
    __obj.asInstanceOf[Utils]
  }
}

