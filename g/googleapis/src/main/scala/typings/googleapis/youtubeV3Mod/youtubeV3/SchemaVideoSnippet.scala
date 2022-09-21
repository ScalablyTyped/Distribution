package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoSnippet extends StObject {
  
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video was uploaded to.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default_audio_language property specifies the language spoken in the video's default audio track.
    */
  var defaultAudioLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language of the videos's default snippet.
    */
  var defaultLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The video's description. @mutable youtube.videos.insert youtube.videos.update
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if the video is an upcoming/active live broadcast. Or it's "none" if the video is not an upcoming/active live broadcast.
    */
  var liveBroadcastContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized snippet selected with the hl parameter. If no such localization exists, this field is populated with the default snippet. (Read-only)
    */
  var localized: js.UndefOr[SchemaVideoLocalization] = js.undefined
  
  /**
    * The date and time when the video was uploaded.
    */
  var publishedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of keyword tags associated with the video. Tags may contain spaces.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The video's title. @mutable youtube.videos.insert youtube.videos.update
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaVideoSnippet {
  
  inline def apply(): SchemaVideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSnippet]
  }
  
  extension [Self <: SchemaVideoSnippet](x: Self) {
    
    inline def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdNull: Self = StObject.set(x, "categoryId", null)
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleNull: Self = StObject.set(x, "channelTitle", null)
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDefaultAudioLanguage(value: String): Self = StObject.set(x, "defaultAudioLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultAudioLanguageNull: Self = StObject.set(x, "defaultAudioLanguage", null)
    
    inline def setDefaultAudioLanguageUndefined: Self = StObject.set(x, "defaultAudioLanguage", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastContentNull: Self = StObject.set(x, "liveBroadcastContent", null)
    
    inline def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    inline def setLocalized(value: SchemaVideoLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtNull: Self = StObject.set(x, "publishedAt", null)
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
