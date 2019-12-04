package typings.javascriptDashObfuscator.srcInterfacesUtilsIEscapeSequenceEncoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEscapeSequenceEncoder extends js.Object {
  /**
    * @param {string} string
    * @param {boolean} encodeAllSymbols
    * @returns {string}
    */
  def encode(string: String, encodeAllSymbols: Boolean): String
}

object IEscapeSequenceEncoder {
  @scala.inline
  def apply(encode: (String, Boolean) => String): IEscapeSequenceEncoder = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction2(encode))
  
    __obj.asInstanceOf[IEscapeSequenceEncoder]
  }
}

