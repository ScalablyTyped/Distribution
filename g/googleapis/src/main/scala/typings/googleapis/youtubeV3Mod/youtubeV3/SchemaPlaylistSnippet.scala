package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a playlist, including title, description and
  * thumbnails.
  */
trait SchemaPlaylistSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published
    * the playlist.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The language of the playlist&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Localized title and description, read-only.
    */
  var localized: js.UndefOr[SchemaPlaylistLocalization] = js.undefined
  
  /**
    * The date and time that the playlist was created. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A map of thumbnail images associated with the playlist. For each object
    * in the map, the key is the name of the thumbnail image, and the value is
    * an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaPlaylistSnippet {
  
  inline def apply(): SchemaPlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistSnippet]
  }
  
  extension [Self <: SchemaPlaylistSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocalized(value: SchemaPlaylistLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    inline def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
