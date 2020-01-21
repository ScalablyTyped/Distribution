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
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    description: String = null,
    liveBroadcastContent: String = null,
    publishedAt: String = null,
    thumbnails: SchemaThumbnailDetails = null,
    title: String = null
  ): SchemaSearchResultSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (liveBroadcastContent != null) __obj.updateDynamic("liveBroadcastContent")(liveBroadcastContent.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchResultSnippet]
  }
}

