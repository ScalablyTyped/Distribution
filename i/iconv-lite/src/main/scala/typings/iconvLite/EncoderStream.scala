package typings.iconvLite

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncoderStream extends js.Object {
  
  def end(): js.UndefOr[Buffer] = js.native
  
  def write(str: String): Buffer = js.native
}
object EncoderStream {
  
  @scala.inline
  def apply(end: () => js.UndefOr[Buffer], write: String => Buffer): EncoderStream = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EncoderStream]
  }
  
  @scala.inline
  implicit class EncoderStreamOps[Self <: EncoderStream] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => js.UndefOr[Buffer]): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrite(value: String => Buffer): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
