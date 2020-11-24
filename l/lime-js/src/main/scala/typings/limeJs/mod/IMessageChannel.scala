package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageChannel extends js.Object {
  
  def onMessage(message: Message): js.Any = js.native
  
  def sendMessage(message: Message): Unit = js.native
}
object IMessageChannel {
  
  @scala.inline
  def apply(onMessage: Message => js.Any, sendMessage: Message => Unit): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[IMessageChannel]
  }
  
  @scala.inline
  implicit class IMessageChannelOps[Self <: IMessageChannel] (val x: Self) extends AnyVal {
    
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
    def setOnMessage(value: Message => js.Any): Self = this.set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: Message => Unit): Self = this.set("sendMessage", js.Any.fromFunction1(value))
  }
}
