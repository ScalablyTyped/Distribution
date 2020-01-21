package typings.hapiNes.mod.hapiHapiAugmentingMod

import typings.hapiNes.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var socket: Socket
}

object Request {
  @scala.inline
  def apply(socket: Socket): Request = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

