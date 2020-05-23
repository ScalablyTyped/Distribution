package typings.ionic.definitionsMod

import typings.ionic.anon.Args
import typings.ionic.ionicStrings.`update-check`
import typings.ionic.ionicStrings.telemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.TelemetryIPCMessage
  - typings.ionic.definitionsMod.UpdateCheckIPCMessage
*/
trait IPCMessage extends js.Object

object IPCMessage {
  @scala.inline
  def TelemetryIPCMessage(data: Args, `type`: telemetry): IPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCMessage]
  }
  @scala.inline
  def UpdateCheckIPCMessage(`type`: `update-check`): IPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPCMessage]
  }
}

