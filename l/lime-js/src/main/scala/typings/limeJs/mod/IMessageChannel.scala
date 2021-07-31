package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageChannel extends StObject {
  
  def onMessage(message: Message): js.Any
  
  def sendMessage(message: Message): Unit
}
object IMessageChannel {
  
  @scala.inline
  def apply(onMessage: Message => js.Any, sendMessage: Message => Unit): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[IMessageChannel]
  }
  
  @scala.inline
  implicit class IMessageChannelMutableBuilder[Self <: IMessageChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMessage(value: Message => js.Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessage(value: Message => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
