package typings.luminoMessaging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def messageHook(handler: IMessageHandler, msg: Message): Boolean
}

object IMessageHook {
  @scala.inline
  def apply(messageHook: (IMessageHandler, Message) => Boolean): IMessageHook = {
    val __obj = js.Dynamic.literal(messageHook = js.Any.fromFunction2(messageHook))
  
    __obj.asInstanceOf[IMessageHook]
  }
}

