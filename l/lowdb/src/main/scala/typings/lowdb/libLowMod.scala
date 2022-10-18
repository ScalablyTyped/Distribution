package typings.lowdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLowMod {
  
  @JSImport("lowdb/lib/Low", "Low")
  @js.native
  open class Low[T] protected () extends StObject {
    def this(adapter: Adapter[T]) = this()
    
    var adapter: Adapter[T] = js.native
    
    var data: T | Null = js.native
    
    def read(): js.Promise[Unit] = js.native
    
    def write(): js.Promise[Unit] = js.native
  }
  
  trait Adapter[T] extends StObject {
    
    def read(): js.Promise[T | Null]
    
    def write(data: T): js.Promise[Unit]
  }
  object Adapter {
    
    inline def apply[T](read: () => js.Promise[T | Null], write: T => js.Promise[Unit]): Adapter[T] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Adapter[T]]
    }
    
    extension [Self <: Adapter[?], T](x: Self & Adapter[T]) {
      
      inline def setRead(value: () => js.Promise[T | Null]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
