package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropcenter
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureSidecarItem extends js.Object {
  
  var caption: js.UndefOr[Null] = js.native
  
  var device: js.UndefOr[Androidversion | String] = js.native
  
  var edits: js.UndefOr[Cropcenter | String] = js.native
  
  var extra: js.UndefOr[Sourceheight | String] = js.native
  
  var height: Double = js.native
  
  var source_type: js.UndefOr[String] = js.native
  
  var timezone_offset: js.UndefOr[String] = js.native
  
  var upload_id: String = js.native
  
  var usertags: js.UndefOr[PostingUsertags | String] = js.native
  
  var width: Double = js.native
}
object MediaConfigureSidecarItem {
  
  @scala.inline
  def apply(height: Double, upload_id: String, width: Double): MediaConfigureSidecarItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarItem]
  }
  
  @scala.inline
  implicit class MediaConfigureSidecarItemOps[Self <: MediaConfigureSidecarItem] (val x: Self) extends AnyVal {
    
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
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Androidversion | String): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setEdits(value: Cropcenter | String): Self = this.set("edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdits: Self = this.set("edits", js.undefined)
    
    @scala.inline
    def setExtra(value: Sourceheight | String): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setSource_type(value: String): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
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
