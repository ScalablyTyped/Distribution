package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockedUser extends js.Object {
  
  var blocked_id: Double = js.native
  
  var blocked_url: String = js.native
}
object BlockedUser {
  
  @scala.inline
  def apply(blocked_id: Double, blocked_url: String): BlockedUser = {
    val __obj = js.Dynamic.literal(blocked_id = blocked_id.asInstanceOf[js.Any], blocked_url = blocked_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedUser]
  }
  
  @scala.inline
  implicit class BlockedUserOps[Self <: BlockedUser] (val x: Self) extends AnyVal {
    
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
    def setBlocked_id(value: Double): Self = this.set("blocked_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocked_url(value: String): Self = this.set("blocked_url", value.asInstanceOf[js.Any])
  }
}
