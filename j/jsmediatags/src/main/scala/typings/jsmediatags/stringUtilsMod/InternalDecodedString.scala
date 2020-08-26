package typings.jsmediatags.stringUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalDecodedString extends js.Object {
  var _value: String = js.native
  var bytesReadCount: Double = js.native
  var length: Double = js.native
}

object InternalDecodedString {
  @scala.inline
  def apply(_value: String, bytesReadCount: Double, length: Double): InternalDecodedString = {
    val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], bytesReadCount = bytesReadCount.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalDecodedString]
  }
  @scala.inline
  implicit class InternalDecodedStringOps[Self <: InternalDecodedString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_value(value: String): Self = this.set("_value", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesReadCount(value: Double): Self = this.set("bytesReadCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

