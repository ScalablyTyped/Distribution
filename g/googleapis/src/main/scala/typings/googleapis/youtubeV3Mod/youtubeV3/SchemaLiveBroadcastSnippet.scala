package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveBroadcastSnippet extends StObject {
  
  /**
    * The date and time that the broadcast actually ended. This information is
    * only available once the broadcast&#39;s state is complete. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the broadcast actually started. This information
    * is only available once the broadcast&#39;s state is live. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that is
    * publishing the broadcast.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The broadcast&#39;s description. As with the title, you can set this
    * field by modifying the broadcast resource or by setting the description
    * field of the corresponding video resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  var isDefaultBroadcast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id of the live chat for this broadcast.
    */
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the broadcast was added to YouTube&#39;s live
    * broadcast schedule. The value is specified in ISO 8601
    * (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the broadcast is scheduled to end. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the broadcast is scheduled to start. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var scheduledStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the broadcast. For each nested
    * object in this object, the key is the name of the thumbnail image, and
    * the value is an object that contains other information about the
    * thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The broadcast&#39;s title. Note that the broadcast represents exactly one
    * YouTube video. You can set this field by modifying the broadcast resource
    * or by setting the title field of the corresponding video resource.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaLiveBroadcastSnippet {
  
  @scala.inline
  def apply(): SchemaLiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveBroadcastSnippet]
  }
  
  @scala.inline
  implicit class SchemaLiveBroadcastSnippetMutableBuilder[Self <: SchemaLiveBroadcastSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualEndTime(value: String): Self = StObject.set(x, "actualEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualEndTimeUndefined: Self = StObject.set(x, "actualEndTime", js.undefined)
    
    @scala.inline
    def setActualStartTime(value: String): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsDefaultBroadcast(value: Boolean): Self = StObject.set(x, "isDefaultBroadcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultBroadcastUndefined: Self = StObject.set(x, "isDefaultBroadcast", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setScheduledEndTime(value: String): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
    
    @scala.inline
    def setScheduledStartTime(value: String): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
    
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
