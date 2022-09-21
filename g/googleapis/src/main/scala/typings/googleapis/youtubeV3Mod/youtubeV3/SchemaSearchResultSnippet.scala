package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchResultSnippet extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies.
    */
  var channelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the channel that published the resource that the search result identifies.
    */
  var channelTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the search result.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's "none" if there is not any upcoming/active live broadcasts.
    */
  var liveBroadcastContent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The creation date and time of the resource that the search result identifies.
    */
  var publishedAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The title of the search result.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchResultSnippet {
  
  inline def apply(): SchemaSearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResultSnippet]
  }
  
  extension [Self <: SchemaSearchResultSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdNull: Self = StObject.set(x, "channelId", null)
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleNull: Self = StObject.set(x, "channelTitle", null)
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastContentNull: Self = StObject.set(x, "liveBroadcastContent", null)
    
    inline def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtNull: Self = StObject.set(x, "publishedAt", null)
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
