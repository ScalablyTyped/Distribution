package typings.ionic.definitionsMod

import typings.ionic.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.TelemetryIPCMessage
  - typings.ionic.definitionsMod.UpdateCheckIPCMessage
*/
trait IPCMessage extends StObject
object IPCMessage {
  
  @scala.inline
  def TelemetryIPCMessage(data: Args): typings.ionic.definitionsMod.TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("telemetry")
    __obj.asInstanceOf[typings.ionic.definitionsMod.TelemetryIPCMessage]
  }
  
  @scala.inline
  def UpdateCheckIPCMessage(): typings.ionic.definitionsMod.UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("update-check")
    __obj.asInstanceOf[typings.ionic.definitionsMod.UpdateCheckIPCMessage]
  }
}
