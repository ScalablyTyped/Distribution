package typings.ionicCore.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueApi extends StObject {
  
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
  implicit class QueueApiMutableBuilder[Self <: QueueApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setFlush(value: /* cb */ js.UndefOr[js.Function0[Unit]] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    @scala.inline
    def setRead(value: RafCallback => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTick(value: RafCallback => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: RafCallback => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
