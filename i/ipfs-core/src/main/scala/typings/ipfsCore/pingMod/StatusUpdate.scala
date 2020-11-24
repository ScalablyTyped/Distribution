package typings.ipfsCore.pingMod

import typings.ipfsCore.ipfsCoreBooleans.`true`
import typings.ipfsCore.ipfsCoreNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusUpdate extends Packet {
  
  var success: `true` = js.native
  
  var text: String = js.native
  
  var time: `0` = js.native
}
object StatusUpdate {
  
  @scala.inline
  def apply(success: `true`, text: String, time: `0`): StatusUpdate = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusUpdate]
  }
  
  @scala.inline
  implicit class StatusUpdateOps[Self <: StatusUpdate] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: `0`): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
