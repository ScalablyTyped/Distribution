package typings.itParallel

import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-parallel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Iterable[js.Function0[js.Promise[T]]]): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: js.Iterable[js.Function0[js.Promise[T]]], options: ParallelOptions): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[js.Function0[js.Promise[T]]]): AsyncGenerator[T, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  inline def default[T](source: AsyncIterable[js.Function0[js.Promise[T]]], options: ParallelOptions): AsyncGenerator[T, Unit, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncGenerator[T, Unit, Unit]]
  
  trait ParallelOptions extends StObject {
    
    /**
      * How many jobs to execute in parallel (default: )
      */
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var ordered: js.UndefOr[Boolean] = js.undefined
  }
  object ParallelOptions {
    
    inline def apply(): ParallelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParallelOptions]
    }
    
    extension [Self <: ParallelOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
    }
  }
}
