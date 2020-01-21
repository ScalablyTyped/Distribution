package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    channelId: String = null,
    channelTitle: String = null,
    defaultLanguage: String = null,
    description: String = null,
    localized: SchemaPlaylistLocalization = null,
    publishedAt: String = null,
    tags: js.Array[String] = null,
    thumbnails: SchemaThumbnailDetails = null,
    title: String = null
  ): SchemaPlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistSnippet]
  }
}

