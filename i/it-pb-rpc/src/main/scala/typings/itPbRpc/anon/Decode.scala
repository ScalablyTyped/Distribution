package typings.itPbRpc.anon

import typings.buffer.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decode[T] extends js.Object {
  
  def decode(data: Buffer): T = js.native
}
object Decode {
  
  @scala.inline
  def apply[T](decode: Buffer => T): Decode[T] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
    __obj.asInstanceOf[Decode[T]]
  }
  
  @scala.inline
  implicit class DecodeOps[Self <: Decode[_], T] (val x: Self with Decode[T]) extends AnyVal {
    
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
    def setDecode(value: Buffer => T): Self = this.set("decode", js.Any.fromFunction1(value))
  }
}
