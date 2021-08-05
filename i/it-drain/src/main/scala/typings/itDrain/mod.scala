package typings.itDrain

import typings.std.AsyncIterable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Drains an (async) iterable discarding its' content and does not return
    * anything.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    * @returns {Promise<void>}
    */
  inline def apply[T](source: AsyncIterable[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def apply[T](source: Iterable[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("it-drain/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
