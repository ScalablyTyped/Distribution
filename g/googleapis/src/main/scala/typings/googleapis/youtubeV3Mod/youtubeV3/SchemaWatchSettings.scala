package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWatchSettings extends StObject {
  
  /**
    * The text color for the video watch page's branded area.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An ID that uniquely identifies a playlist that displays next to the video player.
    */
  var featuredPlaylistId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The background color for the video watch page's branded area.
    */
  var textColor: js.UndefOr[String | Null] = js.undefined
}
object SchemaWatchSettings {
  
  inline def apply(): SchemaWatchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchSettings]
  }
  
  extension [Self <: SchemaWatchSettings](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setFeaturedPlaylistId(value: String): Self = StObject.set(x, "featuredPlaylistId", value.asInstanceOf[js.Any])
    
    inline def setFeaturedPlaylistIdNull: Self = StObject.set(x, "featuredPlaylistId", null)
    
    inline def setFeaturedPlaylistIdUndefined: Self = StObject.set(x, "featuredPlaylistId", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorNull: Self = StObject.set(x, "textColor", null)
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
