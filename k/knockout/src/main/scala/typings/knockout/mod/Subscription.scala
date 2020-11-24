package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  def dispose(): Unit = js.native
  
  def disposeWhenNodeIsRemoved(node: Node): Unit = js.native
}
object Subscription {
  
  @scala.inline
  def apply(dispose: () => Unit, disposeWhenNodeIsRemoved: Node => Unit): Subscription = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeWhenNodeIsRemoved = js.Any.fromFunction1(disposeWhenNodeIsRemoved))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeWhenNodeIsRemoved(value: Node => Unit): Self = this.set("disposeWhenNodeIsRemoved", js.Any.fromFunction1(value))
  }
}
