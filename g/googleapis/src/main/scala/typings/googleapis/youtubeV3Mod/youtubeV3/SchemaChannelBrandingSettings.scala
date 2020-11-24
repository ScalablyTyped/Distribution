package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Branding properties of a YouTube channel.
  */
@js.native
trait SchemaChannelBrandingSettings extends js.Object {
  
  /**
    * Branding properties for the channel view.
    */
  var channel: js.UndefOr[SchemaChannelSettings] = js.native
  
  /**
    * Additional experimental branding properties.
    */
  var hints: js.UndefOr[js.Array[SchemaPropertyValue]] = js.native
  
  /**
    * Branding properties for branding images.
    */
  var image: js.UndefOr[SchemaImageSettings] = js.native
  
  /**
    * Branding properties for the watch page.
    */
  var watch: js.UndefOr[SchemaWatchSettings] = js.native
}
object SchemaChannelBrandingSettings {
  
  @scala.inline
  def apply(): SchemaChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelBrandingSettings]
  }
  
  @scala.inline
  implicit class SchemaChannelBrandingSettingsOps[Self <: SchemaChannelBrandingSettings] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: SchemaChannelSettings): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: SchemaPropertyValue*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[SchemaPropertyValue]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setImage(value: SchemaImageSettings): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setWatch(value: SchemaWatchSettings): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
