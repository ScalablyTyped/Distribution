package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlaylistItemSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the user that added the item to the playlist.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel title for the channel that the playlist item belongs to.
    */
  var channelTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The item's description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify thGe playlist that the playlist item is in.
    */
  var playlistId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order in which the item appears in the playlist. The value uses a zero-based index, so the first item has a position of 0, the second item has a position of 1, and so forth.
    */
  var position: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The date and time that the item was added to the playlist.
    */
  var publishedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id object contains information that can be used to uniquely identify the resource that is included in the playlist as the playlist item.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
  
  /**
    * A map of thumbnail images associated with the playlist item. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The item's title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel id for the channel this video belongs to.
    */
  var videoOwnerChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel title for the channel this video belongs to.
    */
  var videoOwnerChannelTitle: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlaylistItemSnippet {
  
  inline def apply(): SchemaPlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemSnippet]
  }
  
  extension [Self <: SchemaPlaylistItemSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleNull: Self = StObject.set(x, "channelTitle", null)
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlaylistId(value: String): Self = StObject.set(x, "playlistId", value.asInstanceOf[js.Any])
    
    inline def setPlaylistIdNull: Self = StObject.set(x, "playlistId", null)
    
    inline def setPlaylistIdUndefined: Self = StObject.set(x, "playlistId", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtNull: Self = StObject.set(x, "publishedAt", null)
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideoOwnerChannelId(value: String): Self = StObject.set(x, "videoOwnerChannelId", value.asInstanceOf[js.Any])
    
    inline def setVideoOwnerChannelIdNull: Self = StObject.set(x, "videoOwnerChannelId", null)
    
    inline def setVideoOwnerChannelIdUndefined: Self = StObject.set(x, "videoOwnerChannelId", js.undefined)
    
    inline def setVideoOwnerChannelTitle(value: String): Self = StObject.set(x, "videoOwnerChannelTitle", value.asInstanceOf[js.Any])
    
    inline def setVideoOwnerChannelTitleNull: Self = StObject.set(x, "videoOwnerChannelTitle", null)
    
    inline def setVideoOwnerChannelTitleUndefined: Self = StObject.set(x, "videoOwnerChannelTitle", js.undefined)
  }
}
