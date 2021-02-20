package typings.itPeekable

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Iterable
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("it-peekable/dist", JSImport.Namespace)
  @js.native
  def apply[I /* <: Iterable[_] | AsyncIterable[_] */](iterable: I): (AsyncIterable[_] with AsyncPeek[_] with Push[_] with (AsyncIterator[_, _, js.UndefOr[scala.Nothing]])) | (Iterable[_] with Peek[_] with Push[_] with (Iterator[_, _, js.UndefOr[scala.Nothing]])) = js.native
  
  @js.native
  trait AsyncPeek[T] extends StObject {
    
    def peek(): js.Promise[IteratorResult[T, Unit]] = js.native
  }
  object AsyncPeek {
    
    @scala.inline
    def apply[T](peek: () => js.Promise[IteratorResult[T, Unit]]): AsyncPeek[T] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[AsyncPeek[T]]
    }
    
    @scala.inline
    implicit class AsyncPeekMutableBuilder[Self <: AsyncPeek[_], T] (val x: Self with AsyncPeek[T]) extends AnyVal {
      
      @scala.inline
      def setPeek(value: () => js.Promise[IteratorResult[T, Unit]]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * <T>
    */
  type AsyncPeekable[T] = AsyncIterable[T] with AsyncPeek[T] with Push[T] with (AsyncIterator[T, _, js.UndefOr[scala.Nothing]])
  
  @js.native
  trait Peek[T] extends StObject {
    
    def peek(): IteratorResult[T, Unit] = js.native
  }
  object Peek {
    
    @scala.inline
    def apply[T](peek: () => IteratorResult[T, Unit]): Peek[T] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[Peek[T]]
    }
    
    @scala.inline
    implicit class PeekMutableBuilder[Self <: Peek[_], T] (val x: Self with Peek[T]) extends AnyVal {
      
      @scala.inline
      def setPeek(value: () => IteratorResult[T, Unit]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * <T>
    */
  type Peekable[T] = Iterable[T] with Peek[T] with Push[T] with (Iterator[T, _, js.UndefOr[scala.Nothing]])
  
  @js.native
  trait Push[T] extends StObject {
    
    def push(value: T): Unit = js.native
  }
  object Push {
    
    @scala.inline
    def apply[T](push: T => Unit): Push[T] = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push[T]]
    }
    
    @scala.inline
    implicit class PushMutableBuilder[Self <: Push[_], T] (val x: Self with Push[T]) extends AnyVal {
      
      @scala.inline
      def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
