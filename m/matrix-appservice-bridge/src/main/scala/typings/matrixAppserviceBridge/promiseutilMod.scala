package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseutilMod {
  
  @JSImport("matrix-appservice-bridge/lib/utils/promiseutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defer[T](): Defer_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")().asInstanceOf[Defer_[T]]
  
  @scala.inline
  def delay(delayMs: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delayMs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @js.native
  trait Defer_[T] extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(err: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
  }
}
