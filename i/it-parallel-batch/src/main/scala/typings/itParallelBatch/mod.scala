package typings.itParallelBatch

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-parallel-batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[js.Function0[js.Promise[T]]]): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: js.Iterable[js.Function0[js.Promise[T]]], size: Double): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[js.Function0[js.Promise[T]]], size: Double): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
}
