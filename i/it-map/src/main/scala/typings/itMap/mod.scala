package typings.itMap

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[I, O](source: js.Iterable[I], func: js.Function1[/* val */ I, O | js.Promise[O]]): AsyncGenerator[O, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[O, Unit, Unit]]
  inline def default[I, O](source: AsyncIterable[I], func: js.Function1[/* val */ I, O | js.Promise[O]]): AsyncGenerator[O, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[O, Unit, Unit]]
}
