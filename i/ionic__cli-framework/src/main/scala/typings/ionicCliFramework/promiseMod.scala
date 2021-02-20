package typings.ionicCliFramework

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  object PromiseUtil {
    
    @JSImport("@ionic/cli-framework/utils/promise", "PromiseUtil.any")
    @js.native
    def any(promises: js.Array[js.Promise[_]]): js.Promise[_] = js.native
    
    @JSImport("@ionic/cli-framework/utils/promise", "PromiseUtil.some")
    @js.native
    def some(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[_]] = js.native
    @JSImport("@ionic/cli-framework/utils/promise", "PromiseUtil.some")
    @js.native
    def some(promises: js.Array[js.Promise[_]], expected: Double): js.Promise[js.Array[_]] = js.native
  }
  
  @JSImport("@ionic/cli-framework/utils/promise", "promisify")
  @js.native
  val promisify: Promisify_ = js.native
  
  @JSImport("@ionic/cli-framework/utils/promise", "promisifyEvent")
  @js.native
  def promisifyEvent(emitter: EventEmitter, event: String): js.Promise[_] = js.native
  @JSImport("@ionic/cli-framework/utils/promise", "promisifyEvent")
  @js.native
  def promisifyEvent(emitter: EventEmitter, event: js.Symbol): js.Promise[_] = js.native
  
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
