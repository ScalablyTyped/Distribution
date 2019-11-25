package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`update-check`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCheckIPCMessage extends IPCMessage {
  var `type`: `update-check`
}

object UpdateCheckIPCMessage {
  @scala.inline
  def apply(`type`: `update-check`): UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckIPCMessage]
  }
}

