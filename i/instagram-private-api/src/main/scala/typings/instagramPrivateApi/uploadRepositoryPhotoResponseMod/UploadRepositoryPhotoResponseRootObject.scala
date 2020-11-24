package typings.instagramPrivateApi.uploadRepositoryPhotoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadRepositoryPhotoResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var upload_id: String = js.native
  
  var xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces = js.native
}
object UploadRepositoryPhotoResponseRootObject {
  
  @scala.inline
  def apply(status: String, upload_id: String, xsharing_nonces: UploadRepositoryPhotoResponseXsharingNonces): UploadRepositoryPhotoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRepositoryPhotoResponseRootObject]
  }
  
  @scala.inline
  implicit class UploadRepositoryPhotoResponseRootObjectOps[Self <: UploadRepositoryPhotoResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsharing_nonces(value: UploadRepositoryPhotoResponseXsharingNonces): Self = this.set("xsharing_nonces", value.asInstanceOf[js.Any])
  }
}
