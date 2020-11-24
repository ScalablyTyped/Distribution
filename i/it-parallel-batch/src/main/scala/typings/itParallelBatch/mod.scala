package typings.itParallelBatch

import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-parallel-batch/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncIterable[T] = js.native
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: String): AsyncIterable[T] = js.native
  def apply[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: Double): AsyncIterable[T] = js.native
  
  type Task[T] = js.Function0[js.Promise[T]]
}
