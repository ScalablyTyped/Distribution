package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a subscription, including title, description and
  * thumbnails of the subscribed item.
  */
trait SchemaSubscriptionSnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the subscriber&#39;s
    * channel.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Channel title for the channel that the subscription belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The subscription&#39;s details.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the subscription was created. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * The id object contains information about the channel that the user
    * subscribed to.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.undefined
  
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The subscription&#39;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaSubscriptionSnippet {
  
  @scala.inline
  def apply(): SchemaSubscriptionSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionSnippet]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionSnippetMutableBuilder[Self <: SchemaSubscriptionSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = StObject.set(x, "channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTitleUndefined: Self = StObject.set(x, "channelTitle", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
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
