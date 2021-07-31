package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1VideoPayload extends StObject {
  
  /** FPS of the video. */
  var frameRate: js.UndefOr[Double] = js.undefined
  
  /** Video format. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Signed uri of the video file in the service bucket. */
  var signedUri: js.UndefOr[String] = js.undefined
  
  /** The list of video thumbnails. */
  var videoThumbnails: js.UndefOr[js.Array[GoogleCloudDatalabelingV1beta1VideoThumbnail]] = js.undefined
  
  /** Video uri from the user bucket. */
  var videoUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1VideoPayload {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoPayload]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoPayloadMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1VideoPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setSignedUri(value: String): Self = StObject.set(x, "signedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUriUndefined: Self = StObject.set(x, "signedUri", js.undefined)
    
    @scala.inline
    def setVideoThumbnails(value: js.Array[GoogleCloudDatalabelingV1beta1VideoThumbnail]): Self = StObject.set(x, "videoThumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoThumbnailsUndefined: Self = StObject.set(x, "videoThumbnails", js.undefined)
    
    @scala.inline
    def setVideoThumbnailsVarargs(value: GoogleCloudDatalabelingV1beta1VideoThumbnail*): Self = StObject.set(x, "videoThumbnails", js.Array(value :_*))
    
    @scala.inline
    def setVideoUri(value: String): Self = StObject.set(x, "videoUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUriUndefined: Self = StObject.set(x, "videoUri", js.undefined)
  }
}
