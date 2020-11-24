package typings.instagramPrivateApi.mediaRepositoryConfigureVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryConfigureVideoResponseRootObject extends js.Object {
  
  var media: MediaRepositoryConfigureVideoResponseMedia = js.native
  
  var status: String = js.native
  
  var upload_id: String = js.native
}
object MediaRepositoryConfigureVideoResponseRootObject {
  
  @scala.inline
  def apply(media: MediaRepositoryConfigureVideoResponseMedia, status: String, upload_id: String): MediaRepositoryConfigureVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaRepositoryConfigureVideoResponseRootObjectOps[Self <: MediaRepositoryConfigureVideoResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setMedia(value: MediaRepositoryConfigureVideoResponseMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
  }
}
