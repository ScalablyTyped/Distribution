package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1VideoPayload extends js.Object {
  
  /** FPS of the video. */
  var frameRate: js.UndefOr[Double] = js.native
  
  /** Video format. */
  var mimeType: js.UndefOr[String] = js.native
  
  /** Signed uri of the video file in the service bucket. */
  var signedUri: js.UndefOr[String] = js.native
  
  /** The list of video thumbnails. */
  var videoThumbnails: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1VideoThumbnail]] = js.native
  
  /** Video uri from the user bucket. */
  var videoUri: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1VideoPayload {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoPayload]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoPayloadOps[Self <: GoogleCloudDatalabelingV1beta1VideoPayload] (val x: Self) extends AnyVal {
    
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
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setSignedUri(value: String): Self = this.set("signedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUri: Self = this.set("signedUri", js.undefined)
    
    @scala.inline
    def setVideoThumbnailsVarargs(value: GoogleCloudDatalabelingV1beta1VideoThumbnail*): Self = this.set("videoThumbnails", js.Array(value :_*))
    
    @scala.inline
    def setVideoThumbnails(value: js.Array[GoogleCloudDatalabelingV1beta1VideoThumbnail]): Self = this.set("videoThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoThumbnails: Self = this.set("videoThumbnails", js.undefined)
    
    @scala.inline
    def setVideoUri(value: String): Self = this.set("videoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoUri: Self = this.set("videoUri", js.undefined)
  }
}
