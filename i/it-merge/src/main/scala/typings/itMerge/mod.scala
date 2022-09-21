package typings.itMerge

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Treat one or more iterables as a single iterable.
    *
    * Nb. sources are iterated over in parallel so the
    * order of emitted items is not guaranteed.
    *
    * @template T
    * @param {...AsyncIterable<T>|Iterable<T>} sources
    * @returns {AsyncIterable<T>}
    */
  inline def apply[T](sources: (AsyncIterable[T] | js.Iterable[T])*): AsyncIterable[T] = ^.asInstanceOf[js.Dynamic].apply(sources.asInstanceOf[Seq[js.Any]]*).asInstanceOf[AsyncIterable[T]]
  
  @JSImport("it-merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
