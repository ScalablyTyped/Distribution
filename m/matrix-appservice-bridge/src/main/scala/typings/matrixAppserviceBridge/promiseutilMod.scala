package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseutilMod {
  
  @JSImport("matrix-appservice-bridge/lib/utils/promiseutil", "defer")
  @js.native
  def defer[T](): Defer_[T] = js.native
  
  @JSImport("matrix-appservice-bridge/lib/utils/promiseutil", "delay")
  @js.native
  def delay(delayMs: Double): js.Promise[_] = js.native
  
  @js.native
  trait Defer_[T] extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(): Unit = js.native
    def reject(err: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
  }
}
