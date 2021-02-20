package typings.ionic.definitionsMod

import typings.ionic.anon.Args
import typings.ionic.ionicStrings.telemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelemetryIPCMessage extends IPCMessage {
  
  var data: Args = js.native
  
  var `type`: telemetry = js.native
}
object TelemetryIPCMessage {
  
  @scala.inline
  def apply(data: Args, `type`: telemetry): TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryIPCMessage]
  }
  
  @scala.inline
  implicit class TelemetryIPCMessageMutableBuilder[Self <: TelemetryIPCMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Args): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: telemetry): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
