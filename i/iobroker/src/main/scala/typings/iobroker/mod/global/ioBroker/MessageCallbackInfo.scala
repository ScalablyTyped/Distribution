package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Callback information for a passed message */
@js.native
trait MessageCallbackInfo extends js.Object {
  // ???
  var ack: Boolean = js.native
  /** ID of this callback */
  var id: Double = js.native
  /** The original message payload */
  var message: MessagePayload = js.native
  /** Timestamp of this message */
  var time: Double = js.native
}

object MessageCallbackInfo {
  @scala.inline
  def apply(ack: Boolean, id: Double, message: MessagePayload, time: Double): MessageCallbackInfo = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCallbackInfo]
  }
  @scala.inline
  implicit class MessageCallbackInfoOps[Self <: MessageCallbackInfo] (val x: Self) extends AnyVal {
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
    def setAck(value: Boolean): Self = this.set("ack", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessagePayload): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

