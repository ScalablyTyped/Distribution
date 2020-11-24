package typings.instagramPrivateApi.liveCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveCommentsResponseSystemCommentsItem extends js.Object {
  
  var created_at: Double = js.native
  
  var pk: String = js.native
  
  var text: String = js.native
  
  var user: LiveCommentsResponseUser = js.native
  
  var user_count: Double = js.native
}
object LiveCommentsResponseSystemCommentsItem {
  
  @scala.inline
  def apply(created_at: Double, pk: String, text: String, user: LiveCommentsResponseUser, user_count: Double): LiveCommentsResponseSystemCommentsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCommentsResponseSystemCommentsItem]
  }
  
  @scala.inline
  implicit class LiveCommentsResponseSystemCommentsItemOps[Self <: LiveCommentsResponseSystemCommentsItem] (val x: Self) extends AnyVal {
    
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
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: LiveCommentsResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_count(value: Double): Self = this.set("user_count", value.asInstanceOf[js.Any])
  }
}
