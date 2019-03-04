package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockHash[T] extends js.Object {
  var endian: hashDotJsLib.hashDotJsLibStrings.big | hashDotJsLib.hashDotJsLibStrings.little
  var hmacStrength: scala.Double
  var padLength: scala.Double
}

object BlockHash {
  @scala.inline
  def apply[T](
    endian: hashDotJsLib.hashDotJsLibStrings.big | hashDotJsLib.hashDotJsLibStrings.little,
    hmacStrength: scala.Double,
    padLength: scala.Double
  ): BlockHash[T] = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], hmacStrength = hmacStrength, padLength = padLength)
  
    __obj.asInstanceOf[BlockHash[T]]
  }
}

