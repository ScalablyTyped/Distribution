package typings.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  
  def onConnect(controller: Controller): Unit = js.native
  
  def onDisconnect(controller: Controller): Unit = js.native
  
  def onExit(controller: Controller): Unit = js.native
  
  def onFrame(controller: Controller, frame: Frame): Unit = js.native
  
  def onInit(controller: Controller): Unit = js.native
}
object Listener {
  
  @scala.inline
  def apply(
    onConnect: Controller => Unit,
    onDisconnect: Controller => Unit,
    onExit: Controller => Unit,
    onFrame: (Controller, Frame) => Unit,
    onInit: Controller => Unit
  ): Listener = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
    __obj.asInstanceOf[Listener]
  }
  
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    
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
    def setOnConnect(value: Controller => Unit): Self = this.set("onConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDisconnect(value: Controller => Unit): Self = this.set("onDisconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExit(value: Controller => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFrame(value: (Controller, Frame) => Unit): Self = this.set("onFrame", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnInit(value: Controller => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
  }
}
