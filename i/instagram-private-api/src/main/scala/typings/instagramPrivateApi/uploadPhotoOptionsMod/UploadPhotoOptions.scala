package typings.instagramPrivateApi.uploadPhotoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadPhotoOptions extends js.Object {
  
  var file: Buffer = js.native
  
  var isSidecar: js.UndefOr[Boolean] = js.native
  
  var uploadId: js.UndefOr[String] = js.native
  
  var waterfallId: js.UndefOr[String] = js.native
}
object UploadPhotoOptions {
  
  @scala.inline
  def apply(file: Buffer): UploadPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPhotoOptions]
  }
  
  @scala.inline
  implicit class UploadPhotoOptionsOps[Self <: UploadPhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: Buffer): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSidecar(value: Boolean): Self = this.set("isSidecar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSidecar: Self = this.set("isSidecar", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
    
    @scala.inline
    def setWaterfallId(value: String): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfallId: Self = this.set("waterfallId", js.undefined)
  }
}
