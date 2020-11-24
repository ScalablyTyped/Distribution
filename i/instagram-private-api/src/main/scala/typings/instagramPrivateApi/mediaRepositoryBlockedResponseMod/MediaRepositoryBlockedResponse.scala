package typings.instagramPrivateApi.mediaRepositoryBlockedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryBlockedResponse extends js.Object {
  
  var media_ids: js.Array[String] = js.native
  
  var status: String = js.native
}
object MediaRepositoryBlockedResponse {
  
  @scala.inline
  def apply(media_ids: js.Array[String], status: String): MediaRepositoryBlockedResponse = {
    val __obj = js.Dynamic.literal(media_ids = media_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryBlockedResponse]
  }
  
  @scala.inline
  implicit class MediaRepositoryBlockedResponseOps[Self <: MediaRepositoryBlockedResponse] (val x: Self) extends AnyVal {
    
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
    def setMedia_idsVarargs(value: String*): Self = this.set("media_ids", js.Array(value :_*))
    
    @scala.inline
    def setMedia_ids(value: js.Array[String]): Self = this.set("media_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
