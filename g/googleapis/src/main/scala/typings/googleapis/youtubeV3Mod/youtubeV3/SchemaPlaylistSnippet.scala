package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic details about a playlist, including title, description and
  * thumbnails.
  */
@js.native
trait SchemaPlaylistSnippet extends js.Object {
  
  /**
    * The ID that YouTube uses to uniquely identify the channel that published
    * the playlist.
    */
  var channelId: js.UndefOr[String] = js.native
  
  /**
    * The channel title of the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  
  /**
    * The language of the playlist&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /**
    * The playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Localized title and description, read-only.
    */
  var localized: js.UndefOr[SchemaPlaylistLocalization] = js.native
  
  /**
    * The date and time that the playlist was created. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  
  /**
    * Keyword tags associated with the playlist.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A map of thumbnail images associated with the playlist. For each object
    * in the map, the key is the name of the thumbnail image, and the value is
    * an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  
  /**
    * The playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPlaylistSnippet {
  
  @scala.inline
  def apply(): SchemaPlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlaylistSnippet]
  }
  
  @scala.inline
  implicit class SchemaPlaylistSnippetOps[Self <: SchemaPlaylistSnippet] (val x: Self) extends AnyVal {
    
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
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocalized(value: SchemaPlaylistLocalization): Self = this.set("localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
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
