package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCheckIPCMessage extends IPCMessage {
  var `type`: ionicLib.ionicLibStrings.`update-check`
}

object UpdateCheckIPCMessage {
  @scala.inline
  def apply(`type`: ionicLib.ionicLibStrings.`update-check`): UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateCheckIPCMessage]
  }
}

