package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaUpdatedMediaResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var updated_media: MediaUpdatedMediaResponseUpdatedMedia = js.native
}
object MediaUpdatedMediaResponseRootObject {
  
  @scala.inline
  def apply(status: String, updated_media: MediaUpdatedMediaResponseUpdatedMedia): MediaUpdatedMediaResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseRootObject]
  }
  
  @scala.inline
  implicit class MediaUpdatedMediaResponseRootObjectOps[Self <: MediaUpdatedMediaResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setUpdated_media(value: MediaUpdatedMediaResponseUpdatedMedia): Self = this.set("updated_media", value.asInstanceOf[js.Any])
  }
}
