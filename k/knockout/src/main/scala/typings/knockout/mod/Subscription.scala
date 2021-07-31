package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  def dispose(): Unit
  
  def disposeWhenNodeIsRemoved(node: Node): Unit
}
object Subscription {
  
  @scala.inline
  def apply(dispose: () => Unit, disposeWhenNodeIsRemoved: Node => Unit): Subscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeWhenNodeIsRemoved = js.Any.fromFunction1(disposeWhenNodeIsRemoved))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeWhenNodeIsRemoved(value: Node => Unit): Self = StObject.set(x, "disposeWhenNodeIsRemoved", js.Any.fromFunction1(value))
  }
}
