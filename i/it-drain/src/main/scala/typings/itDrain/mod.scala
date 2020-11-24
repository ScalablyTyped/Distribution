package typings.itDrain

import typings.std.AsyncIterable
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-drain/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Drains an (async) iterable discarding its' content and does not return
    * anything.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<void>}
    */
  def apply[T](source: AsyncIterable[T]): js.Promise[Unit] = js.native
  def apply[T](source: Iterable[T]): js.Promise[Unit] = js.native
}
