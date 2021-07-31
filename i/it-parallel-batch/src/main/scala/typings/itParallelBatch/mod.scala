package typings.itParallelBatch

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @template T
    * @typedef {function():Promise<T>} Task
    */
  /**
    * Takes an (async) iterator that emits promise-returning functions,
    * invokes them in parallel and emits the results as they become available but
    * in the same order as the input
    *
    * @template T
    * @param {AsyncIterable<Task<T>>} source
    * @param {number|string} [size=1]
    * @returns {AsyncIterable<T>}
    */
  @scala.inline
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: String): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  @scala.inline
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: Double): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("it-parallel-batch/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Task[T] = js.Function0[js.Promise[T]]
}
