package typings.itFirst

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
  /**
    * Returns the first result from an (async) iterable, unless empty, in which
    * case returns `undefined`.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    */
  inline def apply[T](source: AsyncIterable[T]): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[T]]]
  
  @JSImport("it-first", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
