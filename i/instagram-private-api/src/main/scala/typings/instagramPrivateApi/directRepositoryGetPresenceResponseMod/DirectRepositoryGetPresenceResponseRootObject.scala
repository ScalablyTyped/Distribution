package typings.instagramPrivateApi.directRepositoryGetPresenceResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectRepositoryGetPresenceResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var user_presence: js.Any = js.native
}
object DirectRepositoryGetPresenceResponseRootObject {
  
  @scala.inline
  def apply(status: String, user_presence: js.Any): DirectRepositoryGetPresenceResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_presence = user_presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryGetPresenceResponseRootObject]
  }
  
  @scala.inline
  implicit class DirectRepositoryGetPresenceResponseRootObjectOps[Self <: DirectRepositoryGetPresenceResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_presence(value: js.Any): Self = this.set("user_presence", value.asInstanceOf[js.Any])
  }
}
