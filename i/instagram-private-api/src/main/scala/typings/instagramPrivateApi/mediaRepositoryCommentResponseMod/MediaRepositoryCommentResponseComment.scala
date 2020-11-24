package typings.instagramPrivateApi.mediaRepositoryCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryCommentResponseComment extends js.Object {
  
  var content_type: String = js.native
  
  var created_at: Double = js.native
  
  var created_at_utc: Double = js.native
  
  var media_id: String = js.native
  
  var pk: String = js.native
  
  var share_enabled: Boolean = js.native
  
  var status: String = js.native
  
  var text: String = js.native
  
  var `type`: Double = js.native
  
  var user: MediaRepositoryCommentResponseUser = js.native
}
object MediaRepositoryCommentResponseComment {
  
  @scala.inline
  def apply(
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    media_id: String,
    pk: String,
    share_enabled: Boolean,
    status: String,
    text: String,
    `type`: Double,
    user: MediaRepositoryCommentResponseUser
  ): MediaRepositoryCommentResponseComment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], share_enabled = share_enabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryCommentResponseComment]
  }
  
  @scala.inline
  implicit class MediaRepositoryCommentResponseCommentOps[Self <: MediaRepositoryCommentResponseComment] (val x: Self) extends AnyVal {
    
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
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_at_utc(value: Double): Self = this.set("created_at_utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_enabled(value: Boolean): Self = this.set("share_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: MediaRepositoryCommentResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
