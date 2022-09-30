package typings.matrixAppserviceBridge

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseutilMod {
  
  @JSImport("matrix-appservice-bridge/lib/utils/promiseutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defer[T](): Defer_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Defer_[T]]
  
  inline def delay(delayMs: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  @js.native
  trait Defer_[T] extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(err: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    def resolve(value: PromiseLike[T]): Unit = js.native
  }
}
