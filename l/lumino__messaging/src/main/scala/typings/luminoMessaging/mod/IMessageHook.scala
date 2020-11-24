package typings.luminoMessaging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageHook extends js.Object {
  
  /**
    * Intercept a message sent to a message handler.
    *
    * @param handler - The target handler of the message.
    *
    * @param msg - The message to be sent to the handler.
    *
    * @returns `true` if the message should continue to be processed
    *   as normal, or `false` if processing should cease immediately.
    */
  def messageHook(handler: IMessageHandler, msg: Message): Boolean = js.native
}
object IMessageHook {
  
  @scala.inline
  def apply(messageHook: (IMessageHandler, Message) => Boolean): IMessageHook = {
    val __obj = js.Dynamic.literal(messageHook = js.Any.fromFunction2(messageHook))
    __obj.asInstanceOf[IMessageHook]
  }
  
  @scala.inline
  implicit class IMessageHookOps[Self <: IMessageHook] (val x: Self) extends AnyVal {
    
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
    def setMessageHook(value: (IMessageHandler, Message) => Boolean): Self = this.set("messageHook", js.Any.fromFunction2(value))
  }
}
