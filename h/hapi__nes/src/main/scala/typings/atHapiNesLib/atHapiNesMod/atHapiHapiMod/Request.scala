package typings
package atHapiNesLib.atHapiNesMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var socket: atHapiNesLib.atHapiNesMod.Socket
}

object Request {
  @scala.inline
  def apply(socket: atHapiNesLib.atHapiNesMod.Socket): Request = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[Request]
  }
}

