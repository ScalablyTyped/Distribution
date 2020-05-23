package typings.ionic.definitionsMod

import typings.ionic.anon.Args
import typings.ionic.ionicStrings.telemetry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TelemetryIPCMessage extends IPCMessage {
  var data: Args
  var `type`: telemetry
}

object TelemetryIPCMessage {
  @scala.inline
  def apply(data: Args, `type`: telemetry): TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryIPCMessage]
  }
}

