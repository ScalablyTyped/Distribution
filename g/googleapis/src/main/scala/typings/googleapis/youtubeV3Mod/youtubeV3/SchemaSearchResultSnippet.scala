package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a search result, including title, description and
  * thumbnails of the item referenced by the search result.
  */
trait SchemaSearchResultSnippet extends StObject {
  
  /**
    * The value that YouTube uses to uniquely identify the channel that
    * published the resource that the search result identifies.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the channel that published the resource that the search
    * result identifies.
    */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the search result.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * It indicates if the resource (video or channel) has upcoming/active live
    * broadcast content. Or it&#39;s &quot;none&quot; if there is not any
    * upcoming/active live broadcasts.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date and time of the resource that the search result
    * identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ)
    * format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the search result. For each
    * object in the map, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The title of the search result.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaSearchResultSnippet {
  
  inline def apply(): SchemaSearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResultSnippet]
  }
  
  extension [Self <: SchemaSearchResultSnippet](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    inline def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    inline def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLiveBroadcastContent(value: String): Self = StObject.set(x, "liveBroadcastContent", value.asInstanceOf[js.Any])
    
    inline def setLiveBroadcastContentUndefined: Self = StObject.set(x, "liveBroadcastContent", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
