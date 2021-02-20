package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1VideoThumbnail extends StObject {
  
  /** A byte string of the video frame. */
  var thumbnail: js.UndefOr[String] = js.native
  
  /** Time offset relative to the beginning of the video, corresponding to the video frame where the thumbnail has been extracted from. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1VideoThumbnail {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1VideoThumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1VideoThumbnail]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1VideoThumbnailMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1VideoThumbnail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
