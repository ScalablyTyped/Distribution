package typings.itSort

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[T], sorter: CompareFunction[T]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[T], sorter: CompareFunction[T]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  /**
    * Collects all values from an async iterator, sorts them
    * using the passed function and yields them
    */
  inline def default_T_Generator[T](source: js.Iterable[T], sorter: CompareFunction[T]): Generator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], sorter.asInstanceOf[js.Any])).asInstanceOf[Generator[T, Unit, Unit]]
  
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
}
