package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about an activity, including title, description, thumbnails,
  * activity type and group.
  */
trait SchemaActivitySnippet extends StObject {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel associated with
    * the activity.
    */
  var channelId: js.UndefOr[String] = js.undefined
  
  /**
    * Channel title for the channel responsible for this activity
    */
  var channelTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the resource primarily associated with the activity.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The group ID associated with the activity. A group ID identifies user
    * events that are associated with the same user and resource. For example,
    * if a user rates a video and marks the same video as a favorite, the
    * entries for those events would have the same group ID in the user&#39;s
    * activity feed. In your user interface, you can avoid repetition by
    * grouping events with the same groupId value.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the video was uploaded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /**
    * A map of thumbnail images associated with the resource that is primarily
    * associated with the activity. For each object in the map, the key is the
    * name of the thumbnail image, and the value is an object that contains
    * other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.undefined
  
  /**
    * The title of the resource primarily associated with the activity.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of activity that the resource describes.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaActivitySnippet {
  
  @scala.inline
  def apply(): SchemaActivitySnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivitySnippet]
  }
  
  @scala.inline
  implicit class SchemaActivitySnippetMutableBuilder[Self <: SchemaActivitySnippet] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
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
