package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`update-check`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCheckIPCMessage extends IPCMessage {
  
  var `type`: `update-check` = js.native
}
object UpdateCheckIPCMessage {
  
  @scala.inline
  def apply(`type`: `update-check`): UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCheckIPCMessage]
  }
  
  @scala.inline
  implicit class UpdateCheckIPCMessageMutableBuilder[Self <: UpdateCheckIPCMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `update-check`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
