package typings.atHapiNes.atHapiNesMod.atHapiHapiMod

import typings.atHapiNes.atHapiNesMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var socket: Socket
}

object Request {
  @scala.inline
  def apply(socket: Socket): Request = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[Request]
  }
}

