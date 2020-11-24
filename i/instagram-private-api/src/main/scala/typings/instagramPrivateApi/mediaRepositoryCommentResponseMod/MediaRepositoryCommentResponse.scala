package typings.instagramPrivateApi.mediaRepositoryCommentResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryCommentResponse extends js.Object {
  
  var comment: MediaRepositoryCommentResponseComment = js.native
  
  var status: String = js.native
}
object MediaRepositoryCommentResponse {
  
  @scala.inline
  def apply(comment: MediaRepositoryCommentResponseComment, status: String): MediaRepositoryCommentResponse = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryCommentResponse]
  }
  
  @scala.inline
  implicit class MediaRepositoryCommentResponseOps[Self <: MediaRepositoryCommentResponse] (val x: Self) extends AnyVal {
    
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
    def setComment(value: MediaRepositoryCommentResponseComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
