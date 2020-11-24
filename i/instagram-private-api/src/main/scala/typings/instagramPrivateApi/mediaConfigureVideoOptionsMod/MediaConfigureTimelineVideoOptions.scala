package typings.instagramPrivateApi.mediaConfigureVideoOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureTimelineVideoOptions extends MediaConfigureVideoOptions {
  
  var caption: js.UndefOr[String] = js.native
  
  var date_time_original: js.UndefOr[String] = js.native
  
  var device_id: js.UndefOr[String] = js.native
  
  var filter_type: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[MediaLocation | String] = js.native
  
  var source_type: js.UndefOr[`4`] = js.native
  
  var timezone_offset: js.UndefOr[String] = js.native
  
  var usertags: js.UndefOr[PostingUsertags | String] = js.native
}
object MediaConfigureTimelineVideoOptions {
  
  @scala.inline
  def apply(height: Double, length: Double, upload_id: String, width: Double): MediaConfigureTimelineVideoOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineVideoOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureTimelineVideoOptionsOps[Self <: MediaConfigureTimelineVideoOptions] (val x: Self) extends AnyVal {
    
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setDate_time_original(value: String): Self = this.set("date_time_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_time_original: Self = this.set("date_time_original", js.undefined)
    
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
    
    @scala.inline
    def setFilter_type(value: String): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter_type: Self = this.set("filter_type", js.undefined)
    
    @scala.inline
    def setLocation(value: MediaLocation | String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSource_type(value: `4`): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    
    @scala.inline
    def setTimezone_offset(value: String): Self = this.set("timezone_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone_offset: Self = this.set("timezone_offset", js.undefined)
    
    @scala.inline
    def setUsertags(value: PostingUsertags | String): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
