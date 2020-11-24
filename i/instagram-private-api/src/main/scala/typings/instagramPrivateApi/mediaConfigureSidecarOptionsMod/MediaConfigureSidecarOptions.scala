package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConfigureSidecarOptions extends js.Object {
  
  var _csrftoken: js.UndefOr[String] = js.native
  
  var _uid: js.UndefOr[String] = js.native
  
  var _uuid: js.UndefOr[String] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var children_metadata: js.Array[MediaConfigureSidecarItem] = js.native
  
  var client_sidecar_id: js.UndefOr[String] = js.native
  
  var device: js.UndefOr[Androidversion] = js.native
  
  var device_id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[MediaLocation | String] = js.native
  
  var source_type: js.UndefOr[String] = js.native
  
  var timezone_offset: js.UndefOr[String] = js.native
  
  var upload_id: js.UndefOr[String] = js.native
}
object MediaConfigureSidecarOptions {
  
  @scala.inline
  def apply(children_metadata: js.Array[MediaConfigureSidecarItem]): MediaConfigureSidecarOptions = {
    val __obj = js.Dynamic.literal(children_metadata = children_metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarOptions]
  }
  
  @scala.inline
  implicit class MediaConfigureSidecarOptionsOps[Self <: MediaConfigureSidecarOptions] (val x: Self) extends AnyVal {
    
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
    def setChildren_metadataVarargs(value: MediaConfigureSidecarItem*): Self = this.set("children_metadata", js.Array(value :_*))
    
    @scala.inline
    def setChildren_metadata(value: js.Array[MediaConfigureSidecarItem]): Self = this.set("children_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_csrftoken(value: String): Self = this.set("_csrftoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_csrftoken: Self = this.set("_csrftoken", js.undefined)
    
    @scala.inline
    def set_uid(value: String): Self = this.set("_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
    
    @scala.inline
    def set_uuid(value: String): Self = this.set("_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_uuid: Self = this.set("_uuid", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setClient_sidecar_id(value: String): Self = this.set("client_sidecar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_sidecar_id: Self = this.set("client_sidecar_id", js.undefined)
    
    @scala.inline
    def setDevice(value: Androidversion): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
    
    @scala.inline
    def setLocation(value: MediaLocation | String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setSource_type(value: String): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_type: Self = this.set("source_type", js.undefined)
    
    @scala.inline
    def setTimezone_offset(value: String): Self = this.set("timezone_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone_offset: Self = this.set("timezone_offset", js.undefined)
    
    @scala.inline
    def setUpload_id(value: String): Self = this.set("upload_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_id: Self = this.set("upload_id", js.undefined)
  }
}
