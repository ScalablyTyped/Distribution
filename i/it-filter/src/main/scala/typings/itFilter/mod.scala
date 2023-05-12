package typings.itFilter

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[T], fn: js.Function1[/* val */ T, Boolean | js.Promise[Boolean]]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[T], fn: js.Function1[/* val */ T, Boolean | js.Promise[Boolean]]): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  inline def default_T_Generator[T](source: js.Iterable[T], fn: js.Function1[/* val */ T, Boolean]): Generator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Generator[T, Unit, Unit]]
}
