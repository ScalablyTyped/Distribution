package typings.itFirst

import typings.std.AsyncIterable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns the first result from an (async) iterable, unless empty, in which
    * case returns `undefined`.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<T|void>}
    */
  inline def apply[T](source: AsyncIterable[T]): js.Promise[Unit | T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | T]]
  inline def apply[T](source: Iterable[T]): js.Promise[Unit | T] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit | T]]
  
  @JSImport("it-first/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
