package typings.instagramPrivateApi.mediaConfigureOptionsMod

import typings.instagramPrivateApi.anon.Croporiginalsize
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureOptions extends js.Object {
  
  var disable_comments: js.UndefOr[Boolean] = js.native
  
  var edits: js.UndefOr[Croporiginalsize] = js.native
  
  var extra: js.UndefOr[Sourceheight] = js.native
  
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var media_folder: js.UndefOr[String] = js.native
  
  var media_latitude: js.UndefOr[String] = js.native
  
  var media_longitude: js.UndefOr[String] = js.native
  
  var posting_latitude: js.UndefOr[String] = js.native
  
  var posting_longitude: js.UndefOr[String] = js.native
  
  var scene_capture_type: js.UndefOr[String] = js.native
  
  var software: js.UndefOr[String] = js.native
  
  var source_type: js.UndefOr[String] = js.native
  
  var upload_id: String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MediaConfigureOptions {
  
  @scala.inline
  def apply(upload_id: String): MediaConfigureOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureOptionsOps[Self <: MediaConfigureOptions] (val x: Self) extends AnyVal {
    
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
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_comments(value: Boolean): Self = this.set("disable_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_comments: Self = this.set("disable_comments", js.undefined)
    
    @scala.inline
    def setEdits(value: Croporiginalsize): Self = this.set("edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
    
    @scala.inline
    def setExtra(value: Sourceheight): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setGeotag_enabled(value: `1` | `0`): Self = this.set("geotag_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeotag_enabled: Self = this.set("geotag_enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMedia_folder(value: String): Self = this.set("media_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_folder: Self = this.set("media_folder", js.undefined)
    
    @scala.inline
    def setMedia_latitude(value: String): Self = this.set("media_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_latitude: Self = this.set("media_latitude", js.undefined)
    
    @scala.inline
    def setMedia_longitude(value: String): Self = this.set("media_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_longitude: Self = this.set("media_longitude", js.undefined)
    
    @scala.inline
    def setPosting_latitude(value: String): Self = this.set("posting_latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosting_latitude: Self = this.set("posting_latitude", js.undefined)
    
    @scala.inline
    def setPosting_longitude(value: String): Self = this.set("posting_longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosting_longitude: Self = this.set("posting_longitude", js.undefined)
    
    @scala.inline
    def setScene_capture_type(value: String): Self = this.set("scene_capture_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene_capture_type: Self = this.set("scene_capture_type", js.undefined)
    
    @scala.inline
    def setSoftware(value: String): Self = this.set("software", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftware: Self = this.set("software", js.undefined)
    
    @scala.inline
    def setSource_type(value: String): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
