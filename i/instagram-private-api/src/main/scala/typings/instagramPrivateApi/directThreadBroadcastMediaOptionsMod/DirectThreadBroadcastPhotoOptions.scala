package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadBroadcastPhotoOptions extends js.Object {
  
  var allowFullAspectRatio: js.UndefOr[Boolean] = js.native
  
  var file: Buffer = js.native
  
  var uploadId: js.UndefOr[String] = js.native
}
object DirectThreadBroadcastPhotoOptions {
  
  @scala.inline
  def apply(file: Buffer): DirectThreadBroadcastPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastPhotoOptions]
  }
  
  @scala.inline
  implicit class DirectThreadBroadcastPhotoOptionsOps[Self <: DirectThreadBroadcastPhotoOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowFullAspectRatio(value: Boolean): Self = this.set("allowFullAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFullAspectRatio: Self = this.set("allowFullAspectRatio", js.undefined)
    
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadId: Self = this.set("uploadId", js.undefined)
  }
}
