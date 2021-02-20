package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Branding properties for the watch. All deprecated.
  */
@js.native
trait SchemaWatchSettings extends StObject {
  
  /**
    * The text color for the video watch page&#39;s branded area.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * An ID that uniquely identifies a playlist that displays next to the video
    * player.
    */
  var featuredPlaylistId: js.UndefOr[String] = js.native
  
  /**
    * The background color for the video watch page&#39;s branded area.
    */
  var textColor: js.UndefOr[String] = js.native
}
object SchemaWatchSettings {
  
  @scala.inline
  def apply(): SchemaWatchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchSettings]
  }
  
  @scala.inline
  implicit class SchemaWatchSettingsMutableBuilder[Self <: SchemaWatchSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setFeaturedPlaylistId(value: String): Self = StObject.set(x, "featuredPlaylistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedPlaylistIdUndefined: Self = StObject.set(x, "featuredPlaylistId", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
