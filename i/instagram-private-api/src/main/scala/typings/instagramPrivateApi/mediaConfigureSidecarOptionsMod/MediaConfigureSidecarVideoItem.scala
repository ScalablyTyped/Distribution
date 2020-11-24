package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureSidecarVideoItem extends MediaConfigureSidecarItem {
  
  var audio_muted: js.UndefOr[String] = js.native
  
  var clips: js.UndefOr[js.Array[Length] | String] = js.native
  
  var date_time_original: js.UndefOr[String] = js.native
  
  var filter_type: js.UndefOr[String] = js.native
  
  var length: String = js.native
  
  var poster_frame_index: js.UndefOr[String] = js.native
  
  var video_result: js.UndefOr[String] = js.native
}
object MediaConfigureSidecarVideoItem {
  
  @scala.inline
  def apply(height: Double, length: String, upload_id: String, width: Double): MediaConfigureSidecarVideoItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarVideoItem]
  }
  
  @scala.inline
  implicit class MediaConfigureSidecarVideoItemOps[Self <: MediaConfigureSidecarVideoItem] (val x: Self) extends AnyVal {
    
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
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_muted(value: String): Self = this.set("audio_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio_muted: Self = this.set("audio_muted", js.undefined)
    
    @scala.inline
    def setClipsVarargs(value: Length*): Self = this.set("clips", js.Array(value :_*))
    
    @scala.inline
    def setClips(value: js.Array[Length] | String): Self = this.set("clips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClips: Self = this.set("clips", js.undefined)
    
    @scala.inline
    def setDate_time_original(value: String): Self = this.set("date_time_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_time_original: Self = this.set("date_time_original", js.undefined)
    
    @scala.inline
    def setFilter_type(value: String): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter_type: Self = this.set("filter_type", js.undefined)
    
    @scala.inline
    def setPoster_frame_index(value: String): Self = this.set("poster_frame_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster_frame_index: Self = this.set("poster_frame_index", js.undefined)
    
    @scala.inline
    def setVideo_result(value: String): Self = this.set("video_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_result: Self = this.set("video_result", js.undefined)
  }
}
