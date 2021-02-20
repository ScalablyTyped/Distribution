package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a channel section, including title, style and position.
  */
@js.native
trait SchemaChannelSectionSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published
    * the channel section.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The language of the channel section&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /**
    * Localized title, read-only.
    */
  var localized: js.UndefOr[SchemaChannelSectionLocalization] = js.native
  
  /**
    * The position of the channel section in the channel.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * The style of the channel section.
    */
  var style: js.UndefOr[String] = js.native
  
  /**
    * The channel section&#39;s title for multiple_playlists and
    * multiple_channels.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of the channel section.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaChannelSectionSnippet {
  
  @scala.inline
  def apply(): SchemaChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionSnippet]
  }
  
  @scala.inline
  implicit class SchemaChannelSectionSnippetMutableBuilder[Self <: SchemaChannelSectionSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setLocalized(value: SchemaChannelSectionLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
