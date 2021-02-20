package typings.itParallelBatch

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("it-parallel-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = js.native
  @JSImport("it-parallel-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: String): AsyncIterable[T] = js.native
  @JSImport("it-parallel-batch/dist", JSImport.Namespace)
  @js.native
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: Double): AsyncIterable[T] = js.native
  
  type Task[T] = js.Function0[js.Promise[T]]
}
