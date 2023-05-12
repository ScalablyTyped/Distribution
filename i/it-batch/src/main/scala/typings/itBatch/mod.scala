package typings.itBatch

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[T]): AsyncGenerator[js.Array[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.Array[T], Unit, Unit]]
  inline def default[T](source: js.Iterable[T], size: Double): AsyncGenerator[js.Array[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.Array[T], Unit, Unit]]
  inline def default[T](source: AsyncIterable[T]): AsyncGenerator[js.Array[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[js.Array[T], Unit, Unit]]
  inline def default[T](source: AsyncIterable[T], size: Double): AsyncGenerator[js.Array[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[js.Array[T], Unit, Unit]]
  
  inline def default_T_Generator[T](source: js.Iterable[T]): Generator[js.Array[T], Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[Generator[js.Array[T], Unit, Unit]]
  inline def default_T_Generator[T](source: js.Iterable[T], size: Double): Generator[js.Array[T], Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Generator[js.Array[T], Unit, Unit]]
}
