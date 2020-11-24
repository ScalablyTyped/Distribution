package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImagePayload extends js.Object {
  
  /** A byte string of a thumbnail image. */
  var imageThumbnail: js.UndefOr[String] = js.native
  
  /** Image uri from the user bucket. */
  var imageUri: js.UndefOr[String] = js.native
  
  /** Image format. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Signed uri of the image file in the service bucket. */
  var signedUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ImagePayload {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImagePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImagePayload]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImagePayloadOps[Self <: GoogleCloudDatalabelingV1beta1ImagePayload] (val x: Self) extends AnyVal {
    
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
    def setImageThumbnail(value: String): Self = this.set("imageThumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageThumbnail: Self = this.set("imageThumbnail", js.undefined)
    
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setSignedUri(value: String): Self = this.set("signedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUri: Self = this.set("signedUri", js.undefined)
  }
}
