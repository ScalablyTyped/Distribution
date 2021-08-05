package typings.ionicCliFramework

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("@ionic/cli-framework/utils/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PromiseUtil {
    
    @JSImport("@ionic/cli-framework/utils/promise", "PromiseUtil")
    @js.native
    val ^ : js.Any = js.native
    
    inline def any(promises: js.Array[js.Promise[js.Any]]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    
    inline def some(promises: js.Array[js.Promise[js.Any]]): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
    inline def some(promises: js.Array[js.Promise[js.Any]], expected: Double): js.Promise[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(promises.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Any]]]
  }
  
  @JSImport("@ionic/cli-framework/utils/promise", "promisify")
  @js.native
  val promisify: Promisify_ = js.native
  
  inline def promisifyEvent(emitter: EventEmitter, event: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  inline def promisifyEvent(emitter: EventEmitter, event: js.Symbol): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("promisifyEvent")(emitter.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @js.native
  trait Promisify_ extends StObject {
    
    def apply[T](
      func: js.Function1[
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function0[js.Promise[T]] = js.native
    def apply[T, A1](
      func: js.Function2[
          /* arg1 */ A1, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function1[/* arg1 */ A1, js.Promise[T]] = js.native
    def apply[T, A1, A2](
      func: js.Function3[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3](
      func: js.Function4[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3, A4](
      func: js.Function5[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, js.Promise[T]] = js.native
    def apply[T, A1, A2, A3, A4, A5](
      func: js.Function6[
          /* arg1 */ A1, 
          /* arg2 */ A2, 
          /* arg3 */ A3, 
          /* arg4 */ A4, 
          /* arg5 */ A5, 
          /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
          Unit
        ]
    ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, js.Promise[T]] = js.native
  }
}
