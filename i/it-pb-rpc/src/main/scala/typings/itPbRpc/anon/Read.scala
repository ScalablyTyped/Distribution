package typings.itPbRpc.anon

import typings.buffer.mod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read[Return] extends js.Object {
  
  def read(): Return = js.native
  
  def write(d: Buffer): Unit = js.native
}
object Read {
  
  @scala.inline
  def apply[Return](read: () => Return, write: Buffer => Unit): Read[Return] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Read[Return]]
  }
  
  @scala.inline
  implicit class ReadOps[Self <: Read[_], Return] (val x: Self with Read[Return]) extends AnyVal {
    
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
    def setRead(value: () => Return): Self = this.set("read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: Buffer => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
