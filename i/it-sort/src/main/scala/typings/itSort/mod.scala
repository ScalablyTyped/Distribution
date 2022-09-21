package typings.itSort

import typings.itSort.itSortNumbers.`-1`
import typings.itSort.itSortNumbers.`0`
import typings.itSort.itSortNumbers.`1`
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](source: js.Iterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  /**
    * Collects all values from an async iterator, sorts them
    * using the passed function and yields them
    *
    * @template T
    * @param {AsyncIterable<T> | Iterable<T>} source
    * @param {(a: T, b: T) => -1 | 0 | 1} sorter
    */
  inline def apply[T](source: AsyncIterable[T], sorter: js.Function2[/* a */ T, /* b */ T, `-1` | `0` | `1`]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  @JSImport("it-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
