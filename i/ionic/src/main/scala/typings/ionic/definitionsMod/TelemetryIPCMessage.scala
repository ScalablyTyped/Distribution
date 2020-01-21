package typings.ionic.definitionsMod

import typings.ionic.AnonArgs
import typings.ionic.ionicStrings.telemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryIPCMessage extends IPCMessage {
  var data: AnonArgs
  var `type`: telemetry
}

object TelemetryIPCMessage {
  @scala.inline
  def apply(data: AnonArgs, `type`: telemetry): TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryIPCMessage]
  }
}

