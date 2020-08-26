package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a search result, including title, description and
  * thumbnails of the item referenced by the search result.
  */
@js.native
trait SchemaSearchResultSnippet extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the channel that
    * published the resource that the search result identifies.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The title of the channel that published the resource that the search
    * result identifies.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * A description of the search result.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * It indicates if the resource (video or channel) has upcoming/active live
    * broadcast content. Or it&#39;s &quot;none&quot; if there is not any
    * upcoming/active live broadcasts.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  /**
    * The creation date and time of the resource that the search result
    * identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ)
    * format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the search result. For each
    * object in the map, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The title of the search result.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSearchResultSnippet {
  @scala.inline
  def apply(): SchemaSearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResultSnippet]
  }
  @scala.inline
  implicit class SchemaSearchResultSnippetOps[Self <: SchemaSearchResultSnippet] (val x: Self) extends AnyVal {
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
    def setLiveBroadcastContent(value: String): Self = this.set("liveBroadcastContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveBroadcastContent: Self = this.set("liveBroadcastContent", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
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

