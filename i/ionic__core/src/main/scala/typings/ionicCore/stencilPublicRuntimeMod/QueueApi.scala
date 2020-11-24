package typings.ionicCore.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueApi extends js.Object {
  
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
  
  def read(cb: RafCallback): Unit = js.native
  
  def tick(cb: RafCallback): Unit = js.native
  
  def write(cb: RafCallback): Unit = js.native
}
object QueueApi {
  
  @scala.inline
  def apply(read: RafCallback => Unit, tick: RafCallback => Unit, write: RafCallback => Unit): QueueApi = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), tick = js.Any.fromFunction1(tick), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[QueueApi]
  }
  
  @scala.inline
  implicit class QueueApiOps[Self <: QueueApi] (val x: Self) extends AnyVal {
    
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
    def setRead(value: RafCallback => Unit): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTick(value: RafCallback => Unit): Self = this.set("tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: RafCallback => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setFlush(value: /* cb */ js.UndefOr[js.Function0[Unit]] => Unit): Self = this.set("flush", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
  }
}
