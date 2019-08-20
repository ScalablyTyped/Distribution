package typings.jsmediatags.build2StringUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDecodedString extends js.Object {
  var _value: String
  var bytesReadCount: Double
  var length: Double
}

object InternalDecodedString {
  @scala.inline
  def apply(_value: String, bytesReadCount: Double, length: Double, toString: () => String): InternalDecodedString = {
    val __obj = js.Dynamic.literal(_value = _value, bytesReadCount = bytesReadCount, length = length, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[InternalDecodedString]
  }
}

