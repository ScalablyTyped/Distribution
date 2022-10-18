package typings.itParallel

import typings.itParallel.anon.Concurrency
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  /**
    * @template T
    * @typedef {object} Operation
    * @property {boolean} done
    * @property {boolean} ok
    * @property {Error} err
    * @property {T} value
    */
  /**
    * Takes an (async) iterator that emits promise-returning functions,
    * invokes them in parallel and emits the results as they become available but
    * in the same order as the input
    *
    * @template T
    * @param {Iterable<() => Promise<T>> | AsyncIterable<() => Promise<T>>} source
    * @param {object} [options]
    * @param {number} [options.concurrency=Infinity]
    * @param {boolean} [options.ordered=false]
    * @returns {AsyncIterable<T>}
    */
  inline def apply[T](source: js.Iterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def apply[T](source: js.Iterable[js.Function0[js.Promise[T]]], options: Concurrency): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  inline def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  inline def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], options: Concurrency): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("it-parallel/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Operation[T] extends StObject {
    
    var done: Boolean
    
    var err: js.Error
    
    var ok: Boolean
    
    var value: T
  }
  object Operation {
    
    inline def apply[T](done: Boolean, err: js.Error, ok: Boolean, value: T): Operation[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation[T]]
    }
    
    extension [Self <: Operation[?], T](x: Self & Operation[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
