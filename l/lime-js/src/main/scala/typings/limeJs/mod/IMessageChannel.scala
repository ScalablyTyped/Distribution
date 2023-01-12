package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageChannel extends StObject {
  
  def onMessage(message: Message): Any
  
  def sendMessage(message: Message): Unit
}
object IMessageChannel {
  
  inline def apply(onMessage: Message => Any, sendMessage: Message => Unit): IMessageChannel = {
    val __obj = js.Dynamic.literal(onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[IMessageChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMessageChannel] (val x: Self) extends AnyVal {
    
    inline def setOnMessage(value: Message => Any): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
    
    inline def setSendMessage(value: Message => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
