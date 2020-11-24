package typings.itAll

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-all/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Collects all values from an (async) iterable into an array and returns it.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<T[]>}
    */
  def apply[T](source: AsyncIterable[T]): js.Promise[js.Array[T]] = js.native
  def apply[T](source: Iterable[T]): js.Promise[js.Array[T]] = js.native
}
