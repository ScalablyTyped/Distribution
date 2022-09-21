package typings.itFilter

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T], fn: js.Function1[/* arg0 */ T, Boolean | js.Promise[Boolean]]): AsyncGenerator[T, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Any]]
  /**
    * Filters the passed (async) iterable by using the filter function
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @param {function(T):boolean|Promise<boolean>} fn
    */
  inline def apply[T](source: AsyncIterable[T], fn: js.Function1[/* arg0 */ T, Boolean | js.Promise[Boolean]]): AsyncGenerator[T, Unit, Any] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Any]]
  
  @JSImport("it-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
