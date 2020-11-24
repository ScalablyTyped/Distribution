package typings.libp2pGossipsub.messageMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtoCodec[T] extends js.Object {
  
  def decode(buf: Uint8Array): T = js.native
  
  def encode(obj: T): Uint8Array = js.native
}
object ProtoCodec {
  
  @scala.inline
  def apply[T](decode: Uint8Array => T, encode: T => Uint8Array): ProtoCodec[T] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[ProtoCodec[T]]
  }
  
  @scala.inline
  implicit class ProtoCodecOps[Self <: ProtoCodec[_], T] (val x: Self with ProtoCodec[T]) extends AnyVal {
    
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
    def setDecode(value: Uint8Array => T): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: T => Uint8Array): Self = this.set("encode", js.Any.fromFunction1(value))
  }
}
