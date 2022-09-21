package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSectionSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published the channel section.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language of the channel section's default title and description.
    */
  var defaultLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized title, read-only.
    */
  var localized: js.UndefOr[SchemaChannelSectionLocalization] = js.undefined
  
  /**
    * The position of the channel section in the channel.
    */
  var position: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The style of the channel section.
    */
  var style: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel section's title for multiple_playlists and multiple_channels.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the channel section.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelSectionSnippet {
  
  inline def apply(): SchemaChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionSnippet]
  }
  
  extension [Self <: SchemaChannelSectionSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setLocalized(value: SchemaChannelSectionLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
