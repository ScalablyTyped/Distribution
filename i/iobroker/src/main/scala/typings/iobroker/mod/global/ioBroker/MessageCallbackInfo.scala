package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Callback information for a passed message */
trait MessageCallbackInfo extends js.Object {
  // ???
  var ack: Boolean
  /** ID of this callback */
  var id: Double
  /** The original message payload */
  var message: MessagePayload
  /** Timestamp of this message */
  var time: Double
}

object MessageCallbackInfo {
  @scala.inline
  def apply(ack: Boolean, id: Double, message: MessagePayload, time: Double): MessageCallbackInfo = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCallbackInfo]
  }
}

