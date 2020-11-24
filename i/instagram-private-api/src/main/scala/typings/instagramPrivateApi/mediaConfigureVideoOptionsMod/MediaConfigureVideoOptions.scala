package typings.instagramPrivateApi.mediaConfigureVideoOptionsMod

import typings.instagramPrivateApi.anon.Length
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureVideoOptions extends js.Object {
  
  var audio_muted: js.UndefOr[Boolean] = js.native
  
  var clips: js.UndefOr[js.Array[Length]] = js.native
  
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.native
  
  var height: Double = js.native
  
  var length: Double = js.native
  
  var media_latitude: js.UndefOr[String] = js.native
  
  var media_longitude: js.UndefOr[String] = js.native
  
  var poster_frame_index: js.UndefOr[Double] = js.native
  
  var posting_latitude: js.UndefOr[String] = js.native
  
  var posting_longitude: js.UndefOr[String] = js.native
  
  var upload_id: String = js.native
  
  var width: Double = js.native
}
object MediaConfigureVideoOptions {
  
  @scala.inline
  def apply(height: Double, length: Double, upload_id: String, width: Double): MediaConfigureVideoOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureVideoOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureVideoOptionsOps[Self <: MediaConfigureVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_muted(value: Boolean): Self = this.set("audio_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio_muted: Self = this.set("audio_muted", js.undefined)
    
    @scala.inline
    def setClipsVarargs(value: Length*): Self = this.set("clips", js.Array(value :_*))
    
    @scala.inline
    def setClips(value: js.Array[Length]): Self = this.set("clips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClips: Self = this.set("clips", js.undefined)
    
    @scala.inline
    def setGeotag_enabled(value: `1` | `0`): Self = this.set("geotag_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeotag_enabled: Self = this.set("geotag_enabled", js.undefined)
    
    @scala.inline
    def setMedia_latitude(value: String): Self = this.set("media_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_latitude: Self = this.set("media_latitude", js.undefined)
    
    @scala.inline
    def setMedia_longitude(value: String): Self = this.set("media_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_longitude: Self = this.set("media_longitude", js.undefined)
    
    @scala.inline
    def setPoster_frame_index(value: Double): Self = this.set("poster_frame_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster_frame_index: Self = this.set("poster_frame_index", js.undefined)
    
    @scala.inline
    def setPosting_latitude(value: String): Self = this.set("posting_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosting_latitude: Self = this.set("posting_latitude", js.undefined)
    
    @scala.inline
    def setPosting_longitude(value: String): Self = this.set("posting_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosting_longitude: Self = this.set("posting_longitude", js.undefined)
  }
}
