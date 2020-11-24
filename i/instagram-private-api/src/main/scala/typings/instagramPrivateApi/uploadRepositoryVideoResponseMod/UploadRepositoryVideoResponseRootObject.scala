package typings.instagramPrivateApi.uploadRepositoryVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadRepositoryVideoResponseRootObject extends js.Object {
  
  var status: String = js.native
  
  var xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces = js.native
}
object UploadRepositoryVideoResponseRootObject {
  
  @scala.inline
  def apply(status: String, xsharing_nonces: UploadRepositoryVideoResponseXsharingNonces): UploadRepositoryVideoResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], xsharing_nonces = xsharing_nonces.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRepositoryVideoResponseRootObject]
  }
  
  @scala.inline
  implicit class UploadRepositoryVideoResponseRootObjectOps[Self <: UploadRepositoryVideoResponseRootObject] (val x: Self) extends AnyVal {
    
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
    def setXsharing_nonces(value: UploadRepositoryVideoResponseXsharingNonces): Self = this.set("xsharing_nonces", value.asInstanceOf[js.Any])
  }
}
