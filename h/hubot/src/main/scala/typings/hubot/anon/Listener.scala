package typings.hubot.anon

import typings.hubot.mod.Adapter
import typings.hubot.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener[A /* <: Adapter */] extends js.Object {
  
  var listener: Middleware[A] = js.native
  
  var receive: Middleware[A] = js.native
  
  var response: Middleware[A] = js.native
}
object Listener {
  
  @scala.inline
  def apply[A /* <: Adapter */](listener: Middleware[A], receive: Middleware[A], response: Middleware[A]): Listener[A] = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener[A]]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener[_], A /* <: Adapter */] (val x: Self with Listener[A]) extends AnyVal {
    
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
    def setListener(value: Middleware[A]): Self = this.set("listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceive(value: Middleware[A]): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: Middleware[A]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
