package typings.itFirst

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-first/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Returns the first result from an (async) iterable, unless empty, in which
    * case returns `undefined`.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<T|void>}
    */
  def apply[T](source: AsyncIterable[T]): js.Promise[Unit | T] = js.native
  def apply[T](source: Iterable[T]): js.Promise[Unit | T] = js.native
}
