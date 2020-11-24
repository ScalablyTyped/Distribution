package typings.itPbRpc.anon

import typings.buffer.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecodeEncode[Return] extends js.Object {
  
  def decode(data: Buffer): Return = js.native
  
  def encode(data: js.Any): Buffer = js.native
}
object DecodeEncode {
  
  @scala.inline
  def apply[Return](decode: Buffer => Return, encode: js.Any => Buffer): DecodeEncode[Return] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[DecodeEncode[Return]]
  }
  
  @scala.inline
  implicit class DecodeEncodeOps[Self <: DecodeEncode[_], Return] (val x: Self with DecodeEncode[Return]) extends AnyVal {
    
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
    def setDecode(value: Buffer => Return): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.Any => Buffer): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
