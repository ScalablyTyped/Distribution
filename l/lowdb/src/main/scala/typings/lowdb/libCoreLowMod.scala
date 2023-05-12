package typings.lowdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLowMod {
  
  @JSImport("lowdb/lib/core/Low", "Low")
  @js.native
  open class Low[T] protected () extends StObject {
    def this(adapter: Adapter[T], defaultData: T) = this()
    
    var adapter: Adapter[T] = js.native
    
    var data: T = js.native
    
    def read(): js.Promise[Unit] = js.native
    
    def write(): js.Promise[Unit] = js.native
  }
  
  @JSImport("lowdb/lib/core/Low", "LowSync")
  @js.native
  open class LowSync[T] protected () extends StObject {
    def this(adapter: SyncAdapter[T], defaultData: T) = this()
    
    var adapter: SyncAdapter[T] = js.native
    
    var data: T = js.native
    
    def read(): Unit = js.native
    
    def write(): Unit = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Adapter[?], T] (val x: Self & Adapter[T]) extends AnyVal {
      
      inline def setRead(value: () => js.Promise[T | Null]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncAdapter[?], T] (val x: Self & SyncAdapter[T]) extends AnyVal {
      
      inline def setRead(value: () => T | Null): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: T => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
