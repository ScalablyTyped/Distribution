package typings.jsmediatags.stringUtilsMod

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
  def apply(_value: String, bytesReadCount: Double, length: Double): InternalDecodedString = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], bytesReadCount = bytesReadCount.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalDecodedString]
  }
}

