package typings.hashDotJs

import typings.hashDotJs.hashDotJsStrings.big
import typings.hashDotJs.hashDotJsStrings.little
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockHash[T] extends js.Object {
  var endian: big | little
  var hmacStrength: Double
  var padLength: Double
}

object BlockHash {
  @scala.inline
  def apply[T](endian: big | little, hmacStrength: Double, padLength: Double): BlockHash[T] = {
    val __obj = js.Dynamic.literal(endian = endian.asInstanceOf[js.Any], hmacStrength = hmacStrength, padLength = padLength)
  
    __obj.asInstanceOf[BlockHash[T]]
  }
}

