package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`update-check`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCheckIPCMessage
  extends StObject
     with IPCMessage {
  
  var `type`: `update-check`
}
object UpdateCheckIPCMessage {
  
  inline def apply(): UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("update-check")
    __obj.asInstanceOf[UpdateCheckIPCMessage]
  }
  
  extension [Self <: UpdateCheckIPCMessage](x: Self) {
    
    inline def setType(value: `update-check`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
