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
  
  inline def default[T](iterable: js.Iterable[T]): Peekable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any]).asInstanceOf[Peekable[T]]
  inline def default[T](iterable: AsyncIterable[T]): AsyncPeekable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any]).asInstanceOf[AsyncPeekable[T]]
  
  trait AsyncPeek[T] extends StObject {
    
    def peek(): js.Promise[IteratorResult[T, Unit]]
  }
  object AsyncPeek {
    
    inline def apply[T](peek: () => js.Promise[IteratorResult[T, Unit]]): AsyncPeek[T] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[AsyncPeek[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncPeek[?], T] (val x: Self & AsyncPeek[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Peek[?], T] (val x: Self & Peek[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Push[?], T] (val x: Self & Push[T]) extends AnyVal {
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
