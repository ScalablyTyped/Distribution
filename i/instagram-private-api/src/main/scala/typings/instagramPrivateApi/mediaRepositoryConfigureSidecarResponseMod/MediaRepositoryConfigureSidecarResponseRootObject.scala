package typings.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryConfigureSidecarResponseRootObject extends js.Object {
  
  var client_sidecar_id: String = js.native
  
  var media: MediaRepositoryConfigureSidecarResponseMedia = js.native
  
  var status: String = js.native
}
object MediaRepositoryConfigureSidecarResponseRootObject {
  
  @scala.inline
  def apply(client_sidecar_id: String, media: MediaRepositoryConfigureSidecarResponseMedia, status: String): MediaRepositoryConfigureSidecarResponseRootObject = {
    val __obj = js.Dynamic.literal(client_sidecar_id = client_sidecar_id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseRootObjectOps[Self <: MediaRepositoryConfigureSidecarResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setClient_sidecar_id(value: String): Self = this.set("client_sidecar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: MediaRepositoryConfigureSidecarResponseMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
