package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a playlist, including title, description and
  * thumbnails.
  */
@js.native
trait SchemaPlaylistItemSnippet extends js.Object {
  
  /**
    * The ID that YouTube uses to uniquely identify the user that added the
    * item to the playlist.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * Channel title for the channel that the playlist item belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  
  /**
    * The item&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the playlist that the
    * playlist item is in.
    */
  var playlistId: js.UndefOr[String] = js.native
  
  /**
    * The order in which the item appears in the playlist. The value uses a
    * zero-based index, so the first item has a position of 0, the second item
    * has a position of 1, and so forth.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * The date and time that the item was added to the playlist. The value is
    * specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * The id object contains information that can be used to uniquely identify
    * the resource that is included in the playlist as the playlist item.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
  
  /**
    * A map of thumbnail images associated with the playlist item. For each
    * object in the map, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  
  /**
    * The item&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPlaylistItemSnippet {
  
  @scala.inline
  def apply(): SchemaPlaylistItemSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistItemSnippet]
  }
  
  @scala.inline
  implicit class SchemaPlaylistItemSnippetOps[Self <: SchemaPlaylistItemSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = this.set("channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelTitle: Self = this.set("channelTitle", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPlaylistId(value: String): Self = this.set("playlistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylistId: Self = this.set("playlistId", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setResourceId(value: SchemaResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setThumbnails(value: SchemaThumbnailDetails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
