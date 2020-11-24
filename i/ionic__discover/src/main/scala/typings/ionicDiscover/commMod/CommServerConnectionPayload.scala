package typings.ionicDiscover.commMod

import typings.ionicDiscover.ionicDiscoverStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommServerConnectionPayload extends js.Object {
  
  var device: String = js.native
  
  var event: connect = js.native
}
object CommServerConnectionPayload {
  
  @scala.inline
  def apply(device: String, event: connect): CommServerConnectionPayload = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommServerConnectionPayload]
  }
  
  @scala.inline
  implicit class CommServerConnectionPayloadOps[Self <: CommServerConnectionPayload] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: connect): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
