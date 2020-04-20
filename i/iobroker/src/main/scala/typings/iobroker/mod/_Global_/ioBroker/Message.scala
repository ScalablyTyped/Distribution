package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A message being passed between adapter instances */
trait Message extends js.Object {
  /** ID of this message */
  var _id: Double
  /** Callback information. This is set when the source expects a response */
  var callback: MessageCallbackInfo
  /** The command to be executed */
  var command: String
  /** The source of this message */
  var from: String
  /** The message payload */
  var message: MessagePayload
}

object Message {
  @scala.inline
  def apply(_id: Double, callback: MessageCallbackInfo, command: String, from: String, message: MessagePayload): Message = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

