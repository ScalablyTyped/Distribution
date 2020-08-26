package typings.levelCodec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodecEncoder extends js.Object {
  var buffer: Boolean = js.native
  var `type`: String = js.native
  def decode(`val`: js.Any): js.Any = js.native
  def encode(`val`: js.Any): js.Any = js.native
}

object CodecEncoder {
  @scala.inline
  def apply(buffer: Boolean, decode: js.Any => js.Any, encode: js.Any => js.Any, `type`: String): CodecEncoder = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecEncoder]
  }
  @scala.inline
  implicit class CodecEncoderOps[Self <: CodecEncoder] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecode(value: js.Any => js.Any): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: js.Any => js.Any): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

