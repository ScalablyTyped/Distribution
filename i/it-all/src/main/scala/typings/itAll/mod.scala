package typings.itAll

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  /**
    * Collects all values from an (async) iterable into an array and returns it.
    *
    * @template T
    * @param {AsyncIterable<T>|Iterable<T>} source
    */
  inline def apply[T](source: AsyncIterable[T]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  @JSImport("it-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
