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
  
  /**
    * @template T
    * @typedef {Object} Peek
    * @property {() => IteratorResult<T, void>} peek
    */
  /**
    * @template T
    * @typedef {Object} AsyncPeek
    * @property {() => Promise<IteratorResult<T, void>>} peek
    */
  /**
    * @template T
    * @typedef {Object} Push
    * @property {(value:T) => void} push
    */
  /**
    * @template T
    * @typedef {Iterable<T> & Peek<T> & Push<T> & Iterator<T>} Peekable<T>
    */
  /**
    * @template T
    * @typedef {AsyncIterable<T> & AsyncPeek<T> & Push<T> & AsyncIterator<T>} AsyncPeekable<T>
    */
  /**
    * @template {Iterable<any> | AsyncIterable<any>} I
    * @param {I} iterable
    * @returns {I extends Iterable<infer T>
    *  ? Peekable<T>
    *  : I extends AsyncIterable<infer T>
    *  ? AsyncPeekable<T>
    *  : never
    * }
    */
  inline def apply[I /* <: Iterable[js.Any] | AsyncIterable[js.Any] */](iterable: I): (AsyncIterable[js.Any] & AsyncPeek[js.Any] & Push[js.Any] & (AsyncIterator[js.Any, js.Any, Unit])) | (Iterable[js.Any] & Peek[js.Any] & Push[js.Any] & (Iterator[js.Any, js.Any, Unit])) = ^.asInstanceOf[js.Dynamic].apply(iterable.asInstanceOf[js.Any]).asInstanceOf[(AsyncIterable[js.Any] & AsyncPeek[js.Any] & Push[js.Any] & (AsyncIterator[js.Any, js.Any, Unit])) | (Iterable[js.Any] & Peek[js.Any] & Push[js.Any] & (Iterator[js.Any, js.Any, Unit]))]
  
  @JSImport("it-peekable/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  /**
    * <T>
    */
  @js.native
  trait AsyncPeekable[T]
    extends StObject
       with AsyncIterable[T]
       with AsyncPeek[T]
       with Push[T]
       with AsyncIterator[T, js.Any, Unit]
  
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
  
  /**
    * <T>
    */
  @js.native
  trait Peekable[T]
    extends StObject
       with Iterable[T]
       with Peek[T]
       with Push[T]
       with Iterator[T, js.Any, Unit]
  
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
