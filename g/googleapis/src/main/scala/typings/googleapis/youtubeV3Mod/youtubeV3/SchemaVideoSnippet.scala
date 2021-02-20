package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a video, including title, description, uploader,
  * thumbnails and category.
  */
@js.native
trait SchemaVideoSnippet extends StObject {
  
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video
    * was uploaded to.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  
  /**
    * The default_audio_language property specifies the language spoken in the
    * video&#39;s default audio track.
    */
  var defaultAudioLanguage: js.UndefOr[String] = js.native
  
  /**
    * The language of the videos&#39;s default snippet.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /**
    * The video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the video is an upcoming/active live broadcast. Or it&#39;s
    * &quot;none&quot; if the video is not an upcoming/active live broadcast.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  
  /**
    * Localized snippet selected with the hl parameter. If no such localization
    * exists, this field is populated with the default snippet. (Read-only)
    */
  var localized: js.UndefOr[SchemaVideoLocalization] = js.native
  
  /**
    * The date and time that the video was uploaded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * A list of keyword tags associated with the video. Tags may contain
    * spaces.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  
  /**
    * The video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaVideoSnippet {
  
  @scala.inline
  def apply(): SchemaVideoSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSnippet]
  }
  
  @scala.inline
  implicit class SchemaVideoSnippetMutableBuilder[Self <: SchemaVideoSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryId(value: String): Self = StObject.set(x, "categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryIdUndefined: Self = StObject.set(x, "categoryId", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    @scala.inline
    def setDefaultAudioLanguage(value: String): Self = StObject.set(x, "defaultAudioLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAudioLanguageUndefined: Self = StObject.set(x, "defaultAudioLanguage", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    @scala.inline
    def setLocalized(value: SchemaVideoLocalization): Self = StObject.set(x, "localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedUndefined: Self = StObject.set(x, "localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
