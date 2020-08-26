package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A message being passed between adapter instances */
@js.native
trait Message extends js.Object {
  /** ID of this message */
  var _id: Double = js.native
  /** Callback information. This is set when the source expects a response */
  var callback: MessageCallbackInfo = js.native
  /** The command to be executed */
  var command: String = js.native
  /** The source of this message */
  var from: String = js.native
  /** The message payload */
  var message: MessagePayload = js.native
}

object Message {
  @scala.inline
  def apply(_id: Double, callback: MessageCallbackInfo, command: String, from: String, message: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def set_id(value: Double): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: MessageCallbackInfo): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessagePayload): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

