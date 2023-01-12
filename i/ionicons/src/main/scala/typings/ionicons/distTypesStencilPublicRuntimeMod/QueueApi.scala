package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueApi extends StObject {
  
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var flush: js.UndefOr[js.Function1[/* cb */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  
  def read(cb: RafCallback): Unit
  
  def tick(cb: RafCallback): Unit
  
  def write(cb: RafCallback): Unit
}
object QueueApi {
  
  inline def apply(read: RafCallback => Unit, tick: RafCallback => Unit, write: RafCallback => Unit): QueueApi = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), tick = js.Any.fromFunction1(tick), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[QueueApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueApi] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setFlush(value: /* cb */ js.UndefOr[js.Function0[Unit]] => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setRead(value: RafCallback => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setTick(value: RafCallback => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    inline def setWrite(value: RafCallback => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
