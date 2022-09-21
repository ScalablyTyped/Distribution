package typings.itLast

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
  /**
    * Returns the last item of an (async) iterable, unless empty, in which case
    * return `undefined`.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    */
  inline def apply[T](source: AsyncIterable[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
  
  @JSImport("it-last", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
