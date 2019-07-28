package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  var channel: String
  var device: String
  var state: String
}

object Anon_Channel {
  @scala.inline
  def apply(channel: String, device: String, state: String): Anon_Channel = {
    val __obj = js.Dynamic.literal(channel = channel, device = device, state = state)
  
    __obj.asInstanceOf[Anon_Channel]
  }
}

