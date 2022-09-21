package typings.itTake

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T], limit: Double): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  /**
    * Stop iteration after n items have been received.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {number} limit
    * @returns {AsyncIterable<T>}
    */
  inline def apply[T](source: AsyncIterable[T], limit: Double): AsyncIterable[T] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("it-take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
