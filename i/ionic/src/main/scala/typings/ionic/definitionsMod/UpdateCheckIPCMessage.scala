package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.`update-check`
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
  implicit class UpdateCheckIPCMessageOps[Self <: UpdateCheckIPCMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: `update-check`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
