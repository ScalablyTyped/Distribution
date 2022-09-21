package typings.lowdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowSyncMod {
  
  @JSImport("lowdb/lib/LowSync", "LowSync")
  @js.native
  open class LowSync[T] protected () extends StObject {
    def this(adapter: SyncAdapter[T]) = this()
    
    var adapter: SyncAdapter[T] = js.native
    
    var data: T | Null = js.native
    
    def read(): Unit = js.native
    
    def write(): Unit = js.native
  }
  
  trait SyncAdapter[T] extends StObject {
    
    def read(): T | Null
    
    def write(data: T): Unit
  }
  object SyncAdapter {
    
    inline def apply[T](read: () => T | Null, write: T => Unit): SyncAdapter[T] = {
      val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[SyncAdapter[T]]
    }
    
    extension [Self <: SyncAdapter[?], T](x: Self & SyncAdapter[T]) {
      
      inline def setRead(value: () => T | Null): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
