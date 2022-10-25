package typings.itPeekable

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-peekable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[I](iterable: I): /* import warning: importer.ImportType#apply Failed type conversion: I extends std.Iterable<infer T> ? it-peekable.it-peekable.Peekable<T> : I extends std.AsyncIterable<infer T> ? it-peekable.it-peekable.AsyncPeekable<T> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: I extends std.Iterable<infer T> ? it-peekable.it-peekable.Peekable<T> : I extends std.AsyncIterable<infer T> ? it-peekable.it-peekable.AsyncPeekable<T> : never */ js.Any]
  
  trait AsyncPeek[T] extends StObject {
    
    def peek(): js.Promise[IteratorResult[T, Unit]]
  }
  object AsyncPeek {
    
    inline def apply[T](peek: () => js.Promise[IteratorResult[T, Unit]]): AsyncPeek[T] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[AsyncPeek[T]]
    }
    
    extension [Self <: AsyncPeek[?], T](x: Self & AsyncPeek[T]) {
      
      inline def setPeek(value: () => js.Promise[IteratorResult[T, Unit]]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait AsyncPeekable[T]
    extends StObject
       with AsyncIterable[T]
       with AsyncPeek[T]
       with Push[T]
       with AsyncIterator[T, Any, Unit]
  
  trait Peek[T] extends StObject {
    
    def peek(): IteratorResult[T, Unit]
  }
  object Peek {
    
    inline def apply[T](peek: () => IteratorResult[T, Unit]): Peek[T] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[Peek[T]]
    }
    
    extension [Self <: Peek[?], T](x: Self & Peek[T]) {
      
      inline def setPeek(value: () => IteratorResult[T, Unit]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Peekable[T]
    extends StObject
       with Iterable[T]
       with Peek[T]
       with Push[T]
       with Iterator[T, Any, Unit]
  
  trait Push[T] extends StObject {
    
    def push(value: T): Unit
  }
  object Push {
    
    inline def apply[T](push: T => Unit): Push[T] = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push[T]]
    }
    
    extension [Self <: Push[?], T](x: Self & Push[T]) {
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
