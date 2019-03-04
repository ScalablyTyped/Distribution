package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPCMessage extends js.Object {
  var data: ionicLib.Anon_Args
  var `type`: ionicLib.ionicLibStrings.telemetry
}

object IPCMessage {
  @scala.inline
  def apply(data: ionicLib.Anon_Args, `type`: ionicLib.ionicLibStrings.telemetry): IPCMessage = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPCMessage]
  }
}

