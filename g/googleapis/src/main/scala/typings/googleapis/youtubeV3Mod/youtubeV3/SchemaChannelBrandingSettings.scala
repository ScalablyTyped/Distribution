package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Branding properties of a YouTube channel.
  */
trait SchemaChannelBrandingSettings extends StObject {
  
  /**
    * Branding properties for the channel view.
    */
  var channel: js.UndefOr[SchemaChannelSettings] = js.undefined
  
  /**
    * Additional experimental branding properties.
    */
  var hints: js.UndefOr[js.Array[SchemaPropertyValue]] = js.undefined
  
  /**
    * Branding properties for branding images.
    */
  var image: js.UndefOr[SchemaImageSettings] = js.undefined
  
  /**
    * Branding properties for the watch page.
    */
  var watch: js.UndefOr[SchemaWatchSettings] = js.undefined
}
object SchemaChannelBrandingSettings {
  
  @scala.inline
  def apply(): SchemaChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelBrandingSettings]
  }
  
  @scala.inline
  implicit class SchemaChannelBrandingSettingsMutableBuilder[Self <: SchemaChannelBrandingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: SchemaChannelSettings): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setHints(value: js.Array[SchemaPropertyValue]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: SchemaPropertyValue*): Self = StObject.set(x, "hints", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: SchemaImageSettings): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setWatch(value: SchemaWatchSettings): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
