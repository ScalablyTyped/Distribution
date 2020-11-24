package typings.instagramPrivateApi.mediaConfigureToIgtvOptionsMod

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropbottom
import typings.instagramPrivateApi.anon.LengthSourcetype
import typings.instagramPrivateApi.anon.Numreupload
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureToIgtvOptions extends js.Object {
  
  var audio_muted: js.UndefOr[Boolean] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var clips: js.UndefOr[js.Array[LengthSourcetype]] = js.native
  
  var date_time_original: js.UndefOr[String] = js.native
  
  var device: js.UndefOr[Androidversion] = js.native
  
  var extra: Sourceheight = js.native
  
  var feed_preview_crop: js.UndefOr[Cropbottom | String] = js.native
  
  var filter_type: js.UndefOr[String] = js.native
  
  var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.native
  
  var length: Double = js.native
  
  var media_folder: js.UndefOr[String] = js.native
  
  var poster_frame_index: js.UndefOr[Double] = js.native
  
  var retryContext: js.UndefOr[Numreupload] = js.native
  
  var source_type: js.UndefOr[`3` | `4`] = js.native
  
  var timezone_offset: js.UndefOr[String] = js.native
  
  var title: String = js.native
  
  var upload_id: String = js.native
}
object MediaConfigureToIgtvOptions {
  
  @scala.inline
  def apply(extra: Sourceheight, length: Double, title: String, upload_id: String): MediaConfigureToIgtvOptions = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureToIgtvOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureToIgtvOptionsOps[Self <: MediaConfigureToIgtvOptions] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: Sourceheight): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_muted(value: Boolean): Self = this.set("audio_muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio_muted: Self = this.set("audio_muted", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setClipsVarargs(value: LengthSourcetype*): Self = this.set("clips", js.Array(value :_*))
    
    @scala.inline
    def setClips(value: js.Array[LengthSourcetype]): Self = this.set("clips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClips: Self = this.set("clips", js.undefined)
    
    @scala.inline
    def setDate_time_original(value: String): Self = this.set("date_time_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_time_original: Self = this.set("date_time_original", js.undefined)
    
    @scala.inline
    def setDevice(value: Androidversion): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setFeed_preview_crop(value: Cropbottom | String): Self = this.set("feed_preview_crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeed_preview_crop: Self = this.set("feed_preview_crop", js.undefined)
    
    @scala.inline
    def setFilter_type(value: String): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter_type: Self = this.set("filter_type", js.undefined)
    
    @scala.inline
    def setIgtv_share_preview_to_feed(value: `1` | `0`): Self = this.set("igtv_share_preview_to_feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgtv_share_preview_to_feed: Self = this.set("igtv_share_preview_to_feed", js.undefined)
    
    @scala.inline
    def setMedia_folder(value: String): Self = this.set("media_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_folder: Self = this.set("media_folder", js.undefined)
    
    @scala.inline
    def setPoster_frame_index(value: Double): Self = this.set("poster_frame_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster_frame_index: Self = this.set("poster_frame_index", js.undefined)
    
    @scala.inline
    def setRetryContext(value: Numreupload): Self = this.set("retryContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryContext: Self = this.set("retryContext", js.undefined)
    
    @scala.inline
    def setSource_type(value: `3` | `4`): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    
    @scala.inline
    def setTimezone_offset(value: String): Self = this.set("timezone_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone_offset: Self = this.set("timezone_offset", js.undefined)
  }
}
