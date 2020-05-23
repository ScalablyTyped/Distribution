package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var channel: String
  var device: String
  var state: String
}

object Channel {
  @scala.inline
  def apply(channel: String, device: String, state: String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

