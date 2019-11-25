package typings.levelDashCodec.levelDashCodecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecEncoder extends js.Object {
  var buffer: Boolean
  var `type`: String
  def decode(`val`: js.Any): js.Any
  def encode(`val`: js.Any): js.Any
}

object CodecEncoder {
  @scala.inline
  def apply(buffer: Boolean, decode: js.Any => js.Any, encode: js.Any => js.Any, `type`: String): CodecEncoder = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodecEncoder]
  }
}

