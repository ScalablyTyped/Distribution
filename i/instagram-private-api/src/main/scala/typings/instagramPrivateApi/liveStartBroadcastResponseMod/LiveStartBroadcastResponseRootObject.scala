package typings.instagramPrivateApi.liveStartBroadcastResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStartBroadcastResponseRootObject extends js.Object {
  
  var media_id: String = js.native
  
  var status: String = js.native
}
object LiveStartBroadcastResponseRootObject {
  
  @scala.inline
  def apply(media_id: String, status: String): LiveStartBroadcastResponseRootObject = {
    val __obj = js.Dynamic.literal(media_id = media_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStartBroadcastResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveStartBroadcastResponseRootObjectOps[Self <: LiveStartBroadcastResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
