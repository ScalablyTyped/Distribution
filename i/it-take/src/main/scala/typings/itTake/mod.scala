package typings.itTake

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[T], limit: Double): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[T], limit: Double): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
}
