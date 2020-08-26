package typings.luminoMessaging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageHandler extends js.Object {
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  def processMessage(msg: Message): Unit = js.native
}

object IMessageHandler {
  @scala.inline
  def apply(processMessage: Message => Unit): IMessageHandler = {
    val __obj = js.Dynamic.literal(processMessage = js.Any.fromFunction1(processMessage))
    __obj.asInstanceOf[IMessageHandler]
  }
  @scala.inline
  implicit class IMessageHandlerOps[Self <: IMessageHandler] (val x: Self) extends AnyVal {
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
    def setProcessMessage(value: Message => Unit): Self = this.set("processMessage", js.Any.fromFunction1(value))
  }
  
}

