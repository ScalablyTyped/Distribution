package typings.hashWasm

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMutexMod {
  
  @JSImport("hash-wasm/dist/lib/mutex", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Mutex {
    
    /* CompleteClass */
    override def dispatch[T](fn: js.Function0[PromiseLike[T]]): js.Promise[T] = js.native
    
    /* CompleteClass */
    override def lock(): PromiseLike[js.Function0[Unit]] = js.native
    
    /* private */ /* CompleteClass */
    var mutex: Any = js.native
  }
  
  trait Mutex extends StObject {
    
    def dispatch[T](fn: js.Function0[PromiseLike[T]]): js.Promise[T]
    
    def lock(): PromiseLike[js.Function0[Unit]]
    
    /* private */ var mutex: Any
  }
  object Mutex {
    
    inline def apply(
      dispatch: js.Function0[PromiseLike[Any]] => js.Promise[Any],
      lock: () => PromiseLike[js.Function0[Unit]],
      mutex: Any
    ): Mutex = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), lock = js.Any.fromFunction0(lock), mutex = mutex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mutex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mutex] (val x: Self) extends AnyVal {
      
      inline def setDispatch(value: js.Function0[PromiseLike[Any]] => js.Promise[Any]): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setLock(value: () => PromiseLike[js.Function0[Unit]]): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
      
      inline def setMutex(value: Any): Self = StObject.set(x, "mutex", value.asInstanceOf[js.Any])
    }
  }
}
