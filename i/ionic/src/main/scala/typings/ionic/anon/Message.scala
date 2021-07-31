package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var message: String
  
  def treat(): js.Promise[Unit]
}
object Message {
  
  @scala.inline
  def apply(message: String, treat: () => js.Promise[Unit]): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = js.Any.fromFunction0(treat))
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreat(value: () => js.Promise[Unit]): Self = StObject.set(x, "treat", js.Any.fromFunction0(value))
  }
}
