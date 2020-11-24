package typings.instagramPrivateApi.mediaConfigureOptionsMod

import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureTimelineOptions extends MediaConfigureOptions {
  
  var camera_make: js.UndefOr[String] = js.native
  
  var camera_model: js.UndefOr[String] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var creation_logger_session_id: js.UndefOr[String] = js.native
  
  var date_time_digitalized: js.UndefOr[String] = js.native
  
  var date_time_original: js.UndefOr[String] = js.native
  
  var device_id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[MediaLocation | String] = js.native
  
  var timezone_offset: js.UndefOr[String] = js.native
  
  var usertags: js.UndefOr[PostingUsertags | String] = js.native
}
object MediaConfigureTimelineOptions {
  
  @scala.inline
  def apply(upload_id: String): MediaConfigureTimelineOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureTimelineOptionsOps[Self <: MediaConfigureTimelineOptions] (val x: Self) extends AnyVal {
    
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
    def setCamera_make(value: String): Self = this.set("camera_make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera_make: Self = this.set("camera_make", js.undefined)
    
    @scala.inline
    def setCamera_model(value: String): Self = this.set("camera_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera_model: Self = this.set("camera_model", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCreation_logger_session_id(value: String): Self = this.set("creation_logger_session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation_logger_session_id: Self = this.set("creation_logger_session_id", js.undefined)
    
    @scala.inline
    def setDate_time_digitalized(value: String): Self = this.set("date_time_digitalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_time_digitalized: Self = this.set("date_time_digitalized", js.undefined)
    
    @scala.inline
    def setDate_time_original(value: String): Self = this.set("date_time_original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_time_original: Self = this.set("date_time_original", js.undefined)
    
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
    
    @scala.inline
    def setLocation(value: MediaLocation | String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
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
