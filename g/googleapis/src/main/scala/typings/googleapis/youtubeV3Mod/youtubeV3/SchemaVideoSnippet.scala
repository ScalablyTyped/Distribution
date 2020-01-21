package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video, including title, description, uploader,
  * thumbnails and category.
  */
@js.native
trait SchemaVideoSnippet extends js.Object {
  /**
    * The YouTube video category associated with the video.
    */
  var categoryId: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel that the video
    * was uploaded to.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * Channel title for the channel that the video belongs to.
    */
  var channelTitle: js.UndefOr[String] = js.native
  /**
    * The default_audio_language property specifies the language spoken in the
    * video&#39;s default audio track.
    */
  var defaultAudioLanguage: js.UndefOr[String] = js.native
  /**
    * The language of the videos&#39;s default snippet.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * The video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates if the video is an upcoming/active live broadcast. Or it&#39;s
    * &quot;none&quot; if the video is not an upcoming/active live broadcast.
    */
  var liveBroadcastContent: js.UndefOr[String] = js.native
  /**
    * Localized snippet selected with the hl parameter. If no such localization
    * exists, this field is populated with the default snippet. (Read-only)
    */
  var localized: js.UndefOr[SchemaVideoLocalization] = js.native
  /**
    * The date and time that the video was uploaded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A list of keyword tags associated with the video. Tags may contain
    * spaces.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of thumbnail images associated with the video. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoSnippet {
  @scala.inline
  def apply(
    categoryId: String = null,
    channelId: String = null,
    channelTitle: String = null,
    defaultAudioLanguage: String = null,
    defaultLanguage: String = null,
    description: String = null,
    liveBroadcastContent: String = null,
    localized: SchemaVideoLocalization = null,
    publishedAt: String = null,
    tags: js.Array[String] = null,
    thumbnails: SchemaThumbnailDetails = null,
    title: String = null
  ): SchemaVideoSnippet = {
    val __obj = js.Dynamic.literal()
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelTitle != null) __obj.updateDynamic("channelTitle")(channelTitle.asInstanceOf[js.Any])
    if (defaultAudioLanguage != null) __obj.updateDynamic("defaultAudioLanguage")(defaultAudioLanguage.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (liveBroadcastContent != null) __obj.updateDynamic("liveBroadcastContent")(liveBroadcastContent.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoSnippet]
  }
}

